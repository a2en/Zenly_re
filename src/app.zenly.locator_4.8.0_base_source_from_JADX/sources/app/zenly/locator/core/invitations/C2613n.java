package app.zenly.locator.core.invitations;

import android.widget.TextView;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.core.invitations.n */
/* compiled from: lambda */
public final /* synthetic */ class C2613n implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ C2538c0 f7709e;

    /* renamed from: f */
    private final /* synthetic */ TextView f7710f;

    /* renamed from: g */
    private final /* synthetic */ String f7711g;

    public /* synthetic */ C2613n(C2538c0 c0Var, TextView textView, String str) {
        this.f7709e = c0Var;
        this.f7710f = textView;
        this.f7711g = str;
    }

    public final void accept(Object obj) {
        this.f7709e.mo8669a(this.f7710f, this.f7711g, (Long) obj);
    }
}
