package com.example.teamcity.api.generators;

import org.apache.commons.lang3.*;

public final class RandomData {
    private static final String TEXT_PREFIX = "test_";
    private static final int MAX_LENGTH = 10;

    public static String getString() {
        return TEXT_PREFIX + RandomStringUtils.randomAlphabetic(MAX_LENGTH);
    }

    public static String getString(int length) {
        return TEXT_PREFIX + RandomStringUtils.randomAlphabetic(Math.max(length - TEXT_PREFIX.length(), MAX_LENGTH));
    }
}
