package com.phuong.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    public static void main(String[] args) {
        LOGGER.info("test logback .....");
    }
}
