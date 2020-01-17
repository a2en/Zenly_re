package com.evernote.android.job.util;

/* renamed from: com.evernote.android.job.util.a */
public final class C9467a {

    /* renamed from: c */
    public static final C9467a f24525c = new C9467a(false, 1.0f);

    /* renamed from: a */
    private final boolean f24526a;

    /* renamed from: b */
    private final float f24527b;

    C9467a(boolean z, float f) {
        this.f24526a = z;
        this.f24527b = f;
    }

    /* renamed from: a */
    public boolean mo25406a() {
        return this.f24527b < 0.15f && !this.f24526a;
    }

    /* renamed from: b */
    public boolean mo25407b() {
        return this.f24526a;
    }
}
