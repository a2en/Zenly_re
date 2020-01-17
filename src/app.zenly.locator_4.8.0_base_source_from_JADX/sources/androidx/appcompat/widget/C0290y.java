package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.y */
class C0290y extends C0278r {

    /* renamed from: b */
    private final WeakReference<Context> f1312b;

    public C0290y(Context context, Resources resources) {
        super(resources);
        this.f1312b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1312b.get();
        if (!(drawable == null || context == null)) {
            C0271q.m1117a().mo1999a(context, i, drawable);
        }
        return drawable;
    }
}
