package app.zenly.locator.recommendation.model;

import app.zenly.android.feature.base.model.Avatar;

public interface PotentialMatch {
    Avatar getAvatar();

    String getId();

    String getName();
}
