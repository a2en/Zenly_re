package kotlinx.coroutines.flow;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;

public interface FlowCollector<T> {
    Object emit(T t, Continuation<? super C12956q> continuation);
}
