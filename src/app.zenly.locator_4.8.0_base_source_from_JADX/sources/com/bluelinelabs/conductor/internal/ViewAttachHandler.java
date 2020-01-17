package com.bluelinelabs.conductor.internal;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;

public class ViewAttachHandler implements OnAttachStateChangeListener {

    /* renamed from: e */
    private boolean f22963e = false;

    /* renamed from: f */
    boolean f22964f = false;

    /* renamed from: g */
    private boolean f22965g = false;

    /* renamed from: h */
    private C8845d f22966h = C8845d.VIEW_DETACHED;

    /* renamed from: i */
    private ViewAttachListener f22967i;

    /* renamed from: j */
    OnAttachStateChangeListener f22968j;

    public interface ViewAttachListener {
        void onAttached();

        void onDetached(boolean z);

        void onViewDetachAfterStop();
    }

    /* renamed from: com.bluelinelabs.conductor.internal.ViewAttachHandler$a */
    class C8842a implements C8844c {
        C8842a() {
        }

        public void onAttached() {
            ViewAttachHandler viewAttachHandler = ViewAttachHandler.this;
            viewAttachHandler.f22964f = true;
            viewAttachHandler.mo24071c();
        }
    }

    /* renamed from: com.bluelinelabs.conductor.internal.ViewAttachHandler$b */
    class C8843b implements OnAttachStateChangeListener {

        /* renamed from: e */
        boolean f22970e = false;

        /* renamed from: f */
        final /* synthetic */ C8844c f22971f;

        C8843b(C8844c cVar) {
            this.f22971f = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            if (!this.f22970e) {
                this.f22970e = true;
                this.f22971f.onAttached();
                view.removeOnAttachStateChangeListener(this);
                ViewAttachHandler.this.f22968j = null;
            }
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.bluelinelabs.conductor.internal.ViewAttachHandler$c */
    private interface C8844c {
        void onAttached();
    }

    /* renamed from: com.bluelinelabs.conductor.internal.ViewAttachHandler$d */
    private enum C8845d {
        VIEW_DETACHED,
        ACTIVITY_STOPPED,
        ATTACHED
    }

    public ViewAttachHandler(ViewAttachListener viewAttachListener) {
        this.f22967i = viewAttachListener;
    }

    /* renamed from: a */
    public void mo24068a(View view) {
        view.addOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public void mo24070b(View view) {
        view.removeOnAttachStateChangeListener(this);
        if (this.f22968j != null && (view instanceof ViewGroup)) {
            m21092a((ViewGroup) view).removeOnAttachStateChangeListener(this.f22968j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo24071c() {
        if (this.f22963e && this.f22964f && !this.f22965g) {
            C8845d dVar = this.f22966h;
            C8845d dVar2 = C8845d.ATTACHED;
            if (dVar != dVar2) {
                this.f22966h = dVar2;
                this.f22967i.onAttached();
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (!this.f22963e) {
            this.f22963e = true;
            m21093a(view, new C8842a());
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f22963e = false;
        if (this.f22964f) {
            this.f22964f = false;
            m21094a(false);
        }
    }

    /* renamed from: a */
    public void mo24067a() {
        this.f22965g = false;
        mo24071c();
    }

    /* renamed from: a */
    private void m21094a(boolean z) {
        boolean z2 = this.f22966h == C8845d.ACTIVITY_STOPPED;
        if (z) {
            this.f22966h = C8845d.ACTIVITY_STOPPED;
        } else {
            this.f22966h = C8845d.VIEW_DETACHED;
        }
        if (!z2 || z) {
            this.f22967i.onDetached(z);
        } else {
            this.f22967i.onViewDetachAfterStop();
        }
    }

    /* renamed from: b */
    public void mo24069b() {
        this.f22965g = true;
        m21094a(true);
    }

    /* renamed from: a */
    private void m21093a(View view, C8844c cVar) {
        if (!(view instanceof ViewGroup)) {
            cVar.onAttached();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            cVar.onAttached();
            return;
        }
        this.f22968j = new C8843b(cVar);
        m21092a(viewGroup).addOnAttachStateChangeListener(this.f22968j);
    }

    /* renamed from: a */
    private View m21092a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (childAt instanceof ViewGroup) {
            childAt = m21092a((ViewGroup) childAt);
        }
        return childAt;
    }
}
