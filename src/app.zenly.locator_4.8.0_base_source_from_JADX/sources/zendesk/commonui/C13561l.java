package zendesk.commonui;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: zendesk.commonui.l */
public class C13561l {

    /* renamed from: a */
    private static String f35117a = "ZENDESK_UI_CONFIG";

    /* renamed from: a */
    public static void m35895a(Intent intent, UiConfig uiConfig) {
        intent.putExtra(f35117a, uiConfig);
    }

    /* renamed from: a */
    public static void m35896a(Bundle bundle, UiConfig uiConfig) {
        bundle.putSerializable(f35117a, uiConfig);
    }

    /* renamed from: a */
    public static void m35897a(Map<String, Object> map, UiConfig uiConfig) {
        map.put(f35117a, uiConfig);
    }

    /* renamed from: a */
    public static <E extends UiConfig> E m35892a(Bundle bundle, Class<E> cls) {
        if (bundle != null && bundle.containsKey(f35117a)) {
            E serializable = bundle.getSerializable(f35117a);
            if (cls.isInstance(serializable)) {
                return (UiConfig) serializable;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <E extends UiConfig> E m35894a(Map<String, Object> map, Class<E> cls) {
        if (map != null && map.containsKey(f35117a)) {
            E e = map.get(f35117a);
            if (cls.isInstance(e)) {
                return (UiConfig) e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <E extends UiConfig> E m35893a(List<UiConfig> list, Class<E> cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E e = (UiConfig) it.next();
            if (cls.isInstance(e)) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<UiConfig> m35891a(List<UiConfig> list, UiConfig uiConfig) {
        ArrayList arrayList = new ArrayList(list);
        if (m35893a(list, uiConfig.getClass()) == null) {
            arrayList.add(uiConfig);
        }
        return arrayList;
    }
}
