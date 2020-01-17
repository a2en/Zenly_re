package zendesk.core;

import zendesk.core.Settings;

public class SettingsPack<E extends Settings> {
    private CoreSettings coreSettings;
    private E settings;

    SettingsPack(CoreSettings coreSettings2, E e) {
        this.coreSettings = coreSettings2;
        this.settings = e;
    }

    public CoreSettings getCoreSettings() {
        return this.coreSettings;
    }

    public E getSettings() {
        return this.settings;
    }
}
