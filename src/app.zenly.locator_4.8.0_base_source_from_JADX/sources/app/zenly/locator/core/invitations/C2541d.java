package app.zenly.locator.core.invitations;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: app.zenly.locator.core.invitations.d */
/* compiled from: lambda */
public final /* synthetic */ class C2541d implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ C2538c0 f7599e;

    /* renamed from: f */
    private final /* synthetic */ C2627z f7600f;

    /* renamed from: g */
    private final /* synthetic */ String f7601g;

    public /* synthetic */ C2541d(C2538c0 c0Var, C2627z zVar, String str) {
        this.f7599e = c0Var;
        this.f7600f = zVar;
        this.f7601g = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7599e.mo8675a(this.f7600f, this.f7601g, dialogInterface, i);
    }
}
