package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.d */
public class C0632d {

    /* renamed from: a */
    private final Object f2780a;

    /* renamed from: androidx.core.view.accessibility.d$a */
    static class C0633a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0632d f2781a;

        C0633a(C0632d dVar) {
            this.f2781a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0628c a = this.f2781a.mo3374a(i);
            if (a == null) {
                return null;
            }
            return a.mo3370t();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f2781a.mo3376a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C0628c) a.get(i2)).mo3370t());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f2781a.mo3377a(i, i2, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.d$b */
    static class C0634b extends C0633a {
        C0634b(C0632d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0628c b = this.f2781a.mo3378b(i);
            if (b == null) {
                return null;
            }
            return b.mo3370t();
        }
    }

    public C0632d() {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            this.f2780a = new C0634b(this);
        } else if (i >= 16) {
            this.f2780a = new C0633a(this);
        } else {
            this.f2780a = null;
        }
    }

    /* renamed from: a */
    public C0628c mo3374a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo3375a() {
        return this.f2780a;
    }

    /* renamed from: a */
    public List<C0628c> mo3376a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo3377a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0628c mo3378b(int i) {
        return null;
    }

    public C0632d(Object obj) {
        this.f2780a = obj;
    }
}
