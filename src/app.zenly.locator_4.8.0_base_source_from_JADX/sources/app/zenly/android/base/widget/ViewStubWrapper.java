package app.zenly.android.base.widget;

import android.view.View;
import android.view.ViewStub;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public final class ViewStubWrapper<T extends View> {

    /* renamed from: a */
    private T f4920a;

    /* renamed from: b */
    private final ViewStub f4921b;

    /* renamed from: c */
    private OnViewInflatedListener<T> f4922c;

    public interface OnViewInflatedListener<T extends View> {
        void onViewInflated(T t);
    }

    public ViewStubWrapper(ViewStub viewStub, OnViewInflatedListener<T> onViewInflatedListener) {
        C12932j.m33818b(viewStub, "viewStub");
        this.f4921b = viewStub;
        this.f4922c = onViewInflatedListener;
    }

    /* renamed from: a */
    public final T mo6500a() {
        if (this.f4920a == null) {
            T inflate = this.f4921b.inflate();
            if (inflate != null) {
                OnViewInflatedListener<T> onViewInflatedListener = this.f4922c;
                if (onViewInflatedListener != null) {
                    onViewInflatedListener.onViewInflated(inflate);
                }
                this.f4920a = inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        T t = this.f4920a;
        if (t != null) {
            return t;
        }
        C12932j.m33814a();
        throw null;
    }

    public /* synthetic */ ViewStubWrapper(ViewStub viewStub, OnViewInflatedListener onViewInflatedListener, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            onViewInflatedListener = null;
        }
        this(viewStub, onViewInflatedListener);
    }

    /* renamed from: a */
    public final void mo6501a(int i) {
        if (i != 8) {
            mo6500a().setVisibility(i);
            return;
        }
        T t = this.f4920a;
        if (t != null) {
            t.setVisibility(i);
        }
    }
}
