package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.Navigator.C0945a;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.r */
public class C0996r {

    /* renamed from: b */
    private static final HashMap<Class<?>, String> f3758b = new HashMap<>();

    /* renamed from: a */
    private final HashMap<String, Navigator<? extends C0969j>> f3759a = new HashMap<>();

    /* renamed from: a */
    static String m4505a(Class<? extends Navigator> cls) {
        String str = (String) f3758b.get(cls);
        if (str == null) {
            C0945a aVar = (C0945a) cls.getAnnotation(C0945a.class);
            str = aVar != null ? aVar.value() : null;
            if (m4506b(str)) {
                f3758b.put(cls, str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No @Navigator.Name annotation found for ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return str;
    }

    /* renamed from: b */
    private static boolean m4506b(String str) {
        return str != null && !str.isEmpty();
    }

    /* renamed from: a */
    public <T extends Navigator<?>> T mo4797a(String str) {
        if (m4506b(str)) {
            T t = (Navigator) this.f3759a.get(str);
            if (t != null) {
                return t;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find Navigator with name \"");
            sb.append(str);
            sb.append("\". You must call NavController.addNavigator() for each navigation type.");
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: a */
    public final Navigator<? extends C0969j> mo4796a(Navigator<? extends C0969j> navigator) {
        return mo4798a(m4505a(navigator.getClass()), navigator);
    }

    /* renamed from: a */
    public Navigator<? extends C0969j> mo4798a(String str, Navigator<? extends C0969j> navigator) {
        if (m4506b(str)) {
            return (Navigator) this.f3759a.put(str, navigator);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, Navigator<? extends C0969j>> mo4799a() {
        return this.f3759a;
    }
}
