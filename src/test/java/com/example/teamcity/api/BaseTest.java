package com.example.teamcity.api;

import com.example.teamcity.api.generators.*;
import com.example.teamcity.api.models.*;
import com.example.teamcity.api.requests.*;
import com.example.teamcity.api.spec.*;
import org.testng.annotations.*;
import org.testng.asserts.*;

import static com.example.teamcity.api.generators.TestDataGenerator.generate;

public class BaseTest {
    protected SoftAssert softy;
    protected CheckedRequests superUserCheckRequests = new CheckedRequests(Specifications.superUserSpec());
    protected TestData testData;

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(){
        softy = new SoftAssert();
        testData = generate();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(){
        softy.assertAll();
        TestDataStorage.getStorage().deleteCreatedEntities();
    }
}
