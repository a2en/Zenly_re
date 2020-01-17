package zendesk.support;

import com.zendesk.service.C12007d;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class AggregatedCallback<T> extends C12008e<T> {
    private final Set<C12007d<T>> callbackSet = Collections.synchronizedSet(new HashSet());

    public boolean add(C12008e<T> eVar) {
        boolean isEmpty = this.callbackSet.isEmpty();
        this.callbackSet.add(C12007d.m31622a(eVar));
        return isEmpty;
    }

    public void cancel() {
        for (C12007d cancel : this.callbackSet) {
            cancel.cancel();
        }
        this.callbackSet.clear();
    }

    public void onError(ErrorResponse errorResponse) {
        for (C12007d onError : this.callbackSet) {
            onError.onError(errorResponse);
        }
        this.callbackSet.clear();
    }

    public void onSuccess(T t) {
        for (C12007d onSuccess : this.callbackSet) {
            onSuccess.onSuccess(t);
        }
        this.callbackSet.clear();
    }
}
