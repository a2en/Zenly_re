package zendesk.suas;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zendesk.suas.k */
class C13625k implements Store {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C13622i f35168a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13603c f35169b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C13601b f35170c;

    /* renamed from: d */
    private final Filter f35171d;

    /* renamed from: e */
    private final Executor f35172e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<Listener, C13618e> f35173f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Set<Listener<C13600a<?>>> f35174g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicBoolean f35175h = new AtomicBoolean(false);

    /* renamed from: zendesk.suas.k$a */
    class C13626a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C13600a f35176e;

        /* renamed from: zendesk.suas.k$a$a */
        class C13627a implements Continuation {
            C13627a() {
            }

            public void next(C13600a<?> aVar) {
                if (C13625k.this.f35175h.compareAndSet(false, true)) {
                    C13622i state = C13625k.this.getState();
                    C13604a a = C13625k.this.f35169b.mo39252a(C13625k.this.getState(), aVar);
                    C13625k.this.f35168a = a.mo39254a();
                    C13625k.this.f35175h.set(false);
                    C13625k kVar = C13625k.this;
                    kVar.m35956a(state, kVar.getState(), a.mo39255b());
                    return;
                }
                throw new RuntimeException("You must not dispatch actions in your reducer. Seriously. (╯°□°）╯︵ ┻━┻");
            }
        }

        C13626a(C13600a aVar) {
            this.f35176e = aVar;
        }

        public void run() {
            C13625k.this.m35955a(this.f35176e);
            C13601b c = C13625k.this.f35170c;
            C13600a aVar = this.f35176e;
            C13625k kVar = C13625k.this;
            c.onAction(aVar, kVar, kVar, new C13627a());
        }
    }

    /* renamed from: zendesk.suas.k$b */
    private class C13628b implements Subscription {

        /* renamed from: a */
        private final Listener<C13600a<?>> f35179a;

        /* synthetic */ C13628b(C13625k kVar, Listener listener, C13626a aVar) {
            this(listener);
        }

        public void addListener() {
            C13625k.this.f35174g.add(this.f35179a);
        }

        public void informWithCurrentState() {
        }

        public void removeListener() {
            C13625k.this.removeListener(this.f35179a);
        }

        private C13628b(Listener<C13600a<?>> listener) {
            this.f35179a = listener;
        }
    }

    /* renamed from: zendesk.suas.k$c */
    private class C13629c implements Subscription {

        /* renamed from: a */
        private final C13618e f35181a;

        /* renamed from: b */
        private final Listener f35182b;

        C13629c(C13618e eVar, Listener listener) {
            this.f35181a = eVar;
            this.f35182b = listener;
        }

        public void addListener() {
            C13625k.this.f35173f.put(this.f35182b, this.f35181a);
        }

        public void informWithCurrentState() {
            this.f35181a.mo39259a(null, C13625k.this.getState(), true);
        }

        public void removeListener() {
            C13625k.this.removeListener(this.f35182b);
        }
    }

    C13625k(C13622i iVar, C13603c cVar, C13601b bVar, Filter<Object> filter, Executor executor) {
        this.f35168a = iVar;
        this.f35169b = cVar;
        this.f35170c = bVar;
        this.f35171d = filter;
        this.f35172e = executor;
        this.f35174g = Collections.synchronizedSet(new HashSet());
        this.f35173f = new ConcurrentHashMap();
    }

    public Subscription addActionListener(Listener<C13600a<?>> listener) {
        C13628b bVar = new C13628b(this, listener, null);
        bVar.addListener();
        return bVar;
    }

    public <E> Subscription addListener(String str, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35920a(str, this.f35171d, listener));
    }

    public synchronized void dispatch(C13600a aVar) {
        this.f35172e.execute(new C13626a(aVar));
    }

    public C13622i getState() {
        return this.f35168a.mo39266a();
    }

    public void removeListener(Listener listener) {
        this.f35173f.remove(listener);
        this.f35174g.remove(listener);
    }

    public void reset(C13622i iVar) {
        C13622i state = getState();
        this.f35168a = C13622i.m35937a(this.f35169b.mo39253b(), iVar);
        m35956a(state, this.f35168a, this.f35169b.mo39251a());
    }

    public <E> Subscription addListener(String str, Filter<E> filter, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35920a(str, filter, listener));
    }

    public <E> Subscription addListener(StateSelector<E> stateSelector, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35922a(stateSelector, this.f35171d, listener));
    }

    public <E> Subscription addListener(Filter<C13622i> filter, StateSelector<E> stateSelector, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35922a(stateSelector, filter, listener));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35956a(C13622i iVar, C13622i iVar2, Collection<String> collection) {
        for (C13618e eVar : this.f35173f.values()) {
            if (eVar.mo39258a() == null || collection.contains(eVar.mo39258a())) {
                eVar.mo39259a(iVar, iVar2, false);
            }
        }
    }

    public <E> Subscription addListener(Class<E> cls, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35918a(cls, this.f35171d, listener));
    }

    public <E> Subscription addListener(Class<E> cls, Filter<E> filter, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35918a(cls, filter, listener));
    }

    public <E> Subscription addListener(String str, Class<E> cls, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35919a(str, cls, this.f35171d, listener));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35955a(C13600a<?> aVar) {
        for (Listener update : this.f35174g) {
            update.update(aVar);
        }
    }

    public <E> Subscription addListener(String str, Class<E> cls, Filter<E> filter, Listener<E> listener) {
        return m35953a((Listener) listener, C13613g.m35919a(str, cls, filter, listener));
    }

    public Subscription addListener(Listener<C13622i> listener) {
        return m35953a((Listener) listener, C13613g.m35921a(this.f35171d, listener));
    }

    /* renamed from: a */
    private Subscription m35953a(Listener listener, C13618e eVar) {
        C13629c cVar = new C13629c(eVar, listener);
        cVar.addListener();
        return cVar;
    }

    public Subscription addListener(Filter<C13622i> filter, Listener<C13622i> listener) {
        return m35953a((Listener) listener, C13613g.m35921a(filter, listener));
    }
}
