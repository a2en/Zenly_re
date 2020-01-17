package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0618a;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0619b;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0620c;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0621d;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0622e;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0623f;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0624g;
import androidx.core.view.accessibility.AccessibilityViewCommand.C0625h;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p214e.p234h.C7612c;

/* renamed from: androidx.core.view.accessibility.c */
public class C0628c {

    /* renamed from: c */
    private static int f2772c;

    /* renamed from: a */
    private final AccessibilityNodeInfo f2773a;

    /* renamed from: b */
    public int f2774b = -1;

    /* renamed from: androidx.core.view.accessibility.c$a */
    public static class C0629a {

        /* renamed from: a */
        final Object f2775a;

        /* renamed from: b */
        private final Class<? extends C0618a> f2776b;

        /* renamed from: c */
        protected final AccessibilityViewCommand f2777c;

        static {
            Class<C0620c> cls = C0620c.class;
            Class<C0619b> cls2 = C0619b.class;
            AccessibilityAction accessibilityAction = null;
            new C0629a(1, null);
            new C0629a(2, null);
            new C0629a(4, null);
            new C0629a(8, null);
            new C0629a(16, null);
            new C0629a(32, null);
            new C0629a(64, null);
            new C0629a(128, null);
            new C0629a(256, null, cls2);
            new C0629a(512, null, cls2);
            new C0629a(1024, null, cls);
            new C0629a(ItemAnimator.FLAG_MOVED, null, cls);
            new C0629a(4096, null);
            new C0629a(8192, null);
            new C0629a(16384, null);
            new C0629a(32768, null);
            new C0629a(65536, null);
            new C0629a(131072, null, C0624g.class);
            new C0629a(262144, null);
            new C0629a(524288, null);
            new C0629a(1048576, null);
            new C0629a(2097152, null, C0625h.class);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, C0622e.class);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new C0629a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new C0629a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new C0629a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new C0629a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new C0629a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new C0629a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, C0623f.class);
            new C0629a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, C0621d.class);
            new C0629a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C0629a(accessibilityAction, 16908357, null, null, null);
        }

        public C0629a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public int mo3372a() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f2775a).getId();
            }
            return 0;
        }

        private C0629a(int i, CharSequence charSequence, Class<? extends C0618a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C0629a(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends C0618a> cls) {
            this.f2777c = accessibilityViewCommand;
            if (VERSION.SDK_INT < 21 || obj != null) {
                this.f2775a = obj;
            } else {
                this.f2775a = new AccessibilityAction(i, charSequence);
            }
            this.f2776b = cls;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3373a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.AccessibilityViewCommand r0 = r4.f2777c
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$a> r2 = r4.f2776b
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.AccessibilityViewCommand$a r1 = (androidx.core.view.accessibility.AccessibilityViewCommand.C0618a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo3314a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$a> r1 = r4.f2776b
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.AccessibilityViewCommand r6 = r4.f2777c
                boolean r5 = r6.perform(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.C0628c.C0629a.mo3373a(android.view.View, android.os.Bundle):boolean");
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$b */
    public static class C0630b {

        /* renamed from: a */
        final Object f2778a;

        C0630b(Object obj) {
            this.f2778a = obj;
        }

        /* renamed from: a */
        public static C0630b m2981a(int i, int i2, boolean z, int i3) {
            int i4 = VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C0630b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C0630b(CollectionInfo.obtain(i, i2, z));
            }
            return new C0630b(null);
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$c */
    public static class C0631c {

        /* renamed from: a */
        final Object f2779a;

        C0631c(Object obj) {
            this.f2779a = obj;
        }

        /* renamed from: a */
        public static C0631c m2982a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C0631c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C0631c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0631c(null);
        }
    }

    private C0628c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2773a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0628c m2912a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0628c(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m2918b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case ItemAnimator.FLAG_MOVED /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: d */
    public static C0628c m2920d(View view) {
        return m2912a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: e */
    private void m2921e(View view) {
        SparseArray c = m2919c(view);
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c.size(); i++) {
                if (((WeakReference) c.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: u */
    private void m2923u() {
        if (VERSION.SDK_INT >= 19) {
            this.f2773a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2773a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2773a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2773a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: v */
    private boolean m2924v() {
        return !m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: w */
    public static C0628c m2925w() {
        return m2912a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: b */
    public int mo3327b() {
        return this.f2773a.getChildCount();
    }

    /* renamed from: c */
    public void mo3335c(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f2773a.setSource(view, i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0628c.class != obj.getClass()) {
            return false;
        }
        C0628c cVar = (C0628c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2773a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2773a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2773a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo3348f(boolean z) {
        this.f2773a.setEnabled(z);
    }

    /* renamed from: g */
    public void mo3350g(boolean z) {
        this.f2773a.setFocusable(z);
    }

    /* renamed from: h */
    public void mo3352h(boolean z) {
        this.f2773a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2773a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public boolean mo3355i() {
        return this.f2773a.isCheckable();
    }

    /* renamed from: j */
    public boolean mo3357j() {
        return this.f2773a.isChecked();
    }

    /* renamed from: k */
    public boolean mo3359k() {
        return this.f2773a.isClickable();
    }

    /* renamed from: l */
    public boolean mo3361l() {
        return this.f2773a.isEnabled();
    }

    /* renamed from: m */
    public boolean mo3363m() {
        return this.f2773a.isFocusable();
    }

    /* renamed from: n */
    public boolean mo3364n() {
        return this.f2773a.isFocused();
    }

    /* renamed from: o */
    public boolean mo3365o() {
        return this.f2773a.isLongClickable();
    }

    /* renamed from: p */
    public boolean mo3366p() {
        return this.f2773a.isPassword();
    }

    /* renamed from: q */
    public boolean mo3367q() {
        return this.f2773a.isScrollable();
    }

    /* renamed from: r */
    public boolean mo3368r() {
        return this.f2773a.isSelected();
    }

    /* renamed from: s */
    public void mo3369s() {
        this.f2773a.recycle();
    }

    /* renamed from: t */
    public AccessibilityNodeInfo mo3370t() {
        return this.f2773a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo3318a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo3328b(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo3346f());
        sb.append("; className: ");
        sb.append(mo3333c());
        sb.append("; text: ");
        sb.append(mo3349g());
        sb.append("; contentDescription: ");
        sb.append(mo3338d());
        sb.append("; viewId: ");
        sb.append(mo3351h());
        sb.append("; checkable: ");
        sb.append(mo3355i());
        sb.append("; checked: ");
        sb.append(mo3357j());
        sb.append("; focusable: ");
        sb.append(mo3363m());
        sb.append("; focused: ");
        sb.append(mo3364n());
        sb.append("; selected: ");
        sb.append(mo3368r());
        sb.append("; clickable: ");
        sb.append(mo3359k());
        sb.append("; longClickable: ");
        sb.append(mo3365o());
        sb.append("; enabled: ");
        sb.append(mo3361l());
        sb.append("; password: ");
        sb.append(mo3366p());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo3367q());
        sb.append(sb4.toString());
        sb.append("; [");
        int a = mo3316a();
        while (a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            a &= ~numberOfTrailingZeros;
            sb.append(m2918b(numberOfTrailingZeros));
            if (a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static C0628c m2913a(C0628c cVar) {
        return m2912a(AccessibilityNodeInfo.obtain(cVar.f2773a));
    }

    /* renamed from: b */
    public void mo3329b(View view, int i) {
        this.f2774b = i;
        if (VERSION.SDK_INT >= 16) {
            this.f2773a.setParent(view, i);
        }
    }

    /* renamed from: d */
    public void mo3339d(Rect rect) {
        this.f2773a.setBoundsInScreen(rect);
    }

    /* renamed from: f */
    public CharSequence mo3346f() {
        return this.f2773a.getPackageName();
    }

    /* renamed from: g */
    public CharSequence mo3349g() {
        if (!m2924v()) {
            return this.f2773a.getText();
        }
        List a = m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List a2 = m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a3 = m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a4 = m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2773a.getText(), 0, this.f2773a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C0626a(((Integer) a4.get(i)).intValue(), this, mo3342e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: h */
    public String mo3351h() {
        if (VERSION.SDK_INT >= 18) {
            return this.f2773a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: i */
    public void mo3354i(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f2773a.setHeading(z);
        } else {
            m2915a(2, z);
        }
    }

    /* renamed from: j */
    public void mo3356j(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f2773a.setScreenReaderFocusable(z);
        } else {
            m2915a(1, z);
        }
    }

    /* renamed from: k */
    public void mo3358k(boolean z) {
        this.f2773a.setScrollable(z);
    }

    /* renamed from: l */
    public void mo3360l(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.f2773a.setShowingHintText(z);
        } else {
            m2915a(4, z);
        }
    }

    /* renamed from: m */
    public void mo3362m(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f2773a.setVisibleToUser(z);
        }
    }

    /* renamed from: a */
    public void mo3320a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f2773a.addChild(view, i);
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo3334c(Rect rect) {
        this.f2773a.setBoundsInParent(rect);
    }

    /* renamed from: d */
    public void mo3340d(CharSequence charSequence) {
        this.f2773a.setPackageName(charSequence);
    }

    /* renamed from: f */
    public void mo3347f(CharSequence charSequence) {
        this.f2773a.setText(charSequence);
    }

    /* renamed from: c */
    public void mo3337c(boolean z) {
        this.f2773a.setChecked(z);
    }

    /* renamed from: d */
    public CharSequence mo3338d() {
        return this.f2773a.getContentDescription();
    }

    /* renamed from: a */
    public int mo3316a() {
        return this.f2773a.getActions();
    }

    /* renamed from: b */
    public void mo3328b(Rect rect) {
        this.f2773a.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public CharSequence mo3333c() {
        return this.f2773a.getClassName();
    }

    /* renamed from: d */
    public void mo3341d(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f2773a.setContentInvalid(z);
        }
    }

    /* renamed from: c */
    private SparseArray<WeakReference<ClickableSpan>> m2919c(View view) {
        return (SparseArray) view.getTag(C7612c.tag_accessibility_clickable_spans);
    }

    /* renamed from: a */
    public void mo3317a(int i) {
        this.f2773a.addAction(i);
    }

    /* renamed from: b */
    public void mo3332b(boolean z) {
        this.f2773a.setCheckable(z);
    }

    /* renamed from: a */
    private List<Integer> m2914a(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.f2773a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.f2773a.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    /* renamed from: b */
    private SparseArray<WeakReference<ClickableSpan>> m2917b(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m2919c(view);
        if (c != null) {
            return c;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C7612c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: c */
    public void mo3336c(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f2773a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f2773a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: e */
    public Bundle mo3342e() {
        if (VERSION.SDK_INT >= 19) {
            return this.f2773a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: b */
    public void mo3331b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f2773a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C0631c) obj).f2779a);
        }
    }

    /* renamed from: e */
    public void mo3344e(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f2773a.setDismissable(z);
        }
    }

    /* renamed from: b */
    public void mo3330b(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f2773a.setError(charSequence);
        }
    }

    /* renamed from: a */
    public void mo3321a(C0629a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.f2773a.addAction((AccessibilityAction) aVar.f2775a);
        }
    }

    /* renamed from: e */
    public void mo3343e(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f2773a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f2773a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo3326a(int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return this.f2773a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: g */
    public static ClickableSpan[] m2922g(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void mo3319a(View view) {
        this.f2773a.setParent(view);
    }

    @Deprecated
    /* renamed from: a */
    public void mo3318a(Rect rect) {
        this.f2773a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo3325a(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f2773a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public void mo3322a(CharSequence charSequence) {
        this.f2773a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo3323a(CharSequence charSequence, View view) {
        int i = VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m2923u();
            m2921e(view);
            ClickableSpan[] g = m2922g(charSequence);
            if (g != null && g.length > 0) {
                mo3342e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C7612c.accessibility_action_clickable_span);
                SparseArray b = m2917b(view);
                int i2 = 0;
                while (g != null && i2 < g.length) {
                    int a = m2911a(g[i2], b);
                    b.put(a, new WeakReference(g[i2]));
                    m2916a(g[i2], (Spanned) charSequence, a);
                    i2++;
                }
            }
        }
    }

    /* renamed from: a */
    private int m2911a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2772c;
        f2772c = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    private void m2916a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m2914a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo3324a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f2773a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C0630b) obj).f2778a);
        }
    }

    /* renamed from: a */
    private void m2915a(int i, boolean z) {
        Bundle e = mo3342e();
        if (e != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = e.getInt(str, 0) & (~i);
            if (!z) {
                i = 0;
            }
            e.putInt(str, i | i2);
        }
    }
}
