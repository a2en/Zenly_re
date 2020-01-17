package app.zenly.locator.onboarding;

import android.content.Context;
import android.graphics.Rect;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p157t.p158a.C5512a;
import app.zenly.locator.p143s.p159u.C5513a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.onboarding.k3 */
public class C4842k3 extends BaseSignupController {

    /* renamed from: T */
    private EditText f12789T;

    /* renamed from: F */
    private void m14137F() {
        if (this.f12511Q != null) {
            String trim = this.f12789T.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                this.f12511Q.getCache().setName(trim);
                this.f12511Q.saveCache();
                C4847l3.m14146j().mo12073b(C5512a.m15630a((TelephonyManager) mo23920b().getSystemService("phone")), C5513a.m15633b(mo23920b()));
                C5498a.m15600a(this.f12789T.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                mo11926D();
            } else {
                C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.MEDIUM, C5500b.ERROR);
                C1297b.m6236a(mo23920b());
                m14138b((Context) mo23920b()).mo9300a((ExitListener) new C4812h2(this)).mo9344b().mo9296j(mo23920b());
            }
        }
    }

    /* renamed from: B */
    public int mo7192B() {
        return 20;
    }

    /* renamed from: E */
    public /* synthetic */ void mo12000E() {
        this.f12789T.requestFocus();
        C1297b.m6238a((View) this.f12789T, 100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_name, viewGroup, false);
        this.f12789T = (EditText) inflate.findViewById(R.id.signup_name_username);
        this.f12789T.setOnEditorActionListener(new C4797f2(this));
        inflate.findViewById(R.id.signup_name_nextbutton).setOnClickListener(new C4807g2(this));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f12789T.setText(this.f12511Q.getCache().getName());
        this.f12789T.requestFocus();
        C1297b.m6238a((View) this.f12789T, 100);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        m14137F();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    private static C3106c m14138b(Context context) {
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9346c(C7709b.m18762a(context, R.string.settings_inputname_header_emptyname));
        cVar.mo9341b(C7709b.m18762a(context, R.string.settings_inputname_title_emptyname));
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo12063a(TextView textView, int i, KeyEvent keyEvent) {
        m14137F();
        return false;
    }
}
