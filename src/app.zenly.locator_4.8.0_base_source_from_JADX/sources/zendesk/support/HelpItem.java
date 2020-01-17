package zendesk.support;

public interface HelpItem {
    Long getId();

    String getName();

    Long getParentId();

    int getViewType();
}
