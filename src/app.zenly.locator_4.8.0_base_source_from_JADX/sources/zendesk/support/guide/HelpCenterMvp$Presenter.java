package zendesk.support.guide;

import zendesk.core.RetryAction;

public interface HelpCenterMvp$Presenter {
    void init(HelpCenterUiConfig helpCenterUiConfig);

    void onErrorWithRetry(HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, RetryAction retryAction);

    void onLoad();

    void onPause();

    void onResume(HelpCenterMvp$View helpCenterMvp$View);

    void onSearchSubmit(String str);

    boolean shouldShowConversationsMenuItem();

    boolean shouldShowSearchMenuItem();
}
