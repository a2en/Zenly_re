package zendesk.support.request;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
import zendesk.suas.Store;

public final class RequestActivity_MembersInjector implements MembersInjector<RequestActivity> {
    public static void injectActionHandlerRegistry(RequestActivity requestActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAf(RequestActivity requestActivity, Object obj) {
        requestActivity.f35237af = (ActionFactory) obj;
    }

    public static void injectHeadlessComponentListener(RequestActivity requestActivity, Object obj) {
        requestActivity.headlessComponentListener = (HeadlessComponentListener) obj;
    }

    public static void injectPicasso(RequestActivity requestActivity, Picasso picasso) {
        requestActivity.picasso = picasso;
    }

    public static void injectStore(RequestActivity requestActivity, Store store) {
        requestActivity.store = store;
    }
}
