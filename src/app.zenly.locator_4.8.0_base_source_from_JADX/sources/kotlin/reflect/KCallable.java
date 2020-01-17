package kotlin.reflect;

import java.util.List;
import java.util.Map;

public interface KCallable<R> extends KAnnotatedElement {
    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    String getName();

    List<KParameter> getParameters();

    KType getReturnType();

    List<KTypeParameter> getTypeParameters();

    C12976b getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
