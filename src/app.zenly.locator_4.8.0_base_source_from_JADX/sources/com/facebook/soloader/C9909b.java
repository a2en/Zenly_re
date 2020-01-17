package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: com.facebook.soloader.b */
public class C9909b extends C9926j {

    /* renamed from: a */
    private Context f26033a;

    /* renamed from: b */
    private int f26034b;

    /* renamed from: c */
    private C9910c f26035c;

    public C9909b(Context context, int i) {
        this.f26033a = context.getApplicationContext();
        if (this.f26033a == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f26033a = context;
        }
        this.f26034b = i;
        this.f26035c = new C9910c(new File(this.f26033a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: a */
    public boolean mo26772a() throws IOException {
        try {
            File file = this.f26035c.f26036a;
            Context createPackageContext = this.f26033a.createPackageContext(this.f26033a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Native library directory updated from ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            Log.d("SoLoader", sb.toString());
            this.f26034b |= 1;
            this.f26035c = new C9910c(file2, this.f26034b);
            this.f26035c.mo26771a(this.f26034b);
            this.f26033a = createPackageContext;
            return true;
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f26035c.toString();
    }

    /* renamed from: a */
    public int mo26770a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return this.f26035c.mo26770a(str, i, threadPolicy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26771a(int i) throws IOException {
        this.f26035c.mo26771a(i);
    }
}
