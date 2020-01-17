package com.google.common.reflect;

import java.util.Map;

public interface TypeToInstanceMap<B> extends Map<C10980h<? extends B>, B> {
    <T extends B> T getInstance(C10980h<T> hVar);

    <T extends B> T getInstance(Class<T> cls);

    <T extends B> T putInstance(C10980h<T> hVar, T t);

    <T extends B> T putInstance(Class<T> cls, T t);
}
