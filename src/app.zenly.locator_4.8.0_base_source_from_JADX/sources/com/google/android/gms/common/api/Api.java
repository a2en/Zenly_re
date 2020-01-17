package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

public final class Api<O extends ApiOptions> {

    /* renamed from: a */
    private final C9990a<?, O> f26265a;

    /* renamed from: b */
    private final C9993d<?> f26266b;

    /* renamed from: c */
    private final String f26267c;

    public interface AnyClient {
    }

    public interface ApiOptions {

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount getGoogleSignInAccount();
        }

        public interface HasOptions extends ApiOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$a */
        public static final class C9989a implements NotRequiredOptions {
            private C9989a() {
            }
        }
    }

    public interface Client extends AnyClient {
        void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void disconnect();

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        Feature[] getRequiredFeatures();

        Set<Scope> getScopesForConnectionlessNonSignIn();

        IBinder getServiceBrokerBinder();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(SignOutCallbacks signOutCallbacks);

        boolean providesSignIn();

        boolean requiresAccount();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public interface SimpleClient<T extends IInterface> extends AnyClient {
        T createServiceInterface(IBinder iBinder);

        Context getContext();

        String getServiceDescriptor();

        String getStartServiceAction();

        void setState(int i, T t);
    }

    /* renamed from: com.google.android.gms.common.api.Api$a */
    public static abstract class C9990a<T extends Client, O> extends C9992c<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo26974a(Context context, Looper looper, C10103d dVar, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return mo26925a(context, looper, dVar, o, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
        }

        /* renamed from: a */
        public T mo26925a(Context context, Looper looper, C10103d dVar, O o, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$b */
    public static class C9991b<C extends AnyClient> {
    }

    /* renamed from: com.google.android.gms.common.api.Api$c */
    public static abstract class C9992c<T extends AnyClient, O> {
    }

    /* renamed from: com.google.android.gms.common.api.Api$d */
    public static final class C9993d<C extends Client> extends C9991b<C> {
    }

    public <C extends Client> Api(String str, C9990a<C, O> aVar, C9993d<C> dVar) {
        C10123l.m25506a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C10123l.m25506a(dVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f26267c = str;
        this.f26265a = aVar;
        this.f26266b = dVar;
    }

    /* renamed from: a */
    public final C9991b<?> mo27007a() {
        C9993d<?> dVar = this.f26266b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo27008b() {
        return this.f26267c;
    }

    /* renamed from: c */
    public final C9990a<?, O> mo27009c() {
        C10123l.m25517b(this.f26265a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f26265a;
    }
}
