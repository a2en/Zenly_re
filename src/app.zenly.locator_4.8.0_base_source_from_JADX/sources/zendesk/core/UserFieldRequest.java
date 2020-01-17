package zendesk.core;

import java.util.HashMap;
import java.util.Map;

class UserFieldRequest {
    UserFieldRequest(Map<String, String> map) {
        new HashMap().put("user_fields", map);
    }
}
