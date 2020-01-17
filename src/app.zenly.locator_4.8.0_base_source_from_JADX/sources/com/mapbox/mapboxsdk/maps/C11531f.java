package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.annotations.C11426d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mapbox.mapboxsdk.maps.f */
class C11531f {

    /* renamed from: a */
    private final Map<C11426d, Integer> f29869a = new HashMap();

    /* renamed from: b */
    private C11550m f29870b;

    /* renamed from: c */
    private int f29871c;

    /* renamed from: d */
    private int f29872d;

    C11531f(C11550m mVar) {
        this.f29870b = mVar;
    }

    /* renamed from: c */
    private void m30009c(C11426d dVar) {
        Bitmap a = dVar.mo33269a();
        this.f29870b.mo33698a(dVar.mo33270b(), a.getWidth(), a.getHeight(), dVar.mo33271c(), dVar.mo33272d());
    }

    /* renamed from: d */
    private void m30010d(C11426d dVar) {
        this.f29870b.mo33721e(dVar.mo33270b());
        this.f29869a.remove(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33814a(C11426d dVar) {
        return (int) (this.f29870b.mo33676a(dVar.mo33270b()) * ((double) this.f29870b.getPixelRatio()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33815b() {
        return this.f29871c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33813a() {
        return this.f29872d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33816b(C11426d dVar) {
        Integer num = (Integer) this.f29869a.get(dVar);
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() == 0) {
                m30010d(dVar);
            } else {
                m30008a(dVar, valueOf.intValue());
            }
        }
    }

    /* renamed from: a */
    private void m30008a(C11426d dVar, int i) {
        this.f29869a.put(dVar, Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33817c() {
        for (C11426d c : this.f29869a.keySet()) {
            m30009c(c);
        }
    }
}
