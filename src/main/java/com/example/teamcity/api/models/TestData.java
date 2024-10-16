package com.example.teamcity.api.models;

import lombok.*;

@Data
public class TestData {
    private Project project;
    private User user;
    private BuildType buildType;
}
