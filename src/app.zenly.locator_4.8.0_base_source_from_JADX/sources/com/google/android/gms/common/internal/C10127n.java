package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C10076g;

/* renamed from: com.google.android.gms.common.internal.n */
public class C10127n {

    /* renamed from: a */
    private final Resources f26640a;

    /* renamed from: b */
    private final String f26641b = this.f26640a.getResourcePackageName(C10076g.common_google_play_services_unknown_issue);

    public C10127n(Context context) {
        C10123l.m25505a(context);
        this.f26640a = context.getResources();
    }

    /* renamed from: a */
    public String mo27502a(String str) {
        int identifier = this.f26640a.getIdentifier(str, "string", this.f26641b);
        if (identifier == 0) {
            return null;
        }
        return this.f26640a.getString(identifier);
    }
}
