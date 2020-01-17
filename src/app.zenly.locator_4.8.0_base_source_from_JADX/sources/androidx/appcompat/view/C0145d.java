package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.menu.C0171j;
import androidx.appcompat.view.menu.C0180m;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;
import p214e.p228e.C7584g;

/* renamed from: androidx.appcompat.view.d */
public class C0145d extends ActionMode {

    /* renamed from: a */
    final Context f455a;

    /* renamed from: b */
    final ActionMode f456b;

    /* renamed from: androidx.appcompat.view.d$a */
    public static class C0146a implements Callback {

        /* renamed from: a */
        final ActionMode.Callback f457a;

        /* renamed from: b */
        final Context f458b;

        /* renamed from: c */
        final ArrayList<C0145d> f459c = new ArrayList<>();

        /* renamed from: d */
        final C7584g<Menu, Menu> f460d = new C7584g<>();

        public C0146a(Context context, ActionMode.Callback callback) {
            this.f458b = context;
            this.f457a = callback;
        }

        /* renamed from: a */
        private Menu m519a(Menu menu) {
            Menu menu2 = (Menu) this.f460d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0180m mVar = new C0180m(this.f458b, (SupportMenu) menu);
            this.f460d.put(menu, mVar);
            return mVar;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f457a.onActionItemClicked(mo640a(actionMode), new C0171j(this.f458b, (SupportMenuItem) menuItem));
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f457a.onCreateActionMode(mo640a(actionMode), m519a(menu));
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f457a.onDestroyActionMode(mo640a(actionMode));
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f457a.onPrepareActionMode(mo640a(actionMode), m519a(menu));
        }

        /* renamed from: a */
        public ActionMode mo640a(ActionMode actionMode) {
            int size = this.f459c.size();
            for (int i = 0; i < size; i++) {
                C0145d dVar = (C0145d) this.f459c.get(i);
                if (dVar != null && dVar.f456b == actionMode) {
                    return dVar;
                }
            }
            C0145d dVar2 = new C0145d(this.f458b, actionMode);
            this.f459c.add(dVar2);
            return dVar2;
        }
    }

    public C0145d(Context context, ActionMode actionMode) {
        this.f455a = context;
        this.f456b = actionMode;
    }

    public void finish() {
        this.f456b.mo588a();
    }

    public View getCustomView() {
        return this.f456b.mo593b();
    }

    public Menu getMenu() {
        return new C0180m(this.f455a, (SupportMenu) this.f456b.mo596c());
    }

    public MenuInflater getMenuInflater() {
        return this.f456b.mo597d();
    }

    public CharSequence getSubtitle() {
        return this.f456b.mo598e();
    }

    public Object getTag() {
        return this.f456b.mo604f();
    }

    public CharSequence getTitle() {
        return this.f456b.mo599g();
    }

    public boolean getTitleOptionalHint() {
        return this.f456b.mo605h();
    }

    public void invalidate() {
        this.f456b.mo600i();
    }

    public boolean isTitleOptional() {
        return this.f456b.mo601j();
    }

    public void setCustomView(View view) {
        this.f456b.mo590a(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f456b.mo591a(charSequence);
    }

    public void setTag(Object obj) {
        this.f456b.mo603a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f456b.mo595b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f456b.mo592a(z);
    }

    public void setSubtitle(int i) {
        this.f456b.mo589a(i);
    }

    public void setTitle(int i) {
        this.f456b.mo594b(i);
    }
}
