package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.c */
public class C0144c extends ActionMode implements Callback {

    /* renamed from: g */
    private Context f449g;

    /* renamed from: h */
    private ActionBarContextView f450h;

    /* renamed from: i */
    private ActionMode.Callback f451i;

    /* renamed from: j */
    private WeakReference<View> f452j;

    /* renamed from: k */
    private boolean f453k;

    /* renamed from: l */
    private MenuBuilder f454l;

    public C0144c(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.f449g = context;
        this.f450h = actionBarContextView;
        this.f451i = callback;
        MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
        menuBuilder.mo742c(1);
        this.f454l = menuBuilder;
        this.f454l.mo718a((Callback) this);
    }

    /* renamed from: a */
    public void mo591a(CharSequence charSequence) {
        this.f450h.setSubtitle(charSequence);
    }

    /* renamed from: b */
    public void mo595b(CharSequence charSequence) {
        this.f450h.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo596c() {
        return this.f454l;
    }

    /* renamed from: d */
    public MenuInflater mo597d() {
        return new C0147e(this.f450h.getContext());
    }

    /* renamed from: e */
    public CharSequence mo598e() {
        return this.f450h.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo599g() {
        return this.f450h.getTitle();
    }

    /* renamed from: i */
    public void mo600i() {
        this.f451i.onPrepareActionMode(this, this.f454l);
    }

    /* renamed from: j */
    public boolean mo601j() {
        return this.f450h.mo1117b();
    }

    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f451i.onActionItemClicked(this, menuItem);
    }

    public void onMenuModeChange(MenuBuilder menuBuilder) {
        mo600i();
        this.f450h.mo1119d();
    }

    /* renamed from: a */
    public void mo589a(int i) {
        mo591a((CharSequence) this.f449g.getString(i));
    }

    /* renamed from: b */
    public void mo594b(int i) {
        mo595b((CharSequence) this.f449g.getString(i));
    }

    /* renamed from: a */
    public void mo592a(boolean z) {
        super.mo592a(z);
        this.f450h.setTitleOptional(z);
    }

    /* renamed from: b */
    public View mo593b() {
        WeakReference<View> weakReference = this.f452j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo590a(View view) {
        this.f450h.setCustomView(view);
        this.f452j = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo588a() {
        if (!this.f453k) {
            this.f453k = true;
            this.f450h.sendAccessibilityEvent(32);
            this.f451i.onDestroyActionMode(this);
        }
    }
}
