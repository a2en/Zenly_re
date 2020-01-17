package zendesk.support.guide;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.zendesk.logger.Logger;
import java.util.List;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12135e;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.CategoryItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.UiUtils;

class HelpRecyclerViewAdapter extends C1069g<HelpViewHolder> implements HelpMvp$View {
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public int defaultCategoryTitleColour;
    /* access modifiers changed from: private */
    public final HelpCenterUiConfig helpCenterUiConfig;
    /* access modifiers changed from: private */
    public int highlightCategoryTitleColour;
    /* access modifiers changed from: private */
    public HelpMvp$Presenter presenter;

    class ArticleViewHolder extends HelpViewHolder {
        ArticleViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
        }

        public void bindTo(final HelpItem helpItem, int i) {
            if (helpItem == null || helpItem.getId() == null) {
                Logger.m31610b("HelpCenterActivity", "Article item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            this.textView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ViewArticleActivity.builder(helpItem.getId().longValue()).show(HelpRecyclerViewAdapter.this.context, HelpRecyclerViewAdapter.this.helpCenterUiConfig.getUiConfigs());
                }
            });
        }
    }

    class CategoryViewHolder extends HelpViewHolder {
        /* access modifiers changed from: private */
        public boolean expanded;
        /* access modifiers changed from: private */
        public Drawable expanderDrawable;

        CategoryViewHolder(View view) {
            super(view);
            TextView textView = (TextView) view;
            this.textView = textView;
            this.expanderDrawable = C0559a.m2657i(C0540a.m2546c(view.getContext(), C12135e.zs_help_ic_expand_more)).mutate();
            C0559a.m2650b(this.expanderDrawable, UiUtils.themeAttributeToColor(16842808, HelpRecyclerViewAdapter.this.context, C12133c.zs_fallback_text_color));
            C0559a.m2645a(this.expanderDrawable, Mode.SRC_IN);
            if (VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, this.expanderDrawable, null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, this.expanderDrawable, null);
            }
        }

        /* access modifiers changed from: private */
        public void setHighlightColor(boolean z) {
            if (z) {
                this.textView.setTextColor(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour);
                this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour, Mode.SRC_IN);
                return;
            }
            this.textView.setTextColor(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour);
            this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour, Mode.SRC_IN);
        }

        public void bindTo(HelpItem helpItem, final int i) {
            int i2 = 0;
            if (helpItem == null) {
                Logger.m31610b("HelpCenterActivity", "Category item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            final CategoryItem categoryItem = (CategoryItem) helpItem;
            this.expanded = categoryItem.isExpanded();
            Drawable drawable = this.expanderDrawable;
            if (this.expanded) {
                i2 = 10000;
            }
            drawable.setLevel(i2);
            setHighlightColor(categoryItem.isExpanded());
            this.textView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    CategoryViewHolder categoryViewHolder = CategoryViewHolder.this;
                    categoryViewHolder.expanded = HelpRecyclerViewAdapter.this.presenter.onCategoryClick(categoryItem, i);
                    Drawable access$300 = CategoryViewHolder.this.expanderDrawable;
                    int[] iArr = new int[2];
                    int i = 10000;
                    iArr[0] = CategoryViewHolder.this.expanded ? 0 : 10000;
                    if (!CategoryViewHolder.this.expanded) {
                        i = 0;
                    }
                    iArr[1] = i;
                    ObjectAnimator.ofInt(access$300, "level", iArr).start();
                    CategoryViewHolder categoryViewHolder2 = CategoryViewHolder.this;
                    categoryViewHolder2.setHighlightColor(categoryViewHolder2.expanded);
                }
            });
        }

        public boolean isExpanded() {
            return this.expanded;
        }
    }

    private class ExtraPaddingViewHolder extends HelpViewHolder {
        ExtraPaddingViewHolder(HelpRecyclerViewAdapter helpRecyclerViewAdapter, View view) {
            super(view);
        }

        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    static abstract class HelpViewHolder extends C1085v {
        TextView textView;

        HelpViewHolder(View view) {
            super(view);
        }

        public abstract void bindTo(HelpItem helpItem, int i);
    }

    private class LoadingViewHolder extends HelpViewHolder {
        LoadingViewHolder(HelpRecyclerViewAdapter helpRecyclerViewAdapter, View view) {
            super(view);
        }

        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    private class NoResultsViewHolder extends HelpViewHolder {
        NoResultsViewHolder(HelpRecyclerViewAdapter helpRecyclerViewAdapter, View view) {
            super(view);
        }

        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    class SectionViewHolder extends HelpViewHolder {
        SectionViewHolder(HelpRecyclerViewAdapter helpRecyclerViewAdapter, View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C12136f.section_title);
        }

        public void bindTo(HelpItem helpItem, int i) {
            if (helpItem == null) {
                Logger.m31610b("HelpCenterActivity", "Section item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
        }
    }

    private class SeeAllViewHolder extends HelpViewHolder {
        /* access modifiers changed from: private */
        public ProgressBar progressBar;

        SeeAllViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C12136f.help_section_action_button);
            this.progressBar = (ProgressBar) view.findViewById(C12136f.help_section_loading_progress);
        }

        public void bindTo(final HelpItem helpItem, int i) {
            String str;
            if (!(helpItem instanceof SeeAllArticlesItem)) {
                Logger.m31610b("HelpCenterActivity", "SeeAll item was null, cannot bind", new Object[0]);
                return;
            }
            final SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) helpItem;
            if (seeAllArticlesItem.isLoading()) {
                this.textView.setVisibility(8);
                this.progressBar.setVisibility(0);
            } else {
                this.textView.setVisibility(0);
                this.progressBar.setVisibility(8);
            }
            SectionItem section = seeAllArticlesItem.getSection();
            if (section != null) {
                str = HelpRecyclerViewAdapter.this.context.getString(C12140j.support_help_see_all_n_articles_label, new Object[]{Integer.valueOf(section.getTotalArticlesCount())});
            } else {
                str = HelpRecyclerViewAdapter.this.context.getString(C12140j.support_help_see_all_articles_label);
            }
            this.textView.setText(str);
            this.textView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    SeeAllViewHolder.this.textView.setVisibility(8);
                    SeeAllViewHolder.this.progressBar.setVisibility(0);
                    HelpRecyclerViewAdapter.this.presenter.onSeeAllClick((SeeAllArticlesItem) helpItem);
                    seeAllArticlesItem.setLoading(true);
                }
            });
        }
    }

    HelpRecyclerViewAdapter(HelpCenterUiConfig helpCenterUiConfig2, HelpCenterProvider helpCenterProvider, NetworkInfoProvider networkInfoProvider) {
        this.presenter = new HelpAdapterPresenter(this, new HelpModel(helpCenterProvider), networkInfoProvider, helpCenterUiConfig2);
        this.helpCenterUiConfig = helpCenterUiConfig2;
    }

    private View inflateView(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    public void addItem(int i, HelpItem helpItem) {
        notifyItemInserted(i);
    }

    public int getItemCount() {
        return this.presenter.getItemCount();
    }

    public int getItemViewType(int i) {
        return this.presenter.getItemViewType(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.context = recyclerView.getContext();
        this.highlightCategoryTitleColour = UiUtils.themeAttributeToColor(C12131a.colorPrimary, this.context, C12133c.zs_fallback_text_color);
        this.defaultCategoryTitleColour = C0540a.m2536a(this.context, C12133c.zs_help_text_color_primary);
        this.presenter.onAttached();
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.presenter.onDetached();
        this.context = null;
    }

    public void removeItem(int i) {
        notifyItemRemoved(i);
    }

    /* access modifiers changed from: 0000 */
    public void setContentUpdateListener(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        HelpMvp$Presenter helpMvp$Presenter = this.presenter;
        if (helpMvp$Presenter != null) {
            helpMvp$Presenter.setContentPresenter(helpCenterMvp$Presenter);
        }
    }

    public void showItems(List<HelpItem> list) {
        notifyDataSetChanged();
    }

    public void onBindViewHolder(HelpViewHolder helpViewHolder, int i) {
        if (helpViewHolder == null) {
            Logger.m31614d("HelpCenterActivity", "Holder was null, possible unexpected item type", new Object[0]);
            return;
        }
        helpViewHolder.bindTo(this.presenter.getItemForBinding(i), i);
    }

    public HelpViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new CategoryViewHolder(inflateView(viewGroup, C12138h.zs_row_category));
            case 2:
                return new SectionViewHolder(this, inflateView(viewGroup, C12138h.zs_row_section));
            case 3:
                return new ArticleViewHolder(inflateView(viewGroup, C12138h.zs_row_article));
            case 4:
                return new SeeAllViewHolder(inflateView(viewGroup, C12138h.zs_row_action));
            case 5:
                return new LoadingViewHolder(this, inflateView(viewGroup, C12138h.zs_row_loading_progress));
            case 7:
                return new NoResultsViewHolder(this, inflateView(viewGroup, C12138h.zs_row_no_articles_found));
            case 8:
                return new ExtraPaddingViewHolder(this, inflateView(viewGroup, C12138h.zs_row_padding));
            default:
                Logger.m31614d("HelpCenterActivity", "Unknown item type, returning null for holder", new Object[0]);
                return null;
        }
    }
}
