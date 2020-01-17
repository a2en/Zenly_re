package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.C0695b;
import androidx.customview.widget.C0695b.C0698c;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    C0695b f27887a;

    /* renamed from: b */
    OnDismissListener f27888b;

    /* renamed from: c */
    private boolean f27889c;

    /* renamed from: d */
    private float f27890d = 0.0f;

    /* renamed from: e */
    private boolean f27891e;

    /* renamed from: f */
    int f27892f = 2;

    /* renamed from: g */
    float f27893g = 0.5f;

    /* renamed from: h */
    float f27894h = 0.0f;

    /* renamed from: i */
    float f27895i = 0.5f;

    /* renamed from: j */
    private final C0698c f27896j = new C10732a();

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C10732a extends C0698c {

        /* renamed from: a */
        private int f27897a;

        /* renamed from: b */
        private int f27898b = -1;

        C10732a() {
        }

        /* renamed from: a */
        public void mo3597a(View view, int i) {
            this.f27898b = i;
            this.f27897a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: b */
        public boolean mo3603b(View view, int i) {
            return this.f27898b == -1 && SwipeDismissBehavior.this.mo30633a(view);
        }

        /* renamed from: c */
        public void mo3604c(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f27888b;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        /* renamed from: b */
        public int mo3600b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo3596a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f27898b = -1;
            int width = view.getWidth();
            if (m27365a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f27897a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f27897a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f27887a.mo3589c(i, view.getTop())) {
                ViewCompat.m2826a(view, (Runnable) new C10733b(view, z));
            } else if (z) {
                OnDismissListener onDismissListener = SwipeDismissBehavior.this.f27888b;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(view);
                }
            }
        }

        /* renamed from: a */
        private boolean m27365a(View view, float f) {
            boolean z = false;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                boolean z2 = ViewCompat.m2862o(view) == 1;
                int i2 = SwipeDismissBehavior.this.f27892f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    return z2 ? z : z;
                    z = true;
                }
                if (i2 == 1) {
                    if (z2) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.f27897a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f27893g)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public int mo3593a(View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public int mo3594a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = ViewCompat.m2862o(view) == 1;
            int i5 = SwipeDismissBehavior.this.f27892f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f27897a - view.getWidth();
                    i4 = view.getWidth() + this.f27897a;
                } else if (z) {
                    i3 = this.f27897a;
                    width = view.getWidth();
                } else {
                    i3 = this.f27897a - view.getWidth();
                    i4 = this.f27897a;
                }
                return SwipeDismissBehavior.m27357a(i3, i, i4);
            } else if (z) {
                i3 = this.f27897a - view.getWidth();
                i4 = this.f27897a;
                return SwipeDismissBehavior.m27357a(i3, i, i4);
            } else {
                i3 = this.f27897a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m27357a(i3, i, i4);
        }

        /* renamed from: a */
        public void mo3598a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f27897a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f27894h);
            float width2 = ((float) this.f27897a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f27895i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m27356a(0.0f, 1.0f - SwipeDismissBehavior.m27359b(width, width2, f), 1.0f));
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    private class C10733b implements Runnable {

        /* renamed from: e */
        private final View f27900e;

        /* renamed from: f */
        private final boolean f27901f;

        C10733b(View view, boolean z) {
            this.f27900e = view;
            this.f27901f = z;
        }

        public void run() {
            C0695b bVar = SwipeDismissBehavior.this.f27887a;
            if (bVar != null && bVar.mo3582a(true)) {
                ViewCompat.m2826a(this.f27900e, (Runnable) this);
            } else if (this.f27901f) {
                OnDismissListener onDismissListener = SwipeDismissBehavior.this.f27888b;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(this.f27900e);
                }
            }
        }
    }

    /* renamed from: b */
    static float m27359b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo30632a(OnDismissListener onDismissListener) {
        this.f27888b = onDismissListener;
    }

    /* renamed from: a */
    public boolean mo30633a(View view) {
        return true;
    }

    /* renamed from: b */
    public void mo30634b(float f) {
        this.f27894h = m27356a(0.0f, f, 1.0f);
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f27889c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27889c = coordinatorLayout.mo2815a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f27889c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27889c = false;
        }
        if (!z) {
            return false;
        }
        m27358a((ViewGroup) coordinatorLayout);
        return this.f27887a.mo3586b(motionEvent);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0695b bVar = this.f27887a;
        if (bVar == null) {
            return false;
        }
        bVar.mo3578a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public void mo30631a(int i) {
        this.f27892f = i;
    }

    /* renamed from: a */
    public void mo30630a(float f) {
        this.f27895i = m27356a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    private void m27358a(ViewGroup viewGroup) {
        C0695b bVar;
        if (this.f27887a == null) {
            if (this.f27891e) {
                bVar = C0695b.m3270a(viewGroup, this.f27890d, this.f27896j);
            } else {
                bVar = C0695b.m3271a(viewGroup, this.f27896j);
            }
            this.f27887a = bVar;
        }
    }

    /* renamed from: a */
    static float m27356a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m27357a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
