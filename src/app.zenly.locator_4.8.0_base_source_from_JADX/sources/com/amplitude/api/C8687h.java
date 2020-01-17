package com.amplitude.api;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C13314p;
import okhttp3.C13314p.C13315a;
import okhttp3.C13325v;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.h */
public class C8687h {

    /* renamed from: j */
    protected static C8687h f22361j;

    /* renamed from: a */
    volatile boolean f22362a = false;

    /* renamed from: b */
    private volatile String f22363b;

    /* renamed from: c */
    private volatile C13325v f22364c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile String f22365d;

    /* renamed from: e */
    int f22366e = 50;

    /* renamed from: f */
    String f22367f = "https://api.amplitude.com/diagnostic";

    /* renamed from: g */
    C8694m f22368g = new C8694m("diagnosticThread");

    /* renamed from: h */
    List<String> f22369h = new ArrayList(this.f22366e);

    /* renamed from: i */
    Map<String, JSONObject> f22370i = new HashMap(this.f22366e);

    /* renamed from: com.amplitude.api.h$a */
    class C8688a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ String f22371e;

        /* renamed from: f */
        final /* synthetic */ Throwable f22372f;

        C8688a(String str, Throwable th) {
            this.f22371e = str;
            this.f22372f = th;
        }

        public void run() {
            JSONObject jSONObject = (JSONObject) C8687h.this.f22370i.get(this.f22371e);
            String str = "count";
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("error", C8665c.m20248f(this.f22371e));
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    jSONObject2.put("device_id", C8687h.this.f22365d);
                    jSONObject2.put(str, 1);
                    if (this.f22372f != null) {
                        String stackTraceString = Log.getStackTraceString(this.f22372f);
                        if (!C8693l.m20451a(stackTraceString)) {
                            jSONObject2.put("stack_trace", C8665c.m20248f(stackTraceString));
                        }
                    }
                    if (C8687h.this.f22369h.size() >= C8687h.this.f22366e) {
                        for (int i = 0; i < 5; i++) {
                            C8687h.this.f22370i.remove((String) C8687h.this.f22369h.remove(0));
                        }
                    }
                    C8687h.this.f22370i.put(this.f22371e, jSONObject2);
                    C8687h.this.f22369h.add(this.f22371e);
                } catch (JSONException unused) {
                }
            } else {
                jSONObject.put(str, jSONObject.optInt(str, 0) + 1);
            }
        }
    }

    /* renamed from: com.amplitude.api.h$b */
    class C8689b implements Runnable {
        C8689b() {
        }

        public void run() {
            if (!C8687h.this.f22369h.isEmpty()) {
                ArrayList arrayList = new ArrayList(C8687h.this.f22369h.size());
                for (String str : C8687h.this.f22369h) {
                    arrayList.add(C8687h.this.f22370i.get(str));
                }
                String jSONArray = new JSONArray(arrayList).toString();
                if (!C8693l.m20451a(jSONArray)) {
                    C8687h.this.mo23434b(jSONArray);
                }
            }
        }
    }

    private C8687h() {
        this.f22368g.start();
    }

    /* renamed from: b */
    static synchronized C8687h m20402b() {
        C8687h hVar;
        synchronized (C8687h.class) {
            if (f22361j == null) {
                f22361j = new C8687h();
            }
            hVar = f22361j;
        }
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8687h mo23432a(C13325v vVar, String str, String str2) {
        this.f22362a = true;
        this.f22363b = str;
        this.f22364c = vVar;
        this.f22365d = str2;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23434b(String str) {
        C13315a aVar = new C13315a();
        aVar.mo38250a("v", "1");
        aVar.mo38250a("client", this.f22363b);
        aVar.mo38250a("e", str);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(System.currentTimeMillis());
        aVar.mo38250a("upload_time", sb.toString());
        C13314p a = aVar.mo38251a();
        C13332a aVar2 = new C13332a();
        aVar2.mo38402b(this.f22367f);
        aVar2.mo38399a((C13333z) a);
        try {
            if (this.f22364c.newCall(aVar2.mo38400a()).execute().mo37789a().mo37830g().equals("success")) {
                this.f22370i.clear();
                this.f22369h.clear();
            }
        } catch (IOException | AssertionError | Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8687h mo23430a(String str) {
        mo23431a(str, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8687h mo23431a(String str, Throwable th) {
        if (this.f22362a && !C8693l.m20451a(str) && !C8693l.m20451a(this.f22365d)) {
            mo23433a((Runnable) new C8688a(str, th));
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8687h mo23429a() {
        if (this.f22362a && !C8693l.m20451a(this.f22363b) && this.f22364c != null && !C8693l.m20451a(this.f22365d)) {
            mo23433a((Runnable) new C8689b());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23433a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C8694m mVar = this.f22368g;
        if (currentThread != mVar) {
            mVar.mo23477a(runnable);
        } else {
            runnable.run();
        }
    }
}
