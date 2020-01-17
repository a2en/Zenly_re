package com.segment.analytics;

import android.text.TextUtils;
import com.segment.analytics.p326t.C11692b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.segment.analytics.d */
class C11624d {

    /* renamed from: a */
    final C11629e f30195a;

    /* renamed from: b */
    final String f30196b;

    /* renamed from: com.segment.analytics.d$a */
    static class C11625a extends C11627c {
        C11625a(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            super(httpURLConnection, inputStream, outputStream);
        }

        public void close() throws IOException {
            String str;
            try {
                int responseCode = this.f30197e.getResponseCode();
                if (responseCode < 300) {
                    super.close();
                    this.f30199g.close();
                    return;
                }
                str = C11692b.m30714b(C11692b.m30696a(this.f30197e));
                throw new C11628d(responseCode, this.f30197e.getResponseMessage(), str);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not read response body for rejected message: ");
                sb.append(e.toString());
                str = sb.toString();
            } catch (Throwable th) {
                super.close();
                this.f30199g.close();
                throw th;
            }
        }
    }

    /* renamed from: com.segment.analytics.d$b */
    static class C11626b extends C11627c {
        C11626b(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            super(httpURLConnection, inputStream, outputStream);
        }

        public void close() throws IOException {
            super.close();
            this.f30198f.close();
        }
    }

    /* renamed from: com.segment.analytics.d$c */
    static abstract class C11627c implements Closeable {

        /* renamed from: e */
        final HttpURLConnection f30197e;

        /* renamed from: f */
        final InputStream f30198f;

        /* renamed from: g */
        final OutputStream f30199g;

        C11627c(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            if (httpURLConnection != null) {
                this.f30197e = httpURLConnection;
                this.f30198f = inputStream;
                this.f30199g = outputStream;
                return;
            }
            throw new IllegalArgumentException("connection == null");
        }

        public void close() throws IOException {
            this.f30197e.disconnect();
        }
    }

    /* renamed from: com.segment.analytics.d$d */
    static class C11628d extends IOException {

        /* renamed from: e */
        final int f30200e;

        C11628d(int i, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP ");
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            sb.append(". Response: ");
            sb.append(str2);
            super(sb.toString());
            this.f30200e = i;
        }
    }

    C11624d(String str, C11629e eVar) {
        this.f30196b = str;
        this.f30195a = eVar;
    }

    /* renamed from: a */
    private static C11627c m30474a(HttpURLConnection httpURLConnection) throws IOException {
        return new C11626b(httpURLConnection, C11692b.m30696a(httpURLConnection), null);
    }

    /* renamed from: b */
    private static C11627c m30475b(HttpURLConnection httpURLConnection) throws IOException {
        OutputStream outputStream;
        if (TextUtils.equals("gzip", httpURLConnection.getRequestProperty("Content-Encoding"))) {
            outputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
        } else {
            outputStream = httpURLConnection.getOutputStream();
        }
        return new C11625a(httpURLConnection, null, outputStream);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11627c mo34291c() throws IOException {
        return m30475b(this.f30195a.mo34296d(this.f30196b));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11627c mo34289a() throws IOException {
        return m30475b(this.f30195a.mo34293a(this.f30196b));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11627c mo34290b() throws IOException {
        HttpURLConnection c = this.f30195a.mo34295c(this.f30196b);
        int responseCode = c.getResponseCode();
        if (responseCode == 200) {
            return m30474a(c);
        }
        c.disconnect();
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(responseCode);
        sb.append(": ");
        sb.append(c.getResponseMessage());
        throw new IOException(sb.toString());
    }
}
