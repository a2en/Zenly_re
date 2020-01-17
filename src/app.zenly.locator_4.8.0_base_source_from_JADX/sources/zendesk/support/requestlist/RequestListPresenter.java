package zendesk.support.requestlist;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import com.zendesk.service.C12007d;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import java.util.List;
import zendesk.support.SupportSdkSettings;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestUiConfig.Builder;

class RequestListPresenter {
    private final CancelableCompositeCallback callbacks = new CancelableCompositeCallback();
    /* access modifiers changed from: private */
    public final RequestListModel model;
    /* access modifiers changed from: private */
    public final RequestListView view;

    private interface SettingsCallback {
        void onSettings(SupportSdkSettings supportSdkSettings);
    }

    public RequestListPresenter(RequestListView requestListView, RequestListModel requestListModel) {
        this.view = requestListView;
        this.model = requestListModel;
    }

    private void createTicketClicks(final RequestListView requestListView) {
        requestListView.setCreateRequestListener(new OnClickListener(this) {
            public void onClick(View view) {
                requestListView.startRequestActivity(RequestActivity.builder());
            }
        });
    }

    private void errorClicks(RequestListView requestListView) {
        requestListView.setRetryClickListener(new OnClickListener() {
            public void onClick(View view) {
                RequestListPresenter.this.refresh();
            }
        });
    }

    private void itemClicks(final RequestListView requestListView) {
        requestListView.setItemClickListener(new OnItemClick(this) {
            public void onClick(RequestListItem requestListItem) {
                Builder builder = RequestActivity.builder();
                RequestListView requestListView = requestListView;
                requestListItem.configure(builder);
                requestListView.startRequestActivity(builder);
            }
        });
    }

    /* access modifiers changed from: private */
    public void loadItems(boolean z, SupportSdkSettings supportSdkSettings) {
        C138253 r0 = new C12008e<List<RequestListItem>>() {
            public void onError(ErrorResponse errorResponse) {
                RequestListPresenter.this.view.setLoading(false);
                RequestListPresenter.this.view.showErrorMessage();
            }

            public void onSuccess(List<RequestListItem> list) {
                RequestListPresenter.this.view.showRequestList(list);
                RequestListPresenter.this.view.setLoading(false);
            }
        };
        this.callbacks.add(C12007d.m31622a(r0));
        this.view.setLoading(true);
        this.model.loadItems(z, supportSdkSettings, r0);
    }

    private void loadSettings(SettingsCallback settingsCallback) {
        SupportSdkSettings cachedSettings = this.model.getCachedSettings();
        if (cachedSettings == null) {
            networkSettings(settingsCallback);
        } else {
            settingsCallback.onSettings(cachedSettings);
        }
    }

    /* access modifiers changed from: private */
    public void logoClicks(final RequestListView requestListView, boolean z, final String str) {
        requestListView.setLogoClickListener(z, new OnClickListener(this) {
            public void onClick(View view) {
                requestListView.startReferrerPage(str);
            }
        });
    }

    private void navigationClicks(final RequestListView requestListView) {
        requestListView.setBackClickListener(new OnClickListener(this) {
            public void onClick(View view) {
                requestListView.finish();
            }
        });
    }

    private void networkSettings(final SettingsCallback settingsCallback) {
        C12007d a = C12007d.m31622a(new C12008e<SupportSdkSettings>() {
            public void onError(ErrorResponse errorResponse) {
                settingsCallback.onSettings(null);
                RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
            }

            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                RequestListPresenter.this.model.cacheSupportSdkSettings(supportSdkSettings);
                settingsCallback.onSettings(supportSdkSettings);
            }
        });
        this.callbacks.add(a);
        this.view.setLoading(true);
        this.model.loadSettings(a);
    }

    private void pullToRefresh(RequestListView requestListView) {
        requestListView.setSwipeRefreshListener(new OnRefreshListener() {
            public void onRefresh() {
                RequestListPresenter.this.refresh();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void onCreate(final boolean z) {
        itemClicks(this.view);
        pullToRefresh(this.view);
        navigationClicks(this.view);
        errorClicks(this.view);
        createTicketClicks(this.view);
        loadSettings(new SettingsCallback() {
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings == null || !supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                    return;
                }
                RequestListPresenter requestListPresenter = RequestListPresenter.this;
                requestListPresenter.logoClicks(requestListPresenter.view, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl());
                RequestListPresenter.this.loadItems(z, supportSdkSettings);
                if (z) {
                    RequestListPresenter.this.model.trackRequestListViewed();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void onDestroy(boolean z) {
        if (!z) {
            this.model.cleanup();
        }
        this.callbacks.cancel();
    }

    /* access modifiers changed from: 0000 */
    public void refresh() {
        loadSettings(new SettingsCallback() {
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings == null || !supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                } else {
                    RequestListPresenter.this.loadItems(true, supportSdkSettings);
                }
            }
        });
    }
}
