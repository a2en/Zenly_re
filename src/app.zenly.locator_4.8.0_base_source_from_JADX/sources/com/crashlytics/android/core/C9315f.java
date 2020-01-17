package com.crashlytics.android.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: com.crashlytics.android.core.f */
class C9315f extends FileOutputStream {

    /* renamed from: h */
    public static final FilenameFilter f24173h = new C9316a();

    /* renamed from: e */
    private final String f24174e;

    /* renamed from: f */
    private File f24175f;

    /* renamed from: g */
    private boolean f24176g = false;

    /* renamed from: com.crashlytics.android.core.f$a */
    static class C9316a implements FilenameFilter {
        C9316a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public C9315f(File file, String str) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".cls_temp";
        sb.append(str2);
        super(new File(file, sb.toString()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        sb2.append(File.separator);
        sb2.append(str);
        this.f24174e = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f24174e);
        sb3.append(str2);
        this.f24175f = new File(sb3.toString());
    }

    /* renamed from: a */
    public void mo25078a() throws IOException {
        if (!this.f24176g) {
            this.f24176g = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() throws IOException {
        if (!this.f24176g) {
            this.f24176g = true;
            super.flush();
            super.close();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24174e);
            sb.append(".cls");
            File file = new File(sb.toString());
            if (this.f24175f.renameTo(file)) {
                this.f24175f = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f24175f.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not rename temp file: ");
            sb2.append(this.f24175f);
            sb2.append(" -> ");
            sb2.append(file);
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }
}
