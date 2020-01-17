package zendesk.core;

import com.zendesk.service.C12008e;

public interface SettingsProvider {
    void getCoreSettings(C12008e<CoreSettings> eVar);

    <E extends Settings> void getSettingsForSdk(String str, Class<E> cls, C12008e<SettingsPack<E>> eVar);
}
