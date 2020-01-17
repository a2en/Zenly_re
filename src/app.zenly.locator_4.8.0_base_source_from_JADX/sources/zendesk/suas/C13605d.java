package zendesk.suas;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: zendesk.suas.d */
public class C13605d implements Subscription {

    /* renamed from: a */
    private final Collection<Subscription> f35141a;

    private C13605d(Collection<Subscription> collection) {
        this.f35141a = collection;
    }

    /* renamed from: a */
    public static Subscription m35914a(Subscription... subscriptionArr) {
        return new C13605d(Arrays.asList(subscriptionArr));
    }

    public void addListener() {
        for (Subscription addListener : this.f35141a) {
            addListener.addListener();
        }
    }

    public void informWithCurrentState() {
        for (Subscription informWithCurrentState : this.f35141a) {
            informWithCurrentState.informWithCurrentState();
        }
    }

    public void removeListener() {
        for (Subscription removeListener : this.f35141a) {
            removeListener.removeListener();
        }
    }
}
