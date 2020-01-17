package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

public interface ResourceDecoder<T, Z> {
    Resource<Z> decode(T t, int i, int i2, C9011f fVar) throws IOException;

    boolean handles(T t, C9011f fVar) throws IOException;
}
