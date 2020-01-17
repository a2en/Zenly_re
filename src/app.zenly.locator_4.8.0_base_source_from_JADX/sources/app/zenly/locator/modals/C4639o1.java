package app.zenly.locator.modals;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.appcompat.view.C0143b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.store.api.C2998x;
import app.zenly.locator.core.store.api.FriendRequestDataSource;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.modals.p121o2.C4642b;
import app.zenly.locator.modals.p121o2.C4655h;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5347d;
import app.zenly.locator.p143s.C5343a.C5362s;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7159m1;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8399z2.C8400a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.o1 */
public class C4639o1 extends ModalController {

    /* renamed from: Q */
    private final ZenlySchedulers f12322Q = C1351e.m6372a(C4550g2.f12179b.mo19916a("brump"));

    /* renamed from: R */
    private final String f12323R;

    /* renamed from: S */
    private final C2879d0 f12324S;

    /* renamed from: T */
    private C2718k5 f12325T;

    /* renamed from: U */
    private final C12275b f12326U = new C12275b();

    /* renamed from: V */
    private C4642b f12327V;

    /* renamed from: W */
    private FriendRequestProto$FriendRequest f12328W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f12329X = false;

    /* renamed from: Y */
    private C8400a f12330Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f12331Z;

    /* renamed from: a0 */
    private InvitationCallback f12332a0;

    /* renamed from: b0 */
    private FriendRequestDataSource f12333b0 = C2998x.m9509a();

    /* renamed from: app.zenly.locator.modals.o1$a */
    class C4640a extends C2623w {
        C4640a(Context context, boolean z) {
            super(context, z);
        }

        public void onCancel() {
            C4639o1.this.f12329X = false;
            C4639o1.this.m13551G();
        }

        public boolean onError(C2624x xVar) {
            C4639o1.this.f12329X = false;
            if (super.onError(xVar)) {
                C4639o1.this.m13551G();
            }
            return true;
        }

        public void onSuccess() {
            C4639o1.this.f12331Z = true;
            if (C4639o1.this.mo23949n()) {
                C4639o1.this.mo23946k().mo24014n();
            }
        }
    }

    public C4639o1(Bundle bundle) throws InvalidProtocolBufferException {
        super(bundle);
        this.f12323R = bundle.getString("key:brumpUuid");
        this.f12324S = C2879d0.m9332a(UserProto$User.parseFrom(bundle.getByteArray("key:user")));
    }

