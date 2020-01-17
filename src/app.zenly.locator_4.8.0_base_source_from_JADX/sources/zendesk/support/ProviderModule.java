package zendesk.support;

import java.util.Locale;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.RestServiceProvider;
import zendesk.core.SettingsProvider;

class ProviderModule {
    ProviderModule() {
    }

    /* access modifiers changed from: 0000 */
    public HelpCenterLocaleConverter provideHelpCenterLocaleConverter() {
        return new HelpCenterLocaleConverter();
    }

    /* access modifiers changed from: 0000 */
    public HelpCenterProvider provideHelpCenterProvider(SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache, ZendeskTracker zendeskTracker) {
        ZendeskHelpCenterProvider zendeskHelpCenterProvider = new ZendeskHelpCenterProvider(supportSettingsProvider, supportBlipsProvider, zendeskHelpCenterService, helpCenterSessionCache, zendeskTracker);
        return zendeskHelpCenterProvider;
    }

    /* access modifiers changed from: 0000 */
    public ProviderStore provideProviderStore(HelpCenterProvider helpCenterProvider, RequestProvider requestProvider, UploadProvider uploadProvider) {
        return new ZendeskProviderStore(helpCenterProvider, requestProvider, uploadProvider);
    }

    /* access modifiers changed from: 0000 */
    public RequestProvider provideRequestProvider(SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider, ZendeskRequestService zendeskRequestService, RequestStorage requestStorage, RequestSessionCache requestSessionCache, ZendeskTracker zendeskTracker, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        ZendeskRequestProvider zendeskRequestProvider = new ZendeskRequestProvider(supportSettingsProvider, zendeskRequestService, authenticationProvider, requestStorage, requestSessionCache, zendeskTracker, supportSdkMetadata, supportBlipsProvider);
        return zendeskRequestProvider;
    }

    /* access modifiers changed from: 0000 */
    public SupportSettingsProvider provideSdkSettingsProvider(SettingsProvider settingsProvider, Locale locale, HelpCenterLocaleConverter helpCenterLocaleConverter) {
        return new ZendeskSupportSettingsProvider(settingsProvider, helpCenterLocaleConverter, locale);
    }

    /* access modifiers changed from: 0000 */
    public SupportBlipsProvider provideSupportBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        return new ZendeskSupportBlipsProvider(blipsProvider, locale);
    }

    /* access modifiers changed from: 0000 */
    public SupportModule provideSupportModule(RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider, SupportBlipsProvider supportBlipsProvider, ZendeskTracker zendeskTracker, ArticleVoteStorage articleVoteStorage) {
        SupportModule supportModule = new SupportModule(requestProvider, uploadProvider, helpCenterProvider, supportSettingsProvider, supportBlipsProvider, restServiceProvider.getMediaOkHttpClient(), zendeskTracker, articleVoteStorage);
        return supportModule;
    }

    /* access modifiers changed from: 0000 */
    public UploadProvider provideUploadProvider(ZendeskUploadService zendeskUploadService) {
        return new ZendeskUploadProvider(zendeskUploadService);
    }
}
