package app.zenly.locator.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0122a.C0123a;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.PhonePicker;
import app.zenly.locator.PhonePicker.Callback;
import app.zenly.locator.R;
import app.zenly.locator.controllers.country.OnCountryPickedListener;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.onboarding.p125y3.C4948b;
import app.zenly.locator.onboarding.p125y3.C4951d;
import app.zenly.locator.p135r.p137b1.C5147g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.google.android.gms.auth.api.phone.C9973a;
import p213co.znly.models.core.C7123i2;
import p213co.znly.models.services.C8228p4;
import p213co.znly.models.services.ZenlyProto$SessionCreateRequest;
import p213co.znly.models.services.ZenlyProto$SessionCreateRequest.C7958a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.onboarding.m3 */
public class C4855m3 extends BaseSignupController implements OnCountryPickedListener {

    /* renamed from: T */
    private ScreenBar f12808T;

    /* renamed from: U */
    private TextView f12809U;

    /* renamed from: V */
    private TextView f12810V;

    /* renamed from: W */
    private EditText f12811W;

    /* renamed from: X */
    private PhonePicker f12812X;

    /* renamed from: Y */
    private ImageView f12813Y;

    /* renamed from: Z */
    private ProgressBar f12814Z;

    /* renamed from: a0 */
    private boolean f12815a0;

    /* renamed from: b0 */
    private C7123i2 f12816b0;

    /* renamed from: c0 */
    private final C12275b f12817c0 = new C12275b();

    /* renamed from: app.zenly.locator.onboarding.m3$a */
    class C4856a implements Callback {

        /* renamed from: a */
        final /* synthetic */ View f12818a;

        C4856a(View view) {
            this.f12818a = view;
        }

        public void onCountryButtonClick() {
            if (C4855m3.this.f12511Q != null) {
                C5498a.m15600a(this.f12818a.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                C4855m3 m3Var = C4855m3.this;
                m3Var.f12511Q.showCountryPicker(m3Var);
            }
        }

        public void onKeyboardValidate() {
            C4855m3.this.m14169G();
        }

        public void onRegionUpdated(C5147g gVar) {
            C4855m3.this.m14179a(gVar.mo12521b());
            C4855m3.this.m14171I();
        }
    }

