package zendesk.support.request;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import zendesk.suas.Store;

public final class RequestViewConversationsEnabled_MembersInjector implements MembersInjector<RequestViewConversationsEnabled> {
    public static void injectAf(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.f35239af = (ActionFactory) obj;
    }

    public static void injectCellFactory(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.cellFactory = (CellFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsEnabled requestViewConversationsEnabled, Picasso picasso) {
        requestViewConversationsEnabled.picasso = picasso;
    }

    public static void injectStore(RequestViewConversationsEnabled requestViewConversationsEnabled, Store store) {
        requestViewConversationsEnabled.store = store;
    }
}
