package zendesk.support.requestlist;

import com.zendesk.func.ZFunc1;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import java.util.List;
import zendesk.core.MemoryCache;
import zendesk.support.AggregatedCallback;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;

class RequestListModel {
    private final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final MemoryCache cache;
    /* access modifiers changed from: private */
    public final ZFunc1<RequestInfo, RequestListItem> mapper = new ZFunc1<RequestInfo, RequestListItem>(this) {
        public RequestListItem apply(RequestInfo requestInfo) {
            return new RequestListItem(requestInfo);
        }
    };
    private final RequestInfoDataSource requestInfoDataSource;
    private final AggregatedCallback<SupportSdkSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    private final SupportSettingsProvider settingsProvider;

    RequestListModel(RequestInfoDataSource requestInfoDataSource2, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        this.requestInfoDataSource = requestInfoDataSource2;
        this.cache = memoryCache;
        this.blipsProvider = supportBlipsProvider;
        this.settingsProvider = supportSettingsProvider;
    }

    /* access modifiers changed from: private */
    public List<RequestInfo> filterClosedRequests(List<RequestInfo> list, boolean z) {
        return z ? list : C12010a.m31630a(list, new ZFunc1<RequestInfo, Boolean>(this) {
            public Boolean apply(RequestInfo requestInfo) {
                return Boolean.valueOf(!requestInfo.isClosed());
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void cacheSupportSdkSettings(SupportSdkSettings supportSdkSettings) {
        this.cache.put("request_list_settings", supportSdkSettings);
    }

    /* access modifiers changed from: 0000 */
    public void cleanup() {
        this.cache.remove("request_list_settings");
        this.cache.remove("request_list_items");
    }

    /* access modifiers changed from: 0000 */
    public List<RequestListItem> getCachedRequestInfos() {
        return (List) this.cache.get("request_list_items");
    }

    /* access modifiers changed from: 0000 */
    public SupportSdkSettings getCachedSettings() {
        return (SupportSdkSettings) this.cache.get("request_list_settings");
    }

    /* access modifiers changed from: 0000 */
    public void loadItems(boolean z, final SupportSdkSettings supportSdkSettings, final C12008e<List<RequestListItem>> eVar) {
        if (z || getCachedRequestInfos() == null) {
            this.requestInfoDataSource.load(new C12008e<List<RequestInfo>>() {
                public void onError(ErrorResponse errorResponse) {
                    eVar.onError(errorResponse);
                }

                public void onSuccess(List<RequestInfo> list) {
                    List b = C12010a.m31637b(RequestListModel.this.filterClosedRequests(list, supportSdkSettings.isShowClosedRequests()), RequestListModel.this.mapper);
                    RequestListModel.this.cache.put("request_list_items", b);
                    eVar.onSuccess(b);
                }
            });
        } else {
            eVar.onSuccess(getCachedRequestInfos());
        }
    }

    /* access modifiers changed from: 0000 */
    public void loadSettings(C12008e<SupportSdkSettings> eVar) {
        if (this.settingsAggregatedCallback.add(eVar)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* access modifiers changed from: 0000 */
    public void trackRequestListViewed() {
        this.blipsProvider.requestListViewed();
    }
}