    /* renamed from: F */
    private void m14168F() {
        this.f12815a0 = true;
        this.f12812X.mo7012a(false);
        this.f12813Y.setVisibility(8);
        this.f12814Z.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m14169G() {
        if (this.f12511Q == null) {
            C12143a.m32030b("mListener is null. onNextButtonClicked on detach ?", new Object[0]);
        } else if (!this.f12815a0) {
            m14168F();
            C5498a.m15600a(this.f12808T.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            if (!this.f12812X.mo7017f()) {
                m14173a(m14182b(this.f12808T.getContext()));
            } else if (C4951d.m14282a(this.f12812X.mo7015d()) == -3) {
                C0123a aVar = new C0123a(mo23920b());
                aVar.mo548c(R.string.settings_inputphonenumber_title_tooShort_Brazil);
                aVar.mo544b((int) R.string.settings_inputphonenumber_content_tooShort_Brazil);
                aVar.mo531a((OnDismissListener) new C4841k2(this));
                aVar.mo549c(R.string.commons_button_ok, C4877p2.f12843e);
                aVar.mo550c();
            } else {
                String c = this.f12812X.mo7014c();
                if (TextUtils.isEmpty(c)) {
                    c = this.f12812X.mo7015d();
                }
                this.f12511Q.getCache().mo19168a(c);
                this.f12511Q.saveCache();
                m14187d(c);
            }
        }
    }

    /* renamed from: H */
    private void m14170H() {
        this.f12815a0 = false;
        this.f12812X.mo7012a(true);
        this.f12813Y.setVisibility(0);
        this.f12814Z.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m14171I() {
        if (this.f12812X.mo7009a() == 55) {
            this.f12809U.setVisibility(0);
            this.f12810V.setVisibility(0);
            this.f12811W.setHint(R.string.settings_inputphonenumber_placeholder_phone_Brazil);
            this.f12808T.setTitle((int) R.string.settings_inputphonenumber_title_identifyyou_Brazil);
            return;
        }
        this.f12809U.setVisibility(8);
        this.f12810V.setVisibility(8);
        this.f12811W.setHint(R.string.settings_inputphonenumber_placeholder_phone);
        this.f12808T.setTitle((int) R.string.signup_identity_title);
    }

    /* renamed from: c */
    private static C3106c m14185c(Context context) {
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9346c(C7709b.m18762a(context, R.string.settings_inputphonenumber_header_invalidphone));
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: B */
    public int mo7192B() {
        return 30;
    }

    /* renamed from: E */
    public /* synthetic */ void mo12000E() {
        m14170H();
        this.f12811W.requestFocus();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12817c0.mo36401a();
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        m14169G();
    }

    public void onPhoneRegionSelected(C7123i2 i2Var, int i) {
        m14179a(i2Var);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        String phoneNumber = this.f12511Q.getCache().getPhoneNumber();
        this.f12817c0.add((phoneNumber != null ? C12279e.m32626e(phoneNumber) : C5448c.m15478a().devicePhoneNumber()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4867o2<Object>(this), (Consumer<? super Throwable>) C4854m2.f12807e));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m14189e(String str) {
        this.f12812X.mo7011a(str);
        this.f12812X.mo7016e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (this.f12815a0) {
            m14170H();
        }
        if (this.f12511Q.getCache().hasPhoneRegion()) {
            this.f12812X.mo7010a(this.f12511Q.getCache().getPhoneRegion());
        }
        this.f12812X.mo7016e();
    }

    /* renamed from: d */
    private void m14187d(String str) {
        C9973a.m24977a(mo23920b()).startSmsRetriever();
        C7958a newBuilder = ZenlyProto$SessionCreateRequest.newBuilder();
        newBuilder.mo21657a(str);
        this.f12817c0.add(C5448c.m15478a().sessionCreate((ZenlyProto$SessionCreateRequest) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4834j2<Object>(this), (Consumer<? super Throwable>) new C4846l2<Object>(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_phone, viewGroup, false);
        this.f12808T = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f12808T.setTitle((int) R.string.addfriend_button);
        this.f12809U = (TextView) inflate.findViewById(R.id.phone_picker_brazil_warning);
        this.f12810V = (TextView) inflate.findViewById(R.id.phone_picker_brazil_sample);
        this.f12811W = (EditText) inflate.findViewById(R.id.phone_picker_number);
        this.f12813Y = (ImageView) inflate.findViewById(R.id.phone_picker_next_image);
        this.f12814Z = (ProgressBar) inflate.findViewById(R.id.phone_picker_progress);
        this.f12813Y.setImageResource(2131231377);
        this.f12812X = new PhonePicker(inflate, this.f12816b0, true, new C4856a(inflate));
        this.f12813Y.setOnClickListener(new C4860n2(this));
        this.f12809U.setText(C7709b.m18762a(mo23920b(), R.string.settings_inputphonenumber_subtitle_Brazil));
        m14171I();
        return inflate;
    }

    /* renamed from: e */
    private static C3106c m14188e(Context context) {
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9346c(C7709b.m18762a(context, R.string.commons_content_oopserror));
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m14184b(Throwable th) {
        if (C4948b.m14277a(th.getMessage())) {
            m14173a(m14186d(this.f12808T.getContext()));
        } else if (C4948b.m14278b(th.getMessage())) {
            C4847l3.m14146j().mo12069a(false);
            C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.MEDIUM, C5500b.ERROR);
            m14173a(m14185c(this.f12808T.getContext()));
        } else {
            m14173a(m14188e(this.f12808T.getContext()));
        }
    }

    /* renamed from: d */
    private static C3106c m14186d(Context context) {
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9349f((int) R.string.signup_error_nonetwork_title);
        cVar.mo9348e((int) R.string.signup_error_nonetwork_subtitle);
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: b */
    private static C3106c m14182b(Context context) {
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9346c(C7709b.m18762a(context, R.string.settings_inputphonenumber_title_emptyphone));
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12087a(DialogInterface dialogInterface) {
        m14170H();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14180a(C8228p4 p4Var) {
        C4847l3.m14146j().mo12069a(true);
        this.f12511Q.getCache().mo19162a(p4Var.getVerifyInfo().getChallengeSize());
        this.f12511Q.getCache().mo19167a(p4Var.getVerifyInfo().getChallengeType());
        this.f12511Q.getCache().mo19165a(p4Var.getSession());
        this.f12511Q.getCache().mo19166a(p4Var.getVerifyInfo());
        this.f12511Q.saveCache();
        mo11926D();
    }

    /* renamed from: a */
    private void m14173a(C3106c cVar) {
        cVar.mo9300a((ExitListener) new C4829i2(this)).mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14179a(C7123i2 i2Var) {
        Activity b = mo23920b();
        this.f12816b0 = i2Var;
        if (b instanceof SignupListener) {
            SignupListener signupListener = (SignupListener) b;
            signupListener.getCache().mo19164a(i2Var);
            signupListener.saveCache();
        }
    }
}
