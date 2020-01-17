package app.zenly.locator.powermoves.api;

import app.zenly.locator.powermoves.p127b.C4984a;
import java.util.List;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12291g;

public interface PowerMovesService {
    C12291g<Boolean> hasAlreadyUnlockGift();

    C12291g<Boolean> isPowerMoveRead(C4984a aVar);

    C12291g<Boolean> justUnlockedPowerMoves();

    C12271b markPowerMoveAsRead(C4984a aVar);

    C12291g<C4984a> powerMove(String str);

    C12291g<List<C4984a>> powerMoves();

    C12291g<Boolean> powerMovesRead();

    C12271b setHasUnlockGift();
}
