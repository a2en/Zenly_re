package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.appsflyer.share.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.c */
public class C9910c extends C9926j {

    /* renamed from: a */
    protected final File f26036a;

    /* renamed from: b */
    protected final int f26037b;

    public C9910c(File file, int i) {
        this.f26036a = file;
        this.f26037b = i;
    }

    /* renamed from: a */
    public int mo26770a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return mo26774a(str, i, this.f26036a, threadPolicy);
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f26036a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f26036a.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.f26037b);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo26774a(String str, int i, File file, ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        String str2 = "SoLoader";
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found on ");
            sb.append(file.getCanonicalPath());
            Log.d(str2, sb.toString());
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" found on ");
        sb2.append(file.getCanonicalPath());
        Log.d(str2, sb2.toString());
        if ((i & 1) == 0 || (this.f26037b & 2) == 0) {
            if ((this.f26037b & 1) != 0) {
                m24792a(file2, i, threadPolicy);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not resolving dependencies for ");
                sb3.append(str);
                Log.d(str2, sb3.toString());
            }
            try {
                SoLoader.f26013b.load(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    Log.d(str2, "Corrupted lib file detected");
                    return 3;
                }
                throw e;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" loaded implicitly");
            Log.d(str2, sb4.toString());
            return 2;
        }
    }

    /* renamed from: a */
    private void m24792a(File file, int i, ThreadPolicy threadPolicy) throws IOException {
        String[] a = m24793a(file);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading lib dependencies: ");
        sb.append(Arrays.toString(a));
        Log.d("SoLoader", sb.toString());
        for (String str : a) {
            if (!str.startsWith(Constants.URL_PATH_DELIMITER)) {
                SoLoader.m24773b(str, i | 1, threadPolicy);
            }
        }
    }

    /* renamed from: a */
    private static String[] m24793a(File file) throws IOException {
        if (SoLoader.f26012a) {
            StringBuilder sb = new StringBuilder();
            sb.append("SoLoader.getElfDependencies[");
            sb.append(file.getName());
            sb.append("]");
            Api18TraceUtils.m24761a(sb.toString());
        }
        try {
            return C9924i.m24816a(file);
        } finally {
            if (SoLoader.f26012a) {
                Api18TraceUtils.m24760a();
            }
        }
    }
}
