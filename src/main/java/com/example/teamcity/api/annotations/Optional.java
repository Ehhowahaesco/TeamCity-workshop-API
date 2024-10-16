package com.example.teamcity.api.annotations;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

/**
 * Поля с этой аннотацией не будут генерироваться рандомным или параметризированным значениям.
 * Необходимо указывать значение вручную
 */

public @interface Optional {
}
