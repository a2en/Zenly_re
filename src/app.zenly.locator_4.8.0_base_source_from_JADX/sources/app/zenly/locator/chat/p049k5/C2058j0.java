package app.zenly.locator.chat.p049k5;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.services.C8105i1;
import p213co.znly.models.services.C8105i1.C8106a;
import p213co.znly.models.services.C8121j1;
import p333g.p369e.p372c.p377d.C12115a;
import p387h.p388a.C12143a;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.chat.k5.j0 */
public class C2058j0 extends ZenlyController {

    /* renamed from: P */
    private C7117i f6520P;

    /* renamed from: Q */
    private EditText f6521Q;

    /* renamed from: R */
    private final C12275b f6522R = new C12275b();

    public C2058j0(Bundle bundle) {
        super(bundle);
        String str = "KEY_CONVERSATION";
        if (bundle.containsKey(str)) {
            try {
                this.f6520P = C7117i.parseFrom(bundle.getByteArray(str));
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    static C2058j0 m7818a(C7117i iVar) {
        C12143a.m32033c("Creating friend selector from conversation with uuid -> %s", iVar.getInboxUuid());
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("KEY_CONVERSATION", iVar.toByteArray());
        return new C2058j0(dVar.mo9605a());
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        C1297b.m6241b(this.f6521Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f6521Q.post(new C2034a0(this));
        this.f6522R.add(C12115a.m31981a(view.findViewById(R.id.done)).mo36452b(C12295a.m32802a()).mo36509m(new C2036b0(this)).mo36454b((BiPredicate<? super Integer, ? super Throwable>) new C2040d0<Object,Object>(view)).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2038c0<Object>(this, view), (Consumer<? super Throwable>) C2044f0.f6467e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f6522R.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_group_chat_info_rename, viewGroup, false);
        this.f6521Q = (EditText) inflate.findViewById(R.id.name);
        this.f6521Q.setText(this.f6520P.getName());
        this.f6521Q.setOnEditorActionListener(new C2042e0(inflate));
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo7869a(Object obj) throws Exception {
        C8106a newBuilder = C8105i1.newBuilder();
        newBuilder.mo22148a(this.f6520P.getInboxUuid());
        newBuilder.setName(this.f6521Q.getText().toString());
        return C5448c.m15478a().chatGroupConversationUpdate((C8105i1) newBuilder.build());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7870a(View view, C8121j1 j1Var) throws Exception {
        C5343a.m15160U().mo12889h(this.f6520P.getOthersCount());
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        C1297b.m6236a(mo23920b());
        mo23946k().mo24014n();
    }
}
