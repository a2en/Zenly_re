package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.C8864h;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.request.Request;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.request.target.i */
public abstract class C9238i<T extends View, Z> extends C9228a<Z> {

    /* renamed from: k */
    private static int f24005k = C8864h.glide_custom_view_target_tag;

    /* renamed from: f */
    protected final T f24006f;

    /* renamed from: g */
    private final C9239a f24007g;

    /* renamed from: h */
    private OnAttachStateChangeListener f24008h;

    /* renamed from: i */
    private boolean f24009i;

    /* renamed from: j */
    private boolean f24010j;

    /* renamed from: com.bumptech.glide.request.target.i$a */
    static final class C9239a {

        /* renamed from: e */
        static Integer f24011e;

        /* renamed from: a */
        private final View f24012a;

        /* renamed from: b */
        private final List<SizeReadyCallback> f24013b = new ArrayList();

        /* renamed from: c */
        boolean f24014c;

        /* renamed from: d */
        private C9240a f24015d;

        /* renamed from: com.bumptech.glide.request.target.i$a$a */
        private static final class C9240a implements OnPreDrawListener {

            /* renamed from: e */
            private final WeakReference<C9239a> f24016e;

            C9240a(C9239a aVar) {
                this.f24016e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String str = "ViewTarget";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v(str, sb.toString());
                }
                C9239a aVar = (C9239a) this.f24016e.get();
                if (aVar != null) {
                    aVar.mo24921a();
                }
                return true;
            }
        }

        C9239a(View view) {
            this.f24012a = view;
        }

        /* renamed from: a */
        private static int m22243a(Context context) {
            if (f24011e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C9216j.m22083a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f24011e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f24011e.intValue();
        }

        /* renamed from: a */
        private boolean m22244a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: b */
        private void m22246b(int i, int i2) {
            Iterator it = new ArrayList(this.f24013b).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        /* renamed from: c */
        private int m22247c() {
            int paddingTop = this.f24012a.getPaddingTop() + this.f24012a.getPaddingBottom();
            LayoutParams layoutParams = this.f24012a.getLayoutParams();
            return m22242a(this.f24012a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m22248d() {
            int paddingLeft = this.f24012a.getPaddingLeft() + this.f24012a.getPaddingRight();
            LayoutParams layoutParams = this.f24012a.getLayoutParams();
            return m22242a(this.f24012a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo24924b(SizeReadyCallback sizeReadyCallback) {
            this.f24013b.remove(sizeReadyCallback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo24923b() {
            ViewTreeObserver viewTreeObserver = this.f24012a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f24015d);
            }
            this.f24015d = null;
            this.f24013b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24921a() {
            if (!this.f24013b.isEmpty()) {
                int d = m22248d();
                int c = m22247c();
                if (m22245a(d, c)) {
                    m22246b(d, c);
                    mo24923b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24922a(SizeReadyCallback sizeReadyCallback) {
            int d = m22248d();
            int c = m22247c();
            if (m22245a(d, c)) {
                sizeReadyCallback.onSizeReady(d, c);
                return;
            }
            if (!this.f24013b.contains(sizeReadyCallback)) {
                this.f24013b.add(sizeReadyCallback);
            }
            if (this.f24015d == null) {
                ViewTreeObserver viewTreeObserver = this.f24012a.getViewTreeObserver();
                this.f24015d = new C9240a(this);
                viewTreeObserver.addOnPreDrawListener(this.f24015d);
            }
        }

        /* renamed from: a */
        private boolean m22245a(int i, int i2) {
            return m22244a(i) && m22244a(i2);
        }

        /* renamed from: a */
        private int m22242a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f24014c && this.f24012a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f24012a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String str = "ViewTarget";
            if (Log.isLoggable(str, 4)) {
                Log.i(str, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m22243a(this.f24012a.getContext());
        }
    }

    public C9238i(T t) {
        C9216j.m22083a(t);
        this.f24006f = (View) t;
        this.f24007g = new C9239a(t);
    }

    /* renamed from: a */
    private void mo24906a(Object obj) {
        this.f24006f.setTag(f24005k, obj);
    }

    /* renamed from: b */
    private void m22240b() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f24008h;
        if (onAttachStateChangeListener != null && !this.f24010j) {
            this.f24006f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f24010j = true;
        }
    }

    /* renamed from: c */
    private void m22241c() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f24008h;
        if (onAttachStateChangeListener != null && this.f24010j) {
            this.f24006f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f24010j = false;
        }
    }

    public Request getRequest() {
        Object a = m22238a();
        if (a == null) {
            return null;
        }
        if (a instanceof Request) {
            return (Request) a;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void getSize(SizeReadyCallback sizeReadyCallback) {
        this.f24007g.mo24922a(sizeReadyCallback);
    }

    public T getView() {
        return this.f24006f;
    }

    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f24007g.mo24923b();
        if (!this.f24009i) {
            m22241c();
        }
    }

    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m22240b();
    }

    public void removeCallback(SizeReadyCallback sizeReadyCallback) {
        this.f24007g.mo24924b(sizeReadyCallback);
    }

    public void setRequest(Request request) {
        mo24906a(request);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f24006f);
        return sb.toString();
    }

    /* renamed from: a */
    private Object m22238a() {
        return this.f24006f.getTag(f24005k);
    }
}
