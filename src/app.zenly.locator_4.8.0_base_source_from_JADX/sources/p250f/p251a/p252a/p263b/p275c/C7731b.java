package p250f.p251a.p252a.p263b.p275c;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p255e.C7662d;

/* renamed from: f.a.a.b.c.b */
public final class C7731b extends C1321b {

    /* renamed from: q */
    static final /* synthetic */ KProperty[] f19363q;

    /* renamed from: r */
    private static final int f19364r = C7745e.spacing_400;

    /* renamed from: s */
    private static final int f19365s = C7745e.spacing_100;

    /* renamed from: t */
    private static final int f19366t = C7745e.corner_radius_400;

    /* renamed from: f */
    private BottomSheetBehavior<View> f19367f;

    /* renamed from: g */
    private View f19368g;

    /* renamed from: h */
    private Drawable f19369h;

    /* renamed from: i */
    private int f19370i;

    /* renamed from: j */
    private int f19371j;

    /* renamed from: k */
    private int f19372k;

    /* renamed from: l */
    private Rect f19373l = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f19374m = 1.0f;

    /* renamed from: n */
    private final ReadWriteProperty f19375n = C7662d.m18660a(32);

    /* renamed from: o */
    private final C7733b f19376o = new C7733b(this);

    /* renamed from: p */
    private HashMap f19377p;

    /* renamed from: f.a.a.b.c.b$a */
    public static final class C7732a {
        private C7732a() {
        }

        public /* synthetic */ C7732a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: f.a.a.b.c.b$b */
    public static final class C7733b extends C10744c {

        /* renamed from: a */
        final /* synthetic */ C7731b f19378a;

        C7733b(C7731b bVar) {
            this.f19378a = bVar;
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            C12932j.m33818b(view, "bottomSheet");
            this.f19378a.f19374m = 1.0f - C12973l.m33892c(C12973l.m33889b(f, 0.0f), 1.0f);
            this.f19378a.m18802f();
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            C12932j.m33818b(view, "bottomSheet");
            if (i == 5) {
                C7736c cVar = (C7736c) this.f19378a.getParentFragmentManager().mo4083b("mediaPickerLibrary:fragment:mediaPicker");
                if (cVar != null) {
                    cVar.mo19946d();
                }
            }
        }
    }

    /* renamed from: f.a.a.b.c.b$c */
    static final class C7734c implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C7731b f19379e;

        C7734c(C7731b bVar) {
            this.f19379e = bVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f19379e.m18803g();
        }
    }

    /* renamed from: f.a.a.b.c.b$d */
    static final class C7735d extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C7736c f19380f;

        /* renamed from: g */
        final /* synthetic */ C7731b f19381g;

        C7735d(C7736c cVar, C7731b bVar) {
            this.f19380f = cVar;
            this.f19381g = bVar;
            super(0);
        }

