package zendesk.support;

public interface ProviderStore {
    HelpCenterProvider helpCenterProvider();

    RequestProvider requestProvider();

    UploadProvider uploadProvider();
}
