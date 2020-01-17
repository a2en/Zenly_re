package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.n */
public class C1241n {

    /* renamed from: a */
    public final Map<String, Object> f4645a = new HashMap();

    /* renamed from: b */
    public View f4646b;

    /* renamed from: c */
    final ArrayList<Transition> f4647c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj instanceof C1241n) {
            C1241n nVar = (C1241n) obj;
            if (this.f4646b == nVar.f4646b && this.f4645a.equals(nVar.f4645a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f4646b.hashCode() * 31) + this.f4645a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f4646b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.f4645a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.f4645a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }
}
