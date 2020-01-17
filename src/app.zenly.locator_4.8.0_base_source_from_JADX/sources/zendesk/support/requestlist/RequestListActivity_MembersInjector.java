package zendesk.support.requestlist;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;

public final class RequestListActivity_MembersInjector implements MembersInjector<RequestListActivity> {
    public static void injectActionHandlerRegistry(RequestListActivity requestListActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestListActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectModel(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.model = (RequestListModel) obj;
    }

    public static void injectPresenter(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.presenter = (RequestListPresenter) obj;
    }

    public static void injectSyncHandler(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.syncHandler = (RequestListSyncHandler) obj;
    }

    public static void injectView(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.view = (RequestListView) obj;
    }
}
