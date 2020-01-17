package app.zenly.locator.friendshipfacts.p096i;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.friendshipfacts.p100m.C3812b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.friendshipfacts.i.b */
public final class C3788b extends C7717d<C3812b> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3812b bVar, C3812b bVar2) {
        C12932j.m33818b(bVar, "model");
        View b = mo34493b();
        if (b != null) {
            ((TextView) b).setText(bVar.mo10395f());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
