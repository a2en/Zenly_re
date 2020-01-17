package zendesk.core;

import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13446b;
import retrofit2.p427m.C13449e;
import retrofit2.p427m.C13456l;
import retrofit2.p427m.C13457m;
import retrofit2.p427m.C13461q;

interface UserService {
    @C13456l("/api/mobile/user_tags.json")
    Call<UserResponse> addTags(@C13445a UserTagRequest userTagRequest);

    @C13446b("/api/mobile/user_tags/destroy_many.json")
    Call<UserResponse> deleteTags(@C13461q("tags") String str);

    @C13449e("/api/mobile/users/me.json")
    Call<UserResponse> getUser();

    @C13449e("/api/mobile/user_fields.json")
    Call<UserFieldResponse> getUserFields();

    @C13457m("/api/mobile/users/me.json")
    Call<UserResponse> setUserFields(@C13445a UserFieldRequest userFieldRequest);
}
