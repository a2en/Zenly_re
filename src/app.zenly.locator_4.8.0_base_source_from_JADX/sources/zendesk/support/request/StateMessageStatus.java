package zendesk.support.request;

import java.io.Serializable;

class StateMessageStatus implements Serializable {
    private final String errorResponse;
    private final int status;

    private StateMessageStatus(int i, String str) {
        this.status = i;
        this.errorResponse = str;
    }

    static StateMessageStatus delivered() {
        return new StateMessageStatus(2, null);
    }

    static StateMessageStatus error(String str) {
        return new StateMessageStatus(1, str);
    }

    static StateMessageStatus pending() {
        return new StateMessageStatus(3, null);
    }

    /* access modifiers changed from: 0000 */
    public int getStatus() {
        return this.status;
    }

    public String toString() {
        int i = this.status;
        String str = i != 1 ? i != 2 ? i != 3 ? "Unknown" : "Pending" : "Delivered" : "Error";
        StringBuilder sb = new StringBuilder();
        sb.append("MessageState{status=");
        sb.append(str);
        sb.append(", errorResponse=");
        sb.append(this.errorResponse);
        sb.append('}');
        return sb.toString();
    }
}