    /* renamed from: F */
    private void m13550F() {
        C2538c0.m8837a(mo23920b()).mo8670a(C2625y.m8950a(this.f12324S.mo8945g(), this.f12324S.mo8942e(), this.f12323R), this.f12332a0);
        this.f12329X = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m13551G() {
        if (this.f12329X || this.f12330Y != null) {
            this.f12327V.setActionButtonText((CharSequence) null);
            this.f12327V.setWaitVisible(true);
            return;
        }
        if (this.f12328W != null) {
            this.f12327V.setActionButtonText((int) R.string.newfriend_friendrequest_button_okay);
        } else {
            this.f12327V.setActionButtonText((int) R.string.map_callout_button_addasfriend);
        }
        this.f12327V.setWaitVisible(false);
    }

    /* renamed from: b */
    static /* synthetic */ void m13557b(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: c */
    static /* synthetic */ boolean m13562c(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest) throws Exception {
        return friendRequestProto$FriendRequest.getStatus() == C6812c.pending;
    }

    /* renamed from: B */
    public void mo7192B() {
        if (this.f12328W != null) {
            C0123a aVar = new C0123a(mo23920b());
            aVar.mo537a((CharSequence) C7709b.m18763a(mo23920b(), R.string.newfriend_request_modal_title, this.f12324S.mo8942e()));
            aVar.mo545b(R.string.newfriend_request_dismiss_cancel, C4594m.f12232e);
            aVar.mo549c(R.string.newfriend_request_dismiss_confirm, new C4551h(this));
            aVar.mo550c();
            return;
        }
        super.mo7192B();
    }

    /* renamed from: C */
    public void mo10303C() {
        if (this.f12328W != null) {
            m13555a(C6812c.accepted);
        } else if (!this.f12329X) {
            m13550F();
        }
        m13551G();
    }

    /* renamed from: E */
    public /* synthetic */ void mo11793E() {
        if (mo23949n()) {
            boolean d = this.f12325T.mo8794d(this.f12324S.mo8945g());
            if (d || this.f12331Z) {
                if (d) {
                    mo11696a((ModalController) this, this.f12324S);
                }
                mo23946k().mo24014n();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f12326U.mo36401a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5343a.m15160U().mo12859b(C5347d.BUMP);
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
    }

    /* renamed from: b */
    public C4655h mo10304b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0143b bVar = new C0143b(viewGroup.getContext(), 2132083207);
        this.f12327V = new C4642b(bVar);
        this.f12327V.setBackgroundColor(C7678c.m18702a((Context) bVar, (int) R.attr.zenlyColorBackground));
        this.f12327V.setAvatar(this.f12324S);
        this.f12327V.setTitle(bVar.getString(R.string.newfriend_bump_title, new Object[]{this.f12324S.mo8942e()}));
        this.f12327V.mo11802a();
        this.f12327V.mo11803b();
        m13551G();
        return this.f12327V;
    }

    /* renamed from: a */
    public static C4639o1 m13552a(String str, UserProto$User userProto$User) throws InvalidProtocolBufferException {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("key:brumpUuid", str);
        dVar.mo9613a("key:user", userProto$User.toByteArray());
        return new C4639o1(dVar.mo9605a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f12325T = C2666b.m9049a(context).mo8763a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11794a(DialogInterface dialogInterface, int i) {
        C5343a.m15160U().mo12817a(C5347d.BUMP);
        m13555a(C6812c.rejected);
        super.mo7192B();
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo11799a(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest) throws Exception {
        return friendRequestProto$FriendRequest.getAuthorUuid().equals(this.f12324S.mo8945g());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11797a(C7159m1 m1Var) throws Exception {
        this.f12327V.setMutualFriends(m1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f12326U.mo36403a(this.f12333b0.friendRequests().mo36501i(C4577l1.f12210e).mo36459b((Predicate<? super T>) C4678s.f12438e).mo36459b((Predicate<? super T>) new C4566j<Object>(this)).mo36428a((C12286f) this.f12322Q.getMainThread()).mo36412a((Consumer<? super T>) new C4570k<Object>(this), (Consumer<? super Throwable>) C4658p.f12407e), C5448c.m15478a().userPublicMutualFriendsState(this.f12324S.mo8945g()).mo36428a((C12286f) this.f12322Q.getMainThread()).mo36412a((Consumer<? super T>) new C4557i<Object>(this), (Consumer<? super Throwable>) C4675r.f12435e), this.f12325T.mo8789b(this.f12324S.mo8945g()).mo36459b((Predicate<? super T>) C4542f.f12161e).mo36486e().mo36378a((C12286f) this.f12322Q.getMainThread()).mo36398c((Consumer<? super T>) new C4662q<Object>(this)));
        this.f12332a0 = new C4640a(mo23920b(), true);
        new Handler().postDelayed(new C4625n(this), 100);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11795a(C2831a aVar) throws Exception {
        mo11696a((ModalController) this, aVar.mo8858c().f8198b);
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: a */
    private void m13555a(C6812c cVar) {
        this.f12330Y = C8399z2.newBuilder();
        this.f12330Y.setUuid(this.f12328W.getUuid());
        this.f12330Y.mo22342a(cVar);
        C5448c.m15478a().friendRequestRespond((C8399z2) this.f12330Y.build()).mo36428a((C12286f) this.f12322Q.getMainThread()).mo36412a((Consumer<? super T>) new C4637o<Object>(this, cVar), (Consumer<? super Throwable>) new C4575l<Object>(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11796a(C6812c cVar, C7979a3 a3Var) throws Exception {
        boolean booleanValue = ((Boolean) C5448c.m15478a().contactsByPhoneNumber(this.f12328W.getAuthorPhoneNumber()).mo36501i(C4547g.f12176e).mo36446a(Boolean.valueOf(false))).booleanValue();
        boolean z = this.f12324S.mo8939b() != 0;
        if (cVar == C6812c.accepted) {
            C5343a.m15160U().mo12814a(C2587f0.BUMP, Boolean.valueOf(booleanValue), z, (Integer) null, (C5362s) null);
        } else if (cVar == C6812c.rejected) {
            C5343a.m15160U().mo12858b(C2587f0.BUMP, Boolean.valueOf(booleanValue), z, null, null);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11800b(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest) throws Exception {
        this.f12328W = friendRequestProto$FriendRequest;
        this.f12327V.setTitle(mo23945j().getString(R.string.newfriend_request_title_newfriendrequest, new Object[]{this.f12324S.mo8942e()}));
        m13551G();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11798a(Throwable th) throws Exception {
        C12143a.m32032b(th, "processFriendRequest: onError", new Object[0]);
        this.f12330Y = null;
        m13551G();
        if (mo23920b() != null) {
            Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }
}
