package zendesk.core;

import com.zendesk.logger.Logger;
import java.util.Date;

class ZendeskCoreSettingsStorage implements CoreSettingsStorage {
    static final BlipsSettings DEFAULT_BLIPS_SETTINGS = new BlipsSettings(new BlipsPermissions());
    static final CoreSettings DEFAULT_CORE_SETTINGS = new CoreSettings(new Date(0), null);
    private final SettingsStorage settingsStorage;

    ZendeskCoreSettingsStorage(SettingsStorage settingsStorage2) {
        this.settingsStorage = settingsStorage2;
    }

    public BlipsSettings getBlipsSettings() {
        BlipsSettings blipsSettings = (BlipsSettings) this.settingsStorage.getSettings("blips", BlipsSettings.class);
        if (blipsSettings != null) {
            return blipsSettings;
        }
        Logger.m31608a("ZendeskCoreSettingsStorage", "Unable to load blips settings, returning defaults.", new Object[0]);
        return DEFAULT_BLIPS_SETTINGS;
    }

    public CoreSettings getCoreSettings() {
        CoreSettings coreSettings = (CoreSettings) this.settingsStorage.getSettings("core", CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        Logger.m31608a("ZendeskCoreSettingsStorage", "Unable to load Core SDK Settings, returning default settings.", new Object[0]);
        return DEFAULT_CORE_SETTINGS;
    }
}
