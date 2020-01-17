package app.zenly.android.feature.descendants;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.descendants.C1365a.C1366a;
import app.zenly.android.feature.descendants.Contract.Presenter;
import app.zenly.android.feature.descendants.Contract.View;
import app.zenly.android.feature.descendants.recycler.C1407b;
import app.zenly.android.feature.descendants.recycler.C1408c;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.android.feature.descendants.b */
public final class C1367b extends C1321b implements View {

    /* renamed from: n */
    static final /* synthetic */ KProperty[] f5010n;

    /* renamed from: f */
    private Presenter f5011f;

    /* renamed from: g */
    private C1365a f5012g;

    /* renamed from: h */
    private final C1408c f5013h = new C1408c(new C1407b(), true);

    /* renamed from: i */
    private final ReadWriteProperty f5014i = C7662d.m18660a(1);

    /* renamed from: j */
    private final ReadWriteProperty f5015j = C7662d.m18661a(0, 1, (Object) null);

    /* renamed from: k */
    private final ReadWriteProperty f5016k = C7662d.m18663a(0, 1, (Object) null);

    /* renamed from: l */
    private final ReadWriteProperty f5017l = C7662d.m18671c();

    /* renamed from: m */
    private HashMap f5018m;

    /* renamed from: app.zenly.android.feature.descendants.b$a */
    public static final class C1368a {
        private C1368a() {
        }

