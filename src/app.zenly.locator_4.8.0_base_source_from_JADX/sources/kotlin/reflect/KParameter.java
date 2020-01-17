package kotlin.reflect;

public interface KParameter extends KAnnotatedElement {

    /* renamed from: kotlin.reflect.KParameter$a */
    public enum C12974a {
    }

    int getIndex();

    C12974a getKind();

    String getName();

    KType getType();

    boolean isOptional();

    boolean isVararg();
}
