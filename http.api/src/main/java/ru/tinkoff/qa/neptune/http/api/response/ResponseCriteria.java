package ru.tinkoff.qa.neptune.http.api.response;

import com.google.common.base.Preconditions;
import ru.tinkoff.qa.neptune.core.api.steps.Criteria;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.function.Predicate;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.net.URI.create;
import static java.util.Objects.nonNull;
import static java.util.regex.Pattern.compile;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.glassfish.jersey.internal.guava.Preconditions.checkArgument;
import static org.glassfish.jersey.internal.guava.Preconditions.checkNotNull;
import static ru.tinkoff.qa.neptune.core.api.steps.Criteria.condition;

public final class ResponseCriteria {

    private ResponseCriteria() {
        super();
    }

    /**
     * Builds criteria to match status code of a response.
     *
     * @param code is the expected status code.
     * @param <T>  is a type of response body
     * @return criteria.
     */
    public static <T> Criteria<HttpResponse<T>> statusCode(int code) {
        return condition(format("status code is %s", code), r -> r.statusCode() == code);
    }

    /**
     * Builds criteria to match status code of a response fluently.
     *
     * @param description description of the expectation
     * @param predicate   is the expectation that response body should meet
     * @param <T>         is a type of response body
     * @return criteria
     */
    public static <T> Criteria<HttpResponse<T>> bodyMatches(String description, Predicate<? super T> predicate) {
        checkArgument(nonNull(predicate), "Predicate that checks response body should be defined");
        return condition(description, r -> predicate.test(r.body()));
    }

    /**
     * Builds criteria to match uri of a response.
     *
     * @param stringURI expected uri of a response defined as string.
     * @return criteria.
     */
    public static <T> Criteria<HttpResponse<T>> responseURI(String stringURI) {
        return responseURI(create(stringURI));
    }

    /**
     * Builds criteria to match uri of a response.
     *
     * @param url expected uri of a response defined as {@link URL}.
     * @param <T> is a type of response body
     * @return criteria.
     */
    public static <T> Criteria<HttpResponse<T>> responseURI(URL url) {
        checkNotNull(url, "Expected URL should not be defined as a null value");
        try {
            return responseURI(url.toURI());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Builds criteria to match uri of a response.
     *
     * @param uri expected uri of a response.
     * @param <T> is a type of response body
     * @return criteria.
     */
    public static <T> Criteria<HttpResponse<T>> responseURI(URI uri) {
        checkNotNull(uri, "Expected URI should not be defined as a null value");
        return condition(format("response URI is %s", uri), r -> uri.equals(r.uri()));
    }

    /**
     * Builds criteria to match uri of a response.
     *
     * @param expression is a substring that uri of a response is supposed to have.
     *                   It is possible to pass reg exp pattern that uri should fit.
     * @param <T>        is a type of response body
     * @return criteria.
     */
    public static <T> Criteria<HttpResponse<T>> uriMatches(String expression) {
        Preconditions.checkArgument(isNotBlank(expression), "URI expression should be defined");

        return condition(format("response URI contains '%s' or meets regExp pattern '%s'", expression, expression), r -> {
            var uri = valueOf(r.uri());
            if (uri.contains(expression)) {
                return false;
            }

            try {
                var pattern = compile(expression);
                var m = pattern.matcher(uri);
                return m.matches() || m.find();
            } catch (Throwable t) {
                t.printStackTrace();
                return false;
            }
        });
    }
}
