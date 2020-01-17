package app.zenly.locator.core.invitations;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: app.zenly.locator.core.invitations.g */
/* compiled from: lambda */
public final /* synthetic */ class C2589g implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ C2538c0 f7674e;

    /* renamed from: f */
    private final /* synthetic */ EditText f7675f;

    /* renamed from: g */
    private final /* synthetic */ C2627z f7676g;

    public /* synthetic */ C2589g(C2538c0 c0Var, EditText editText, C2627z zVar) {
        this.f7674e = c0Var;
        this.f7675f = editText;
        this.f7676g = zVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7674e.mo8668a(this.f7675f, this.f7676g, dialogInterface, i);
    }
}
