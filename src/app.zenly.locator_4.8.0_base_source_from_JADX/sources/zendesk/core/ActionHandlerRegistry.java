package zendesk.core;

import java.util.List;

public interface ActionHandlerRegistry {
    void add(ActionHandler actionHandler);

    void clear();

    ActionHandler handlerByAction(String str);

    List<ActionHandler> handlersByAction(String str);

    void remove(ActionHandler actionHandler);
}
