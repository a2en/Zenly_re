package kotlin.reflect;

import java.util.List;

public interface KType extends KAnnotatedElement {
    List<Object> getArguments();

    KClassifier getClassifier();

    boolean isMarkedNullable();
}
