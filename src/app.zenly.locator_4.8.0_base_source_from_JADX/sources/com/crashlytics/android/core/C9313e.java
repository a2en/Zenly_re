package com.crashlytics.android.core;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12195p;

/* renamed from: com.crashlytics.android.core.e */
class C9313e {

    /* renamed from: a */
    private static final AtomicLong f24171a = new AtomicLong(0);

    /* renamed from: b */
    private static String f24172b;

    public C9313e(C12195p pVar) {
        byte[] bArr = new byte[10];
        m22462c(bArr);
        m22460b(bArr);
        m22458a(bArr);
        String c = C12180h.m32266c(pVar.mo36086d());
        String a = C12180h.m32248a(bArr);
        f24172b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a.substring(0, 12), a.substring(12, 16), a.subSequence(16, 20), c.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private void m22458a(byte[] bArr) {
        byte[] b = m22461b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: b */
    private void m22460b(byte[] bArr) {
        byte[] b = m22461b(f24171a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: c */
    private void m22462c(byte[] bArr) {
        long time = new Date().getTime();
        long j = time / 1000;
        long j2 = time % 1000;
        byte[] a = m22459a(j);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m22461b(j2);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f24172b;
    }

    /* renamed from: b */
    private static byte[] m22461b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: a */
    private static byte[] m22459a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
}
