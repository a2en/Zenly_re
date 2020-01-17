package zendesk.core;

public interface NetworkInfoProvider {
    void addNetworkAwareListener(Integer num, NetworkAware networkAware);

    void addRetryAction(Integer num, RetryAction retryAction);

    void clearNetworkAwareListeners();

    void clearRetryActions();

    boolean isNetworkAvailable();

    void register();

    void removeNetworkAwareListener(Integer num);

    void removeRetryAction(Integer num);

    void unregister();
}
