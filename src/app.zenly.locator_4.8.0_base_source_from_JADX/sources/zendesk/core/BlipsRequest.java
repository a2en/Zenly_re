package zendesk.core;

import java.util.Map;

class BlipsRequest {

    static class ApiPageView {
        ApiPageView(String str, String str2, Map<String, Object> map) {
        }
    }

    static class ApiUserAction {
        ApiUserAction(String str, String str2, String str3, Map<String, Object> map) {
        }
    }

    private BlipsRequest() {
    }

    static BlipsRequest buildPageView(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        new ApiPageView(str7, str8, map);
        return blipsRequest;
    }

    static BlipsRequest buildUserAction(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        new ApiUserAction(str6, str7, str8, map);
        return blipsRequest;
    }
}
