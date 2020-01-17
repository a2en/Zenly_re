package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;

public class RequestListUiConfig implements UiConfig {
    private final List<UiConfig> uiConfigs;

    public static class Builder {
        /* access modifiers changed from: private */
        public List<UiConfig> uiConfigs = new ArrayList();

        private void setUiConfigs(List<UiConfig> list) {
            this.uiConfigs = list;
        }

        public UiConfig config() {
            return new RequestListUiConfig(this);
        }

        public Intent intent(Context context, UiConfig... uiConfigArr) {
            return intent(context, Arrays.asList(uiConfigArr));
        }

        public void show(Context context, List<UiConfig> list) {
            context.startActivity(intent(context, list));
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<UiConfig> list) {
            setUiConfigs(list);
            UiConfig config = config();
            Intent intent = new Intent(context, RequestListActivity.class);
            C13561l.m35895a(intent, config);
            return intent;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public List<UiConfig> getUiConfigs() {
        return C13561l.m35891a(this.uiConfigs, (UiConfig) this);
    }

    private RequestListUiConfig(Builder builder) {
        this.uiConfigs = builder.uiConfigs;
    }
}
