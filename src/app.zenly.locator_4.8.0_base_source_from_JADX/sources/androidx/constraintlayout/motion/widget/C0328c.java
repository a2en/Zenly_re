package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0467a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.c */
public abstract class C0328c {

    /* renamed from: e */
    public static int f1473e = -1;

    /* renamed from: a */
    int f1474a;

    /* renamed from: b */
    int f1475b;

    /* renamed from: c */
    String f1476c = null;

    /* renamed from: d */
    HashMap<String, C0467a> f1477d;

    public C0328c() {
        int i = f1473e;
        this.f1474a = i;
        this.f1475b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo2306a(Context context, AttributeSet attributeSet);

    /* renamed from: a */
    public abstract void mo2307a(HashMap<String, C0369s> hashMap);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo2308a(HashSet<String> hashSet);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2309a(String str) {
        String str2 = this.f1476c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: b */
    public void mo2310b(HashMap<String, Integer> hashMap) {
    }
}
