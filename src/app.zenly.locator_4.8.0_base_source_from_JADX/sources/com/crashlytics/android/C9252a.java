package com.crashlytics.android;

import com.crashlytics.android.answers.C9256b;
import com.crashlytics.android.core.C9382l;
import com.crashlytics.android.p302c.C9300a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.KitGroup;

/* renamed from: com.crashlytics.android.a */
public class C9252a extends C12161g<Void> implements KitGroup {

    /* renamed from: k */
    public final C9382l f24024k;

    /* renamed from: l */
    public final Collection<? extends C12161g> f24025l;

    public C9252a() {
        this(new C9256b(), new C9300a(), new C9382l());
    }

    /* renamed from: b */
    public static void m22277b(String str) {
        m22278l();
        m22279m().f24024k.mo25194b(str);
    }

    /* renamed from: l */
    private static void m22278l() {
        if (m22279m() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }

    /* renamed from: m */
    public static C9252a m22279m() {
        return (C9252a) C12154c.m32104a(C9252a.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void m22281a() {
        return null;
    }

    /* renamed from: f */
    public String mo24943f() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public Collection<? extends C12161g> getKits() {
        return this.f24025l;
    }

    /* renamed from: h */
    public String mo24945h() {
        return "2.9.9.32";
    }

    C9252a(C9256b bVar, C9300a aVar, C9382l lVar) {
        this.f24024k = lVar;
        this.f24025l = Collections.unmodifiableCollection(Arrays.asList(new C12161g[]{bVar, aVar, lVar}));
    }

    /* renamed from: a */
    public static void m22276a(Throwable th) {
        m22278l();
        m22279m().f24024k.mo25192a(th);
    }

    /* renamed from: a */
    public static void m22273a(String str) {
        m22278l();
        m22279m().f24024k.mo25189a(str);
    }

    /* renamed from: a */
    public static void m22272a(int i, String str, String str2) {
        m22278l();
        m22279m().f24024k.mo25187a(i, str, str2);
    }

    /* renamed from: a */
    public static void m22274a(String str, String str2) {
        m22278l();
        m22279m().f24024k.mo25190a(str, str2);
    }

    /* renamed from: a */
    public static void m22275a(String str, boolean z) {
        m22278l();
        m22279m().f24024k.mo25191a(str, z);
    }
}
