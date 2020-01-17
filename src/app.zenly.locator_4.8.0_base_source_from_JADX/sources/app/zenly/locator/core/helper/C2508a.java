package app.zenly.locator.core.helper;

import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.helper.a */
public abstract class C2508a extends ClickableSpan {

    /* renamed from: e */
    private Long f7518e;

    /* renamed from: f */
    private final long f7519f;

    public C2508a(long j) {
        this.f7519f = j;
    }

    /* renamed from: a */
    public abstract void mo8582a(View view);

    public void onClick(View view) {
        C12932j.m33818b(view, "v");
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.f7518e;
        if (l != null) {
            if (l == null) {
                C12932j.m33814a();
                throw null;
            } else if (l.longValue() + this.f7519f >= currentTimeMillis) {
                return;
            }
        }
        mo8582a(view);
        this.f7518e = Long.valueOf(currentTimeMillis);
    }

    public /* synthetic */ C2508a(long j, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            j = 2000;
        }
        this(j);
    }
}
