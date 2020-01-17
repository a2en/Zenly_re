package zendesk.support.request;

public interface CellType$Agent extends CellType$Base {
    StateRequestUser getAgent();

    boolean isAgentNameVisible();

    void showAgentName(boolean z);
}
