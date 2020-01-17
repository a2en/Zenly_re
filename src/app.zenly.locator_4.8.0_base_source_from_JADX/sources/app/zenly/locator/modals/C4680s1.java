package app.zenly.locator.modals;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.modals.p121o2.C4644c;
import app.zenly.locator.modals.p121o2.C4654g;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.notifications.C7839o;

/* renamed from: app.zenly.locator.modals.s1 */
public class C4680s1 extends ModalController {

    /* renamed from: Q */
    private C4654g f12440Q;

    /* renamed from: R */
    private C7839o f12441R;

    public C4680s1(C7839o oVar) throws InvalidProtocolBufferException {
        this(m13652a(oVar));
    }

    /* renamed from: a */
    private static Bundle m13652a(C7839o oVar) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("notification", oVar.toByteArray());
        return dVar.mo9605a();
    }

    /* renamed from: C */
    public void mo10303C() {
        mo23902a(new Intent("android.net.wifi.PICK_WIFI_NETWORK"));
        super.mo10303C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12440Q.mo11861c();
        super.mo7053d(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
    }

    public C4680s1(Bundle bundle) throws InvalidProtocolBufferException {
        super(bundle);
        this.f12441R = C7839o.parseFrom(bundle.getByteArray("notification"));
    }

    /* renamed from: b */
    public C4644c m13655b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f12440Q = new C4654g(viewGroup.getContext());
        this.f12440Q.setTitle((int) R.string.troubleshoot_enablewifi_subtitle_notprecise);
        this.f12440Q.setSummary((int) R.string.troubleshoot_enablewifi_title_turnonwifi);
        this.f12440Q.mo11815a(true);
        this.f12440Q.setInfo((CharSequence) mo23920b().getResources().getQuantityString(R.plurals.troubleshoot_enablewifi_title_friendinstructions, 1, new Object[]{this.f12441R.getAuthor().getName(), Integer.valueOf(0)}));
        this.f12440Q.setAnimation(R.raw.lottie_incoming_wifi_request);
        this.f12440Q.setRepeatCount(-1);
        this.f12440Q.setPrimaryActionTitle((int) R.string.commons_button_wifi_on);
        return this.f12440Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f12440Q.mo11862d();
    }
}
