package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.z */
public class C9883z extends C9879x {

    /* renamed from: c */
    private final Resources f25949c;

    public C9883z(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        this.f25949c = resources;
    }

    /* renamed from: b */
    private int m24640b(C9884a aVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f25949c.openRawResourceFd(m24641c(aVar));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (NotFoundException unused2) {
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

    /* renamed from: c */
    private static int m24641c(C9884a aVar) {
        return Integer.parseInt(aVar.mo26743p().getPath().substring(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        return mo26688b(this.f25949c.openRawResource(m24641c(aVar)), m24640b(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "LocalResourceFetchProducer";
    }
}
