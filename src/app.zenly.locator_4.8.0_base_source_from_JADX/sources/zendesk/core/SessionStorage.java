package zendesk.core;

import java.io.File;

public interface SessionStorage {
    void clear();

    BaseStorage getAdditionalSdkStorage();

    File getZendeskCacheDir();

    File getZendeskDataDir();
}
