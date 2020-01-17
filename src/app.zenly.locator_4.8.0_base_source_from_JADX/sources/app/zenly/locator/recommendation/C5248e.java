package app.zenly.locator.recommendation;

import android.app.Activity;
import android.app.ActivityOptions;
import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.recommendation.RecommendationActivity.C5215a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.recommendation.e */
public final class C5248e {
    static {
        new C5248e();
    }

    private C5248e() {
    }

    /* renamed from: a */
    public static final void m14906a(ZenlyController zenlyController, UserProto$User userProto$User, View view) {
        C12932j.m33818b(zenlyController, "controller");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(view, "transitionView");
        Activity A = zenlyController.mo9304A();
        C12932j.m33815a((Object) A, "controller.requireActivity()");
        ActivityOptions makeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(A, view, A.getString(R.string.transition_default));
        C5215a aVar = RecommendationActivity.f13462o;
        String uuid = userProto$User.getUuid();
        C12932j.m33815a((Object) uuid, "user.uuid");
        String name = userProto$User.getName();
        C12932j.m33815a((Object) name, "user.name");
        zenlyController.mo23904a(C5215a.m14843a(aVar, A, uuid, name, null, 8, null), 101, makeSceneTransitionAnimation.toBundle());
    }

    /* renamed from: a */
    public static final void m14905a(ZenlyController zenlyController, UserProto$User userProto$User) {
        C12932j.m33818b(zenlyController, "controller");
        C12932j.m33818b(userProto$User, "user");
        Activity A = zenlyController.mo9304A();
        C12932j.m33815a((Object) A, "controller.requireActivity()");
        C5215a aVar = RecommendationActivity.f13462o;
        String uuid = userProto$User.getUuid();
        C12932j.m33815a((Object) uuid, "user.uuid");
        String name = userProto$User.getName();
        C12932j.m33815a((Object) name, "user.name");
        zenlyController.mo23903a(aVar.mo12543a(A, uuid, name, "fragment:recommendationFriendsOther"), 101);
    }
}
