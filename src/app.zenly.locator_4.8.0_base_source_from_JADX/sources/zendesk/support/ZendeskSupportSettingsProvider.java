package zendesk.support;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import java.util.Locale;
import zendesk.core.AuthenticationType;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;

class ZendeskSupportSettingsProvider implements SupportSettingsProvider {
    private final Locale deviceLocale;
    private final HelpCenterLocaleConverter localeConverter;
    /* access modifiers changed from: private */
    public final SettingsProvider sdkSettingsProvider;

    class LoadHelpCenterSettings extends C12008e<SettingsPack<HelpCenterSettings>> {
        private final C12008e<SupportSdkSettings> callback;
        private final SettingsPack<SupportSettings> supportSettingsPack;

        LoadHelpCenterSettings(C12008e<SupportSdkSettings> eVar, SettingsPack<SupportSettings> settingsPack) {
            this.callback = eVar;
            this.supportSettingsPack = settingsPack;
        }

        public void onError(ErrorResponse errorResponse) {
            if (this.callback != null) {
                Logger.m31608a("ZendeskSettingsProvider", "Returning default Help Center Settings.", new Object[0]);
                this.callback.onSuccess(new SupportSdkSettings((SupportSettings) this.supportSettingsPack.getSettings(), HelpCenterSettings.defaultSettings(), this.supportSettingsPack.getCoreSettings().getAuthentication()));
            }
        }

        public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
            HelpCenterSettings helpCenterSettings = (HelpCenterSettings) settingsPack.getSettings();
            AuthenticationType authentication = settingsPack.getCoreSettings().getAuthentication();
            ZendeskSupportSettingsProvider.this.logIfLocaleNotAvailable(helpCenterSettings);
            Logger.m31608a("ZendeskSettingsProvider", "Successfully retrieved Settings", new Object[0]);
            C12008e<SupportSdkSettings> eVar = this.callback;
            if (eVar != null) {
                eVar.onSuccess(new SupportSdkSettings((SupportSettings) this.supportSettingsPack.getSettings(), helpCenterSettings, authentication));
            }
        }
    }

    class LoadSupportSettings extends C12008e<SettingsPack<SupportSettings>> {
        private final C12008e<SupportSdkSettings> callback;

        LoadSupportSettings(C12008e<SupportSdkSettings> eVar) {
            this.callback = eVar;
        }

        public void onError(ErrorResponse errorResponse) {
            if (this.callback != null) {
                Logger.m31608a("ZendeskSettingsProvider", "Returning default Support Settings.", new Object[0]);
                this.callback.onSuccess(new SupportSdkSettings(SupportSettings.defaultSettings(), HelpCenterSettings.defaultSettings(), null));
            }
        }

        public void onSuccess(SettingsPack<SupportSettings> settingsPack) {
            String str = "help_center";
            ZendeskSupportSettingsProvider.this.sdkSettingsProvider.getSettingsForSdk(str, HelpCenterSettings.class, new LoadHelpCenterSettings(this.callback, settingsPack));
        }
    }

    ZendeskSupportSettingsProvider(SettingsProvider settingsProvider, HelpCenterLocaleConverter helpCenterLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = helpCenterLocaleConverter;
        this.deviceLocale = locale;
    }

    /* access modifiers changed from: private */
    public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(this.deviceLocale);
        if (!helpCenterLocaleString.equals(helpCenterSettings.getLocale())) {
            Logger.m31614d("ZendeskSettingsProvider", "No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
        }
    }

    public void getSettings(C12008e<SupportSdkSettings> eVar) {
        LoadSupportSettings loadSupportSettings = new LoadSupportSettings(eVar);
        this.sdkSettingsProvider.getSettingsForSdk("support", SupportSettings.class, loadSupportSettings);
    }
}
