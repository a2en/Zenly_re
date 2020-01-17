package zendesk.support.guide;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12014d;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

class HelpSearchRecyclerViewAdapter extends C1069g {
    /* access modifiers changed from: private */
    public final HelpCenterProvider helpCenterProvider;
    /* access modifiers changed from: private */
    public final HelpCenterUiConfig helpCenterUiConfig;
    /* access modifiers changed from: private */
    public String query;
    private boolean resultsCleared = false;
    private List<SearchArticle> searchArticles;

    private class HelpSearchViewHolder extends C1085v {
        private Context context;
        private TextView subtitleTextView;
        private TextView titleTextView;

        HelpSearchViewHolder(View view, Context context2) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(C12136f.title);
            this.subtitleTextView = (TextView) view.findViewById(C12136f.subtitle);
            this.context = context2;
        }

        /* access modifiers changed from: 0000 */
        public void bindTo(final SearchArticle searchArticle) {
            int i;
            if (searchArticle == null || searchArticle.getArticle() == null) {
                Logger.m31610b("HelpCenterActivity", "The article was null, cannot bind the view.", new Object[0]);
                return;
            }
            String title = searchArticle.getArticle().getTitle() != null ? searchArticle.getArticle().getTitle() : "";
            if (HelpSearchRecyclerViewAdapter.this.query == null) {
                i = -1;
            } else {
                i = title.toLowerCase(Locale.getDefault()).indexOf(HelpSearchRecyclerViewAdapter.this.query.toLowerCase(Locale.getDefault()));
            }
            if (i != -1) {
                SpannableString spannableString = new SpannableString(title);
                spannableString.setSpan(new StyleSpan(1), i, HelpSearchRecyclerViewAdapter.this.query.length() + i, 18);
                this.titleTextView.setText(spannableString);
            } else {
                this.titleTextView.setText(title);
            }
            this.subtitleTextView.setText(this.context.getString(C12140j.help_search_subtitle_format, new Object[]{searchArticle.getCategory().getName(), searchArticle.getSection().getName()}));
            this.itemView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    HelpSearchRecyclerViewAdapter.this.helpCenterProvider.submitRecordArticleView(searchArticle.getArticle(), C12014d.m31648a(searchArticle.getArticle().getLocale()), new C12008e<Void>(this) {
                        public void onError(ErrorResponse errorResponse) {
                            Logger.m31610b("HelpCenterActivity", "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", errorResponse.getReason(), Boolean.valueOf(errorResponse.isNetworkError()), Integer.valueOf(errorResponse.getStatus()));
                        }

                        public void onSuccess(Void voidR) {
                        }
                    });
                    ViewArticleActivity.builder(searchArticle.getArticle()).show(HelpSearchViewHolder.this.itemView.getContext(), HelpSearchRecyclerViewAdapter.this.helpCenterUiConfig.getUiConfigs());
                }
            });
        }
    }

    private class NoResultsViewHolder extends C1085v {
        NoResultsViewHolder(HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter, View view) {
            super(view);
        }
    }

    private class PaddingViewHolder extends C1085v {
        PaddingViewHolder(HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter, View view) {
            super(view);
        }
    }

    HelpSearchRecyclerViewAdapter(List<SearchArticle> list, String str, HelpCenterUiConfig helpCenterUiConfig2, HelpCenterProvider helpCenterProvider2) {
        this.searchArticles = list;
        this.query = str;
        this.helpCenterUiConfig = helpCenterUiConfig2;
        this.helpCenterProvider = helpCenterProvider2;
    }

    private int getPaddingExtraItem() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public void clearResults() {
        this.resultsCleared = true;
        this.searchArticles = Collections.emptyList();
        this.query = "";
        notifyDataSetChanged();
    }

    public int getItemCount() {
        if (this.resultsCleared) {
            return 0;
        }
        return Math.max(this.searchArticles.size() + getPaddingExtraItem(), 1);
    }

    public int getItemViewType(int i) {
        if (i == 0 && this.searchArticles.size() == 0) {
            return 441;
        }
        return (i <= 0 || i != this.searchArticles.size()) ? 531 : 423;
    }

    public void onBindViewHolder(C1085v vVar, int i) {
        if (531 == getItemViewType(i)) {
            ((HelpSearchViewHolder) vVar).bindTo((SearchArticle) this.searchArticles.get(i));
        }
    }

    public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 423) {
            return new PaddingViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12138h.zs_row_padding, viewGroup, false));
        }
        if (i == 441) {
            return new NoResultsViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12138h.zs_row_no_articles_found, viewGroup, false));
        }
        if (i != 531) {
            return null;
        }
        return new HelpSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C12138h.zs_row_search_article, viewGroup, false), viewGroup.getContext());
    }

    /* access modifiers changed from: 0000 */
    public void update(List<SearchArticle> list, String str) {
        this.resultsCleared = false;
        this.searchArticles = list;
        this.query = str;
        notifyDataSetChanged();
    }
}
