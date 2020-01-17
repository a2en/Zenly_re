package zendesk.support.requestlist;

import com.zendesk.service.C12007d;
import java.util.HashSet;
import java.util.Set;

class CancelableCompositeCallback {
    private Set<C12007d> zendeskCallbacks = new HashSet();

    CancelableCompositeCallback() {
    }

    public void add(C12007d dVar) {
        this.zendeskCallbacks.add(dVar);
    }

    public void cancel() {
        for (C12007d cancel : this.zendeskCallbacks) {
            cancel.cancel();
        }
        this.zendeskCallbacks.clear();
    }
}
