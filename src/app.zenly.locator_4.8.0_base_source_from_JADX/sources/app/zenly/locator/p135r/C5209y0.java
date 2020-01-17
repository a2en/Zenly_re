package app.zenly.locator.p135r;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.modals.p121o2.C4642b;
import app.zenly.locator.p135r.p138c1.C5154c;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5347d;
import app.zenly.locator.p143s.C5343a.C5365v;
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
import p213co.znly.models.core.C7159m1;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.r.y0 */
public class C5209y0 extends ZenlyController {

    /* renamed from: P */
    private final C12275b f13447P = new C12275b();

    /* renamed from: Q */
    private C4642b f13448Q;

    /* renamed from: R */
    private final C2879d0 f13449R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f13450S = false;

    /* renamed from: T */
    private final InvitationCallback f13451T = new C5210a();

    /* renamed from: app.zenly.locator.r.y0$a */
    class C5210a implements InvitationCallback {
        C5210a() {
        }

        public void onCancel() {
            C5209y0.this.f13450S = false;
        }

        public boolean onError(C2624x xVar) {
            switch (C5211b.f13453a[xVar.ordinal()]) {
                case 1:
                case 2:
                    C5209y0.this.m14792F();
                    return false;
                case 3:
                    C5209y0.this.m14795I();
                    break;
                case 4:
                    C5209y0.this.m14796J();
                    break;
                case 5:
                    C5209y0.this.m14794H();
                    break;
                case 6:
                    C5209y0.this.m14793G();
                    break;
                case 7:
                    C5209y0.this.m14797K();
                    break;
                default:
                    Toast.makeText(C5209y0.this.mo23920b(), R.string.commons_content_oopserror, 0).show();
                    break;
            }
            return true;
        }

        public void onSuccess() {
            C5209y0.this.m14792F();
        }
    }

    /* renamed from: app.zenly.locator.r.y0$b */
    static /* synthetic */ class C5211b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13453a = new int[C2624x.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                app.zenly.locator.core.invitations.x[] r0 = app.zenly.locator.core.invitations.C2624x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13453a = r0
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.ALREADY_FRIENDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.ALREADY_INVITED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.RATE_LIMIT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.SELF_INVITE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.PRIVATE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x004b }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.BLOCKED     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f13453a     // Catch:{ NoSuchFieldError -> 0x0056 }
                app.zenly.locator.core.invitations.x r1 = app.zenly.locator.core.invitations.C2624x.UNKNOWN_USERNAME     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p135r.C5209y0.C5211b.<clinit>():void");
        }
    }

    public C5209y0(Bundle bundle) throws InvalidProtocolBufferException {
        super(bundle);
        this.f13449R = C2879d0.m9332a(UserProto$User.parseFrom(bundle.getByteArray("KEY_USER")));
    }

    /* renamed from: C */
    private C3106c m14789C() {
        return new C3106c(mo23920b()).mo9300a((ExitListener) new C5170i0(this));
    }

    /* renamed from: D */
    private void m14790D() {
        if (!this.f13450S) {
            C5343a.m15160U().mo12817a(C5347d.USERNAME);
            C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            mo23946k().mo23997a((C8819d) this);
        }
    }

    /* renamed from: E */
    private void m14791E() {
        if (!this.f13450S) {
            this.f13450S = true;
            C2538c0.m8837a(mo23920b()).mo8670a(C2625y.m8949a(this.f13449R.mo8944f()), this.f13451T);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m14792F() {
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) C5207x0.m14786B());
        a.mo24026b(new C5154c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo24005c(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m14793G() {
        C3106c C = m14789C();
        C.mo9331a(2131231414);
        C.mo9349f((int) R.string.addusername_error_blocked_title);
        C.mo9348e((int) R.string.addusername_error_blocked_subtitle);
        C.mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m14794H() {
        C3106c C = m14789C();
        C.mo9331a(2131231499);
        C.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_error_private_title));
        C.mo9348e((int) R.string.addusername_error_private_subtitle);
        C.mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m14795I() {
        C5343a.m15160U().mo12830a(C5365v.TOO_MANY_FRIEND_REQUESTS_RATE_LIMITED);
        C3106c C = m14789C();
        C.mo9331a(2131231499);
        C.mo9349f((int) R.string.addusername_error_rate_title);
        C.mo9341b(C7709b.m18762a(mo23920b(), R.string.addusername_error_rate_subtitle));
        C.mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m14796J() {
        C3106c C = m14789C();
        C.mo9331a(2131231414);
        C.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_error_self_title));
        C.mo9348e((int) R.string.addusername_error_self_subtitle);
        C.mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m14797K() {
        C3106c C = m14789C();
        C.mo9331a(2131231414);
        C.mo9346c(C7709b.m18762a(mo23920b(), R.string.addusername_error_unknown_title));
        C.mo9348e((int) R.string.addusername_error_unknown_subtitle);
        C.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        this.f13450S = false;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5343a.m15160U().mo12859b(C5347d.USERNAME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f13447P.add(C5448c.m15478a().userPublicMutualFriendsState(this.f13449R.mo8945g()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5168h0<Object>(this), (Consumer<? super Throwable>) C5166g0.f13385e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f13447P.mo36401a();
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        m14791E();
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        m14790D();
    }

    /* renamed from: a */
    public static C5209y0 m14798a(UserProto$User userProto$User) throws InvalidProtocolBufferException {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("KEY_USER", userProto$User.toByteArray());
        return new C5209y0(dVar.mo9605a());
    }

    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f13448Q = new C4642b(viewGroup.getContext());
        this.f13448Q.setAvatar(this.f13449R);
        this.f13448Q.setTitle(this.f13449R.mo8942e());
        C4642b bVar = this.f13448Q;
        bVar.setBackgroundColor(C7678c.m18702a(bVar.getContext(), (int) R.attr.zenlyColorBackground));
        this.f13448Q.setActionButtonText((int) R.string.newfriend_contactjoined_button_addasfriend);
        this.f13448Q.setPrimaryActionButtonClickListener(new C5164f0(this));
        this.f13448Q.setCloseButtonClickListener(new C5172j0(this));
        return this.f13448Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo12538a(C7159m1 m1Var) {
        this.f13448Q.setMutualFriends(m1Var);
    }
}
