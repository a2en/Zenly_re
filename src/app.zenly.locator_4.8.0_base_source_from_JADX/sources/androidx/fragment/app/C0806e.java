package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0607i;
import androidx.lifecycle.ViewModelStoreOwner;

/* renamed from: androidx.fragment.app.e */
public class C0806e {

    /* renamed from: a */
    private final C0808g<?> f3278a;

    private C0806e(C0808g<?> gVar) {
        this.f3278a = gVar;
    }

    /* renamed from: a */
    public static C0806e m3761a(C0808g<?> gVar) {
        C0607i.m2774a(gVar, (Object) "callbacks == null");
        return new C0806e(gVar);
    }

    /* renamed from: b */
    public void mo4234b() {
        this.f3278a.f3283h.mo4099e();
    }

    /* renamed from: c */
    public void mo4238c() {
        this.f3278a.f3283h.mo4100f();
    }

    /* renamed from: d */
    public void mo4239d() {
        this.f3278a.f3283h.mo4104h();
    }

    /* renamed from: e */
    public void mo4240e() {
        this.f3278a.f3283h.mo4106i();
    }

    /* renamed from: f */
    public void mo4241f() {
        this.f3278a.f3283h.mo4110k();
    }

    /* renamed from: g */
    public void mo4242g() {
        this.f3278a.f3283h.mo4112l();
    }

    /* renamed from: h */
    public void mo4243h() {
        this.f3278a.f3283h.mo4114m();
    }

    /* renamed from: i */
    public boolean mo4244i() {
        return this.f3278a.f3283h.mo4095c(true);
    }

    /* renamed from: j */
    public FragmentManager mo4245j() {
        return this.f3278a.f3283h;
    }

    /* renamed from: k */
    public void mo4246k() {
        this.f3278a.f3283h.mo4131y();
    }

    /* renamed from: l */
    public Parcelable mo4247l() {
        return this.f3278a.f3283h.mo4055A();
    }

    /* renamed from: a */
    public Fragment mo4225a(String str) {
        return this.f3278a.f3283h.mo4092c(str);
    }

    /* renamed from: b */
    public void mo4235b(boolean z) {
        this.f3278a.f3283h.mo4088b(z);
    }

    /* renamed from: a */
    public void mo4230a(Fragment fragment) {
        C0808g<?> gVar = this.f3278a;
        gVar.f3283h.mo4076a(gVar, (C0805d) gVar, fragment);
    }

    /* renamed from: b */
    public boolean mo4236b(Menu menu) {
        return this.f3278a.f3283h.mo4090b(menu);
    }

    /* renamed from: a */
    public View mo4224a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3278a.f3283h.mo4123r().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo4237b(MenuItem menuItem) {
        return this.f3278a.f3283h.mo4091b(menuItem);
    }

    /* renamed from: a */
    public void mo4228a(Parcelable parcelable) {
        C0808g<?> gVar = this.f3278a;
        if (gVar instanceof ViewModelStoreOwner) {
            gVar.f3283h.mo4065a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo4226a() {
        this.f3278a.f3283h.mo4096d();
    }

    /* renamed from: a */
    public void mo4231a(boolean z) {
        this.f3278a.f3283h.mo4079a(z);
    }

    /* renamed from: a */
    public void mo4227a(Configuration configuration) {
        this.f3278a.f3283h.mo4063a(configuration);
    }

    /* renamed from: a */
    public boolean mo4232a(Menu menu, MenuInflater menuInflater) {
        return this.f3278a.f3283h.mo4080a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo4233a(MenuItem menuItem) {
        return this.f3278a.f3283h.mo4081a(menuItem);
    }

    /* renamed from: a */
    public void mo4229a(Menu menu) {
        this.f3278a.f3283h.mo4066a(menu);
    }
}
