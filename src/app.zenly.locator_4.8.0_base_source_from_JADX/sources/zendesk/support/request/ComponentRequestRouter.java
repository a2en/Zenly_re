package zendesk.support.request;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.C1236k;
import androidx.transition.Fade;
import androidx.transition.Transition;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import java.util.concurrent.atomic.AtomicReference;
import p333g.p384h.p385a.C12136f;
import zendesk.suas.C13622i;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;

class ComponentRequestRouter implements Listener<RequestScreen> {
    private final AppCompatActivity activity;
    private final RequestComponent component;
    private RequestView currentScreen;
    private final RequestViewConversationsDisabled disabledView;
    private final RequestViewConversationsEnabled enabledView;
    private final boolean isCleanStart;
    private final RequestViewLoading loadingView;
    private final ViewGroup root;
    private final AtomicReference<RequestScreen> screen = new AtomicReference<>();

    /* renamed from: zendesk.support.request.ComponentRequestRouter$1 */
    static /* synthetic */ class C137701 {

        /* renamed from: $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen */
        static final /* synthetic */ int[] f35219xa0706e24 = new int[RequestScreen.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                zendesk.support.request.ComponentRequestRouter$RequestScreen[] r0 = zendesk.support.request.ComponentRequestRouter.RequestScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35219xa0706e24 = r0
                int[] r0 = f35219xa0706e24     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.Loading     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f35219xa0706e24     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.EmailForm     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f35219xa0706e24     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.Conversation     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f35219xa0706e24     // Catch:{ NoSuchFieldError -> 0x0035 }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.Fin     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ComponentRequestRouter.C137701.<clinit>():void");
        }
    }

    static class RequestRouterSelector implements StateSelector<RequestScreen> {
        RequestRouterSelector() {
        }

        public RequestScreen selectData(C13622i iVar) {
            StateConfig fromState = StateConfig.fromState(iVar);
            StateConversation fromState2 = StateConversation.fromState(iVar);
            StateSettings settings = fromState.getSettings();
            StateError fromState3 = StateError.fromState(iVar);
            boolean hasSettings = settings.hasSettings();
            boolean b = C12017g.m31658b(fromState2.getRemoteId());
            boolean isConversationsEnabled = settings.isConversationsEnabled();
            boolean hasIdentityEmailAddress = settings.hasIdentityEmailAddress();
            boolean isNeverRequestEmailOn = settings.isNeverRequestEmailOn();
            String str = "RequestActivity";
            if (fromState3.getState() == ErrorType.NoAccess) {
                Logger.m31610b(str, "Network returned 'No Access'. Ticket is not longer valid. Error: '%s'", fromState3.getMessage());
                return RequestScreen.Fin;
            } else if (!hasSettings) {
                return RequestScreen.Loading;
            } else {
                if (isConversationsEnabled) {
                    return RequestScreen.Conversation;
                }
                if (b) {
                    Logger.m31614d(str, "Conversations are disabled. Exiting RequestActivity", new Object[0]);
                    return RequestScreen.Fin;
                } else if (hasIdentityEmailAddress || !isNeverRequestEmailOn) {
                    return RequestScreen.EmailForm;
                } else {
                    Logger.m31614d(str, "Conversations are disabled, never request email is enabled, with this configuration tickets would go into a black hole. Exiting RequestActivity.", new Object[0]);
                    return RequestScreen.Fin;
                }
            }
        }
    }

    enum RequestScreen {
        Loading,
        EmailForm,
        Conversation,
        Fin
    }

    ComponentRequestRouter(AppCompatActivity appCompatActivity, ViewGroup viewGroup, RequestViewConversationsDisabled requestViewConversationsDisabled, RequestViewConversationsEnabled requestViewConversationsEnabled, RequestViewLoading requestViewLoading, RequestComponent requestComponent, boolean z) {
        this.activity = appCompatActivity;
        this.root = viewGroup;
        this.disabledView = requestViewConversationsDisabled;
        this.enabledView = requestViewConversationsEnabled;
        this.loadingView = requestViewLoading;
        this.component = requestComponent;
        this.isCleanStart = z;
    }

    static ComponentRequestRouter create(AppCompatActivity appCompatActivity, boolean z, RequestComponent requestComponent) {
        ComponentRequestRouter componentRequestRouter = new ComponentRequestRouter(appCompatActivity, (ViewGroup) appCompatActivity.findViewById(C12136f.activity_request_root), (RequestViewConversationsDisabled) appCompatActivity.findViewById(C12136f.activity_request_conversation_disabled), (RequestViewConversationsEnabled) appCompatActivity.findViewById(C12136f.activity_request_conversation), (RequestViewLoading) appCompatActivity.findViewById(C12136f.activity_request_loading), requestComponent, z);
        return componentRequestRouter;
    }

    private void displayView(View view, View... viewArr) {
        C1236k.m5968a(this.root, (Transition) new Fade());
        view.setVisibility(0);
        for (View visibility : viewArr) {
            visibility.setVisibility(8);
        }
        this.activity.invalidateOptionsMenu();
        C1236k.m5967a(this.root);
    }

    /* access modifiers changed from: 0000 */
    public RequestView getCurrentScreen() {
        return this.currentScreen;
    }

    /* access modifiers changed from: 0000 */
    public StateSelector<RequestScreen> getSelector() {
        return new RequestRouterSelector();
    }

    public void update(RequestScreen requestScreen) {
        if (this.screen.getAndSet(requestScreen) != requestScreen) {
            int i = C137701.f35219xa0706e24[requestScreen.ordinal()];
            String str = "RequestActivity";
            if (i == 1) {
                Logger.m31608a(str, "Installing screen: 'Loading Screen'", new Object[0]);
                RequestViewLoading requestViewLoading = this.loadingView;
                this.currentScreen = requestViewLoading;
                displayView(requestViewLoading, this.disabledView, this.enabledView);
            } else if (i == 2) {
                Logger.m31608a(str, "Installing screen: 'Conversations Disabled Screen'", new Object[0]);
                RequestViewConversationsDisabled requestViewConversationsDisabled = this.disabledView;
                this.currentScreen = requestViewConversationsDisabled;
                displayView(requestViewConversationsDisabled, this.enabledView, this.loadingView);
                this.disabledView.init(this.component);
            } else if (i == 3) {
                Logger.m31608a(str, "Installing screen: 'Conversations Enabled Screen'", new Object[0]);
                RequestViewConversationsEnabled requestViewConversationsEnabled = this.enabledView;
                this.currentScreen = requestViewConversationsEnabled;
                displayView(requestViewConversationsEnabled, this.disabledView, this.loadingView);
                this.enabledView.init(this.component, this.isCleanStart);
            } else if (i == 4) {
                Logger.m31608a(str, "Installing screen: 'Finish'", new Object[0]);
                this.activity.finish();
            }
        }
    }
}
