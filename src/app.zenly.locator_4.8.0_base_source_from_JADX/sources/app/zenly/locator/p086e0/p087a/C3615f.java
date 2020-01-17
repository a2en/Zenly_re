package app.zenly.locator.p086e0.p087a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.R;
import app.zenly.locator.block.BlockUserActivity;
import app.zenly.locator.cards.CardSwitcherActivity;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.core.contracts.NavigationContract.C2469c;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p207x.C6272z1;
import app.zenly.locator.p210z.C6309a;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.e0.a.f */
public final class C3615f {

    /* renamed from: a */
    private C6272z1 f9718a;

    /* renamed from: b */
    private Activity f9719b;

    /* renamed from: c */
    private final Context f9720c;

    /* renamed from: app.zenly.locator.e0.a.f$a */
    static final class C3616a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3615f f9721e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f9722f;

        C3616a(C3615f fVar, UserProto$User userProto$User) {
            this.f9721e = fVar;
            this.f9722f = userProto$User;
        }

        public final void onClick(View view) {
            C3615f fVar = this.f9721e;
            C2469c cVar = C2469c.MEET;
            String uuid = this.f9722f.getUuid();
            C12932j.m33815a((Object) uuid, "user.uuid");
            fVar.mo10094a(cVar, uuid);
        }
    }

    public C3615f(Context context) {
        C12932j.m33818b(context, "context");
        this.f9720c = context;
    }

    /* renamed from: a */
    public final void mo10096a(C6272z1 z1Var) {
        this.f9718a = z1Var;
    }

    /* renamed from: b */
    public final void mo10101b(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        Activity activity = this.f9719b;
        if (activity != null) {
            activity.startActivityForResult(BlockUserActivity.f5761r.mo7320a(this.f9720c, userProto$User), 401);
        }
    }

    /* renamed from: c */
    public final void mo10102c(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        Activity activity = this.f9719b;
        if (activity != null) {
            C3106c cVar = new C3106c(activity);
            cVar.mo9331a(2131231606);
            cVar.mo9349f((int) R.string.profile_perks_meetings_modal_title);
            cVar.mo9341b(this.f9720c.getString(R.string.profile_perks_meetings_modal_message, new Object[]{userProto$User.getName()}));
            cVar.mo9338a(this.f9720c.getString(R.string.profile_perks_meetings_modal_button, new Object[]{userProto$User.getName()}), null, new C3616a(this, userProto$User));
            cVar.mo9301a(true).mo9344b().mo9296j(activity);
        }
    }

    /* renamed from: d */
    public final void mo10103d(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        C6309a.m17376a(this.f9718a, userProto$User);
    }

    /* renamed from: a */
    public final void mo10092a(Activity activity) {
        this.f9719b = activity;
    }

    /* renamed from: a */
    public final void mo10095a(ZenlyController zenlyController) {
        C12932j.m33818b(zenlyController, "controller");
        C6272z1 z1Var = this.f9718a;
        if (z1Var != null) {
            z1Var.onControllerOpacityChange(zenlyController);
        }
    }

    /* renamed from: a */
    public final void mo10099a(String str, int i) {
        C12932j.m33818b(str, "username");
        C6272z1 z1Var = this.f9718a;
        if (z1Var != null) {
            z1Var.onProfileUsernameClicked(str, i);
        }
    }

    /* renamed from: a */
    public final void mo10094a(C2469c cVar, String str) {
        C12932j.m33818b(cVar, "event");
        C12932j.m33818b(str, "userUuid");
        C6272z1 z1Var = this.f9718a;
        if (z1Var != null) {
            z1Var.onProfileClick(cVar, str);
        }
    }

    /* renamed from: a */
    public final void mo10091a() {
        C6272z1 z1Var = this.f9718a;
        if (z1Var != null) {
            z1Var.mo14095I();
        }
    }

    /* renamed from: a */
    public final void mo10097a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        C6272z1 z1Var = this.f9718a;
        if (z1Var != null) {
            z1Var.mo14108a(userProto$User);
        }
    }

    /* renamed from: a */
    public final void mo10098a(String str) {
        C12932j.m33818b(str, "userUuid");
        C6272z1 z1Var = this.f9718a;
        if (z1Var != null) {
            z1Var.onProfileItemClick(str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m10912a(C3615f fVar, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        fVar.mo10100a(list, i);
    }

    /* renamed from: a */
    public final void mo10100a(List<? extends Card> list, int i) {
        C12932j.m33818b(list, "models");
        Activity activity = this.f9719b;
        if (activity != null) {
            CardSwitcherActivity.f5873p.mo7357a(activity, list, i);
        }
    }

    /* renamed from: a */
    public final void mo10093a(Card card, Card... cardArr) {
        C12932j.m33818b(card, "model");
        C12932j.m33818b(cardArr, "otherModels");
        Activity activity = this.f9719b;
        if (activity != null) {
            CardSwitcherActivity.f5873p.mo7356a(activity, card, (Card[]) Arrays.copyOf(cardArr, cardArr.length));
        }
    }
}
