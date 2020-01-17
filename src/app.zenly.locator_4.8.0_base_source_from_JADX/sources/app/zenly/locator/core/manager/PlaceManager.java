package app.zenly.locator.core.manager;

import android.content.Context;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.models.C2872b0;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12291g;

public final class PlaceManager implements IPlaceManager {

    public interface Formatter {
    }

    public PlaceManager(Context context, Provider<C2718k5> provider, Provider<Formatter> provider2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(provider, "friendsManager");
        C12932j.m33818b(provider2, "formatter");
    }

    public C12273d<C2872b0> getBestPlace(String str) {
        C12932j.m33818b(str, "uuid");
        C12273d<C2872b0> c = C12273d.m32560c();
        C12932j.m33815a((Object) c, "Maybe.empty()");
        return c;
    }

    public C12291g<List<C2872b0>> getPlaces(String str) {
        C12932j.m33818b(str, "uuid");
        C12291g<List<C2872b0>> f = C12291g.m32770f();
        C12932j.m33815a((Object) f, "Single.never()");
        return f;
    }
}
