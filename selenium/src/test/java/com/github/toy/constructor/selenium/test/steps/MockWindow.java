package com.github.toy.constructor.selenium.test.steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class MockWindow implements WebDriver.Window {
    private final MockWebDriver driver;
    private Dimension dimension;
    private Point point;

    public MockWindow(MockWebDriver driver, Dimension dimension, Point size) {
        this.driver = driver;
        this.dimension = dimension;
        this.point = size;
    }

    @Override
    public void setSize(Dimension targetSize) {
        dimension = targetSize;
    }

    @Override
    public void setPosition(Point targetPosition) {
        point = targetPosition;
    }

    @Override
    public Dimension getSize() {
        return dimension;
    }

    @Override
    public Point getPosition() {
        return point;
    }

    @Override
    public void maximize() {
        //TODO does nothing for now
    }

    @Override
    public void fullscreen() {
        //TODO does nothing for now
    }
}
