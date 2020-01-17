package app.zenly.locator;

import android.content.Context;
import android.os.Bundle;
import app.zenly.locator.chat.C2329t4;
import app.zenly.locator.chat.contract.ChatContract;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.dashboard.C3307i;
import app.zenly.locator.dashboard.C3325v;
import app.zenly.locator.friendshipfacts.C3766a;
import app.zenly.locator.inbox.C3837f;
import app.zenly.locator.map.C3912d1;
import app.zenly.locator.map.C4292t0;
import app.zenly.locator.map.C4303u0;
import app.zenly.locator.map.C4407y0;
import app.zenly.locator.meet.C4495h0;
import app.zenly.locator.p017a0.C1521j;
import app.zenly.locator.p017a0.p024p.C1558a;
import app.zenly.locator.p017a0.p030q.C1614a;
import app.zenly.locator.p086e0.p087a.C3574b;
import app.zenly.locator.p135r.C5194u0;
import app.zenly.locator.p143s.C5343a.C5359p;
import app.zenly.locator.p207x.C6248t1;
import app.zenly.locator.privacy.C5117w;
import app.zenly.locator.privacy.C5120y;
import app.zenly.locator.sharesheet.ShareSheetController;
import app.zenly.locator.sharesheet.ShareSheetController.C5595e;
import app.zenly.locator.userprofile.p198me.C6063b;
import com.bluelinelabs.conductor.C8819d;
import java.util.ArrayList;
import p213co.znly.models.C7339i;
import p213co.znly.models.core.C7117i;

/* renamed from: app.zenly.locator.q */
public class C5130q {
    /* renamed from: a */
    public ChatContract mo12442a(String str, boolean z, boolean z2) {
        return C2329t4.m8308a(str, z, z2);
    }

    /* renamed from: b */
    public C6248t1 mo12450b() {
        return new C6248t1();
    }

    /* renamed from: c */
    public C3325v mo12451c() {
        return new C3307i(Bundle.EMPTY);
    }

    /* renamed from: d */
    public C8819d mo12454d(String str) {
        return new C5117w(str);
    }

    /* renamed from: e */
    public ZenlyController mo12455e() {
        return new C3837f(Bundle.EMPTY);
    }

    /* renamed from: f */
    public C4407y0 mo12456f() {
        return new C4303u0();
    }

    /* renamed from: g */
    public C8819d mo12457g() {
        return new C1614a();
    }

    /* renamed from: h */
    public ZenlyController mo12458h() {
        return new C6063b(Bundle.EMPTY);
    }

    /* renamed from: i */
    public C8819d mo12459i() {
        return new C5120y();
    }

    /* renamed from: j */
    public C8819d mo12460j() {
        return new C1558a();
    }

    /* renamed from: k */
    public C4407y0 mo12461k() {
        return new C3912d1();
    }

    /* renamed from: a */
    public ChatContract mo12440a(C7117i iVar, boolean z, boolean z2) {
        return C2329t4.m8306a(iVar, z, z2);
    }

    /* renamed from: b */
    public C4495h0 mo12449b(String str) {
        return new C4495h0(str);
    }

    /* renamed from: c */
    public C8819d mo12452c(String str) {
        return C3574b.m10847d(str);
    }

    /* renamed from: d */
    public C8819d mo12453d() {
        return new C3766a();
    }

    /* renamed from: a */
    public ChatContract mo12441a(C7339i iVar) {
        return C2329t4.m8307a(iVar);
    }

    /* renamed from: a */
    public ShareSheetController mo12444a(Context context) {
        C5595e eVar = new C5595e();
        eVar.mo13236a((int) R.string.gchat_createview_button);
        return eVar.mo13238a();
    }

    /* renamed from: a */
    public ShareSheetController mo12445a(Context context, String str, ArrayList<String> arrayList) {
        C5595e eVar = new C5595e();
        eVar.mo13236a((int) R.string.gchat_add_button);
        eVar.mo13237a(arrayList);
        return eVar.mo13238a();
    }

    /* renamed from: a */
    public C8819d mo12446a() {
        return new C5194u0(1);
    }

    /* renamed from: a */
    public C8819d mo12448a(String str, boolean z) {
        C3574b d = C3574b.m10847d(str);
        d.mo10051e(z);
        return d;
    }

    /* renamed from: a */
    public C8819d mo12447a(String str, C5359p pVar) {
        return C3574b.m10839a(str, pVar);
    }

    /* renamed from: a */
    public C4292t0 mo12443a(int i) {
        return C4292t0.m12728b(i);
    }

    /* renamed from: a */
    public C1521j mo12439a(String str) {
        return new C1521j(str);
    }
}
