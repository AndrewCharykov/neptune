package ru.tinkoff.qa.neptune.selenium.test.captors;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

import static java.time.Duration.ofSeconds;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.isA;
import static org.openqa.selenium.By.tagName;
import static ru.tinkoff.qa.neptune.selenium.functions.click.ClickActionSupplier.on;
import static ru.tinkoff.qa.neptune.selenium.functions.edit.EditActionSupplier.valueOfThe;
import static ru.tinkoff.qa.neptune.selenium.functions.searching.SearchSupplier.*;
import static ru.tinkoff.qa.neptune.selenium.test.FakeDOMModel.BUTTON_TAG;
import static ru.tinkoff.qa.neptune.selenium.test.captors.TestImageInjector.INJECTED;

public class WebDriverCaptorTest extends BaseCaptorTest {

    @Test
    public void clickOnElementPositiveTest() {
        seleniumSteps.click(on(webElement(tagName(BUTTON_TAG))));
        assertThat(INJECTED.size(), is(2));
        assertThat(INJECTED, hasEntry(isA(BufferedImage.class),
                equalTo("Screenshot taken from the element")));
        assertThat(INJECTED, hasEntry(isA(BufferedImage.class),
                equalTo("Browser screenshot")));
    }

    @Test
    public void clickOnElementNegativeTest() {
        try {
            seleniumSteps.click(on(webElement(tagName("fakeTag"))
                    .timeOut(ofSeconds(1))));
        } catch (NoSuchElementException ignored) {

        }
        assertThat(INJECTED.size(), is(2));
        assertThat(INJECTED.keySet(), contains(isA(BufferedImage.class), isA(BufferedImage.class)));
        assertThat(INJECTED.values(), contains("Browser screenshot", "Browser screenshot"));
    }

    @Test
    public void clickOnWidgetPositiveTest() {
        seleniumSteps.click(on(link()));
        assertThat(INJECTED.size(), is(2));
        assertThat(INJECTED, hasEntry(isA(BufferedImage.class),
                equalTo("Screenshot taken from the element")));
        assertThat(INJECTED, hasEntry(isA(BufferedImage.class),
                equalTo("Browser screenshot")));
    }

    @Test
    public void clickOnOWidgetNegativeTest() {
        try {
            seleniumSteps.click(on(link("Fake link")
                    .timeOut(ofSeconds(1))));
        } catch (NoSuchElementException ignored) {

        }
        assertThat(INJECTED.size(), is(2));
        assertThat(INJECTED.keySet(), contains(isA(BufferedImage.class), isA(BufferedImage.class)));
        assertThat(INJECTED.values(), contains("Browser screenshot", "Browser screenshot"));
    }

    @Test
    public void editWidgetPositiveTest() {
        seleniumSteps.edit(valueOfThe(flag(), true));
        assertThat(INJECTED.size(), is(2));
        assertThat(INJECTED, hasEntry(isA(BufferedImage.class),
                equalTo("Screenshot taken from the element")));
        assertThat(INJECTED, hasEntry(isA(BufferedImage.class),
                equalTo("Browser screenshot")));
    }

    @Test
    public void editOnOWidgetNegativeTest() {
        try {
            seleniumSteps.edit(valueOfThe(flag("Fake flag")
                            .timeOut(ofSeconds(1)),
                    true));
        } catch (NoSuchElementException ignored) {

        }
        assertThat(INJECTED.size(), is(2));
        assertThat(INJECTED.keySet(), contains(isA(BufferedImage.class), isA(BufferedImage.class)));
        assertThat(INJECTED.values(), contains("Browser screenshot", "Browser screenshot"));
    }
}