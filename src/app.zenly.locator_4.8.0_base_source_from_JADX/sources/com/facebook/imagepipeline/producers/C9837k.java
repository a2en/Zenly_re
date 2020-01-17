package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.executors.C9512a;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.facebook.imagepipeline.producers.k */
public class C9837k extends C9879x {
    public C9837k(PooledByteBufferFactory pooledByteBufferFactory) {
        super(C9512a.m23227a(), pooledByteBufferFactory);
    }

    /* renamed from: b */
    static boolean m24485b(String str) {
        String str2 = ";";
        if (!str.contains(str2)) {
            return false;
        }
        String[] split = str.split(str2);
        return split[split.length - 1].equals("base64");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        byte[] a = m24484a(aVar.mo26743p().toString());
        return mo26687a(new ByteArrayInputStream(a), a.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "DataFetchProducer";
    }

    /* renamed from: a */
    static byte[] m24484a(String str) {
        C9536j.m23275a(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (m24485b(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        return Uri.decode(substring).getBytes();
    }
}
