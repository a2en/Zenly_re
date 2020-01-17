package retrofit2.p427m;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: retrofit2.m.n */
public @interface C13458n {
    String encoding() default "binary";

    String value() default "";
}
