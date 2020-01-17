package dagger.android;

public final class DispatchingAndroidInjector<T> implements AndroidInjector<T> {

    public static final class InvalidInjectorBindingException extends RuntimeException {
    }
}
