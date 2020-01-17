package zendesk.support.request;

import java.io.Serializable;

class StateUi implements Serializable {
    private final DialogState dialogState;

    interface DialogState {
    }

    StateUi(DialogState dialogState2) {
        this.dialogState = dialogState2;
    }

    /* access modifiers changed from: 0000 */
    public DialogState getDialogState() {
        return this.dialogState;
    }

    /* access modifiers changed from: 0000 */
    public StateUi setDialogState(DialogState dialogState2) {
        return new StateUi(dialogState2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UiState{dialogState=");
        sb.append(this.dialogState);
        sb.append('}');
        return sb.toString();
    }

    StateUi() {
        this.dialogState = null;
    }
}
