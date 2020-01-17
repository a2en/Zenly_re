package app.zenly.locator.chat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import app.zenly.locator.chat.content.C1949d;
import java.util.List;

/* renamed from: app.zenly.locator.chat.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C1990g0 implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ C2335u4 f6390e;

    /* renamed from: f */
    private final /* synthetic */ C1949d f6391f;

    /* renamed from: g */
    private final /* synthetic */ List f6392g;

    public /* synthetic */ C1990g0(C2335u4 u4Var, C1949d dVar, List list) {
        this.f6390e = u4Var;
        this.f6391f = dVar;
        this.f6392g = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6390e.mo8232b(this.f6391f, this.f6392g, dialogInterface, i);
    }
}
