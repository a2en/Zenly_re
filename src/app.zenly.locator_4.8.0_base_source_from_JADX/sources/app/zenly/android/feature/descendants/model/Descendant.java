package app.zenly.android.feature.descendants.model;

import app.zenly.android.feature.base.model.Avatar;

public interface Descendant {
    Avatar getAvatar();

    String getDisplayName();

    String getId();

    boolean getNewPop();
}
