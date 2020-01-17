package app.zenly.locator.chat.capsules;

import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.chat.capsules.f */
/* compiled from: lambda */
public final /* synthetic */ class C1903f implements Predicate {

    /* renamed from: e */
    private final /* synthetic */ C1911b f6214e;

    public /* synthetic */ C1903f(C1911b bVar) {
        this.f6214e = bVar;
    }

    public final boolean test(Object obj) {
        return this.f6214e.itemView.isAttachedToWindow();
    }
}
