package com.example.teamcity.ui.pages;

import com.codeborne.selenide.*;
import com.example.teamcity.api.models.*;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static String loginUrl = "/login.html";

    private SelenideElement inputUsername = $("#username");
    private SelenideElement inputPassword = $("#password");
   // private SelenideElement inputSubmitLogin = $("#submitLogin");

    private SelenideElement inputSubmitLogin = $(byName("submitLogin"));

    public static LoginPage open(){
        return Selenide.open(loginUrl, LoginPage.class);
    }

    public ProjectPage login(User user){
        inputUsername.val(user.getUsername());
        inputPassword.val(user.getPassword());
        inputSubmitLogin.click();

        return Selenide.page(ProjectPage.class);

    }
}
