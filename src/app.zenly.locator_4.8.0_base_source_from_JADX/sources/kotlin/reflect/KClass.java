package kotlin.reflect;

import java.util.Collection;
import java.util.List;

public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {
    boolean equals(Object obj);

    Collection<KFunction<T>> getConstructors();

    Collection<KCallable<?>> getMembers();

    Collection<KClass<?>> getNestedClasses();

    T getObjectInstance();

    String getQualifiedName();

    List<KClass<? extends T>> getSealedSubclasses();

    String getSimpleName();

    List<KType> getSupertypes();

    List<KTypeParameter> getTypeParameters();

    C12976b getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isInner();

    boolean isInstance(Object obj);

    boolean isOpen();

    boolean isSealed();
}
