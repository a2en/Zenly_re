package app.zenly.locator.chat.p049k5;

import android.content.Context;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;

/* renamed from: app.zenly.locator.chat.k5.h0 */
class C2054h0 extends C2623w {

    /* renamed from: c */
    final /* synthetic */ C2052b f6513c;

    /* renamed from: d */
    final /* synthetic */ C2050d f6514d;

    C2054h0(C2050d dVar, Context context, boolean z, C2052b bVar) {
        this.f6514d = dVar;
        this.f6513c = bVar;
        super(context, z);
    }

    public void onCancel() {
        this.f6514d.notifyItemChanged(this.f6513c.getAdapterPosition(), Integer.valueOf(1));
    }

    public boolean onError(C2624x xVar) {
        if (super.onError(xVar)) {
            this.f6514d.notifyItemChanged(this.f6513c.getAdapterPosition(), Integer.valueOf(1));
        }
        return true;
    }

    public void onSuccess() {
        this.f6514d.notifyItemChanged(this.f6513c.getAdapterPosition(), Integer.valueOf(2));
    }
}
