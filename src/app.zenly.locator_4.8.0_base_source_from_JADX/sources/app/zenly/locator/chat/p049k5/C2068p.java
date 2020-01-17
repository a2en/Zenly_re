package app.zenly.locator.chat.p049k5;

import android.content.Context;
import android.widget.Toast;
import app.zenly.locator.R;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.k5.p */
/* compiled from: lambda */
public final /* synthetic */ class C2068p implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Context f6542e;

    public /* synthetic */ C2068p(Context context) {
        this.f6542e = context;
    }

    public final void accept(Object obj) {
        Toast.makeText(this.f6542e, C7709b.m18762a(this.f6542e, R.string.gchat_error_generic), 0).show();
    }
}
