package app.zenly.locator.cards.p045l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import androidx.fragment.app.Fragment;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.AppIconsCard;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.userprofile.p198me.appicons.C6042a;
import app.zenly.locator.userprofile.p198me.appicons.C6050d;
import app.zenly.locator.userprofile.p198me.appicons.C6056h;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.C9224d;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.cards.l.a */
public final class C1818a extends CardFragment {

    /* renamed from: q */
    static final /* synthetic */ KProperty[] f6020q;

    /* renamed from: r */
    public static final C1819a f6021r = new C1819a(null);

    /* renamed from: l */
    private final Lazy f6022l = C12896f.m33751a(new C1822d(this));

    /* renamed from: m */
    private final Lazy f6023m = C12896f.m33751a(new C1820b(this));

    /* renamed from: n */
    private final Lazy f6024n = C12896f.m33751a(new C1823e(this));

    /* renamed from: o */
    private final Lazy f6025o = C12896f.m33751a(C1821c.f6028f);

    /* renamed from: p */
    private HashMap f6026p;

    /* renamed from: app.zenly.locator.cards.l.a$a */
    public static final class C1819a {
        private C1819a() {
        }

        /* renamed from: a */
        public final C1818a mo7477a(AppIconsCard appIconsCard) {
            C12932j.m33818b(appIconsCard, "model");
            C1818a aVar = new C1818a();
            aVar.setArguments(aVar.mo7406a((Card) appIconsCard));
            return aVar;
        }

        public /* synthetic */ C1819a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.l.a$b */
    static final class C1820b extends C12933k implements Function0<C6042a> {

        /* renamed from: f */
        final /* synthetic */ C1818a f6027f;

        C1820b(C1818a aVar) {
            this.f6027f = aVar;
            super(0);
        }

        public final C6042a invoke() {
            return C6042a.f15226p.mo13858a(this.f6027f.m7292h().mo7513e());
        }
    }

    /* renamed from: app.zenly.locator.cards.l.a$c */
    static final class C1821c extends C12933k implements Function0<C6050d> {

        /* renamed from: f */
        public static final C1821c f6028f = new C1821c();

        C1821c() {
            super(0);
        }

        public final C6050d invoke() {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            return new C6050d(a);
        }
    }

    /* renamed from: app.zenly.locator.cards.l.a$d */
    static final class C1822d extends C12933k implements Function0<AppIconsCard> {

        /* renamed from: f */
        final /* synthetic */ C1818a f6029f;

        C1822d(C1818a aVar) {
            this.f6029f = aVar;
            super(0);
        }

        public final AppIconsCard invoke() {
            Card c = this.f6029f.mo7417c();
            if (c != null) {
                return (AppIconsCard) c;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.AppIconsCard");
        }
    }

    /* renamed from: app.zenly.locator.cards.l.a$e */
    static final class C1823e extends C12933k implements Function0<C6056h> {

        /* renamed from: f */
        final /* synthetic */ C1818a f6030f;

        C1823e(C1818a aVar) {
            this.f6030f = aVar;
            super(0);
        }

        public final C6056h invoke() {
            Context requireContext = this.f6030f.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            return new C6056h(requireContext);
        }
    }

    /* renamed from: app.zenly.locator.cards.l.a$f */
    static final class C1824f implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C1818a f6031e;

        C1824f(C1818a aVar) {
            this.f6031e = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View a = this.f6031e.mo7476a(C3891l.gradient_1);
            String str = "gradient_1";
            C12932j.m33815a((Object) a, str);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setGradientType(1);
            gradientDrawable.setColors(this.f6031e.m7295k());
            View a2 = this.f6031e.mo7476a(C3891l.gradient_1);
            C12932j.m33815a((Object) a2, str);
            gradientDrawable.setGradientRadius(((float) a2.getWidth()) / 2.0f);
            a.setBackground(gradientDrawable);
        }
    }

    /* renamed from: app.zenly.locator.cards.l.a$g */
    static final class C1825g implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C1818a f6032e;

        C1825g(C1818a aVar) {
            this.f6032e = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View a = this.f6032e.mo7476a(C3891l.gradient_2);
            String str = "gradient_2";
            C12932j.m33815a((Object) a, str);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setGradientType(1);
            gradientDrawable.setColors(this.f6032e.m7294j());
            View a2 = this.f6032e.mo7476a(C3891l.gradient_2);
            C12932j.m33815a((Object) a2, str);
            int width = a2.getWidth();
            View a3 = this.f6032e.mo7476a(C3891l.gradient_2);
            C12932j.m33815a((Object) a3, str);
            gradientDrawable.setSize(width, a3.getHeight());
            View a4 = this.f6032e.mo7476a(C3891l.gradient_2);
            C12932j.m33815a((Object) a4, str);
            gradientDrawable.setGradientRadius(((float) a4.getWidth()) / 2.0f);
            a.setBackground(gradientDrawable);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C1818a.class), "appIconsCard", "getAppIconsCard()Lapp/zenly/locator/cards/models/AppIconsCard;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a(C1818a.class), "appIcons", "getAppIcons()Lapp/zenly/locator/userprofile/me/appicons/AppIcons;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a(C1818a.class), "appIconsShortcutInstaller", "getAppIconsShortcutInstaller()Lapp/zenly/locator/userprofile/me/appicons/AppIconsShortcutInstaller;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a(C1818a.class), "appIconsAnalytics", "getAppIconsAnalytics()Lapp/zenly/locator/userprofile/me/appicons/AppIconsAnalytics;");
        C12946x.m33839a((C12940r) sVar4);
        f6020q = new KProperty[]{sVar, sVar2, sVar3, sVar4};
    }

