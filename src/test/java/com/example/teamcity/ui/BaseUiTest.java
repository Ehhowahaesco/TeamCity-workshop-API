package com.example.teamcity.ui;


import com.codeborne.selenide.*;
import com.example.teamcity.*;
import com.codeborne.selenide.Configuration;
import com.example.teamcity.api.config.Config;
import com.example.teamcity.api.enums.*;
import com.example.teamcity.api.models.*;
import com.example.teamcity.ui.pages.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import java.util.*;

public class BaseUiTest extends BaseTest {
    @BeforeSuite(alwaysRun = true)
    public void setUpUiTest(){
        Configuration.browser = Config.getProperty("browser");
        Configuration.baseUrl = "http://" + Config.getProperty("hostUi") + Config.getProperty("port");
        Configuration.remote = Config.getProperty("remote");
        Configuration.browserSize = Config.getProperty("browserSize");

        Configuration.browserCapabilities.setCapability("selenoid:options",
                Map.of("enableVNC", true,
                        "enableLog", true));

    }

    protected void loginAs(User user) {
        superUserCheckRequests.getRequest(Endpoint.USERS).create(testData.getUser());
        LoginPage.open().login(testData.getUser());
    }

    @AfterMethod(alwaysRun = true)
    public void closeWebDriver(){
        Selenide.closeWebDriver();
    }
}
