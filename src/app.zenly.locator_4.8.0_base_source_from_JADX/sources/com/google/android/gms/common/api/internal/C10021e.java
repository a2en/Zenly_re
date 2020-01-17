package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.api.internal.e */
public class C10021e {

    /* renamed from: a */
    private final Object f26378a;

    public C10021e(Activity activity) {
        C10123l.m25506a(activity, (Object) "Activity must not be null");
        this.f26378a = activity;
    }

    /* renamed from: a */
    public Activity mo27193a() {
        return (Activity) this.f26378a;
    }

    /* renamed from: b */
    public FragmentActivity mo27194b() {
        return (FragmentActivity) this.f26378a;
    }

    /* renamed from: c */
    public boolean mo27195c() {
        return this.f26378a instanceof FragmentActivity;
    }

    /* renamed from: d */
    public final boolean mo27196d() {
        return this.f26378a instanceof Activity;
    }
}
