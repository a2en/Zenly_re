package app.zenly.locator.modals.p119m2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2587f0.C2588a;
import app.zenly.locator.core.p072ui.controller.C3103g;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2956k0.C2957a;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3220i;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.modals.C4545f2;
import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.modals.ModalController;
import app.zenly.locator.modals.p121o2.C4648f;
import app.zenly.locator.modals.p121o2.C4655h;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5362s;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5540g;
import app.zenly.locator.recommendation.C5245d;
import app.zenly.locator.recommendation.C5248e;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8829e;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.C7339i;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.modals.m2.a */
public final class C4597a extends ModalController {

    /* renamed from: W */
    static final /* synthetic */ KProperty[] f12235W;

    /* renamed from: X */
    public static final C4598a f12236X = new C4598a(null);

    /* renamed from: Q */
    private C2956k0 f12237Q;

    /* renamed from: R */
    private C4605c f12238R;

    /* renamed from: S */
    private String f12239S;

    /* renamed from: T */
    private C4648f f12240T;

    /* renamed from: U */
    private final Lazy f12241U;

    /* renamed from: V */
    private final Lazy f12242V;

    /* renamed from: app.zenly.locator.modals.m2.a$a */
    public static final class C4598a {
        private C4598a() {
        }

        /* renamed from: a */
        public final C4597a mo11746a(String str, String str2) {
            C12932j.m33818b(str, "friendRequestUuid");
            C12932j.m33818b(str2, "originUuid");
            Bundle bundle = new Bundle();
            bundle.putString("args:friend_request_uuid", str);
            bundle.putString("args:origin_uuid", str2);
            return new C4597a(bundle);
        }

        public /* synthetic */ C4598a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.a$b */
    public enum C4599b {
        BUMP(R.string.friendRequest_source_bump, 2131231394),
        CONTACT(R.string.friendRequest_source_contacts, 2131231412),
        FRIEND_RECOMMENDATION(R.string.friendRequest_source_recommendation, 2131231608),
        FRIEND_PROFILE(R.string.friendRequest_source_friendProfile, 2131231545),
        GROUP(R.string.friendRequest_source_group, 2131231469),
        NOT_CONTACT(R.string.friendRequest_source_notContact, 2131231593),
        PHONE_NUMBER(R.string.friendRequest_source_phoneNumber, 2131231526),
        SUGGESTED(R.string.friendRequest_source_suggested, 2131231594),
        USERNAME(R.string.friendRequest_source_username, 2131231581);
        

        /* renamed from: e */
        private final int f12253e;

        /* renamed from: f */
        private final int f12254f;

        private C4599b(int i, int i2) {
            this.f12253e = i;
            this.f12254f = i2;
        }

        /* renamed from: a */
        public final int mo11747a() {
            return this.f12254f;
        }

