package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class RequestResponse {
    private List<User> lastCommentingAgents;
    private Request request;

    RequestResponse() {
    }

    /* access modifiers changed from: 0000 */
    public List<User> getLastCommentingAgents() {
        return C12010a.m31632a(this.lastCommentingAgents);
    }

    /* access modifiers changed from: 0000 */
    public Request getRequest() {
        return this.request;
    }
}
