package app.zenly.locator.modals;

import android.content.Context;
import android.os.Bundle;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;

/* renamed from: app.zenly.locator.modals.j2 */
public class C4569j2 extends C4573k2 {
    public C4569j2(String str) {
        super(str, false);
    }

    public boolean handleBack() {
        if (super.handleBack()) {
            return false;
        }
        mo23920b().finish();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
    }

    public C4569j2(Bundle bundle) {
        super(bundle);
    }
}
