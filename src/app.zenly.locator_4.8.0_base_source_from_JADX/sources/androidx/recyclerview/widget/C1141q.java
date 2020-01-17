package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0615a;
import androidx.core.view.accessibility.C0628c;

/* renamed from: androidx.recyclerview.widget.q */
public class C1141q extends C0615a {

    /* renamed from: d */
    final RecyclerView f4353d;

    /* renamed from: e */
    final C0615a f4354e = new C1142a(this);

    /* renamed from: androidx.recyclerview.widget.q$a */
    public static class C1142a extends C0615a {

        /* renamed from: d */
        final C1141q f4355d;

        public C1142a(C1141q qVar) {
            this.f4355d = qVar;
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            if (!this.f4355d.mo5766c() && this.f4355d.f4353d.getLayoutManager() != null) {
                this.f4355d.f4353d.getLayoutManager().mo5229a(view, cVar);
            }
        }

        /* renamed from: a */
        public boolean mo3293a(View view, int i, Bundle bundle) {
            if (super.mo3293a(view, i, bundle)) {
                return true;
            }
            if (this.f4355d.mo5766c() || this.f4355d.f4353d.getLayoutManager() == null) {
                return false;
            }
            return this.f4355d.f4353d.getLayoutManager().mo5244a(view, i, bundle);
        }
    }

    public C1141q(RecyclerView recyclerView) {
        this.f4353d = recyclerView;
    }

    /* renamed from: a */
    public boolean mo3293a(View view, int i, Bundle bundle) {
        if (super.mo3293a(view, i, bundle)) {
            return true;
        }
        if (mo5766c() || this.f4353d.getLayoutManager() == null) {
            return false;
        }
        return this.f4353d.getLayoutManager().mo5242a(i, bundle);
    }

    /* renamed from: b */
    public void mo3296b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3296b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo5766c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4990a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5766c() {
        return this.f4353d.mo5128j();
    }

    /* renamed from: a */
    public void mo3292a(View view, C0628c cVar) {
        super.mo3292a(view, cVar);
        if (!mo5766c() && this.f4353d.getLayoutManager() != null) {
            this.f4353d.getLayoutManager().mo5232a(cVar);
        }
    }

    /* renamed from: b */
    public C0615a mo5765b() {
        return this.f4354e;
    }
}
