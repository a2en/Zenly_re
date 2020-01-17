package app.zenly.locator.chat.p049k5;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import app.zenly.locator.core.invitations.C2623w;

/* renamed from: app.zenly.locator.chat.k5.i0 */
class C2056i0 extends C2623w {

    /* renamed from: c */
    final /* synthetic */ View f6517c;

    C2056i0(C2050d dVar, Context context, boolean z, View view) {
        this.f6517c = view;
        super(context, z);
    }

    public void onSuccess() {
        Toast.makeText(this.f6517c.getContext(), "👍", 0).show();
    }
}
