package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.logging.C9543a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.drawee.backends.pipeline.info.a */
public class C9576a implements ImageOriginListener {

    /* renamed from: a */
    private final List<ImageOriginListener> f24802a;

    public C9576a(ImageOriginListener... imageOriginListenerArr) {
        this.f24802a = new ArrayList(imageOriginListenerArr.length);
        Collections.addAll(this.f24802a, imageOriginListenerArr);
    }

    /* renamed from: a */
    public synchronized void mo25784a(ImageOriginListener imageOriginListener) {
        this.f24802a.add(imageOriginListener);
    }

    /* renamed from: b */
    public synchronized void mo25785b(ImageOriginListener imageOriginListener) {
        this.f24802a.remove(imageOriginListener);
    }

    public synchronized void onImageLoaded(String str, int i, boolean z, String str2) {
        int size = this.f24802a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageOriginListener imageOriginListener = (ImageOriginListener) this.f24802a.get(i2);
            if (imageOriginListener != null) {
                try {
                    imageOriginListener.onImageLoaded(str, i, z, str2);
                } catch (Exception e) {
                    C9543a.m23318b("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable) e);
                }
            }
        }
    }
}
