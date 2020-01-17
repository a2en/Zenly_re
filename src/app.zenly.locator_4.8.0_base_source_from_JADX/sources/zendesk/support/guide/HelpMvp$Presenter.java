package zendesk.support.guide;

import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SeeAllArticlesItem;

public interface HelpMvp$Presenter {
    HelpItem getItem(int i);

    int getItemCount();

    HelpItem getItemForBinding(int i);

    int getItemViewType(int i);

    void onAttached();

    boolean onCategoryClick(CategoryItem categoryItem, int i);

    void onDetached();

    void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem);

    void setContentPresenter(HelpCenterMvp$Presenter helpCenterMvp$Presenter);
}
