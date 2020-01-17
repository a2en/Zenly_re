package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

public interface SelectClause2<P, Q> {
    <R> void registerSelectClause2(SelectInstance<? super R> selectInstance, P p, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}
