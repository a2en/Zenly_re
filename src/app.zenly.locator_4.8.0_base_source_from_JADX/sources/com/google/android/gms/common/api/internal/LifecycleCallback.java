package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: e */
    protected final LifecycleFragment f26316e;

    protected LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f26316e = lifecycleFragment;
    }

    /* renamed from: a */
    protected static LifecycleFragment m25096a(C10021e eVar) {
        if (eVar.mo27195c()) {
            return C10013b1.m25113a(eVar.mo27194b());
        }
        if (eVar.mo27196d()) {
            return C10063y0.m25285a(eVar.mo27193a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(C10021e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo27119a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo27120a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo27121a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo27122b() {
    }

    /* renamed from: b */
    public void mo27123b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo27124c() {
    }

    /* renamed from: d */
    public void mo27125d() {
    }

    /* renamed from: e */
    public void mo27126e() {
    }

    /* renamed from: a */
    public static LifecycleFragment m25095a(Activity activity) {
        return m25096a(new C10021e(activity));
    }

    /* renamed from: a */
    public Activity mo27118a() {
        return this.f26316e.getLifecycleActivity();
    }
}
