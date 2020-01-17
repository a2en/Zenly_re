package app.zenly.locator.media;

import androidx.lifecycle.Observer;
import java.util.List;
import p250f.p251a.p252a.p263b.p275c.C7744d;

/* renamed from: app.zenly.locator.media.w */
/* compiled from: lambda */
public final /* synthetic */ class C4474w implements Observer {

    /* renamed from: a */
    private final /* synthetic */ TakePictureActivity f12042a;

    /* renamed from: b */
    private final /* synthetic */ C7744d f12043b;

    public /* synthetic */ C4474w(TakePictureActivity takePictureActivity, C7744d dVar) {
        this.f12042a = takePictureActivity;
        this.f12043b = dVar;
    }

    public final void onChanged(Object obj) {
        this.f12042a.mo11597a(this.f12043b, (List) obj);
    }
}
