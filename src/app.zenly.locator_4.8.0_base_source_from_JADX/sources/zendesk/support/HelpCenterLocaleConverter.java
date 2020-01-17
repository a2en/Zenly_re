package zendesk.support;

import com.zendesk.util.C12017g;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HelpCenterLocaleConverter {
    private static final Map<String, String> forwardLookupMap = new HashMap();

    static {
        forwardLookupMap.put("iw", "he");
        forwardLookupMap.put("nb", "no");
        forwardLookupMap.put("in", "id");
        forwardLookupMap.put("ji", "yi");
    }

    public String toHelpCenterLocaleString(Locale locale) {
        if (!(locale != null && C12017g.m31658b(locale.getLanguage()))) {
            locale = Locale.getDefault();
        }
        String str = (String) forwardLookupMap.get(locale.getLanguage());
        if (!C12017g.m31658b(str)) {
            str = locale.getLanguage();
        }
        StringBuilder sb = new StringBuilder(str);
        if (C12017g.m31658b(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        return sb.toString().toLowerCase();
    }
}
