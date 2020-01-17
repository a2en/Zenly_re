package zendesk.core;

import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;

abstract class PassThroughErrorZendeskCallback<E> extends C12008e<E> {
    private final C12008e callback;

    PassThroughErrorZendeskCallback(C12008e eVar) {
        this.callback = eVar;
    }

    public void onError(ErrorResponse errorResponse) {
        C12008e eVar = this.callback;
        if (eVar != null) {
            eVar.onError(errorResponse);
        }
    }
}
