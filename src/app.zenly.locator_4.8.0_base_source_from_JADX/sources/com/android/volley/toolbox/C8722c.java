package com.android.volley.toolbox;

import com.android.volley.C8713d;
import com.android.volley.C8716g;
import com.android.volley.Cache.C8702a;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: com.android.volley.toolbox.c */
public class C8722c implements Network {

    /* renamed from: c */
    protected static final boolean f22473c = C8716g.f22461b;

    /* renamed from: a */
    private final C8721b f22474a;

    /* renamed from: b */
    protected final C8723d f22475b;

    @Deprecated
    public C8722c(HttpStack httpStack) {
        this(httpStack, new C8723d(4096));
    }

    /* renamed from: a */
    private void m20528a(long j, Request<?> request, byte[] bArr, int i) {
        if (f22473c || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            C8716g.m20507b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r15 = null;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        r19 = r1;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        r19 = r1;
        r12 = null;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c1, code lost:
        r0 = r12.mo23609d();
        com.android.volley.C8716g.m20508c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r29.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r15 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r13 = new com.android.volley.C8715f(r0, r15, false, android.os.SystemClock.elapsedRealtime() - r9, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        if (r0 == 401) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        if (r0 < 400) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        throw new com.android.volley.ClientError(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        if (r0 < 500) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (r29.shouldRetryServerErrors() != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        m20529a("server", r8, new com.android.volley.ServerError(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        throw new com.android.volley.ServerError(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0128, code lost:
        throw new com.android.volley.ServerError(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        m20529a("auth", r8, new com.android.volley.AuthFailureError(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0135, code lost:
        m20529a("network", r8, new com.android.volley.NetworkError());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0146, code lost:
        throw new com.android.volley.NoConnectionError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0147, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0148, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Bad URL ");
        r2.append(r29.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0162, code lost:
        throw new java.lang.RuntimeException(r2.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0163, code lost:
        m20529a("socket", r8, new com.android.volley.TimeoutError());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0147 A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0141 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.C8715f performRequest(com.android.volley.Request<?> r29) throws com.android.volley.VolleyError {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            long r9 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r1 = java.util.Collections.emptyList()
            r11 = 0
            r2 = 0
            com.android.volley.Cache$a r0 = r29.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ba }
            java.util.Map r0 = r7.m20527a(r0)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ba }
            com.android.volley.toolbox.b r3 = r7.f22474a     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ba }
            com.android.volley.toolbox.h r12 = r3.mo23585a(r8, r0)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ba }
            int r14 = r12.mo23609d()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00b5 }
            java.util.List r13 = r12.mo23608c()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00b5 }
            r0 = 304(0x130, float:4.26E-43)
            if (r14 != r0) goto L_0x0063
            com.android.volley.Cache$a r0 = r29.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            if (r0 != 0) goto L_0x0043
            com.android.volley.f r0 = new com.android.volley.f     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            r16 = 304(0x130, float:4.26E-43)
            r17 = 0
            r18 = 1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            long r19 = r3 - r9
            r15 = r0
            r21 = r13
            r15.<init>(r16, r17, r18, r19, r21)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            return r0
        L_0x0043:
            java.util.List r27 = m20526a(r13, r0)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            com.android.volley.f r1 = new com.android.volley.f     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            r22 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f22397a     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            r24 = 1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            long r25 = r3 - r9
            r21 = r1
            r23 = r0
            r21.<init>(r22, r23, r24, r25, r27)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            return r1
        L_0x005d:
            r0 = move-exception
            r15 = r2
            r19 = r13
            goto L_0x00bf
        L_0x0063:
            java.io.InputStream r0 = r12.mo23606a()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00b2 }
            if (r0 == 0) goto L_0x0072
            int r1 = r12.mo23607b()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            byte[] r0 = r7.m20530a(r0, r1)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x005d }
            goto L_0x0074
        L_0x0072:
            byte[] r0 = new byte[r11]     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00b2 }
        L_0x0074:
            r20 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ab }
            long r2 = r0 - r9
            r1 = r28
            r4 = r29
            r5 = r20
            r6 = r14
            r1.m20528a(r2, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ab }
            r0 = 200(0xc8, float:2.8E-43)
            if (r14 < r0) goto L_0x00a2
            r0 = 299(0x12b, float:4.19E-43)
            if (r14 > r0) goto L_0x00a2
            com.android.volley.f r0 = new com.android.volley.f     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ab }
            r16 = 0
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00ab }
            long r17 = r1 - r9
            r1 = r13
            r13 = r0
            r15 = r20
            r19 = r1
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00a9 }
            return r0
        L_0x00a2:
            r1 = r13
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00a9 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00a9 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0163, MalformedURLException -> 0x0147, IOException -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            goto L_0x00ad
        L_0x00ab:
            r0 = move-exception
            r1 = r13
        L_0x00ad:
            r19 = r1
            r15 = r20
            goto L_0x00bf
        L_0x00b2:
            r0 = move-exception
            r1 = r13
            goto L_0x00b6
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            r19 = r1
            r15 = r2
            goto L_0x00bf
        L_0x00ba:
            r0 = move-exception
            r19 = r1
            r12 = r2
            r15 = r12
        L_0x00bf:
            if (r12 == 0) goto L_0x0141
            int r0 = r12.mo23609d()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r11] = r2
            r2 = 1
            java.lang.String r3 = r29.getUrl()
            r1[r2] = r3
            java.lang.String r2 = "Unexpected response code %d for %s"
            com.android.volley.C8716g.m20508c(r2, r1)
            if (r15 == 0) goto L_0x0135
            com.android.volley.f r1 = new com.android.volley.f
            r16 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r17 = r2 - r9
            r13 = r1
            r14 = r0
            r13.<init>(r14, r15, r16, r17, r19)
            r2 = 401(0x191, float:5.62E-43)
            if (r0 == r2) goto L_0x0129
            r2 = 403(0x193, float:5.65E-43)
            if (r0 != r2) goto L_0x00f4
            goto L_0x0129
        L_0x00f4:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x0103
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            com.android.volley.ClientError r0 = new com.android.volley.ClientError
            r0.<init>(r1)
            throw r0
        L_0x0103:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x0123
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x0123
            boolean r0 = r29.shouldRetryServerErrors()
            if (r0 == 0) goto L_0x011d
            com.android.volley.ServerError r0 = new com.android.volley.ServerError
            r0.<init>(r1)
            java.lang.String r1 = "server"
            m20529a(r1, r8, r0)
            goto L_0x0008
        L_0x011d:
            com.android.volley.ServerError r0 = new com.android.volley.ServerError
            r0.<init>(r1)
            throw r0
        L_0x0123:
            com.android.volley.ServerError r0 = new com.android.volley.ServerError
            r0.<init>(r1)
            throw r0
        L_0x0129:
            com.android.volley.AuthFailureError r0 = new com.android.volley.AuthFailureError
            r0.<init>(r1)
            java.lang.String r1 = "auth"
            m20529a(r1, r8, r0)
            goto L_0x0008
        L_0x0135:
            com.android.volley.NetworkError r0 = new com.android.volley.NetworkError
            r0.<init>()
            java.lang.String r1 = "network"
            m20529a(r1, r8, r0)
            goto L_0x0008
        L_0x0141:
            com.android.volley.NoConnectionError r1 = new com.android.volley.NoConnectionError
            r1.<init>(r0)
            throw r1
        L_0x0147:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bad URL "
            r2.append(r3)
            java.lang.String r3 = r29.getUrl()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0163:
            com.android.volley.TimeoutError r0 = new com.android.volley.TimeoutError
            r0.<init>()
            java.lang.String r1 = "socket"
            m20529a(r1, r8, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C8722c.performRequest(com.android.volley.Request):com.android.volley.f");
    }