        public final void invoke() {
            if (this.f19380f.mo6614b() == 0) {
                C7731b.m18798a(this.f19381g).mo30690c(4);
            } else {
                C7731b.m18798a(this.f19381g).mo30690c(3);
            }
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(C7731b.class), "selectionCountLimit", "getSelectionCountLimit()I");
        C12946x.m33837a((C12934l) mVar);
        f19363q = new KProperty[]{mVar};
        new C7732a(null);
    }

    /* renamed from: a */
    public static final /* synthetic */ BottomSheetBehavior m18798a(C7731b bVar) {
        BottomSheetBehavior<View> bottomSheetBehavior = bVar.f19367f;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        C12932j.m33820c("bottomSheet");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m18802f() {
        int i = this.f19373l.top;
        float f = ((float) i) / ((float) (this.f19370i + i));
        float f2 = ((float) this.f19371j) * ((this.f19374m - f) / (1.0f - f));
        Drawable drawable = this.f19369h;
        if (drawable != null) {
            int i2 = 0;
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
            } else if (drawable instanceof SmoothRectDrawable) {
                ((SmoothRectDrawable) drawable).setCornerRadius(f2);
            }
            View view = this.f19368g;
            String str = "bottomSheetView";
            if (view != null) {
                view.setBackground(drawable);
                float f3 = this.f19374m;
                if (f3 < f) {
                    i2 = (int) ((1.0f - (f3 / f)) * ((float) this.f19373l.top));
                }
                View view2 = this.f19368g;
                if (view2 != null) {
                    view2.setPadding(view2.getPaddingLeft(), (int) ((((float) this.f19372k) * this.f19374m) + ((float) i2)), view2.getPaddingRight(), view2.getPaddingBottom());
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c("contentBackground");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m18803g() {
        View view = getView();
        if (view != null) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.f19367f;
            if (bottomSheetBehavior != null) {
                C12932j.m33815a((Object) view, "it");
                bottomSheetBehavior.mo30686b((view.getHeight() - this.f19370i) - this.f19373l.top);
                return;
            }
            C12932j.m33820c("bottomSheet");
            throw null;
        }
    }

    /* renamed from: a */
    public View mo19936a(int i) {
        if (this.f19377p == null) {
            this.f19377p = new HashMap();
        }
        View view = (View) this.f19377p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f19377p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f19377p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final int mo6614b() {
        return ((Number) this.f19375n.getValue(this, f19363q[0])).intValue();
    }

    /* renamed from: b */
    public final void mo19937b(int i) {
        this.f19375n.setValue(this, f19363q[0], Integer.valueOf(i));
    }

    /* renamed from: d */
    public final boolean mo19939d() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f19367f;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior.mo30689c() != 5;
        }
        C12932j.m33820c("bottomSheet");
        throw null;
    }

    /* renamed from: e */
    public final void mo19940e() {
        int i = C7747g.media_picker_container;
        String str = "mediaPickerLibrary:fragment:mediaPicker";
        C7736c cVar = (C7736c) getParentFragmentManager().mo4083b(str);
        if (cVar == null) {
            cVar = new C7736c();
            cVar.mo19944b(mo6614b());
            C0819o b = getParentFragmentManager().mo4084b();
            b.mo4312a(i, (Fragment) cVar, str);
            b.mo4176a();
        }
        cVar.mo19943a((Function0<C12956q>) new C7735d<C12956q>(cVar, this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(C7748h.fragment_media_picker_bottom_sheet, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) mo19936a(C7747g.media_picker_bottom_sheet);
        String str = "media_picker_bottom_sheet";
        C12932j.m33815a((Object) frameLayout, str);
        this.f19368g = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) mo19936a(C7747g.media_picker_bottom_sheet);
        C12932j.m33815a((Object) frameLayout2, str);
        Drawable mutate = frameLayout2.getBackground().mutate();
        C12932j.m33815a((Object) mutate, "media_picker_bottom_sheet.background.mutate()");
        this.f19369h = mutate;
        this.f19370i = getResources().getDimensionPixelSize(f19364r);
        this.f19371j = getResources().getDimensionPixelSize(f19366t);
        this.f19372k = getResources().getDimensionPixelSize(f19365s);
        View view2 = this.f19368g;
        if (view2 != null) {
            BottomSheetBehavior<View> b = BottomSheetBehavior.m27416b(view2);
            b.mo30690c(5);
            b.mo14019a((C10744c) this.f19376o);
            C12932j.m33815a((Object) b, "BottomSheetBehavior.from…mSheetCallback)\n        }");
            this.f19367f = b;
            view.addOnLayoutChangeListener(new C7734c(this));
            return;
        }
        C12932j.m33820c("bottomSheetView");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        this.f19373l = rect;
        View view2 = this.f19368g;
        if (view2 != null) {
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                ((C0489d) layoutParams).setMargins(rect.left, 0, rect.right, 0);
                view2.requestLayout();
                m18803g();
                m18802f();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        C12932j.m33820c("bottomSheetView");
        throw null;
    }

    /* renamed from: c */
    public final void mo19938c() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f19367f;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo30690c(5);
        } else {
            C12932j.m33820c("bottomSheet");
            throw null;
        }
    }
}
