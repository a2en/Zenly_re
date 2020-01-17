package app.zenly.locator.map.p109i1;

import android.content.Context;
import android.graphics.Bitmap;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2484h;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.map.C4409z0;
import com.bumptech.glide.load.engine.C8978i;
import java.util.concurrent.Future;
import p213co.znly.models.bubble.BubbleProto$BubbleIcon.C6966d;
import p213co.znly.models.bubble.C6971b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.map.i1.l1 */
public final class C4028l1 {

    /* renamed from: a */
    private final ZenlySchedulers f10586a = C1351e.m6372a(C4409z0.f11896b.mo19916a("bubblesMediaLoader"));

    /* renamed from: b */
    private C2485i f10587b;

    public C4028l1(Context context) {
        this.f10587b = C2476d.m8582a(context);
    }

    /* renamed from: a */
    public C12279e<Bitmap> mo10664a(C6971b bVar) {
        return C12279e.m32623b((Iterable<? extends T>) bVar.getIconsList()).mo36501i(C3993a.f10544e).mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) new C3996b<Object,Object>(this));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10663a(C6966d dVar) throws Exception {
        C2484h a = this.f10587b.m8714a().m8684a(dVar.getUrl()).m8691a(C8978i.f23423a).m8695a(false);
        int i = C2890k.f8177c;
        return C12279e.m32617a((Future<? extends T>) a.mo24174b(i, i)).mo36452b((C12286f) this.f10586a.getSingle());
    }
}
