package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.ReLinker.LibraryInstaller;
import com.getkeepsafe.relinker.ReLinker.LibraryLoader;
import com.getkeepsafe.relinker.ReLinker.LoadListener;
import com.getkeepsafe.relinker.ReLinker.Logger;
import com.getkeepsafe.relinker.elf.C9949e;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.getkeepsafe.relinker.b */
public class C9936b {

    /* renamed from: a */
    protected final Set<String> f26073a;

    /* renamed from: b */
    protected final LibraryLoader f26074b;

    /* renamed from: c */
    protected final LibraryInstaller f26075c;

    /* renamed from: d */
    protected boolean f26076d;

    /* renamed from: e */
    protected boolean f26077e;

    /* renamed from: f */
    protected Logger f26078f;

    /* renamed from: com.getkeepsafe.relinker.b$a */
    class C9937a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Context f26079e;

        /* renamed from: f */
        final /* synthetic */ String f26080f;

        /* renamed from: g */
        final /* synthetic */ String f26081g;

        /* renamed from: h */
        final /* synthetic */ LoadListener f26082h;

        C9937a(Context context, String str, String str2, LoadListener loadListener) {
            this.f26079e = context;
            this.f26080f = str;
            this.f26081g = str2;
            this.f26082h = loadListener;
        }

        public void run() {
            try {
                C9936b.this.m24855c(this.f26079e, this.f26080f, this.f26081g);
                this.f26082h.success();
            } catch (UnsatisfiedLinkError e) {
                this.f26082h.failure(e);
            } catch (MissingLibraryException e2) {
                this.f26082h.failure(e2);
            }
        }
    }

    /* renamed from: com.getkeepsafe.relinker.b$b */
    class C9938b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f26084a;

        C9938b(C9936b bVar, String str) {
            this.f26084a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.f26084a);
        }
    }

    protected C9936b() {
        this(new C9939c(), new C9934a());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m24855c(Context context, String str, String str2) {
        C9949e eVar;
        C9949e eVar2;
        if (!this.f26073a.contains(str) || this.f26076d) {
            try {
                this.f26074b.loadLibrary(str);
                this.f26073a.add(str);
                mo26804a("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                mo26804a("Loading the library normally failed: %s", Log.getStackTraceString(e));
                mo26804a("%s (%s) was not loaded normally, re-linking...", str, str2);
                File b = mo26805b(context, str, str2);
                if (!b.exists() || this.f26076d) {
                    if (this.f26076d) {
                        mo26804a("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    mo26801a(context, str, str2);
                    this.f26075c.installLibrary(context, this.f26074b.supportedAbis(), this.f26074b.mapLibraryName(str), b, this);
                }
                try {
                    if (this.f26077e) {
                        eVar = null;
                        eVar2 = new C9949e(b);
                        List<String> b2 = eVar2.mo26815b();
                        eVar2.close();
                        for (String unmapLibraryName : b2) {
                            mo26800a(context, this.f26074b.unmapLibraryName(unmapLibraryName));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f26074b.loadPath(b.getAbsolutePath());
                this.f26073a.add(str);
                mo26804a("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th) {
                th = th;
                eVar = eVar2;
                eVar.close();
                throw th;
            }
        } else {
            mo26804a("%s already loaded previously!", str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public File mo26805b(Context context, String str, String str2) {
        String mapLibraryName = this.f26074b.mapLibraryName(str);
        if (C9940d.m24864a(str2)) {
            return new File(mo26799a(context), mapLibraryName);
        }
        File a = mo26799a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(mapLibraryName);
        sb.append(".");
        sb.append(str2);
        return new File(a, sb.toString());
    }

    protected C9936b(LibraryLoader libraryLoader, LibraryInstaller libraryInstaller) {
        this.f26073a = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (libraryInstaller != null) {
            this.f26074b = libraryLoader;
            this.f26075c = libraryInstaller;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }

    /* renamed from: a */
    public C9936b mo26798a(Logger logger) {
        this.f26078f = logger;
        return this;
    }

    /* renamed from: a */
    public void mo26800a(Context context, String str) {
        mo26802a(context, str, (String) null, (LoadListener) null);
    }

    /* renamed from: a */
    public void mo26802a(Context context, String str, String str2, LoadListener loadListener) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C9940d.m24864a(str)) {
            mo26804a("Beginning load of %s...", str);
            if (loadListener == null) {
                m24855c(context, str, str2);
                return;
            }
            C9937a aVar = new C9937a(context, str, str2, loadListener);
            new Thread(aVar).start();
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo26799a(Context context) {
        return context.getDir("lib", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26801a(Context context, String str, String str2) {
        File a = mo26799a(context);
        File b = mo26805b(context, str, str2);
        File[] listFiles = a.listFiles(new C9938b(this, this.f26074b.mapLibraryName(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f26076d || !file.getAbsolutePath().equals(b.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26804a(String str, Object... objArr) {
        mo26803a(String.format(Locale.US, str, objArr));
    }

    /* renamed from: a */
    public void mo26803a(String str) {
        Logger logger = this.f26078f;
        if (logger != null) {
            logger.log(str);
        }
    }
}
