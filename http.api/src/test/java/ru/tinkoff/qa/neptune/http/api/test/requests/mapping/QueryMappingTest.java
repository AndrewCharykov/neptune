package ru.tinkoff.qa.neptune.http.api.test.requests.mapping;

import org.hamcrest.Matcher;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.tinkoff.qa.neptune.http.api.request.RequestBuilder;
import ru.tinkoff.qa.neptune.http.api.service.mapping.HttpAPI;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.methods.HttpMethod;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.methods.URIPath;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.parameters.MethodParameter;
import ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.parameters.query.QueryParameter;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.getProperties;
import static java.util.List.of;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static ru.tinkoff.qa.neptune.core.api.hamcrest.resorce.locator.HasHostMatcher.uriHasHost;
import static ru.tinkoff.qa.neptune.core.api.hamcrest.resorce.locator.HasPathMatcher.uriHasPath;
import static ru.tinkoff.qa.neptune.core.api.hamcrest.resorce.locator.HasPortMatcher.uriHasPort;
import static ru.tinkoff.qa.neptune.core.api.hamcrest.resorce.locator.HasQueryMatcher.uriHasQuery;
import static ru.tinkoff.qa.neptune.core.api.hamcrest.resorce.locator.HasSchemeMatcher.uriHasScheme;
import static ru.tinkoff.qa.neptune.http.api.properties.DefaultEndPointOfTargetAPIProperty.DEFAULT_END_POINT_OF_TARGET_API_PROPERTY;
import static ru.tinkoff.qa.neptune.http.api.service.mapping.HttpAPI.createAPI;
import static ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.methods.DefaultHttpMethods.GET;
import static ru.tinkoff.qa.neptune.http.api.service.mapping.annotations.parameters.query.QueryStyles.*;

public class QueryMappingTest {

    private final static URI TEST_URI = URI.create("http://127.0.0.1:8089");

    private final static Map<String, Object> LOW_LEVEL_MAP = new LinkedHashMap<>() {
        {
            put("someNum3", 3);
            put("someString3", "string3");
            put("someArray3", new Object[]{1, 2, 3, 3});
        }
    };

    private final static Map<String, Object> MID_LEVEL_MAP = new LinkedHashMap<>() {
        {
            put("someNum2", 2);
            put("someString2", "string2");
            put("someArray2", new Object[]{1, 2, 3, 3});
            put("nested2", LOW_LEVEL_MAP);
        }
    };

    private final static Map<String, Object> MID_LEVEL_MAP2 = new LinkedHashMap<>() {
        {
            put("someNum4", 4);
            put("someArray4", new Object[]{1, 2, 3, 3});
            put("someString4", "string4");
            put("nested4", LOW_LEVEL_MAP);
        }
    };

    private final static Map<String, Object> HIGH_LEVEL_MAP = new LinkedHashMap<>() {
        {
            put("someNum", 1);
            put("someString", "string1");
            put("someArray", List.of("ABCD", "EF GH", "АБВГ Д"));
            put("nested", MID_LEVEL_MAP);
            put("nestedNext", MID_LEVEL_MAP2);
        }
    };

    private final static QueryParameterObject3 LOW_LEVEL_NESTED_OBJECT = new QueryParameterObject3()
            .setSomeNum(3)
            .setSomeString("string3")
            .setSomeArray(new Integer[]{1, 2, 3, 3});

    private final static QueryParameterObject QUERY_PARAMETER_OBJECT = new QueryParameterObject()
            .setSomeNum(1)
            .setSomeString("string1")
            .setSomeArray(of("ABCD", "EF GH", "АБВГ Д"))
            .setNested(new QueryParameterObject2()
                    .setSomeNum(2)
                    .setSomeString("string2")
                    .setSomeArray(new Integer[]{1, 2, 3, 3})
                    .setNested(LOW_LEVEL_NESTED_OBJECT))
            .setNestedNext(new QueryParameterObject4()
                    .setSomeNum(4)
                    .setSomeString("string4")
                    .setSomeArray(new Integer[]{1, 2, 3, 3})
                    .setNested(LOW_LEVEL_NESTED_OBJECT));

