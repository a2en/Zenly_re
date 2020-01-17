package com.facebook.cache.common;

import com.facebook.common.util.C9556b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.cache.common.a */
public final class C9483a {
    /* renamed from: a */
    public static String m23132a(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof C9484b) {
                return m23134c((CacheKey) ((C9484b) cacheKey).mo25522a().get(0));
            }
            return m23134c(cacheKey);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static List<String> m23133b(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof C9484b) {
                List a = ((C9484b) cacheKey).mo25522a();
                ArrayList arrayList = new ArrayList(a.size());
                for (int i = 0; i < a.size(); i++) {
                    arrayList.add(m23134c((CacheKey) a.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(m23134c(cacheKey));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static String m23134c(CacheKey cacheKey) throws UnsupportedEncodingException {
        return C9556b.m23380a(cacheKey.getUriString().getBytes("UTF-8"));
    }
}
