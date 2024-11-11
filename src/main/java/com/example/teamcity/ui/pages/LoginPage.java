package com.example.teamcity.ui.pages;

import com.codeborne.selenide.*;
import com.example.teamcity.api.models.*;

import static com.codeborne.selenide.Selenide.$;
import static com.example.teamcity.ui.pages.BasePage.BASE_WAITING;
import static com.example.teamcity.ui.pages.ProjectPage.titleAllProjects;

public class LoginPage {
    private static String loginUrl = "/login.html";

    private SelenideElement inputUsername = $("#username");
    private SelenideElement inputPassword = $("#password");
    private SelenideElement inputSubmitLogin = $(".loginButton");

    public static LoginPage open(){
        return Selenide.open(loginUrl, LoginPage.class);
    }

    public ProjectsPage login(User user){
        inputUsername.val(user.getUsername());
        inputPassword.val(user.getPassword());
        inputSubmitLogin.click();
        titleAllProjects.should(Condition.appear, BASE_WAITING);

        return Selenide.page(ProjectsPage.class);

    }
}
