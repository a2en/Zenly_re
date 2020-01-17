package zendesk.support;

import java.util.List;

interface RequestMigrator {
    void clearLegacyRequestStorage();

    List<RequestData> getLegacyRequests();
}
