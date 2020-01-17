package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0540a;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import p333g.p384h.p385a.C12135e;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SdkDependencyProvider;

public class HelpCenterFragment extends Fragment {
    private HelpRecyclerViewAdapter adapter;
    HelpCenterProvider helpCenterProvider;
    NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp$Presenter presenter;
    private RecyclerView recyclerView;

    @SuppressLint({"RestrictedApi"})
    public static HelpCenterFragment newInstance(HelpCenterUiConfig helpCenterUiConfig) {
        Bundle bundle = new Bundle();
        C13561l.m35896a(bundle, (UiConfig) helpCenterUiConfig);
        HelpCenterFragment helpCenterFragment = new HelpCenterFragment();
        helpCenterFragment.setArguments(bundle);
        return helpCenterFragment;
    }

    private void setupRecyclerView() {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.recyclerView.mo5045a((C1074l) new SeparatorDecoration(C0540a.m2546c(getContext(), C12135e.zs_help_separator)));
        this.recyclerView.setAdapter(this.adapter);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (SdkDependencyProvider.INSTANCE.isInitialized()) {
            HelpCenterUiConfig helpCenterUiConfig = (HelpCenterUiConfig) C13561l.m35892a(getArguments(), HelpCenterUiConfig.class);
            SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
            this.adapter = new HelpRecyclerViewAdapter(helpCenterUiConfig, this.helpCenterProvider, this.networkInfoProvider);
            HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
            if (helpCenterMvp$Presenter != null) {
                this.adapter.setContentUpdateListener(helpCenterMvp$Presenter);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12138h.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(C12136f.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void setPresenter(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        this.presenter = helpCenterMvp$Presenter;
        HelpRecyclerViewAdapter helpRecyclerViewAdapter = this.adapter;
        if (helpRecyclerViewAdapter != null) {
            helpRecyclerViewAdapter.setContentUpdateListener(helpCenterMvp$Presenter);
        }
    }
}
