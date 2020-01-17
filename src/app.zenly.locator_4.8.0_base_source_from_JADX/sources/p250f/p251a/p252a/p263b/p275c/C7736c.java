package p250f.p251a.p252a.p263b.p275c;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0540a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.C1013d;
import androidx.paging.C1018f;
import androidx.paging.DataSource.C1000a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.polenta.widget.EmptyView;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12944v;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p275c.p276l.C7761b;
import p250f.p251a.p252a.p263b.p275c.p276l.C7762c;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;
import p250f.p251a.p252a.p263b.p275c.p278n.C7764a;

/* renamed from: f.a.a.b.c.c */
public final class C7736c extends C1321b {

    /* renamed from: s */
    static final /* synthetic */ KProperty[] f19382s;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7762c f19383f = new C7762c();

    /* renamed from: g */
    private int f19384g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Toast f19385h;

    /* renamed from: i */
    private boolean f19386i;

    /* renamed from: j */
    private LiveData<C1018f<C7763a>> f19387j;

    /* renamed from: k */
    private C7744d f19388k;

    /* renamed from: l */
    private C7724a f19389l;

    /* renamed from: m */
    private GridLayoutManager f19390m;

    /* renamed from: n */
    private C7764a f19391n;

    /* renamed from: o */
    private final ReadWriteProperty f19392o = C7662d.m18660a(32);

    /* renamed from: p */
    private Function0<C12956q> f19393p;

    /* renamed from: q */
    private final Function1<C7763a, C12956q> f19394q = new C7742f(this);

    /* renamed from: r */
    private HashMap f19395r;

    /* renamed from: f.a.a.b.c.c$a */
    public static final class C7737a {

        /* renamed from: a */
        private final int f19396a;

        /* renamed from: b */
        private final int f19397b;

        public C7737a(int i, int i2) {
            this.f19396a = i;
            this.f19397b = i2;
        }

        /* renamed from: a */
        public final int mo19947a() {
            return this.f19397b;
        }

        /* renamed from: b */
        public final int mo19948b() {
            return this.f19396a;
        }
    }

    /* renamed from: f.a.a.b.c.c$b */
    public static final class C7738b {
        private C7738b() {
        }

        public /* synthetic */ C7738b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: f.a.a.b.c.c$c */
    static final class C7739c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C7736c f19398f;

        C7739c(C7736c cVar) {
            this.f19398f = cVar;
            super(0);
        }

        public final void invoke() {
            this.f19398f.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        }
    }

    /* renamed from: f.a.a.b.c.c$d */
    static final class C7740d<T> implements Observer<C1018f<C7763a>> {

        /* renamed from: a */
        final /* synthetic */ C7736c f19399a;

        C7740d(C7736c cVar) {
            this.f19399a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(C1018f<C7763a> fVar) {
            C7736c.m18813a(this.f19399a).mo4871b(fVar);
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f19399a.mo19942a(C7747g.no_media_view);
            C12932j.m33815a((Object) appCompatImageView, "no_media_view");
            appCompatImageView.setVisibility(C7736c.m18813a(this.f19399a).getItemCount() == 0 ? 0 : 8);
            this.f19399a.m18818a(true);
        }
    }

    /* renamed from: f.a.a.b.c.c$e */
    static final class C7741e<T> implements Observer<List<? extends C7763a>> {

        /* renamed from: a */
        final /* synthetic */ C7736c f19400a;

        C7741e(C7736c cVar) {
            this.f19400a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(List<C7763a> list) {
            C7762c d = this.f19400a.f19383f;
            C12932j.m33815a((Object) list, "it");
            d.mo19967a(list);
            this.f19400a.m18827h();
        }
    }

    /* renamed from: f.a.a.b.c.c$f */
    static final class C7742f extends C12933k implements Function1<C7763a, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C7736c f19401f;

