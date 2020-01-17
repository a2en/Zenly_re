package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WireField {

    public enum Label {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED;

        /* access modifiers changed from: 0000 */
        public boolean isOneOf() {
            return this == ONE_OF;
        }

        /* access modifiers changed from: 0000 */
        public boolean isPacked() {
            return this == PACKED;
        }

        /* access modifiers changed from: 0000 */
        public boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }
    }

    String adapter();

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    boolean redacted() default false;

    int tag();
}
