package app.zenly.locator.p135r;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.PhonePicker;
import app.zenly.locator.PhonePicker.Callback;
import app.zenly.locator.R;
import app.zenly.locator.controllers.country.C2426b;
import app.zenly.locator.controllers.country.OnCountryPickedListener;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.p072ui.controller.C3103g;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p135r.p137b1.C5147g;
import app.zenly.locator.p135r.p138c1.C5154c;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5365v;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import com.bluelinelabs.conductor.changehandler.C8818e;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7123i2;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.r.v0 */
public final class C5198v0 extends ZenlyController implements OnCountryPickedListener {

    /* renamed from: V */
    public static final C5199a f13431V = new C5199a(null);

    /* renamed from: P */
    private ScreenBar f13432P;

    /* renamed from: Q */
    private PhonePicker f13433Q;

    /* renamed from: R */
    private FrameLayout f13434R;

    /* renamed from: S */
    private ImageView f13435S;

    /* renamed from: T */
    private ProgressBar f13436T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C7123i2 f13437U;

    /* renamed from: app.zenly.locator.r.v0$a */
    public static final class C5199a {
        private C5199a() {
        }

        /* renamed from: a */
        public final C5198v0 mo12536a() {
            return new C5198v0();
        }

        public /* synthetic */ C5199a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.r.v0$b */
    static final class C5200b implements ExitListener {

        /* renamed from: a */
        final /* synthetic */ C5198v0 f13438a;

        C5200b(C5198v0 v0Var) {
            this.f13438a = v0Var;
        }

        public final void onExit() {
            this.f13438a.m14773L();
        }
    }

    /* renamed from: app.zenly.locator.r.v0$c */
    public static final class C5201c implements Callback {

        /* renamed from: a */
        final /* synthetic */ C5198v0 f13439a;

        C5201c(C5198v0 v0Var) {
            this.f13439a = v0Var;
        }

        public void onCountryButtonClick() {
            this.f13439a.m14765D();
        }

        public void onKeyboardValidate() {
            this.f13439a.m14766E();
        }

        public void onRegionUpdated(C5147g gVar) {
            C12932j.m33818b(gVar, "region");
            this.f13439a.f13437U = gVar.mo12521b();
        }
    }

    /* renamed from: app.zenly.locator.r.v0$d */
    static final class C5202d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5198v0 f13440e;

        C5202d(C5198v0 v0Var) {
            this.f13440e = v0Var;
        }

        public final void onClick(View view) {
            this.f13440e.m14766E();
        }
    }

    /* renamed from: app.zenly.locator.r.v0$e */
    public static final class C5203e implements InvitationCallback {

        /* renamed from: a */
        final /* synthetic */ C5198v0 f13441a;

        /* renamed from: b */
        final /* synthetic */ Context f13442b;

        C5203e(C5198v0 v0Var, Context context) {
            this.f13441a = v0Var;
            this.f13442b = context;
        }

        public void onCancel() {
            this.f13441a.m14773L();
        }

        public boolean onError(C2624x xVar) {
            C12932j.m33818b(xVar, "error");
            switch (C5205w0.f13444a[xVar.ordinal()]) {
                case 1:
                case 2:
                    this.f13441a.m14767F();
                    return false;
                case 3:
                    this.f13441a.m14769H();
                    break;
                case 4:
                    this.f13441a.m14768G();
                    break;
                case 5:
                    this.f13441a.m14770I();
                    break;
                case 6:
                    this.f13441a.m14771J();
                    break;
                default:
                    Toast.makeText(this.f13442b, R.string.commons_content_oopserror, 0).show();
                    this.f13441a.m14773L();
                    break;
            }
            return true;
        }

        public void onSuccess() {
            this.f13441a.m14767F();
        }
    }

