package zendesk.support;

class ZendeskProviderStore implements ProviderStore {
    private final HelpCenterProvider helpCenterProvider;
    private final RequestProvider requestProvider;
    private final UploadProvider uploadProvider;

    ZendeskProviderStore(HelpCenterProvider helpCenterProvider2, RequestProvider requestProvider2, UploadProvider uploadProvider2) {
        this.helpCenterProvider = helpCenterProvider2;
        this.requestProvider = requestProvider2;
        this.uploadProvider = uploadProvider2;
    }

    public HelpCenterProvider helpCenterProvider() {
        return this.helpCenterProvider;
    }

    public RequestProvider requestProvider() {
        return this.requestProvider;
    }

    public UploadProvider uploadProvider() {
        return this.uploadProvider;
    }
}
