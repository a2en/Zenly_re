package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;

class ActionLoadSettings implements AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final AuthenticationProvider authProvider;
    private final SupportSettingsProvider settingsProvider;

    ActionLoadSettings(ActionFactory actionFactory2, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider) {
        this.actionFactory = actionFactory2;
        this.settingsProvider = supportSettingsProvider;
        this.authProvider = authenticationProvider;
    }

    /* access modifiers changed from: private */
    public StateSettings constructSettings(SupportSdkSettings supportSdkSettings) {
        Identity identity = this.authProvider.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return StateSettings.fromSupportSettings(supportSdkSettings, true, true);
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        return StateSettings.fromSupportSettings(supportSdkSettings, C12017g.m31658b(anonymousIdentity.getEmail()), C12017g.m31658b(anonymousIdentity.getName()));
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadSettings());
    }

    public void execute(final Dispatcher dispatcher, GetState getState, final Callback callback) {
        this.settingsProvider.getSettings(new C12008e<SupportSdkSettings>() {
            public void onError(ErrorResponse errorResponse) {
                Logger.m31614d("RequestActivity", "Error loading settings. Error: '%s'", errorResponse.getReason());
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsError(errorResponse));
                callback.done();
            }

            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsSuccess(ActionLoadSettings.this.constructSettings(supportSdkSettings)));
                callback.done();
            }
        });
    }
}
