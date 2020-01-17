package app.zenly.locator.chat;

public interface ChatPresenter {
    void init();

    void setChatState(boolean z);

    void subscribe();

    void unsubscribe();
}