        /* renamed from: b */
        public final int mo11748b() {
            return this.f12253e;
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.a$c */
    static final class C4600c extends C12933k implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ Bundle f12255f;

        C4600c(Bundle bundle) {
            this.f12255f = bundle;
            super(0);
        }

        public final String invoke() {
            String string = this.f12255f.getString("args:friend_request_uuid");
            if (string != null) {
                return string;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.a$d */
    static final class C4601d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4597a f12256e;

        C4601d(C4597a aVar) {
            this.f12256e = aVar;
        }

        public final void onClick(View view) {
            this.f12256e.mo7192B();
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.a$e */
    static final class C4602e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4597a f12257e;

        C4602e(C4597a aVar) {
            this.f12257e = aVar;
        }

        public final void onClick(View view) {
            C4597a.m13441a(this.f12257e).mo11751a(C6812c.rejected);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.a$f */
    static final class C4603f extends C12933k implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ Bundle f12258f;

        C4603f(Bundle bundle) {
            this.f12258f = bundle;
            super(0);
        }

        public final String invoke() {
            String string = this.f12258f.getString("args:origin_uuid");
            if (string != null) {
                return string;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    static {
        Class<C4597a> cls = C4597a.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "friendRequestUuid", "getFriendRequestUuid()Ljava/lang/String;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "originUuid", "getOriginUuid()Ljava/lang/String;");
        C12946x.m33839a((C12940r) sVar2);
        f12235W = new KProperty[]{sVar, sVar2};
    }

    public C4597a(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        this.f12241U = C12896f.m33751a(new C4600c(bundle));
        this.f12242V = C12896f.m33751a(new C4603f(bundle));
    }

    /* renamed from: K */
    private final void m13436K() {
        C2956k0 k0Var = this.f12237Q;
        if (k0Var != null) {
            C2957a a = k0Var.mo9121a();
            String str = "modalView";
            if (a.mo9129b()) {
                C4648f fVar = this.f12240T;
                if (fVar != null) {
                    C4648f.m13590a(fVar, Integer.valueOf(R.string.friendRequest_information_sameSchool), null, null, 6, null);
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else if (a.mo9130c()) {
                C4648f fVar2 = this.f12240T;
                if (fVar2 != null) {
                    C4648f.m13590a(fVar2, Integer.valueOf(R.string.friendRequest_information_sameWork), null, null, 6, null);
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                String str2 = "presenter";
                if (a.mo9131d() != null) {
                    C4605c cVar = this.f12238R;
                    if (cVar != null) {
                        cVar.mo11752a(a.mo9131d());
                    } else {
                        C12932j.m33820c(str2);
                        throw null;
                    }
                } else if (a.mo9128a() != null) {
                    C4605c cVar2 = this.f12238R;
                    if (cVar2 != null) {
                        cVar2.mo11752a(a.mo9128a());
                    } else {
                        C12932j.m33820c(str2);
                        throw null;
                    }
                } else {
                    mo11735E();
                }
            }
        } else {
            C12932j.m33820c("friendRequest");
            throw null;
        }
    }

    /* renamed from: L */
    private final String m13437L() {
        Lazy lazy = this.f12241U;
        KProperty kProperty = f12235W[0];
        return (String) lazy.getValue();
    }

    /* renamed from: M */
    private final String m13438M() {
        Lazy lazy = this.f12242V;
        KProperty kProperty = f12235W[1];
        return (String) lazy.getValue();
    }

    /* renamed from: N */
    private final C5362s m13439N() {
        C5362s sVar;
        C4648f fVar = this.f12240T;
        if (fVar == null) {
            C12932j.m33820c("modalView");
            throw null;
        } else if (!fVar.mo11843e()) {
            return C5362s.NO_INFORMATION;
        } else {
            C2956k0 k0Var = this.f12237Q;
            String str = "friendRequest";
            if (k0Var != null) {
                if (k0Var.mo9121a().mo9129b()) {
                    sVar = C5362s.SCHOOL;
                } else {
                    C2956k0 k0Var2 = this.f12237Q;
                    if (k0Var2 == null) {
                        C12932j.m33820c(str);
                        throw null;
                    } else if (k0Var2.mo9121a().mo9130c()) {
                        sVar = C5362s.WORK;
                    } else {
                        C2956k0 k0Var3 = this.f12237Q;
                        if (k0Var3 == null) {
                            C12932j.m33820c(str);
                            throw null;
                        } else if (k0Var3.mo9121a().mo9131d() != null) {
                            sVar = C5362s.HOMETOWN;
                        } else {
                            C2956k0 k0Var4 = this.f12237Q;
                            if (k0Var4 == null) {
                                C12932j.m33820c(str);
                                throw null;
                            } else if (k0Var4.mo9121a().mo9128a() != null) {
                                sVar = C5362s.ADDED_FROM_LOCATION;
                            } else {
                                sVar = C5362s.NO_INFORMATION;
                            }
                        }
                    }
                }
                return sVar;
            }
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: O */
    private final C4599b m13440O() {
        C2588a aVar = C2587f0.f7651C;
        C2956k0 k0Var = this.f12237Q;
        String str = "friendRequest";
        if (k0Var != null) {
            C6810b source = k0Var.mo9122b().getSource();
            C12932j.m33815a((Object) source, "friendRequest.request.source");
            C2587f0 a = aVar.mo8693a(source);
            C2956k0 k0Var2 = this.f12237Q;
            if (k0Var2 != null) {
                boolean z = !k0Var2.mo9122b().getTargetExists();
                switch (C4604b.f12259a[a.ordinal()]) {
                    case 1:
                        return C4599b.BUMP;
                    case 2:
                        return C4599b.USERNAME;
                    case 3:
                        return C4599b.PHONE_NUMBER;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return C4599b.CONTACT;
                    case 11:
                        return C4599b.FRIEND_RECOMMENDATION;
                    case 12:
                    case 13:
                    case 14:
                        return z ? C4599b.CONTACT : C4599b.SUGGESTED;
                    case 15:
                    case 16:
                        if (z) {
                            return C4599b.CONTACT;
                        }
                        return null;
                    case 17:
                        return C4599b.FRIEND_PROFILE;
                    case 18:
                        return C4599b.GROUP;
                    default:
                        return null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C4605c m13441a(C4597a aVar) {
        C4605c cVar = aVar.f12238R;
        if (cVar != null) {
            return cVar;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* renamed from: b */
    public static final C4597a m13443b(String str, String str2) {
        return f12236X.mo11746a(str, str2);
    }

    /* renamed from: e */
    private final void m13444e(boolean z) {
        C4599b bVar = m13440O() != null ? m13440O() : !z ? C4599b.NOT_CONTACT : null;
        C4648f fVar = this.f12240T;
        if (fVar != null) {
            fVar.mo11838a(bVar != null ? bVar.mo11748b() : C7674a.f19294a, bVar != null ? bVar.mo11747a() : C7674a.f19294a);
        } else {
            C12932j.m33820c("modalView");
            throw null;
        }
    }

    /* renamed from: B */
    public void mo7192B() {
        C4648f fVar = this.f12240T;
        if (fVar != null) {
            String str = "modalView";
            if (fVar == null) {
                C12932j.m33820c(str);
                throw null;
            } else if (!fVar.mo11841c()) {
                C4648f fVar2 = this.f12240T;
                if (fVar2 != null) {
                    Context context = fVar2.getContext();
                    C3106c cVar = new C3106c(context);
                    cVar.mo9331a(2131231414);
                    Object[] objArr = new Object[1];
                    String str2 = this.f12239S;
                    if (str2 != null) {
                        objArr[0] = str2;
                        cVar.mo9340b(R.string.friendRequest_dismissModal_title, objArr);
                        cVar.mo9338a(context.getString(R.string.friendRequest_dismissModal_confirm), null, new C4602e(this));
                        cVar.mo9336a(context.getString(R.string.friendRequest_dismissModal_cancel), (OnClickListener) null);
                        C3103g b = cVar.mo9301a(false).mo9344b();
                        Activity b2 = mo23920b();
                        if (b2 != null) {
                            b.mo9296j(b2);
                        } else {
                            C12932j.m33814a();
                            throw null;
                        }
                    } else {
                        C12932j.m33820c("userName");
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
        }
    }

    /* renamed from: C */
    public void mo10303C() {
        C4605c cVar = this.f12238R;
        if (cVar != null) {
            cVar.mo11751a(C6812c.accepted);
        } else {
            C12932j.m33820c("presenter");
            throw null;
        }
    }

    /* renamed from: D */
    public void mo11694D() {
        C4605c cVar = this.f12238R;
        if (cVar != null) {
            cVar.mo11756d();
        } else {
            C12932j.m33820c("presenter");
            throw null;
        }
    }

    /* renamed from: E */
    public final void mo11735E() {
        C4648f fVar = this.f12240T;
        if (fVar != null) {
            C4648f.m13590a(fVar, null, null, null, 7, null);
        } else {
            C12932j.m33820c("modalView");
            throw null;
        }
    }

    /* renamed from: F */
    public final void mo11736F() {
        C4648f fVar = this.f12240T;
        String str = "modalView";
        if (fVar != null) {
            Context context = fVar.getContext();
            C4648f fVar2 = this.f12240T;
            if (fVar2 != null) {
                C2956k0 k0Var = this.f12237Q;
                String str2 = "friendRequest";
                if (k0Var != null) {
                    fVar2.setAvatar(k0Var.mo9123c());
                    C4648f fVar3 = this.f12240T;
                    if (fVar3 != null) {
                        Object[] objArr = new Object[1];
                        C2956k0 k0Var2 = this.f12237Q;
                        if (k0Var2 != null) {
                            objArr[0] = k0Var2.mo9123c().getName();
                            String string = context.getString(R.string.friendRequest_title, objArr);
                            C12932j.m33815a((Object) string, "context.getString(R.stri… friendRequest.user.name)");
                            fVar3.setTitle(string);
                            m13436K();
                            m13444e(false);
                            C4648f fVar4 = this.f12240T;
                            if (fVar4 == null) {
                                C12932j.m33820c(str);
                                throw null;
                            } else if (fVar4.mo11842d()) {
                                C4648f fVar5 = this.f12240T;
                                if (fVar5 != null) {
                                    fVar5.mo11837a();
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            }
                        } else {
                            C12932j.m33820c(str2);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: G */
    public final void mo11737G() {
        C4648f fVar = this.f12240T;
        String str = "modalView";
        if (fVar == null) {
            C12932j.m33820c(str);
            throw null;
        } else if (fVar.mo11842d()) {
            C4648f fVar2 = this.f12240T;
            if (fVar2 != null) {
                fVar2.mo11840b();
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        }
    }

    /* renamed from: H */
    public final void mo11738H() {
        C2956k0 k0Var = this.f12237Q;
        if (k0Var != null) {
            UserProto$User c = k0Var.mo9123c();
            C4648f fVar = this.f12240T;
            if (fVar != null) {
                C5248e.m14906a(this, c, fVar.getAvatar());
            } else {
                C12932j.m33820c("modalView");
                throw null;
            }
        } else {
            C12932j.m33820c("friendRequest");
            throw null;
        }
    }

    /* renamed from: I */
    public final void mo11739I() {
        C2956k0 k0Var = this.f12237Q;
        if (k0Var != null) {
            C5248e.m14905a(this, k0Var.mo9123c());
        } else {
            C12932j.m33820c("friendRequest");
            throw null;
        }
    }

    /* renamed from: J */
    public C4545f2 mo11740J() {
        C4546a aVar = C4546a.FRIEND_REQUEST_OR_BUMP;
        String M = m13438M();
        C12932j.m33815a((Object) M, "originUuid");
        return new C4545f2(aVar, M);
    }

    /* renamed from: b */
    public C4655h mo10304b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        Context context = viewGroup.getContext();
        C12932j.m33815a((Object) context, "context");
        this.f12240T = new C4648f(context);
        C4605c cVar = this.f12238R;
        if (cVar != null) {
            cVar.mo11754b();
            C4648f fVar = this.f12240T;
            if (fVar != null) {
                return fVar;
            }
            C12932j.m33820c("modalView");
            throw null;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        C4605c cVar = this.f12238R;
        if (cVar != null) {
            cVar.mo11755c();
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5499a aVar = C5498a.f14119e;
        C4648f fVar = this.f12240T;
        if (fVar != null) {
            Context context = fVar.getContext();
            C12932j.m33815a((Object) context, "modalView.context");
            aVar.mo13125a(context).mo13124a(C5501c.HEAVY, C5500b.REWARD, 2);
            return;
        }
        C12932j.m33820c("modalView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        C3027g provideFriendRequestStore = C3015a.m9526a(context).provideFriendRequestStore();
        String L = m13437L();
        C12932j.m33815a((Object) L, "friendRequestUuid");
        C2956k0 friendRequestCache = provideFriendRequestStore.friendRequestCache(L);
        if (friendRequestCache != null) {
            this.f12237Q = friendRequestCache;
            C2956k0 k0Var = this.f12237Q;
            String str = "friendRequest";
            if (k0Var != null) {
                String name = k0Var.mo9123c().getName();
                C12932j.m33815a((Object) name, "friendRequest.user.name");
                this.f12239S = name;
                C4621e eVar = new C4621e();
                C2956k0 k0Var2 = this.f12237Q;
                if (k0Var2 != null) {
                    C8819d l = mo23947l();
                    C5343a U = C5343a.m15160U();
                    C12932j.m33815a((Object) U, "Analytics.get()");
                    AnalyticsTracker a = U.mo12806a();
                    C12932j.m33815a((Object) a, "Analytics.get().tracker");
                    C4605c cVar = new C4605c(this, eVar, k0Var2, l, new C5245d(a), C3444a.m10686a(context));
                    this.f12238R = cVar;
                    return;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9309c(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        C12932j.m33818b(controllerChangeHandler, "changeHandler");
        C12932j.m33818b(eVar, "changeType");
        super.mo9309c(controllerChangeHandler, eVar);
        if (eVar.f22921e) {
            C4648f fVar = this.f12240T;
            String str = "modalView";
            if (fVar != null) {
                Context context = fVar.getContext();
                C4648f fVar2 = this.f12240T;
                if (fVar2 != null) {
                    fVar2.setCloseButtonClickListener(new C4601d(this));
                    C4648f fVar3 = this.f12240T;
                    if (fVar3 != null) {
                        fVar3.setActionPrimary(context.getString(R.string.friendRequest_button_accept));
                        C2956k0 k0Var = this.f12237Q;
                        if (k0Var != null) {
                            if (k0Var.mo9122b().getSentAtCount10() > 1) {
                                C4648f fVar4 = this.f12240T;
                                if (fVar4 != null) {
                                    fVar4.setActionSecondary(context.getString(R.string.friendRequest_button_block));
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            }
                            C4648f fVar5 = this.f12240T;
                            if (fVar5 != null) {
                                fVar5.mo11850j();
                                C4648f fVar6 = this.f12240T;
                                if (fVar6 != null) {
                                    fVar6.mo11849i();
                                    C4648f fVar7 = this.f12240T;
                                    if (fVar7 != null) {
                                        fVar7.mo11845g();
                                        C4648f fVar8 = this.f12240T;
                                        if (fVar8 != null) {
                                            fVar8.mo11844f();
                                            C4648f fVar9 = this.f12240T;
                                            if (fVar9 != null) {
                                                fVar9.mo11848h();
                                                C4648f fVar10 = this.f12240T;
                                                if (fVar10 != null) {
                                                    fVar10.mo11837a();
                                                    C4605c cVar = this.f12238R;
                                                    if (cVar == null) {
                                                        C12932j.m33820c("presenter");
                                                        throw null;
                                                    } else if (cVar.mo11753a()) {
                                                        mo11737G();
                                                    }
                                                } else {
                                                    C12932j.m33820c(str);
                                                    throw null;
                                                }
                                            } else {
                                                C12932j.m33820c(str);
                                                throw null;
                                            }
                                        } else {
                                            C12932j.m33820c(str);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c(str);
                                throw null;
                            }
                        } else {
                            C12932j.m33820c("friendRequest");
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo11743a(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C4648f fVar = this.f12240T;
        String str = "modalView";
        if (fVar != null) {
            Context context = fVar.getContext();
            C4648f fVar2 = this.f12240T;
            if (fVar2 != null) {
                C2956k0 k0Var = this.f12237Q;
                if (k0Var != null) {
                    fVar2.setAvatar(k0Var.mo9123c());
                    C4648f fVar3 = this.f12240T;
                    if (fVar3 != null) {
                        String string = context.getString(R.string.friendRequest_title, new Object[]{iVar.getFull()});
                        C12932j.m33815a((Object) string, "context.getString(R.stri…uest_title, contact.full)");
                        fVar3.setTitle(string);
                        m13436K();
                        m13444e(true);
                        this.f12239S = C3220i.m10211a(iVar);
                        C4648f fVar4 = this.f12240T;
                        if (fVar4 == null) {
                            C12932j.m33820c(str);
                            throw null;
                        } else if (fVar4.mo11842d()) {
                            C4648f fVar5 = this.f12240T;
                            if (fVar5 != null) {
                                fVar5.mo11837a();
                            } else {
                                C12932j.m33820c(str);
                                throw null;
                            }
                        }
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c("friendRequest");
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11744a(String str, String str2) {
        if (str == null && str2 == null) {
            mo11735E();
            return;
        }
        C2956k0 k0Var = this.f12237Q;
        if (k0Var != null) {
            int i = k0Var.mo9121a().mo9131d() != null ? R.string.friendRequest_information_senderHometown : R.string.friendRequest_information_senderFrom;
            C4648f fVar = this.f12240T;
            if (fVar != null) {
                fVar.mo11839a(Integer.valueOf(i), str, str2);
            } else {
                C12932j.m33820c("modalView");
                throw null;
            }
        } else {
            C12932j.m33820c("friendRequest");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11745a(List<UserProto$User> list) {
        C12932j.m33818b(list, "friends");
        C4648f fVar = this.f12240T;
        String str = "modalView";
        if (fVar != null) {
            String b = C5540g.m15724b(fVar.getContext(), list);
            C4648f fVar2 = this.f12240T;
            if (fVar2 != null) {
                if (!(!list.isEmpty())) {
                    b = null;
                }
                fVar2.setBody(b);
                C4648f fVar3 = this.f12240T;
                if (fVar3 != null) {
                    fVar3.setFriends(list);
                    C4648f fVar4 = this.f12240T;
                    if (fVar4 == null) {
                        C12932j.m33820c(str);
                        throw null;
                    } else if (fVar4.mo11842d()) {
                        C4648f fVar5 = this.f12240T;
                        if (fVar5 != null) {
                            fVar5.mo11837a();
                        } else {
                            C12932j.m33820c(str);
                            throw null;
                        }
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13442a(C4597a aVar, C2587f0 f0Var, Boolean bool, boolean z, Integer num, boolean z2, int i, Object obj) {
        aVar.mo11742a(f0Var, bool, z, num, (i & 16) != 0 ? true : z2);
    }

    /* renamed from: a */
    public final void mo11742a(C2587f0 f0Var, Boolean bool, boolean z, Integer num, boolean z2) {
        C12932j.m33818b(f0Var, "source");
        C5343a.m15160U().mo12814a(f0Var, bool, z, num, m13439N());
        if (z2) {
            mo23946k().mo23997a((C8819d) this);
        }
    }

    /* renamed from: a */
    public final void mo11741a(C2587f0 f0Var, Boolean bool, boolean z, Integer num) {
        C12932j.m33818b(f0Var, "source");
        C5343a.m15160U().mo12858b(f0Var, bool, z, num, m13439N());
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        if (i == 101) {
            mo23946k().mo23997a((C8819d) this);
        } else {
            super.mo8182a(i, i2, intent);
        }
    }
}
