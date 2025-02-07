package com.example.teamcity.api.requests;

import io.restassured.specification.RequestSpecification;
import com.example.teamcity.api.enums.Endpoint;


/**
 * Request - это класс, описывающий меняющиеся параметры запроса, такие как:
 * спецификация, эндпоинт (relative URL, model)
 */
public class Request {
    protected final RequestSpecification spec;
    protected final Endpoint endpoint;

    public Request(RequestSpecification spec, Endpoint endpoint) {
        this.spec = spec;
        this.endpoint = endpoint;
    }
}
