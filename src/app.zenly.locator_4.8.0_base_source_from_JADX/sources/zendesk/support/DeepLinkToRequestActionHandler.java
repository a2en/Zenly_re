package zendesk.support;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.TaskStackBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.commonui.UiConfig;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;

class DeepLinkToRequestActionHandler implements ActionHandler {
    DeepLinkToRequestActionHandler() {
    }

    static Map<String, Object> data(Intent intent, List<Intent> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_ui_config", intent);
        hashMap.put("back_stack_activities", list);
        return hashMap;
    }

    public boolean canHandle(String str) {
        return str.equals("request_view_conversation");
    }

    public ActionDescription getActionDescription() {
        return null;
    }

    public int getPriority() {
        return 0;
    }

    public void handle(Map<String, Object> map, Context context) {
        TaskStackBuilder a = TaskStackBuilder.m2443a(context);
        if (map != null) {
            for (Intent b : (List) map.get("back_stack_activities")) {
                a.mo3026b(b);
            }
        }
        a.mo3026b(RequestListActivity.builder().intent(context, new UiConfig[0]));
        if (map != null) {
            a.mo3026b((Intent) map.get("request_ui_config"));
        }
        a.mo3024a();
    }
}
