package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.m */
public class C0873m {

    /* renamed from: a */
    private Map<String, Integer> f3479a = new HashMap();

    /* renamed from: a */
    public boolean mo4453a(String str, int i) {
        Integer num = (Integer) this.f3479a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.f3479a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
