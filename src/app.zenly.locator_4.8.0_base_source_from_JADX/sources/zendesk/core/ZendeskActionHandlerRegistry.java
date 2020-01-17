package zendesk.core;

import com.zendesk.func.ZFunc1;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() {
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    ZendeskActionHandlerRegistry() {
    }

    public void add(ActionHandler actionHandler) {
        if (actionHandler != null) {
            this.registry.add(actionHandler);
        }
    }

    public void clear() {
        this.registry.clear();
    }

    public ActionHandler handlerByAction(String str) {
        if (C12017g.m31659c(str)) {
            return null;
        }
        ArrayList<ActionHandler> arrayList = new ArrayList<>(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        for (ActionHandler actionHandler : arrayList) {
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    public List<ActionHandler> handlersByAction(final String str) {
        if (C12017g.m31659c(str)) {
            return Collections.emptyList();
        }
        List<ActionHandler> a = C12010a.m31630a(this.registry, new ZFunc1<ActionHandler, Boolean>(this) {
            public Boolean apply(ActionHandler actionHandler) {
                return Boolean.valueOf(actionHandler.canHandle(str));
            }
        });
        Collections.sort(a, PRIORITY_ACTION_HANDLER_COMPARATOR);
        return a;
    }

    public void remove(ActionHandler actionHandler) {
        if (actionHandler != null) {
            this.registry.remove(actionHandler);
        }
    }
}
