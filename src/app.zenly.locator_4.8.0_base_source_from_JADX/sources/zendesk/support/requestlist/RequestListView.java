package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C1101f;
import androidx.recyclerview.widget.C1120h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import androidx.transition.C1233h;
import androidx.transition.C1236k;
import androidx.transition.Fade;
import androidx.transition.Transition;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.Collection;
import java.util.List;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.support.UiUtils;
import zendesk.support.request.RequestUiConfig.Builder;
import zendesk.support.request.ViewAlmostRealProgressBar;

@SuppressLint({"ViewConstructor"})
class RequestListView extends FrameLayout {
    private final AppCompatActivity activity;
    private final RequestListAdapter adapter;
    private final RequestListUiConfig config;
    private final FloatingActionButton createTicketFab;
    private final C1233h emptyScene;
    private final Fade fade = new Fade();
    private boolean isLoading = false;
    private boolean isStopped = true;
    /* access modifiers changed from: private */
    public OnItemClick itemClickListener = null;
    private final C1233h listScene;
    private final View listSceneView;
    private final View logoImage;
    private final View logoImageEmpty;
    private final ViewAlmostRealProgressBar progressBar;
    private final RecyclerView recyclerView;
    private OnClickListener retryClickListener = null;
    private final ViewGroup rootLayout;
    private final ViewGroup sceneRoot;
    private SceneState sceneState = SceneState.NONE;
    Snackbar snackbar;
    private final View startConversationButton;
    private final SwipeRefreshLayout swipeRefreshLayout;
    private final SwipeRefreshLayout swipeRefreshLayoutEmpty;
    private final Toolbar toolbar;

    interface OnItemClick {
        void onClick(RequestListItem requestListItem);
    }

    private enum SceneState {
        LIST,
        EMPTY,
        NONE
    }

    public RequestListView(AppCompatActivity appCompatActivity, RequestListUiConfig requestListUiConfig, Picasso picasso) {
        super(appCompatActivity);
        this.activity = appCompatActivity;
        this.config = requestListUiConfig;
        setId(C12136f.request_list_view);
        FrameLayout.inflate(appCompatActivity, C12138h.zs_activity_request_list, this);
        this.sceneRoot = (ViewGroup) findViewById(C12136f.request_list_scene_root);
        LayoutInflater from = LayoutInflater.from(appCompatActivity);
        this.listSceneView = from.inflate(C12138h.zs_activity_request_list_scene_data, this.sceneRoot, false);
        View inflate = from.inflate(C12138h.zs_activity_request_list_scene_empty, this.sceneRoot, false);
        this.listScene = new C1233h(this.sceneRoot, this.listSceneView);
        this.emptyScene = new C1233h(this.sceneRoot, inflate);
        this.progressBar = (ViewAlmostRealProgressBar) findViewById(C12136f.request_list_progressBar);
        this.toolbar = (Toolbar) findViewById(C12136f.request_list_toolbar);
        this.rootLayout = (ViewGroup) findViewById(C12136f.request_list_coordinator_layout);
        this.createTicketFab = (FloatingActionButton) findViewById(C12136f.request_list_create_new_ticket_fab);
        this.logoImage = this.listSceneView.findViewById(C12136f.request_list_zendesk_logo);
        this.recyclerView = (RecyclerView) this.listSceneView.findViewById(C12136f.request_list_recycler);
        this.swipeRefreshLayout = (SwipeRefreshLayout) this.listSceneView.findViewById(C12136f.request_list_swipe_refresh_layout);
        this.startConversationButton = inflate.findViewById(C12136f.request_list_empty_start_conversation);
        this.swipeRefreshLayoutEmpty = (SwipeRefreshLayout) inflate.findViewById(C12136f.request_list_swipe_refresh_layout_empty);
        this.logoImageEmpty = inflate.findViewById(C12136f.request_list_zendesk_logo_empty);
        this.adapter = new RequestListAdapter(new OnItemClick() {
            public void onClick(RequestListItem requestListItem) {
                if (RequestListView.this.itemClickListener != null) {
                    RequestListView.this.itemClickListener.onClick(requestListItem);
                }
            }
        }, picasso);
        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(appCompatActivity, 1, false));
        this.recyclerView.mo5045a((C1074l) new C1120h(appCompatActivity, 1));
        this.recyclerView.setItemAnimator(new C1101f());
        this.createTicketFab.mo31049a();
        if (VERSION.SDK_INT >= 21) {
            View findViewById = findViewById(C12136f.request_list_compat_shadow);
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        int themeAttributeToColor = UiUtils.themeAttributeToColor(C12131a.colorAccent, getContext(), C12133c.zs_color_black);
        this.swipeRefreshLayout.setColorSchemeColors(themeAttributeToColor);
        this.swipeRefreshLayoutEmpty.setColorSchemeColors(themeAttributeToColor);
    }

