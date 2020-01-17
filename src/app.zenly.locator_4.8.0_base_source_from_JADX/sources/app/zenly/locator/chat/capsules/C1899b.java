package app.zenly.locator.chat.capsules;

import java.util.List;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.capsules.b */
/* compiled from: lambda */
public final /* synthetic */ class C1899b implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ C1909l f6204e;

    /* renamed from: f */
    private final /* synthetic */ C1911b f6205f;

    /* renamed from: g */
    private final /* synthetic */ List f6206g;

    public /* synthetic */ C1899b(C1909l lVar, C1911b bVar, List list) {
        this.f6204e = lVar;
        this.f6205f = bVar;
        this.f6206g = list;
    }

    public final void accept(Object obj) {
        this.f6204e.mo7652a(this.f6205f, this.f6206g, (Throwable) obj);
    }
}
