package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.C10450d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p214e.p228e.C7571a;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
public final class C10063y0 extends Fragment implements LifecycleFragment {

    /* renamed from: h */
    private static WeakHashMap<Activity, WeakReference<C10063y0>> f26443h = new WeakHashMap<>();

    /* renamed from: e */
    private Map<String, LifecycleCallback> f26444e = new C7571a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26445f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Bundle f26446g;

    /* renamed from: a */
    public static C10063y0 m25285a(Activity activity) {
        String str = "LifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) f26443h.get(activity);
        if (weakReference != null) {
            C10063y0 y0Var = (C10063y0) weakReference.get();
            if (y0Var != null) {
                return y0Var;
            }
        }
        try {
            C10063y0 y0Var2 = (C10063y0) activity.getFragmentManager().findFragmentByTag(str);
            if (y0Var2 == null || y0Var2.isRemoving()) {
                y0Var2 = new C10063y0();
                activity.getFragmentManager().beginTransaction().add(y0Var2, str).commitAllowingStateLoss();
            }
            f26443h.put(activity, new WeakReference(y0Var2));
            return y0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f26444e.containsKey(str)) {
            this.f26444e.put(str, lifecycleCallback);
            if (this.f26445f > 0) {
                new C10450d(Looper.getMainLooper()).post(new C10065z0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f26444e.values()) {
            a.mo27121a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f26444e.get(str));
    }

    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    public final boolean isCreated() {
        return this.f26445f > 0;
    }

    public final boolean isStarted() {
        return this.f26445f >= 2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f26444e.values()) {
            a.mo27119a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26445f = 1;
        this.f26446g = bundle;
        for (Entry entry : this.f26444e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo27120a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f26445f = 5;
        for (LifecycleCallback b : this.f26444e.values()) {
            b.mo27122b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f26445f = 3;
        for (LifecycleCallback c : this.f26444e.values()) {
            c.mo27124c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f26444e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo27123b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f26445f = 2;
        for (LifecycleCallback d : this.f26444e.values()) {
            d.mo27125d();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f26445f = 4;
        for (LifecycleCallback e : this.f26444e.values()) {
            e.mo27126e();
        }
    }
}
