package zendesk.core;

import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public User() {
        Long.valueOf(-1);
    }

    public List<String> getTags() {
        return C12010a.m31632a(this.tags);
    }

    public Map<String, String> getUserFields() {
        return C12010a.m31634a(this.userFields);
    }
}
