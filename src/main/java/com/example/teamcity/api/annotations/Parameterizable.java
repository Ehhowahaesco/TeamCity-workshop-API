package com.example.teamcity.api.annotations;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

/**
 * Поля с этой аннотацией будут заполняться переданным значением, если параметр передан.
 */

public @interface Parameterizable {
}
