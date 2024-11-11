package com.example.teamcity.api.models;

import com.example.teamcity.api.annotations.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class Project extends BaseModel {
    @Random
    private String id;
    @Random
    private String name;
    private String locator;
}
