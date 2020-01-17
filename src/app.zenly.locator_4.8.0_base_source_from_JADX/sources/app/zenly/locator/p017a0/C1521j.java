package app.zenly.locator.p017a0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.a0.j */
public class C1521j extends C1512f {

    /* renamed from: Q */
    private String f5407Q;

    /* renamed from: R */
    private EditText f5408R;

    public C1521j(String str) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("name_key", str);
        this(dVar.mo9605a());
    }

    /* renamed from: C */
    private void m6689C() {
        mo23946k().mo24014n();
    }

    /* renamed from: D */
    private void m6690D() {
        String trim = this.f5408R.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            Toast.makeText(mo23920b(), C7709b.m18762a(mo23920b(), R.string.settings_inputname_header_emptyname), 0).show();
            return;
        }
        C1297b.m6236a(mo23920b());
        C6925a newBuilder = UserProto$User.newBuilder();
        newBuilder.setName(trim);
        C1526m.m6701c((UserProto$User) newBuilder.build(), mo9304A());
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.HEAVY, C5500b.POSITIVE);
        m6689C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_input_name, viewGroup, false);
        this.f5408R = (EditText) inflate.findViewById(R.id.settings_name_edittext);
        inflate.findViewById(R.id.settings_inputname_validate).setOnClickListener(new C1511e(this));
        this.f5408R.setOnEditorActionListener(new C1510d(this));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7050a(Context context, UserProto$User userProto$User) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        C1297b.m6241b(this.f5408R);
        this.f5408R.setText(this.f5407Q);
        EditText editText = this.f5408R;
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        m6690D();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public C1521j(Bundle bundle) {
        this.f5407Q = bundle.getString("name_key", "");
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo7060a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        m6690D();
        return true;
    }
}
