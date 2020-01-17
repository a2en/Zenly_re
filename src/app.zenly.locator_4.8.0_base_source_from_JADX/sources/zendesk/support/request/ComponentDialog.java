package zendesk.support.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import java.util.List;
import zendesk.suas.Dispatcher;
import zendesk.suas.Listener;
import zendesk.support.UiUtils;

class ComponentDialog implements Listener<StateUi> {
    private final Activity activity;

    /* renamed from: af */
    private final ActionFactory f35215af;
    private Dialog dialog;
    private final Dispatcher dispatcher;

    static class OnDismissedListener implements OnDismissListener {

        /* renamed from: af */
        private final ActionFactory f35216af;
        private final Dispatcher dispatcher;

        OnDismissedListener(ActionFactory actionFactory, Dispatcher dispatcher2) {
            this.f35216af = actionFactory;
            this.dispatcher = dispatcher2;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.dispatcher.dispatch(this.f35216af.onDialogDismissed());
        }
    }

    static class RetryDialogListener implements Listener {

        /* renamed from: af */
        private final ActionFactory f35217af;
        private final Dispatcher dispatcher;

        RetryDialogListener(ActionFactory actionFactory, Dispatcher dispatcher2) {
            this.f35217af = actionFactory;
            this.dispatcher = dispatcher2;
        }

        public void onDeleteMessage(List<StateMessage> list) {
            for (StateMessage deleteMessage : list) {
                this.dispatcher.dispatch(this.f35217af.deleteMessage(deleteMessage));
            }
        }

        public void onRetryMessage(List<StateMessage> list) {
            onDeleteMessage(list);
            for (StateMessage resendCommentAsync : list) {
                this.dispatcher.dispatch(this.f35217af.resendCommentAsync(resendCommentAsync));
                this.dispatcher.dispatch(this.f35217af.updateCommentsAsync());
            }
        }
    }

    ComponentDialog(Activity activity2, ActionFactory actionFactory, Dispatcher dispatcher2) {
        this.activity = activity2;
        this.f35215af = actionFactory;
        this.dispatcher = dispatcher2;
    }

    private Dialog getDialogForState(DialogState dialogState) {
        if (!(dialogState instanceof StateRetryDialog)) {
            return null;
        }
        RetryDialog retryDialog = new RetryDialog(this.activity, ((StateRetryDialog) dialogState).getMessage());
        retryDialog.setListener(new RetryDialogListener(this.f35215af, this.dispatcher));
        return retryDialog;
    }

    public void update(StateUi stateUi) {
        DialogState dialogState = stateUi.getDialogState();
        if (dialogState != null) {
            Dialog dialog2 = this.dialog;
            if (dialog2 == null || !dialog2.isShowing()) {
                UiUtils.dismissKeyboard(this.activity);
                this.dialog = getDialogForState(dialogState);
                this.dialog.setOnDismissListener(new OnDismissedListener(this.f35215af, this.dispatcher));
                this.dialog.show();
            }
        }
    }
}
