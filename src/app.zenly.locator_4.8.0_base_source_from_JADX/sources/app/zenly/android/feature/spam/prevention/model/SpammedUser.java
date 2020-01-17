package app.zenly.android.feature.spam.prevention.model;

import app.zenly.android.feature.base.model.Avatar;

public interface SpammedUser {
    Avatar getAvatar();

    String getFriendRequestId();

    String getId();

    String getName();
}
