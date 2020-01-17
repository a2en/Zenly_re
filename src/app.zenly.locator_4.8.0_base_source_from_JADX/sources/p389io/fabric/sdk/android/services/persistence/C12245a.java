package p389io.fabric.sdk.android.services.persistence;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;

/* renamed from: io.fabric.sdk.android.services.persistence.a */
public class C12245a implements FileStore {

    /* renamed from: a */
    private final Context f31835a;

    /* renamed from: b */
    private final String f31836b;

    /* renamed from: c */
    private final String f31837c;

    public C12245a(C12161g gVar) {
        if (gVar.mo36008b() != null) {
            this.f31835a = gVar.mo36008b();
            this.f31836b = gVar.mo36015g();
            StringBuilder sb = new StringBuilder();
            sb.append("Android/");
            sb.append(this.f31835a.getPackageName());
            this.f31837c = sb.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo36251a(File file) {
        String str = "Fabric";
        if (file == null) {
            C12154c.m32113f().mo35954d(str, "Null File");
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C12154c.m32113f().mo35967w(str, "Couldn't create file");
        }
        return null;
    }

    public File getCacheDir() {
        return mo36251a(this.f31835a.getCacheDir());
    }

    public File getExternalCacheDir() {
        File file;
        if (!mo36252a()) {
            file = null;
        } else if (VERSION.SDK_INT >= 8) {
            file = this.f31835a.getExternalCacheDir();
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31837c);
            sb.append("/cache/");
            sb.append(this.f31836b);
            file = new File(externalStorageDirectory, sb.toString());
        }
        return mo36251a(file);
    }

    @TargetApi(8)
    public File getExternalFilesDir() {
        File file = null;
        if (mo36252a()) {
            if (VERSION.SDK_INT >= 8) {
                file = this.f31835a.getExternalFilesDir(null);
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f31837c);
                sb.append("/files/");
                sb.append(this.f31836b);
                file = new File(externalStorageDirectory, sb.toString());
            }
        }
        return mo36251a(file);
    }

    public File getFilesDir() {
        return mo36251a(this.f31835a.getFilesDir());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36252a() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        C12154c.m32113f().mo35967w("Fabric", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
        return false;
    }
}
