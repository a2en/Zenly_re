package com.snap.p327ui.recycling.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1112g;
import androidx.recyclerview.widget.C1112g.C1114b;
import androidx.recyclerview.widget.C1112g.C1115c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import com.snap.p327ui.event.C11698b;
import com.snap.p327ui.event.C11698b.C11699a;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.adapter.errorhandling.AdapterErrorHandler;
import com.snap.p327ui.recycling.adapter.errorhandling.C11718a;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.factory.C11730d;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11748c;
import com.snap.p327ui.seeking.C11749d;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C12956q;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p333g.p378f.p379a.C12118a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: com.snap.ui.recycling.adapter.b */
public class C11705b extends C1069g<C11730d<? super C11722a>> implements ViewModelAdapter, Disposable {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicLong f30339e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicReference<Seekable<C11708c>> f30340f;

    /* renamed from: g */
    private final C12785a<List<ObservableSectionController>> f30341g;

    /* renamed from: h */
    private final AtomicBoolean f30342h;

    /* renamed from: i */
    private final C12275b f30343i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11748c<C11722a> f30344j;

    /* renamed from: k */
    private final C12279e<C11748c<C11722a>> f30345k;

    /* renamed from: l */
    private volatile boolean f30346l;

    /* renamed from: m */
    private final C12789c<C11698b> f30347m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C11727c f30348n;

    /* renamed from: o */
    private final EventDispatcher f30349o;

    /* renamed from: p */
    private final C12286f f30350p;

    /* renamed from: q */
    private final C12286f f30351q;

    /* renamed from: r */
    private final AdapterErrorHandler f30352r;

    /* renamed from: com.snap.ui.recycling.adapter.b$a */
    private static final class C11706a extends C1114b {

        /* renamed from: a */
        private final Seekable<C11708c> f30353a;

        /* renamed from: b */
        private final Seekable<C11708c> f30354b;

        public C11706a(Seekable<C11708c> seekable, Seekable<C11708c> seekable2) {
            C12932j.m33818b(seekable, "oldModels");
            C12932j.m33818b(seekable2, "newModels");
            this.f30353a = seekable;
            this.f30354b = seekable2;
        }

        public boolean areContentsTheSame(int i, int i2) {
            C11708c cVar = (C11708c) this.f30353a.get(i);
            C11708c cVar2 = (C11708c) this.f30354b.get(i2);
            return cVar.mo34471c().mo34499b(cVar2.mo34471c()) && cVar.mo34471c().mo7088a(cVar2.mo34471c());
        }

        public boolean areItemsTheSame(int i, int i2) {
            C11708c cVar = (C11708c) this.f30353a.get(i);
            C11708c cVar2 = (C11708c) this.f30354b.get(i2);
            if (cVar.mo34472d() != cVar2.mo34472d()) {
                return false;
            }
            return cVar.mo34471c().mo34499b(cVar2.mo34471c());
        }

        public int getNewListSize() {
            return this.f30354b.size();
        }

        public int getOldListSize() {
            return this.f30353a.size();
        }

