package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C10113h {

    /* renamed from: a */
    private static final Object f26612a = new Object();

    /* renamed from: b */
    private static C10113h f26613b;

    /* renamed from: com.google.android.gms.common.internal.h$a */
    protected static final class C10114a {

        /* renamed from: f */
        private static final Uri f26614f = new Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a */
        private final String f26615a;

        /* renamed from: b */
        private final String f26616b;

        /* renamed from: c */
        private final ComponentName f26617c;

        /* renamed from: d */
        private final int f26618d;

        /* renamed from: e */
        private final boolean f26619e;

        public C10114a(String str, String str2, int i) {
            this(str, str2, i, false);
        }

        /* renamed from: a */
        public final ComponentName mo27471a() {
            return this.f26617c;
        }

        /* renamed from: b */
        public final String mo27473b() {
            return this.f26616b;
        }

        /* renamed from: c */
        public final int mo27474c() {
            return this.f26618d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10114a)) {
                return false;
            }
            C10114a aVar = (C10114a) obj;
            return C10120k.m25501a(this.f26615a, aVar.f26615a) && C10120k.m25501a(this.f26616b, aVar.f26616b) && C10120k.m25501a(this.f26617c, aVar.f26617c) && this.f26618d == aVar.f26618d && this.f26619e == aVar.f26619e;
        }

        public final int hashCode() {
            return C10120k.m25499a(this.f26615a, this.f26616b, this.f26617c, Integer.valueOf(this.f26618d), Boolean.valueOf(this.f26619e));
        }

        public final String toString() {
            String str = this.f26615a;
            return str == null ? this.f26617c.flattenToString() : str;
        }

        public C10114a(String str, String str2, int i, boolean z) {
            C10123l.m25515b(str);
            this.f26615a = str;
            C10123l.m25515b(str2);
            this.f26616b = str2;
            this.f26617c = null;
            this.f26618d = i;
            this.f26619e = z;
        }

        /* renamed from: a */
        public final Intent mo27472a(Context context) {
            if (this.f26615a == null) {
                return new Intent().setComponent(this.f26617c);
            }
            Intent intent = null;
            if (this.f26619e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.f26615a);
                Bundle call = context.getContentResolver().call(f26614f, "serviceIntentCall", null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String str = "Dynamic lookup for intent failed for action: ";
                    String valueOf = String.valueOf(this.f26615a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            if (intent == null) {
                return new Intent(this.f26615a).setPackage(this.f26616b);
            }
            return intent;
        }
    }

    /* renamed from: a */
    public static C10113h m25475a(Context context) {
        synchronized (f26612a) {
            if (f26613b == null) {
                f26613b = new C10110f0(context.getApplicationContext());
            }
        }
        return f26613b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo27466a(C10114a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo27467b(C10114a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public final void mo27470a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo27467b(new C10114a(str, str2, i), serviceConnection, str3);
    }
}
