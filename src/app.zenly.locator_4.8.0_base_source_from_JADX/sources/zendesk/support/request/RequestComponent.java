package zendesk.support.request;

public interface RequestComponent {
    void inject(RequestActivity requestActivity);

    void inject(RequestViewConversationsDisabled requestViewConversationsDisabled);

    void inject(RequestViewConversationsEnabled requestViewConversationsEnabled);
}
