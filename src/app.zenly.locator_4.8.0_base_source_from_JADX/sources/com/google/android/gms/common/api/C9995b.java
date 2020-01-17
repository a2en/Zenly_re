package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.C10008a;
import com.google.android.gms.common.api.internal.C10011b;
import com.google.android.gms.common.api.internal.C10014c;
import com.google.android.gms.common.api.internal.C10016d;
import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.common.api.internal.C10022e0;
import com.google.android.gms.common.api.internal.C10025g;
import com.google.android.gms.common.api.internal.C10029i;
import com.google.android.gms.common.api.internal.C10034k;
import com.google.android.gms.common.api.internal.C10040n;
import com.google.android.gms.common.api.internal.C10060x;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.b */
public class C9995b<O extends ApiOptions> implements HasApiKey<O> {

    /* renamed from: a */
    private final Context f26282a;

    /* renamed from: b */
    private final Api<O> f26283b;

    /* renamed from: c */
    private final O f26284c;

    /* renamed from: d */
    private final C10011b<O> f26285d;

    /* renamed from: e */
    private final Looper f26286e;

    /* renamed from: f */
    private final int f26287f;

    /* renamed from: g */
    private final GoogleApiClient f26288g;

    /* renamed from: h */
    private final StatusExceptionMapper f26289h;

    /* renamed from: i */
    protected final C10016d f26290i;

    /* renamed from: com.google.android.gms.common.api.b$a */
    public static class C9996a {

        /* renamed from: c */
        public static final C9996a f26291c = new C9997a().mo27085a();

        /* renamed from: a */
        public final StatusExceptionMapper f26292a;

        /* renamed from: b */
        public final Looper f26293b;

        /* renamed from: com.google.android.gms.common.api.b$a$a */
        public static class C9997a {

            /* renamed from: a */
            private StatusExceptionMapper f26294a;

            /* renamed from: b */
            private Looper f26295b;

            /* renamed from: a */
            public C9997a mo27084a(StatusExceptionMapper statusExceptionMapper) {
                C10123l.m25506a(statusExceptionMapper, (Object) "StatusExceptionMapper must not be null.");
                this.f26294a = statusExceptionMapper;
                return this;
            }

            /* renamed from: a */
            public C9997a mo27083a(Looper looper) {
                C10123l.m25506a(looper, (Object) "Looper must not be null.");
                this.f26295b = looper;
                return this;
            }

            /* renamed from: a */
            public C9996a mo27085a() {
                if (this.f26294a == null) {
                    this.f26294a = new C10008a();
                }
                if (this.f26295b == null) {
                    this.f26295b = Looper.getMainLooper();
                }
                return new C9996a(this.f26294a, this.f26295b);
            }
        }

        private C9996a(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f26292a = statusExceptionMapper;
            this.f26293b = looper;
        }
    }

