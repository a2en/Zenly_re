package app.zenly.locator.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.transition.C1236k;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.transition.C3066d;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.core.widget.C3277j;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p162w.C5566b;
import app.zenly.locator.p143s.p162w.p165e.C5577a;
import app.zenly.locator.p143s.p162w.p165e.C5577a.C5583b;
import app.zenly.locator.p143s.p162w.p165e.C5577a.C5584c.C5585a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8818e;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import p250f.p251a.p252a.p253a.p255e.C7660b;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.onboarding.g3 */
public class C4808g3 extends BaseSignupController {

    /* renamed from: T */
    private Context f12725T;

    /* renamed from: U */
    private View f12726U;

    /* renamed from: V */
    private ConstraintLayout f12727V;

    /* renamed from: W */
    private ConstraintLayout f12728W;

    /* renamed from: X */
    private View f12729X;

    /* renamed from: Y */
    private View f12730Y;

    /* renamed from: Z */
    private TextView f12731Z;

    /* renamed from: a0 */
    private TextView f12732a0;

    /* renamed from: b0 */
    private ScrollView f12733b0;

    /* renamed from: c0 */
    private TextView f12734c0;

    /* renamed from: d0 */
    private View f12735d0;

    /* renamed from: e0 */
    private CheckBox f12736e0;

    /* renamed from: f0 */
    private View f12737f0;

    /* renamed from: g0 */
    private C5577a f12738g0;

    /* renamed from: h0 */
    private boolean f12739h0;

    /* renamed from: F */
    private void m14064F() {
        m14067I();
        m14065G();
    }

    /* renamed from: G */
    private void m14065G() {
        C0473c cVar = new C0473c();
        cVar.mo2783c(this.f12728W);
        cVar.mo2785d(this.f12733b0.getId(), 0);
        cVar.mo2785d(this.f12735d0.getId(), 0);
        cVar.mo2785d(this.f12737f0.getId(), 0);
        C1236k.m5968a((ViewGroup) this.f12728W, (Transition) m14069K());
        cVar.mo2779b(this.f12728W);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m14066H() {
        C0473c cVar = new C0473c();
        cVar.mo2783c(this.f12727V);
        cVar.mo2782c(this.f12729X.getId(), this.f12729X.getMeasuredWidth() / 2);
        cVar.mo2777b(this.f12729X.getId(), this.f12729X.getMeasuredHeight() / 2);
        cVar.mo2785d(this.f12730Y.getId(), 0);
        if (this.f12728W == null) {
            cVar.mo2785d(this.f12731Z.getId(), 0);
        }
        cVar.mo2785d(this.f12732a0.getId(), 0);
        C1236k.m5968a((ViewGroup) this.f12727V, (Transition) m14069K());
        cVar.mo2779b(this.f12727V);
    }

    /* renamed from: I */
    private void m14067I() {
        C0473c cVar = new C0473c();
        cVar.mo2783c(this.f12727V);
        cVar.mo2782c(this.f12729X.getId(), this.f12729X.getMeasuredWidth() / 2);
        cVar.mo2777b(this.f12729X.getId(), this.f12729X.getMeasuredHeight() / 2);
        cVar.mo2764a(this.f12729X.getId(), 4);
        C1236k.m5968a((ViewGroup) this.f12727V, (Transition) m14069K());
        cVar.mo2779b(this.f12727V);
        C7697b.m18734b(this.f12730Y, 100);
        C7697b.m18734b((View) this.f12731Z, 100);
        C7697b.m18734b((View) this.f12732a0, 100);
    }

    /* renamed from: J */
    private void m14068J() {
        CheckBox checkBox = this.f12736e0;
        if (checkBox == null || checkBox.isChecked()) {
            this.f12511Q.getCache().mo19169a(true);
            this.f12511Q.saveCache();
            C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            mo11926D();
            return;
        }
        ScrollView scrollView = this.f12733b0;
        if (scrollView != null) {
            scrollView.scrollTo(0, C3200e0.m10183a((Context) mo23920b(), 300));
        }
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.MEDIUM, C5500b.ERROR);
        m14071M();
    }

