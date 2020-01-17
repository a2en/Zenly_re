package zendesk.core;

import android.content.Context;
import java.util.Map;

public interface ActionHandler {
    boolean canHandle(String str);

    ActionDescription getActionDescription();

    int getPriority();

    void handle(Map<String, Object> map, Context context);
}
