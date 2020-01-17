package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public interface SelectClause0 {
    <R> void registerSelectClause0(SelectInstance<? super R> selectInstance, Function1<? super Continuation<? super R>, ? extends Object> function1);
}
