package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.C0541b;

/* renamed from: com.google.android.gms.internal.clearcut.e */
public abstract class C10297e<T> {

    /* renamed from: g */
    private static final Object f26957g = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h */
    private static Context f26958h;

    /* renamed from: i */
    private static volatile Boolean f26959i;

    /* renamed from: j */
    private static volatile Boolean f26960j;

    /* renamed from: a */
    private final C10362n f26961a;

    /* renamed from: b */
    final String f26962b;

    /* renamed from: c */
    private final String f26963c;

    /* renamed from: d */
    private final T f26964d;

    /* renamed from: e */
    private volatile C10283c f26965e;

    /* renamed from: f */
    private volatile SharedPreferences f26966f;

    private C10297e(C10362n nVar, String str, T t) {
        this.f26965e = null;
        this.f26966f = null;
        if (nVar.f27147a == null && nVar.f27148b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (nVar.f27147a == null || nVar.f27148b == null) {
            this.f26961a = nVar;
            String valueOf = String.valueOf(nVar.f27149c);
            String valueOf2 = String.valueOf(str);
            this.f26963c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(nVar.f27150d);
            String valueOf4 = String.valueOf(str);
            this.f26962b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f26964d = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* synthetic */ C10297e(C10362n nVar, String str, Object obj, C10324i iVar) {
        this(nVar, str, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <T> C10297e<T> m26040a(C10362n nVar, String str, T t, zzan<T> zzan) {
        return new C10350l(nVar, str, t, zzan);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C10297e<String> m26041a(C10362n nVar, String str, String str2) {
        return new C10337k(nVar, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C10297e<Boolean> m26042a(C10362n nVar, String str, boolean z) {
        return new C10330j(nVar, str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    private static <V> V m26043a(C10356m<V> mVar) {
        long clearCallingIdentity;
        try {
            return mVar.mo27899a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = mVar.mo27899a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m26044a(Context context) {
        if (f26958h == null) {
            synchronized (f26957g) {
                if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (f26958h != context) {
                    f26959i = null;
                }
                f26958h = context;
            }
        }
    }

    /* renamed from: a */
    static boolean m26045a(String str, boolean z) {
        if (m26052e()) {
            return ((Boolean) m26043a((C10356m<V>) new C10318h<V>(str, false))).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    /* renamed from: c */
    private final T m26050c() {
        boolean z;
        if (m26045a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String str = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(this.f26962b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (this.f26961a.f27148b != null) {
            if (this.f26965e == null) {
                this.f26965e = C10283c.m25983a(f26958h.getContentResolver(), this.f26961a.f27148b);
            }
            String str2 = (String) m26043a((C10356m<V>) new C10304f<V>(this, this.f26965e));
            if (str2 != null) {
                return mo27885a(str2);
            }
        } else if (this.f26961a.f27147a != null) {
            if (VERSION.SDK_INT < 24 || f26958h.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (f26960j == null || !f26960j.booleanValue()) {
                    f26960j = Boolean.valueOf(((UserManager) f26958h.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = f26960j.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.f26966f == null) {
                this.f26966f = f26958h.getSharedPreferences(this.f26961a.f27147a, 0);
            }
            SharedPreferences sharedPreferences = this.f26966f;
            if (sharedPreferences.contains(this.f26962b)) {
                return mo27884a(sharedPreferences);
            }
        }
        return null;
    }

    /* renamed from: d */
    private final T m26051d() {
        if (!this.f26961a.f27151e && m26052e()) {
            String str = (String) m26043a((C10356m<V>) new C10311g<V>(this));
            if (str != null) {
                return mo27885a(str);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m26052e() {
        if (f26959i == null) {
            Context context = f26958h;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C0541b.m2548a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f26959i = Boolean.valueOf(z);
        }
        return f26959i.booleanValue();
    }

    /* renamed from: a */
    public final T mo27883a() {
        if (f26958h != null) {
            if (this.f26961a.f27152f) {
                T d = m26051d();
                if (d != null) {
                    return d;
                }
                T c = m26050c();
                if (c != null) {
                    return c;
                }
            } else {
                T c2 = m26050c();
                if (c2 != null) {
                    return c2;
                }
                T d2 = m26051d();
                if (d2 != null) {
                    return d2;
                }
            }
            return this.f26964d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo27884a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo27885a(String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo27886b() {
        return C10310f5.m26111a(f26958h.getContentResolver(), this.f26963c, (String) null);
    }
}
