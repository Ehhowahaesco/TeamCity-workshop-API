package com.example.teamcity.ui;

import com.example.teamcity.ui.pages.admin.CreateBuildTypePage;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

@Test(groups = {"Regression"})
public class CreateBuildTypeTest extends BaseUiTest {


    @Test(description = "User should be able to create build type", groups = {"Positive"})
    public void userCreateBuildType() {
        loginAsForBuildType();

        CreateBuildTypePage.open(testData.getProject().getId())
                .createForm(REPO_URL)
                .setupBuildType()
                .displaySuccessVerification();
    }

    @Test(description = "User not be able to create build type with incorrect repository url", groups = {"Negative"})
    public void userCreateBuildTypeWithoutName() {
        loginAsForBuildType();

        CreateBuildTypePage.open(testData.getProject().getId())
                .createIncorrectForm(INCORRECT_REPO_URL);
    }

}
