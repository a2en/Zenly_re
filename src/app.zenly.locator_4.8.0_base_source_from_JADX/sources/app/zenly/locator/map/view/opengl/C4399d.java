package app.zenly.locator.map.view.opengl;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: app.zenly.locator.map.view.opengl.d */
class C4399d extends Handler {

    /* renamed from: a */
    private final WeakReference<C4400e> f11879a;

    C4399d(C4400e eVar) {
        this.f11879a = new WeakReference<>(eVar);
    }

    public void handleMessage(Message message) {
        C4400e eVar = (C4400e) this.f11879a.get();
        int i = message.what;
        if (i == 1) {
            eVar.mo11550b();
        } else if (i == 2) {
            eVar.mo11548a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown message ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }
}
