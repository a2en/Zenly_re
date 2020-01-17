package zendesk.support;

import okhttp3.C13333z;
import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13446b;
import retrofit2.p427m.C13456l;
import retrofit2.p427m.C13460p;
import retrofit2.p427m.C13461q;

interface UploadService {
    @C13446b("/api/mobile/uploads/{token}.json")
    Call<Void> deleteAttachment(@C13460p("token") String str);

    @C13456l("/api/mobile/uploads.json")
    Call<UploadResponseWrapper> uploadAttachment(@C13461q("filename") String str, @C13445a C13333z zVar);
}
