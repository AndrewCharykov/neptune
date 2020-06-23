package ru.tinkoff.qa.neptune.http.api.service.mapping;

import ru.tinkoff.qa.neptune.http.api.properties.DefaultEndPointOfTargetAPIProperty;
import ru.tinkoff.qa.neptune.http.api.request.RequestTuner;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.Header;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.PathParameter;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.QueryParameter;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.body.Body;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.body.multipart.DefineContentType;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.body.multipart.DefineFileName;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.body.multipart.MultiPartBody;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.body.url.encoded.FormParameter;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.methods.HttpMethod;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.methods.URIPath;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static com.google.common.base.Preconditions.checkArgument;
import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.reflect.Proxy.newProxyInstance;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static ru.tinkoff.qa.neptune.http.api.properties.DefaultEndPointOfTargetAPIProperty.DEFAULT_END_POINT_OF_TARGET_API_PROPERTY;


/**
 * This interface is designed to be a parent of interfaces that model
 * behavior of some http API.
 * <p>
 * Child interfaces should declare methods that return {@link ru.tinkoff.qa.neptune.http.api.request.RequestBuilder}.
 * These methods should describe application http API under the testing.
 * Other methods should be static or they should have {@code default} modifier.
 * {@code default} methods also may describe API of an applications in case when a method of an API has optional
 * parameters (query parameters, elements of body, parts of a multipart bodies etc) or parameters with default values.
 * This methods should overload general methods.
 *
 * <p>
 * Used annotations to describe API:
 *     <ul>
 *         <li>Methods should be annotated by {@link HttpMethod} to define http method</li>
 *
 *         <li>Methods should be annotated by {@link URIPath} to define URI-path to requested endpoint</li>
 *
 *         <li>Methods may be annotated by {@link Header} to define required headers of resulted http request</li>
 *
 *         <li>Parameters of methods may be annotated by {@link QueryParameter} to define query parameters
 *         of resulted http request</li>
 *
 *         <li>Parameters of methods may be annotated by {@link PathParameter} to mark parameters of a method
 *         whose values define URI-path to requested endpoint. At this case {@link URIPath#value()} should have
 *         a substring like {@code '{path_variable}'} or {@code 'begin/{path_variable}/path/to/end/point'} that corresponds
 *         with declared {@link PathParameter#value()} {@code '@PathParameter("path_variable")'}</li>
 *
 *         <li>Parameters of methods may be annotated by {@link Body}. It marks a parameter those value is used
 *         as a body of resulted http request. This annotation should be used once per method. Combinations
 *         with {@link FormParameter} or with {@link MultiPartBody} are not allowed.</li>
 *
 *         <li>Parameters of methods may be annotated by {@link FormParameter}. It marks parameters those values are used
 *         as values in url-encoded form-body of resulted http request. Combinations with {@link Body} or with {@link MultiPartBody}
 *         are not allowed.</li>
 *
 *         <li>Parameters of methods may be annotated by {@link MultiPartBody}. It marks parameters those values are used
 *         as parts of a multipart body of resulted http request. Combinations with {@link Body} or with {@link FormParameter}
 *         are not allowed. Information given by the annotation may be supplemented by {@link DefineFileName} and/or
 *         {@link DefineContentType}</li>
 *     </ul>
 * </p>
 *
 * @param <T> is a type of interface that extends {@link HttpAPI}
 */
public interface HttpAPI<T extends HttpAPI> {

    /**
     * Creates an instance of an interface that extends {@link HttpAPI}.
     *
     * @param toCreate is an interface to instantiate
     * @param uri      is a root URI. It should consist of protocol/scheme, host/ip and port only
     * @param <T>      is a type of resulted instance
     * @return is an instance of an interface that extends {@link HttpAPI}
     */
    @SuppressWarnings("unchecked")
    static <T extends HttpAPI<T>> T createAPI(Class<T> toCreate, URI uri) {
        return (T) newProxyInstance(getSystemClassLoader(),
                new Class[]{toCreate},
                new HttpAPIProxyHandler(uri));
    }

    /**
     * Creates an instance of an interface that extends {@link HttpAPI}.
     *
     * @param toCreate is an interface to instantiate
     * @param url      is a root URL. It should consist of protocol/scheme, host/ip and port only
     * @param <T>      is a type of resulted instance
     * @return is an instance of an interface that extends {@link HttpAPI}
     */
    static <T extends HttpAPI<T>> T createAPI(Class<T> toCreate, URL url) {
        try {
            return createAPI(toCreate, url.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates an instance of an interface that extends {@link HttpAPI}.
     *
     * @param toCreate is an interface to instantiate
     * @param uriStr   is a string value of root URI. It should consist of protocol/scheme, host/ip and port only
     * @param <T>      is a type of resulted instance
     * @return is an instance of an interface that extends {@link HttpAPI}
     */
    static <T extends HttpAPI<T>> T createAPI(Class<T> toCreate, String uriStr) {
        checkArgument(isNotBlank(uriStr), "String value of root URI is null/blank");
        return createAPI(toCreate, URI.create(uriStr));
    }

    /**
     * Creates an instance of an interface that extends {@link HttpAPI}. It uses a value defined by
     * {@link DefaultEndPointOfTargetAPIProperty#DEFAULT_END_POINT_OF_TARGET_API_PROPERTY} as root URI.
     *
     * @param toCreate is an interface to instantiate
     * @param <T>      is a type of resulted instance
     * @return is an instance of an interface that extends {@link HttpAPI}
     */
    static <T extends HttpAPI<T>> T createAPI(Class<T> toCreate) {
        return createAPI(toCreate, DEFAULT_END_POINT_OF_TARGET_API_PROPERTY.get());
    }

    /**
     * Adds instances that define parameters of resulted objects of {@link ru.tinkoff.qa.neptune.http.api.request.RequestBuilder}
     *
     * @param requestTuners instances that define parameters of resulted objects of {@link ru.tinkoff.qa.neptune.http.api.request.RequestBuilder}
     * @return is supposed to return self-reference
     */
    T useForRequestBuilding(RequestTuner... requestTuners);

    /**
     * Defines a class those instance defines parameters of resulted objects of {@link ru.tinkoff.qa.neptune.http.api.request.RequestBuilder}
     *
     * @param requestTuner a class those instance defines parameters of resulted objects of {@link ru.tinkoff.qa.neptune.http.api.request.RequestBuilder}
     * @return is supposed to return self-reference
     */
    T useForRequestBuilding(Class<RequestTuner> requestTuner);
}
