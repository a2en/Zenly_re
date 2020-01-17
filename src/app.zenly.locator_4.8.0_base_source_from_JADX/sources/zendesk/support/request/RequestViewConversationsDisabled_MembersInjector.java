package zendesk.support.request;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import zendesk.suas.Store;

public final class RequestViewConversationsDisabled_MembersInjector implements MembersInjector<RequestViewConversationsDisabled> {
    public static void injectAf(RequestViewConversationsDisabled requestViewConversationsDisabled, Object obj) {
        requestViewConversationsDisabled.f35238af = (ActionFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsDisabled requestViewConversationsDisabled, Picasso picasso) {
        requestViewConversationsDisabled.picasso = picasso;
    }

    public static void injectStore(RequestViewConversationsDisabled requestViewConversationsDisabled, Store store) {
        requestViewConversationsDisabled.store = store;
    }
}
