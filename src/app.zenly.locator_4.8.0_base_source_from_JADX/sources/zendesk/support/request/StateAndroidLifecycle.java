package zendesk.support.request;

import java.io.Serializable;
import zendesk.suas.C13622i;

class StateAndroidLifecycle implements Serializable {
    private final int state;

    public StateAndroidLifecycle() {
        this.state = 1;
    }

    static StateAndroidLifecycle fromState(C13622i iVar) {
        StateAndroidLifecycle stateAndroidLifecycle = (StateAndroidLifecycle) iVar.mo39263a(StateAndroidLifecycle.class);
        if (stateAndroidLifecycle != null) {
            return stateAndroidLifecycle;
        }
        return new StateAndroidLifecycle();
    }

    public int getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidLifeCycle{state=");
        sb.append(this.state);
        sb.append('}');
        return sb.toString();
    }

    public StateAndroidLifecycle(int i) {
        this.state = i;
    }
}
