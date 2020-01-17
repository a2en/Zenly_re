package zendesk.support.request;

import java.io.Serializable;
import zendesk.suas.C13622i;

class StateError implements Serializable {
    private final String message;
    private final ErrorType state;

    enum ErrorType {
        InitialGetComments,
        InputFormSubmission,
        NoAccess,
        NoError
    }

    StateError() {
        this(ErrorType.NoError, "=)");
    }

    static StateError fromState(C13622i iVar) {
        StateError stateError = (StateError) iVar.mo39263a(StateError.class);
        if (stateError != null) {
            return stateError;
        }
        return new StateError();
    }

    /* access modifiers changed from: 0000 */
    public String getMessage() {
        return this.message;
    }

    /* access modifiers changed from: 0000 */
    public ErrorType getState() {
        return this.state;
    }

    StateError(ErrorType errorType, String str) {
        this.state = errorType;
        this.message = str;
    }
}
