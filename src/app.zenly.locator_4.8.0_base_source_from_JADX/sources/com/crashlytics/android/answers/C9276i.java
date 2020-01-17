package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import p389io.fabric.sdk.android.services.persistence.C12246b;
import p389io.fabric.sdk.android.services.persistence.PreferenceStore;

/* renamed from: com.crashlytics.android.answers.i */
class C9276i {

    /* renamed from: a */
    private final PreferenceStore f24104a;

    C9276i(PreferenceStore preferenceStore) {
        this.f24104a = preferenceStore;
    }

    /* renamed from: a */
    public static C9276i m22349a(Context context) {
        return new C9276i(new C12246b(context, "settings"));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public void mo25007b() {
        PreferenceStore preferenceStore = this.f24104a;
        preferenceStore.save(preferenceStore.edit().putBoolean("analytics_launched", true));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo25006a() {
        return this.f24104a.get().getBoolean("analytics_launched", false);
    }
}
