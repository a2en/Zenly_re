package app.zenly.locator.p208y;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p135r.p138c1.C5151b;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p160v.p161b.C5543i;
import app.zenly.locator.phonesettings.view.WizardView;
import app.zenly.locator.phonesettings.view.WizardView.C4962c;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlinx.android.extensions.LayoutContainer;
import p213co.znly.core.romutils.Resolution;
import p213co.znly.core.romutils.ResolutionSolver;
import p250f.p251a.p252a.p253a.p255e.C7660b;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p279d.C7770f;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.y.a */
public final class C6280a implements LayoutContainer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Resolution f15776a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f15777b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f15778c;

    /* renamed from: d */
    private final View f15779d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Set<String> f15780e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Function1<Resolution, C12956q> f15781f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Function2<Resolution, Set<String>, C12956q> f15782g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Function2<Resolution, Set<String>, C12956q> f15783h;

    /* renamed from: i */
    private final Function0<C12956q> f15784i;

    /* renamed from: j */
    private final boolean f15785j;

    /* renamed from: k */
    private HashMap f15786k;

    /* renamed from: app.zenly.locator.y.a$a */
    static final class C6281a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C6280a f15787e;

        C6281a(C6280a aVar) {
            this.f15787e = aVar;
        }

        public final void run() {
            this.f15787e.mo14130a().invoke();
        }
    }

    /* renamed from: app.zenly.locator.y.a$b */
    public static final class C6282b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ Function0 f15788b;

        C6282b(Function0 function0) {
            this.f15788b = function0;
        }

        public void onAnimationEnd(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            super.onAnimationEnd(animator, z);
            this.f15788b.invoke();
        }
    }

    /* renamed from: app.zenly.locator.y.a$c */
    static final class C6283c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6280a f15789e;

        /* renamed from: app.zenly.locator.y.a$c$a */
        static final class C6284a extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C6283c f15790f;

            C6284a(C6283c cVar) {
                this.f15790f = cVar;
                super(0);
            }

            public final void invoke() {
                this.f15790f.f15789e.f15783h.invoke(this.f15790f.f15789e.f15776a, C12847n0.m33637a(this.f15790f.f15789e.f15780e, this.f15790f.f15789e.f15776a.getId().name()));
            }
        }

        C6283c(C6280a aVar) {
            this.f15789e = aVar;
        }

        public final void onClick(View view) {
            this.f15789e.m17328a((Function0<C12956q>) new C6284a<C12956q>(this));
        }
    }

    /* renamed from: app.zenly.locator.y.a$d */
    static final class C6285d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6280a f15791e;

        C6285d(C6280a aVar) {
            this.f15791e = aVar;
        }

        public final void onClick(View view) {
            this.f15791e.f15782g.invoke(this.f15791e.f15776a, C12847n0.m33637a(this.f15791e.f15780e, this.f15791e.f15776a.getId().name()));
        }
    }

    /* renamed from: app.zenly.locator.y.a$e */
    static final class C6286e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6280a f15792e;

        /* renamed from: f */
        final /* synthetic */ Resolution f15793f;

        C6286e(C6280a aVar, Resolution resolution) {
            this.f15792e = aVar;
            this.f15793f = resolution;
        }

        public final void onClick(View view) {
            this.f15792e.f15781f.invoke(this.f15793f);
            this.f15792e.f15777b = true;
            try {
                C12932j.m33815a((Object) view, "it");
                Context context = view.getContext();
                C12932j.m33815a((Object) context, "it.context");
                Intent intent = this.f15793f.getIntent();
                C12932j.m33815a((Object) intent, "resolution.intent");
                C7660b.m18653a(context, intent);
            } catch (Exception e) {
                C12143a.m32032b(e, "Could not start phone settings intent", new Object[0]);
                this.f15792e.f15778c = true;
                this.f15792e.m17338g();
            }
        }
    }

    public C6280a(View view, Set<String> set, Function1<? super Resolution, C12956q> function1, Function2<? super Resolution, ? super Set<String>, C12956q> function2, Function2<? super Resolution, ? super Set<String>, C12956q> function22, Function0<C12956q> function0, boolean z) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(set, "resolvedIds");
        C12932j.m33818b(function1, "onFixClickListener");
        C12932j.m33818b(function2, "onNextClickListener");
        C12932j.m33818b(function22, "onFinishClickListener");
        C12932j.m33818b(function0, "onAlreadyResolvedListener");
        this.f15779d = view;
        this.f15780e = set;
        this.f15781f = function1;
        this.f15782g = function2;
        this.f15783h = function22;
        this.f15784i = function0;
        this.f15785j = z;
        this.f15776a = (Resolution) C12857w.m33683g(m17336f());
        Resolution resolution = this.f15776a;
        if (resolution != null) {
            m17327a(resolution);
        } else {
            getContainerView().post(new C6281a(this));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c9 A[EDGE_INSN: B:52:0x00c9->B:43:0x00c9 ?: BREAK  
    EDGE_INSN: B:52:0x00c9->B:43:0x00c9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m17338g() {
        /*
            r6 = this;
            co.znly.core.romutils.Resolution r0 = r6.f15776a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.List r0 = r6.m17336f()
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "it"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0018
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0018
            goto L_0x003e
        L_0x0018:
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()
            co.znly.core.romutils.Resolution r1 = (p213co.znly.core.romutils.Resolution) r1
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            co.znly.core.romutils.Resolution$Id r1 = r1.getId()
            co.znly.core.romutils.Resolution r5 = r6.f15776a
            co.znly.core.romutils.Resolution$Id r5 = r5.getId()
            if (r1 != r5) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x001c
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0053
            co.znly.core.romutils.Resolution r0 = r6.f15776a
            boolean r0 = r0.isStateReadable()
            if (r0 != 0) goto L_0x004d
            boolean r0 = r6.f15777b
            if (r0 != 0) goto L_0x0053
        L_0x004d:
            boolean r0 = r6.f15778c
            if (r0 != 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            java.lang.String r1 = "wizard_next"
            java.lang.String r5 = "wizard_action"
            if (r0 == 0) goto L_0x0079
            int r0 = app.zenly.locator.C3891l.wizard_action
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r5)
            app.zenly.locator.p208y.p209j.C6308a.m17375a(r0, r4)
            int r0 = app.zenly.locator.C3891l.wizard_next
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0095
        L_0x0079:
            int r0 = app.zenly.locator.C3891l.wizard_action
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r5)
            app.zenly.locator.p208y.p209j.C6308a.m17375a(r0, r3)
            int r0 = app.zenly.locator.C3891l.wizard_next
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            r0.setVisibility(r4)
        L_0x0095:
            java.util.List r0 = r6.m17336f()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00a4
            goto L_0x00c9
        L_0x00a4:
            java.util.Iterator r0 = r0.iterator()
        L_0x00a8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r1 = r0.next()
            co.znly.core.romutils.Resolution r1 = (p213co.znly.core.romutils.Resolution) r1
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            co.znly.core.romutils.Resolution$Id r1 = r1.getId()
            co.znly.core.romutils.Resolution r5 = r6.f15776a
            co.znly.core.romutils.Resolution$Id r5 = r5.getId()
            if (r1 == r5) goto L_0x00c5
            r1 = 1
            goto L_0x00c6
        L_0x00c5:
            r1 = 0
        L_0x00c6:
            if (r1 == 0) goto L_0x00a8
            r3 = 0
        L_0x00c9:
            if (r3 == 0) goto L_0x00ea
            int r0 = app.zenly.locator.C3891l.wizard_next
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2132017933(0x7f14030d, float:1.9674158E38)
            r0.setText(r1)
            int r0 = app.zenly.locator.C3891l.wizard_next
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            app.zenly.locator.y.a$c r1 = new app.zenly.locator.y.a$c
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            goto L_0x0108
        L_0x00ea:
            int r0 = app.zenly.locator.C3891l.wizard_next
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2132017427(0x7f140113, float:1.9673132E38)
            r0.setText(r1)
            int r0 = app.zenly.locator.C3891l.wizard_next
            android.view.View r0 = r6.mo14129a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            app.zenly.locator.y.a$d r1 = new app.zenly.locator.y.a$d
            r1.<init>(r6)
            r0.setOnClickListener(r1)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p208y.C6280a.m17338g():void");
    }

    /* renamed from: a */
    public View mo14129a(int i) {
        if (this.f15786k == null) {
            this.f15786k = new HashMap();
        }
        View view = (View) this.f15786k.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15786k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public View getContainerView() {
        return this.f15779d;
    }

    /* renamed from: d */
    private final void m17333d() {
        WizardView wizardView = (WizardView) mo14129a(C3891l.wizard_content);
        C4962c cVar = new C4962c(0, 0, false, false, false, 27, null);
        wizardView.setItems(cVar);
        ((WizardView) mo14129a(C3891l.wizard_content)).mo2248a();
    }

    /* renamed from: e */
    private final void m17335e() {
        WizardView wizardView = (WizardView) mo14129a(C3891l.wizard_content);
        C4962c cVar = new C4962c(0, 0, false, true, false, 19, null);
        C4962c cVar2 = new C4962c(0, 0, false, true, false, 19, null);
        C4962c cVar3 = new C4962c(0, 0, false, true, false, 19, null);
        wizardView.setItems(cVar, cVar2, cVar3);
        ((WizardView) mo14129a(C3891l.wizard_content)).mo2256b();
    }

    /* renamed from: f */
    private final List<Resolution> m17336f() {
        List resolutions = ResolutionSolver.get().getResolutions(getContainerView().getContext());
        C12932j.m33815a((Object) resolutions, "ResolutionSolver.get().g…ns(containerView.context)");
        ArrayList arrayList = new ArrayList();
        for (Object next : resolutions) {
            Resolution resolution = (Resolution) next;
            Set<String> set = this.f15780e;
            C12932j.m33815a((Object) resolution, "it");
            if (!set.contains(resolution.getId().name())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo14132c() {
        ((WizardView) mo14129a(C3891l.wizard_content)).mo12158c();
    }

    /* renamed from: b */
    public final void mo14131b() {
        m17338g();
    }

    /* renamed from: a */
    public final Function0<C12956q> mo14130a() {
        return this.f15784i;
    }

    /* renamed from: a */
    private final void m17327a(Resolution resolution) {
        int i = C6287b.f15794a[resolution.getId().ordinal()];
        if (i == 1 || i == 2) {
            m17333d();
            m17324a(R.string.phoneSettings_autoStartup_title, R.string.phoneSettings_autoStartup_description, R.string.phoneSettings_autoStartup_description_keyword, R.string.phoneSettings_autoStartup_button);
        } else if (i == 3) {
            m17335e();
            m17324a(R.string.phoneSettings_powerSaving_title, R.string.phoneSettings_powerSaving_description, R.string.phoneSettings_powerSaving_description_keyword, R.string.phoneSettings_powerSaving_button);
        }
        ((TextView) mo14129a(C3891l.wizard_action)).setOnClickListener(new C6286e(this, resolution));
        m17338g();
    }

    public /* synthetic */ C6280a(View view, Set set, Function1 function1, Function2 function2, Function2 function22, Function0 function0, boolean z, int i, C12928f fVar) {
        this(view, set, function1, function2, function22, function0, (i & 64) != 0 ? false : z);
    }

    /* renamed from: a */
    private final void m17324a(int i, int i2, int i3, int i4) {
        Context context = getContainerView().getContext();
        ((ScreenBar) mo14129a(C3891l.wizard_screen_bar)).setTitle(i);
        String string = context.getString(i2);
        C7685b bVar = new C7685b();
        C12932j.m33815a((Object) context, "context");
        C7690a aVar = new C7690a(context, R.color.blue_black, 0, 4, null);
        bVar.mo19897a((Object) aVar);
        bVar.mo19897a((Object) new C7691b(context, C7770f.TextAppearance_Section));
        String string2 = context.getString(i3);
        C12932j.m33815a((Object) string2, "context.getString(descriptionKeyword)");
        bVar.mo19896a((CharSequence) string2);
        bVar.mo19899c();
        bVar.mo19899c();
        CharSequence a = C5543i.m15727a(string, bVar.mo19893a());
        WizardView wizardView = (WizardView) mo14129a(C3891l.wizard_content);
        C12932j.m33815a((Object) a, "formattedDescription");
        wizardView.setDescription(a);
        ((TextView) mo14129a(C3891l.wizard_action)).setText(i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17328a(Function0<C12956q> function0) {
        if (this.f15785j) {
            C5151b.m14710a((LottieAnimationView) mo14129a(C3891l.lottie_animation_view), (View) (FrameLayout) mo14129a(C3891l.success_layout), (C5432b) new C6282b(function0));
        } else {
            function0.invoke();
        }
    }
}
