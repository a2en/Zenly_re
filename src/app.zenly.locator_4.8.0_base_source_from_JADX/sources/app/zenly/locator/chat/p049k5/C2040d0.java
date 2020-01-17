package app.zenly.locator.chat.p049k5;

import android.view.View;
import android.widget.Toast;
import app.zenly.locator.R;
import p389io.reactivex.functions.BiPredicate;

/* renamed from: app.zenly.locator.chat.k5.d0 */
/* compiled from: lambda */
public final /* synthetic */ class C2040d0 implements BiPredicate {

    /* renamed from: a */
    private final /* synthetic */ View f6461a;

    public /* synthetic */ C2040d0(View view) {
        this.f6461a = view;
    }

    public final boolean test(Object obj, Object obj2) {
        return Toast.makeText(this.f6461a.getContext(), R.string.commons_title_oopserror, 0).show();
    }
}
