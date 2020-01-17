package app.zenly.locator.powermoves.api;

import app.zenly.locator.powermoves.p127b.C4984a;
import java.util.List;
import p389io.reactivex.C12291g;

public interface PowerMoveDataSource {
    C12291g<C4984a> powerMove(String str);

    C12291g<List<C4984a>> powerMoves();
}
