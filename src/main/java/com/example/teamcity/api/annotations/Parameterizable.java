package com.example.teamcity.api.annotations;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

/**
 * Поля с этой аннотацией будут заполнятся переданным значением, если параметр передан.
 */

public @interface Parameterizable {
}
