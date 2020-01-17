package zendesk.support.request;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12140j;
import zendesk.suas.C13622i;
import zendesk.suas.Dispatcher;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;

class ComponentError implements Listener<ErrorStateModel> {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f35218af;
    private final CoordinatorLayout container;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    /* access modifiers changed from: private */
    public ErrorType errorState;
    private Snackbar snackbar;

    /* renamed from: zendesk.support.request.ComponentError$2 */
    static /* synthetic */ class C137602 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$StateError$ErrorType = new int[ErrorType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                zendesk.support.request.StateError$ErrorType[] r0 = zendesk.support.request.StateError.ErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$request$StateError$ErrorType = r0
                int[] r0 = $SwitchMap$zendesk$support$request$StateError$ErrorType     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.request.StateError$ErrorType r1 = zendesk.support.request.StateError.ErrorType.InitialGetComments     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$request$StateError$ErrorType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.request.StateError$ErrorType r1 = zendesk.support.request.StateError.ErrorType.InputFormSubmission     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ComponentError.C137602.<clinit>():void");
        }
    }

    static class ErrorStateModel {
        private final boolean conversationsEnabled;
        private final String errorMessage;
        /* access modifiers changed from: private */
        public final ErrorType errorState;

        ErrorStateModel(ErrorType errorType, String str, boolean z) {
            this.errorState = errorType;
            this.errorMessage = str;
            this.conversationsEnabled = z;
        }

        /* access modifiers changed from: 0000 */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /* access modifiers changed from: 0000 */
        public ErrorType getErrorState() {
            return this.errorState;
        }

        /* access modifiers changed from: 0000 */
        public boolean isConversationsEnabled() {
            return this.conversationsEnabled;
        }
    }

    static class ErrorStateSelector implements StateSelector<ErrorStateModel> {
        ErrorStateSelector() {
        }

        public ErrorStateModel selectData(C13622i iVar) {
            StateError fromState = StateError.fromState(iVar);
            return new ErrorStateModel(fromState.getState(), fromState.getMessage(), StateConfig.fromState(iVar).getSettings().isConversationsEnabled());
        }
    }

    private ComponentError(CoordinatorLayout coordinatorLayout, Dispatcher dispatcher2, ActionFactory actionFactory) {
        this.container = coordinatorLayout;
        this.dispatcher = dispatcher2;
        this.f35218af = actionFactory;
    }

    static ComponentError create(Activity activity, Dispatcher dispatcher2, ActionFactory actionFactory) {
        return new ComponentError((CoordinatorLayout) activity.findViewById(C12136f.activity_request), dispatcher2, actionFactory);
    }

    static StateSelector<ErrorStateModel> getSelector() {
        return new ErrorStateSelector();
    }

    public void update(ErrorStateModel errorStateModel) {
        if (errorStateModel.errorState != this.errorState) {
            this.errorState = errorStateModel.errorState;
            if (errorStateModel.errorState != ErrorType.NoError) {
                this.snackbar = Snackbar.m27827a((View) this.container, (CharSequence) errorStateModel.getErrorMessage(), -2);
                int i = C137602.$SwitchMap$zendesk$support$request$StateError$ErrorType[errorStateModel.getErrorState().ordinal()];
                if (i == 1) {
                    this.snackbar.mo31305e(C12140j.request_error_load_comments);
                    this.snackbar.mo31302a(C12140j.retry_view_button_label, (OnClickListener) new OnClickListener() {
                        public void onClick(View view) {
                            ComponentError.this.errorState = ErrorType.NoError;
                            ComponentError.this.dispatcher.dispatch(ComponentError.this.f35218af.initialLoadCommentsAsync());
                        }
                    });
                    this.snackbar.mo31275k();
                } else if (i == 2 && !errorStateModel.isConversationsEnabled()) {
                    this.snackbar.mo31305e(C12140j.request_error_create_request);
                    this.snackbar.mo31275k();
                }
            } else {
                Snackbar snackbar2 = this.snackbar;
                if (snackbar2 != null) {
                    snackbar2.mo31263b();
                }
            }
        }
    }
}
