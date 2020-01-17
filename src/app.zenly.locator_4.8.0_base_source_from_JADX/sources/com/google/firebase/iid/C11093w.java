package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.w */
final class C11093w {

    /* renamed from: d */
    private static final long f28768d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f28769a;

    /* renamed from: b */
    private final String f28770b;

    /* renamed from: c */
    private final long f28771c;

    private C11093w(String str, String str2, long j) {
        this.f28769a = str;
        this.f28770b = str2;
        this.f28771c = j;
    }

    /* renamed from: a */
    static String m28560a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    static C11093w m28561b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C11093w(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C11093w(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m28559a(C11093w wVar) {
        if (wVar == null) {
            return null;
        }
        return wVar.f28769a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32319a(String str) {
        return System.currentTimeMillis() > this.f28771c + f28768d || !str.equals(this.f28770b);
    }
}
