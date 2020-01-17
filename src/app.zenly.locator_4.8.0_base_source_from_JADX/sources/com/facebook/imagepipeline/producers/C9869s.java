package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.appsflyer.share.Constants;
import com.facebook.common.time.MonotonicClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.C9559e;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.producers.NetworkFetcher.Callback;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.facebook.imagepipeline.producers.s */
public class C9869s extends C9802c<C9872c> {

    /* renamed from: a */
    private int f25916a;

    /* renamed from: b */
    private final ExecutorService f25917b;

    /* renamed from: c */
    private final MonotonicClock f25918c;

    /* renamed from: com.facebook.imagepipeline.producers.s$a */
    class C9870a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C9872c f25919e;

        /* renamed from: f */
        final /* synthetic */ Callback f25920f;

        C9870a(C9872c cVar, Callback callback) {
            this.f25919e = cVar;
            this.f25920f = callback;
        }

        public void run() {
            C9869s.this.mo26681b(this.f25919e, this.f25920f);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.s$b */
    class C9871b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ Future f25922a;

        /* renamed from: b */
        final /* synthetic */ Callback f25923b;

        C9871b(C9869s sVar, Future future, Callback callback) {
            this.f25922a = future;
            this.f25923b = callback;
        }

        public void onCancellationRequested() {
            if (this.f25922a.cancel(false)) {
                this.f25923b.onCancellation();
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.s$c */
    public static class C9872c extends C9868r {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f25924f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f25925g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f25926h;

        public C9872c(Consumer<C9732e> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
        }
    }

    public C9869s(int i) {
        this((MonotonicClock) RealtimeSinceBootClock.get());
        this.f25916a = i;
    }

    /* renamed from: a */
    private static boolean m24591a(int i) {
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m24592b(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: a */
    public void fetch(C9872c cVar, Callback callback) {
        cVar.f25924f = this.f25918c.now();
        cVar.mo26671b().addCallbacks(new C9871b(this, this.f25917b.submit(new C9870a(cVar, callback)), callback));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26681b(com.facebook.imagepipeline.producers.C9869s.C9872c r5, com.facebook.imagepipeline.producers.NetworkFetcher.Callback r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.mo26677h()     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r2 = 5
            java.net.HttpURLConnection r1 = r4.m24590a(r1, r2)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            com.facebook.common.time.MonotonicClock r2 = r4.f25918c     // Catch:{ IOException -> 0x0027 }
            long r2 = r2.now()     // Catch:{ IOException -> 0x0027 }
            r5.f25925g = r2     // Catch:{ IOException -> 0x0027 }
            if (r1 == 0) goto L_0x001d
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ IOException -> 0x0027 }
            r5 = -1
            r6.onResponse(r0, r5)     // Catch:{ IOException -> 0x0027 }
        L_0x001d:
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            if (r1 == 0) goto L_0x003d
            goto L_0x003a
        L_0x0027:
            r5 = move-exception
            goto L_0x002e
        L_0x0029:
            r5 = move-exception
            r1 = r0
            goto L_0x003f
        L_0x002c:
            r5 = move-exception
            r1 = r0
        L_0x002e:
            r6.onFailure(r5)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            if (r1 == 0) goto L_0x003d
        L_0x003a:
            r1.disconnect()
        L_0x003d:
            return
        L_0x003e:
            r5 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.disconnect()
        L_0x004b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9869s.mo26681b(com.facebook.imagepipeline.producers.s$c, com.facebook.imagepipeline.producers.NetworkFetcher$Callback):void");
    }

    public C9872c createFetchState(Consumer<C9732e> consumer, ProducerContext producerContext) {
        return new C9872c(consumer, producerContext);
    }

    C9869s(MonotonicClock monotonicClock) {
        this.f25917b = Executors.newFixedThreadPool(3);
        this.f25918c = monotonicClock;
    }

    /* renamed from: a */
    private HttpURLConnection m24590a(Uri uri, int i) throws IOException {
        Uri uri2;
        String str;
        HttpURLConnection a = m24589a(uri);
        a.setConnectTimeout(this.f25916a);
        int responseCode = a.getResponseCode();
        if (m24592b(responseCode)) {
            return a;
        }
        if (m24591a(responseCode)) {
            String headerField = a.getHeaderField(Constants.HTTP_REDIRECT_URL_HEADER_FIELD);
            a.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i > 0 && uri2 != null && !uri2.getScheme().equals(scheme)) {
                return m24590a(uri2, i - 1);
            }
            if (i == 0) {
                str = m24588a("URL %s follows too many redirects", uri.toString());
            } else {
                str = m24588a("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(str);
        }
        a.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
    }

    /* renamed from: b */
    public void onFetchCompletion(C9872c cVar, int i) {
        cVar.f25926h = this.f25918c.now();
    }

    /* renamed from: a */
    static HttpURLConnection m24589a(Uri uri) throws IOException {
        return (HttpURLConnection) C9559e.m23395k(uri).openConnection();
    }

    /* renamed from: a */
    private static String m24588a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: a */
    public Map<String, String> getExtraMap(C9872c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f25925g - cVar.f25924f));
        hashMap.put("fetch_time", Long.toString(cVar.f25926h - cVar.f25925g));
        hashMap.put("total_time", Long.toString(cVar.f25926h - cVar.f25924f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }
}