        C7742f(C7736c cVar) {
            this.f19401f = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19951a(C7763a aVar) {
            C12932j.m33818b(aVar, "media");
            Toast e = this.f19401f.f19385h;
            if (e != null) {
                e.cancel();
            }
            this.f19401f.f19385h = null;
            boolean z = false;
            if (this.f19401f.mo19945c() == 1) {
                if (this.f19401f.f19383f.mo19965a(aVar) > -1) {
                    z = true;
                }
                this.f19401f.f19383f.mo19966a();
                if (!z) {
                    this.f19401f.f19383f.mo19969b(aVar);
                }
                this.f19401f.m18827h();
                if (!this.f19401f.f19383f.mo19971d()) {
                    this.f19401f.mo19946d();
                }
            } else if (this.f19401f.f19383f.mo19970c() < this.f19401f.mo19945c() || this.f19401f.f19383f.mo19965a(aVar) >= 0) {
                this.f19401f.f19383f.mo19969b(aVar);
                this.f19401f.m18827h();
            } else {
                String quantityString = this.f19401f.getResources().getQuantityString(C7749i.mediapicker_selection_limit_reached, this.f19401f.mo19945c(), new Object[]{Integer.valueOf(this.f19401f.mo19945c())});
                C12932j.m33815a((Object) quantityString, "resources.getQuantityStr…mit, selectionCountLimit)");
                C7736c cVar = this.f19401f;
                Toast makeText = Toast.makeText(cVar.requireContext(), quantityString, 0);
                makeText.show();
                cVar.f19385h = makeText;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19951a((C7763a) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: f.a.a.b.c.c$g */
    static final class C7743g implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C7736c f19402e;

        /* renamed from: f */
        final /* synthetic */ C12944v f19403f;

        C7743g(C7736c cVar, C12944v vVar) {
            this.f19402e = cVar;
            this.f19403f = vVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = this.f19403f.f33527e;
            if (i9 != i10) {
                boolean z = i10 == -1;
                this.f19403f.f33527e = i9;
                C7736c cVar = this.f19402e;
                C7737a a = cVar.m18814a(i9, cVar.getResources().getDimensionPixelSize(C7745e.spacing_50));
                C7736c.m18820c(this.f19402e).mo4956k(a.mo19947a());
                C7736c.m18819b(this.f19402e).mo19980a(a.mo19947a());
                C7736c.m18813a(this.f19402e).mo19927b(a.mo19948b());
                if (z) {
                    RecyclerView recyclerView = (RecyclerView) this.f19402e.mo19942a(C7747g.recycler_view);
                    recyclerView.setLayoutManager(C7736c.m18820c(this.f19402e));
                    recyclerView.setAdapter(C7736c.m18813a(this.f19402e));
                    recyclerView.mo5045a((C1074l) C7736c.m18819b(this.f19402e));
                }
            }
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(C7736c.class), "selectionCountLimit", "getSelectionCountLimit()I");
        C12946x.m33837a((C12934l) mVar);
        f19382s = new KProperty[]{mVar};
        new C7738b(null);
    }

    /* renamed from: b */
    public static final /* synthetic */ C7764a m18819b(C7736c cVar) {
        C7764a aVar = cVar.f19391n;
        if (aVar != null) {
            return aVar;
        }
        C12932j.m33820c("itemDecoration");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ GridLayoutManager m18820c(C7736c cVar) {
        GridLayoutManager gridLayoutManager = cVar.f19390m;
        if (gridLayoutManager != null) {
            return gridLayoutManager;
        }
        C12932j.m33820c("layoutManager");
        throw null;
    }

    /* renamed from: g */
    private final void m18826g() {
        LiveData<C1018f<C7763a>> liveData = this.f19387j;
        if (liveData != null) {
            liveData.mo4391a(this, new C7740d(this));
        } else {
            C12932j.m33820c("dataSource");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m18827h() {
        C7724a aVar = this.f19389l;
        if (aVar != null) {
            GridLayoutManager gridLayoutManager = this.f19390m;
            String str = "layoutManager";
            if (gridLayoutManager != null) {
                int J = gridLayoutManager.mo4976J();
                GridLayoutManager gridLayoutManager2 = this.f19390m;
                if (gridLayoutManager2 != null) {
                    aVar.mo19923a(J, gridLayoutManager2.mo5278e());
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c("adapter");
            throw null;
        }
    }

    /* renamed from: a */
    public View mo19942a(int i) {
        if (this.f19395r == null) {
            this.f19395r = new HashMap();
        }
        View view = (View) this.f19395r.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f19395r.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f19395r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final void mo19944b(int i) {
        this.f19392o.setValue(this, f19382s[0], Integer.valueOf(i));
    }

    /* renamed from: c */
    public final int mo19945c() {
        return ((Number) this.f19392o.getValue(this, f19382s[0])).intValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19384g = getResources().getDimensionPixelSize(C7745e.grid_size_650);
        FragmentActivity requireActivity = requireActivity();
        String str = "requireActivity()";
        C12932j.m33815a((Object) requireActivity, str);
        ContentResolver contentResolver = requireActivity.getContentResolver();
        C12932j.m33815a((Object) contentResolver, "requireActivity().contentResolver");
        LiveData<C1018f<C7763a>> a = new C1013d((C1000a<Key, Value>) new C7761b<Key,Value>(contentResolver), 100).mo4837a();
        C12932j.m33815a((Object) a, "LivePagedListBuilder(\n  …GE_SIZE\n        ).build()");
        this.f19387j = a;
        C0889u a2 = new ViewModelProvider(requireActivity()).mo4415a(C7744d.class);
        C12932j.m33815a((Object) a2, "ViewModelProvider(requir…kerViewModel::class.java)");
        this.f19388k = (C7744d) a2;
        FragmentActivity requireActivity2 = requireActivity();
        C12932j.m33815a((Object) requireActivity2, str);
        C7762c cVar = this.f19383f;
        boolean z = true;
        if (mo19945c() <= 1) {
            z = false;
        }
        this.f19389l = new C7724a(requireActivity2, cVar, z, this.f19394q);
        C7744d dVar = this.f19388k;
        if (dVar != null) {
            dVar.mo19955d().mo4391a(this, new C7741e(this));
            if (m18825f()) {
                m18826g();
                return;
            }
            return;
        }
        C12932j.m33820c("viewModel");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(C7748h.fragment_media_picker, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C12932j.m33818b(strArr, "permissions");
        C12932j.m33818b(iArr, "grantResults");
        if (i == 1 && m18823e()) {
            m18826g();
        }
    }

    public void onResume() {
        super.onResume();
        m18823e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        EmptyView emptyView = (EmptyView) mo19942a(C7747g.need_permission_view);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        emptyView.setTitle((CharSequence) C7709b.m18762a(requireContext, C7750j.mediapicker_permission_storage_title));
        this.f19390m = new GridLayoutManager(requireActivity(), 1);
        this.f19391n = new C7764a(getResources().getDimensionPixelSize(C7745e.spacing_25), 1);
        C12944v vVar = new C12944v();
        vVar.f33527e = -1;
        ((RecyclerView) mo19942a(C7747g.recycler_view)).addOnLayoutChangeListener(new C7743g(this, vVar));
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        Space space = (Space) view.findViewById(C7747g.bottom_inset);
        space.getLayoutParams().height = rect.bottom;
        space.requestLayout();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C7747g.recycler_view);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + rect.bottom);
    }

    /* renamed from: a */
    public static final /* synthetic */ C7724a m18813a(C7736c cVar) {
        C7724a aVar = cVar.f19389l;
        if (aVar != null) {
            return aVar;
        }
        C12932j.m33820c("adapter");
        throw null;
    }

    /* renamed from: e */
    private final boolean m18823e() {
        if (m18825f()) {
            EmptyView emptyView = (EmptyView) mo19942a(C7747g.need_permission_view);
            C12932j.m33815a((Object) emptyView, "need_permission_view");
            emptyView.setVisibility(8);
            return true;
        }
        EmptyView emptyView2 = (EmptyView) mo19942a(C7747g.need_permission_view);
        emptyView2.setVisibility(0);
        emptyView2.mo6794a(new C7739c(this));
        m18818a(true);
        return false;
    }

    /* renamed from: f */
    private final boolean m18825f() {
        return C0540a.m2537a((Context) requireActivity(), "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    public final int mo6614b() {
        RecyclerView recyclerView = (RecyclerView) mo19942a(C7747g.recycler_view);
        if (recyclerView != null) {
            return recyclerView.computeVerticalScrollOffset();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo19946d() {
        C7744d dVar = this.f19388k;
        if (dVar != null) {
            dVar.mo19953a(this.f19383f.mo19968b());
        } else {
            C12932j.m33820c("viewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18818a(boolean z) {
        if (z != this.f19386i) {
            this.f19386i = z;
            if (z) {
                Function0<C12956q> function0 = this.f19393p;
                if (function0 != null) {
                    C12956q qVar = (C12956q) function0.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19943a(Function0<C12956q> function0) {
        this.f19393p = function0;
        if (this.f19386i && function0 != null) {
            C12956q qVar = (C12956q) function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C7737a m18814a(int i, int i2) {
        int a = C12973l.m33885a((i + i2) / (this.f19384g + i2), 1);
        int i3 = this.f19384g;
        return new C7737a(i3 + (((i - (a * i3)) - ((a - 1) * i2)) / a), a);
    }
}
