package com.snap.p327ui.recycling.prefetch;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p379a.C12118a;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;

/* renamed from: com.snap.ui.recycling.prefetch.b */
public final class C11739b extends C12292a implements ViewPrefetcher {

    /* renamed from: f */
    private final AtomicBoolean f30418f = new AtomicBoolean(false);

    /* renamed from: g */
    private final SparseArray<LinkedList<View>> f30419g = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C11745c f30420h = new C11745c(this.f30422j);

    /* renamed from: i */
    private final C12286f f30421i;

    /* renamed from: j */
    private final LayoutInflater f30422j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ViewGroup f30423k;

    /* renamed from: com.snap.ui.recycling.prefetch.b$a */
    public static final class C11740a {
        private C11740a() {
        }

        public /* synthetic */ C11740a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.b$b */
    private static final class C11741b {
        public C11741b(int i, View view) {
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.b$c */
    static final class C11742c<T> implements Consumer<Disposable> {

        /* renamed from: e */
        public static final C11742c f30424e = new C11742c();

        C11742c() {
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            C12118a.m31985a("view:load");
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.b$d */
    static final class C11743d implements Action {

        /* renamed from: a */
        public static final C11743d f30425a = new C11743d();

        C11743d() {
        }

        public final void run() {
            C12118a.m31984a();
        }
    }

    /* renamed from: com.snap.ui.recycling.prefetch.b$e */
    static final class C11744e<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C11739b f30426e;

        C11744e(C11739b bVar) {
            this.f30426e = bVar;
        }

        /* renamed from: a */
        public final T apply(Integer num) {
            C12932j.m33818b(num, "it");
            T inflate = this.f30426e.f30420h.mo34560a().inflate(num.intValue(), this.f30426e.f30423k, false);
            if (inflate != null) {
                return inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
    }

    static {
        new C11740a(null);
        new C11741b(0, null);
    }

    public C11739b(C12286f fVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(fVar, "inflationScheduler");
        C12932j.m33818b(layoutInflater, "layoutInflater");
        this.f30421i = fVar;
        this.f30422j = layoutInflater;
        this.f30423k = viewGroup;
    }

    public View getPrefetchedView(int i) {
        LinkedList linkedList = (LinkedList) this.f30419g.get(i);
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        return (View) linkedList.remove();
    }

    /* renamed from: a */
    public final <T extends View> C12291g<T> mo34557a(int i) {
        C12291g<T> b = C12291g.m32767b(Integer.valueOf(i)).mo36546b((Consumer<? super Disposable>) C11742c.f30424e).mo36536a((Action) C11743d.f30425a).mo36552d((Function<? super T, ? extends R>) new C11744e<Object,Object>(this)).mo36544b(this.f30421i);
        C12932j.m33815a((Object) b, "Single.just(layoutId)\n  …ibeOn(inflationScheduler)");
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
        this.f30418f.set(true);
        int size = this.f30419g.size();
        for (int i = 0; i < size; i++) {
            SparseArray<LinkedList<View>> sparseArray = this.f30419g;
            ((LinkedList) sparseArray.get(sparseArray.keyAt(i))).clear();
        }
        this.f30419g.clear();
    }
}
