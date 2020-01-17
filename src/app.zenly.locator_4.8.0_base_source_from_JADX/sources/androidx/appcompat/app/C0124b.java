package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p214e.p228e.C7573b;

/* renamed from: androidx.appcompat.app.b */
public abstract class C0124b {

    /* renamed from: e */
    private static int f364e = -100;

    /* renamed from: f */
    private static final C7573b<WeakReference<C0124b>> f365f = new C7573b<>();

    /* renamed from: g */
    private static final Object f366g = new Object();

    C0124b() {
    }

    /* renamed from: a */
    public static C0124b m364a(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    /* renamed from: b */
    static void m367b(C0124b bVar) {
        synchronized (f366g) {
            m368c(bVar);
        }
    }

    /* renamed from: c */
    private static void m368c(C0124b bVar) {
        synchronized (f366g) {
            Iterator it = f365f.iterator();
            while (it.hasNext()) {
                C0124b bVar2 = (C0124b) ((WeakReference) it.next()).get();
                if (bVar2 == bVar || bVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: k */
    public static int m369k() {
        return f364e;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo403a(int i);

    /* renamed from: a */
    public abstract ActionBarDrawerToggle$Delegate mo405a();

    /* renamed from: a */
    public abstract ActionMode mo408a(Callback callback);

    /* renamed from: a */
    public void mo410a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo411a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo412a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo413a(View view);

    /* renamed from: a */
    public abstract void mo414a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo418a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo419a(CharSequence charSequence);

    /* renamed from: b */
    public int mo422b() {
        return -100;
    }

    /* renamed from: b */
    public abstract void mo424b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo425b(View view, LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo426b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo428c();

    /* renamed from: c */
    public abstract void mo429c(int i);

    /* renamed from: c */
    public abstract void mo430c(Bundle bundle);

    /* renamed from: d */
    public abstract ActionBar mo432d();

    /* renamed from: d */
    public void mo433d(int i) {
    }

    /* renamed from: e */
    public abstract void mo434e();

    /* renamed from: f */
    public abstract void mo436f();

    /* renamed from: g */
    public abstract void mo439g();

    /* renamed from: h */
    public abstract void mo440h();

    /* renamed from: i */
    public abstract void mo442i();

    /* renamed from: j */
    public abstract void mo445j();

    /* renamed from: a */
    public static C0124b m365a(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    /* renamed from: a */
    static void m366a(C0124b bVar) {
        synchronized (f366g) {
            m368c(bVar);
            f365f.add(new WeakReference(bVar));
        }
    }
}
