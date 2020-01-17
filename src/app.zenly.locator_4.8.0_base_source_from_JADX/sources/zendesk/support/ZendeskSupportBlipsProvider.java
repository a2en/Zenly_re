package zendesk.support;

import com.zendesk.util.C12014d;
import com.zendesk.util.C12017g;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import zendesk.core.BlipsGroup;
import zendesk.core.BlipsProvider;
import zendesk.core.PageView;
import zendesk.core.UserAction;

class ZendeskSupportBlipsProvider implements SupportBlipsProvider {
    private BlipsProvider blipsProvider;
    private Locale locale;

    ZendeskSupportBlipsProvider(BlipsProvider blipsProvider2, Locale locale2) {
        this.blipsProvider = blipsProvider2;
        this.locale = locale2;
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, String str2, Map<String, Object> map) {
        BlipsProvider blipsProvider2 = this.blipsProvider;
        UserAction userAction = new UserAction("2.2.1", "support_sdk", "SupportSDK", str, str2, map);
        blipsProvider2.sendBlip(userAction, blipsGroup);
    }

    public void articleView(Article article) {
        if (article != null) {
            String htmlUrl = article.getHtmlUrl();
            String title = article.getTitle();
            if (C12017g.m31655a(htmlUrl, title)) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", "java");
                BlipsProvider blipsProvider2 = this.blipsProvider;
                PageView pageView = new PageView("2.2.1", "support_sdk", htmlUrl, C12014d.m31647a(this.locale), title, hashMap);
                blipsProvider2.sendBlip(pageView, BlipsGroup.PATHFINDER);
            }
        }
    }

    public void articleVote(Long l, int i) {
        if (l != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("articleId", l);
            hashMap.put("vote", Integer.valueOf(i));
            sendUserAction(BlipsGroup.BEHAVIOURAL, "articleVote", hashMap);
        }
    }

    public void helpCenterSearch(String str) {
        if (C12017g.m31658b(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", str);
            hashMap.put("code", "java");
            sendUserAction(BlipsGroup.PATHFINDER, "search", "helpCenterForm", hashMap);
        }
    }

    public void requestCreated(String str) {
        if (!C12017g.m31659c(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", str);
            sendUserAction(BlipsGroup.BEHAVIOURAL, "requestCreated", hashMap);
        }
    }

    public void requestListViewed() {
        sendUserAction(BlipsGroup.BEHAVIOURAL, "requestListViewed");
    }

    public void requestUpdated(String str) {
        if (!C12017g.m31659c(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", str);
            sendUserAction(BlipsGroup.BEHAVIOURAL, "requestUpdated", hashMap);
        }
    }

    public void requestViewed(String str) {
        if (!C12017g.m31659c(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", str);
            sendUserAction(BlipsGroup.BEHAVIOURAL, "requestViewed", hashMap);
        }
    }

    public void supportSdkInit() {
        sendUserAction(BlipsGroup.REQUIRED, "init");
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, Map<String, Object> map) {
        sendUserAction(blipsGroup, str, null, map);
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str) {
        sendUserAction(blipsGroup, str, null, null);
    }
}
