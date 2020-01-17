package app.zenly.locator.core.p072ui.controller;

import android.view.View;
import android.view.View.OnClickListener;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.ui.controller.b */
/* compiled from: lambda */
public final /* synthetic */ class C3098b implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ AvatarDialogController f8551e;

    /* renamed from: f */
    private final /* synthetic */ UserProto$User f8552f;

    public /* synthetic */ C3098b(AvatarDialogController avatarDialogController, UserProto$User userProto$User) {
        this.f8551e = avatarDialogController;
        this.f8552f = userProto$User;
    }

    public final void onClick(View view) {
        this.f8551e.mo9289a(this.f8552f, view);
    }
}
