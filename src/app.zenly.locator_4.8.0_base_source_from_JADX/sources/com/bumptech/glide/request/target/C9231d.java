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

/* renamed from: com.bumptech.glide.request.target.d */
public abstract class C9231d<T extends View, Z> implements Target<Z> {

    /* renamed from: j */
    private static final int f23990j = C8864h.glide_custom_view_target_tag;

    /* renamed from: e */
    private final C9232a f23991e;

    /* renamed from: f */
    protected final T f23992f;

    /* renamed from: g */
    private OnAttachStateChangeListener f23993g;

    /* renamed from: h */
    private boolean f23994h;

    /* renamed from: i */
    private boolean f23995i;

    /* renamed from: com.bumptech.glide.request.target.d$a */
    static final class C9232a {

        /* renamed from: e */
        static Integer f23996e;

        /* renamed from: a */
        private final View f23997a;

        /* renamed from: b */
        private final List<SizeReadyCallback> f23998b = new ArrayList();

        /* renamed from: c */
        boolean f23999c;

        /* renamed from: d */
        private C9233a f24000d;

        /* renamed from: com.bumptech.glide.request.target.d$a$a */
        private static final class C9233a implements OnPreDrawListener {

            /* renamed from: e */
            private final WeakReference<C9232a> f24001e;

            C9233a(C9232a aVar) {
                this.f24001e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String str = "CustomViewTarget";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v(str, sb.toString());
                }
                C9232a aVar = (C9232a) this.f24001e.get();
                if (aVar != null) {
                    aVar.mo24910a();
                }
                return true;
            }
        }

        C9232a(View view) {
            this.f23997a = view;
        }

        /* renamed from: a */
        private static int m22222a(Context context) {
            if (f23996e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C9216j.m22083a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f23996e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f23996e.intValue();
        }

        /* renamed from: a */
        private boolean m22223a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: b */
        private void m22225b(int i, int i2) {
            Iterator it = new ArrayList(this.f23998b).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        /* renamed from: c */
        private int m22226c() {
            int paddingTop = this.f23997a.getPaddingTop() + this.f23997a.getPaddingBottom();
            LayoutParams layoutParams = this.f23997a.getLayoutParams();
            return m22221a(this.f23997a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m22227d() {
            int paddingLeft = this.f23997a.getPaddingLeft() + this.f23997a.getPaddingRight();
            LayoutParams layoutParams = this.f23997a.getLayoutParams();
            return m22221a(this.f23997a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo24913b(SizeReadyCallback sizeReadyCallback) {
            this.f23998b.remove(sizeReadyCallback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo24912b() {
            ViewTreeObserver viewTreeObserver = this.f23997a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f24000d);
            }
            this.f24000d = null;
            this.f23998b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24910a() {
            if (!this.f23998b.isEmpty()) {
                int d = m22227d();
                int c = m22226c();
                if (m22224a(d, c)) {
                    m22225b(d, c);
                    mo24912b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24911a(SizeReadyCallback sizeReadyCallback) {
            int d = m22227d();
            int c = m22226c();
            if (m22224a(d, c)) {
                sizeReadyCallback.onSizeReady(d, c);
                return;
            }
            if (!this.f23998b.contains(sizeReadyCallback)) {
                this.f23998b.add(sizeReadyCallback);
            }
            if (this.f24000d == null) {
                ViewTreeObserver viewTreeObserver = this.f23997a.getViewTreeObserver();
                this.f24000d = new C9233a(this);
                viewTreeObserver.addOnPreDrawListener(this.f24000d);
            }
        }

        /* renamed from: a */
        private boolean m22224a(int i, int i2) {
            return m22223a(i) && m22223a(i2);
        }

        /* renamed from: a */
        private int m22221a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f23999c && this.f23997a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f23997a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String str = "CustomViewTarget";
            if (Log.isLoggable(str, 4)) {
                Log.i(str, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m22222a(this.f23997a.getContext());
        }
    }

    public C9231d(T t) {
        C9216j.m22083a(t);
        this.f23992f = (View) t;
        this.f23991e = new C9232a(t);
    }

    /* renamed from: b */
    private Object m22215b() {
        return this.f23992f.getTag(f23990j);
    }

    /* renamed from: c */
    private void m22216c() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f23993g;
        if (onAttachStateChangeListener != null && !this.f23995i) {
            this.f23992f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f23995i = true;
        }
    }

    /* renamed from: d */
    private void m22217d() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f23993g;
        if (onAttachStateChangeListener != null && this.f23995i) {
            this.f23992f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f23995i = false;
        }
    }

    /* renamed from: a */
    public final T mo24907a() {
        return this.f23992f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8503a(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24908b(Drawable drawable) {
    }

    public final Request getRequest() {
        Object b = m22215b();
        if (b == null) {
            return null;
        }
        if (b instanceof Request) {
            return (Request) b;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        this.f23991e.mo24911a(sizeReadyCallback);
    }

    public void onDestroy() {
    }

    public final void onLoadCleared(Drawable drawable) {
        this.f23991e.mo24912b();
        mo8503a(drawable);
        if (!this.f23994h) {
            m22217d();
        }
    }

    public final void onLoadStarted(Drawable drawable) {
        m22216c();
        mo24908b(drawable);
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public final void removeCallback(SizeReadyCallback sizeReadyCallback) {
        this.f23991e.mo24913b(sizeReadyCallback);
    }

    public final void setRequest(Request request) {
        m22214a((Object) request);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f23992f);
        return sb.toString();
    }

    /* renamed from: a */
    private void m22214a(Object obj) {
        this.f23992f.setTag(f23990j, obj);
    }
}
