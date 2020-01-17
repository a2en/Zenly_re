package app.zenly.locator.modals;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.modals.p121o2.C4655h;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;

public abstract class ModalController extends ZenlyController {

    /* renamed from: P */
    private ModalListener f12139P;

    public interface ModalListener {
        void onSelectUser(ModalController modalController, C2879d0 d0Var);
    }

    public ModalController(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: B */
    public void mo7192B() {
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: C */
    public void mo10303C() {
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: D */
    public void mo11694D() {
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: a */
    public void mo11695a(ModalListener modalListener) {
        this.f12139P = modalListener;
    }

    /* renamed from: b */
    public abstract C4655h mo10304b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo10303C();
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        mo11694D();
    }

    /* renamed from: g */
    public /* synthetic */ void mo11697g(View view) {
        mo7192B();
    }

    public boolean handleBack() {
        mo7192B();
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11696a(ModalController modalController, C2879d0 d0Var) {
        ModalListener modalListener = this.f12139P;
        if (modalListener != null) {
            modalListener.onSelectUser(modalController, d0Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C4655h b = mo10304b(layoutInflater, viewGroup);
        b.setPrimaryActionButtonClickListener(new C4690w(this));
        b.setSecondaryActionButtonClickListener(new C4693x(this));
        b.setCloseButtonClickListener(new C4696y(this));
        return b;
    }
}
