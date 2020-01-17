package zendesk.core;

import java.util.Map;

public class PageView {
    private String channel;
    private String navigatorLanguage;
    private String pageTitle;
    private String url;
    private Map<String, Object> value;
    private String version;

    public PageView(String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        this.version = str;
        this.channel = str2;
        this.url = str3;
        this.navigatorLanguage = str4;
        this.pageTitle = str5;
        this.value = map;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getNavigatorLanguage() {
        return this.navigatorLanguage;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public String getUrl() {
        return this.url;
    }

    public Map<String, Object> getValue() {
        return this.value;
    }

    public String getVersion() {
        return this.version;
    }
}
