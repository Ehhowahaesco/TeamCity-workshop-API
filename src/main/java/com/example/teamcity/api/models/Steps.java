package com.example.teamcity.api.models;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Steps {
    private Integer count;
    private List<Step> step;
}
