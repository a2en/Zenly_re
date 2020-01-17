package app.zenly.locator.map.fog;

import p213co.znly.models.C7339i;

public interface FogContract {
    void bumpAvatar();

    C7339i getContact();

    String getDisplayName();

    String getUserUuid();

    void setBottomInset(int i);
}
