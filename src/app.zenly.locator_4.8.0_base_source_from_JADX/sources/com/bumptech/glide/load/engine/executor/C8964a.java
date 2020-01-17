package com.bumptech.glide.load.engine.executor;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.engine.executor.a */
final class C8964a {

    /* renamed from: com.bumptech.glide.load.engine.executor.a$a */
    class C8965a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f23346a;

        C8965a(Pattern pattern) {
            this.f23346a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f23346a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m21520a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return VERSION.SDK_INT < 17 ? Math.max(m21521b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m21521b() {
        File[] fileArr;
        String str = "GlideRuntimeCompat";
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C8965a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
