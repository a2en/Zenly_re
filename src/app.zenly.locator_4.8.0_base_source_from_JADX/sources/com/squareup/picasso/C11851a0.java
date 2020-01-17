package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.System;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.squareup.picasso.a0 */
final class C11851a0 {

    /* renamed from: a */
    static final StringBuilder f30709a = new StringBuilder();

    /* renamed from: com.squareup.picasso.a0$a */
    static class C11852a extends Handler {
        C11852a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    @TargetApi(11)
    /* renamed from: com.squareup.picasso.a0$b */
    private static class C11853b {
        /* renamed from: a */
        static int m31122a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    /* renamed from: com.squareup.picasso.a0$c */
    private static class C11854c {
        /* renamed from: a */
        static int m31123a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.squareup.picasso.a0$d */
    private static class C11855d {
        /* renamed from: a */
        static Downloader m31124a(Context context) {
            return new C11885p(context);
        }
    }

    /* renamed from: com.squareup.picasso.a0$e */
    private static class C11856e extends Thread {
        public C11856e(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.a0$f */
    static class C11857f implements ThreadFactory {
        C11857f() {
        }

        public Thread newThread(Runnable runnable) {
            return new C11856e(runnable);
        }
    }

    /* renamed from: a */
    static int m31100a(Bitmap bitmap) {
        int i;
        if (VERSION.SDK_INT >= 12) {
            i = C11854c.m31123a(bitmap);
        } else {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    static boolean m31116b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    static Downloader m31119c(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return C11855d.m31124a(context);
        } catch (ClassNotFoundException unused) {
            return new C11901z(context);
        }
    }

    /* renamed from: d */
    static boolean m31121d(Context context) {
        try {
            if (System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static File m31115b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    static byte[] m31120c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    static <T> T m31104a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    static boolean m31117b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    static void m31109a() {
        if (!m31116b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: b */
    static boolean m31118b(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12) {
            return false;
        }
        String str = "US-ASCII";
        if (!"RIFF".equals(new String(bArr, 0, 4, str))) {
            return false;
        }
        if ("WEBP".equals(new String(bArr, 8, 4, str))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m31105a(C11859c cVar) {
        return m31106a(cVar, "");
    }

    /* renamed from: a */
    static String m31106a(C11859c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C11849a b = cVar.mo35073b();
        if (b != null) {
            sb.append(b.f30697b.mo35144d());
        }
        List c = cVar.mo35075c();
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || b != null) {
                    sb.append(", ");
                }
                sb.append(((C11849a) c.get(i)).f30697b.mo35144d());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m31112a(String str, String str2, String str3) {
        m31113a(str, str2, str3, "");
    }

    /* renamed from: a */
    static void m31113a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", objArr));
    }

    /* renamed from: a */
    static String m31107a(C11889s sVar) {
        String a = m31108a(sVar, f30709a);
        f30709a.setLength(0);
        return a;
    }

    /* renamed from: a */
    static String m31108a(C11889s sVar, StringBuilder sb) {
        String str = sVar.f30813f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(sVar.f30813f);
        } else {
            Uri uri = sVar.f30811d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(sVar.f30812e);
            }
        }
        sb.append(10);
        if (sVar.f30820m != 0.0f) {
            sb.append("rotation:");
            sb.append(sVar.f30820m);
            if (sVar.f30823p) {
                sb.append('@');
                sb.append(sVar.f30821n);
                sb.append('x');
                sb.append(sVar.f30822o);
            }
            sb.append(10);
        }
        if (sVar.mo35143c()) {
            sb.append("resize:");
            sb.append(sVar.f30815h);
            sb.append('x');
            sb.append(sVar.f30816i);
            sb.append(10);
        }
        if (sVar.f30817j) {
            sb.append("centerCrop");
            sb.append(10);
        } else if (sVar.f30818k) {
            sb.append("centerInside");
            sb.append(10);
        }
        List<Transformation> list = sVar.f30814g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(((Transformation) sVar.f30814g.get(i)).key());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m31111a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    static boolean m31114a(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(split[0]) && Integer.parseInt(split[1]) == 304) {
                z = true;
            }
        } catch (NumberFormatException unused) {
        }
        return z;
    }

    /* renamed from: a */
    static long m31101a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: a */
    static int m31098a(Context context) {
        ActivityManager activityManager = (ActivityManager) m31103a(context, "activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && VERSION.SDK_INT >= 11) {
            memoryClass = C11853b.m31122a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* renamed from: a */
    static <T> T m31103a(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: a */
    static int m31099a(Resources resources, C11889s sVar) throws FileNotFoundException {
        int i;
        if (sVar.f30812e == 0) {
            Uri uri = sVar.f30811d;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    List pathSegments = sVar.f30811d.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("No path segments: ");
                        sb.append(sVar.f30811d);
                        throw new FileNotFoundException(sb.toString());
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Last path segment is not a resource ID: ");
                            sb2.append(sVar.f30811d);
                            throw new FileNotFoundException(sb2.toString());
                        }
                    } else if (pathSegments.size() == 2) {
                        i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("More than two path segments: ");
                        sb3.append(sVar.f30811d);
                        throw new FileNotFoundException(sb3.toString());
                    }
                    return i;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No package provided: ");
                sb4.append(sVar.f30811d);
                throw new FileNotFoundException(sb4.toString());
            }
        }
        return sVar.f30812e;
    }

    /* renamed from: a */
    static Resources m31102a(Context context, C11889s sVar) throws FileNotFoundException {
        if (sVar.f30812e == 0) {
            Uri uri = sVar.f30811d;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    try {
                        return context.getPackageManager().getResourcesForApplication(authority);
                    } catch (NameNotFoundException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unable to obtain resources for package: ");
                        sb.append(sVar.f30811d);
                        throw new FileNotFoundException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No package provided: ");
                    sb2.append(sVar.f30811d);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
        }
        return context.getResources();
    }

    /* renamed from: a */
    static void m31110a(Looper looper) {
        C11852a aVar = new C11852a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }
}
