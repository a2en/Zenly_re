package zendesk.core;

import android.content.Context;
import com.google.gson.C11118c;
import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12009f;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.C13310a;

class ZendeskApplicationModule {
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    ZendeskApplicationModule(Context context2, ApplicationConfiguration applicationConfiguration2) {
        this.context = context2.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration2;
    }

    static DeviceInfo provideDeviceInfo(Context context2) {
        return new DeviceInfo(context2);
    }

    static ExecutorService provideExecutor() {
        return Executors.newCachedThreadPool(new ThreadFactory() {
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, String.format(Locale.ENGLISH, "ZendeskThread-%d", new Object[]{Integer.valueOf(this.atomicInteger.getAndIncrement())}));
                thread.setPriority(10);
                return thread;
            }
        });
    }

    static C11125d provideGson() {
        C11132e eVar = new C11132e();
        eVar.mo32478a(C11118c.LOWER_CASE_WITH_UNDERSCORES);
        eVar.mo32480a(128, 8);
        eVar.mo32479a(Date.class, new C12009f());
        return eVar.mo32476a();
    }

    static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.mo38235a(Logger.m31611b() ? C13310a.BASIC : C13310a.NONE);
        return httpLoggingInterceptor;
    }

    static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        ZendeskShadow zendeskShadow = new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
        return zendeskShadow;
    }

    /* access modifiers changed from: 0000 */
    public ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    /* access modifiers changed from: 0000 */
    public Context provideApplicationContext() {
        return this.context;
    }

    /* access modifiers changed from: 0000 */
    public Serializer provideBase64Serializer(Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }
}
