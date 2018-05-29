package com.github.toy.constructor.selenium.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.openqa.selenium.By.*;

class FakeDOMModel {

    public final static String LABEL_TAG = "label";
    public final static String LABEL_XPATH = ".//*[@class = 'label-element']";
    public final static String LABEL_XPATH2 = ".//ancestor::span[@class = 'mark']";

    public final static String BUTTON_TAG = "button";
    public final static String LINK_TAG = "a";
    public final static String CUSTOM_LINK_CSS = "custom_link";
    public final static String CUSTOM_BUTTON_CLASS = "CustomButton";
    public final static String TEXT_FIELD_XPATH = ".//input[@type = 'text']";
    public final static String TEXT_AREA_TAG    = "textarea";
    public static final String DIV = "div";
    public static final String SPAN = "span";

    public final static String CHECK_BOX_XPATH = ".//input[@type = 'checkbox']";
    public final static String RADIO_BUTTON_XPATH = ".//input[@type = 'radio']";

    private static final String INPUT_TAG = "input";

    public final static String ATTR1 = "attribute1";
    public final static String ATTR2 = "attribute2";
    public final static String ATTR3 = "attribute3";
    public final static String ATTR4 = "attribute4";
    public final static String ATTR5 = "attribute5";
    public final static String ATTR6 = "attribute6";
    public final static String ATTR7 = "attribute7";
    public final static String ATTR8 = "attribute8";
    public final static String ATTR9 = "attribute9";
    public final static String ATTR10 = "attribute10";
    public final static String ATTR11 = "attribute11";
    public final static String ATTR12 = "attribute12";
    public final static String ATTR13 = "attribute13";
    public final static String ATTR14 = "attribute14";
    public final static String ATTR15 = "attribute15";
    public final static String ATTR16 = "attribute16";
    public final static String ATTR17 = "attribute17";
    public final static String ATTR18 = "attribute18";
    public final static String ATTR19 = "attribute19";
    public final static String ATTR20 = "attribute20";
    public final static String VALUE = "value";
    public final static String HREF = "href";

    public final static String VALUE1 = "value1";
    public final static String VALUE2 = "value2";
    public final static String VALUE3 = "value3";
    public final static String VALUE4 = "value4";
    public final static String VALUE5 = "value5";
    public final static String VALUE6 = "value6";
    public final static String VALUE7 = "value7";
    public final static String VALUE8 = "value8";
    public final static String VALUE9 = "value9";
    public final static String VALUE10 = "value10";
    public final static String VALUE11 = "value11";
    public final static String VALUE12 = "value12";
    public final static String VALUE13 = "value13";
    public final static String VALUE14 = "value14";
    public final static String VALUE15 = "value15";
    public final static String VALUE16 = "value16";
    public final static String VALUE17 = "value17";
    public final static String VALUE18 = "value18";
    public final static String VALUE19 = "value19";
    public final static String VALUE20 = "value20";


    public final static String CSS1 = "css1";
    public final static String CSS2 = "css2";
    public final static String CSS3 = "css3";
    public final static String CSS4 = "css4";
    public final static String CSS5 = "css5";
    public final static String CSS6 = "css6";
    public final static String CSS7 = "css7";
    public final static String CSS8 = "css8";
    public final static String CSS9 = "css9";
    public final static String CSS10 = "css10";
    public final static String CSS11 = "css11";
    public final static String CSS12 = "css12";
    public final static String CSS13 = "css13";
    public final static String CSS14 = "css14";
    public final static String CSS15 = "css15";
    public final static String CSS16 = "css16";
    public final static String CSS17 = "css17";
    public final static String CSS18 = "css18";
    public final static String CSS19 = "css19";
    public final static String CSS20 = "css20";

    public final static String CSS_VALUE1 = "css_value1";
    public final static String CSS_VALUE2 = "css_value2";
    public final static String CSS_VALUE3 = "css_value3";
    public final static String CSS_VALUE4 = "css_value4";
    public final static String CSS_VALUE5 = "css_value5";
    public final static String CSS_VALUE6 = "css_value6";
    public final static String CSS_VALUE7 = "css_value7";
    public final static String CSS_VALUE8 = "css_value8";
    public final static String CSS_VALUE9 = "css_value9";
    public final static String CSS_VALUE10 = "css_value10";
    public final static String CSS_VALUE11 = "css_value11";
    public final static String CSS_VALUE12 = "css_value12";
    public final static String CSS_VALUE13 = "css_value13";
    public final static String CSS_VALUE14 = "css_value14";
    public final static String CSS_VALUE15 = "css_value15";
    public final static String CSS_VALUE16 = "css_value16";
    public final static String CSS_VALUE17 = "css_value17";
    public final static String CSS_VALUE18 = "css_value18";
    public final static String CSS_VALUE19 = "css_value19";
    public final static String CSS_VALUE20 = "css_value20";

    public final static String BUTTON_TEXT1 = "Button Text1";
    public final static String BUTTON_TEXT2 = "Button Text2";
    public final static String BUTTON_TEXT3 = "Button Text2";
    public final static String BUTTON_TEXT4 = "Button Text4";
    public final static String BUTTON_TEXT5 = "Button Text5";

    public final static String BUTTON_LABEL_TEXT1 = "Button Label Text1";
    public final static String BUTTON_LABEL_TEXT2 = "Button Label Text2";
    public final static String BUTTON_LABEL_TEXT3 = "Button Label Text3";
    public final static String BUTTON_LABEL_TEXT4 = "Button Label Text4";
    public final static String BUTTON_LABEL_TEXT5 = "Button Label Text5";
    public final static String BUTTON_LABEL_TEXT6 = "Button Label Text6";
    public final static String BUTTON_LABEL_TEXT7 = "Button Label Text7";
    public final static String BUTTON_LABEL_TEXT8 = "Button Label Text8";
    public final static String BUTTON_LABEL_TEXT9 = "Button Label Text9";
    public final static String BUTTON_LABEL_TEXT10 = "Button Label Text10";
    public final static String BUTTON_LABEL_TEXT11 = "Button Label Text11";
    public final static String BUTTON_LABEL_TEXT12 = "Button Label Text12";