    /* renamed from: e */
    private final int m7289e() {
        int i = C1826b.f6033a[m7290f().ordinal()];
        if (i == 1) {
            return R.color.yellow_light;
        }
        if (i == 2) {
            return R.color.pink_dark;
        }
        if (i == 3) {
            return R.color.coral_dark;
        }
        if (i == 4) {
            return R.color.blue_heavy;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    private final C6042a m7290f() {
        Lazy lazy = this.f6023m;
        KProperty kProperty = f6020q[1];
        return (C6042a) lazy.getValue();
    }

    /* renamed from: g */
    private final C6050d m7291g() {
        Lazy lazy = this.f6025o;
        KProperty kProperty = f6020q[3];
        return (C6050d) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final AppIconsCard m7292h() {
        Lazy lazy = this.f6022l;
        KProperty kProperty = f6020q[0];
        return (AppIconsCard) lazy.getValue();
    }

    /* renamed from: i */
    private final C6056h m7293i() {
        Lazy lazy = this.f6024n;
        KProperty kProperty = f6020q[2];
        return (C6056h) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final int[] m7294j() {
        int i = C1826b.f6035c[m7290f().ordinal()];
        if (i == 1) {
            return new int[]{(int) 4294704259L, 16514179};
        } else if (i == 2) {
            return new int[]{(int) 4294705314L, 16515234};
        } else if (i == 3) {
            return new int[]{(int) 4294901910L, 16711830};
        } else if (i == 4) {
            return new int[]{(int) 4278254664L, 64584};
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final int[] m7295k() {
        int i = C1826b.f6034b[m7290f().ordinal()];
        if (i == 1) {
            return new int[]{(int) 4294704259L, 16514179};
        } else if (i == 2) {
            return new int[]{(int) 4290531825L, 12341745};
        } else if (i == 3) {
            return new int[]{(int) 4294958336L, 16768256};
        } else if (i == 4) {
            return new int[]{(int) 4278237949L, 47869};
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public View mo7476a(int i) {
        if (this.f6026p == null) {
            this.f6026p = new HashMap();
        }
        View view = (View) this.f6026p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6026p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6026p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_app_icon_card, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        Resources resources = requireContext.getResources();
        C12932j.m33815a((Object) resources, "requireContext().resources");
        int applyDimension = (int) TypedValue.applyDimension(1, 160.0f, resources.getDisplayMetrics());
        C2476d.m8584a((Fragment) this).m8717a(Integer.valueOf(m7290f().getLargeIcon())).m8693a(((C9224d) ((C9224d) new C9224d().mo8522b(applyDimension)).mo8516a((Transformation<Bitmap>) new C2490c<Bitmap>(null, 1, null))).mo8525e()).mo24173a((ImageView) mo7476a(C3891l.card_icon));
        C2476d.m8584a((Fragment) this).mo8544a((Drawable) new ColorDrawable(C0540a.m2536a(requireContext(), m7289e()))).m8693a(((C9224d) ((C9224d) new C9224d().mo8522b(applyDimension)).mo8516a((Transformation<Bitmap>) new C2490c<Bitmap>(null, 1, null))).mo8525e()).mo24173a((ImageView) mo7476a(C3891l.card_background));
        mo7476a(C3891l.gradient_1).addOnLayoutChangeListener(new C1824f(this));
        mo7476a(C3891l.gradient_2).addOnLayoutChangeListener(new C1825g(this));
    }

    /* renamed from: a */
    public void mo7409a(TextView textView, TextView textView2) {
        C12932j.m33818b(textView, "actionButton");
        C12932j.m33818b(textView2, "actionButtonBadge");
        textView.setVisibility(0);
        textView2.setVisibility(4);
        int i = C1826b.f6036d[m7290f().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            textView.setBackground(null);
            textView.setText(R.string.cards_shortcut_original);
        } else if (m7293i().mo13876b(m7290f())) {
            textView.setBackground(null);
            textView.setText(R.string.cards_shortcut_added);
        } else {
            textView.setBackgroundResource(R.drawable.smooth_rect_pink_cr250);
            textView.setBackgroundTintList(null);
            textView.setText(R.string.cards_shortcut_cta);
        }
        textView.setTextColor(C0540a.m2536a(textView.getContext(), (int) R.color.white));
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        m7291g().mo13860a(m7290f(), hVar.mo7468a());
    }
}
