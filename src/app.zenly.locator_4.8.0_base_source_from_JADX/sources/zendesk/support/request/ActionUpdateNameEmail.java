package zendesk.support.request;

import com.zendesk.util.C12017g;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AnonymousIdentity.Builder;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;

class ActionUpdateNameEmail implements AsyncAction {
    private final AuthenticationProvider authenticationProvider;
    private final String email;
    private final String name;

    /* renamed from: zendesk reason: collision with root package name */
    private final Zendesk f35255zendesk;

    ActionUpdateNameEmail(String str, String str2, AuthenticationProvider authenticationProvider2, Zendesk zendesk2) {
        this.name = str;
        this.email = str2;
        this.authenticationProvider = authenticationProvider2;
        this.f35255zendesk = zendesk2;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    public void execute(Dispatcher dispatcher, GetState getState, Callback callback) {
        Identity identity = this.authenticationProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            if (C12017g.m31658b(this.email) && !this.email.equals(anonymousIdentity.getEmail())) {
                Builder builder = new Builder();
                builder.withEmailIdentifier(this.email);
                builder.withNameIdentifier(anonymousIdentity.getName());
                anonymousIdentity = (AnonymousIdentity) builder.build();
            }
            if (C12017g.m31658b(this.name) && !this.name.equals(anonymousIdentity.getName())) {
                Builder builder2 = new Builder();
                builder2.withEmailIdentifier(anonymousIdentity.getEmail());
                builder2.withNameIdentifier(this.name);
                anonymousIdentity = (AnonymousIdentity) builder2.build();
            }
            if (anonymousIdentity != identity) {
                this.f35255zendesk.setIdentity(anonymousIdentity);
            }
        }
        callback.done();
    }
}
