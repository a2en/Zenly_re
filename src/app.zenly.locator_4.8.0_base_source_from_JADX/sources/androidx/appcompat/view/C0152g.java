package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: androidx.appcompat.view.g */
public class C0152g implements Callback {

    /* renamed from: e */
    final Callback f511e;

    public C0152g(Callback callback) {
        if (callback != null) {
            this.f511e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Callback mo659a() {
        return this.f511e;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f511e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f511e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f511e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f511e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f511e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f511e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f511e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f511e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f511e.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f511e.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f511e.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f511e.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f511e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f511e.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f511e.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f511e.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f511e.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f511e.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f511e.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f511e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f511e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f511e.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f511e.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f511e.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f511e.onWindowStartingActionMode(callback, i);
    }
}
