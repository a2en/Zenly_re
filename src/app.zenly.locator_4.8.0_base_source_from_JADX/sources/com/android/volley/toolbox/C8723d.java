package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.android.volley.toolbox.d */
public class C8723d {

    /* renamed from: e */
    protected static final Comparator<byte[]> f22476e = new C8724a();

    /* renamed from: a */
    private final List<byte[]> f22477a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f22478b = new ArrayList(64);

    /* renamed from: c */
    private int f22479c = 0;

    /* renamed from: d */
    private final int f22480d;

    /* renamed from: com.android.volley.toolbox.d$a */
    class C8724a implements Comparator<byte[]> {
        C8724a() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C8723d(int i) {
        this.f22480d = i;
    }

    /* renamed from: a */
    public synchronized byte[] mo23593a(int i) {
        for (int i2 = 0; i2 < this.f22478b.size(); i2++) {
            byte[] bArr = (byte[]) this.f22478b.get(i2);
            if (bArr.length >= i) {
                this.f22479c -= bArr.length;
                this.f22478b.remove(i2);
                this.f22477a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo23592a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f22480d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f22477a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f22478b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f22476e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f22478b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f22479c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f22479c = r0     // Catch:{ all -> 0x002b }
            r2.m20531a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C8723d.mo23592a(byte[]):void");
    }

    /* renamed from: a */
    private synchronized void m20531a() {
        while (this.f22479c > this.f22480d) {
            byte[] bArr = (byte[]) this.f22477a.remove(0);
            this.f22478b.remove(bArr);
            this.f22479c -= bArr.length;
        }
    }
}
