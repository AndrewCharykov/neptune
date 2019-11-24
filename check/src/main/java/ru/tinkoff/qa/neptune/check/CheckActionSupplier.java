package ru.tinkoff.qa.neptune.check;

import ru.tinkoff.qa.neptune.core.api.steps.SequentialActionSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkArgument;
import static java.lang.String.format;
import static java.lang.System.lineSeparator;
import static java.util.Arrays.stream;
import static java.util.Objects.nonNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.isBlank;

public final class CheckActionSupplier<T> extends SequentialActionSupplier<T, T, CheckActionSupplier<T>> {

    private static final String LINE_SEPARATOR = lineSeparator();

    private final List<AssertionError> caughtMismatches = new ArrayList<>();
    private final List<Consumer<T>> checkList = new ArrayList<>();

    private CheckActionSupplier(String description) {
        super(format("Verify %s", description));
    }

    /**
     * Creates an instance of {@link CheckActionSupplier} and defines value to be verified and verification criteria.
     * And then the checking is performed.
     *
     * @param description of a value to be verified.
     * @param t           value to be verified.
     * @param matchActions is an arrya of {@link MatchAction}
     * @param <T>         is a type of a value to be verified.
     */
    @SafeVarargs
    public static <T> void check(String description, T t, MatchAction<T, ?>...matchActions) {
        checkArgument(!isBlank(description), "Description of a value to be inspected should not be null");
        new CheckActionSupplier<T>(description)
                .matches(matchActions)
                .performOn(t)
                .get().accept(t);
    }

    /**
     * Creates an instance of {@link CheckActionSupplier} and defines value to be verified and verification criteria.
     * And then the checking is performed.
     *
     * @param t   value to be verified.
     * @param matchActions is an arrya of {@link MatchAction}
     * @param <T> is a type to be verified.
     */
    @SafeVarargs
    public static <T> void check(T t, MatchAction<T, ?>...matchActions) {
        new CheckActionSupplier<T>(format("inspected value %s", t))
                .matches(matchActions)
                .performOn(t)
                .get().accept(t);
    }

    @SafeVarargs
    private CheckActionSupplier<T> matches(MatchAction<T, ?>... matchActions) {
        checkArgument(nonNull(matchActions), "Criteria to check value should not be a null value");
        checkArgument(matchActions.length > 0, "At least one criteria to check value should be defined");
        checkList.addAll(stream(matchActions).map(MatchAction::get).collect(toList()));
        return this;
    }

    @Override
    protected void performActionOn(T value) {
        checkList.forEach(tConsumer -> {
            try {
                tConsumer.accept(value);
            } catch (AssertionError e) {
                caughtMismatches.add(e);
            }
        });

        AssertionError assertionError = null;
        if (caughtMismatches.size() > 0) {
            var sb = "List of mismatches:" + LINE_SEPARATOR + caughtMismatches.stream().map(Throwable::getMessage)
                    .collect(joining(";" + LINE_SEPARATOR + LINE_SEPARATOR));
            assertionError = new AssertionError(sb);
        }

        ofNullable(assertionError).ifPresent(assertionError1 -> {
            throw assertionError1;
        });
    }
}
