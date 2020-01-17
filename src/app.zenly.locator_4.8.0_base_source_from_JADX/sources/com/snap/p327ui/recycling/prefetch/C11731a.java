package com.snap.p327ui.recycling.prefetch;

import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.factory.C11730d;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p379a.C12118a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;

/* renamed from: com.snap.ui.recycling.prefetch.a */
public final class C11731a implements ViewHolderPrefetcher {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f30402g = f30402g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C11733b f30403h = new C11733b(null, null);

    /* renamed from: a */
    private final ArrayMap<AdapterViewType, LinkedList<C11730d<?>>> f30404a = new ArrayMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11745c f30405b = new C11745c(this.f30408e);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11727c f30406c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12286f f30407d;

    /* renamed from: e */
    private final LayoutInflater f30408e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewGroup f30409f;

    /* renamed from: com.snap.ui.recycling.prefetch.a$a */
    public static final class C11732a {
        private C11732a() {
        }

        public /* synthetic */ C11732a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.a$b */
    private static final class C11733b {

        /* renamed from: a */
        private final AdapterViewType f30410a;

        /* renamed from: b */
        private final C11730d<?> f30411b;

        public C11733b(AdapterViewType adapterViewType, C11730d<?> dVar) {
            this.f30410a = adapterViewType;
            this.f30411b = dVar;
        }

        /* renamed from: a */
        public final C11730d<?> mo34550a() {
            return this.f30411b;
        }

        /* renamed from: b */
        public final AdapterViewType mo34551b() {
            return this.f30410a;
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.a$c */
    static final class C11734c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C11734c f30412e = new C11734c();

        C11734c() {
        }

        /* renamed from: a */
        public final C12279e<AdapterViewType> apply(Entry<? extends AdapterViewType, Integer> entry) {
            C12932j.m33818b(entry, "entry");
            return C12279e.m32626e(entry.getKey()).mo36463c((long) ((Number) entry.getValue()).intValue());
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.a$d */
    static final class C11735d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C11731a f30413e;

        /* renamed from: com.snap.ui.recycling.prefetch.a$d$a */
        static final class C11736a<V> implements Callable<T> {

            /* renamed from: e */
            final /* synthetic */ C11735d f30414e;

            /* renamed from: f */
            final /* synthetic */ AdapterViewType f30415f;

            C11736a(C11735d dVar, AdapterViewType adapterViewType) {
                this.f30414e = dVar;
                this.f30415f = adapterViewType;
            }

            public final C11733b call() {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("preload:");
                    sb.append(this.f30415f);
                    C12118a.m31985a(sb.toString());
                    LayoutInflater a = this.f30414e.f30413e.f30405b.mo34560a();
                    return new C11733b(this.f30415f, C11727c.m30821a(this.f30414e.f30413e.f30406c, this.f30415f, C11727c.m30819a(a.getContext(), this.f30415f, this.f30414e.f30413e.f30409f, a)));
                } finally {
                    C12118a.m31984a();
                }
            }
        }

        /* renamed from: com.snap.ui.recycling.prefetch.a$d$b */
        static final class C11737b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C11737b f30416e = new C11737b();

            C11737b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                Log.e(C11731a.f30402g, "Failed to inflate", th);
            }
        }

        C11735d(C11731a aVar) {
            this.f30413e = aVar;
        }

        /* renamed from: a */
        public final C12279e<C11733b> apply(AdapterViewType adapterViewType) {
            C12932j.m33818b(adapterViewType, "viewType");
            return C12279e.m32616a((Callable<? extends T>) new C11736a<Object>(this, adapterViewType)).mo36432a((Consumer<? super Throwable>) C11737b.f30416e).mo36473c(C11731a.f30403h).mo36452b(this.f30413e.f30407d);
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.a$e */
    static final class C11738e<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C11731a f30417e;

        C11738e(C11731a aVar) {
            this.f30417e = aVar;
        }

        /* renamed from: a */
        public final void mo34556a(C11733b bVar) {
            C12932j.m33818b(bVar, "inflation");
            this.f30417e.m30838a(bVar);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo34556a((C11733b) obj);
            return C12956q.f33541a;
        }
    }

    static {
        new C11732a(null);
    }

    public C11731a(C11727c cVar, C12286f fVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(cVar, "viewFactory");
        C12932j.m33818b(fVar, "inflationScheduler");
        C12932j.m33818b(layoutInflater, "layoutInflater");
        C12932j.m33818b(viewGroup, "parent");
        this.f30406c = cVar;
        this.f30407d = fVar;
        this.f30408e = layoutInflater;
        this.f30409f = viewGroup;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.snap.p327ui.recycling.factory.C11730d<?> getPrefetchedViewHolder(com.snap.p327ui.recycling.AdapterViewType r3) {
        /*
            r2 = this;
            java.lang.String r0 = "viewType"
            kotlin.jvm.internal.C12932j.m33818b(r3, r0)
            android.util.ArrayMap<com.snap.ui.recycling.AdapterViewType, java.util.LinkedList<com.snap.ui.recycling.factory.d<?>>> r0 = r2.f30404a
            monitor-enter(r0)
            android.util.ArrayMap<com.snap.ui.recycling.AdapterViewType, java.util.LinkedList<com.snap.ui.recycling.factory.d<?>>> r1 = r2.f30404a     // Catch:{ all -> 0x0028 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0028 }
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x001b
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            if (r1 != 0) goto L_0x0025
            java.lang.Object r3 = r3.remove()     // Catch:{ all -> 0x0028 }
            com.snap.ui.recycling.factory.d r3 = (com.snap.p327ui.recycling.factory.C11730d) r3     // Catch:{ all -> 0x0028 }
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            monitor-exit(r0)
            return r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.p327ui.recycling.prefetch.C11731a.getPrefetchedViewHolder(com.snap.ui.recycling.AdapterViewType):com.snap.ui.recycling.factory.d");
    }

    /* renamed from: a */
    public final C12271b mo34549a(Map<AdapterViewType, Integer> map) {
        C12932j.m33818b(map, "preloads");
        C12271b h = C12279e.m32623b((Iterable<? extends T>) map.entrySet()).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C11734c.f30412e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C11735d<Object,Object>(this)).mo36452b(this.f30407d).mo36501i(new C11738e(this)).mo36498h();
        C12932j.m33815a((Object) h, "Observable.fromIterable(…        .ignoreElements()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30838a(C11733b bVar) {
        if (bVar != f30403h) {
            try {
                C12118a.m31985a("addPreload");
                synchronized (this.f30404a) {
                    LinkedList linkedList = (LinkedList) this.f30404a.get(bVar.mo34551b());
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f30404a.put(bVar.mo34551b(), linkedList);
                    }
                    C11730d a = bVar.mo34550a();
                    if (a != null) {
                        linkedList.add(a);
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                }
                C12118a.m31984a();
            } catch (Throwable th) {
                C12118a.m31984a();
                throw th;
            }
        }
    }
}
