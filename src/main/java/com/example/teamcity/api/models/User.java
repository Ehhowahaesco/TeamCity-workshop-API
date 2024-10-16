package com.example.teamcity.api.models;

import com.example.teamcity.api.annotations.*;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends BaseModel {
    private String id;
    @Random
    private String username;
    @Random
    private String password;
    private Roles roles;
}