    public final static String INPUT_TEXT1 = "Input Text1";
    public final static String INPUT_TEXT2 = "Input Text2";
    public final static String INPUT_TEXT3 = "Input Text2";
    public final static String INPUT_TEXT4 = "Input Text4";
    public final static String INPUT_TEXT5 = "Input Text5";
    public final static String INPUT_TEXT6 = "Input Text6";
    public final static String INPUT_TEXT7 = "Input Text7";
    public final static String INPUT_TEXT8 = "Input Text8";
    public final static String INPUT_TEXT9 = "Input Text9";
    public final static String INPUT_TEXT10 = "Input Text10";
    public final static String INPUT_TEXT11 = "Input Text11";
    public final static String INPUT_TEXT12 = "Input Text12";

    public final static String INPUT_LABEL_TEXT1 = "Input Label Text1";
    public final static String INPUT_LABEL_TEXT2 = "Input Label Text2";
    public final static String INPUT_LABEL_TEXT3 = "Input Label Text3";
    public final static String INPUT_LABEL_TEXT4 = "Input Label Text4";
    public final static String INPUT_LABEL_TEXT5 = "Input Label Text5";
    public final static String INPUT_LABEL_TEXT6 = "Input Label Text6";
    public final static String INPUT_LABEL_TEXT7 = "Input Label Text7";
    public final static String INPUT_LABEL_TEXT8 = "Input Label Text8";
    public final static String INPUT_LABEL_TEXT9 = "Input Label Text9";
    public final static String INPUT_LABEL_TEXT10 = "Input Label Text10";
    public final static String INPUT_LABEL_TEXT11 = "Input Label Text11";
    public final static String INPUT_LABEL_TEXT12 = "Input Label Text12";

    public final static String CHECKBOX_LABEL_TEXT1 = "Checkbox Label Text1";
    public final static String CHECKBOX_LABEL_TEXT2 = "Checkbox Label Text2";
    public final static String CHECKBOX_LABEL_TEXT3 = "Checkbox Label Text3";
    public final static String CHECKBOX_LABEL_TEXT4 = "Checkbox Label Text4";
    public final static String CHECKBOX_LABEL_TEXT5 = "Checkbox Label Text5";
    public final static String CHECKBOX_LABEL_TEXT6 = "Checkbox Label Text6";
    public final static String CHECKBOX_LABEL_TEXT7 = "Checkbox Label Text7";
    public final static String CHECKBOX_LABEL_TEXT8 = "Checkbox Label Text8";
    public final static String CHECKBOX_LABEL_TEXT9 = "Checkbox Label Text9";
    public final static String CHECKBOX_LABEL_TEXT10 = "Checkbox Label Text10";
    public final static String CHECKBOX_LABEL_TEXT11 = "Checkbox Label Text11";
    public final static String CHECKBOX_LABEL_TEXT12 = "Checkbox Label Text12";

    public final static String RADIOBUTTON_LABEL_TEXT1 = "Radiobutton Label Text1";
    public final static String RADIOBUTTON_LABEL_TEXT2 = "Radiobutton Label Text2";
    public final static String RADIOBUTTON_LABEL_TEXT3 = "Radiobutton Label Text3";
    public final static String RADIOBUTTON_LABEL_TEXT4 = "Radiobutton Label Text4";
    public final static String RADIOBUTTON_LABEL_TEXT5 = "Radiobutton Label Text5";
    public final static String RADIOBUTTON_LABEL_TEXT6 = "Radiobutton Label Text6";
    public final static String RADIOBUTTON_LABEL_TEXT7 = "Radiobutton Label Text7";
    public final static String RADIOBUTTON_LABEL_TEXT8 = "Radiobutton Label Text8";
    public final static String RADIOBUTTON_LABEL_TEXT9 = "Radiobutton Label Text9";
    public final static String RADIOBUTTON_LABEL_TEXT10 = "Radiobutton Label Text10";
    public final static String RADIOBUTTON_LABEL_TEXT11 = "Radiobutton Label Text11";
    public final static String RADIOBUTTON_LABEL_TEXT12 = "Radiobutton Label Text12";

    public final static String LINK_TEXT1 = "Link Text1";
    public final static String LINK_TEXT2 = "Link Text2";
    public final static String LINK_TEXT3 = "Link Text2";
    public final static String LINK_TEXT4 = "Link Text4";

    public final static String LINK_LABEL_TEXT1 = "Link Label Text1";
    public final static String LINK_LABEL_TEXT2 = "Link Label Text2";
    public final static String LINK_LABEL_TEXT3 = "Link Label Text3";
    public final static String LINK_LABEL_TEXT4 = "Link Label Text4";
    public final static String LINK_LABEL_TEXT5 = "Link Label Text5";
    public final static String LINK_LABEL_TEXT6 = "Link Label Text6";
    public final static String LINK_LABEL_TEXT7 = "Link Label Text7";
    public final static String LINK_LABEL_TEXT8 = "Link Label Text8";
    public final static String LINK_LABEL_TEXT9 = "Link Label Text9";
    public final static String LINK_LABEL_TEXT10 = "Link Label Text10";
    public final static String LINK_LABEL_TEXT11 = "Link Label Text11";
    public final static String LINK_LABEL_TEXT12 = "Link Label Text12";

