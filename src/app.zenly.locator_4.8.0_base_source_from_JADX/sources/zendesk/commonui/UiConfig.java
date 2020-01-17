package zendesk.commonui;

import java.io.Serializable;
import java.util.List;

public interface UiConfig extends Serializable {
    List<UiConfig> getUiConfigs();
}
