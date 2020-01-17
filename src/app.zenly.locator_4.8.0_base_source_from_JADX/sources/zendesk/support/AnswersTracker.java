package zendesk.support;

import com.crashlytics.android.answers.shim.C9288b;
import com.crashlytics.android.answers.shim.C9289c;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;

class AnswersTracker implements ZendeskTracker {
    AnswersTracker() {
    }

    public void helpCenterArticleViewed() {
        Logger.m31608a("AnswersTracker", "helpCenterArticleViewed", new Object[0]);
        C9288b.m22384a().logKitEvent(new C9289c("help-center-article-viewed"));
    }

    public void helpCenterLoaded() {
        Logger.m31608a("AnswersTracker", "helpCenterLoaded", new Object[0]);
        C9288b.m22384a().logKitEvent(new C9289c("help-center-fetched"));
    }

    public void helpCenterSearched(String str) {
        Logger.m31608a("AnswersTracker", "helpCenterSearched", new Object[0]);
        C9289c cVar = new C9289c("help-center-search");
        if (C12017g.m31659c(str)) {
            str = "";
        }
        cVar.mo25023a("search-term", str);
        C9288b.m22384a().logKitEvent(cVar);
    }

    public void requestCreated() {
        Logger.m31608a("AnswersTracker", "requestCreated", new Object[0]);
        C9288b.m22384a().logKitEvent(new C9289c("request-created"));
    }

    public void requestUpdated() {
        Logger.m31608a("AnswersTracker", "requestUpdated", new Object[0]);
        C9288b.m22384a().logKitEvent(new C9289c("request-updated"));
    }
}
