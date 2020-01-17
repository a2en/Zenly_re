package app.zenly.locator.p017a0;

import android.content.Context;
import android.view.View;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.a0.f */
public abstract class C1512f extends ZenlyController {

    /* renamed from: P */
    private final C12275b f5385P = new C12275b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7050a(Context context, UserProto$User userProto$User);

    /* renamed from: a */
    public /* synthetic */ void mo7051a(View view, UserProto$User userProto$User) throws Exception {
        mo7050a(view.getContext(), userProto$User);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f5385P.add(C5448c.m15478a().userMeStream().mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) new C1508b<Object>(this, view), (Consumer<? super Throwable>) C1509c.f5382e, (Action) C1507a.f5379a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f5385P.mo36401a();
        super.mo7053d(view);
    }
}
