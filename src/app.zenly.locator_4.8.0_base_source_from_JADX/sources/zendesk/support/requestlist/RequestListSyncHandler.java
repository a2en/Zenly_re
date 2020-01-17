package zendesk.support.requestlist;

import android.content.Context;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;

class RequestListSyncHandler implements ActionHandler {
    private boolean outdated = false;
    private final RequestListPresenter presenter;
    private boolean running = false;

    RequestListSyncHandler(RequestListPresenter requestListPresenter) {
        this.presenter = requestListPresenter;
    }

    public boolean canHandle(String str) {
        return "request_list_refresh".equals(str);
    }

    public ActionDescription getActionDescription() {
        return null;
    }

    public int getPriority() {
        return 0;
    }

    public void handle(Map<String, Object> map, Context context) {
        if (this.running) {
            this.presenter.refresh();
            this.outdated = false;
            return;
        }
        this.outdated = true;
    }

    /* access modifiers changed from: 0000 */
    public void setRunning(boolean z) {
        this.running = z;
        if (this.outdated) {
            this.presenter.refresh();
            this.outdated = false;
        }
    }
}
