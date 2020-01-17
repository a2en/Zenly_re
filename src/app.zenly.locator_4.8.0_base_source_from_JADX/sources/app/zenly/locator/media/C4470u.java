package app.zenly.locator.media;

import android.graphics.Rect;
import android.view.View;
import app.zenly.android.feature.base.view.WindowInsetsListener;

/* renamed from: app.zenly.locator.media.u */
/* compiled from: lambda */
public final /* synthetic */ class C4470u implements WindowInsetsListener {

    /* renamed from: e */
    private final /* synthetic */ TakePictureActivity f12040e;

    public /* synthetic */ C4470u(TakePictureActivity takePictureActivity) {
        this.f12040e = takePictureActivity;
    }

    public final void onWindowInsetsChanged(View view, Rect rect) {
        this.f12040e.mo11596a(view, rect);
    }
}
