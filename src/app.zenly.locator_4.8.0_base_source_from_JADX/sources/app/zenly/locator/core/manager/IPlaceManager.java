package app.zenly.locator.core.manager;

import app.zenly.locator.core.models.C2872b0;
import java.util.List;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12291g;

public interface IPlaceManager {
    C12273d<C2872b0> getBestPlace(String str);

    C12291g<List<C2872b0>> getPlaces(String str);
}
