package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public interface HashFunction {
    int bits();

    C10968a hashBytes(ByteBuffer byteBuffer);

    C10968a hashBytes(byte[] bArr);

    C10968a hashBytes(byte[] bArr, int i, int i2);

    C10968a hashInt(int i);

    C10968a hashLong(long j);

    <T> C10968a hashObject(T t, Funnel<? super T> funnel);

    C10968a hashString(CharSequence charSequence, Charset charset);

    C10968a hashUnencodedChars(CharSequence charSequence);

    Hasher newHasher();

    Hasher newHasher(int i);
}
