package com.example.teamcity.ui.pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$;

public class ProjectPage extends BasePage {
    private static final String PROJECT_URL = "/project/%s";

    public static SelenideElement titleAllProjects = $("span[class*='ProjectPageHeader']");

    public static ProjectPage open(String projectId) {

        return Selenide.open(PROJECT_URL.formatted(projectId), ProjectPage.class);
    }
}
