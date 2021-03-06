package ru.tinkoff.qa.neptune.selenium.hamcrest.matchers.elements;

import ru.tinkoff.qa.neptune.selenium.api.widget.HasValue;
import ru.tinkoff.qa.neptune.selenium.hamcrest.matchers.TypeSafeDiagnosingMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.openqa.selenium.SearchContext;

import static com.google.common.base.Preconditions.checkArgument;
import static java.lang.String.format;
import static java.util.Objects.nonNull;
import static org.hamcrest.Matchers.equalTo;

public final class HasValueMatcher<Q, T extends SearchContext & HasValue<Q>> extends TypeSafeDiagnosingMatcher<T> {

    private final Matcher<? super Q> criteria;

    private HasValueMatcher(Matcher<? super Q> criteria) {
        checkArgument(nonNull(criteria), "Matcher to check value should be defined.");
        this.criteria = criteria;
    }

    /**
     * Creates an instance of {@link HasValueMatcher} that checks value of the element.
     *
     * @param value is expected to be equal to value of the element.
     * @param <Q> type of a value
     * @param <T> type of an element
     * @return instance of {@link HasValueMatcher}
     */
    public static <Q, T extends SearchContext & HasValue<Q>> HasValueMatcher<Q, T> hasValue(Q value) {
        return new HasValueMatcher<>(equalTo(value));
    }

    /**
     * Creates an instance of {@link HasValueMatcher} that checks value of the element.
     *
     * @param value matcher that is supposed to be used for the value verification
     * @param <Q> type of a value
     * @param <T> type of an element
     * @return instance of {@link HasValueMatcher}
     */
    public static <Q, T extends SearchContext & HasValue<Q>> HasValueMatcher<Q, T> hasValue(Matcher<? super Q> value) {
        return new HasValueMatcher<>(value);
    }

    @Override
    protected boolean matchesSafely(T item, Description mismatchDescription) {
        Q value = item.getValue();
        var result = criteria.matches(value);
        if (!result) {
            criteria.describeMismatch(value, mismatchDescription);
        }
        return result;
    }

    @Override
    public String toString() {
        return format("has value %s", criteria.toString());
    }
}
