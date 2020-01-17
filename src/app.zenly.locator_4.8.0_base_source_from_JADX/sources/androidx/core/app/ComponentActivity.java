package androidx.core.app;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import p214e.p228e.C7584g;

public class ComponentActivity extends Activity implements Component {
    private C7584g<Class<? extends C0497a>, C0497a> mExtraDataMap = new C7584g<>();

    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C0497a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m2792a(decorView, keyEvent)) {
            return KeyEventDispatcher.m2793a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m2792a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public <T extends C0497a> T getExtraData(Class<T> cls) {
        return (C0497a) this.mExtraDataMap.get(cls);
    }

    public void putExtraData(C0497a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
