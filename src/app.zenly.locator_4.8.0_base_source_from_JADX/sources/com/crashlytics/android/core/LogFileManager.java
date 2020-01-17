package com.crashlytics.android.core;

import android.content.Context;
import java.io.File;
import java.util.Set;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.common.C12180h;

class LogFileManager {

    /* renamed from: d */
    private static final C9302b f24150d = new C9302b();

    /* renamed from: a */
    private final Context f24151a;

    /* renamed from: b */
    private final DirectoryProvider f24152b;

    /* renamed from: c */
    private C9423x f24153c;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    /* renamed from: com.crashlytics.android.core.LogFileManager$b */
    private static final class C9302b implements C9423x {
        private C9302b() {
        }

        /* renamed from: a */
        public void mo25053a() {
        }

        /* renamed from: a */
        public void mo25054a(long j, String str) {
        }

        /* renamed from: b */
        public C9311d mo25055b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo25056c() {
            return null;
        }

        /* renamed from: d */
        public void mo25057d() {
        }
    }

    LogFileManager(Context context, DirectoryProvider directoryProvider) {
        this(context, directoryProvider, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25048a(String str) {
        this.f24153c.mo25053a();
        this.f24153c = f24150d;
        if (str != null) {
            if (!C12180h.m32258a(this.f24151a, "com.crashlytics.CollectCustomLogs", true)) {
                C12154c.m32113f().mo35954d("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                mo25047a(m22413b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9311d mo25050b() {
        return this.f24153c.mo25055b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public byte[] mo25051c() {
        return this.f24153c.mo25056c();
    }

    LogFileManager(Context context, DirectoryProvider directoryProvider, String str) {
        this.f24151a = context;
        this.f24152b = directoryProvider;
        this.f24153c = f24150d;
        mo25048a(str);
    }

    /* renamed from: b */
    private File m22413b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("crashlytics-userlog-");
        sb.append(str);
        sb.append(".temp");
        return new File(this.f24152b.getLogFileDir(), sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25046a(long j, String str) {
        this.f24153c.mo25054a(j, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25045a() {
        this.f24153c.mo25057d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25049a(Set<String> set) {
        File[] listFiles = this.f24152b.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m22412a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25047a(File file, int i) {
        this.f24153c = new C9334j0(file, i);
    }

    /* renamed from: a */
    private String m22412a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }
}
