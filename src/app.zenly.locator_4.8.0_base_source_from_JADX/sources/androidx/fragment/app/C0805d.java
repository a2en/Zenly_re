package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.d */
public abstract class C0805d {
    /* renamed from: a */
    public abstract View mo3993a(int i);

    @Deprecated
    /* renamed from: a */
    public Fragment mo4223a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: a */
    public abstract boolean mo3994a();
}
