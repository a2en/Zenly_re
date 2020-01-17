package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C0969j;
import androidx.navigation.Navigator;
import androidx.navigation.Navigator.C0945a;
import androidx.navigation.Navigator.Extras;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@C0945a("fragment")
/* renamed from: androidx.navigation.fragment.b */
public class C0958b extends Navigator<C0959a> {

    /* renamed from: a */
    private final Context f3679a;

    /* renamed from: b */
    private final FragmentManager f3680b;

    /* renamed from: c */
    private final int f3681c;

    /* renamed from: d */
    private ArrayDeque<Integer> f3682d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.b$a */
    public static class C0959a extends C0969j {

        /* renamed from: m */
        private String f3683m;

        public C0959a(Navigator<? extends C0959a> navigator) {
            super(navigator);
        }

        /* renamed from: a */
        public void mo4664a(Context context, AttributeSet attributeSet) {
            super.mo4664a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0962d.FragmentNavigator);
            String string = obtainAttributes.getString(C0962d.FragmentNavigator_android_name);
            if (string != null) {
                mo4703b(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: b */
        public final C0959a mo4703b(String str) {
            this.f3683m = str;
            return this;
        }

        /* renamed from: h */
        public final String mo4704h() {
            String str = this.f3683m;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f3683m;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /* renamed from: androidx.navigation.fragment.b$b */
    public static final class C0960b implements Extras {

        /* renamed from: a */
        private final LinkedHashMap<View, String> f3684a;

        /* renamed from: a */
        public Map<View, String> mo4705a() {
            return Collections.unmodifiableMap(this.f3684a);
        }
    }

    public C0958b(Context context, FragmentManager fragmentManager, int i) {
        this.f3679a = context;
        this.f3680b = fragmentManager;
        this.f3681c = i;
    }

    /* renamed from: b */
    public Bundle mo4656b() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f3682d.size()];
        Iterator it = this.f3682d.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: c */
    public boolean mo4657c() {
        if (this.f3682d.isEmpty()) {
            return false;
        }
        if (this.f3680b.mo4130x()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f3680b.mo4077a(m4291a(this.f3682d.size(), ((Integer) this.f3682d.peekLast()).intValue()), 1);
        this.f3682d.removeLast();
        return true;
    }

    /* renamed from: a */
    public C0959a m4294a() {
        return new C0959a(this);
    }

    @Deprecated
    /* renamed from: a */
    public Fragment mo4701a(Context context, FragmentManager fragmentManager, String str, Bundle bundle) {
        return fragmentManager.mo4120p().mo4142a(context.getClassLoader(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C0969j mo4654a(androidx.navigation.fragment.C0958b.C0959a r9, android.os.Bundle r10, androidx.navigation.C0976o r11, androidx.navigation.Navigator.Extras r12) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentManager r0 = r8.f3680b
            boolean r0 = r0.mo4130x()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r9 = "FragmentNavigator"
            java.lang.String r10 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r9, r10)
            return r1
        L_0x0011:
            java.lang.String r0 = r9.mo4704h()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x0033
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.f3679a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0033:
            android.content.Context r3 = r8.f3679a
            androidx.fragment.app.FragmentManager r4 = r8.f3680b
            androidx.fragment.app.Fragment r0 = r8.mo4701a(r3, r4, r0, r10)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.f3680b
            androidx.fragment.app.o r10 = r10.mo4084b()
            r3 = -1
            if (r11 == 0) goto L_0x004c
            int r4 = r11.mo4753a()
            goto L_0x004d
        L_0x004c:
            r4 = -1
        L_0x004d:
            if (r11 == 0) goto L_0x0054
            int r5 = r11.mo4754b()
            goto L_0x0055
        L_0x0054:
            r5 = -1
        L_0x0055:
            if (r11 == 0) goto L_0x005c
            int r6 = r11.mo4755c()
            goto L_0x005d
        L_0x005c:
            r6 = -1
        L_0x005d:
            if (r11 == 0) goto L_0x0064
            int r7 = r11.mo4756d()
            goto L_0x0065
        L_0x0064:
            r7 = -1
        L_0x0065:
            if (r4 != r3) goto L_0x006d
            if (r5 != r3) goto L_0x006d
            if (r6 != r3) goto L_0x006d
            if (r7 == r3) goto L_0x0080
        L_0x006d:
            if (r4 == r3) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r5 == r3) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r6 == r3) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r7 == r3) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            r10.mo4310a(r4, r5, r6, r7)
        L_0x0080:
            int r3 = r8.f3681c
            r10.mo4320b(r3, r0)
            r10.mo4195e(r0)
            int r0 = r9.mo4734d()
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.f3682d
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r11 == 0) goto L_0x00ad
            if (r3 != 0) goto L_0x00ad
            boolean r11 = r11.mo4759g()
            if (r11 == 0) goto L_0x00ad
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f3682d
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00ad
            r11 = 1
            goto L_0x00ae
        L_0x00ad:
            r11 = 0
        L_0x00ae:
            if (r3 == 0) goto L_0x00b2
        L_0x00b0:
            r2 = 1
            goto L_0x00f4
        L_0x00b2:
            if (r11 == 0) goto L_0x00e5
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f3682d
            int r11 = r11.size()
            if (r11 <= r4) goto L_0x00f4
            androidx.fragment.app.FragmentManager r11 = r8.f3680b
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.f3682d
            int r3 = r3.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.f3682d
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r3 = r8.m4291a(r3, r5)
            r11.mo4077a(r3, r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f3682d
            int r11 = r11.size()
            java.lang.String r11 = r8.m4291a(r11, r0)
            r10.mo4317a(r11)
            goto L_0x00f4
        L_0x00e5:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f3682d
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.m4291a(r11, r0)
            r10.mo4317a(r11)
            goto L_0x00b0
        L_0x00f4:
            boolean r11 = r12 instanceof androidx.navigation.fragment.C0958b.C0960b
            if (r11 == 0) goto L_0x0122
            androidx.navigation.fragment.b$b r12 = (androidx.navigation.fragment.C0958b.C0960b) r12
            java.util.Map r11 = r12.mo4705a()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0106:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0122
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r10.mo4313a(r3, r12)
            goto L_0x0106
        L_0x0122:
            r10.mo4318a(r4)
            r10.mo4176a()
            if (r2 == 0) goto L_0x0134
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f3682d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            return r9
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C0958b.mo4654a(androidx.navigation.fragment.b$a, android.os.Bundle, androidx.navigation.o, androidx.navigation.Navigator$Extras):androidx.navigation.j");
    }

    /* renamed from: a */
    public void mo4655a(Bundle bundle) {
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
            if (intArray != null) {
                this.f3682d.clear();
                for (int valueOf : intArray) {
                    this.f3682d.add(Integer.valueOf(valueOf));
                }
            }
        }
    }

    /* renamed from: a */
    private String m4291a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }
}
