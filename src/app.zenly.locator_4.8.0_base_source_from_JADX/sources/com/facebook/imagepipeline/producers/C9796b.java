package com.facebook.imagepipeline.producers;

import com.facebook.common.logging.C9543a;

/* renamed from: com.facebook.imagepipeline.producers.b */
public abstract class C9796b<T> implements Consumer<T> {

    /* renamed from: a */
    private boolean f25722a = false;

    /* renamed from: a */
    public static int m24322a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m24323a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: a */
    public static boolean m24324a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    public static boolean m24325b(int i) {
        return !m24323a(i);
    }

    /* renamed from: b */
    public static boolean m24326b(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: c */
    public static int m24327c(int i, int i2) {
        return i & (~i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26614a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26615a(float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26616a(Exception exc) {
        C9543a.m23321c(getClass(), "unhandled exception", (Throwable) exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26609a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26617a(Throwable th);

    public synchronized void onCancellation() {
        if (!this.f25722a) {
            this.f25722a = true;
            try {
                mo26614a();
            } catch (Exception e) {
                mo26616a(e);
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void onFailure(Throwable th) {
        if (!this.f25722a) {
            this.f25722a = true;
            try {
                mo26617a(th);
            } catch (Exception e) {
                mo26616a(e);
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void onNewResult(T t, int i) {
        if (!this.f25722a) {
            this.f25722a = m24323a(i);
            try {
                mo26609a(t, i);
            } catch (Exception e) {
                mo26616a(e);
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void onProgressUpdate(float f) {
        if (!this.f25722a) {
            try {
                mo26615a(f);
            } catch (Exception e) {
                mo26616a(e);
            }
        } else {
            return;
        }
    }
}
