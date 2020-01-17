package zendesk.support;

import android.content.SharedPreferences;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class LegacyRequestMigrator implements RequestMigrator {
    private SharedPreferences legacyRequestStorage;

    LegacyRequestMigrator(SharedPreferences sharedPreferences) {
        this.legacyRequestStorage = sharedPreferences;
    }

    private String getCommentCountKey(String str) {
        return String.format(Locale.US, "%s-%s", new Object[]{"request-id-cc", str});
    }

    public void clearLegacyRequestStorage() {
        this.legacyRequestStorage.edit().clear().apply();
    }

    public List<RequestData> getLegacyRequests() {
        String string = this.legacyRequestStorage.getString("stored_requests", null);
        if (C12017g.m31659c(string)) {
            return Collections.emptyList();
        }
        Logger.m31608a("LegacyRequestMigrator", "Migrating legacy request IDs.", new Object[0]);
        List<String> a = C12017g.m31654a(string);
        ArrayList arrayList = new ArrayList(a.size());
        for (String str : a) {
            int i = this.legacyRequestStorage.getInt(getCommentCountKey(str), -1);
            if (i > -1) {
                arrayList.add(RequestData.create(str, i, 0));
            } else {
                arrayList.add(RequestData.create(str, 0, 0));
            }
        }
        return arrayList;
    }
}
