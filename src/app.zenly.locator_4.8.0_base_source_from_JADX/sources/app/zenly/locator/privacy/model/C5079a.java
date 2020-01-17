package app.zenly.locator.privacy.model;

import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.privacy.model.a */
/* compiled from: lambda */
public final /* synthetic */ class C5079a implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ ICallbackUpdateUser f13152e;

    public /* synthetic */ C5079a(ICallbackUpdateUser iCallbackUpdateUser) {
        this.f13152e = iCallbackUpdateUser;
    }

    public final void accept(Object obj) {
        this.f13152e.onUpdateUserSuccess();
    }
}
