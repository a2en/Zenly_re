package app.zenly.locator.core.invitations;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.List;

/* renamed from: app.zenly.locator.core.invitations.m */
/* compiled from: lambda */
public final /* synthetic */ class C2612m implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ C2538c0 f7706e;

    /* renamed from: f */
    private final /* synthetic */ List f7707f;

    /* renamed from: g */
    private final /* synthetic */ C2627z f7708g;

    public /* synthetic */ C2612m(C2538c0 c0Var, List list, C2627z zVar) {
        this.f7706e = c0Var;
        this.f7707f = list;
        this.f7708g = zVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7706e.mo8676a(this.f7707f, this.f7708g, dialogInterface, i);
    }
}
