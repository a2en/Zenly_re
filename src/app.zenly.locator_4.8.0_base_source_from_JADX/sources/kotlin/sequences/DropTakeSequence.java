package kotlin.sequences;

public interface DropTakeSequence<T> extends Sequence<T> {
    Sequence<T> drop(int i);

    Sequence<T> take(int i);
}
