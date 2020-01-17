package javax.annotation.meta;

import java.lang.annotation.Annotation;

public interface TypeQualifierValidator<A extends Annotation> {
    C12811a forConstantValue(A a, Object obj);
}
