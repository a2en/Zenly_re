package zendesk.support.requestlist;

import com.squareup.picasso.Picasso;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.core.MemoryCache;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource.Disk;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;
import zendesk.support.requestlist.RequestInfoDataSource.Network;
import zendesk.support.requestlist.RequestInfoDataSource.RemoteDataSource;
import zendesk.support.requestlist.RequestInfoDataSource.Repository;

public class RequestListModule {
    private final RequestListActivity activity;
    private final RequestListUiConfig config;

    RequestListModule(RequestListActivity requestListActivity, RequestListUiConfig requestListUiConfig) {
        this.activity = requestListActivity;
        this.config = requestListUiConfig;
    }

    static RequestListModel model(Repository repository, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        return new RequestListModel(repository, memoryCache, supportBlipsProvider, supportSettingsProvider);
    }

    static RequestListPresenter presenter(RequestListView requestListView, RequestListModel requestListModel) {
        return new RequestListPresenter(requestListView, requestListModel);
    }

    static RequestListSyncHandler refreshHandler(RequestListPresenter requestListPresenter) {
        return new RequestListSyncHandler(requestListPresenter);
    }

    static Repository repository(LocalDataSource localDataSource, SupportUiStorage supportUiStorage, RequestProvider requestProvider, Executor executor, ExecutorService executorService) {
        return new Repository(localDataSource, new RemoteDataSource(new Network(requestProvider), new Disk(executor, executorService, supportUiStorage, "remote_request_infos")), new Merger());
    }

    /* access modifiers changed from: 0000 */
    public RequestListView view(Picasso picasso) {
        return new RequestListView(this.activity, this.config, picasso);
    }
}
