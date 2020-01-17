package zendesk.core;

interface CoreSettingsStorage {
    BlipsSettings getBlipsSettings();

    CoreSettings getCoreSettings();
}
