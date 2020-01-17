package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.e0 */
public class C0252e0 extends Resources {

    /* renamed from: b */
    private static boolean f1155b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1156a;

    public C0252e0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1156a = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m988b() {
        return m987a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo1903a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f1156a.get();
        if (context != null) {
            return C0271q.m1117a().mo1996a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m987a() {
        return f1155b;
    }
}
