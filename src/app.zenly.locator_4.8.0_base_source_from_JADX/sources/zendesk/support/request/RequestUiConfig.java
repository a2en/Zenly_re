package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.support.RequestStatus;
import zendesk.support.requestlist.RequestInfo;

public class RequestUiConfig implements UiConfig {
    private final List<StateRequestAttachment> files;
    private final boolean hasAgentReplies;
    private final String localRequestId;
    private final String requestId;
    private final RequestStatus requestStatus;
    private final String requestSubject;
    private final List<String> tags;
    private final StateRequestTicketForm ticketForm;
    private final List<UiConfig> uiConfigs;

    public static class Builder {
        private List<StateRequestAttachment> files;
        private boolean hasAgentReplies;
        private String localRequestId;
        private String requestId;
        private RequestStatus requestStatus;
        private String requestSubject;
        private List<String> tags = new ArrayList(0);
        private StateRequestTicketForm ticketForm;
        private List<UiConfig> uiConfigs;

        public Builder() {
            String str = "";
            this.requestSubject = str;
            this.requestId = str;
            this.localRequestId = str;
            this.requestStatus = null;
            this.hasAgentReplies = false;
            this.ticketForm = null;
            this.files = new ArrayList(0);
            this.uiConfigs = new ArrayList();
        }

        private void setUiConfigs(List<UiConfig> list) {
            this.uiConfigs = list;
            RequestUiConfig requestUiConfig = (RequestUiConfig) C13561l.m35893a(list, RequestUiConfig.class);
            if (requestUiConfig != null) {
                this.requestSubject = requestUiConfig.getRequestSubject();
                this.tags = requestUiConfig.getTags();
                this.ticketForm = requestUiConfig.getTicketForm();
                this.files = requestUiConfig.getFiles();
            }
        }

        public UiConfig config() {
            RequestUiConfig requestUiConfig = new RequestUiConfig(this.requestSubject, this.tags, this.requestId, this.localRequestId, this.requestStatus, this.ticketForm, this.files, this.hasAgentReplies, this.uiConfigs);
            return requestUiConfig;
        }

        public Intent intent(Context context, UiConfig... uiConfigArr) {
            return intent(context, Arrays.asList(uiConfigArr));
        }

        public void show(Context context, UiConfig... uiConfigArr) {
            context.startActivity(intent(context, uiConfigArr));
        }

        public Builder withRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder withRequestInfo(RequestInfo requestInfo) {
            String localId = requestInfo.getLocalId();
            if (C12017g.m31658b(localId)) {
                this.localRequestId = localId;
            }
            String remoteId = requestInfo.getRemoteId();
            if (C12017g.m31658b(remoteId)) {
                this.requestId = remoteId;
            }
            this.requestStatus = requestInfo.getRequestStatus();
            this.hasAgentReplies = C12010a.m31639b((Collection<Type>) requestInfo.getAgentInfos());
            return this;
        }

        public Builder withRequestSubject(String str) {
            this.requestSubject = str;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<UiConfig> list) {
            setUiConfigs(list);
            UiConfig config = config();
            Intent intent = new Intent(context, RequestActivity.class);
            C13561l.m35895a(intent, config);
            return intent;
        }

        public void show(Context context, List<UiConfig> list) {
            context.startActivity(intent(context, list));
        }
    }

    RequestUiConfig(String str, List<String> list, String str2, String str3, RequestStatus requestStatus2, StateRequestTicketForm stateRequestTicketForm, List<StateRequestAttachment> list2, boolean z, List<UiConfig> list3) {
        this.requestSubject = str;
        this.tags = C12010a.m31638b(list);
        this.requestId = str2;
        this.localRequestId = str3;
        this.requestStatus = requestStatus2;
        this.hasAgentReplies = z;
        this.ticketForm = stateRequestTicketForm;
        this.files = list2;
        this.uiConfigs = list3;
    }

    public List<StateRequestAttachment> getFiles() {
        return this.files;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public String getRequestSubject() {
        return this.requestSubject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public StateRequestTicketForm getTicketForm() {
        return this.ticketForm;
    }

    @SuppressLint({"RestrictedApi"})
    public List<UiConfig> getUiConfigs() {
        return C13561l.m35891a(this.uiConfigs, (UiConfig) this);
    }

    /* access modifiers changed from: 0000 */
    public boolean hasAgentReplies() {
        return this.hasAgentReplies;
    }
}
