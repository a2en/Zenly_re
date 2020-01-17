package app.zenly.locator.media;

import android.content.Context;
import androidx.core.content.C0540a;
import androidx.core.widget.C0680h;
import app.zenly.android.feature.polenta.widget.OutlinedTextView;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3227n;
import java.util.List;

/* renamed from: app.zenly.locator.media.w0 */
public enum C4475w0 {
    DEFAULT("museo", 2132083116, R.color.blue, R.color.white),
    GRAND_HOTEL("grandHotel", 2132083117, R.color.yellow, R.color.black),
    MONOTON("monoton", 2132083118, R.color.pink, R.color.transparent);
    

    /* renamed from: l */
    public static final List<C4475w0> f12047l = null;

    /* renamed from: e */
    private final String f12049e;

    /* renamed from: f */
    private final int f12050f;

    /* renamed from: g */
    private final int f12051g;

    /* renamed from: h */
    private final int f12052h;

    static {
        C4475w0 w0Var;
        C4475w0 w0Var2;
        C4475w0 w0Var3;
        f12047l = C3227n.m10229a((T[]) new C4475w0[]{w0Var, w0Var2, w0Var3});
    }

    private C4475w0(String str, int i, int i2, int i3) {
        this.f12049e = str;
        this.f12050f = i;
        this.f12051g = i2;
        this.f12052h = i3;
    }

    /* renamed from: a */
    public String mo11638a() {
        return this.f12049e;
    }

    /* renamed from: a */
    public void mo11639a(OutlinedTextView outlinedTextView) {
        Context context = outlinedTextView.getContext();
        C0680h.m3189d(outlinedTextView, this.f12050f);
        outlinedTextView.setTextColor(C0540a.m2536a(context, this.f12051g));
        outlinedTextView.setStrokeColor(C0540a.m2536a(context, this.f12052h));
    }
}