    public final static String LINK_REFERENCE1 = "https://www.localhost1.com/";
    public final static String LINK_REFERENCE2 = "https://www.localhost2.com/";
    public final static String LINK_REFERENCE3 = "https://www.localhost3.com/";
    public final static String LINK_REFERENCE4 = "https://www.localhost4.com/";
    public final static String LINK_REFERENCE5 = "https://www.localhost5.com/";
    public final static String LINK_REFERENCE6 = "https://www.localhost6.com/";
    public final static String LINK_REFERENCE7 = "https://www.localhost7.com/";
    public final static String LINK_REFERENCE8 = "https://www.localhost8.com/";
    public final static String LINK_REFERENCE9 = "https://www.localhost9.com/";
    public final static String LINK_REFERENCE10 = "https://www.localhost10.com/";
    public final static String LINK_REFERENCE11 = "https://www.localhost11.com/";
    public final static String LINK_REFERENCE12 = "https://www.localhost12.com/";

    public final static MockWebElement COMMON_BUTTON1 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE8),
                    entry(ATTR4, VALUE2),
                    entry(ATTR3, VALUE4)),
            Map.ofEntries(entry(CSS1, CSS_VALUE2),
                    entry(CSS4, CSS_VALUE5),
                    entry(CSS16, CSS_VALUE17)), new Point(10, 20), new Dimension(20, 30), false,
            false, LINK_TAG, BUTTON_TEXT1, List.of());

    public final static MockWebElement COMMON_BUTTON2 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE7),
                    entry(ATTR4, VALUE5),
                    entry(ATTR3, VALUE3)),
            Map.ofEntries(entry(CSS1, CSS_VALUE7),
                    entry(CSS4, CSS_VALUE5),
                    entry(CSS16, CSS_VALUE18)), new Point(15, 25), new Dimension(25, 35), true,
            false, BUTTON_TAG, BUTTON_TEXT2, List.of());

    public final static MockWebElement COMMON_BUTTON3 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE7),
                    entry(ATTR4, VALUE6),
                    entry(ATTR3, VALUE5)),
            Map.ofEntries(entry(CSS1, CSS_VALUE6),
                    entry(CSS4, CSS_VALUE5),
                    entry(CSS16, CSS_VALUE16)), new Point(35, 45), new Dimension(45, 44), true,
            false, BUTTON_TAG, BUTTON_TEXT3, List.of());

    public final static MockWebElement COMMON_BUTTON4 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE9),
                    entry(ATTR4, VALUE9),
                    entry(ATTR3, VALUE11)),
            Map.ofEntries(entry(CSS1, CSS_VALUE20),
                    entry(CSS4, CSS_VALUE15),
                    entry(CSS16, CSS_VALUE18)), new Point(53, 70), new Dimension(100, 70), false,
            false, BUTTON_TAG, BUTTON_TEXT4, List.of());


    public final static MockWebElement COMMON_LABELED_BUTTON1 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE1),
                    entry(ATTR2, VALUE10)),
            Map.ofEntries(entry(CSS2, CSS_VALUE1),
                    entry(CSS3, CSS_VALUE3)), new Point(11, 21), new Dimension(21, 32), true,
            false, BUTTON_TAG, BUTTON_TEXT5, List.of(
                    new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                            new Dimension(21, 32), true,
                            false, LABEL_TAG, BUTTON_LABEL_TEXT1, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_BUTTON2 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE2),
                    entry(ATTR2, VALUE10)),
            Map.ofEntries(entry(CSS2, CSS_VALUE4),
                    entry(CSS3, CSS_VALUE8)), new Point(13, 23), new Dimension(24, 35), false,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(25, 31), false,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT2, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_BUTTON3 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE2),
                    entry(ATTR2, VALUE10)),
            Map.ofEntries(entry(CSS2, CSS_VALUE4),
                    entry(CSS3, CSS_VALUE8)), new Point(13, 23), new Dimension(25, 36), false,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(12, 22),
                    new Dimension(44, 37), false,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT3, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_BUTTON4 = new MockWebElement(tagName(BUTTON_TAG),
            Map.ofEntries(entry(ATTR1, VALUE2),
                    entry(ATTR2, VALUE10)),
            Map.ofEntries(entry(CSS2, CSS_VALUE4),
                    entry(CSS3, CSS_VALUE8)), new Point(13, 23), new Dimension(44, 55), true,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(13, 27),
                    new Dimension(36, 52), true,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT4, List.of())
    ));


    public final static MockWebElement CUSTOM_LABELED_BUTTON1 = new MockWebElement(className(CUSTOM_BUTTON_CLASS),
            Map.ofEntries(entry(ATTR5, VALUE10),
                    entry(ATTR6, VALUE11)),
            Map.ofEntries(entry(CSS5, CSS_VALUE7),
                    entry(CSS6, CSS_VALUE8)), new Point(55, 47), new Dimension(45, 69), true,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(50, 41),
                    new Dimension(33, 45), true,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT5, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(31, 41),
                    new Dimension(51, 62), true,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT9, List.of()
            )));

    public final static MockWebElement CUSTOM_LABELED_BUTTON2 = new MockWebElement(className(CUSTOM_BUTTON_CLASS),
            Map.ofEntries(entry(ATTR5, VALUE11),
                    entry(ATTR6, VALUE12)),
            Map.ofEntries(entry(CSS5, CSS_VALUE8),
                    entry(CSS6, CSS_VALUE9)), new Point(56, 48), new Dimension(46, 70), false,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(51, 42),
                    new Dimension(33, 45), false,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT6, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(32, 42),
                    new Dimension(52, 63), false,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT10, List.of()
            )));

    public final static MockWebElement CUSTOM_LABELED_BUTTON3 = new MockWebElement(className(CUSTOM_BUTTON_CLASS),
            Map.ofEntries(entry(ATTR5, VALUE12),
                    entry(ATTR6, VALUE13)),
            Map.ofEntries(entry(CSS5, CSS_VALUE9),
                    entry(CSS6, CSS_VALUE10)), new Point(57, 49), new Dimension(47, 71), true,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(52, 43),
                    new Dimension(34, 46), true,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT7, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(33, 43),
                    new Dimension(53, 64), true,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT11, List.of()
            )));

    public final static MockWebElement CUSTOM_LABELED_BUTTON4 = new MockWebElement(className(CUSTOM_BUTTON_CLASS),
            Map.ofEntries(entry(ATTR5, VALUE13),
                    entry(ATTR6, VALUE14)),
            Map.ofEntries(entry(CSS5, CSS_VALUE10),
                    entry(CSS6, CSS_VALUE11)), new Point(58, 50), new Dimension(48, 72), false,
            false, BUTTON_TAG, EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(53, 44),
                    new Dimension(35, 47), false,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT8, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(34, 44),
                    new Dimension(54, 65), false,
                    false, LABEL_TAG, BUTTON_LABEL_TEXT12, List.of()
            )));

    public final static MockWebElement COMMON_TEXT_INPUT1 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE3),
                    entry(ATTR8, VALUE4),
                    entry(ATTR9, VALUE5)),
            Map.ofEntries(entry(CSS7, CSS_VALUE3),
                    entry(CSS8, CSS_VALUE4),
                    entry(CSS9, CSS_VALUE5)), new Point(10, 20), new Dimension(20, 30), false,
            false, INPUT_TAG, INPUT_TEXT1, List.of());

    public final static MockWebElement COMMON_TEXT_INPUT2 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE4),
                    entry(ATTR8, VALUE5),
                    entry(ATTR9, VALUE6)),
            Map.ofEntries(entry(CSS7, CSS_VALUE4),
                    entry(CSS8, CSS_VALUE5),
                    entry(CSS9, CSS_VALUE6)), new Point(15, 25), new Dimension(25, 35), true,
            false, BUTTON_TAG, INPUT_TEXT2, List.of());

    public final static MockWebElement COMMON_TEXT_INPUT3 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE5),
                    entry(ATTR8, VALUE6),
                    entry(ATTR9, VALUE7)),
            Map.ofEntries(entry(CSS7, CSS_VALUE5),
                    entry(CSS8, CSS_VALUE6),
                    entry(CSS9, CSS_VALUE7)), new Point(35, 45), new Dimension(45, 44), true,
            false, INPUT_TAG, INPUT_TEXT3, List.of());

    public final static MockWebElement COMMON_TEXT_INPUT4 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE5),
                    entry(ATTR8, VALUE6),
                    entry(ATTR9, VALUE7)),
            Map.ofEntries(entry(CSS7, CSS_VALUE5),
                    entry(CSS8, CSS_VALUE6),
                    entry(CSS9, CSS_VALUE7)), new Point(53, 70), new Dimension(100, 70), false,
            false, INPUT_TAG, INPUT_TEXT4, List.of());


    public final static MockWebElement COMMON_LABELED_INPUT1 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE6),
                    entry(ATTR8, VALUE7),
                    entry(ATTR9, VALUE8),
                    entry(VALUE, INPUT_TEXT5)),
            Map.ofEntries(entry(CSS7, CSS_VALUE6),
                    entry(CSS8, CSS_VALUE7),
                    entry(CSS9, CSS_VALUE8)), new Point(11, 21), new Dimension(21, 32), true,
            false, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(21, 32), true,
                    false, LABEL_TAG, INPUT_LABEL_TEXT1, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_INPUT2 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE7),
                    entry(ATTR8, VALUE8),
                    entry(ATTR9, VALUE9),
                    entry(VALUE, INPUT_TEXT6)),
            Map.ofEntries(entry(CSS7, CSS_VALUE7),
                    entry(CSS8, CSS_VALUE8),
                    entry(CSS9, CSS_VALUE9)), new Point(13, 23), new Dimension(24, 35), false,
            false, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(25, 31), false,
                    false, LABEL_TAG, INPUT_LABEL_TEXT2, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_INPUT3 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE7),
                    entry(ATTR8, VALUE8),
                    entry(ATTR9, VALUE9),
                    entry(VALUE, INPUT_TEXT7)),
            Map.ofEntries(entry(CSS7, CSS_VALUE7),
                    entry(CSS8, CSS_VALUE8),
                    entry(CSS9, CSS_VALUE9)), new Point(13, 23), new Dimension(25, 36), false,
            false, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(12, 22),
                    new Dimension(44, 37), false,
                    false, LABEL_TAG, INPUT_LABEL_TEXT3, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_INPUT4 = new MockWebElement(xpath(TEXT_FIELD_XPATH),
            Map.ofEntries(entry(ATTR7, VALUE8),
                    entry(ATTR8, VALUE9),
                    entry(ATTR9, VALUE10),
                    entry(VALUE, INPUT_TEXT8)),
            Map.ofEntries(entry(CSS7, CSS_VALUE8),
                    entry(CSS8, CSS_VALUE9),
                    entry(CSS9, CSS_VALUE10)), new Point(13, 23), new Dimension(44, 55), true,
            false, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(13, 27),
                    new Dimension(36, 52), true,
                    false, LABEL_TAG, INPUT_LABEL_TEXT4, List.of())
    ));


    public final static MockWebElement TEXT_AREA1 = new MockWebElement(tagName(TEXT_AREA_TAG),
            Map.ofEntries(entry(ATTR10, VALUE11),
                    entry(ATTR11, VALUE12),
                    entry(VALUE, INPUT_TEXT9)),
            Map.ofEntries(entry(CSS10, CSS_VALUE10),
                    entry(CSS11, CSS_VALUE11)), new Point(55, 47), new Dimension(45, 69), true,
            false, TEXT_AREA_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(50, 41),
                    new Dimension(33, 45), true,
                    false, LABEL_TAG, INPUT_LABEL_TEXT5, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(31, 41),
                    new Dimension(51, 62), true,
                    false, LABEL_TAG, INPUT_LABEL_TEXT9, List.of()
            )));

    public final static MockWebElement TEXT_AREA2 = new MockWebElement(tagName(TEXT_AREA_TAG),
            Map.ofEntries(entry(ATTR10, VALUE12),
                    entry(ATTR11, VALUE13),
                    entry(VALUE, INPUT_TEXT10)),
            Map.ofEntries(entry(CSS10, CSS_VALUE11),
                    entry(CSS11, CSS_VALUE12)), new Point(56, 48), new Dimension(46, 70), false,
            false, TEXT_AREA_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(51, 42),
                    new Dimension(33, 45), false,
                    false, LABEL_TAG, INPUT_LABEL_TEXT6, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(32, 42),
                    new Dimension(52, 63), false,
                    false, LABEL_TAG, INPUT_LABEL_TEXT10, List.of()
            )));

    public final static MockWebElement TEXT_AREA3 = new MockWebElement(tagName(TEXT_AREA_TAG),
            Map.ofEntries(entry(ATTR10, VALUE13),
                    entry(ATTR11, VALUE14),
                    entry(VALUE, INPUT_TEXT11)),
            Map.ofEntries(entry(CSS10, CSS_VALUE12),
                    entry(CSS11, CSS_VALUE13)), new Point(57, 49), new Dimension(47, 71), true,
            false, TEXT_AREA_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(52, 43),
                    new Dimension(34, 46), true,
                    false, LABEL_TAG, INPUT_LABEL_TEXT7, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(33, 43),
                    new Dimension(53, 64), true,
                    false, LABEL_TAG, INPUT_LABEL_TEXT11, List.of()
            )));

    public final static MockWebElement TEXT_AREA4 = new MockWebElement(tagName(TEXT_AREA_TAG),
            Map.ofEntries(entry(ATTR10, VALUE14),
                    entry(ATTR11, VALUE15),
                    entry(VALUE, INPUT_TEXT12)),
            Map.ofEntries(entry(CSS10, CSS_VALUE13),
                    entry(CSS11, CSS_VALUE14)), new Point(58, 50), new Dimension(48, 72), false,
            false, TEXT_AREA_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(53, 44),
                    new Dimension(35, 47), false,
                    false, LABEL_TAG, INPUT_LABEL_TEXT8, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(34, 44),
                    new Dimension(54, 65), false,
                    false, LABEL_TAG, INPUT_LABEL_TEXT12, List.of()
            )));

    public final static MockWebElement COMMON_CHECKBOX1 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR11, VALUE11),
                    entry(ATTR12, VALUE12),
                    entry(ATTR13, VALUE13)),
            Map.ofEntries(entry(CSS12, CSS_VALUE11),
                    entry(CSS13, CSS_VALUE12),
                    entry(CSS14, CSS_VALUE13)), new Point(10, 20), new Dimension(20, 30), false,
            true, INPUT_TAG, EMPTY, List.of());

    public final static MockWebElement COMMON_CHECKBOX2 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR11, VALUE12),
                    entry(ATTR12, VALUE13),
                    entry(ATTR13, VALUE14)),
            Map.ofEntries(entry(CSS12, CSS_VALUE12),
                    entry(CSS13, CSS_VALUE13),
                    entry(CSS14, CSS_VALUE14)), new Point(15, 25), new Dimension(25, 35), true,
            true, INPUT_TAG, EMPTY, List.of());

    public final static MockWebElement COMMON_CHECKBOX3 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR11, VALUE13),
                    entry(ATTR12, VALUE14),
                    entry(ATTR13, VALUE15)),
            Map.ofEntries(entry(CSS12, CSS_VALUE13),
                    entry(CSS13, CSS_VALUE14),
                    entry(CSS14, CSS_VALUE15)), new Point(35, 45), new Dimension(45, 44), true,
            true, INPUT_TAG, EMPTY, List.of());

    public final static MockWebElement COMMON_CHECKBOX4 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR11, VALUE14),
                    entry(ATTR12, VALUE15),
                    entry(ATTR13, VALUE16)),
            Map.ofEntries(entry(CSS12, CSS_VALUE14),
                    entry(CSS13, CSS_VALUE15),
                    entry(CSS14, CSS_VALUE16)), new Point(53, 70), new Dimension(100, 70), false,
            true, INPUT_TAG, EMPTY, List.of());


    public final static MockWebElement COMMON_LABELED_CHECKBOX1 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE17),
                    entry(ATTR2, VALUE18)),
            Map.ofEntries(entry(CSS2, CSS_VALUE17),
                    entry(CSS3, CSS_VALUE18)), new Point(11, 21), new Dimension(21, 32), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(21, 32), true,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT1, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_CHECKBOX2 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE18),
                    entry(ATTR2, VALUE19)),
            Map.ofEntries(entry(CSS2, CSS_VALUE19),
                    entry(CSS3, CSS_VALUE20)), new Point(13, 23), new Dimension(24, 35), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(25, 31), false,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT2, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_CHECKBOX3 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE19),
                    entry(ATTR2, VALUE20)),
            Map.ofEntries(entry(CSS2, CSS_VALUE20),
                    entry(CSS3, CSS_VALUE1)), new Point(13, 23), new Dimension(25, 36), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(12, 22),
                    new Dimension(44, 37), false,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT3, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_CHECKBOX4 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE20),
                    entry(ATTR2, VALUE1)),
            Map.ofEntries(entry(CSS2, CSS_VALUE1),
                    entry(CSS3, CSS_VALUE2)), new Point(13, 23), new Dimension(44, 55), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(13, 27),
                    new Dimension(36, 52), true,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT4, List.of())
    ));


    public final static MockWebElement COMMON_LABELED_CHECKBOX5 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE1),
                    entry(ATTR2, VALUE2)),
            Map.ofEntries(entry(CSS2, CSS_VALUE2),
                    entry(CSS3, CSS_VALUE3)), new Point(55, 47), new Dimension(45, 69), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(50, 41),
                    new Dimension(33, 45), true,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT5, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(31, 41),
                    new Dimension(51, 62), true,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT9, List.of()
            )));

    public final static MockWebElement COMMON_LABELED_CHECKBOX6 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE2),
                    entry(ATTR2, VALUE3)),
            Map.ofEntries(entry(CSS2, CSS_VALUE3),
                    entry(CSS3, CSS_VALUE4)), new Point(56, 48), new Dimension(46, 70), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(51, 42),
                    new Dimension(33, 45), false,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT6, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(32, 42),
                    new Dimension(52, 63), false,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT10, List.of()
            )));

    public final static MockWebElement COMMON_LABELED_CHECKBOX7 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE3),
                    entry(ATTR2, VALUE4)),
            Map.ofEntries(entry(CSS2, CSS_VALUE4),
                    entry(CSS3, CSS_VALUE5)), new Point(57, 49), new Dimension(47, 71), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(52, 43),
                    new Dimension(34, 46), true,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT7, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(33, 43),
                    new Dimension(53, 64), true,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT11, List.of()
            )));

    public final static MockWebElement COMMON_LABELED_CHECKBOX8 = new MockWebElement(xpath(CHECK_BOX_XPATH),
            Map.ofEntries(entry(ATTR1, VALUE4),
                    entry(ATTR2, VALUE5)),
            Map.ofEntries(entry(CSS2, CSS_VALUE5),
                    entry(CSS3, CSS_VALUE6)), new Point(58, 50), new Dimension(48, 72), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(53, 44),
                    new Dimension(35, 47), false,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT8, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(34, 44),
                    new Dimension(54, 65), false,
                    false, LABEL_TAG, CHECKBOX_LABEL_TEXT12, List.of()
            )));

    public final static MockWebElement COMMON_RADIOBUTTON1 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE5),
                    entry(ATTR15, VALUE6),
                    entry(ATTR16, VALUE7)),
            Map.ofEntries(entry(CSS17, CSS_VALUE6),
                    entry(CSS18, CSS_VALUE7),
                    entry(CSS19, CSS_VALUE8)), new Point(10, 20), new Dimension(20, 30), false,
            true, INPUT_TAG, EMPTY, List.of());

    public final static MockWebElement COMMON_RADIOBUTTON2 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE6),
                    entry(ATTR15, VALUE7),
                    entry(ATTR16, VALUE8)),
            Map.ofEntries(entry(CSS17, CSS_VALUE7),
                    entry(CSS18, CSS_VALUE8),
                    entry(CSS19, CSS_VALUE9)), new Point(15, 25), new Dimension(25, 35), true,
            true, INPUT_TAG, EMPTY, List.of());

    public final static MockWebElement COMMON_RADIOBUTTON3 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE7),
                    entry(ATTR15, VALUE8),
                    entry(ATTR16, VALUE9)),
            Map.ofEntries(entry(CSS17, CSS_VALUE8),
                    entry(CSS18, CSS_VALUE9),
                    entry(CSS19, CSS_VALUE10)), new Point(35, 45), new Dimension(45, 44), true,
            true, INPUT_TAG, EMPTY, List.of());

    public final static MockWebElement COMMON_RADIOBUTTON4 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE8),
                    entry(ATTR15, VALUE9),
                    entry(ATTR16, VALUE10)),
            Map.ofEntries(entry(CSS17, CSS_VALUE9),
                    entry(CSS18, CSS_VALUE10),
                    entry(CSS19, CSS_VALUE11)), new Point(53, 70), new Dimension(100, 70), false,
            true, INPUT_TAG, EMPTY, List.of());


    public final static MockWebElement COMMON_LABELED_RADIOBUTTON1 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE11),
                    entry(ATTR15, VALUE12)),
            Map.ofEntries(entry(CSS18, CSS_VALUE12),
                    entry(CSS19, CSS_VALUE13)), new Point(11, 21), new Dimension(21, 32), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(21, 32), true,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT1, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_RADIOBUTTON2 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE13),
                    entry(ATTR15, VALUE14)),
            Map.ofEntries(entry(CSS18, CSS_VALUE13),
                    entry(CSS19, CSS_VALUE14)), new Point(13, 23), new Dimension(24, 35), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(25, 31), false,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT2, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_RADIOBUTTON3 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE14),
                    entry(ATTR15, VALUE15)),
            Map.ofEntries(entry(CSS18, CSS_VALUE14),
                    entry(CSS19, CSS_VALUE15)), new Point(13, 23), new Dimension(25, 36), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(12, 22),
                    new Dimension(44, 37), false,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT3, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_RADIOBUTTON4 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE15),
                    entry(ATTR15, VALUE16)),
            Map.ofEntries(entry(CSS18, CSS_VALUE15),
                    entry(CSS19, CSS_VALUE16)), new Point(13, 23), new Dimension(44, 55), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(13, 27),
                    new Dimension(36, 52), true,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT4, List.of())
    ));


    public final static MockWebElement COMMON_LABELED_RADIOBUTTON5 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE16),
                    entry(ATTR15, VALUE17)),
            Map.ofEntries(entry(CSS18, CSS_VALUE16),
                    entry(CSS19, CSS_VALUE17)), new Point(55, 47), new Dimension(45, 69), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(50, 41),
                    new Dimension(33, 45), true,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT5, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(31, 41),
                    new Dimension(51, 62), true,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT9, List.of()
            )));

    public final static MockWebElement COMMON_LABELED_RADIOBUTTON6 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE17),
                    entry(ATTR15, VALUE18)),
            Map.ofEntries(entry(CSS18, CSS_VALUE17),
                    entry(CSS19, CSS_VALUE18)), new Point(56, 48), new Dimension(46, 70), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(51, 42),
                    new Dimension(33, 45), false,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT6, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(32, 42),
                    new Dimension(52, 63), false,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT10, List.of()
            )));

    public final static MockWebElement COMMON_LABELED_RADIOBUTTON7 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE18),
                    entry(ATTR15, VALUE19)),
            Map.ofEntries(entry(CSS18, CSS_VALUE18),
                    entry(CSS19, CSS_VALUE19)), new Point(57, 49), new Dimension(47, 71), true,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(52, 43),
                    new Dimension(34, 46), true,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT7, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(33, 43),
                    new Dimension(53, 64), true,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT11, List.of()
            )));

    public final static MockWebElement COMMON_LABELED_RADIOBUTTON8 = new MockWebElement(xpath(RADIO_BUTTON_XPATH),
            Map.ofEntries(entry(ATTR14, VALUE19),
                    entry(ATTR15, VALUE20)),
            Map.ofEntries(entry(CSS18, CSS_VALUE19),
                    entry(CSS19, CSS_VALUE20)), new Point(58, 50), new Dimension(48, 72), false,
            true, INPUT_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(53, 44),
                    new Dimension(35, 47), false,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT8, List.of()),

            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(34, 44),
                    new Dimension(54, 65), false,
                    false, LABEL_TAG, RADIOBUTTON_LABEL_TEXT12, List.of()
            )));

    public final static MockWebElement COMMON_LINK1 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE20),
                    entry(ATTR18, VALUE1),
                    entry(HREF, LINK_REFERENCE1)),
            Map.ofEntries(entry(CSS15, CSS_VALUE20),
                    entry(CSS20, CSS_VALUE1)), new Point(10, 20), new Dimension(20, 30), false,
            false, LINK_TAG, LINK_TEXT1, List.of());

    public final static MockWebElement COMMON_LINK2 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE1),
                    entry(ATTR18, VALUE2),
                    entry(HREF, LINK_REFERENCE2)),
            Map.ofEntries(entry(CSS15, CSS_VALUE1),
                    entry(CSS20, CSS_VALUE2)), new Point(15, 25), new Dimension(25, 35), true,
            false, LINK_TAG, LINK_TEXT2, List.of());

    public final static MockWebElement COMMON_LINK3 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE2),
                    entry(ATTR18, VALUE3),
                    entry(HREF, LINK_REFERENCE3)),
            Map.ofEntries(entry(CSS15, CSS_VALUE2),
                    entry(CSS20, CSS_VALUE3)), new Point(35, 45), new Dimension(45, 44), true,
            false, LINK_TAG, LINK_TEXT3, List.of());

    public final static MockWebElement COMMON_LINK4 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE3),
                    entry(ATTR18, VALUE4),
                    entry(HREF, LINK_REFERENCE4)),
            Map.ofEntries(entry(CSS15, CSS_VALUE3),
                    entry(CSS20, CSS_VALUE4)), new Point(53, 70), new Dimension(100, 70), false,
            false, LINK_TAG, LINK_TEXT4, List.of());


    public final static MockWebElement COMMON_LABELED_LINK1 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE4),
                    entry(ATTR18, VALUE5),
                    entry(HREF, LINK_REFERENCE5)),
            Map.ofEntries(entry(CSS15, CSS_VALUE4),
                    entry(CSS20, CSS_VALUE5)), new Point(11, 21), new Dimension(21, 32), true,
            false, LINK_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(21, 32), true,
                    false, LABEL_TAG, LINK_LABEL_TEXT1, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_LINK2 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE4),
                    entry(ATTR18, VALUE5),
                    entry(HREF, LINK_REFERENCE6)),
            Map.ofEntries(entry(CSS15, CSS_VALUE4),
                    entry(CSS20, CSS_VALUE5)), new Point(13, 23), new Dimension(24, 35), false,
            false, LINK_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(11, 21),
                    new Dimension(25, 31), false,
                    false, LABEL_TAG, LINK_LABEL_TEXT2, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_LINK3 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE5),
                    entry(ATTR18, VALUE6),
                    entry(HREF, LINK_REFERENCE7)),
            Map.ofEntries(entry(CSS15, CSS_VALUE5),
                    entry(CSS20, CSS_VALUE6)), new Point(13, 23), new Dimension(25, 36), false,
            false, LINK_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(12, 22),
                    new Dimension(44, 37), false,
                    false, LABEL_TAG, LINK_LABEL_TEXT3, List.of())
    ));

    public final static MockWebElement COMMON_LABELED_LINK4 = new MockWebElement(tagName(LINK_TAG),
            Map.ofEntries(entry(ATTR17, VALUE6),
                    entry(ATTR18, VALUE7),
                    entry(HREF, LINK_REFERENCE8)),
            Map.ofEntries(entry(CSS15, CSS_VALUE6),
                    entry(CSS20, CSS_VALUE7)), new Point(13, 23), new Dimension(44, 55), true,
            false, LINK_TAG, EMPTY, List.of(
            new MockWebElement(tagName(LABEL_TAG), Map.ofEntries(), Map.ofEntries(), new Point(13, 27),
                    new Dimension(36, 52), true,
                    false, LABEL_TAG, LINK_LABEL_TEXT4, List.of())
    ));


    public final static MockWebElement CUSTOM_LABELED_LINK1 = new MockWebElement(cssSelector(CUSTOM_LINK_CSS),
            Map.ofEntries(entry(ATTR17, VALUE7),
                    entry(ATTR18, VALUE8),
                    entry(HREF, LINK_REFERENCE9)),
            Map.ofEntries(entry(CSS15, CSS_VALUE7),
                    entry(CSS20, CSS_VALUE8)), new Point(55, 47), new Dimension(45, 69), true,
            false, "div", EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(50, 41),
                    new Dimension(33, 45), true,
                    false, LABEL_TAG, LINK_LABEL_TEXT5, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(31, 41),
                    new Dimension(51, 62), true,
                    false, "span", LINK_LABEL_TEXT9, List.of()
            )));

    public final static MockWebElement CUSTOM_LABELED_LINK2 = new MockWebElement(cssSelector(CUSTOM_LINK_CSS),
            Map.ofEntries(entry(ATTR17, VALUE8),
                    entry(ATTR18, VALUE9),
                    entry(HREF, LINK_REFERENCE10)),
            Map.ofEntries(entry(CSS15, CSS_VALUE8),
                    entry(CSS20, CSS_VALUE9)), new Point(56, 48), new Dimension(46, 70), false,
            false, "div", EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(51, 42),
                    new Dimension(33, 45), false,
                    false, LABEL_TAG, LINK_LABEL_TEXT6, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(32, 42),
                    new Dimension(52, 63), false,
                    false, "span", LINK_LABEL_TEXT10, List.of()
            )));

    public final static MockWebElement CUSTOM_LABELED_LINK3 = new MockWebElement(cssSelector(CUSTOM_LINK_CSS),
            Map.ofEntries(entry(ATTR17, VALUE9),
                    entry(ATTR18, VALUE10),
                    entry(HREF, LINK_REFERENCE11)),
            Map.ofEntries(entry(CSS15, CSS_VALUE9),
                    entry(CSS20, CSS_VALUE10)), new Point(57, 49), new Dimension(47, 71), true,
            false, DIV, EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(52, 43),
                    new Dimension(34, 46), true,
                    false, LABEL_TAG, LINK_LABEL_TEXT7, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(33, 43),
                    new Dimension(53, 64), true,
                    false, "span", LINK_LABEL_TEXT11, List.of()
            )));

    public final static MockWebElement CUSTOM_LABELED_LINK4 = new MockWebElement(cssSelector(CUSTOM_LINK_CSS),
            Map.ofEntries(entry(ATTR17, VALUE10),
                    entry(ATTR18, VALUE11),
                    entry(HREF, LINK_REFERENCE12)),
            Map.ofEntries(entry(CSS15, CSS_VALUE10),
                    entry(CSS20, CSS_VALUE11)), new Point(58, 50), new Dimension(48, 72), false,
            false, "div", EMPTY, List.of(
            new MockWebElement(xpath(LABEL_XPATH), Map.ofEntries(), Map.ofEntries(), new Point(53, 44),
                    new Dimension(35, 47), false,
                    false, LABEL_TAG, LINK_LABEL_TEXT8, List.of()),

            new MockWebElement(xpath(LABEL_XPATH2), Map.ofEntries(), Map.ofEntries(), new Point(34, 44),
                    new Dimension(54, 65), false,
                    false, SPAN, LINK_LABEL_TEXT12, List.of()
            )));

    private final static List<MockWebElement> fakeMock = List.of(
            COMMON_BUTTON1, COMMON_BUTTON2, COMMON_BUTTON3, COMMON_BUTTON4,
            COMMON_LABELED_BUTTON1, COMMON_LABELED_BUTTON2, COMMON_LABELED_BUTTON3, COMMON_LABELED_BUTTON4,
            CUSTOM_LABELED_BUTTON1, CUSTOM_LABELED_BUTTON2, CUSTOM_LABELED_BUTTON3, CUSTOM_LABELED_BUTTON4,
            COMMON_LABELED_INPUT1, COMMON_LABELED_INPUT2, COMMON_LABELED_INPUT3, COMMON_LABELED_INPUT4,
            COMMON_TEXT_INPUT1, COMMON_TEXT_INPUT2, COMMON_TEXT_INPUT3, COMMON_TEXT_INPUT4,
            TEXT_AREA1, TEXT_AREA2, TEXT_AREA3, TEXT_AREA4,
            COMMON_CHECKBOX1, COMMON_CHECKBOX2, COMMON_CHECKBOX3, COMMON_CHECKBOX4,
            COMMON_LABELED_CHECKBOX1, COMMON_LABELED_CHECKBOX2, COMMON_LABELED_CHECKBOX3, COMMON_LABELED_CHECKBOX4,
            COMMON_LABELED_CHECKBOX5, COMMON_LABELED_CHECKBOX6, COMMON_LABELED_CHECKBOX7, COMMON_LABELED_CHECKBOX8,
            COMMON_RADIOBUTTON1, COMMON_RADIOBUTTON2, COMMON_RADIOBUTTON3, COMMON_RADIOBUTTON4,
            COMMON_LABELED_RADIOBUTTON1, COMMON_LABELED_RADIOBUTTON2, COMMON_LABELED_RADIOBUTTON3, COMMON_LABELED_RADIOBUTTON4,
            COMMON_LABELED_RADIOBUTTON5, COMMON_LABELED_RADIOBUTTON6, COMMON_LABELED_RADIOBUTTON7, COMMON_LABELED_RADIOBUTTON8,
            COMMON_LABELED_LINK1, COMMON_LABELED_LINK2, COMMON_LABELED_LINK3, COMMON_LABELED_LINK4,
            CUSTOM_LABELED_LINK1, CUSTOM_LABELED_LINK2, CUSTOM_LABELED_LINK3, CUSTOM_LABELED_LINK4,
            COMMON_LINK1, COMMON_LINK2, COMMON_LINK3, COMMON_LINK4
    );

    static List<MockWebElement> getFakeDOM() {
        return fakeMock;
    }
}
