package zendesk.support;

import zendesk.core.RestServiceProvider;

class ServiceModule {
    static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        return new HelpCenterCachingNetworkConfig(helpCenterCachingInterceptor);
    }

    static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return new HelpCenterCachingInterceptor();
    }

    static ZendeskHelpCenterService provideZendeskHelpCenterService(HelpCenterService helpCenterService, HelpCenterLocaleConverter helpCenterLocaleConverter) {
        return new ZendeskHelpCenterService(helpCenterService, helpCenterLocaleConverter);
    }

    static ZendeskRequestService provideZendeskRequestService(RequestService requestService) {
        return new ZendeskRequestService(requestService);
    }

    static ZendeskUploadService provideZendeskUploadService(UploadService uploadService) {
        return new ZendeskUploadService(uploadService);
    }

    static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, HelpCenterCachingNetworkConfig helpCenterCachingNetworkConfig) {
        return (HelpCenterService) restServiceProvider.createRestService(HelpCenterService.class, "2.2.1", "Support", helpCenterCachingNetworkConfig);
    }

    static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        return (RequestService) restServiceProvider.createRestService(RequestService.class, "2.2.1", "Support");
    }

    static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        return (UploadService) restServiceProvider.createRestService(UploadService.class, "2.2.1", "Support");
    }
}
