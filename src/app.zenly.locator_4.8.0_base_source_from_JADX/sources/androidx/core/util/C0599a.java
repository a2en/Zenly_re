package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.util.a */
public class C0599a {

    /* renamed from: a */
    private final File f2725a;

    /* renamed from: b */
    private final File f2726b;

    public C0599a(File file) {
        this.f2725a = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.f2726b = new File(sb.toString());
    }

    /* renamed from: a */
    public File mo3242a() {
        return this.f2725a;
    }

    /* renamed from: b */
    public void mo3245b(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m2759c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f2726b.delete();
            } catch (IOException e) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: c */
    public FileOutputStream mo3246c() throws IOException {
        if (this.f2725a.exists()) {
            if (this.f2726b.exists()) {
                this.f2725a.delete();
            } else if (!this.f2725a.renameTo(this.f2726b)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't rename file ");
                sb.append(this.f2725a);
                sb.append(" to backup file ");
                sb.append(this.f2726b);
                Log.w("AtomicFile", sb.toString());
            }
        }
        try {
            return new FileOutputStream(this.f2725a);
        } catch (FileNotFoundException unused) {
            if (this.f2725a.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f2725a);
                } catch (FileNotFoundException unused2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Couldn't create ");
                    sb2.append(this.f2725a);
                    throw new IOException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Couldn't create directory ");
                sb3.append(this.f2725a);
                throw new IOException(sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo3243a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m2759c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f2725a.delete();
                this.f2726b.renameTo(this.f2725a);
            } catch (IOException e) {
                Log.w("AtomicFile", "failWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: b */
    public FileInputStream mo3244b() throws FileNotFoundException {
        if (this.f2726b.exists()) {
            this.f2725a.delete();
            this.f2726b.renameTo(this.f2725a);
        }
        return new FileInputStream(this.f2725a);
    }

    /* renamed from: c */
    private static boolean m2759c(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
