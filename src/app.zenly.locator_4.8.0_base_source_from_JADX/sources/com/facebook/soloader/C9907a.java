package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
public class C9907a extends C9917f {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f26029h;

    /* renamed from: com.facebook.soloader.a$a */
    protected class C9908a extends C9920c {

        /* renamed from: i */
        private File f26030i;

        /* renamed from: j */
        private final int f26031j;

        C9908a(C9917f fVar) throws IOException {
            super(fVar);
            this.f26030i = new File(C9907a.this.f26054c.getApplicationInfo().nativeLibraryDir);
            this.f26031j = C9907a.this.f26029h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo26769a(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = true;
            if (str.equals(C9907a.this.f26055d)) {
                C9907a.this.f26055d = null;
                str2 = String.format("allowing consideration of corrupted lib %s", new Object[]{str});
            } else if ((this.f26031j & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
                str2 = sb.toString();
            } else {
                File file = new File(this.f26030i, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("not allowing consideration of ");
                        sb2.append(name);
                        sb2.append(": deferring to libdir");
                        str2 = sb2.toString();
                        z = false;
                    }
                }
            }
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public C9907a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f26029h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9933f mo26768b() throws IOException {
        return new C9908a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo26767a() throws IOException {
        File canonicalFile = this.f26042f.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.m24777a(this.f26054c));
            if ((this.f26029h & 1) == 0) {
                obtain.writeByte(0);
                return obtain.marshall();
            }
            String str = this.f26054c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte(2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }
}
