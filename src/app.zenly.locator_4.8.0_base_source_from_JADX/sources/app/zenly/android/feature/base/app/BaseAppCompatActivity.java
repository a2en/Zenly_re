package app.zenly.android.feature.base.app;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.C12932j;

public abstract class BaseAppCompatActivity extends AppCompatActivity {
    /* renamed from: a */
    public final void mo6504a(boolean z) {
        if (mo6505a()) {
            Window window = getWindow();
            C12932j.m33815a((Object) window, "window");
            View decorView = window.getDecorView();
            C12932j.m33815a((Object) decorView, "window.decorView");
            decorView.setSystemUiVisibility(z ? 3846 : 1280);
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo6505a()) {
            Window window = getWindow();
            C12932j.m33815a((Object) window, "window");
            View decorView = window.getDecorView();
            C12932j.m33815a((Object) decorView, "window.decorView");
            decorView.setSystemUiVisibility(1024);
        }
    }
}
