package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.e */
public class C8582e {

    /* renamed from: a */
    private final List<String> f22010a;

    /* renamed from: b */
    private KeyPathElement f22011b;

    public C8582e(String... strArr) {
        this.f22010a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public C8582e mo23166a(String str) {
        C8582e eVar = new C8582e(this);
        eVar.f22010a.add(str);
        return eVar;
    }

    /* renamed from: b */
    public int mo23168b(String str, int i) {
        if (m19905b(str)) {
            return 0;
        }
        if (!((String) this.f22010a.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.f22010a.size() - 1 && ((String) this.f22010a.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public boolean mo23169c(String str, int i) {
        if (m19905b(str)) {
            return true;
        }
        if (i >= this.f22010a.size()) {
            return false;
        }
        if (((String) this.f22010a.get(i)).equals(str) || ((String) this.f22010a.get(i)).equals("**") || ((String) this.f22010a.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo23170d(String str, int i) {
        boolean z = true;
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f22010a.size() - 1 && !((String) this.f22010a.get(i)).equals("**")) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f22010a);
        sb.append(",resolved=");
        sb.append(this.f22011b != null);
        sb.append('}');
        return sb.toString();
    }

    private C8582e(C8582e eVar) {
        this.f22010a = new ArrayList(eVar.f22010a);
        this.f22011b = eVar.f22011b;
    }

    /* renamed from: a */
    public C8582e mo23165a(KeyPathElement keyPathElement) {
        C8582e eVar = new C8582e(this);
        eVar.f22011b = keyPathElement;
        return eVar;
    }

    /* renamed from: b */
    private boolean m19905b(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public KeyPathElement mo23164a() {
        return this.f22011b;
    }

    /* renamed from: b */
    private boolean m19904b() {
        List<String> list = this.f22010a;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    /* renamed from: a */
    public boolean mo23167a(String str, int i) {
        boolean z = false;
        if (i >= this.f22010a.size()) {
            return false;
        }
        boolean z2 = i == this.f22010a.size() - 1;
        String str2 = (String) this.f22010a.get(i);
        if (!str2.equals("**")) {
            boolean z3 = str2.equals(str) || str2.equals("*");
            if ((z2 || (i == this.f22010a.size() - 2 && m19904b())) && z3) {
                z = true;
            }
            return z;
        }
        if (!z2 && ((String) this.f22010a.get(i + 1)).equals(str)) {
            if (i == this.f22010a.size() - 2 || (i == this.f22010a.size() - 3 && m19904b())) {
                z = true;
            }
            return z;
        } else if (z2) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f22010a.size() - 1) {
                return false;
            }
            return ((String) this.f22010a.get(i2)).equals(str);
        }
    }
}
