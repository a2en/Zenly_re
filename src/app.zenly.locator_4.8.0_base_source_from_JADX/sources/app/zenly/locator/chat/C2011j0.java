package app.zenly.locator.chat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import app.zenly.locator.chat.content.C1949d;
import java.util.List;

/* renamed from: app.zenly.locator.chat.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C2011j0 implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ C2335u4 f6420e;

    /* renamed from: f */
    private final /* synthetic */ C1949d f6421f;

    /* renamed from: g */
    private final /* synthetic */ List f6422g;

    public /* synthetic */ C2011j0(C2335u4 u4Var, C1949d dVar, List list) {
        this.f6420e = u4Var;
        this.f6421f = dVar;
        this.f6422g = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6420e.mo8229a(this.f6421f, this.f6422g, dialogInterface, i);
    }
}
