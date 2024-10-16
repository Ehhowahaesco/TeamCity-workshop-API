package com.example.teamcity.api.requests;

import com.example.teamcity.api.enums.*;
import com.example.teamcity.api.models.*;
import com.example.teamcity.api.requests.checked.*;
import io.restassured.specification.*;

import java.util.*;

public class CheckedRequests {
    private final EnumMap<Endpoint, CheckedBase<?>> requests = new EnumMap<>(Endpoint.class);

    public CheckedRequests(RequestSpecification spec) {
        for (var endpoint : Endpoint.values()) {
            requests.put(endpoint, new CheckedBase<>(spec, endpoint));
        }
    }

    public <T extends BaseModel> CheckedBase<T> getRequest(Endpoint endpoint) {
        return (CheckedBase<T>) requests.get(endpoint);
    }
}
