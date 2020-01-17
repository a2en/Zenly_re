package zendesk.suas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: zendesk.suas.j */
public class C13623j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f35162a = true;

    /* renamed from: zendesk.suas.j$a */
    public static class C13624a {

        /* renamed from: a */
        private final Collection<C13621h> f35163a;

        /* renamed from: b */
        private C13622i f35164b;

        /* renamed from: c */
        private Collection<Middleware> f35165c = new ArrayList();

        /* renamed from: d */
        private Filter<Object> f35166d = C13609f.f35143a;

        /* renamed from: e */
        private Executor f35167e;

        C13624a(Collection<C13621h> collection) {
            this.f35163a = collection;
        }

        /* renamed from: b */
        private Executor m35948b() {
            Executor executor = this.f35167e;
            if (executor != null) {
                return executor;
            }
            if (C13623j.f35162a) {
                return C13606e.m35915a();
            }
            return C13606e.m35916b();
        }

        /* renamed from: a */
        public C13624a mo39273a(Middleware... middlewareArr) {
            m35947a(middlewareArr, "Middleware must not be null");
            this.f35165c = Arrays.asList(middlewareArr);
            return this;
        }

        /* renamed from: a */
        public C13624a mo39272a(Filter<Object> filter) {
            m35947a(filter, "Notifier must not be null");
            this.f35166d = filter;
            return this;
        }

        /* renamed from: a */
        public Store mo39271a() {
            C13603c cVar = new C13603c(this.f35163a);
            C13601b bVar = new C13601b(this.f35165c);
            C13625k kVar = new C13625k(C13622i.m35937a(cVar.mo39253b(), this.f35164b), cVar, bVar, this.f35166d, m35948b());
            return kVar;
        }

        /* renamed from: a */
        private void m35947a(Object obj, String str) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    static {
        try {
            Class.forName("android.os.Build");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C13624a m35945a(Collection<C13621h> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new C13624a(collection);
        }
        throw new IllegalArgumentException("Reducer must not be null or empty");
    }
}
