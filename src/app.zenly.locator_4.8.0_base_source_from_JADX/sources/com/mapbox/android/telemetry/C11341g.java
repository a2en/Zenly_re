package com.mapbox.android.telemetry;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p316k.C11261a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mapbox.android.telemetry.g */
class C11341g implements C11381o {

    /* renamed from: a */
    private final Context f29420a;

    /* renamed from: b */
    private final List<String> f29421b = new CopyOnWriteArrayList();

    /* renamed from: com.mapbox.android.telemetry.g$a */
    class C11342a extends C11261a<List<String>> {
        C11342a(C11341g gVar) {
        }
    }

    C11341g(Context context, C11383p pVar) {
        this.f29420a = context;
        pVar.mo33030a((C11381o) this);
        if (pVar.mo33031a()) {
            pVar.mo33032b();
        } else {
            m29195a(context.getFilesDir(), false);
        }
    }

    /* renamed from: a */
    private void m29195a(File file, boolean z) {
        if (file.isDirectory()) {
            String str = "MapboxBlacklist";
            File file2 = new File(file, str);
            if (file2.exists()) {
                try {
                    List a = m29194a(file2);
                    if (!a.isEmpty()) {
                        if (z) {
                            this.f29421b.clear();
                        }
                        this.f29421b.addAll(a);
                    }
                } catch (IOException e) {
                    Log.e(str, e.getMessage());
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m29196c(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11125d a = new C11132e().mo32476a();
        try {
            JsonElement jsonElement = ((JsonObject) a.mo32457a(str, JsonObject.class)).get("RevokedCertKeys");
            JsonArray jsonArray = jsonElement.isJsonArray() ? (JsonArray) a.mo32452a(jsonElement, JsonArray.class) : null;
            if (jsonArray != null && jsonArray.size() > 0) {
                z = true;
            }
            return z;
        } catch (JsonSyntaxException e) {
            Log.e("MapboxBlacklist", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    private boolean m29197d(String str) {
        String str2 = "MapboxBlacklist";
        boolean z = false;
        if (!m29196c(str)) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.f29420a.openFileOutput(str2, 0);
            fileOutputStream.write(str.getBytes());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e(str2, e.getMessage());
                }
            }
            z = true;
        } catch (IOException e2) {
            Log.e(str2, e2.getMessage());
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.e(str2, e3.getMessage());
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo32985b(String str) {
        return this.f29421b.contains(str);
    }

    /* renamed from: a */
    private List<String> m29194a(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        C11125d dVar = new C11125d();
        List<String> list = null;
        try {
            JsonObject jsonObject = (JsonObject) dVar.mo32455a((Reader) bufferedReader, JsonObject.class);
            if (jsonObject != null) {
                list = (List) dVar.mo32458a(jsonObject.getAsJsonArray("RevokedCertKeys").toString(), new C11342a(this).getType());
            }
        } catch (JsonIOException | JsonSyntaxException e) {
            Log.e("MapboxBlacklist", e.getMessage());
        }
        bufferedReader.close();
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: a */
    public void mo32984a(String str) {
        if (m29197d(str)) {
            m29195a(this.f29420a.getFilesDir(), true);
        }
    }
}
