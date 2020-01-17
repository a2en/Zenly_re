package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.support.IdUtil;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportUiStorage;

class ActionInstallConfiguration implements AsyncAction {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f35207af;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    private final Executor executor;
    /* access modifiers changed from: private */
    public final Executor mainThreadExecutor;
    /* access modifiers changed from: private */
    public final RequestUiConfig startConfig;
    /* access modifiers changed from: private */
    public final SupportUiStorage supportUiStorage;

    ActionInstallConfiguration(SupportUiStorage supportUiStorage2, RequestUiConfig requestUiConfig, Executor executor2, Executor executor3, ActionFactory actionFactory, SupportBlipsProvider supportBlipsProvider) {
        this.supportUiStorage = supportUiStorage2;
        this.startConfig = requestUiConfig;
        this.executor = executor2;
        this.mainThreadExecutor = executor3;
        this.f35207af = actionFactory;
        this.blipsProvider = supportBlipsProvider;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    public void execute(final Dispatcher dispatcher, GetState getState, final Callback callback) {
        this.executor.execute(new Runnable() {
            public void run() {
                boolean b = C12017g.m31658b(ActionInstallConfiguration.this.startConfig.getRequestId());
                boolean b2 = C12017g.m31658b(ActionInstallConfiguration.this.startConfig.getLocalRequestId());
                String requestId = ActionInstallConfiguration.this.startConfig.getRequestId();
                String localRequestId = ActionInstallConfiguration.this.startConfig.getLocalRequestId();
                if (!b || !b2) {
                    RequestIdMapper requestIdMapper = (RequestIdMapper) ActionInstallConfiguration.this.supportUiStorage.read("request_id_mapper", RequestIdMapper.class);
                    if (requestIdMapper != null) {
                        if (b2) {
                            requestId = requestIdMapper.getRemoteId(localRequestId);
                        } else if (b) {
                            localRequestId = requestIdMapper.getLocalId(requestId);
                        }
                    }
                    if (!C12017g.m31658b(localRequestId)) {
                        localRequestId = IdUtil.newStringId();
                    }
                }
                String str = requestId;
                String str2 = localRequestId;
                if (C12017g.m31658b(str)) {
                    ActionInstallConfiguration.this.blipsProvider.requestViewed(str);
                }
                Logger.m31608a("RequestActivity", "Request information loaded from disk. Remote id: '%s'. Local id: '%s'", str, str2);
                final RequestUiConfig requestUiConfig = new RequestUiConfig(ActionInstallConfiguration.this.startConfig.getRequestSubject(), ActionInstallConfiguration.this.startConfig.getTags(), str, str2, ActionInstallConfiguration.this.startConfig.getRequestStatus(), ActionInstallConfiguration.this.startConfig.getTicketForm(), C12017g.m31659c(str) ? ActionInstallConfiguration.this.startConfig.getFiles() : new ArrayList(), ActionInstallConfiguration.this.startConfig.hasAgentReplies(), ActionInstallConfiguration.this.startConfig.getUiConfigs());
                ActionInstallConfiguration.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        C137351 r0 = C137351.this;
                        dispatcher.dispatch(ActionInstallConfiguration.this.f35207af.startConfig(requestUiConfig));
                        callback.done();
                    }
                });
            }
        });
    }
}
