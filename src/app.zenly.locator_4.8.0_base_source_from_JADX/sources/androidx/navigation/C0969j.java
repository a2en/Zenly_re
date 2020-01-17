package androidx.navigation;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.p006u.C0999a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p214e.p228e.C7585h;

/* renamed from: androidx.navigation.j */
public class C0969j {

    /* renamed from: e */
    private final String f3706e;

    /* renamed from: f */
    private C0971k f3707f;

    /* renamed from: g */
    private int f3708g;

    /* renamed from: h */
    private String f3709h;

    /* renamed from: i */
    private CharSequence f3710i;

    /* renamed from: j */
    private ArrayList<C0967i> f3711j;

    /* renamed from: k */
    private C7585h<C0950c> f3712k;

    /* renamed from: l */
    private HashMap<String, C0953f> f3713l;

    /* renamed from: androidx.navigation.j$a */
    static class C0970a implements Comparable<C0970a> {

        /* renamed from: e */
        private final C0969j f3714e;

        /* renamed from: f */
        private final Bundle f3715f;

        /* renamed from: g */
        private final boolean f3716g;

        C0970a(C0969j jVar, Bundle bundle, boolean z) {
            this.f3714e = jVar;
            this.f3715f = bundle;
            this.f3716g = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0969j mo4738a() {
            return this.f3714e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Bundle mo4739b() {
            return this.f3715f;
        }

        /* renamed from: a */
        public int compareTo(C0970a aVar) {
            if (this.f3716g && !aVar.f3716g) {
                return 1;
            }
            if (this.f3716g || !aVar.f3716g) {
                return this.f3715f.size() - aVar.f3715f.size();
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public C0969j(Navigator<? extends C0969j> navigator) {
        this(C0996r.m4505a(navigator.getClass()));
    }

    /* renamed from: a */
    static String m4325a(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    /* renamed from: b */
    public final Map<String, C0953f> mo4731b() {
        HashMap<String, C0953f> hashMap = this.f3713l;
        if (hashMap == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo4733c() {
        if (this.f3709h == null) {
            this.f3709h = Integer.toString(this.f3708g);
        }
        return this.f3709h;
    }

    /* renamed from: d */
    public final int mo4734d() {
        return this.f3708g;
    }

    /* renamed from: e */
    public final String mo4735e() {
        return this.f3706e;
    }

    /* renamed from: f */
    public final C0971k mo4736f() {
        return this.f3707f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo4669g() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f3709h;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f3708g));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f3710i != null) {
            sb.append(" label=");
            sb.append(this.f3710i);
        }
        return sb.toString();
    }

    public C0969j(String str) {
        this.f3706e = str;
    }

    /* renamed from: b */
    public final void mo4732b(int i) {
        this.f3708g = i;
        this.f3709h = null;
    }

    /* renamed from: a */
    public void mo4664a(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0999a.Navigator);
        mo4732b(obtainAttributes.getResourceId(C0999a.Navigator_android_id, 0));
        this.f3709h = m4325a(context, this.f3708g);
        mo4727a(obtainAttributes.getText(C0999a.Navigator_android_label));
        obtainAttributes.recycle();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4726a(C0971k kVar) {
        this.f3707f = kVar;
    }

    /* renamed from: a */
    public final void mo4727a(CharSequence charSequence) {
        this.f3710i = charSequence;
    }

    /* renamed from: a */
    public final void mo4728a(String str) {
        if (this.f3711j == null) {
            this.f3711j = new ArrayList<>();
        }
        this.f3711j.add(new C0967i(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0970a mo4724a(Uri uri) {
        ArrayList<C0967i> arrayList = this.f3711j;
        C0970a aVar = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0967i iVar = (C0967i) it.next();
            Bundle a = iVar.mo4715a(uri, mo4731b());
            if (a != null) {
                C0970a aVar2 = new C0970a(this, a, iVar.mo4716a());
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo4730a() {
        ArrayDeque arrayDeque = new ArrayDeque();
        C0969j jVar = this;
        while (true) {
            C0971k f = jVar.mo4736f();
            if (f == 0 || f.mo4746i() != jVar.mo4734d()) {
                arrayDeque.addFirst(jVar);
            }
            if (f == 0) {
                break;
            }
            jVar = f;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((C0969j) it.next()).mo4734d();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: a */
    public final C0950c mo4723a(int i) {
        C7585h<C0950c> hVar = this.f3712k;
        C0950c cVar = hVar == null ? null : (C0950c) hVar.mo19617a(i);
        if (cVar != null) {
            return cVar;
        }
        if (mo4736f() != null) {
            return mo4736f().mo4723a(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo4725a(int i, C0950c cVar) {
        if (!mo4669g()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot add action ");
            sb.append(i);
            sb.append(" to ");
            sb.append(this);
            sb.append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            throw new UnsupportedOperationException(sb.toString());
        } else if (i != 0) {
            if (this.f3712k == null) {
                this.f3712k = new C7585h<>();
            }
            this.f3712k.mo19622c(i, cVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    /* renamed from: a */
    public final void mo4729a(String str, C0953f fVar) {
        if (this.f3713l == null) {
            this.f3713l = new HashMap<>();
        }
        this.f3713l.put(str, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bundle mo4722a(Bundle bundle) {
        if (bundle == null) {
            HashMap<String, C0953f> hashMap = this.f3713l;
            if (hashMap == null || hashMap.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C0953f> hashMap2 = this.f3713l;
        if (hashMap2 != null) {
            for (Entry entry : hashMap2.entrySet()) {
                ((C0953f) entry.getValue()).mo4685a((String) entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C0953f> hashMap3 = this.f3713l;
            if (hashMap3 != null) {
                for (Entry entry2 : hashMap3.entrySet()) {
                    if (!((C0953f) entry2.getValue()).mo4687b((String) entry2.getKey(), bundle)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Wrong argument type for '");
                        sb.append((String) entry2.getKey());
                        sb.append("' in argument bundle. ");
                        sb.append(((C0953f) entry2.getValue()).mo4686b().mo4770a());
                        sb.append(" expected.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle2;
    }
}
