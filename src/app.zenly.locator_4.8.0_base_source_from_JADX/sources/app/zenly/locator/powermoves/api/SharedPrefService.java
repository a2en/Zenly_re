package app.zenly.locator.powermoves.api;

import app.zenly.locator.powermoves.p127b.C4984a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12291g;

public interface SharedPrefService {
    C12291g<Boolean> hasAlreadyUnlockGift();

    C12291g<Boolean> isPowerMoveRead(C4984a aVar);

    C12271b setHasUnlockGift();

    C12271b setPowermoveAsRead(C4984a aVar);
}
