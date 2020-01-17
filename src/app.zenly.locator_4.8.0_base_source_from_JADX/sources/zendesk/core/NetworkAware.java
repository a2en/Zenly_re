package zendesk.core;

public interface NetworkAware {
    void onNetworkAvailable();

    void onNetworkUnavailable();
}
