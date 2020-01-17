package com.amplitude.api;

import android.util.Log;

/* renamed from: com.amplitude.api.d */
public class C8681d {

    /* renamed from: c */
    protected static C8681d f22337c = new C8681d();

    /* renamed from: a */
    private volatile boolean f22338a = true;

    /* renamed from: b */
    private volatile int f22339b = 4;

    private C8681d() {
    }

    /* renamed from: a */
    public static C8681d m20309a() {
        return f22337c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo23381b(String str, String str2) {
        if (!this.f22338a || this.f22339b > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo23382c(String str, String str2) {
        if (!this.f22338a || this.f22339b > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo23383d(String str, String str2) {
        if (!this.f22338a || this.f22339b > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo23378a(String str, String str2) {
        if (!this.f22338a || this.f22339b > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo23379a(String str, String str2, Throwable th) {
        if (!this.f22338a || this.f22339b > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo23380a(String str, Throwable th) {
        if (!this.f22338a || this.f22339b > 5) {
            return 0;
        }
        return Log.w(str, th);
    }
}
