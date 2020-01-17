package app.zenly.locator.modals;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3220i;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.modals.p121o2.C4644c;
import app.zenly.locator.modals.p121o2.C4645d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5347d;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5540g;
import app.zenly.locator.p207x.C6272z1;
import app.zenly.locator.recommendation.C5245d;
import app.zenly.locator.recommendation.C5245d.C5246a;
import app.zenly.locator.recommendation.C5248e;
import com.bluelinelabs.conductor.C8819d;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7135k0;
import p213co.znly.models.core.C7135k0.C7136a;
import p213co.znly.models.core.C7142l0;
import p213co.znly.models.core.C7159m1;
import p213co.znly.models.notifications.C7819h;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.modals.n1 */
public class C4627n1 extends ModalController {

    /* renamed from: Q */
    private final ZenlySchedulers f12292Q;

    /* renamed from: R */
    private final C12275b f12293R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C4645d f12294S;

    /* renamed from: T */
    private View f12295T;

    /* renamed from: U */
    private TextView f12296U;

    /* renamed from: V */
    private LinearLayout f12297V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final UserProto$User f12298W;

    /* renamed from: X */
    private final C7339i f12299X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f12300Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C7142l0 f12301Z;

    /* renamed from: app.zenly.locator.modals.n1$a */
    class C4628a extends C2623w {
        C4628a(Context context, boolean z) {
            super(context, z);
        }

        public void onCancel() {
            C4627n1.this.f12300Y = false;
        }

        public boolean onError(C2624x xVar) {
            C4627n1.this.f12300Y = false;
            return super.onError(xVar);
        }

        public void onSuccess() {
            C4627n1.this.f12300Y = false;
            C4627n1 n1Var = C4627n1.this;
            n1Var.mo11696a((ModalController) n1Var, C2879d0.m9332a(n1Var.f12298W));
            C8819d l = C4627n1.this.mo23947l();
            if (l instanceof C6272z1) {
                ((C6272z1) l).mo14107a(C4627n1.this.mo11779E());
            }
            if (C4627n1.this.f12301Z == null || !C4627n1.this.f12301Z.getShouldMakeRecommendations()) {
                C4627n1.this.mo23946k().mo23997a((C8819d) C4627n1.this);
            } else if (C4627n1.this.f12301Z.getPotentialMatchesCount() > 0) {
                new C5245d(C5343a.m15160U().mo12806a()).mo12593a(C5246a.FRIEND_REQUEST_SENT);
                C4627n1 n1Var2 = C4627n1.this;
                C5248e.m14906a(n1Var2, n1Var2.f12298W, C4627n1.this.f12294S.getAvatarView());
            } else {
                new C5245d(C5343a.m15160U().mo12806a()).mo12595b(C5246a.FRIEND_REQUEST_SENT);
                C4627n1 n1Var3 = C4627n1.this;
                C5248e.m14905a(n1Var3, n1Var3.f12298W);
            }
        }
    }

    public C4627n1(String str, C7819h hVar) throws InvalidProtocolBufferException {
        this(m13514a(str, hVar));
    }

    /* renamed from: d */
    private Disposable m13522d(String str) {
        C7136a newBuilder = C7135k0.newBuilder();
        newBuilder.mo19124a(str);
        return C5448c.m15478a().recoPotentialMatches((C7135k0) newBuilder.build()).mo36535a((C12286f) this.f12292Q.getMainThread()).mo36533a((Consumer<? super T>) new C4538e<Object>(this), (Consumer<? super Throwable>) C4530c.f12149e);
    }

    /* renamed from: B */
    public void mo7192B() {
        if (!this.f12300Y) {
            C5343a.m15160U().mo12817a(C5347d.CONTACT_JOINED);
            super.mo7192B();
        }
    }