    public C9995b(Activity activity, Api<O> api, O o, C9996a aVar) {
        C10123l.m25506a(activity, (Object) "Null activity is not permitted.");
        C10123l.m25506a(api, (Object) "Api must not be null.");
        C10123l.m25506a(aVar, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f26282a = activity.getApplicationContext();
        this.f26283b = api;
        this.f26284c = o;
        this.f26286e = aVar.f26293b;
        this.f26285d = C10011b.m25110a(this.f26283b, this.f26284c);
        this.f26288g = new C10060x(this);
        this.f26290i = C10016d.m25126a(this.f26282a);
        this.f26287f = this.f26290i.mo27157a();
        this.f26289h = aVar.f26292a;
        if (!(activity instanceof GoogleApiActivity)) {
            C10040n.m25228a(activity, this.f26290i, this.f26285d);
        }
        this.f26290i.mo27161a(this);
    }

    /* renamed from: a */
    private final <A extends AnyClient, T extends C10014c<? extends Result, A>> T m25055a(int i, T t) {
        t.mo27110b();
        this.f26290i.mo27162a(this, i, (C10014c<? extends Result, AnyClient>) t);
        return t;
    }

    /* renamed from: b */
    public <A extends AnyClient, T extends C10014c<? extends Result, A>> T mo27077b(T t) {
        m25055a(0, t);
        return t;
    }

    /* renamed from: c */
    public <A extends AnyClient, T extends C10014c<? extends Result, A>> T mo27081c(T t) {
        m25055a(1, t);
        return t;
    }

    /* renamed from: d */
    public Looper mo27082d() {
        return this.f26286e;
    }

    public C10011b<O> getApiKey() {
        return this.f26285d;
    }

    /* renamed from: b */
    public <TResult, A extends AnyClient> C10693c<TResult> mo27079b(C10029i<A, TResult> iVar) {
        return m25056a(1, iVar);
    }

    /* renamed from: c */
    public final int mo27080c() {
        return this.f26287f;
    }

    /* renamed from: a */
    private final <TResult, A extends AnyClient> C10693c<TResult> m25056a(int i, C10029i<A, TResult> iVar) {
        C10694d dVar = new C10694d();
        this.f26290i.mo27163a(this, i, iVar, dVar, this.f26289h);
        return dVar.mo29325a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.C10103d.C10104a mo27078b() {
        /*
            r3 = this;
            com.google.android.gms.common.internal.d$a r0 = new com.google.android.gms.common.internal.d$a
            r0.<init>()
            O r1 = r3.f26284c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
            if (r2 == 0) goto L_0x0018
            com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getGoogleSignInAccount()
            if (r1 == 0) goto L_0x0018
            android.accounts.Account r1 = r1.mo26926a()
            goto L_0x0026
        L_0x0018:
            O r1 = r3.f26284c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
            if (r2 == 0) goto L_0x0025
            com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) r1
            android.accounts.Account r1 = r1.getAccount()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0.mo27455a(r1)
            O r1 = r3.f26284c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getGoogleSignInAccount()
            if (r1 == 0) goto L_0x003c
            java.util.Set r1 = r1.mo26936i()
            goto L_0x0040
        L_0x003c:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0040:
            r0.mo27457a(r1)
            android.content.Context r1 = r3.f26282a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.mo27456a(r1)
            android.content.Context r1 = r3.f26282a
            java.lang.String r1 = r1.getPackageName()
            r0.mo27459b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C9995b.mo27078b():com.google.android.gms.common.internal.d$a");
    }

    /* renamed from: a */
    public <TResult, A extends AnyClient> C10693c<TResult> mo27076a(C10029i<A, TResult> iVar) {
        return m25056a(0, iVar);
    }

    /* renamed from: a */
    public <A extends AnyClient, T extends C10014c<? extends Result, A>> T mo27072a(T t) {
        m25055a(2, t);
        return t;
    }

    @Deprecated
    /* renamed from: a */
    public <A extends AnyClient, T extends C10025g<A, ?>, U extends C10034k<A, ?>> C10693c<Void> mo27075a(T t, U u) {
        C10123l.m25505a(t);
        C10123l.m25505a(u);
        String str = "Listener has already been released.";
        C10123l.m25506a(t.mo27203b(), (Object) str);
        C10123l.m25506a(u.mo27213a(), (Object) str);
        C10123l.m25513a(t.mo27203b().equals(u.mo27213a()), (Object) "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f26290i.mo27159a(this, (C10025g<AnyClient, ?>) t, (C10034k<AnyClient, ?>) u);
    }

    public C9995b(Context context, Api<O> api, O o, C9996a aVar) {
        C10123l.m25506a(context, (Object) "Null context is not permitted.");
        C10123l.m25506a(api, (Object) "Api must not be null.");
        C10123l.m25506a(aVar, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f26282a = context.getApplicationContext();
        this.f26283b = api;
        this.f26284c = o;
        this.f26286e = aVar.f26293b;
        this.f26285d = C10011b.m25110a(this.f26283b, this.f26284c);
        this.f26288g = new C10060x(this);
        this.f26290i = C10016d.m25126a(this.f26282a);
        this.f26287f = this.f26290i.mo27157a();
        this.f26289h = aVar.f26292a;
        this.f26290i.mo27161a(this);
    }

    /* renamed from: a */
    public C10693c<Boolean> mo27074a(C10006a<?> aVar) {
        C10123l.m25506a(aVar, (Object) "Listener key cannot be null.");
        return this.f26290i.mo27158a(this, aVar);
    }

    /* renamed from: a */
    public Client mo27070a(Looper looper, C10017a<O> aVar) {
        return this.f26283b.mo27009c().mo26974a(this.f26282a, looper, mo27078b().mo27458a(), this.f26284c, (ConnectionCallbacks) aVar, (OnConnectionFailedListener) aVar);
    }

    /* renamed from: a */
    public GoogleApiClient mo27071a() {
        return this.f26288g;
    }

    /* renamed from: a */
    public C10022e0 mo27073a(Context context, Handler handler) {
        return new C10022e0(context, handler, mo27078b().mo27458a());
    }

    @Deprecated
    public C9995b(Activity activity, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        C9997a aVar = new C9997a();
        aVar.mo27084a(statusExceptionMapper);
        aVar.mo27083a(activity.getMainLooper());
        this(activity, api, o, aVar.mo27085a());
    }

    @Deprecated
    public C9995b(Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        C9997a aVar = new C9997a();
        aVar.mo27084a(statusExceptionMapper);
        this(context, api, o, aVar.mo27085a());
    }
}
