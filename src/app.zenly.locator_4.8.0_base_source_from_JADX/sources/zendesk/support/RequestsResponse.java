package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    RequestsResponse() {
    }

    /* access modifiers changed from: 0000 */
    public List<User> getLastCommentingAgents() {
        return C12010a.m31632a(this.lastCommentingAgents);
    }

    /* access modifiers changed from: 0000 */
    public List<Request> getRequests() {
        return C12010a.m31632a(this.requests);
    }
}
