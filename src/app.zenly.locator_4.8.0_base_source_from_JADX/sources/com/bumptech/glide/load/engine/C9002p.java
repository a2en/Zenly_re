package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.p */
final class C9002p {

    /* renamed from: a */
    private final Map<Key, C8991k<?>> f23502a = new HashMap();

    /* renamed from: b */
    private final Map<Key, C8991k<?>> f23503b = new HashMap();

    C9002p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8991k<?> mo24507a(Key key, boolean z) {
        return (C8991k) m21655a(z).get(key);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24509b(Key key, C8991k<?> kVar) {
        Map a = m21655a(kVar.mo24486e());
        if (kVar.equals(a.get(key))) {
            a.remove(key);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24508a(Key key, C8991k<?> kVar) {
        m21655a(kVar.mo24486e()).put(key, kVar);
    }

    /* renamed from: a */
    private Map<Key, C8991k<?>> m21655a(boolean z) {
        return z ? this.f23503b : this.f23502a;
    }
}
