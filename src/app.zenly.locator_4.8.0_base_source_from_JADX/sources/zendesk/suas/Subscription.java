package zendesk.suas;

public interface Subscription {
    void addListener();

    void informWithCurrentState();

    void removeListener();
}
