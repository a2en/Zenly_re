package zendesk.suas;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: zendesk.suas.g */
class C13613g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f35145a = Logger.getLogger("Suas");

    /* renamed from: zendesk.suas.g$b */
    private static class C13615b<E> implements C13618e {

        /* renamed from: a */
        private final Class<E> f35146a;

        /* renamed from: b */
        private final Listener<E> f35147b;

        /* renamed from: c */
        private final Filter<E> f35148c;

        /* renamed from: a */
        public void mo39259a(C13622i iVar, C13622i iVar2, boolean z) {
            Object obj = null;
            Object a = iVar != null ? iVar.mo39263a(this.f35146a) : null;
            if (iVar2 != null) {
                obj = iVar2.mo39263a(this.f35146a);
            }
            C13613g.m35924b(obj, a, this.f35148c, this.f35147b, z);
        }

        private C13615b(Class<E> cls, Listener<E> listener, Filter<E> filter) {
            this.f35146a = cls;
            this.f35147b = listener;
            this.f35148c = filter;
        }

        /* renamed from: a */
        public String mo39258a() {
            return C13622i.m35938b(this.f35146a);
        }
    }

    /* renamed from: zendesk.suas.g$c */
    private static class C13616c<E> implements C13618e {

        /* renamed from: a */
        private final Class<E> f35149a;

        /* renamed from: b */
        private final String f35150b;

        /* renamed from: c */
        private final Listener<E> f35151c;

        /* renamed from: d */
        private final Filter<E> f35152d;

        /* renamed from: a */
        public void mo39259a(C13622i iVar, C13622i iVar2, boolean z) {
            Object obj = null;
            Object a = iVar != null ? iVar.mo39265a(this.f35150b, this.f35149a) : null;
            if (iVar2 != null) {
                obj = iVar2.mo39265a(this.f35150b, this.f35149a);
            }
            C13613g.m35924b(obj, a, this.f35152d, this.f35151c, z);
        }

        private C13616c(String str, Class<E> cls, Listener<E> listener, Filter<E> filter) {
            this.f35149a = cls;
            this.f35151c = listener;
            this.f35150b = str;
            this.f35152d = filter;
        }

        /* renamed from: a */
        public String mo39258a() {
            return this.f35150b;
        }
    }

    /* renamed from: zendesk.suas.g$d */
    private static class C13617d implements C13618e {

        /* renamed from: a */
        private final Listener<C13622i> f35153a;

        /* renamed from: b */
        private final Filter<C13622i> f35154b;

        /* renamed from: a */
        public String mo39258a() {
            return null;
        }

        /* renamed from: a */
        public void mo39259a(C13622i iVar, C13622i iVar2, boolean z) {
            if ((z && iVar2 != null) || (iVar != null && iVar2 != null && this.f35154b.filter(iVar, iVar2))) {
                this.f35153a.update(iVar2);
            }
        }

        private C13617d(Listener<C13622i> listener, Filter<C13622i> filter) {
            this.f35153a = listener;
            this.f35154b = filter;
        }
    }

    /* renamed from: zendesk.suas.g$e */
    interface C13618e {
        /* renamed from: a */
        String mo39258a();

        /* renamed from: a */
        void mo39259a(C13622i iVar, C13622i iVar2, boolean z);
    }

    /* renamed from: zendesk.suas.g$f */
    private static class C13619f<E> implements C13618e {

        /* renamed from: a */
        private final Listener<E> f35155a;

        /* renamed from: b */
        private final StateSelector<E> f35156b;

        /* renamed from: c */
        private final Filter<C13622i> f35157c;

        /* renamed from: a */
        public String mo39258a() {
            return null;
        }

        /* renamed from: a */
        public void mo39259a(C13622i iVar, C13622i iVar2, boolean z) {
            if ((z && iVar2 != null) || (iVar != null && iVar2 != null && this.f35157c.filter(iVar, iVar2))) {
                Object selectData = this.f35156b.selectData(iVar2);
                if (selectData != null) {
                    this.f35155a.update(selectData);
                }
            }
        }

        private C13619f(Listener<E> listener, StateSelector<E> stateSelector, Filter<C13622i> filter) {
            this.f35155a = listener;
            this.f35156b = stateSelector;
            this.f35157c = filter;
        }
    }

    /* renamed from: zendesk.suas.g$g */
    private static class C13620g<E> implements C13618e {

        /* renamed from: a */
        private final String f35158a;

        /* renamed from: b */
        private final Listener<E> f35159b;

        /* renamed from: c */
        private final Filter<E> f35160c;

        /* renamed from: a */
        public void mo39259a(C13622i iVar, C13622i iVar2, boolean z) {
            Object obj;
            Object obj2 = null;
            if (iVar != null) {
                try {
                    obj = iVar.mo39264a(this.f35158a);
                } catch (ClassCastException unused) {
                    C13613g.f35145a.log(Level.WARNING, "Either new value or old value cannot be converted to type expected type.");
                    return;
                }
            } else {
                obj = null;
            }
            if (iVar2 != null) {
                obj2 = iVar2.mo39264a(this.f35158a);
            }
            C13613g.m35924b(obj2, obj, this.f35160c, this.f35159b, z);
        }

        private C13620g(String str, Listener<E> listener, Filter<E> filter) {
            this.f35158a = str;
            this.f35159b = listener;
            this.f35160c = filter;
        }

        /* renamed from: a */
        public String mo39258a() {
            return this.f35158a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> void m35924b(E e, E e2, Filter<E> filter, Listener<E> listener, boolean z) {
        if (e != null && z) {
            listener.update(e);
        } else if (e == null || e2 == null) {
            f35145a.log(Level.WARNING, "Requested stateKey not found in store");
        } else if (filter.filter(e2, e)) {
            listener.update(e);
        }
    }

    /* renamed from: a */
    static <E> C13618e m35920a(String str, Filter<E> filter, Listener<E> listener) {
        return new C13620g(str, listener, filter);
    }

    /* renamed from: a */
    static <E> C13618e m35918a(Class<E> cls, Filter<E> filter, Listener<E> listener) {
        return new C13615b(cls, listener, filter);
    }

    /* renamed from: a */
    static <E> C13618e m35919a(String str, Class<E> cls, Filter<E> filter, Listener<E> listener) {
        C13616c cVar = new C13616c(str, cls, listener, filter);
        return cVar;
    }

    /* renamed from: a */
    static C13618e m35921a(Filter<C13622i> filter, Listener<C13622i> listener) {
        return new C13617d(listener, filter);
    }

    /* renamed from: a */
    static <E> C13618e m35922a(StateSelector<E> stateSelector, Filter<C13622i> filter, Listener<E> listener) {
        return new C13619f(listener, stateSelector, filter);
    }
}
