package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.fragment.app.C0819o;
import p214e.p215a.C7530j;

public abstract class ActionBar {

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f147a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f147a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.ActionBarLayout);
            this.f147a = obtainStyledAttributes.getInt(C7530j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f147a = 0;
            this.f147a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f147a = 0;
            this.f147a = layoutParams.f147a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f147a = 0;
        }
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    public interface OnNavigationListener {
        boolean onNavigationItemSelected(int i, long j);
    }

    @Deprecated
    public interface TabListener {
        void onTabReselected(C0089a aVar, C0819o oVar);

        void onTabSelected(C0089a aVar, C0819o oVar);

        void onTabUnselected(C0089a aVar, C0819o oVar);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public static abstract class C0089a {
        /* renamed from: a */
        public abstract CharSequence mo315a();

        /* renamed from: b */
        public abstract View mo316b();

        /* renamed from: c */
        public abstract Drawable mo317c();

        /* renamed from: d */
        public abstract CharSequence mo318d();

        /* renamed from: e */
        public abstract void mo319e();
    }

    /* renamed from: a */
    public ActionMode mo291a(Callback callback) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo292a(int i);

    /* renamed from: a */
    public void mo293a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo294a(Drawable drawable);

    /* renamed from: a */
    public abstract void mo295a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo296a(boolean z);

    /* renamed from: a */
    public boolean mo297a() {
        return false;
    }

    /* renamed from: a */
    public abstract boolean mo298a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo299a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo300b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo301b(boolean z);

    /* renamed from: b */
    public abstract boolean mo302b();

    /* renamed from: c */
    public abstract int mo303c();

    /* renamed from: c */
    public abstract void mo304c(boolean z);

    /* renamed from: d */
    public abstract Context mo305d();

    /* renamed from: d */
    public abstract void mo306d(boolean z);

    /* renamed from: e */
    public boolean mo307e() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo308f() {
    }

    /* renamed from: g */
    public boolean mo309g() {
        return false;
    }
}
