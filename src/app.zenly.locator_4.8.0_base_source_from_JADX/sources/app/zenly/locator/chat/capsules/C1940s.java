package app.zenly.locator.chat.capsules;

import androidx.recyclerview.widget.C1094b;
import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.capsules.s */
public final class C1940s implements ListUpdateCallback {

    /* renamed from: e */
    private final C1094b f6285e;

    /* renamed from: f */
    private final ScrollToPositionCallback f6286f;

    public C1940s(C1094b bVar, ScrollToPositionCallback scrollToPositionCallback) {
        C12932j.m33818b(bVar, "listUpdateCallback");
        C12932j.m33818b(scrollToPositionCallback, "callback");
        this.f6285e = bVar;
        this.f6286f = scrollToPositionCallback;
    }

    public void onChanged(int i, int i2, Object obj) {
        this.f6285e.onChanged(i, i2, obj);
    }

    public void onInserted(int i, int i2) {
        this.f6285e.onInserted(i, i2);
        this.f6286f.onScrollToPosition(0);
    }

    public void onMoved(int i, int i2) {
        this.f6285e.onMoved(i, i2);
        this.f6286f.onScrollToPosition(0);
    }

    public void onRemoved(int i, int i2) {
        this.f6285e.onRemoved(i, i2);
        this.f6286f.onScrollToPosition(0);
    }
}
