package zendesk.core;

import com.zendesk.service.C12008e;

public interface PushRegistrationProvider {
    boolean isRegisteredForPush();

    void registerWithDeviceIdentifier(String str, C12008e<String> eVar);

    void registerWithUAChannelId(String str, C12008e<String> eVar);

    void unregisterDevice(C12008e<Void> eVar);
}
