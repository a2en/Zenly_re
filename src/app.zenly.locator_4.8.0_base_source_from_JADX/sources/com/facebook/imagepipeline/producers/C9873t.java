package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.t */
public class C9873t extends C9879x {

    /* renamed from: c */
    private final AssetManager f25927c;

    public C9873t(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        this.f25927c = assetManager;
    }

    /* renamed from: b */
    private static String m24603b(C9884a aVar) {
        return aVar.mo26743p().getPath().substring(1);
    }

    /* renamed from: c */
    private int m24604c(C9884a aVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f25927c.openFd(m24603b(aVar));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } finally {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        return mo26688b(this.f25927c.open(m24603b(aVar), 2), m24604c(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "LocalAssetFetchProducer";
    }
}
