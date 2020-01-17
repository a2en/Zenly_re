package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.android.installreferrer.api.a */
public abstract class C8695a {

    /* renamed from: com.android.installreferrer.api.a$b */
    public static final class C8697b {

        /* renamed from: a */
        private final Context f22388a;

        /* renamed from: a */
        public C8695a mo23483a() {
            Context context = this.f22388a;
            if (context != null) {
                return new C8698b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C8697b(Context context) {
            this.f22388a = context;
        }
    }

    /* renamed from: a */
    public static C8697b m20457a(Context context) {
        return new C8697b(context);
    }

    /* renamed from: a */
    public abstract void mo23479a();

    /* renamed from: a */
    public abstract void mo23480a(InstallReferrerStateListener installReferrerStateListener);

    /* renamed from: b */
    public abstract C8701c mo23481b() throws RemoteException;

    /* renamed from: c */
    public abstract boolean mo23482c();
}
