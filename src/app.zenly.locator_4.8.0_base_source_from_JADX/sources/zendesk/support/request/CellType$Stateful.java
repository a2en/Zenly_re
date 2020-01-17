package zendesk.support.request;

import java.util.List;

public interface CellType$Stateful extends CellType$Base {
    List<StateMessage> getErrorGroupMessages();

    StateMessage getStateMessage();

    boolean isErrorShown();

    boolean isLastErrorCellOfBlock();

    boolean isMarkedAsDelivered();

    CellType$Stateful markAsDelivered();

    CellType$Stateful markAsErrored(List<StateMessage> list, boolean z);
}
