package zendesk.support;

import zendesk.support.guide.HelpCenterActivity;
import zendesk.support.guide.HelpCenterFragment;
import zendesk.support.guide.ViewArticleActivity;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;

public interface SupportSdkComponent {
    HelpCenterProvider helpCenterProvider();

    void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver);

    void inject(SdkDependencyProvider sdkDependencyProvider);

    void inject(HelpCenterActivity helpCenterActivity);

    void inject(HelpCenterFragment helpCenterFragment);

    void inject(ViewArticleActivity viewArticleActivity);

    RequestComponent plus(RequestModule requestModule);

    RequestListComponent plus(RequestListModule requestListModule);
}
