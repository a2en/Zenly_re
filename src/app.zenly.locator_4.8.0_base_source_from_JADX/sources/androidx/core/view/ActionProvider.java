package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class ActionProvider {

    /* renamed from: a */
    private VisibilityListener f2741a;

    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public ActionProvider(Context context) {
    }

    /* renamed from: a */
    public View mo1025a(MenuItem menuItem) {
        return mo1023c();
    }

    /* renamed from: a */
    public void mo1021a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo3253a(SubUiVisibilityListener subUiVisibilityListener) {
    }

    /* renamed from: a */
    public boolean mo1022a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1027b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1023c();

    /* renamed from: d */
    public boolean mo1024d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1028e() {
        return false;
    }

    /* renamed from: f */
    public void mo3254f() {
        this.f2741a = null;
    }

    /* renamed from: a */
    public void mo1026a(VisibilityListener visibilityListener) {
        if (!(this.f2741a == null || visibilityListener == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f2741a = visibilityListener;
    }
}
