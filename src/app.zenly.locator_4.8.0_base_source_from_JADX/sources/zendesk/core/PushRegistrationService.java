package zendesk.core;

import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13446b;
import retrofit2.p427m.C13456l;
import retrofit2.p427m.C13460p;

interface PushRegistrationService {
    @C13456l("/api/mobile/push_notification_devices.json")
    Call<PushRegistrationResponseWrapper> registerDevice(@C13445a PushRegistrationRequestWrapper pushRegistrationRequestWrapper);

    @C13446b("/api/mobile/push_notification_devices/{id}.json")
    Call<Void> unregisterDevice(@C13460p("id") String str);
}
