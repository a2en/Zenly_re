package zendesk.support;

import com.zendesk.service.C12008e;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

class ZendeskRequestService {
    private final DateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    private final RequestExtractor<RequestResponse, Request> requestExtractor = new RequestExtractor<RequestResponse, Request>(this) {
        public Request extract(RequestResponse requestResponse) {
            Map access$000 = ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents());
            Request request = requestResponse.getRequest();
            ZendeskRequestService.updateLastCommentingAgents(request, access$000);
            return request;
        }
    };
    private final RequestService requestService;
    private final RequestExtractor<RequestsResponse, List<Request>> requestsExtractor = new RequestExtractor<RequestsResponse, List<Request>>(this) {
        public List<Request> extract(RequestsResponse requestsResponse) {
            Map access$000 = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
            ArrayList arrayList = new ArrayList();
            for (Request request : requestsResponse.getRequests()) {
                ZendeskRequestService.updateLastCommentingAgents(request, access$000);
                arrayList.add(request);
            }
            return arrayList;
        }
    };

    ZendeskRequestService(RequestService requestService2) {
        this.requestService = requestService2;
        this.iso8601.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User user : list) {
            User user2 = new User(user.getId(), user.getName(), user.getPhoto(), true, Long.valueOf(-1), null, null);
            hashMap.put(user.getId(), user2);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        for (Long l : request.getLastCommentingAgentsIds()) {
            arrayList.add(map.get(l));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }

    /* access modifiers changed from: 0000 */
    public void addComment(String str, EndUserComment endUserComment, C12008e<Request> eVar) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<RequestResponse, Request>(this) {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void createRequest(String str, CreateRequest createRequest, C12008e<Request> eVar) {
        CreateRequestWrapper createRequestWrapper = new CreateRequestWrapper();
        createRequestWrapper.setRequest(createRequest);
        this.requestService.createRequest(str, createRequestWrapper).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<RequestResponse, Request>(this) {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    public void getAllRequests(String str, String str2, C12008e<List<Request>> eVar) {
        this.requestService.getAllRequests(str, str2).enqueue(new RetrofitZendeskCallbackAdapter(eVar, this.requestsExtractor));
    }

    /* access modifiers changed from: 0000 */
    public void getComments(String str, C12008e<CommentsResponse> eVar) {
        this.requestService.getComments(str).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    /* access modifiers changed from: 0000 */
    public void getCommentsSince(String str, Date date, boolean z, C12008e<CommentsResponse> eVar) {
        this.requestService.getCommentsSince(str, this.iso8601.format(date), z ? "agent" : null).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    /* access modifiers changed from: 0000 */
    public void getRequest(String str, String str2, C12008e<Request> eVar) {
        this.requestService.getRequest(str, str2).enqueue(new RetrofitZendeskCallbackAdapter(eVar, this.requestExtractor));
    }

    /* access modifiers changed from: 0000 */
    public void getTicketFormsById(String str, C12008e<RawTicketFormResponse> eVar) {
        this.requestService.getTicketFormsById(str, "ticket_fields").enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    /* access modifiers changed from: 0000 */
    public void getAllRequests(String str, String str2, String str3, C12008e<List<Request>> eVar) {
        this.requestService.getManyRequests(str, str2, str3).enqueue(new RetrofitZendeskCallbackAdapter(eVar, this.requestsExtractor));
    }
}
