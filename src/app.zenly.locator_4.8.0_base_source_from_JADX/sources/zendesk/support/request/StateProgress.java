package zendesk.support.request;

import java.io.Serializable;
import zendesk.suas.C13622i;

class StateProgress implements Serializable {
    private final int runningRequests;

    StateProgress() {
        this.runningRequests = 0;
    }

    static StateProgress fomState(C13622i iVar) {
        StateProgress stateProgress = (StateProgress) iVar.mo39263a(StateProgress.class);
        if (stateProgress != null) {
            return stateProgress;
        }
        return new StateProgress();
    }

    /* access modifiers changed from: 0000 */
    public StateProgress decrement() {
        int i = this.runningRequests;
        if (i > 0) {
            return new StateProgress(i - 1);
        }
        return new StateProgress(0);
    }

    /* access modifiers changed from: 0000 */
    public int getRunningRequests() {
        return this.runningRequests;
    }

    /* access modifiers changed from: 0000 */
    public StateProgress increment() {
        return new StateProgress(this.runningRequests + 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Progress{runningRequests=");
        sb.append(this.runningRequests);
        sb.append('}');
        return sb.toString();
    }

    StateProgress(int i) {
        this.runningRequests = i;
    }
}
