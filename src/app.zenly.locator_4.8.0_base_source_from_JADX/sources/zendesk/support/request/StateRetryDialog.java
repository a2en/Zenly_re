package zendesk.support.request;

import java.io.Serializable;
import java.util.List;

class StateRetryDialog implements DialogState, Serializable {
    private final List<StateMessage> message;

    StateRetryDialog(List<StateMessage> list) {
        this(list, false);
    }

    /* access modifiers changed from: 0000 */
    public List<StateMessage> getMessage() {
        return this.message;
    }

    private StateRetryDialog(List<StateMessage> list, boolean z) {
        this.message = list;
    }
}
