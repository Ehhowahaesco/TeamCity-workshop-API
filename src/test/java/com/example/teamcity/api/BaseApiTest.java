package com.example.teamcity.api;

import com.example.teamcity.*;
import com.example.teamcity.api.models.AuthModules;
import com.example.teamcity.api.models.ServerAuthSettings;
import com.example.teamcity.api.requests.ServerAuthRequest;
import com.example.teamcity.api.spec.Specifications;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.example.teamcity.api.generators.TestDataGenerator.generate;

public class BaseApiTest extends BaseTest {
    private final ServerAuthRequest serverAuthRequest = new ServerAuthRequest(Specifications.superUserSpec());
    private AuthModules authModules;
    protected boolean perProjectPermissions;

    @BeforeSuite(alwaysRun = true)
    public void setUpServerAuthSettings(){
        perProjectPermissions = serverAuthRequest.read().getPerProjectPermissions();

        authModules = generate(AuthModules.class);
        //Обновляем значение на perProjectPermissions на true
        serverAuthRequest.update(ServerAuthSettings.builder()
                .perProjectPermissions(true)
                .modules(authModules)
                .build());
    }
    @AfterSuite(alwaysRun = true)
    public void cleanUpServerAuthSettings(){
        serverAuthRequest.update(ServerAuthSettings.builder()
                .perProjectPermissions(perProjectPermissions)
                .modules(authModules)
                .build());
    }
}
