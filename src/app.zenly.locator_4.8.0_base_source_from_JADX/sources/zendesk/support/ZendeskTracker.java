package zendesk.support;

interface ZendeskTracker {
    void helpCenterArticleViewed();

    void helpCenterLoaded();

    void helpCenterSearched(String str);

    void requestCreated();

    void requestUpdated();
}
