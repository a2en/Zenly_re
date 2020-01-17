package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class ActionMode {

    /* renamed from: e */
    private Object f441e;

    /* renamed from: f */
    private boolean f442f;

    public interface Callback {
        boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem);

        boolean onCreateActionMode(ActionMode actionMode, Menu menu);

        void onDestroyActionMode(ActionMode actionMode);

        boolean onPrepareActionMode(ActionMode actionMode, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo588a();

    /* renamed from: a */
    public abstract void mo589a(int i);

    /* renamed from: a */
    public abstract void mo590a(View view);

    /* renamed from: a */
    public abstract void mo591a(CharSequence charSequence);

    /* renamed from: a */
    public void mo603a(Object obj) {
        this.f441e = obj;
    }

    /* renamed from: b */
    public abstract View mo593b();

    /* renamed from: b */
    public abstract void mo594b(int i);

    /* renamed from: b */
    public abstract void mo595b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo596c();

    /* renamed from: d */
    public abstract MenuInflater mo597d();

    /* renamed from: e */
    public abstract CharSequence mo598e();

    /* renamed from: f */
    public Object mo604f() {
        return this.f441e;
    }

    /* renamed from: g */
    public abstract CharSequence mo599g();

    /* renamed from: h */
    public boolean mo605h() {
        return this.f442f;
    }

    /* renamed from: i */
    public abstract void mo600i();

    /* renamed from: j */
    public abstract boolean mo601j();

    /* renamed from: a */
    public void mo592a(boolean z) {
        this.f442f = z;
    }
}