    private void dismissSnackbar() {
        Snackbar snackbar2 = this.snackbar;
        if (snackbar2 != null) {
            snackbar2.mo31263b();
        }
        this.snackbar = null;
    }

    private boolean isShowingSnackBar() {
        Snackbar snackbar2 = this.snackbar;
        return snackbar2 != null && snackbar2.mo31272h();
    }

    public void announceAccessibility(int i) {
        announceForAccessibility(getResources().getString(i));
    }

    public void finish(String str) {
        if (C12017g.m31658b(str)) {
            Logger.m31608a("RequestListActivity", str, new Object[0]);
        }
        finish();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            boolean z = bundle.getBoolean("is_showing_snackbar");
            parcelable = bundle.getParcelable("request_list_view_superstate");
            if (z) {
                showErrorMessage();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("request_list_view_superstate", super.onSaveInstanceState());
        bundle.putBoolean("is_showing_snackbar", isShowingSnackBar());
        return bundle;
    }

    public void onStart() {
        this.isStopped = false;
    }

    public void onStop() {
        this.isStopped = true;
        dismissSnackbar();
    }

    public void setBackClickListener(OnClickListener onClickListener) {
        this.toolbar.setNavigationOnClickListener(onClickListener);
    }

    public void setCreateRequestListener(OnClickListener onClickListener) {
        this.createTicketFab.setOnClickListener(onClickListener);
        this.startConversationButton.setOnClickListener(onClickListener);
    }

    public void setItemClickListener(OnItemClick onItemClick) {
        this.itemClickListener = onItemClick;
    }

    public void setLoading(boolean z) {
        dismissSnackbar();
        if (this.isLoading != z) {
            if (z) {
                if (!this.swipeRefreshLayout.mo5843b() && !this.swipeRefreshLayoutEmpty.mo5843b()) {
                    announceAccessibility(C12140j.zs_request_list_content_loading_accessibility);
                    this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
                }
            } else if (this.swipeRefreshLayout.mo5843b() || this.swipeRefreshLayoutEmpty.mo5843b()) {
                this.swipeRefreshLayout.setRefreshing(false);
                this.swipeRefreshLayoutEmpty.setRefreshing(false);
            } else {
                this.progressBar.stop(300);
            }
        }
        this.isLoading = z;
    }

    public void setLogoClickListener(boolean z, OnClickListener onClickListener) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
            onClickListener = null;
        }
        this.logoImage.setVisibility(i);
        this.logoImageEmpty.setVisibility(i);
        this.logoImage.setOnClickListener(onClickListener);
        this.logoImageEmpty.setOnClickListener(onClickListener);
    }

    public void setRetryClickListener(OnClickListener onClickListener) {
        this.retryClickListener = onClickListener;
    }

    public void setSwipeRefreshListener(OnRefreshListener onRefreshListener) {
        this.swipeRefreshLayout.setOnRefreshListener(onRefreshListener);
        this.swipeRefreshLayoutEmpty.setOnRefreshListener(onRefreshListener);
    }

    public void showErrorMessage() {
        if (!this.isStopped && !isShowingSnackBar()) {
            announceAccessibility(C12140j.zs_request_list_content_load_failed_accessibility);
            Snackbar a = Snackbar.m27826a((View) this.rootLayout, C12140j.request_list_error_message, -2);
            a.mo31302a(C12140j.zendesk_retry_button_label, this.retryClickListener);
            this.snackbar = a;
            this.snackbar.mo31275k();
        }
    }

    public void showRequestList(List<RequestListItem> list) {
        dismissSnackbar();
        this.progressBar.stop(300);
        if (!C12010a.m31635a((Collection<Type>) list)) {
            this.adapter.swapRequests(list);
            this.progressBar.stop(300);
            if (this.sceneState != SceneState.LIST) {
                this.createTicketFab.mo31059c();
                if (this.listSceneView.getParent() == null) {
                    C1236k.m5971b(this.listScene, (Transition) this.fade);
                }
                announceAccessibility(C12140j.zs_request_list_content_loaded_accessibility);
                this.sceneState = SceneState.LIST;
            }
        } else if (this.sceneState != SceneState.EMPTY) {
            this.createTicketFab.mo31049a();
            C1236k.m5971b(this.emptyScene, (Transition) this.fade);
            announceAccessibility(C12140j.zs_request_list_content_loaded_empty_accessibility);
            this.sceneState = SceneState.EMPTY;
        }
    }

    public void startReferrerPage(String str) {
        this.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void startRequestActivity(Builder builder) {
        builder.show((Context) this.activity, this.config.getUiConfigs());
    }

    public void finish() {
        if (!this.activity.isFinishing()) {
            this.activity.finish();
        }
    }
}
