package app.zenly.locator.dashboard.p076x;

import android.view.View;
import app.zenly.locator.dashboard.C3318o;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.locator.dashboard.x.a */
public final class C3348a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12271b f9292f;

    /* renamed from: g */
    private final C12279e<C3318o> f9293g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ObservableSectionController f9294h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<ObservableSectionController> f9295i;

    /* renamed from: app.zenly.locator.dashboard.x.a$a */
    static final class C3349a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3348a f9296e;

        /* renamed from: app.zenly.locator.dashboard.x.a$a$a */
        public static final class C3350a<T, R> implements Function<Object[], R> {

            /* renamed from: e */
            final /* synthetic */ C3348a f9297e;

            public C3350a(C3348a aVar) {
                this.f9297e = aVar;
            }

            /* renamed from: a */
            public final R apply(Object[] objArr) {
                C12932j.m33818b(objArr, "it");
                List a = C12838j.m33557a(objArr);
                ArrayList arrayList = new ArrayList(C12850p.m33647a(a, 10));
                for (Object next : a) {
                    if (next != null) {
                        arrayList.add(next);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                }
                return this.f9297e.m10533a((List<? extends Seekable<C11722a>>) arrayList);
            }
        }

        /* renamed from: app.zenly.locator.dashboard.x.a$a$b */
        static final class C3351b<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C3349a f9298e;

            C3351b(C3349a aVar) {
                this.f9298e = aVar;
            }

            /* renamed from: a */
            public final C12279e<Seekable<C11722a>> apply(Seekable<C11722a> seekable) {
                C12932j.m33818b(seekable, "it");
                return this.f9298e.f9296e.f9292f.mo36346a((ObservableSource<T>) C12279e.m32626e(seekable));
            }
        }

        C3349a(C3348a aVar) {
            this.f9296e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(C3318o oVar) {
            C12932j.m33818b(oVar, "it");
            List<ObservableSectionController> b = C12857w.m33670b((Collection) C12846n.m33635a(this.f9296e.f9294h), (Iterable) this.f9296e.f9295i);
            ArrayList arrayList = new ArrayList(C12850p.m33647a(b, 10));
            for (ObservableSectionController viewModels : b) {
                arrayList.add(viewModels.getViewModels().mo36477d());
            }
            C12279e a = C12279e.m32614a((Iterable<? extends ObservableSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) new C3350a<Object,Object>(this.f9296e));
            C12932j.m33815a((Object) a, "Observable.combineLatest…List().map { it as T }) }");
            return a.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C3351b<Object,Object>(this));
        }
    }

    public C3348a(C12271b bVar, C12279e<C3318o> eVar, ObservableSectionController observableSectionController, List<? extends ObservableSectionController> list) {
        C12932j.m33818b(bVar, "delayBind");
        C12932j.m33818b(eVar, "queryStateObservable");
        C12932j.m33818b(observableSectionController, "topAnchorSection");
        C12932j.m33818b(list, "localSections");
        this.f9292f = bVar;
        this.f9293g = eVar;
        this.f9294h = observableSectionController;
        this.f9295i = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> m = this.f9293g.mo36509m(new C3349a(this));
        C12932j.m33815a((Object) m, "queryStateObservable.swi…ble.just(it)) }\n        }");
        return m;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.snap.ui.seeking.Seekable] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.snap.ui.seeking.Seekable] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.snap.ui.seeking.Seekable] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.snap.ui.seeking.Seekable] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v6
      assigns: []
      uses: []
      mth insns count: 34
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.snap.p327ui.seeking.Seekable<com.snap.p327ui.recycling.p328d.C11722a> m10533a(java.util.List<? extends com.snap.p327ui.seeking.Seekable<com.snap.p327ui.recycling.p328d.C11722a>> r7) {
        /*
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r7.next()
        L_0x000e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r7.next()
            com.snap.ui.seeking.Seekable r1 = (com.snap.p327ui.seeking.Seekable) r1
            com.snap.ui.seeking.Seekable r0 = (com.snap.p327ui.seeking.Seekable) r0
            int r2 = r0.size()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            int r5 = r1.size()
            if (r5 <= 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x0038
            if (r3 == 0) goto L_0x0038
            com.snap.ui.seeking.Seekable r0 = com.snap.p327ui.seeking.C11751f.m30860a(r0, r1)
            goto L_0x000e
        L_0x0038:
            if (r2 == 0) goto L_0x003b
            goto L_0x000e
        L_0x003b:
            if (r3 == 0) goto L_0x003f
            r0 = r1
            goto L_0x000e
        L_0x003f:
            com.snap.ui.seeking.Seekable r0 = com.snap.p327ui.seeking.C11751f.m30859a()
            goto L_0x000e
        L_0x0044:
            com.snap.ui.seeking.Seekable r0 = (com.snap.p327ui.seeking.Seekable) r0
            return r0
        L_0x0047:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Empty collection can't be reduced."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.dashboard.p076x.C3348a.m10533a(java.util.List):com.snap.ui.seeking.Seekable");
    }
}
