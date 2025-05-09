package com.example.teamcity.ui.pages.admin;

import com.codeborne.selenide.*;
import com.example.teamcity.ui.pages.*;
import static com.codeborne.selenide.Selenide.$;
import static com.example.teamcity.ui.pages.BuildTypePage.errorMessage;

public abstract class CreateBasePage extends BasePage {
    protected static final String CREATE_URL = "/admin/createObjectMenu.html?projectId=%s&showMode=%s";

    protected SelenideElement urlInput = $("#url");
    protected SelenideElement submitButton = $(Selectors.byAttribute("value", "Proceed"));
    protected SelenideElement buildTypeNameInput = $("#buildTypeName");
    protected SelenideElement connectionSuccessfulMessage = $(".connectionSuccessful");

    protected void baseCreateForm(String url) {
        urlInput.val(url);
        submitButton.click();

        connectionSuccessfulMessage.should(Condition.appear, BASE_WAITING);
    }

    protected void baseCreateFormIncorrectUrl(String url) {
        urlInput.val(url);
        submitButton.click();
        errorMessage.should(Condition.appear, BASE_WAITING);
    }
}
