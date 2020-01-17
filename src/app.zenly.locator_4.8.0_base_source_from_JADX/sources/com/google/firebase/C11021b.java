package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.C10127n;
import com.google.android.gms.common.util.C10176m;

/* renamed from: com.google.firebase.b */
public final class C11021b {

    /* renamed from: a */
    private final String f28605a;

    /* renamed from: b */
    private final String f28606b;

    /* renamed from: c */
    private final String f28607c;

    /* renamed from: d */
    private final String f28608d;

    /* renamed from: e */
    private final String f28609e;

    /* renamed from: f */
    private final String f28610f;

    /* renamed from: g */
    private final String f28611g;

    private C11021b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C10123l.m25517b(!C10176m.m25690a(str), "ApplicationId must be set.");
        this.f28606b = str;
        this.f28605a = str2;
        this.f28607c = str3;
        this.f28608d = str4;
        this.f28609e = str5;
        this.f28610f = str6;
        this.f28611g = str7;
    }

    /* renamed from: a */
    public static C11021b m28387a(Context context) {
        C10127n nVar = new C10127n(context);
        String a = nVar.mo27502a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C11021b bVar = new C11021b(a, nVar.mo27502a("google_api_key"), nVar.mo27502a("firebase_database_url"), nVar.mo27502a("ga_trackingId"), nVar.mo27502a("gcm_defaultSenderId"), nVar.mo27502a("google_storage_bucket"), nVar.mo27502a("project_id"));
        return bVar;
    }

    /* renamed from: b */
    public String mo32164b() {
        return this.f28609e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C11021b)) {
            return false;
        }
        C11021b bVar = (C11021b) obj;
        if (C10120k.m25501a(this.f28606b, bVar.f28606b) && C10120k.m25501a(this.f28605a, bVar.f28605a) && C10120k.m25501a(this.f28607c, bVar.f28607c) && C10120k.m25501a(this.f28608d, bVar.f28608d) && C10120k.m25501a(this.f28609e, bVar.f28609e) && C10120k.m25501a(this.f28610f, bVar.f28610f) && C10120k.m25501a(this.f28611g, bVar.f28611g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C10120k.m25499a(this.f28606b, this.f28605a, this.f28607c, this.f28608d, this.f28609e, this.f28610f, this.f28611g);
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("applicationId", this.f28606b);
        a.mo27499a("apiKey", this.f28605a);
        a.mo27499a("databaseUrl", this.f28607c);
        a.mo27499a("gcmSenderId", this.f28609e);
        a.mo27499a("storageBucket", this.f28610f);
        a.mo27499a("projectId", this.f28611g);
        return a.toString();
    }

    /* renamed from: a */
    public String mo32163a() {
        return this.f28606b;
    }
}
