package zendesk.support;

import android.content.Context;
import java.util.Locale;

class SupportApplicationModule {
    private ApplicationScope applicationScope;

    SupportApplicationModule(ApplicationScope applicationScope2) {
        this.applicationScope = applicationScope2;
    }

    /* access modifiers changed from: 0000 */
    public Locale provideLocale() {
        return this.applicationScope.getLocale();
    }

    /* access modifiers changed from: 0000 */
    public SupportSdkMetadata provideMetadata(Context context) {
        return new SupportSdkMetadata(context);
    }

    /* access modifiers changed from: 0000 */
    public ZendeskTracker providesZendeskTracker() {
        return this.applicationScope.getZendeskTracker();
    }
}
