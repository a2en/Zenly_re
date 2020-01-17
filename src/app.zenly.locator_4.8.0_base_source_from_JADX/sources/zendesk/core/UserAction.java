package zendesk.core;

import java.util.Map;

public class UserAction {
    private String action;
    private String category;
    private String channel;
    private String label;
    private Map<String, Object> value;
    private String version;

    public UserAction(String str, String str2, String str3, String str4) {
        this.version = str;
        this.channel = str2;
        this.category = str3;
        this.action = str4;
    }

    public String getAction() {
        return this.action;
    }

    public String getCategory() {
        return this.category;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getLabel() {
        return this.label;
    }

    public Map<String, Object> getValue() {
        return this.value;
    }

    public String getVersion() {
        return this.version;
    }

    public UserAction(String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        this.version = str;
        this.channel = str2;
        this.category = str3;
        this.action = str4;
        this.label = str5;
        this.value = map;
    }
}