    /* renamed from: K */
    private TransitionSet m14069K() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6054a(C3066d.m9601a());
        transitionSet.mo6054a((Transition) C3066d.m9602b());
        return transitionSet;
    }

    /* renamed from: L */
    private void m14070L() {
        Activity b = mo23920b();
        if (b != null && C5407g.m15386a((Context) b).mo12989k()) {
            C5407g.m15386a((Context) b).mo12973a(false);
            C5498a.m15600a((Context) b).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C8831g k = mo23946k();
            C8836h a = C8836h.m21058a((C8819d) new C4798f3());
            a.mo24026b(new C8818e());
            a.mo24023a((ControllerChangeHandler) new C8818e());
            k.mo23991a(a);
        }
    }

    /* renamed from: M */
    private void m14071M() {
        C3106c cVar = new C3106c(mo23920b());
        cVar.mo9331a(2131231414);
        cVar.mo9349f((int) R.string.signup_error_validation_title);
        cVar.mo9348e((int) R.string.signup_error_validation_message);
        cVar.mo9345c((int) R.string.commons_button_ok);
        cVar.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: d */
    private void m14074d(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        StringBuilder sb = new StringBuilder();
        sb.append("mailto:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        C7660b.m18653a(this.f12725T, intent);
    }

    /* renamed from: B */
    public int mo7192B() {
        return 10;
    }

    /* renamed from: E */
    public /* synthetic */ void mo12000E() {
        this.f12729X.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f12725T = viewGroup.getContext();
        View inflate = layoutInflater.inflate(Locale.FRANCE.equals(Locale.getDefault()) ? R.layout.controller_intro_rfr : R.layout.controller_intro, viewGroup, false);
        this.f12726U = inflate.findViewById(R.id.signup_intro_content);
        this.f12727V = (ConstraintLayout) inflate.findViewById(R.id.signup_intro_part_default);
        this.f12729X = inflate.findViewById(R.id.signup_splash_logo);
        this.f12730Y = inflate.findViewById(R.id.signup_splash_text);
        this.f12731Z = (TextView) inflate.findViewById(R.id.signup_intro_tos_international);
        this.f12732a0 = (TextView) inflate.findViewById(R.id.signup_intro_signup);
        this.f12728W = (ConstraintLayout) inflate.findViewById(R.id.signup_intro_part_legal_fr);
        this.f12733b0 = (ScrollView) inflate.findViewById(R.id.signup_intro_legal_fr_scroll_view);
        TextView textView = (TextView) inflate.findViewById(R.id.signup_intro_legal_fr_text);
        this.f12735d0 = inflate.findViewById(R.id.signup_intro_legal_fr_checkbox_layout);
        this.f12734c0 = (TextView) inflate.findViewById(R.id.signup_intro_legal_fr_checkbox_text);
        this.f12736e0 = (CheckBox) inflate.findViewById(R.id.signup_intro_legal_fr_checkbox);
        this.f12737f0 = inflate.findViewById(R.id.signup_intro_legal_fr_signup);
        View view = this.f12735d0;
        if (view != null) {
            view.setOnClickListener(new C4884q1(this));
            this.f12734c0.setOnClickListener(new C4904s1(this));
        }
        this.f12738g0 = new C5577a((TextureView) inflate.findViewById(R.id.intro_video), new C5585a(R.raw.video_intro), true, C5583b.INSIDE);
        if (this.f12728W != null) {
            C3275i.m10385a(textView, R.string.signup_legal, Arrays.asList(new C3277j[]{new C3277j(R.string.signup_intro_privacy, R.string.app_settings_privacyurl), new C3277j(R.string.signup_legal_email, R.string.signup_legal_email, new C4909t1(this))}), new C4889r1(this, inflate));
            this.f12732a0.setText(R.string.signup_legal_signup);
            this.f12732a0.setOnClickListener(new C4924v1(this));
            C3275i.m10385a(this.f12734c0, R.string.signup_tos_accept, Collections.singletonList(new C3277j(R.string.signup_intro_tos, R.string.app_settings_termsurl)), new C4866o1(this, inflate));
            this.f12737f0.setOnClickListener(new C4914u1(this));
        } else {
            C3275i.m10385a(this.f12731Z, R.string.signup_intro_accept, Arrays.asList(new C3277j[]{new C3277j(R.string.signup_intro_tos, R.string.app_settings_termsurl), new C3277j(R.string.signup_intro_privacy, R.string.app_settings_privacyurl)}), new C4876p1(this, inflate));
            this.f12732a0.setText(R.string.signup_intro_button);
            this.f12732a0.setOnClickListener(new C4859n1(this));
        }
        this.f12739h0 = true;
        inflate.addOnLayoutChangeListener(new C4853m1(this, (LayoutParams) this.f12729X.getLayoutParams()));
        m14070L();
        return inflate;
    }

    /* renamed from: b */
    public /* synthetic */ void mo12045b(View view, C3277j jVar) {
        this.f12736e0.performClick();
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo11927a(C5566b.m15759d((String) Objects.requireNonNull(jVar.mo9729c())));
    }

    /* renamed from: c */
    public /* synthetic */ void mo12046c(View view, C3277j jVar) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo11927a(C5566b.m15759d((String) Objects.requireNonNull(jVar.mo9729c())));
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        this.f12736e0.performClick();
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        this.f12736e0.performClick();
    }

    /* renamed from: g */
    public /* synthetic */ void mo12047g(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14064F();
    }

    /* renamed from: h */
    public /* synthetic */ void mo12048h(View view) {
        m14068J();
    }

    /* renamed from: i */
    public /* synthetic */ void mo12049i(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14068J();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        this.f12726U.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11367f(Activity activity) {
        C5577a aVar = this.f12738g0;
        if (aVar != null) {
            aVar.mo13195d();
        }
        super.mo11367f(activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11369g(Activity activity) {
        super.mo11369g(activity);
        C5577a aVar = this.f12738g0;
        if (aVar != null) {
            aVar.mo13197f();
        }
    }

    /* renamed from: b */
    private int m14073b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12044a(C3277j jVar) {
        m14074d(jVar.mo9729c());
    }

    /* renamed from: a */
    public /* synthetic */ void mo12042a(View view, C3277j jVar) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo11927a(C5566b.m15759d((String) Objects.requireNonNull(jVar.mo9729c())));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12043a(LayoutParams layoutParams, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        layoutParams.topMargin = (m14073b(view.getContext()) - view.getHeight()) / 2;
        view.post(new C4931w1(this));
        if (this.f12739h0) {
            view.postDelayed(new C4940x1(this), 150);
            this.f12739h0 = false;
        }
    }
}
