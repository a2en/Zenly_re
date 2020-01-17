package zendesk.support.guide;

import java.util.List;
import zendesk.support.HelpItem;

public interface HelpMvp$View {
    void addItem(int i, HelpItem helpItem);

    void removeItem(int i);

    void showItems(List<HelpItem> list);
}
