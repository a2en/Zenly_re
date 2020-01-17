package app.zenly.locator.chat.panel.emojis;

import android.content.Context;
import android.widget.Toast;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.panel.emojis.l */
/* compiled from: lambda */
public final /* synthetic */ class C2252l implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Context f6886e;

    public /* synthetic */ C2252l(Context context) {
        this.f6886e = context;
    }

    public final void accept(Object obj) {
        Toast.makeText(this.f6886e, "Request sent", 0).show();
    }
}
