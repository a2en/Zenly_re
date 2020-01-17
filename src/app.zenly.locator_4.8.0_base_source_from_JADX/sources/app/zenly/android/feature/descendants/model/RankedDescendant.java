package app.zenly.android.feature.descendants.model;

public interface RankedDescendant extends Descendant, Comparable<RankedDescendant> {
    int getDescendantCount();

    int getRank();
}
