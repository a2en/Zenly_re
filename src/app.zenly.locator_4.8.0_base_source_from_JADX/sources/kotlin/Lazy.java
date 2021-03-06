package kotlin;

public interface Lazy<T> {
    T getValue();

    boolean isInitialized();
}
