package com.example.teamcity.ui.pages.admin;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import static com.example.teamcity.ui.pages.BuildTypePage.successfulBuild;

public class CreateBuildTypePage extends CreateBasePage {
    private static final String PROJECT_SHOW_MODE = "createBuildTypeMenu";


    public static CreateBuildTypePage open(String projectId){
        return Selenide.open(CREATE_URL.formatted(projectId, PROJECT_SHOW_MODE), CreateBuildTypePage.class);
    }

    public CreateBuildTypePage createForm(String url){
        baseCreateForm(url);
        return this;
    }

    public void createIncorrectForm(String url){
        baseCreateFormIncorrectUrl(url);
    }

    public CreateBuildTypePage setupBuildType(){
        submitButton.click();
        return this;
    }

    public void displaySuccessVerification(){
        successfulBuild.should(Condition.appear, BASE_WAITING);
    }
}
