package com.github.toy.constructor.selenium.test.steps.enums;

public enum FrameIndexes {
    INDEX1(1),
    INDEX2(2),
    INDEX3(3);

    private final int index;

    FrameIndexes(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
