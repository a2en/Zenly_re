package app.zenly.locator.core.manager;

import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.core.manager.w3 */
/* compiled from: lambda */
public final /* synthetic */ class C2849w3 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ MeUserManager f8092e;

    public /* synthetic */ C2849w3(MeUserManager meUserManager) {
        this.f8092e = meUserManager;
    }

    public final void accept(Object obj) {
        this.f8092e.m8989a((UserAnnotationProto$UserAnnotation) obj);
    }
}
