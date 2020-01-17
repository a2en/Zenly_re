package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import p214e.p215a.C7521a;

/* renamed from: androidx.appcompat.app.c */
public class C0125c extends Dialog implements AppCompatCallback {
    private C0124b mDelegate;
    private final Component mKeyDispatcher = new C0126a();

    /* renamed from: androidx.appcompat.app.c$a */
    class C0126a implements Component {
        C0126a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return C0125c.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public C0125c(Context context, int i) {
        super(context, getThemeResId(context, i));
        C0124b delegate = getDelegate();
        delegate.mo433d(getThemeResId(context, i));
        delegate.mo412a((Bundle) null);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7521a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo414a(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.m2793a(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo403a(i);
    }

    public C0124b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0124b.m365a((Dialog) this, (AppCompatCallback) this);
        }
        return this.mDelegate;
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo436f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getDelegate().mo434e();
        super.onCreate(bundle);
        getDelegate().mo412a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo445j();
    }

    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    public ActionMode onWindowStartingSupportActionMode(Callback callback) {
        return null;
    }

    public void setContentView(int i) {
        getDelegate().mo429c(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo419a(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo426b(i);
    }

    public void setContentView(View view) {
        getDelegate().mo413a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo425b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo419a((CharSequence) getContext().getString(i));
    }
}
