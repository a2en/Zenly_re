package zendesk.support;

import com.zendesk.service.C12008e;
import java.util.Date;
import java.util.List;

public interface RequestProvider {
    void addComment(String str, EndUserComment endUserComment, C12008e<Comment> eVar);

    void createRequest(CreateRequest createRequest, C12008e<Request> eVar);

    void getAllRequests(C12008e<List<Request>> eVar);

    void getComments(String str, C12008e<CommentsResponse> eVar);

    void getCommentsSince(String str, Date date, boolean z, C12008e<CommentsResponse> eVar);

    void getRequest(String str, C12008e<Request> eVar);

    void getRequests(String str, C12008e<List<Request>> eVar);

    void getTicketFormsById(List<Long> list, C12008e<List<TicketForm>> eVar);

    void getUpdatesForDevice(C12008e<RequestUpdates> eVar);

    void markRequestAsRead(String str, int i);

    void markRequestAsUnread(String str);
}
