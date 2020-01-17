package com.bluelinelabs.conductor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener;
import com.bluelinelabs.conductor.internal.C8850d;
import com.bluelinelabs.conductor.internal.LifecycleHandler;
import java.util.List;

/* renamed from: com.bluelinelabs.conductor.a */
public class C8809a extends C8831g {

    /* renamed from: i */
    private LifecycleHandler f22839i;

    /* renamed from: j */
    private final C8850d f22840j = new C8850d();

    /* renamed from: a */
    public final void mo23861a(LifecycleHandler lifecycleHandler, ViewGroup viewGroup) {
        if (this.f22839i != lifecycleHandler || this.f22933h != viewGroup) {
            ViewGroup viewGroup2 = this.f22933h;
            if (viewGroup2 != null && (viewGroup2 instanceof ControllerChangeListener)) {
                mo24002b((ControllerChangeListener) viewGroup2);
            }
            if (viewGroup instanceof ControllerChangeListener) {
                mo23990a((ControllerChangeListener) viewGroup);
            }
            this.f22839i = lifecycleHandler;
            this.f22933h = viewGroup;
            mo24019s();
        }
    }

    /* renamed from: b */
    public void mo23866b(Bundle bundle) {
        super.mo23866b(bundle);
        this.f22840j.mo24079b(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo23867c(String str) {
        this.f22839i.mo24033a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8831g mo23868f() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C8831g> mo23869g() {
        return this.f22839i.mo24038b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C8850d mo23870h() {
        return this.f22840j;
    }

    /* renamed from: k */
    public final void mo23871k() {
        LifecycleHandler lifecycleHandler = this.f22839i;
        if (lifecycleHandler != null && lifecycleHandler.getFragmentManager() != null) {
            this.f22839i.getFragmentManager().invalidateOptionsMenu();
        }
    }

    /* renamed from: l */
    public void mo23872l() {
        super.mo23872l();
    }

    /* renamed from: a */
    public void mo23860a(Bundle bundle) {
        super.mo23860a(bundle);
        this.f22840j.mo24078a(bundle);
    }

    /* renamed from: a */
    public Activity mo23856a() {
        LifecycleHandler lifecycleHandler = this.f22839i;
        if (lifecycleHandler != null) {
            return lifecycleHandler.mo24031a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo23858a(Activity activity) {
        super.mo23858a(activity);
        this.f22839i = null;
    }

    /* renamed from: a */
    public void mo23857a(int i, int i2, Intent intent) {
        this.f22839i.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23859a(Intent intent) {
        this.f22839i.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23863a(String str, Intent intent, int i) {
        this.f22839i.mo24035a(str, intent, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23864a(String str, Intent intent, int i, Bundle bundle) {
        this.f22839i.mo24036a(str, intent, i, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23862a(String str, int i) {
        this.f22839i.mo24034a(str, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23865a(String str, String[] strArr, int i) {
        this.f22839i.mo24037a(str, strArr, i);
    }
}
