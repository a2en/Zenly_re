package zendesk.support;

interface HelpCenterSessionCache {
    LastSearch getLastSearch();

    boolean isUniqueSearchResultClick();

    void setLastSearch(String str, int i);

    void unsetUniqueSearchResultClick();
}
