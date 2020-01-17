package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import p389io.fabric.sdk.android.services.persistence.C12246b;
import p389io.fabric.sdk.android.services.persistence.PreferenceStore;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: com.crashlytics.android.core.g0 */
class C9320g0 {

    /* renamed from: a */
    private final PreferenceStore f24182a;

    /* renamed from: b */
    private final C9382l f24183b;

    public C9320g0(PreferenceStore preferenceStore, C9382l lVar) {
        this.f24182a = preferenceStore;
        this.f24183b = lVar;
    }

    /* renamed from: a */
    public static C9320g0 m22525a(PreferenceStore preferenceStore, C9382l lVar) {
        return new C9320g0(preferenceStore, lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25114a(boolean z) {
        PreferenceStore preferenceStore = this.f24182a;
        preferenceStore.save(preferenceStore.edit().putBoolean("always_send_reports_opt_in", z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25115a() {
        String str = "preferences_migration_complete";
        String str2 = "always_send_reports_opt_in";
        if (!this.f24182a.get().contains(str)) {
            C12246b bVar = new C12246b(this.f24183b);
            if (!this.f24182a.get().contains(str2) && bVar.get().contains(str2)) {
                boolean z = bVar.get().getBoolean(str2, false);
                PreferenceStore preferenceStore = this.f24182a;
                preferenceStore.save(preferenceStore.edit().putBoolean(str2, z));
            }
            PreferenceStore preferenceStore2 = this.f24182a;
            preferenceStore2.save(preferenceStore2.edit().putBoolean(str, true));
        }
        return this.f24182a.get().getBoolean(str2, false);
    }
}
