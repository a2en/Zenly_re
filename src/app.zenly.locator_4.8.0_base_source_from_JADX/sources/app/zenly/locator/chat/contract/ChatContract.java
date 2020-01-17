package app.zenly.locator.chat.contract;

import p213co.znly.models.C7339i;
import p213co.znly.models.core.C7117i;

public interface ChatContract {
    void dismiss(boolean z);

    void enableEmojisReception();

    C7339i getContact();

    C7117i getConversation();

    String getUserUuid();

    void onFullscreenChanged(boolean z);

    void popLocationDisabledDialog();

    void updateMapPadding(int i);
}
