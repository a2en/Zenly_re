package zendesk.support;

public interface SupportBlipsProvider {
    void articleView(Article article);

    void articleVote(Long l, int i);

    void helpCenterSearch(String str);

    void requestCreated(String str);

    void requestListViewed();

    void requestUpdated(String str);

    void requestViewed(String str);

    void supportSdkInit();
}
