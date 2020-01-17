package kotlinx.coroutines.flow;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;

public interface Flow<T> {
    Object collect(FlowCollector<? super T> flowCollector, Continuation<? super C12956q> continuation);
}
