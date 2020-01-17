package zendesk.core;

import com.google.gson.JsonElement;
import java.util.Map;
import retrofit2.Call;
import retrofit2.p427m.C13449e;
import retrofit2.p427m.C13452h;
import retrofit2.p427m.C13460p;

interface SdkSettingsService {
    @C13449e("/api/private/mobile_sdk/settings/{applicationId}.json")
    Call<Map<String, JsonElement>> getSettings(@C13452h("Accept-Language") String str, @C13460p("applicationId") String str2);
}