        public C11708c getChangePayload(int i, int i2) {
            return (C11708c) this.f30353a.get(i);
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$b */
    public static final class C11707b {

        /* renamed from: a */
        private final Seekable<C11708c> f30355a;

        /* renamed from: b */
        private final Seekable<C11708c> f30356b;

        /* renamed from: c */
        private final long f30357c;

        public C11707b(Seekable<C11708c> seekable, Seekable<C11708c> seekable2, long j) {
            C12932j.m33818b(seekable, "old");
            C12932j.m33818b(seekable2, "data");
            this.f30355a = seekable;
            this.f30356b = seekable2;
            this.f30357c = j;
        }

        /* renamed from: a */
        public final Seekable<C11708c> mo34466a() {
            return this.f30356b;
        }

        /* renamed from: b */
        public final long mo34467b() {
            return this.f30357c;
        }

        /* renamed from: c */
        public final Seekable<C11708c> mo34468c() {
            return this.f30355a;
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$c */
    public static final class C11708c {

        /* renamed from: a */
        private final ObservableSectionController f30358a;

        /* renamed from: b */
        private final C11722a f30359b;

        /* renamed from: c */
        private final int f30360c;

        /* renamed from: d */
        private final long f30361d;

        public C11708c(ObservableSectionController observableSectionController, C11722a aVar, int i, long j) {
            C12932j.m33818b(observableSectionController, "section");
            C12932j.m33818b(aVar, "model");
            this.f30358a = observableSectionController;
            this.f30359b = aVar;
            this.f30360c = i;
            this.f30361d = j;
        }

        /* renamed from: a */
        public final long mo34469a() {
            return this.f30361d;
        }

        /* renamed from: b */
        public final int mo34470b() {
            return this.f30360c;
        }

        /* renamed from: c */
        public final C11722a mo34471c() {
            return this.f30359b;
        }

        /* renamed from: d */
        public final ObservableSectionController mo34472d() {
            return this.f30358a;
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$d */
    public static final class C11709d {

        /* renamed from: a */
        private final Seekable<C11708c> f30362a;

        /* renamed from: b */
        private final C1115c f30363b;

        /* renamed from: c */
        private final long f30364c;

        public C11709d(Seekable<C11708c> seekable, C1115c cVar, long j) {
            C12932j.m33818b(seekable, "data");
            this.f30362a = seekable;
            this.f30363b = cVar;
            this.f30364c = j;
        }

        /* renamed from: a */
        public final Seekable<C11708c> mo34473a() {
            return this.f30362a;
        }

        /* renamed from: b */
        public final C1115c mo34474b() {
            return this.f30363b;
        }

        /* renamed from: c */
        public final long mo34475c() {
            return this.f30364c;
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$e */
    public static final class C11710e<T, R> implements Function<Object[], R> {

        /* renamed from: e */
        final /* synthetic */ C11705b f30365e;

        public C11710e(C11705b bVar) {
            this.f30365e = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
            if (r10[0] != com.snap.p327ui.recycling.adapter.C11705b.m30748a(r9.f30365e)) goto L_0x0025;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(java.lang.Object[] r10) {
            /*
                r9 = this;
                java.lang.String r0 = "t1"
                kotlin.jvm.internal.C12932j.m33818b(r10, r0)
                com.snap.p327ui.seeking.C11751f.m30859a()
                int r0 = r10.length
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000f
                r0 = 1
                goto L_0x0010
            L_0x000f:
                r0 = 0
            L_0x0010:
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x0044
                com.snap.ui.recycling.adapter.b r0 = r9.f30365e
                boolean r0 = r0.mo34462a()
                if (r0 == 0) goto L_0x0029
                r0 = r10[r2]
                com.snap.ui.recycling.adapter.b r3 = r9.f30365e
                com.snap.ui.seeking.c r3 = r3.f30344j
                if (r0 == r3) goto L_0x0027
            L_0x0025:
                r0 = 1
                goto L_0x0040
            L_0x0027:
                r0 = 0
                goto L_0x0040
            L_0x0029:
                int r0 = r10.length
                r3 = 0
            L_0x002b:
                if (r3 >= r0) goto L_0x0027
                r4 = r10[r3]
                com.snap.ui.recycling.adapter.b r5 = r9.f30365e
                com.snap.ui.seeking.c r5 = r5.f30344j
                if (r4 == r5) goto L_0x0039
                r4 = 1
                goto L_0x003a
            L_0x0039:
                r4 = 0
            L_0x003a:
                if (r4 == 0) goto L_0x003d
                goto L_0x0025
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                if (r0 == 0) goto L_0x0044
                r0 = 1
                goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                if (r0 != 0) goto L_0x0057
                com.snap.ui.recycling.adapter.b$b r10 = new com.snap.ui.recycling.adapter.b$b
                com.snap.ui.seeking.Seekable r0 = com.snap.p327ui.seeking.C11751f.m30859a()
                com.snap.ui.seeking.Seekable r1 = com.snap.p327ui.seeking.C11751f.m30859a()
                r2 = -1
                r10.<init>(r0, r1, r2)
                goto L_0x00bd
            L_0x0057:
                com.snap.ui.recycling.adapter.b r0 = r9.f30365e
                java.util.concurrent.atomic.AtomicLong r0 = r0.f30339e
                monitor-enter(r0)
                com.snap.ui.recycling.adapter.b r3 = r9.f30365e     // Catch:{ all -> 0x00c6 }
                java.util.concurrent.atomic.AtomicLong r3 = r3.f30339e     // Catch:{ all -> 0x00c6 }
                long r3 = r3.incrementAndGet()     // Catch:{ all -> 0x00c6 }
                com.snap.ui.recycling.adapter.b r5 = r9.f30365e     // Catch:{ all -> 0x00c6 }
                java.util.concurrent.atomic.AtomicReference r5 = r5.f30340f     // Catch:{ all -> 0x00c6 }
                java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00c6 }
                java.lang.String r6 = "mainThreadData.get()"
                kotlin.jvm.internal.C12932j.m33815a(r5, r6)     // Catch:{ all -> 0x00c6 }
                com.snap.ui.seeking.Seekable r5 = (com.snap.p327ui.seeking.Seekable) r5     // Catch:{ all -> 0x00c6 }
                kotlin.q r6 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x00c6 }
                monitor-exit(r0)
                java.util.List r10 = kotlin.collections.C12840k.m33582g(r10)
                if (r10 == 0) goto L_0x00be
                com.snap.ui.recycling.adapter.b r0 = r9.f30365e
                boolean r0 = r0.mo34462a()
                if (r0 == 0) goto L_0x00b3
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r10 = r10.iterator()
            L_0x0093:
                boolean r6 = r10.hasNext()
                if (r6 == 0) goto L_0x00b2
                java.lang.Object r6 = r10.next()
                r7 = r6
                com.snap.ui.seeking.Seekable r7 = (com.snap.p327ui.seeking.Seekable) r7
                com.snap.ui.recycling.adapter.b r8 = r9.f30365e
                com.snap.ui.seeking.c r8 = r8.f30344j
                if (r7 == r8) goto L_0x00aa
                r7 = 1
                goto L_0x00ab
            L_0x00aa:
                r7 = 0
            L_0x00ab:
                if (r7 != 0) goto L_0x00ae
                goto L_0x00b2
            L_0x00ae:
                r0.add(r6)
                goto L_0x0093
            L_0x00b2:
                r10 = r0
            L_0x00b3:
                com.snap.ui.seeking.Seekable r10 = com.snap.p327ui.seeking.C11751f.m30862a(r10)
                com.snap.ui.recycling.adapter.b$b r0 = new com.snap.ui.recycling.adapter.b$b
                r0.<init>(r5, r10, r3)
                r10 = r0
            L_0x00bd:
                return r10
            L_0x00be:
                kotlin.TypeCastException r10 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.snap.ui.seeking.Seekable<com.snap.ui.recycling.adapter.ObservableViewModelSectionAdapter2.SectionItemInfo>>"
                r10.<init>(r0)
                throw r10
            L_0x00c6:
                r10 = move-exception
                monitor-exit(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.p327ui.recycling.adapter.C11705b.C11710e.apply(java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$f */
    static final class C11711f<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ int f30366e;

        /* renamed from: f */
        final /* synthetic */ ObservableSectionController f30367f;

        /* renamed from: g */
        final /* synthetic */ C11705b f30368g;

        C11711f(int i, ObservableSectionController observableSectionController, C11705b bVar) {
            this.f30366e = i;
            this.f30367f = observableSectionController;
            this.f30368g = bVar;
        }

        /* renamed from: a */
        public final Seekable<? extends Object> apply(Seekable<C11722a> seekable) {
            Seekable<? extends Object> seekable2;
            C12932j.m33818b(seekable, "models");
            StringBuilder sb = new StringBuilder();
            sb.append("section:");
            sb.append(this.f30366e);
            C12118a.m31986b(sb.toString());
            try {
                if (seekable == this.f30368g.f30344j) {
                    seekable2 = this.f30368g.f30344j;
                } else {
                    ArrayList arrayList = new ArrayList(C12850p.m33647a(seekable, 10));
                    for (C11722a aVar : seekable) {
                        C11727c d = this.f30368g.f30348n;
                        C12932j.m33815a((Object) aVar, "model");
                        int a = d.mo34540a(aVar.mo10146d());
                        C11708c cVar = new C11708c(this.f30367f, aVar, a, this.f30368g.m30745a(aVar, a, this.f30366e));
                        arrayList.add(cVar);
                    }
                    seekable2 = new C11749d<>(arrayList);
                }
                return seekable2;
            } finally {
                C12118a.m31984a();
            }
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$g */
    static final /* synthetic */ class C11712g extends C12931i implements Function1<List<? extends ObservableSectionController>, C12279e<C11707b>> {
        C11712g(C11705b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final C12279e<C11707b> invoke(List<? extends ObservableSectionController> list) {
            C12932j.m33818b(list, "p1");
            return ((C11705b) this.f33505f).m30750a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C11705b.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "combineSections(Ljava/util/List;)Lio/reactivex/Observable;";
        }

        public final String getName() {
            return "combineSections";
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$h */
    static final /* synthetic */ class C11713h extends C12931i implements Function1<C11707b, C11709d> {
        C11713h(C11705b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final C11709d invoke(C11707b bVar) {
            C12932j.m33818b(bVar, "p1");
            return ((C11705b) this.f33505f).m30746a(bVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C11705b.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "calculateDiff(Lcom/snap/ui/recycling/adapter/ObservableViewModelSectionAdapter2$ItemUpdates;)Lcom/snap/ui/recycling/adapter/ObservableViewModelSectionAdapter2$SectionUpdates;";
        }

        public final String getName() {
            return "calculateDiff";
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$i */
    static final class C11714i<T> implements Predicate<C11709d> {

        /* renamed from: e */
        public static final C11714i f30369e = new C11714i();

        C11714i() {
        }

        /* renamed from: a */
        public final boolean test(C11709d dVar) {
            C12932j.m33818b(dVar, "it");
            return dVar.mo34474b() != null;
        }
    }

    /* renamed from: com.snap.ui.recycling.adapter.b$j */
    static final /* synthetic */ class C11715j extends C12931i implements Function1<C11709d, C12956q> {
        C11715j(C11705b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo34481a(C11709d dVar) {
            C12932j.m33818b(dVar, "p1");
            ((C11705b) this.f33505f).m30751a(dVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C11705b.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "applyAdapterUpdates(Lcom/snap/ui/recycling/adapter/ObservableViewModelSectionAdapter2$SectionUpdates;)V";
        }

        public final String getName() {
            return "applyAdapterUpdates";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34481a((C11709d) obj);
            return C12956q.f33541a;
        }
    }

    public /* synthetic */ C11705b(C11727c cVar, EventDispatcher eventDispatcher, C12286f fVar, C12286f fVar2, List list, AdapterErrorHandler adapterErrorHandler, int i, C12928f fVar3) {
        if ((i & 4) != 0) {
            fVar = C12802a.m33490a();
            C12932j.m33815a((Object) fVar, "Schedulers.computation()");
        }
        C12286f fVar4 = fVar;
        if ((i & 8) != 0) {
            fVar2 = C12295a.m32802a();
            C12932j.m33815a((Object) fVar2, "AndroidSchedulers.mainThread()");
        }
        C12286f fVar5 = fVar2;
        if ((i & 16) != 0) {
            list = C12848o.m33640a();
        }
        List list2 = list;
        if ((i & 32) != 0) {
            adapterErrorHandler = null;
        }
        this(cVar, eventDispatcher, fVar4, fVar5, list2, adapterErrorHandler);
    }

    public void dispose() {
        if (this.f30342h.compareAndSet(false, true)) {
            this.f30343i.dispose();
            this.f30341g.onNext(C12848o.m33640a());
        }
    }

    public AdapterViewType getItemAdapterViewType(int i) {
        return ((C11708c) ((Seekable) this.f30340f.get()).get(i)).mo34471c().mo10146d();
    }

    public int getItemCount() {
        return ((Seekable) this.f30340f.get()).size();
    }

    public long getItemId(int i) {
        return ((C11708c) ((Seekable) this.f30340f.get()).get(i)).mo34469a();
    }

    public C11722a getItemViewModel(int i) {
        return ((C11708c) ((Seekable) this.f30340f.get()).get(i)).mo34471c();
    }

    public int getItemViewType(int i) {
        return ((C11708c) ((Seekable) this.f30340f.get()).get(i)).mo34470b();
    }

    public boolean isDisposed() {
        return this.f30343i.isDisposed();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C12932j.m33818b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f30347m.onNext(new C11698b(C11699a.ATTACH, recyclerView));
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C12932j.m33818b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f30347m.onNext(new C11698b(C11699a.DETACH, recyclerView));
    }

    /* renamed from: b */
    public final Disposable mo34464b() {
        Disposable d = this.f30341g.mo36428a(this.f30350p).mo36509m(new C11717d(new C11712g(this))).mo36420a(2, TimeUnit.MILLISECONDS, this.f30350p).mo36501i(new C11717d(new C11713h(this))).mo36459b((Predicate<? super T>) C11714i.f30369e).mo36428a(this.f30351q).mo36476d((Consumer<? super T>) new C11716c<Object>(new C11715j(this)));
        C12932j.m33815a((Object) d, "sectionsSource\n         …be(::applyAdapterUpdates)");
        return d;
    }

    public C11730d<? super C11722a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12932j.m33818b(viewGroup, "parent");
        try {
            C11730d<? super C11722a> a = this.f30348n.mo34542a(viewGroup.getContext(), i, viewGroup);
            C12932j.m33815a((Object) a, "viewFactory.createViewHo…ontext, viewType, parent)");
            return a;
        } catch (Exception e) {
            AdapterErrorHandler adapterErrorHandler = this.f30352r;
            if (adapterErrorHandler != null) {
                adapterErrorHandler.onError(e, null);
                C11730d<? super C11722a> viewModelViewHolder = this.f30352r.getViewModelViewHolder(viewGroup.getContext());
                if (viewModelViewHolder != null) {
                    return viewModelViewHolder;
                }
            }
            throw e;
        }
    }

    public C11705b(C11727c cVar, EventDispatcher eventDispatcher, C12286f fVar, C12286f fVar2, List<? extends ObservableSectionController> list, AdapterErrorHandler adapterErrorHandler) {
        C12932j.m33818b(cVar, "viewFactory");
        C12932j.m33818b(eventDispatcher, "eventDispatcher");
        C12932j.m33818b(fVar, "computationScheduler");
        C12932j.m33818b(fVar2, "mainThreadScheduler");
        this.f30348n = cVar;
        this.f30349o = eventDispatcher;
        this.f30350p = fVar;
        this.f30351q = fVar2;
        this.f30352r = adapterErrorHandler;
        this.f30339e = new AtomicLong(0);
        this.f30340f = new AtomicReference<>(C11751f.m30859a());
        C12785a<List<ObservableSectionController>> h = C12785a.m33446h(list);
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(defaultSections)");
        this.f30341g = h;
        this.f30342h = new AtomicBoolean(false);
        this.f30343i = new C12275b();
        this.f30344j = new C11748c<>();
        C12279e<C11748c<C11722a>> e = C12279e.m32626e(this.f30344j);
        C12932j.m33815a((Object) e, "Observable.just(emptySeekable)");
        this.f30345k = e;
        setHasStableIds(true);
        C12789c<C11698b> s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create<AttachToRecyclerViewEvent>()");
        this.f30347m = s;
    }

    /* renamed from: a */
    public final boolean mo34462a() {
        return this.f30346l;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final long m30745a(C11722a aVar, int i, int i2) {
        return (((long) i) << 52) ^ (aVar.mo34500c() ^ (((long) i2) << 40));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C11709d m30746a(C11707b bVar) {
        C1115c cVar;
        if (bVar.mo34467b() == this.f30339e.get()) {
            C11706a aVar = new C11706a(bVar.mo34468c(), bVar.mo34466a());
            C12118a.m31986b("diff:calc");
            try {
                cVar = C1112g.m5468a(aVar, false);
            } finally {
                C12118a.m31984a();
            }
        } else {
            cVar = null;
        }
        return new C11709d(bVar.mo34466a(), cVar, bVar.mo34467b());
    }

    /* renamed from: b */
    public void onViewRecycled(C11730d<? super C11722a> dVar) {
        C12932j.m33818b(dVar, "holder");
        try {
            dVar.mo34512d();
        } catch (Exception e) {
            AdapterErrorHandler adapterErrorHandler = this.f30352r;
            if (adapterErrorHandler != null) {
                adapterErrorHandler.onError(e, null);
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30751a(C11709d dVar) {
        boolean z;
        if (dVar.mo34474b() != null) {
            synchronized (this.f30339e) {
                if (dVar.mo34475c() == this.f30339e.get()) {
                    this.f30340f.set(dVar.mo34473a());
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f30340f.set(dVar.mo34473a());
                dVar.mo34474b().mo5697a((C1069g) this);
            }
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C11730d<? super C11722a> dVar, int i) {
        C12932j.m33818b(dVar, "holder");
        try {
            C12118a.m31985a("RC:bind");
            C11708c cVar = (C11708c) ((Seekable) this.f30340f.get()).get(i);
            dVar.mo34510a(cVar.mo34471c(), this.f30349o, cVar.mo34472d());
        } catch (Exception e) {
            if (this.f30352r != null) {
                this.f30352r.onError(e, new C11718a(i));
            } else {
                throw e;
            }
        } catch (Throwable th) {
            C12118a.m31984a();
            throw th;
        }
        C12118a.m31984a();
    }

    /* renamed from: a */
    public boolean onFailedToRecycleView(C11730d<? super C11722a> dVar) {
        C12932j.m33818b(dVar, "holder");
        try {
            return dVar.mo34511c();
        } catch (Exception e) {
            AdapterErrorHandler adapterErrorHandler = this.f30352r;
            if (adapterErrorHandler != null) {
                adapterErrorHandler.onError(e, null);
                return true;
            }
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<C11707b> m30750a(List<? extends ObservableSectionController> list) {
        ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ObservableSectionController observableSectionController = (ObservableSectionController) next;
                arrayList.add(observableSectionController.getViewModels().mo36482d((ObservableSource<? extends T>) this.f30345k).mo36428a(this.f30350p).mo36501i(new C11711f(i, observableSectionController, this)));
                i = i2;
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
        C12279e<C11707b> a = C12279e.m32614a((Iterable<? extends ObservableSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) new C11710e<Object,Object>(this));
        if (a != null) {
            return a;
        }
        C12932j.m33814a();
        throw null;
    }
}
