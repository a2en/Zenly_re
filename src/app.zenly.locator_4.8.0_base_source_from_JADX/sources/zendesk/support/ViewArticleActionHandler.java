package zendesk.support;

import android.content.Context;
import com.zendesk.logger.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.guide.ViewArticleActivity;

class ViewArticleActionHandler implements ActionHandler {
    ViewArticleActionHandler() {
    }

    public static Map<String, Object> data(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("help_center_article_id", Long.valueOf(j));
        hashMap.put("help_center_article_title", str);
        return hashMap;
    }

    public boolean canHandle(String str) {
        return str.equals("help_center_view_article");
    }

    public ActionDescription getActionDescription() {
        return null;
    }

    public int getPriority() {
        return 0;
    }

    public void handle(Map<String, Object> map, Context context) {
        List list;
        if (map == null) {
            Logger.m31614d("ViewArticleActionHandle", "Property map is null, cannot open article.", new Object[0]);
            return;
        }
        long longValue = ((Long) map.get("help_center_article_id")).longValue();
        UiConfig a = C13561l.m35894a(map, UiConfig.class);
        if (a != null) {
            list = a.getUiConfigs();
        } else {
            list = Collections.emptyList();
        }
        ViewArticleActivity.builder(longValue).show(context, list);
    }
}
