package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.internal.firebase_messaging.C10459i;
import com.google.android.gms.internal.firebase_messaging.C10462l;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10697f;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.g */
final class C11108g implements Closeable {

    /* renamed from: e */
    private final URL f28799e;

    /* renamed from: f */
    private C10693c<Bitmap> f28800f;

    /* renamed from: g */
    private volatile InputStream f28801g;

    private C11108g(URL url) {
        this.f28799e = url;
    }

    /* renamed from: a */
    public static C11108g m28608a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C11108g(new URL(str));
        } catch (MalformedURLException unused) {
            String str2 = "Not downloading image, bad URL: ";
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        m28609a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (r0 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        m28609a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo32355b() throws java.io.IOException {
        /*
            r7 = this;
            java.net.URL r0 = r7.f28799e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Starting download of: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "FirebaseMessaging"
            android.util.Log.i(r1, r0)
            java.net.URL r0 = r7.f28799e     // Catch:{ IOException -> 0x00ae }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00ae }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x00ae }
            r2 = 1048576(0x100000, double:5.180654E-318)
            java.io.InputStream r2 = com.google.android.gms.internal.firebase_messaging.C10458h.m26843a(r0, r2)     // Catch:{ all -> 0x00a5 }
            r7.f28801g = r0     // Catch:{ all -> 0x009e }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x0074
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x006a
            java.net.URL r4 = r7.f28799e     // Catch:{ all -> 0x009e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009e }
            int r5 = r5.length()     // Catch:{ all -> 0x009e }
            int r5 = r5 + 31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r6.<init>(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "Successfully downloaded image: "
            r6.append(r5)     // Catch:{ all -> 0x009e }
            r6.append(r4)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x009e }
            android.util.Log.d(r1, r4)     // Catch:{ all -> 0x009e }
        L_0x006a:
            r4 = 0
            m28609a(r4, r2)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0073
            m28609a(r4, r0)     // Catch:{ IOException -> 0x00ae }
        L_0x0073:
            return r3
        L_0x0074:
            java.net.URL r3 = r7.f28799e     // Catch:{ all -> 0x009e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x009e }
            int r4 = r4.length()     // Catch:{ all -> 0x009e }
            int r4 = r4 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r5.<init>(r4)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Failed to decode image: "
            r5.append(r4)     // Catch:{ all -> 0x009e }
            r5.append(r3)     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009e }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x009e }
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x009e }
            r4.<init>(r3)     // Catch:{ all -> 0x009e }
            throw r4     // Catch:{ all -> 0x009e }
        L_0x009e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r4 = move-exception
            m28609a(r3, r2)     // Catch:{ all -> 0x00a5 }
            throw r4     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r3 = move-exception
            if (r0 == 0) goto L_0x00ad
            m28609a(r2, r0)     // Catch:{ IOException -> 0x00ae }
        L_0x00ad:
            throw r3     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            java.net.URL r2 = r7.f28799e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r3 = r3 + 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to download image: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C11108g.mo32355b():android.graphics.Bitmap");
    }

    public final void close() {
        C10459i.m26844a(this.f28801g);
    }

    /* renamed from: a */
    public final void mo32354a(Executor executor) {
        this.f28800f = C10697f.m27262a(executor, (Callable<TResult>) new C11107f<TResult>(this));
    }

    /* renamed from: a */
    public final C10693c<Bitmap> mo32353a() {
        C10693c<Bitmap> cVar = this.f28800f;
        C10123l.m25505a(cVar);
        return cVar;
    }

    /* renamed from: a */
    private static /* synthetic */ void m28609a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C10462l.m26847a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }
}
