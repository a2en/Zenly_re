package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.squareup.picasso.j */
public class C11877j implements Cache {

    /* renamed from: a */
    final LinkedHashMap<String, Bitmap> f30766a;

    /* renamed from: b */
    private final int f30767b;

    /* renamed from: c */
    private int f30768c;

    /* renamed from: d */
    private int f30769d;

    /* renamed from: e */
    private int f30770e;

    /* renamed from: f */
    private int f30771f;

    /* renamed from: g */
    private int f30772g;

    public C11877j(Context context) {
        this(C11851a0.m31098a(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31192a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f30768c     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f30766a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f30768c     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f30768c     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f30766a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f30766a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f30766a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.f30768c     // Catch:{ all -> 0x0071 }
            int r0 = com.squareup.picasso.C11851a0.m31100a(r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.f30768c = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.f30770e     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.f30770e = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C11877j.m31192a(int):void");
    }

    public final synchronized void clear() {
        mo35118a();
    }

    public final synchronized void clearKeyUri(String str) {
        int length = str.length();
        Iterator it = this.f30766a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            String str2 = (String) entry.getKey();
            Bitmap bitmap = (Bitmap) entry.getValue();
            int indexOf = str2.indexOf(10);
            if (indexOf == length && str2.substring(0, indexOf).equals(str)) {
                it.remove();
                this.f30768c -= C11851a0.m31100a(bitmap);
                z = true;
            }
        }
        if (z) {
            m31192a(this.f30767b);
        }
    }

    public Bitmap get(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = (Bitmap) this.f30766a.get(str);
                if (bitmap != null) {
                    this.f30771f++;
                    return bitmap;
                }
                this.f30772g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int maxSize() {
        return this.f30767b;
    }

    public void set(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f30769d++;
            this.f30768c += C11851a0.m31100a(bitmap);
            Bitmap bitmap2 = (Bitmap) this.f30766a.put(str, bitmap);
            if (bitmap2 != null) {
                this.f30768c -= C11851a0.m31100a(bitmap2);
            }
        }
        m31192a(this.f30767b);
    }

    public final synchronized int size() {
        return this.f30768c;
    }

    public C11877j(int i) {
        if (i > 0) {
            this.f30767b = i;
            this.f30766a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    /* renamed from: a */
    public final void mo35118a() {
        m31192a(-1);
    }
}
