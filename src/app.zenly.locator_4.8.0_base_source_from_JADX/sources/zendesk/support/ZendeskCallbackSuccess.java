package zendesk.support;

import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;

abstract class ZendeskCallbackSuccess<E> extends C12008e<E> {
    private final C12008e callback;

    ZendeskCallbackSuccess(C12008e eVar) {
        this.callback = eVar;
    }

    public void onError(ErrorResponse errorResponse) {
        C12008e eVar = this.callback;
        if (eVar != null) {
            eVar.onError(errorResponse);
        }
    }
}
