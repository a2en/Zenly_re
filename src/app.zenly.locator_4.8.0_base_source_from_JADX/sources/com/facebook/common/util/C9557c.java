package com.facebook.common.util;

import com.facebook.common.internal.C9536j;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.util.c */
public class C9557c {
    /* renamed from: a */
    public static long m23381a(InputStream inputStream, long j) throws IOException {
        C9536j.m23271a(inputStream);
        C9536j.m23275a(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
