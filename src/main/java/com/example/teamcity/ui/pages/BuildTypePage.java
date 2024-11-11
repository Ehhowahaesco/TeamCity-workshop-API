package com.example.teamcity.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BuildTypePage extends BasePage {
    private static final String PROJECT_URL = "/project/%s";
    public static SelenideElement successfulBuild = $("#unprocessed_objectsCreated");
    public static SelenideElement errorMessage = $("#error_url");

    public static BuildTypePage open(String projectId) {
        return Selenide.open(PROJECT_URL.formatted(projectId), BuildTypePage.class);
    }
}
