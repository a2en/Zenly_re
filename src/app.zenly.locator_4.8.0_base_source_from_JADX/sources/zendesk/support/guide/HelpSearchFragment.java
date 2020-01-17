package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

public class HelpSearchFragment extends Fragment {
    private HelpSearchRecyclerViewAdapter adapter;
    private HelpCenterProvider helpCenterProvider;
    private String query = "";
    private RecyclerView recyclerView;
    private List<SearchArticle> searchArticles = Collections.emptyList();

    @SuppressLint({"RestrictedApi"})
    public static HelpSearchFragment newInstance(HelpCenterUiConfig helpCenterUiConfig, HelpCenterProvider helpCenterProvider2) {
        Bundle bundle = new Bundle();
        C13561l.m35896a(bundle, (UiConfig) helpCenterUiConfig);
        HelpSearchFragment helpSearchFragment = new HelpSearchFragment();
        helpSearchFragment.setArguments(bundle);
        helpSearchFragment.helpCenterProvider = helpCenterProvider2;
        return helpSearchFragment;
    }

    private void setupRecyclerView() {
        HelpCenterUiConfig helpCenterUiConfig = (HelpCenterUiConfig) C13561l.m35892a(getArguments(), HelpCenterUiConfig.class);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.adapter = new HelpSearchRecyclerViewAdapter(this.searchArticles, this.query, helpCenterUiConfig, this.helpCenterProvider);
        this.recyclerView.setAdapter(this.adapter);
    }

    public void clearResults() {
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = this.adapter;
        if (helpSearchRecyclerViewAdapter != null) {
            helpSearchRecyclerViewAdapter.clearResults();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12138h.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(C12136f.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void updateResults(List<SearchArticle> list, String str) {
        this.searchArticles = list;
        this.query = str;
        if (this.adapter != null) {
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
                this.adapter.update(list, str);
                this.recyclerView.announceForAccessibility(getString(C12140j.zs_help_center_search_loaded_accessibility));
            }
        }
    }
}
