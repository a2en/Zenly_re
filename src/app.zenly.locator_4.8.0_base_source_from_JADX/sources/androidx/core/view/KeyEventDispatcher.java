package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KeyEventDispatcher {

    /* renamed from: a */
    private static boolean f2742a = false;

    /* renamed from: b */
    private static Method f2743b = null;

    /* renamed from: c */
    private static boolean f2744c = false;

    /* renamed from: d */
    private static Field f2745d;

    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m2792a(View view, KeyEvent keyEvent) {
        return ViewCompat.m2838b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m2793a(Component component, View view, Callback callback, KeyEvent keyEvent) {
        boolean z = false;
        if (component == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return component.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2790a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2791a((Dialog) callback, keyEvent);
        }
        if ((view != null && ViewCompat.m2831a(view, keyEvent)) || component.superDispatchKeyEvent(keyEvent)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2789a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2742a) {
            try {
                f2743b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f2742a = true;
        }
        Method method = f2743b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2790a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2789a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.m2831a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static OnKeyListener m2788a(Dialog dialog) {
        if (!f2744c) {
            try {
                f2745d = Dialog.class.getDeclaredField("mOnKeyListener");
                f2745d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2744c = true;
        }
        Field field = f2745d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m2791a(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener a = m2788a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.m2831a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