    private static Object[][] prepareDataForQueryMapping(QueryMapping someMappedAPI) {
        return new Object[][]{
                {someMappedAPI.getSomethingWithQuery("val1", 3, "Hello world", true),
                        equalTo("/"),
                        equalTo("param1=val1&param1=3&param1=Hello+world&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPath("val1", 3, "Hello world", true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=val1&param1=3&param1=Hello+world&param2=true")},


                {someMappedAPI.getSomethingWithQuery(of("val1", 3, "Hello world"), true),
                        equalTo("/"),
                        equalTo("param1=val1&param1=3&param1=Hello+world&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPath(of("val1", 3, "Hello world"), true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=val1&param1=3&param1=Hello+world&param2=true")},

                {someMappedAPI.getSomethingWithQuery(new Object[]{"val1", 3, "Hello world"}, true),
                        equalTo("/"),
                        equalTo("param1=val1&param1=3&param1=Hello+world&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPath(new Object[]{"val1", 3, "Hello world"}, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=val1&param1=3&param1=Hello+world&param2=true")},

                {someMappedAPI.getSomethingWithQuery(new int[]{1, 2, 3}, true),
                        equalTo("/"),
                        equalTo("param1=1&param1=2&param1=3&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPath(new int[]{1, 2, 3}, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=1&param1=2&param1=3&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathFNE(of(1, "Кирилица", false, of("Hello world", "АБВ", 1, false)), true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=1,%D0%9A%D0%B8%D1%80%D0%B8%D0%BB%D0%B8%D1%86%D0%B0,false,Hello+world,%D0%90%D0%91%D0%92,1,false&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathFE(HIGH_LEVEL_MAP, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("someNum=1&someString=string1&someArray=ABCD,EF+GH,%D0%90%D0%91%D0%92%D0%93+%D0%94&nested=someNum2,2,someString2,string2,someArray2,1,2,3,3"
                                + "&nestedNext=someNum4,4,someArray4,1,2,3,3,someString4,string4"
                                + "&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathFNE(HIGH_LEVEL_MAP, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=someNum,1,someString,string1,someArray,ABCD,EF+GH,%D0%90%D0%91%D0%92%D0%93+%D0%94"
                                + "&param2=true")},


                {someMappedAPI.getSomethingWithQueryAndPathFE(QUERY_PARAMETER_OBJECT, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("someNum=1&someString=string1&someArray=ABCD,EF+GH,%D0%90%D0%91%D0%92%D0%93+%D0%94&nested=someNum2,2,someString2,string2,someArray2,1,2,3,3"
                                + "&nestedNext=someNum4,4,someArray4,1,2,3,3,someString4,string4"
                                + "&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathFNE(QUERY_PARAMETER_OBJECT, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=someNum,1,someString,string1,someArray,ABCD,EF+GH,%D0%90%D0%91%D0%92%D0%93+%D0%94"
                                + "&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathSNE(new Object[]{1, "Кирилица", false, of("Hello world", "АБВ", 1, false)}, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=1%20%D0%9A%D0%B8%D1%80%D0%B8%D0%BB%D0%B8%D1%86%D0%B0%20false%20Hello+world,%D0%90%D0%91%D0%92,1,false&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathPNE(new Object[]{1, "Кирилица", false, of("Hello world", "АБВ", 1, false)}, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1=1%7C%D0%9A%D0%B8%D1%80%D0%B8%D0%BB%D0%B8%D1%86%D0%B0%7Cfalse%7CHello+world,%D0%90%D0%91%D0%92,1,false&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathDE(HIGH_LEVEL_MAP, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1[someNum]=1&param1[someString]=string1&param2=true")},

                {someMappedAPI.getSomethingWithQueryAndPathDE(QUERY_PARAMETER_OBJECT, true),
                        equalTo("/path/to/target/end/point"),
                        equalTo("param1[someNum]=1&param1[someString]=string1&param2=true")},
        };
    }

    @DataProvider
    public Object[][] data1() {
        return prepareDataForQueryMapping(createAPI(QueryMapping.class, TEST_URI));
    }

    @DataProvider
    public Object[][] data2() {
        try {
            DEFAULT_END_POINT_OF_TARGET_API_PROPERTY.accept("http://127.0.0.1:8089");
            return prepareDataForQueryMapping(createAPI(QueryMapping.class));
        } finally {
            getProperties().remove(DEFAULT_END_POINT_OF_TARGET_API_PROPERTY.getPropertyName());
        }
    }

    @Test(dataProvider = "data1")
    public void test1(RequestBuilder builder, Matcher<String> pathMatcher, Matcher<String> queryMather) {
        var uri = builder.build().uri();
        assertThat(uri, uriHasScheme("http"));
        assertThat(uri, uriHasHost("127.0.0.1"));
        assertThat(uri, uriHasPort(8089));
        assertThat(uri, uriHasPath(pathMatcher));
        assertThat(uri, uriHasQuery(queryMather));
    }

    @Test(dataProvider = "data2")
    public void test2(RequestBuilder builder, Matcher<String> pathMatcher, Matcher<String> queryMather) {
        test1(builder, pathMatcher, queryMather);
    }

    private interface QueryMapping extends HttpAPI<QueryMapping> {

        @HttpMethod(httpMethod = GET)
        RequestBuilder getSomethingWithQuery(@QueryParameter(name = "param1") String value1,
                                             @QueryParameter(name = "param1") int value2,
                                             @QueryParameter(name = "param1") String value3,
                                             @QueryParameter(name = "param2") Boolean value4);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPath(@QueryParameter(name = "param1") String value1,
                                                    @QueryParameter(name = "param1") int value2,
                                                    @QueryParameter(name = "param1") String value3,
                                                    @QueryParameter(name = "param2") Boolean value4);

        @HttpMethod(httpMethod = GET)
        RequestBuilder getSomethingWithQuery(@QueryParameter(name = "param1") List<Object> param1,
                                             @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPath(@QueryParameter(name = "param1") List<Object> param1,
                                                    @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        RequestBuilder getSomethingWithQuery(@QueryParameter(name = "param1") Object[] param1,
                                             @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPath(@QueryParameter(name = "param1") Object[] param1,
                                                    @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        RequestBuilder getSomethingWithQuery(@QueryParameter(name = "param1") int[] param1,
                                             @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPath(@QueryParameter(name = "param1") int[] param1,
                                                    @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPathFNE(@QueryParameter(name = "param1", explode = false) List<Object> param1,
                                                       @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPathFE(@QueryParameter(name = "param1") Object param1,
                                                      @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPathFNE(@QueryParameter(name = "param1", explode = false) Object param1,
                                                       @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPathSNE(
                @QueryParameter(name = "param1", style = SPACE_DELIMITED, explode = false) Object[] param1,
                @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPathPNE(
                @QueryParameter(name = "param1", style = PIPE_DELIMITED, explode = false) Object[] param1,
                @QueryParameter(name = "param2") Boolean param2);

        @HttpMethod(httpMethod = GET)
        @URIPath("path/to/target/end/point")
        RequestBuilder getSomethingWithQueryAndPathDE(@QueryParameter(name = "param1", style = DEEP_OBJECT) Object param1,
                                                      @QueryParameter(name = "param2") Boolean param2);
    }

    @MethodParameter
    private static class QueryParameterObject {
        private Integer someNum;

        private String someString;

        private List<String> someArray;

        private QueryParameterObject2 nested;

        private QueryParameterObject4 nestedNext;


        public QueryParameterObject setSomeNum(Integer someNum) {
            this.someNum = someNum;
            return this;
        }

        public String getSomeString() {
            return someString;
        }

        public QueryParameterObject setSomeString(String someString) {
            this.someString = someString;
            return this;
        }

        public QueryParameterObject setSomeArray(List<String> someArray) {
            this.someArray = someArray;
            return this;
        }

        public QueryParameterObject setNested(QueryParameterObject2 nested) {
            this.nested = nested;
            return this;
        }

        public QueryParameterObject setNestedNext(QueryParameterObject4 nestedNext) {
            this.nestedNext = nestedNext;
            return this;
        }
    }

    @MethodParameter
    private static class QueryParameterObject2 {
        Integer someNum2;

        String someString2;

        Integer[] someArray2;

        QueryParameterObject3 nested2;

        public QueryParameterObject2 setSomeNum(Integer someNum) {
            this.someNum2 = someNum;
            return this;
        }

        public QueryParameterObject2 setSomeString(String someString) {
            this.someString2 = someString;
            return this;
        }

        public QueryParameterObject2 setSomeArray(Integer[] someArray) {
            this.someArray2 = someArray;
            return this;
        }

        public QueryParameterObject2 setNested(QueryParameterObject3 nested) {
            this.nested2 = nested;
            return this;
        }
    }

    @MethodParameter
    private static class QueryParameterObject3 {
        Integer someNum3;

        String someString3;

        Integer[] someArray3;

        public QueryParameterObject3 setSomeNum(Integer someNum) {
            this.someNum3 = someNum;
            return this;
        }

        public QueryParameterObject3 setSomeString(String someString) {
            this.someString3 = someString;
            return this;
        }

        public QueryParameterObject3 setSomeArray(Integer[] someArray) {
            this.someArray3 = someArray;
            return this;
        }
    }

    @MethodParameter
    private static class QueryParameterObject4 {
        Integer someNum4;

        Integer[] someArray4;

        String someString4;

        QueryParameterObject3 nested4;

        public QueryParameterObject4 setSomeNum(Integer someNum) {
            this.someNum4 = someNum;
            return this;
        }

        public QueryParameterObject4 setSomeString(String someString) {
            this.someString4 = someString;
            return this;
        }

        public QueryParameterObject4 setSomeArray(Integer[] someArray) {
            this.someArray4 = someArray;
            return this;
        }

        public QueryParameterObject4 setNested(QueryParameterObject3 nested) {
            this.nested4 = nested;
            return this;
        }
    }
}
