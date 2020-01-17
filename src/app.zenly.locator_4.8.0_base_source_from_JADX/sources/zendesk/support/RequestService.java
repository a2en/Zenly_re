package zendesk.support;

import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13449e;
import retrofit2.p427m.C13452h;
import retrofit2.p427m.C13456l;
import retrofit2.p427m.C13457m;
import retrofit2.p427m.C13460p;
import retrofit2.p427m.C13461q;

interface RequestService {
    @C13457m("/api/mobile/requests/{id}.json?include=last_comment")
    Call<RequestResponse> addComment(@C13460p("id") String str, @C13445a UpdateRequestWrapper updateRequestWrapper);

    @C13456l("/api/mobile/requests.json?include=last_comment")
    Call<RequestResponse> createRequest(@C13452h("Mobile-Sdk-Identity") String str, @C13445a CreateRequestWrapper createRequestWrapper);

    @C13449e("/api/mobile/requests.json?sort_by=updated_at&sort_order=desc")
    Call<RequestsResponse> getAllRequests(@C13461q("status") String str, @C13461q("include") String str2);

    @C13449e("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    Call<CommentsResponse> getComments(@C13460p("id") String str);

    @C13449e("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    Call<CommentsResponse> getCommentsSince(@C13460p("id") String str, @C13461q("since") String str2, @C13461q("role") String str3);

    @C13449e("/api/mobile/requests/show_many.json?sort_order=desc")
    Call<RequestsResponse> getManyRequests(@C13461q("tokens") String str, @C13461q("status") String str2, @C13461q("include") String str3);

    @C13449e("/api/mobile/requests/{id}.json")
    Call<RequestResponse> getRequest(@C13460p("id") String str, @C13461q("include") String str2);

    @C13449e("/api/v2/ticket_forms/show_many.json?active=true")
    Call<RawTicketFormResponse> getTicketFormsById(@C13461q("ids") String str, @C13461q("include") String str2);
}
