package kotlin.reflect;

public interface KProperty<R> extends KCallable<R> {

    public interface Accessor<R> {
        KProperty<R> getProperty();
    }

    public interface Getter<R> extends Accessor<R>, KFunction<R> {
    }

    Getter<R> getGetter();

    boolean isConst();

    boolean isLateinit();
}
