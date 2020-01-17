package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13328w;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class ZendeskSettingsInterceptor implements Interceptor {
    private final SdkSettingsProviderInternal provider;
    private SettingsStorage settingsStorage;

    ZendeskSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage2) {
        this.provider = sdkSettingsProviderInternal;
        this.settingsStorage = settingsStorage2;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        String str = "SettingsInterceptor";
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            Logger.m31608a(str, "Requesting SDK settings.", new Object[0]);
            if (this.provider.getCoreSettings() == null) {
                Logger.m31608a(str, "Retrieved settings are null. Returning 404.", new Object[0]);
                C13168a aVar = new C13168a();
                aVar.mo37814a(C13328w.HTTP_2);
                aVar.mo37815a(chain.request());
                aVar.mo37808a(chain.request().mo38387e());
                aVar.mo37806a(404);
                return aVar.mo37816a();
            }
        }
        Logger.m31608a(str, "Proceeding with chain.", new Object[0]);
        return chain.proceed(chain.request());
    }
}
