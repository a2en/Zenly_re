package zendesk.support.guide;

import android.content.Context;
import java.util.List;
import zendesk.core.RetryAction;
import zendesk.support.SearchArticle;

public interface HelpCenterMvp$View {
    void announceContentLoaded();

    void clearSearchResults();

    void dismissError();

    void exitActivity();

    Context getContext();

    void hideLoadingState();

    boolean isShowingHelp();

    void setSearchEnabled(boolean z);

    void showContactUsButton();

    void showContactZendesk();

    void showHelp(HelpCenterUiConfig helpCenterUiConfig);

    void showLoadArticleErrorWithRetry(HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, RetryAction retryAction);

    void showLoadingState();

    void showNoConnectionError();

    void showRequestList();

    void showSearchResults(List<SearchArticle> list, String str);
}
