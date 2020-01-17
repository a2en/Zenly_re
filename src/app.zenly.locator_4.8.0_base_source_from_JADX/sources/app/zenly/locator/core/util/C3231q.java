package app.zenly.locator.core.util;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.util.q */
public final class C3231q {

    /* renamed from: a */
    public static final C3231q f9010a = new C3231q();

    /* renamed from: app.zenly.locator.core.util.q$a */
    public enum C3232a {
        PICTURES("pictures", "jpg", r6),
        VIDEOS("videos", "mp4", r13);
        

        /* renamed from: e */
        private final String f9014e;

        /* renamed from: f */
        private final String f9015f;

        /* renamed from: g */
        private final String f9016g;

        private C3232a(String str, String str2, String str3) {
            this.f9014e = str;
            this.f9015f = str2;
            this.f9016g = str3;
        }

        /* renamed from: a */
        public final String mo9651a() {
            return this.f9014e;
        }

        /* renamed from: b */
        public final String mo9652b() {
            return this.f9015f;
        }

        /* renamed from: c */
        public final String mo9653c() {
            return this.f9016g;
        }
    }

    /* renamed from: app.zenly.locator.core.util.q$b */
    static final class C3233b implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ File f9017a;

        C3233b(File file) {
            this.f9017a = file;
        }

        public final boolean accept(File file) {
            return !C12932j.m33817a((Object) file, (Object) this.f9017a);
        }
    }

    private C3231q() {
    }

    /* renamed from: a */
    public static final File m10235a(Context context, C3232a aVar) {
        return m10236a(context, aVar, (String) null, 4, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ File m10236a(Context context, C3232a aVar, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return m10245c(context, aVar, str);
    }

    /* renamed from: a */
    public static final File m10239a(C3232a aVar) {
        return m10241a(aVar, null, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ File m10243b(Context context, C3232a aVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return m10242b(context, aVar, str, str2, str3);
    }

    /* renamed from: c */
    public static final File m10245c(Context context, C3232a aVar, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "media");
        String uuid = UUID.randomUUID().toString();
        C12932j.m33815a((Object) uuid, "UUID.randomUUID().toString()");
        return m10242b(context, aVar, null, uuid, str);
    }

    /* renamed from: b */
    public static final File m10242b(Context context, C3232a aVar, String str, String str2, String str3) {
        File file;
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "media");
        C12932j.m33818b(str2, "basename");
        File file2 = new File(context.getCacheDir(), aVar.mo9651a());
        if (str == null) {
            file = file2;
        } else {
            file = new File(file2, str);
        }
        if (file.exists() || file.mkdirs()) {
            if (str3 == null) {
                str3 = aVar.mo9652b();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append('.');
            sb.append(str3);
            File file3 = new File(file, sb.toString());
            try {
                if (file3.exists() || file3.createNewFile()) {
                    return file3;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo9650a(Context context, C3232a aVar, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "media");
        C12932j.m33818b(str, "subFolder");
        File file = new File(new File(context.getCacheDir(), aVar.mo9651a()), str);
        if (file.exists()) {
            File[] listFiles = file.getParentFile().listFiles(new C3233b(file));
            C12932j.m33815a((Object) listFiles, "parentFile.listFiles { file -> file != this }");
            for (File file2 : listFiles) {
                C12932j.m33815a((Object) file2, "it");
                C12916k.m33779b(file2);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ File m10238a(Context context, C3232a aVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return m10237a(context, aVar, str, str2, str3);
    }

    /* renamed from: a */
    public static final File m10237a(Context context, C3232a aVar, String str, String str2, String str3) {
        File file;
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "media");
        C12932j.m33818b(str2, "basename");
        File file2 = new File(context.getCacheDir(), aVar.mo9651a());
        if (str == null) {
            file = file2;
        } else {
            file = new File(file2, str);
        }
        if (!file.exists()) {
            return null;
        }
        if (str3 == null) {
            str3 = aVar.mo9652b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        File file3 = new File(file, sb.toString());
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m10244b(Context context, C3232a aVar, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "media");
        C12932j.m33818b(str, "subFolder");
        File file = new File(new File(context.getCacheDir(), aVar.mo9651a()), str);
        if (!file.exists()) {
            return true;
        }
        return C12916k.m33779b(file);
    }

    /* renamed from: a */
    public static /* synthetic */ File m10241a(C3232a aVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return m10240a(aVar, str);
    }

    /* renamed from: a */
    public static final File m10240a(C3232a aVar, String str) {
        C12932j.m33818b(aVar, "media");
        File file = new File(Environment.getExternalStoragePublicDirectory(aVar.mo9653c()), "Zenly");
        if (file.exists() || file.mkdirs()) {
            if (str == null) {
                str = aVar.mo9652b();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID());
            sb.append('.');
            sb.append(str);
            File file2 = new File(file, sb.toString());
            try {
                if (file2.createNewFile()) {
                    return file2;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
