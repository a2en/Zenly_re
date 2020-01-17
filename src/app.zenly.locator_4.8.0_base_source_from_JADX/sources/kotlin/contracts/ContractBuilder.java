package kotlin.contracts;

import kotlin.Function;

public interface ContractBuilder {
    <R> CallsInPlace callsInPlace(Function<? extends R> function, C12862a aVar);

    Returns returns();

    Returns returns(Object obj);

    ReturnsNotNull returnsNotNull();
}
