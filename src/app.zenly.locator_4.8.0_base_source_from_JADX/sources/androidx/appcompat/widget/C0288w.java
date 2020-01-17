package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.w */
public class C0288w extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1304c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0288w>> f1305d;

    /* renamed from: a */
    private final Resources f1306a;

    /* renamed from: b */
    private final Theme f1307b;

    private C0288w(Context context) {
        super(context);
        if (C0252e0.m988b()) {
            this.f1306a = new C0252e0(this, context.getResources());
            this.f1307b = this.f1306a.newTheme();
            this.f1307b.setTo(context.getTheme());
            return;
        }
        this.f1306a = new C0290y(this, context.getResources());
        this.f1307b = null;
    }

    /* renamed from: a */
    private static boolean m1191a(Context context) {
        if ((context instanceof C0288w) || (context.getResources() instanceof C0290y) || (context.getResources() instanceof C0252e0)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || C0252e0.m988b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m1192b(Context context) {
        if (!m1191a(context)) {
            return context;
        }
        synchronized (f1304c) {
            if (f1305d == null) {
                f1305d = new ArrayList<>();
            } else {
                for (int size = f1305d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1305d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1305d.remove(size);
                    }
                }
                for (int size2 = f1305d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1305d.get(size2);
                    C0288w wVar = weakReference2 != null ? (C0288w) weakReference2.get() : null;
                    if (wVar != null && wVar.getBaseContext() == context) {
                        return wVar;
                    }
                }
            }
            C0288w wVar2 = new C0288w(context);
            f1305d.add(new WeakReference(wVar2));
            return wVar2;
        }
    }

    public AssetManager getAssets() {
        return this.f1306a.getAssets();
    }

    public Resources getResources() {
        return this.f1306a;
    }

    public Theme getTheme() {
        Theme theme = this.f1307b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.f1307b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
