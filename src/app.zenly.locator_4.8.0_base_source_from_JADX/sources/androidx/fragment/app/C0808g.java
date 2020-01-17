package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.util.C0607i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.g */
public abstract class C0808g<E> extends C0805d {

    /* renamed from: e */
    private final Activity f3280e;

    /* renamed from: f */
    private final Context f3281f;

    /* renamed from: g */
    private final Handler f3282g;

    /* renamed from: h */
    final FragmentManager f3283h;

    C0808g(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    /* renamed from: a */
    public View mo3993a(int i) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4029a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo4030a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f3281f.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo4032a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo4033a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo3994a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo4034a(String str) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Activity mo4248b() {
        return this.f3280e;
    }

    /* renamed from: b */
    public boolean mo4035b(Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Context mo4249c() {
        return this.f3281f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Handler mo4250d() {
        return this.f3282g;
    }

    /* renamed from: e */
    public abstract E mo4036e();

    /* renamed from: f */
    public LayoutInflater mo4037f() {
        return LayoutInflater.from(this.f3281f);
    }

    /* renamed from: g */
    public void mo4038g() {
    }

    C0808g(Activity activity, Context context, Handler handler, int i) {
        this.f3283h = new C0812j();
        this.f3280e = activity;
        C0607i.m2774a(context, (Object) "context == null");
        this.f3281f = context;
        C0607i.m2774a(handler, (Object) "handler == null");
        this.f3282g = handler;
    }

    /* renamed from: a */
    public void mo4031a(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (i == -1) {
            ActivityCompat.m2348a(this.f3280e, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
