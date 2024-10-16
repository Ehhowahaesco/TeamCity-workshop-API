package com.example.teamcity.api.annotations;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

/**
 * Поля с этой аннотацией будут заполнятся рандомными данными
 */

public @interface Random {
}