    @Deprecated
    public C8722c(HttpStack httpStack, C8723d dVar) {
        this.f22474a = new C8720a(httpStack);
        this.f22475b = dVar;
    }

    public C8722c(C8721b bVar) {
        this(bVar, new C8723d(4096));
    }

    public C8722c(C8721b bVar, C8723d dVar) {
        this.f22474a = bVar;
        this.f22475b = dVar;
    }

    /* renamed from: a */
    private static void m20529a(String str, Request<?> request, VolleyError volleyError) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
            throw e;
        }
    }

    /* renamed from: a */
    private Map<String, String> m20527a(C8702a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f22398b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = aVar.f22400d;
        if (j > 0) {
            hashMap.put("If-Modified-Since", C8730g.m20563a(j));
        }
        return hashMap;
    }

    /* renamed from: a */
    private byte[] m20530a(InputStream inputStream, int i) throws IOException, ServerError {
        C8736m mVar = new C8736m(this.f22475b, i);
        String str = "Error occurred when closing InputStream";
        byte[] bArr = null;
        if (inputStream != null) {
            try {
                bArr = this.f22475b.mo23593a(1024);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    mVar.write(bArr, 0, read);
                }
                byte[] byteArray = mVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        C8716g.m20509d(str, new Object[0]);
                    }
                }
                return byteArray;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        C8716g.m20509d(str, new Object[0]);
                    }
                }
                this.f22475b.mo23592a(bArr);
                mVar.close();
            }
        } else {
            throw new ServerError();
        }
    }

    /* renamed from: a */
    private static List<C8713d> m20526a(List<C8713d> list, C8702a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C8713d a : list) {
                treeSet.add(a.mo23571a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C8713d> list2 = aVar.f22404h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C8713d dVar : aVar.f22404h) {
                    if (!treeSet.contains(dVar.mo23571a())) {
                        arrayList.add(dVar);
                    }
                }
            }
        } else if (!aVar.f22403g.isEmpty()) {
            for (Entry entry : aVar.f22403g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C8713d((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }
}
