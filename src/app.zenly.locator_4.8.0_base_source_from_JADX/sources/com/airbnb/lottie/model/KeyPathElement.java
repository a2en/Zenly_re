package com.airbnb.lottie.model;

import com.airbnb.lottie.value.C8661c;
import java.util.List;

public interface KeyPathElement {
    <T> void addValueCallback(T t, C8661c<T> cVar);

    void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2);
}
