package p389io.fabric.sdk.android.services.settings;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.persistence.C12245a;

/* renamed from: io.fabric.sdk.android.services.settings.i */
class C12257i implements CachedSettingsIo {

    /* renamed from: a */
    private final C12161g f31880a;

    public C12257i(C12161g gVar) {
        this.f31880a = gVar;
    }

    public JSONObject readCachedSettings() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String str = "Error while closing settings cache file.";
        String str2 = "Fabric";
        C12154c.m32113f().mo35954d(str2, "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new C12245a(this.f31880a).getFilesDir(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(C12180h.m32262b((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C12154c.m32113f().mo35957e(str2, "Failed to fetch cached settings", e);
                        C12180h.m32254a((Closeable) fileInputStream, str);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        C12180h.m32254a((Closeable) fileInputStream2, str);
                        throw th;
                    }
                }
            } else {
                C12154c.m32113f().mo35954d(str2, "No cached settings found.");
                jSONObject = null;
            }
            C12180h.m32254a((Closeable) fileInputStream2, str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C12154c.m32113f().mo35957e(str2, "Failed to fetch cached settings", e);
            C12180h.m32254a((Closeable) fileInputStream, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C12180h.m32254a((Closeable) fileInputStream2, str);
            throw th;
        }
    }

    public void writeCachedSettings(long j, JSONObject jSONObject) {
        String str = "Failed to close settings writer.";
        String str2 = "Fabric";
        C12154c.m32113f().mo35954d(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(new File(new C12245a(this.f31880a).getFilesDir(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C12180h.m32254a((Closeable) fileWriter2, str);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C12154c.m32113f().mo35957e(str2, "Failed to cache settings", e);
                        C12180h.m32254a((Closeable) fileWriter, str);
                    } catch (Throwable th) {
                        th = th;
                        C12180h.m32254a((Closeable) fileWriter, str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C12180h.m32254a((Closeable) fileWriter, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C12154c.m32113f().mo35957e(str2, "Failed to cache settings", e);
                C12180h.m32254a((Closeable) fileWriter, str);
            }
        }
    }
}
