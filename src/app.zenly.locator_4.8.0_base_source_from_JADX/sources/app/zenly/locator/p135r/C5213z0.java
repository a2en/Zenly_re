package app.zenly.locator.p135r;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.base.widget.C1315a;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5361r;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C7985a6.C7987b;
import p213co.znly.models.services.C8003b6;
import p250f.p251a.p252a.p253a.p260i.C7684a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.r.z0 */
public final class C5213z0 extends ZenlyController {

    /* renamed from: P */
    private EditText f13455P;

    /* renamed from: Q */
    private View f13456Q;

    /* renamed from: R */
    private ImageView f13457R;

    /* renamed from: S */
    private ProgressBar f13458S;

    /* renamed from: T */
    private boolean f13459T;

    /* renamed from: U */
    private C12275b f13460U = new C12275b();

    /* renamed from: app.zenly.locator.r.z0$a */
    static /* synthetic */ class C5214a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13461a = new int[C7987b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                co.znly.models.services.a6$b[] r0 = p213co.znly.models.services.C7985a6.C7987b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13461a = r0
                int[] r0 = f13461a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.services.a6$b r1 = p213co.znly.models.services.C7985a6.C7987b.ALREADY_FRIENDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13461a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.services.a6$b r1 = p213co.znly.models.services.C7985a6.C7987b.RATE_LIMIT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13461a     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.models.services.a6$b r1 = p213co.znly.models.services.C7985a6.C7987b.RATE_LIMIT_GLOBAL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f13461a     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.models.services.a6$b r1 = p213co.znly.models.services.C7985a6.C7987b.WARNING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f13461a     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.models.services.a6$b r1 = p213co.znly.models.services.C7985a6.C7987b.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f13461a     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.models.services.a6$b r1 = p213co.znly.models.services.C7985a6.C7987b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p135r.C5213z0.C5214a.<clinit>():void");
        }
    }

    public C5213z0(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: C */
    private void m14816C() {
        m14832e(true);
    }

    /* renamed from: D */
    private C3106c m14817D() {
        return new C3106c(mo23920b()).mo9300a((ExitListener) new C5174k0(this));
    }

    /* renamed from: E */
    public static C5213z0 m14818E() {
        return new C5213z0(Bundle.EMPTY);
    }

    /* renamed from: F */
    private void m14819F() {
        if (!this.f13459T) {
            m14816C();
            C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            this.f13460U.add(C5448c.m15478a().resolveUserUsername(this.f13455P.getText().toString()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5178m0<Object>(this), (Consumer<? super Throwable>) new C5182o0<Object>(this)));
        }
    }

    /* renamed from: G */
    private void m14820G() {
        C3106c D = m14817D();
        D.mo9331a(2131231414);
        D.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_error_already_friends_title));
        D.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_error_already_friends_subtitle));
        D.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: H */
    private void m14821H() {
        C1297b.m6241b(this.f13455P);
    }

    /* renamed from: I */
    private void m14822I() {
        C3106c D = m14817D();
        D.mo9331a(2131231499);
        D.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_rate_ban_title));
        D.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_rate_ban_message));
        D.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: J */
    private void m14823J() {
        C3106c D = m14817D();
        D.mo9331a(2131231499);
        D.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_rate_limited_title));
        D.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_rate_limited_message));
        D.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: K */
    private void m14824K() {
        C3106c D = m14817D();
        D.mo9331a(2131231499);
        D.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_rate_warning_title));
        D.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_rate_warning_message));
        D.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: L */
    private void m14825L() {
        C3106c D = m14817D();
        D.mo9331a(2131231414);
        D.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_error_self_title));
        D.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_error_self_subtitle));
        D.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: M */
    private void m14826M() {
        C3106c D = m14817D();
        D.mo9331a(2131231414);
        D.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_error_unknown_title));
        D.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_error_unknown_subtitle));
        D.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: N */
    private void m14827N() {
        m14832e(false);
    }

    /* renamed from: d */
    public static C5213z0 m14831d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("key:username", str);
        return new C5213z0(bundle);
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        m14827N();
        m14821H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_username_picker, viewGroup, false);
        this.f13456Q = inflate.findViewById(R.id.btn_validate);
        this.f13457R = (ImageView) inflate.findViewById(R.id.validate_image);
        this.f13458S = (ProgressBar) inflate.findViewById(R.id.validate_progress);
        this.f13455P = (EditText) inflate.findViewById(R.id.username);
        C1315a.m6319a(this.f13455P, new C7684a("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.-_"));
        this.f13455P.setOnEditorActionListener(new C5180n0(this));
        this.f13455P.setText(mo23933c().getString("key:username"));
        this.f13456Q.setOnClickListener(new C5176l0(this));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (!this.f13459T) {
            m14821H();
        }
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        m14819F();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: e */
    private void m14832e(boolean z) {
        this.f13459T = z;
        this.f13456Q.setEnabled(!z);
        int i = 0;
        this.f13458S.setVisibility(z ? 0 : 4);
        ImageView imageView = this.f13457R;
        if (z) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.f13455P.setEnabled(!z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C1297b.m6236a(mo23920b());
        this.f13460U.mo36401a();
        super.mo7053d(view);
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo12540a(TextView textView, int i, KeyEvent keyEvent) {
        m14819F();
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12539a(Throwable th) throws Exception {
        Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
        m14827N();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14830a(C8003b6 b6Var) {
        if (b6Var.hasError()) {
            int i = C5214a.f13461a[b6Var.getError().getCode().ordinal()];
            if (i == 1) {
                C5343a.m15160U().mo12829a(C5361r.ALREADY_FRIEND);
                m14820G();
            } else if (i == 2) {
                C5343a.m15160U().mo12829a(C5361r.NO_USER_RATE_LIMITED);
                m14822I();
            } else if (i == 3) {
                C5343a.m15160U().mo12829a(C5361r.TOO_MANY_SEARCH);
                m14823J();
            } else if (i == 4) {
                C5343a.m15160U().mo12829a(C5361r.NO_USER_WARNING);
                m14824K();
            } else if (i != 5) {
                Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
                m14827N();
            } else {
                C5343a.m15160U().mo12829a(C5361r.NO_USER);
                m14826M();
            }
        } else if (b6Var.getUsersCount() == 0) {
            C5343a.m15160U().mo12829a(C5361r.NO_USER);
            m14826M();
        } else {
            UserProto$User users = b6Var.getUsers(0);
            if (TextUtils.equals(C5447b.m15477d(C5448c.m15478a()), users.getUuid())) {
                C5343a.m15160U().mo12829a(C5361r.OWN_USERNAME);
                m14825L();
                return;
            }
            m14829a(users);
        }
    }

    /* renamed from: a */
    private void m14829a(UserProto$User userProto$User) {
        try {
            C5209y0 a = C5209y0.m14798a(userProto$User);
            a.mo23929b(mo23947l());
            this.f13456Q.setVisibility(4);
            C8831g k = mo23946k();
            C8836h a2 = C8836h.m21058a((C8819d) a);
            a2.mo24026b(new C8816c());
            a2.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a2);
            m14827N();
        } catch (InvalidProtocolBufferException e) {
            C12143a.m32032b(e, "failed to serialize user from username", new Object[0]);
        }
    }
}
