package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.C10450d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p214e.p228e.C7571a;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
public final class C10013b1 extends Fragment implements LifecycleFragment {

    /* renamed from: h */
    private static WeakHashMap<FragmentActivity, WeakReference<C10013b1>> f26335h = new WeakHashMap<>();

    /* renamed from: e */
    private Map<String, LifecycleCallback> f26336e = new C7571a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26337f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Bundle f26338g;

    /* renamed from: a */
    public static C10013b1 m25113a(FragmentActivity fragmentActivity) {
        String str = "SupportLifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) f26335h.get(fragmentActivity);
        if (weakReference != null) {
            C10013b1 b1Var = (C10013b1) weakReference.get();
            if (b1Var != null) {
                return b1Var;
            }
        }
        try {
            C10013b1 b1Var2 = (C10013b1) fragmentActivity.getSupportFragmentManager().mo4083b(str);
            if (b1Var2 == null || b1Var2.isRemoving()) {
                b1Var2 = new C10013b1();
                C0819o b = fragmentActivity.getSupportFragmentManager().mo4084b();
                b.mo4316a((Fragment) b1Var2, str);
                b.mo4185b();
            }
            f26335h.put(fragmentActivity, new WeakReference(b1Var2));
            return b1Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f26336e.containsKey(str)) {
            this.f26336e.put(str, lifecycleCallback);
            if (this.f26337f > 0) {
                new C10450d(Looper.getMainLooper()).post(new C10010a1(this, lifecycleCallback, str));
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
        for (LifecycleCallback a : this.f26336e.values()) {
            a.mo27121a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f26336e.get(str));
    }

    public final /* synthetic */ Activity getLifecycleActivity() {
        return getActivity();
    }

    public final boolean isCreated() {
        return this.f26337f > 0;
    }

    public final boolean isStarted() {
        return this.f26337f >= 2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f26336e.values()) {
            a.mo27119a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26337f = 1;
        this.f26338g = bundle;
        for (Entry entry : this.f26336e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo27120a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f26337f = 5;
        for (LifecycleCallback b : this.f26336e.values()) {
            b.mo27122b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f26337f = 3;
        for (LifecycleCallback c : this.f26336e.values()) {
            c.mo27124c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f26336e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo27123b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f26337f = 2;
        for (LifecycleCallback d : this.f26336e.values()) {
            d.mo27125d();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f26337f = 4;
        for (LifecycleCallback e : this.f26336e.values()) {
            e.mo27126e();
        }
    }
}
