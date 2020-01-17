package com.airbnb.lottie.p286o;

import android.content.Context;
import androidx.core.util.C0603e;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8507d;
import com.airbnb.lottie.C8532g;
import com.airbnb.lottie.p289q.C8654d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.o.c */
public class C8606c {

    /* renamed from: a */
    private final Context f22130a;

    /* renamed from: b */
    private final String f22131b;

    /* renamed from: c */
    private final C8605b f22132c;

    private C8606c(Context context, String str) {
        this.f22130a = context.getApplicationContext();
        this.f22131b = str;
        this.f22132c = new C8605b(this.f22130a, str);
    }

    /* renamed from: a */
    public static C8532g<C8506c> m20007a(Context context, String str) {
        return new C8606c(context, str).mo23223a();
    }

    /* renamed from: b */
    private C8506c m20009b() {
        C8532g gVar;
        C0603e a = this.f22132c.mo23220a();
        if (a == null) {
            return null;
        }
        C8604a aVar = (C8604a) a.f2729a;
        InputStream inputStream = (InputStream) a.f2730b;
        if (aVar == C8604a.ZIP) {
            gVar = C8507d.m19678a(new ZipInputStream(inputStream), this.f22131b);
        } else {
            gVar = C8507d.m19687b(inputStream, this.f22131b);
        }
        if (gVar.mo23028b() != null) {
            return (C8506c) gVar.mo23028b();
        }
        return null;
    }

    /* renamed from: c */
    private C8532g<C8506c> m20011c() {
        try {
            return m20012d();
        } catch (IOException e) {
            return new C8532g<>((Throwable) e);
        }
    }

    /* renamed from: d */
    private C8532g m20012d() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Fetching ");
        sb.append(this.f22131b);
        C8654d.m20153a(sb.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f22131b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    C8532g b = m20010b(httpURLConnection);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(b.mo23028b() != null);
                    C8654d.m20153a(sb2.toString());
                    httpURLConnection.disconnect();
                    return b;
                }
            }
            String a = m20008a(httpURLConnection);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to fetch ");
            sb3.append(this.f22131b);
            sb3.append(". Failed with ");
            sb3.append(httpURLConnection.getResponseCode());
            sb3.append("\n");
            sb3.append(a);
            return new C8532g((Throwable) new IllegalArgumentException(sb3.toString()));
        } catch (Exception e) {
            return new C8532g((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    public C8532g<C8506c> mo23223a() {
        C8506c b = m20009b();
        if (b != null) {
            return new C8532g<>(b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animation for ");
        sb.append(this.f22131b);
        sb.append(" not found in cache. Fetching from network.");
        C8654d.m20153a(sb.toString());
        return m20011c();
    }

    /* renamed from: a */
    private String m20008a(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* renamed from: b */
    private C8532g<C8506c> m20010b(HttpURLConnection httpURLConnection) throws IOException {
        C8532g<C8506c> gVar;
        C8604a aVar;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            C8654d.m20153a("Handling zip response.");
            aVar = C8604a.ZIP;
            gVar = C8507d.m19678a(new ZipInputStream(new FileInputStream(this.f22132c.mo23221a(httpURLConnection.getInputStream(), aVar))), this.f22131b);
        } else {
            C8654d.m20153a("Received json response.");
            aVar = C8604a.JSON;
            gVar = C8507d.m19687b((InputStream) new FileInputStream(new File(this.f22132c.mo23221a(httpURLConnection.getInputStream(), aVar).getAbsolutePath())), this.f22131b);
        }
        if (gVar.mo23028b() != null) {
            this.f22132c.mo23222a(aVar);
        }
        return gVar;
    }
}
