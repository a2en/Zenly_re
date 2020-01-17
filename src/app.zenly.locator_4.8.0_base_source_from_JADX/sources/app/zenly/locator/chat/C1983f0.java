package app.zenly.locator.chat;

import app.zenly.locator.chat.C2335u4.C2337b;
import app.zenly.locator.core.p072ui.view.C3137b;
import java.util.List;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C1983f0 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ C2337b f6382e;

    /* renamed from: f */
    private final /* synthetic */ List f6383f;

    public /* synthetic */ C1983f0(C2337b bVar, List list) {
        this.f6382e = bVar;
        this.f6383f = list;
    }

    public final void accept(Object obj) {
        C3137b.m9860a(this.f6382e.f7082o, this.f6382e.f7088u, (List) obj, this.f6383f.size(), false);
    }
}
