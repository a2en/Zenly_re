package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
public final class C0626a extends ClickableSpan {

    /* renamed from: e */
    private final int f2769e;

    /* renamed from: f */
    private final C0628c f2770f;

    /* renamed from: g */
    private final int f2771g;

    public C0626a(int i, C0628c cVar, int i2) {
        this.f2769e = i;
        this.f2770f = cVar;
        this.f2771g = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2769e);
        this.f2770f.mo3326a(this.f2771g, bundle);
    }
}
