package app.zenly.android.feature.descendants.repository;

import app.zenly.android.feature.descendants.model.Descendant;
import app.zenly.android.feature.descendants.model.RankedDescendant;
import java.util.List;
import p389io.reactivex.C12291g;

public interface DescendantsRepository {
    C12291g<List<Descendant>> getCurrentUserDescendants(long j);

    C12291g<List<RankedDescendant>> getFullLeaderBoard();

    C12291g<List<RankedDescendant>> getLeaderBoard(String str);

    C12291g<Integer> getNewDescendantCount(long j);

    C12291g<Integer> getWorldwideRank(int i);
}
