package zendesk.core;

import retrofit2.Call;
import retrofit2.p427m.C13449e;
import retrofit2.p427m.C13461q;

interface BlipsService {
    @C13449e("/embeddable_blip")
    Call<Void> send(@C13461q("data") String str);
}
