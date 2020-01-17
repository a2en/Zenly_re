package com.wonderkiln.camerakit;

import android.os.Bundle;

/* renamed from: com.wonderkiln.camerakit.e */
public class C11970e {

    /* renamed from: a */
    private String f31208a;

    /* renamed from: b */
    private String f31209b;

    /* renamed from: c */
    private Bundle f31210c;

    private C11970e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35555a(String str) {
        this.f31209b = str;
    }

    /* renamed from: b */
    public String mo35556b() {
        String str = this.f31209b;
        return str != null ? str : "";
    }

    /* renamed from: c */
    public String mo35557c() {
        return this.f31208a;
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{mo35557c(), mo35556b()});
    }

    C11970e(String str) {
        this.f31208a = str;
        this.f31210c = new Bundle();
    }

    /* renamed from: a */
    public Bundle mo35554a() {
        Bundle bundle = this.f31210c;
        if (bundle != null) {
            return bundle;
        }
        return new Bundle();
    }
}