        public /* synthetic */ C1368a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.b$b */
    static final /* synthetic */ class C1369b extends C12931i implements Function0<C12956q> {
        C1369b(C1367b bVar) {
            super(0, bVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1367b.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "loadData()V";
        }

        public final String getName() {
            return "loadData";
        }

        public final void invoke() {
            ((C1367b) this.f33505f).m6392f();
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(C1367b.class), "dataType", "getDataType()I");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(C1367b.class), "count", "getCount()I");
        C12946x.m33837a((C12934l) mVar2);
        C12935m mVar3 = new C12935m(C12946x.m33834a(C1367b.class), "lastSeenDate", "getLastSeenDate()J");
        C12946x.m33837a((C12934l) mVar3);
        C12935m mVar4 = new C12935m(C12946x.m33834a(C1367b.class), "topTarget", "getTopTarget()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar4);
        f5010n = new KProperty[]{mVar, mVar2, mVar3, mVar4};
        new C1368a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m6392f() {
        C1365a aVar = this.f5012g;
        String str = "dataView";
        if (aVar != null) {
            if (aVar.mo6608a() != C1366a.DATA) {
                C1365a aVar2 = this.f5012g;
                if (aVar2 != null) {
                    aVar2.mo6609a(C1366a.LOADING);
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
            Presenter presenter = this.f5011f;
            if (presenter != null) {
                presenter.start();
            } else {
                C12932j.m33820c("presenter");
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: a */
    public android.view.View mo6611a(int i) {
        if (this.f5018m == null) {
            this.f5018m = new HashMap();
        }
        android.view.View view = (android.view.View) this.f5018m.get(Integer.valueOf(i));
        if (view == null) {
            android.view.View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f5018m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f5018m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo6612a(long j) {
        this.f5016k.setValue(this, f5010n[2], Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo6613a(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f5017l.setValue(this, f5010n[3], str);
    }

    /* renamed from: b */
    public final int mo6614b() {
        return ((Number) this.f5015j.getValue(this, f5010n[1])).intValue();
    }

    /* renamed from: b */
    public final void mo6615b(int i) {
        this.f5015j.setValue(this, f5010n[1], Integer.valueOf(i));
    }

    /* renamed from: c */
    public final int mo6616c() {
        return ((Number) this.f5014i.getValue(this, f5010n[0])).intValue();
    }

    /* renamed from: c */
    public final void mo6617c(int i) {
        this.f5014i.setValue(this, f5010n[0], Integer.valueOf(i));
    }

    /* renamed from: d */
    public final long mo6618d() {
        return ((Number) this.f5016k.getValue(this, f5010n[2])).longValue();
    }

    /* renamed from: e */
    public final String mo6619e() {
        return (String) this.f5017l.getValue(this, f5010n[3]);
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(C1387l.fragment_descendants_list, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onErrorShowErrorScreen(Throwable th) {
        C12932j.m33818b(th, "throwable");
        C12143a.m32032b(th, "An error occured loading descendants", new Object[0]);
        C1365a aVar = this.f5012g;
        if (aVar != null) {
            aVar.mo6609a(C1366a.ERROR);
        } else {
            C12932j.m33820c("dataView");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        m6392f();
    }

    public void onStop() {
        Presenter presenter = this.f5011f;
        if (presenter != null) {
            presenter.stop();
            super.onStop();
            return;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0.mo6608a() == app.zenly.android.feature.descendants.C1365a.C1366a.ERROR) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccessShowDataScreen(java.util.List<? extends app.zenly.android.feature.descendants.recycler.C1406a<? extends java.lang.Object>> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "descendants"
            kotlin.jvm.internal.C12932j.m33818b(r7, r0)
            app.zenly.android.feature.descendants.recycler.c r0 = r6.f5013h
            r0.mo5740a(r7)
            int r0 = r6.mo6616c()
            r1 = 0
            java.lang.String r2 = "dataView"
            r3 = 2
            if (r0 != r3) goto L_0x0065
            app.zenly.android.feature.descendants.a r0 = r6.f5012g
            if (r0 == 0) goto L_0x0061
            app.zenly.android.feature.descendants.a$a r0 = r0.mo6608a()
            app.zenly.android.feature.descendants.a$a r3 = app.zenly.android.feature.descendants.C1365a.C1366a.LOADING
            if (r0 == r3) goto L_0x0031
            app.zenly.android.feature.descendants.a r0 = r6.f5012g
            if (r0 == 0) goto L_0x002d
            app.zenly.android.feature.descendants.a$a r0 = r0.mo6608a()
            app.zenly.android.feature.descendants.a$a r3 = app.zenly.android.feature.descendants.C1365a.C1366a.ERROR
            if (r0 != r3) goto L_0x0065
            goto L_0x0031
        L_0x002d:
            kotlin.jvm.internal.C12932j.m33820c(r2)
            throw r1
        L_0x0031:
            int r0 = app.zenly.android.feature.descendants.C1386k.recycler_view
            android.view.View r0 = r6.mo6611a(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r3 = 0
            java.util.Iterator r7 = r7.iterator()
        L_0x003e:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r7.next()
            app.zenly.android.feature.descendants.recycler.a r4 = (app.zenly.android.feature.descendants.recycler.C1406a) r4
            java.lang.String r4 = r4.mo6669b()
            java.lang.String r5 = r6.mo6619e()
            boolean r4 = kotlin.jvm.internal.C12932j.m33817a(r4, r5)
            if (r4 == 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x003e
        L_0x005c:
            r3 = -1
        L_0x005d:
            r0.mo5096g(r3)
            goto L_0x0065
        L_0x0061:
            kotlin.jvm.internal.C12932j.m33820c(r2)
            throw r1
        L_0x0065:
            app.zenly.android.feature.descendants.a r7 = r6.f5012g
            if (r7 == 0) goto L_0x006f
            app.zenly.android.feature.descendants.a$a r0 = app.zenly.android.feature.descendants.C1365a.C1366a.DATA
            r7.mo6609a(r0)
            return
        L_0x006f:
            kotlin.jvm.internal.C12932j.m33820c(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.descendants.C1367b.onSuccessShowDataScreen(java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r9v28, types: [app.zenly.android.feature.descendants.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C12932j.m33818b(r8, r0)
            super.onViewCreated(r8, r9)
            app.zenly.android.feature.descendants.a r8 = new app.zenly.android.feature.descendants.a
            int r9 = app.zenly.android.feature.descendants.C1386k.progress_view
            android.view.View r9 = r7.mo6611a(r9)
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            java.lang.String r0 = "progress_view"
            kotlin.jvm.internal.C12932j.m33815a(r9, r0)
            int r0 = app.zenly.android.feature.descendants.C1386k.error_view
            android.view.View r0 = r7.mo6611a(r0)
            app.zenly.android.feature.polenta.widget.EmptyView r0 = (app.zenly.android.feature.polenta.widget.EmptyView) r0
            java.lang.String r1 = "error_view"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            int r1 = app.zenly.android.feature.descendants.C1386k.recycler_view
            android.view.View r1 = r7.mo6611a(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            java.util.List r1 = kotlin.collections.C12846n.m33635a(r1)
            r8.<init>(r9, r0, r1)
            r7.f5012g = r8
            app.zenly.android.feature.descendants.a r8 = r7.f5012g
            if (r8 == 0) goto L_0x012a
            app.zenly.android.feature.descendants.b$b r9 = new app.zenly.android.feature.descendants.b$b
            r9.<init>(r7)
            r8.mo6610a(r9)
            android.content.Context r8 = r7.requireContext()
            java.lang.String r9 = "requireContext()"
            kotlin.jvm.internal.C12932j.m33815a(r8, r9)
            app.zenly.android.feature.descendants.DescendantsModule r8 = app.zenly.android.feature.descendants.C1378f.m6419a(r8)
            com.bumptech.glide.j r9 = r8.provideGlide()
            app.zenly.android.feature.base.model.AvatarLoader r0 = r8.provideAvatarLoader()
            app.zenly.android.feature.descendants.recycler.c r1 = r7.f5013h
            app.zenly.android.feature.descendants.s.b r2 = new app.zenly.android.feature.descendants.s.b
            r2.<init>(r0)
            r1.mo6676a(r2)
            app.zenly.android.feature.descendants.recycler.c r1 = r7.f5013h
            app.zenly.android.feature.descendants.s.a r2 = new app.zenly.android.feature.descendants.s.a
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            java.lang.String r4 = "requireActivity()"
            kotlin.jvm.internal.C12932j.m33815a(r3, r4)
            app.zenly.android.feature.descendants.Navigation r4 = r8.provideNavigation()
            r2.<init>(r3, r4)
            r1.mo6676a(r2)
            app.zenly.android.feature.descendants.recycler.c r1 = r7.f5013h
            app.zenly.android.feature.descendants.s.c r2 = new app.zenly.android.feature.descendants.s.c
            r2.<init>()
            r1.mo6676a(r2)
            app.zenly.android.feature.descendants.recycler.c r1 = r7.f5013h
            app.zenly.android.feature.descendants.s.d r2 = new app.zenly.android.feature.descendants.s.d
            r2.<init>(r0, r9)
            r1.mo6676a(r2)
            app.zenly.android.feature.descendants.recycler.c r1 = r7.f5013h
            app.zenly.android.feature.descendants.s.e r2 = new app.zenly.android.feature.descendants.s.e
            r2.<init>(r0, r9)
            r1.mo6676a(r2)
            int r9 = app.zenly.android.feature.descendants.C1386k.recycler_view
            android.view.View r9 = r7.mo6611a(r9)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            java.lang.String r0 = "recycler_view"
            kotlin.jvm.internal.C12932j.m33815a(r9, r0)
            app.zenly.android.feature.descendants.recycler.c r0 = r7.f5013h
            r9.setAdapter(r0)
            int r9 = app.zenly.android.feature.descendants.C1386k.recycler_view
            android.view.View r9 = r7.mo6611a(r9)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 1
            r9.setHasFixedSize(r0)
            int r9 = r7.mo6616c()
            r0 = 2
            java.lang.String r1 = "subtitle"
            if (r9 != r0) goto L_0x00ef
            int r9 = app.zenly.android.feature.descendants.C1386k.title
            android.view.View r9 = r7.mo6611a(r9)
            app.zenly.android.feature.polenta.widget.ScreenBar r9 = (app.zenly.android.feature.polenta.widget.ScreenBar) r9
            int r0 = app.zenly.android.feature.descendants.C1392n.descendantsLeaderboard_title
            java.lang.String r0 = r7.getString(r0)
            r9.setTitle(r0)
            int r9 = app.zenly.android.feature.descendants.C1386k.subtitle
            android.view.View r9 = r7.mo6611a(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            kotlin.jvm.internal.C12932j.m33815a(r9, r1)
            int r0 = app.zenly.android.feature.descendants.C1392n.descendantsLeaderboard_subtitle
            java.lang.String r0 = r7.getString(r0)
            r9.setText(r0)
            app.zenly.android.feature.descendants.q r9 = new app.zenly.android.feature.descendants.q
            app.zenly.android.feature.descendants.repository.DescendantsRepository r8 = r8.provideDescendantsRepository()
            java.lang.String r0 = r7.mo6619e()
            r9.<init>(r8, r7, r0)
            goto L_0x0127
        L_0x00ef:
            int r9 = app.zenly.android.feature.descendants.C1386k.title
            android.view.View r9 = r7.mo6611a(r9)
            app.zenly.android.feature.polenta.widget.ScreenBar r9 = (app.zenly.android.feature.polenta.widget.ScreenBar) r9
            int r0 = app.zenly.android.feature.descendants.C1392n.descendantsList_title
            java.lang.String r0 = r7.getString(r0)
            r9.setTitle(r0)
            int r9 = app.zenly.android.feature.descendants.C1386k.subtitle
            android.view.View r9 = r7.mo6611a(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            kotlin.jvm.internal.C12932j.m33815a(r9, r1)
            int r0 = app.zenly.android.feature.descendants.C1392n.descendantsList_subtitle
            java.lang.String r0 = r7.getString(r0)
            r9.setText(r0)
            app.zenly.android.feature.descendants.e r9 = new app.zenly.android.feature.descendants.e
            app.zenly.android.feature.descendants.repository.DescendantsRepository r2 = r8.provideDescendantsRepository()
            int r4 = r7.mo6614b()
            long r5 = r7.mo6618d()
            r1 = r9
            r3 = r7
            r1.<init>(r2, r3, r4, r5)
        L_0x0127:
            r7.f5011f = r9
            return
        L_0x012a:
            java.lang.String r8 = "dataView"
            kotlin.jvm.internal.C12932j.m33820c(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.descendants.C1367b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public void onWindowInsetsChanged(android.view.View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarLayout screenBarLayout = (ScreenBarLayout) mo6611a(C1386k.header);
        C12932j.m33815a((Object) screenBarLayout, "header");
        screenBarLayout.setPadding(rect.left, rect.top, rect.right, screenBarLayout.getPaddingBottom());
        RecyclerView recyclerView = (RecyclerView) mo6611a(C1386k.recycler_view);
        C12932j.m33815a((Object) recyclerView, "recycler_view");
        recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, rect.bottom + view.getResources().getDimensionPixelSize(C1384i.grid_size_600));
        EmptyView emptyView = (EmptyView) mo6611a(C1386k.error_view);
        C12932j.m33815a((Object) emptyView, "error_view");
        emptyView.setPadding(rect.left, emptyView.getPaddingTop(), rect.right, rect.bottom);
    }
}
