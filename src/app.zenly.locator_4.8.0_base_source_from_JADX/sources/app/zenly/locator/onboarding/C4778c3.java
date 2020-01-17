package app.zenly.locator.onboarding;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p333g.p382g.p383a.C12124a;
import p333g.p382g.p383a.C12125b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.onboarding.c3 */
public class C4778c3 extends BaseSignupController {

    /* renamed from: T */
    private TextView f12635T;

    /* renamed from: U */
    private C12125b f12636U;

    /* renamed from: c */
    private void m13982c(Context context) {
        C12125b bVar = this.f12636U;
        if (bVar != null) {
            if (VERSION.SDK_INT >= 23) {
                bVar.mo35911d("android.permission.READ_CONTACTS").mo36412a((Consumer<? super T>) new C4763b0<Object>(this, context), (Consumer<? super Throwable>) C4780d0.f12639e);
            } else {
                new Builder(mo23920b()).setMessage(C7709b.m18762a(context, R.string.onboarding_permission_contact_rationale)).setCancelable(false).setPositiveButton(R.string.commons_button_capok, new C4775c0(this, context)).setNegativeButton(R.string.commons_button_no, C4753a0.f12550e).create().show();
            }
            C4847l3.m14146j().mo12079e();
        }
    }

    /* renamed from: B */
    public int mo7192B() {
        return 50;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_contact_permission, viewGroup, false);
        this.f12635T = (TextView) inflate.findViewById(R.id.contact_permission_button);
        this.f12635T.setOnClickListener(new C4952z(this));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (VERSION.SDK_INT < 23 || C0540a.m2537a(view.getContext(), "android.permission.READ_CONTACTS") != 0) {
            this.f12636U = new C12125b(mo23920b());
            return;
        }
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo11926D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12636U = null;
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13982c(view.getContext());
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    private void m13983d(Context context) {
        new Builder(context).setMessage(C7709b.m18762a(context, R.string.permission_contacts_modal_title)).setCancelable(false).setPositiveButton(R.string.commons_button_capok, new C4938x(this, context)).create().show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12019a(Context context, C12124a aVar) throws Exception {
        if (aVar.f31547b) {
            C4847l3.m14146j().mo12077c();
            C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
            mo11926D();
        } else if (aVar.f31548c) {
            C4847l3.m14146j().mo12078d();
            C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
            m13983d(context);
        } else {
            C4847l3.m14146j().mo12078d();
            C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
            m13981b(context);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo12020b(Context context, DialogInterface dialogInterface, int i) {
        C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13982c(context);
    }

    /* renamed from: b */
    private void m13981b(Context context) {
        this.f12635T.setText(R.string.onboarding_open_settings);
        this.f12635T.setOnClickListener(new C4943y(context));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12018a(Context context, DialogInterface dialogInterface, int i) {
        C4847l3.m14146j().mo12077c();
        C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo11926D();
    }
}
