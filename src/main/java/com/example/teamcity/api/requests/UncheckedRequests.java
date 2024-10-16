package com.example.teamcity.api.requests;

import com.example.teamcity.api.enums.*;
import com.example.teamcity.api.requests.unchecked.*;
import io.restassured.specification.*;

import java.util.*;

public class UncheckedRequests {
    private final EnumMap<Endpoint, UncheckedBase> requests = new EnumMap<>(Endpoint.class);

    public UncheckedRequests(RequestSpecification spec) {
        for (var endpoint : Endpoint.values()) {
            requests.put(endpoint, new UncheckedBase(spec, endpoint));
        }
    }

    public UncheckedBase getRequest(Endpoint endpoint) {
        return requests.get(endpoint);
    }
}
