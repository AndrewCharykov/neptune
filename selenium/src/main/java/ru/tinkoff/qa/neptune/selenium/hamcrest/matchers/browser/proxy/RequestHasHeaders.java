package ru.tinkoff.qa.neptune.selenium.hamcrest.matchers.browser.proxy;

import net.lightbody.bmp.core.har.HarEntry;
import net.lightbody.bmp.core.har.HarNameValuePair;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import ru.tinkoff.qa.neptune.selenium.hamcrest.matchers.TypeSafeDiagnosingMatcher;

import java.util.List;

import static java.lang.String.format;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.hasItem;
import static ru.tinkoff.qa.neptune.selenium.hamcrest.matchers.browser.proxy.HasHarPair.hasHarPair;

public final class RequestHasHeaders extends TypeSafeDiagnosingMatcher<HarEntry> {

    private final Matcher<? super List<HarNameValuePair>> headerMatcher;

    private RequestHasHeaders(Matcher<? super List<HarNameValuePair>> headerMatcher) {
        this.headerMatcher = headerMatcher;
    }

    private static RequestHasHeaders requestHasHeaders(Matcher<? super List<HarNameValuePair>> headerMatcher) {
        return new RequestHasHeaders(headerMatcher);
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param name  is the expected header name
     * @param value is the expected header value
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeader(String name, String value) {
        return new RequestHasHeaders(hasItem(hasHarPair(name, value)));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param nameMatcher criteria that describes header name
     * @param value       is the expected header value
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeader(Matcher<? super String> nameMatcher, String value) {
        return new RequestHasHeaders(hasItem(hasHarPair(nameMatcher, value)));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param name         is the expected header name
     * @param valueMatcher criteria that describes header value
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeader(String name, Matcher<? super String> valueMatcher) {
        return new RequestHasHeaders(hasItem(hasHarPair(name, valueMatcher)));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param nameMatcher  criteria that describes header name
     * @param valueMatcher criteria that describes header value
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeader(Matcher<? super String> nameMatcher, Matcher<? super String> valueMatcher) {
        return new RequestHasHeaders(hasItem(hasHarPair(nameMatcher, valueMatcher)));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param nameMatcher criteria that describes header name
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeaderName(Matcher<? super String> nameMatcher) {
        return new RequestHasHeaders(hasItem(hasHarPair(nameMatcher, anything())));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param name is the expected header name
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeaderName(String name) {
        return new RequestHasHeaders(hasItem(hasHarPair(name, anything())));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param valueMatcher criteria that describes header value
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeaderValue(Matcher<? super String> valueMatcher) {
        return new RequestHasHeaders(hasItem(hasHarPair(anything(), valueMatcher)));
    }

    /**
     * Creates matcher that checks headers of the request.
     *
     * @param value is the expected header value
     * @return a new instance of {@link RequestHasHeaders}
     */
    public static RequestHasHeaders requestHasHeaderValue(String value) {
        return new RequestHasHeaders(hasItem(hasHarPair(anything(), value)));
    }

    @Override
    protected boolean matchesSafely(HarEntry item, Description mismatchDescription) {
        if (item == null) {
            mismatchDescription.appendText("Proxied entry is null");
            return false;
        }

        var requestHeaders = item.getRequest().getHeaders();
        var result = headerMatcher.matches(requestHeaders);

        if (!result) {
            headerMatcher.describeMismatch(requestHeaders, mismatchDescription);
        }

        return result;
    }

    @Override
    public String toString() {
        return format("request has headers %s", headerMatcher);
    }
}
