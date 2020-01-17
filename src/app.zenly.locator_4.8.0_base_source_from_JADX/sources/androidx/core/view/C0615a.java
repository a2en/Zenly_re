package androidx.core.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0628c;
import androidx.core.view.accessibility.C0628c.C0629a;
import androidx.core.view.accessibility.C0632d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p214e.p234h.C7612c;

/* renamed from: androidx.core.view.a */
public class C0615a {

    /* renamed from: c */
    private static final AccessibilityDelegate f2764c = new AccessibilityDelegate();

    /* renamed from: a */
    private final AccessibilityDelegate f2765a;

    /* renamed from: b */
    private final AccessibilityDelegate f2766b;

    /* renamed from: androidx.core.view.a$a */
    static final class C0616a extends AccessibilityDelegate {

        /* renamed from: a */
        final C0615a f2767a;

        C0616a(C0615a aVar) {
            this.f2767a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2767a.mo3294a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0632d a = this.f2767a.mo3290a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo3375a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2767a.mo3296b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0628c a = C0628c.m2912a(accessibilityNodeInfo);
            a.mo3356j(ViewCompat.m2807G(view));
            a.mo3354i(ViewCompat.m2801A(view));
            a.mo3343e(ViewCompat.m2849f(view));
            this.f2767a.mo3292a(view, a);
            a.mo3323a(accessibilityNodeInfo.getText(), view);
            List b = C0615a.m2895b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo3321a((C0629a) b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2767a.mo3297c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2767a.mo3295a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2767a.mo3293a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f2767a.mo3291a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2767a.mo3298d(view, accessibilityEvent);
        }
    }

    public C0615a() {
        this(f2764c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo3289a() {
        return this.f2766b;
    }

    /* renamed from: b */
    public void mo3296b(View view, AccessibilityEvent accessibilityEvent) {
        this.f2765a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo3297c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2765a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo3298d(View view, AccessibilityEvent accessibilityEvent) {
        this.f2765a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0615a(AccessibilityDelegate accessibilityDelegate) {
        this.f2765a = accessibilityDelegate;
        this.f2766b = new C0616a(this);
    }

    /* renamed from: b */
    static List<C0629a> m2895b(View view) {
        List<C0629a> list = (List) view.getTag(C7612c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public void mo3291a(View view, int i) {
        this.f2765a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public boolean mo3294a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2765a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo3292a(View view, C0628c cVar) {
        this.f2765a.onInitializeAccessibilityNodeInfo(view, cVar.mo3370t());
    }

    /* renamed from: a */
    public boolean mo3295a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2765a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0632d mo3290a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f2765a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0632d(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo3293a(View view, int i, Bundle bundle) {
        List b = m2895b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C0629a aVar = (C0629a) b.get(i2);
            if (aVar.mo3372a() == i) {
                z = aVar.mo3373a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.f2765a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C7612c.accessibility_action_clickable_span) ? z : m2893a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: a */
    private boolean m2893a(int i, View view) {
        SparseArray sparseArray = (SparseArray) view.getTag(C7612c.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (m2894a(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2894a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] g = C0628c.m2922g(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (g != null && i < g.length) {
                if (clickableSpan.equals(g[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
