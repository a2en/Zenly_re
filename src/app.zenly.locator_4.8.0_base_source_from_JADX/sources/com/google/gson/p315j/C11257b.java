package com.google.gson.p315j;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.j.b */
public @interface C11257b {
    boolean nullSafe() default true;

    Class<?> value();
}
