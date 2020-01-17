package zendesk.support;

import com.zendesk.service.C12008e;

public interface SupportSettingsProvider {
    void getSettings(C12008e<SupportSdkSettings> eVar);
}