    /* renamed from: B */
    private final C3106c m14763B() {
        Activity b = mo23920b();
        if (b != null) {
            C3106c cVar = new C3106c(b);
            cVar.mo9345c((int) R.string.commons_button_ok);
            C3106c a = cVar.mo9300a((ExitListener) new C5200b(this));
            C12932j.m33815a((Object) a, "GenericDialogController.…opLoading()\n            }");
            return a;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: C */
    public static final C5198v0 m14764C() {
        return f13431V.mo12536a();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m14765D() {
        PhonePicker phonePicker = this.f13433Q;
        if (phonePicker != null) {
            C2426b bVar = new C2426b(phonePicker.mo7013b(), 2132083208, 0, 4, null);
            bVar.mo23929b((C8819d) this);
            C8831g k = mo23946k();
            C8836h a = C8836h.m21058a((C8819d) bVar);
            a.mo24026b(new C8818e());
            a.mo24023a((ControllerChangeHandler) new C8818e());
            k.mo23991a(a);
            return;
        }
        C12932j.m33820c("phonePicker");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m14766E() {
        FrameLayout frameLayout = this.f13434R;
        if (frameLayout != null) {
            Context context = frameLayout.getContext();
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) context, "context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            m14772K();
            PhonePicker phonePicker = this.f13433Q;
            String str = "phonePicker";
            if (phonePicker == null) {
                C12932j.m33820c(str);
                throw null;
            } else if (!phonePicker.mo7017f()) {
                ScreenBar screenBar = this.f13432P;
                if (screenBar != null) {
                    screenBar.setTitle((int) R.string.settings_inputphonenumber_title_emptyphone);
                    m14773L();
                    return;
                }
                C12932j.m33820c("screenBar");
                throw null;
            } else {
                PhonePicker phonePicker2 = this.f13433Q;
                if (phonePicker2 != null) {
                    String c = phonePicker2.mo7014c();
                    PhonePicker phonePicker3 = this.f13433Q;
                    if (phonePicker3 == null) {
                        C12932j.m33820c(str);
                        throw null;
                    } else if (phonePicker3.mo7018g()) {
                        m14769H();
                    } else {
                        C2538c0.m8837a(mo23920b()).mo8670a(C2625y.f7738e.mo8733a(c), (InvitationCallback) new C5203e(this, context));
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
        } else {
            C12932j.m33820c("nextContainer");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m14767F() {
        FrameLayout frameLayout = this.f13434R;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            C8831g k = mo23946k();
            C8836h a = C8836h.m21058a((C8819d) C5207x0.m14786B());
            a.mo24026b(new C5154c());
            a.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a);
            return;
        }
        C12932j.m33820c("nextContainer");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m14768G() {
        C3106c B = m14763B();
        B.mo9331a(2131231414);
        Activity b = mo23920b();
        if (b != null) {
            C12932j.m33815a((Object) b, "activity!!");
            B.mo9346c(C7709b.m18762a(b, R.string.addfriend_error_title));
            B.mo9348e((int) R.string.addfriend_error_blocked);
            C3103g b2 = B.mo9344b();
            Activity b3 = mo23920b();
            if (b3 != null) {
                b2.mo9296j(b3);
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m14769H() {
        C3106c B = m14763B();
        B.mo9331a(2131231414);
        Activity b = mo23920b();
        if (b != null) {
            C12932j.m33815a((Object) b, "activity!!");
            B.mo9346c(C7709b.m18762a(b, R.string.addfriend_error_title));
            B.mo9348e((int) R.string.settings_inputphonenumber_title_invalidphone);
            C3103g b2 = B.mo9344b();
            Activity b3 = mo23920b();
            if (b3 != null) {
                b2.mo9296j(b3);
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m14770I() {
        C3106c B = m14763B();
        B.mo9331a(2131231414);
        Activity b = mo23920b();
        if (b != null) {
            C12932j.m33815a((Object) b, "activity!!");
            B.mo9346c(C7709b.m18762a(b, R.string.addfriend_error_title));
            B.mo9348e((int) R.string.addfriend_error_private);
            C3103g b2 = B.mo9344b();
            Activity b3 = mo23920b();
            if (b3 != null) {
                b2.mo9296j(b3);
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m14771J() {
        C5343a.m15160U().mo12830a(C5365v.TOO_MANY_FRIEND_REQUESTS_RATE_LIMITED);
        C3106c B = m14763B();
        B.mo9349f((int) R.string.addfriend_error_rate_title);
        Activity b = mo23920b();
        if (b != null) {
            C12932j.m33815a((Object) b, "activity!!");
            B.mo9341b(C7709b.m18762a(b, R.string.addfriend_error_rate_message));
            C3103g b2 = B.mo9344b();
            Activity b3 = mo23920b();
            if (b3 != null) {
                b2.mo9296j(b3);
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: K */
    private final void m14772K() {
        PhonePicker phonePicker = this.f13433Q;
        if (phonePicker != null) {
            phonePicker.mo7012a(false);
            ProgressBar progressBar = this.f13436T;
            if (progressBar != null) {
                progressBar.setVisibility(0);
                ImageView imageView = this.f13435S;
                if (imageView != null) {
                    imageView.setVisibility(8);
                } else {
                    C12932j.m33820c("nextImage");
                    throw null;
                }
            } else {
                C12932j.m33820c("nextProgress");
                throw null;
            }
        } else {
            C12932j.m33820c("phonePicker");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m14773L() {
        PhonePicker phonePicker = this.f13433Q;
        if (phonePicker != null) {
            phonePicker.mo7012a(true);
            ProgressBar progressBar = this.f13436T;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                ImageView imageView = this.f13435S;
                if (imageView != null) {
                    imageView.setVisibility(0);
                } else {
                    C12932j.m33820c("nextImage");
                    throw null;
                }
            } else {
                C12932j.m33820c("nextProgress");
                throw null;
            }
        } else {
            C12932j.m33820c("phonePicker");
            throw null;
        }
    }

    public void onPhoneRegionSelected(C7123i2 i2Var, int i) {
        C12932j.m33818b(i2Var, "phoneRegion");
        this.f13437U = i2Var;
        PhonePicker phonePicker = this.f13433Q;
        if (phonePicker != null) {
            phonePicker.mo7010a(i2Var);
        } else {
            C12932j.m33820c("phonePicker");
            throw null;
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        PhonePicker phonePicker = this.f13433Q;
        if (phonePicker != null) {
            phonePicker.mo7016e();
        } else {
            C12932j.m33820c("phonePicker");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_picker, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.screen_bar);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.screen_bar)");
        this.f13432P = (ScreenBar) findViewById;
        View findViewById2 = inflate.findViewById(R.id.phone_picker_next);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.phone_picker_next)");
        this.f13434R = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.phone_picker_next_image);
        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.phone_picker_next_image)");
        this.f13435S = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.phone_picker_progress);
        C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.phone_picker_progress)");
        this.f13436T = (ProgressBar) findViewById4;
        ScreenBar screenBar = this.f13432P;
        if (screenBar != null) {
            screenBar.setTitle((int) R.string.addfriend_button);
            ImageView imageView = this.f13435S;
            String str = "nextImage";
            if (imageView != null) {
                imageView.setImageResource(2131231403);
                C12932j.m33815a((Object) inflate, "view");
                this.f13433Q = new PhonePicker(inflate, this.f13437U, false, new C5201c(this));
                ImageView imageView2 = this.f13435S;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new C5202d(this));
                    return inflate;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c("screenBar");
        throw null;
    }
}
