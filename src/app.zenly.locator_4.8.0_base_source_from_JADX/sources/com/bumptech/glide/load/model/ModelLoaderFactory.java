package com.bumptech.glide.load.model;

public interface ModelLoaderFactory<T, Y> {
    ModelLoader<T, Y> build(C9068i iVar);

    void teardown();
}