    /* renamed from: C */
    public void mo10303C() {
        if (!this.f12300Y) {
            this.f12300Y = true;
            C2538c0.m8837a(mo23920b()).mo8670a(C2625y.m8946a(C2587f0.CONTACT_JOINED, this.f12298W, false, null, false), (InvitationCallback) new C4628a(mo23920b(), true));
        }
    }

    /* renamed from: E */
    public C4545f2 mo11779E() {
        return new C4545f2(C4546a.CONTACT_JOIN, this.f12298W.getUuid());
    }

    /* renamed from: F */
    public /* synthetic */ void mo11780F() {
        this.f12294S.mo11814a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5343a.m15160U().mo12859b(C5347d.CONTACT_JOINED);
        C5498a.m15600a((Context) mo23920b()).mo13124a(C5501c.HEAVY, C5500b.REWARD, 2);
    }

    public C4627n1(Bundle bundle) throws InvalidProtocolBufferException {
        super(bundle);
        this.f12292Q = C1351e.m6372a(C4550g2.f12179b.mo19916a("contactJoined"));
        this.f12293R = new C12275b();
        this.f12300Y = false;
        this.f12301Z = null;
        bundle.getString("uuid");
        C7819h parseFrom = C7819h.parseFrom(bundle.getByteArray("notification"));
        this.f12298W = parseFrom.getUser();
        this.f12299X = parseFrom.getContact();
    }

    /* renamed from: a */
    private static Bundle m13514a(String str, C7819h hVar) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("uuid", str);
        dVar.mo9613a("notification", hVar.toByteArray());
        return dVar.mo9605a();
    }

    /* renamed from: b */
    public C4644c m13531b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f12294S = new C4645d(viewGroup.getContext());
        this.f12294S.setTitle((CharSequence) mo23920b().getString(R.string.newfriend_contactjoined_title_contactjoinedzenly, new Object[]{C3220i.m10211a(this.f12299X)}));
        C4645d dVar = this.f12294S;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12298W.getPhoneNumber());
        sb.append("\n");
        sb.append(mo23920b().getString(R.string.newfriend_request_contact));
        dVar.setSummary((CharSequence) sb.toString());
        this.f12294S.mo11815a(true);
        this.f12294S.setPrimaryActionTitle((int) R.string.newfriend_contactjoined_button_addasfriend);
        this.f12294S.setContact(this.f12299X);
        this.f12295T = layoutInflater.inflate(R.layout.view_mutual_friends, (ViewGroup) this.f12294S.findViewById(R.id.footer_container), true);
        this.f12296U = (TextView) this.f12295T.findViewById(R.id.mutual_friends_info);
        this.f12297V = (LinearLayout) this.f12295T.findViewById(R.id.mutual_friends_avatars);
        return this.f12294S;
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        if (i == 101) {
            mo23946k().mo23997a((C8819d) this);
        } else {
            super.mo8182a(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12294S.mo11816b();
        this.f12293R.mo36401a();
        super.mo7053d(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11782a(C7159m1 m1Var) throws Exception {
        m13517a(m1Var.getFriendsList());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11781a(C7142l0 l0Var) throws Exception {
        this.f12301Z = l0Var;
    }

    /* renamed from: a */
    private void m13517a(List<UserProto$User> list) {
        this.f12295T.setVisibility(list.isEmpty() ? 8 : 0);
        TextView textView = this.f12296U;
        textView.setText(C5540g.m15724b(textView.getContext(), list));
        C3137b.m9865a(this.f12297V, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        view.postDelayed(new C4526b(this), 100);
        this.f12293R.add(C5448c.m15478a().userPublicMutualFriendsState(this.f12298W.getUuid()).mo36428a((C12286f) this.f12292Q.getMainThread()).mo36412a((Consumer<? super T>) new C4534d<Object>(this), (Consumer<? super Throwable>) C4522a.f12140e));
        if (C3444a.m10686a(mo9304A()).mo6511a("feature:recommendation")) {
            this.f12293R.add(m13522d(this.f12298W.getUuid()));
        }
    }
}
