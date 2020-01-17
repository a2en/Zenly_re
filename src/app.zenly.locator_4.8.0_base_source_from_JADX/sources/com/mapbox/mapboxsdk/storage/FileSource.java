package com.mapbox.mapboxsdk.storage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Environment;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.utils.C11598e;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileSource {

    /* renamed from: a */
    private static final Lock f30056a = new ReentrantLock();

    /* renamed from: b */
    private static final Lock f30057b = new ReentrantLock();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f30058c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f30059d;

    /* renamed from: e */
    private static FileSource f30060e;
    @Keep
    private long nativePtr;

    @Keep
    public interface ResourceTransformCallback {
        String onURL(int i, String str);
    }

    @Keep
    public interface ResourcesCachePathChangeCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    /* renamed from: com.mapbox.mapboxsdk.storage.FileSource$a */
    private static class C11588a extends AsyncTask<Context, Void, String[]> {
        private C11588a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Context... contextArr) {
            return new String[]{FileSource.m30340b(contextArr[0]), contextArr[0].getCacheDir().getAbsolutePath()};
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            FileSource.m30347d();
        }

        /* synthetic */ C11588a(C11589a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            FileSource.f30058c = strArr[0];
            FileSource.f30059d = strArr[1];
            FileSource.m30347d();
        }
    }

    private FileSource(String str, AssetManager assetManager) {
        initialize(C11451d.m29565a(), str, assetManager);
    }

    /* renamed from: c */
    private static String m30343c(Context context) {
        if (m30351h(context) && m30342b()) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                return externalFilesDir.getAbsolutePath();
            }
        }
        return context.getFilesDir().getAbsolutePath();
    }

    /* renamed from: d */
    public static synchronized FileSource m30346d(Context context) {
        FileSource fileSource;
        synchronized (FileSource.class) {
            if (f30060e == null) {
                f30060e = new FileSource(m30349f(context), context.getResources().getAssets());
            }
            fileSource = f30060e;
        }
        return fileSource;
    }

    /* renamed from: e */
    public static String m30348e(Context context) {
        f30057b.lock();
        try {
            if (f30059d == null) {
                f30059d = context.getCacheDir().getAbsolutePath();
            }
            return f30059d;
        } finally {
            f30057b.unlock();
        }
    }

    /* renamed from: f */
    public static String m30349f(Context context) {
        f30056a.lock();
        try {
            if (f30058c == null) {
                f30058c = m30340b(context);
            }
            return f30058c;
        } finally {
            f30056a.unlock();
        }
    }

    /* renamed from: g */
    public static void m30350g(Context context) {
        C11598e.m30384a("FileSource");
        m30344c();
        if (f30058c == null || f30059d == null) {
            new C11588a(null).execute(new Context[]{context});
        }
    }

    /* renamed from: h */
    private static boolean m30351h(Context context) {
        String str = "Mbgl-FileSource";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getBoolean("com.mapbox.SetStorageExternal", false);
            }
            return false;
        } catch (NameNotFoundException e) {
            Logger.m29681e(str, "Failed to read the package metadata: ", e);
            C11445b.m29552a((Throwable) e);
            return false;
        } catch (Exception e2) {
            Logger.m29681e(str, "Failed to read the storage key: ", e2);
            C11445b.m29552a((Throwable) e2);
            return false;
        }
    }

    @Keep
    private native void initialize(String str, String str2, AssetManager assetManager);

    @Keep
    private native void setResourceCachePath(String str);

    @Keep
    public native void activate();

    @Keep
    public native void deactivate();

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    @Keep
    public native String getAccessToken();

    @Keep
    public native boolean isActivated();

    @Keep
    public native void setAccessToken(String str);

    @Keep
    public native void setApiBaseUrl(String str);

    @Keep
    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m30340b(Context context) {
        String str = "MapboxSharedPreferences";
        String str2 = "fileSourceResourcesCachePath";
        String string = context.getSharedPreferences(str, 0).getString(str2, null);
        if (m30345c(string)) {
            return string;
        }
        String c = m30343c(context);
        context.getSharedPreferences(str, 0).edit().remove(str2).apply();
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m30347d() {
        f30056a.unlock();
        f30057b.unlock();
    }

    /* renamed from: c */
    private static boolean m30345c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return new File(str).canWrite();
    }

    /* renamed from: c */
    private static void m30344c() {
        f30057b.lock();
        f30056a.lock();
    }

    /* renamed from: b */
    public static boolean m30342b() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        Logger.m29686w("Mbgl-FileSource", "External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).");
        return false;
    }
}
