package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.jvm.internal.FunctionBase;

public interface FunctionN<R> extends Function<R>, FunctionBase<R> {
    int getArity();

    R invoke(Object... objArr);
}
