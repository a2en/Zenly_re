package zendesk.suas;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: zendesk.suas.b */
class C13601b implements Middleware {

    /* renamed from: a */
    private final Collection<Middleware> f35131a;

    /* renamed from: zendesk.suas.b$a */
    class C13602a implements Continuation {

        /* renamed from: a */
        final /* synthetic */ GetState f35132a;

        /* renamed from: b */
        final /* synthetic */ Dispatcher f35133b;

        /* renamed from: c */
        final /* synthetic */ Continuation f35134c;

        /* renamed from: d */
        final /* synthetic */ Iterator f35135d;

        C13602a(GetState getState, Dispatcher dispatcher, Continuation continuation, Iterator it) {
            this.f35132a = getState;
            this.f35133b = dispatcher;
            this.f35134c = continuation;
            this.f35135d = it;
        }

        public void next(C13600a<?> aVar) {
            C13601b.this.m35905a(aVar, this.f35132a, this.f35133b, this.f35134c, this.f35135d);
        }
    }

    C13601b(Collection<Middleware> collection) {
        if (collection == null || collection.size() == 0) {
            this.f35131a = null;
        } else {
            this.f35131a = collection;
        }
    }

    public void onAction(C13600a<?> aVar, GetState getState, Dispatcher dispatcher, Continuation continuation) {
        Collection<Middleware> collection = this.f35131a;
        if (collection != null) {
            m35905a(aVar, getState, dispatcher, continuation, collection.iterator());
            return;
        }
        continuation.next(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35905a(C13600a<?> aVar, GetState getState, Dispatcher dispatcher, Continuation continuation, Iterator<Middleware> it) {
        if (it.hasNext()) {
            Middleware middleware = (Middleware) it.next();
            C13602a aVar2 = new C13602a(getState, dispatcher, continuation, it);
            middleware.onAction(aVar, getState, dispatcher, aVar2);
            return;
        }
        continuation.next(aVar);
    }
}
