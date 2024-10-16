package com.example.teamcity.api.models;

import com.example.teamcity.api.annotations.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Role extends BaseModel {
    @Parameterizable
    @Builder.Default
    private String roleId = "SYSTEM_ADMIN";
    @Parameterizable
    @Builder.Default
    private String scope = "g";
}
