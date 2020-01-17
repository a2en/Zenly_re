package app.zenly.locator.p135r;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.R;
import app.zenly.locator.brump.C1743e;
import app.zenly.locator.contactpicker.adapter.ContactAdapter;
import app.zenly.locator.contactpicker.adapter.ContactAdapter.Listener;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.C2420b;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.p068g0.C2593c;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.C3052n;
import app.zenly.locator.core.store.SuggestedStore;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.ContactSoonOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3227n;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.C3756e;
import app.zenly.locator.experimental.referrer.C3757f;
import app.zenly.locator.p135r.p137b1.C5139b;
import app.zenly.locator.p135r.p137b1.C5142c;
import app.zenly.locator.p135r.p137b1.C5143d;
import app.zenly.locator.p135r.p137b1.C5144e;
import app.zenly.locator.p135r.p137b1.C5145f;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.C7434p.C7436b;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p260i.C7689e;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.r.u0 */
public class C5194u0 extends ZenlyController implements Listener {

    /* renamed from: P */
    private final C12275b f13413P;

    /* renamed from: Q */
    private final int f13414Q;

    /* renamed from: R */
    private C3201f<C5139b> f13415R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ContactAdapter f13416S;

    /* renamed from: T */
    private final int[] f13417T;

    /* renamed from: U */
    private boolean f13418U;

    /* renamed from: V */
    private FriendStore f13419V;

    /* renamed from: W */
    private FriendRequestStore f13420W;

    /* renamed from: X */
    private ContactAlreadyOnZenlyStore f13421X;

    /* renamed from: Y */
    private ContactSoonOnZenlyStore f13422Y;

    /* renamed from: Z */
    private NavigationContract f13423Z;

    /* renamed from: a0 */
    private View f13424a0;

    /* renamed from: b0 */
    private ScreenBar f13425b0;

    /* renamed from: c0 */
    private SearchBar f13426c0;

    /* renamed from: d0 */
    private RecyclerView f13427d0;

    /* renamed from: app.zenly.locator.r.u0$a */
    class C5195a extends C7689e {
        C5195a() {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C5194u0.this.f13416S.getFilter().filter(charSequence);
        }
    }

    /* renamed from: app.zenly.locator.r.u0$b */
    static /* synthetic */ class C5196b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13429a = new int[C7436b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                co.znly.models.p$b[] r0 = p213co.znly.models.C7434p.C7436b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13429a = r0
                int[] r0 = f13429a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.p$b r1 = p213co.znly.models.C7434p.C7436b.SUGGESTTYPE_USER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13429a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.p$b r1 = p213co.znly.models.C7434p.C7436b.SUGGESTTYPE_CONTACT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p135r.C5194u0.C5196b.<clinit>():void");
        }
    }

    public C5194u0(int i) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9607a("contact_picker_type", i);
        this(dVar.mo9605a());
    }

    /* renamed from: D */
    private C12279e<C5145f> m14728D() {
        List list;
        C5144e eVar = new C5144e();
        C12279e i = this.f13420W.friendRequests().mo36432a((Consumer<? super Throwable>) C5204w.f13443e).mo36455b((Consumer<? super T>) new C5148c<Object>(eVar)).mo36501i(C5187r.f13406e);
        C12279e i2 = C5448c.m15478a().contactsStream().mo36459b((Predicate<? super T>) C5175l.f13394e).mo36455b((Consumer<? super T>) new C5186q0<Object>(eVar)).mo36432a((Consumer<? super Throwable>) C5191t.f13410e).mo36501i(C5173k.f13392e);
        C12279e i3 = SuggestedStore.m9424a().mo36432a((Consumer<? super Throwable>) C5208y.f13446e).mo36455b((Consumer<? super T>) new C5149c0<Object>(eVar)).mo36501i(C5165g.f13384e);
        C12279e i4 = this.f13419V.friends().mo36432a((Consumer<? super Throwable>) C5212z.f13454e).mo36455b((Consumer<? super T>) new C5169i<Object>(eVar)).mo36501i(C5136b.f13315e);
        C12279e i5 = this.f13421X.contactsAlreadyOnZenly().mo36432a((Consumer<? super Throwable>) C5197v.f13430e).mo36455b((Consumer<? super T>) new C5190s0<Object>(eVar)).mo36501i(C5161e.f13380e);
        C12279e i6 = this.f13422Y.contactsSoonOnZenly().mo36432a((Consumer<? super Throwable>) C5132a0.f13311e).mo36455b((Consumer<? super T>) new C5137b0<Object>(eVar)).mo36501i(C5163f.f13382e);
        C12279e b = C12279e.m32616a((Callable<? extends T>) new C5189s<Object>(this)).mo36432a((Consumer<? super Throwable>) C5185q.f13404e).mo36455b((Consumer<? super T>) new C5188r0<Object>(eVar)).mo36501i(C5159d.f13378e).mo36452b(C12802a.m33490a());
        C12279e b2 = C12279e.m32616a((Callable<? extends T>) new C5183p<Object>(this)).mo36432a((Consumer<? super Throwable>) C5193u.f13412e).mo36455b((Consumer<? super T>) new C5162e0<Object>(eVar)).mo36501i(C5179n.f13398e).mo36452b(C12802a.m33490a());
        C3757f fVar = new C3757f(C5407g.m15386a((Context) mo9304A()).mo12986h(), new C3756e(), C5448c.m15478a(), C3015a.m9526a(mo9304A()).provideFriendRequestStore(), C2666b.m9049a(mo9304A()).mo8763a());
        C12279e i7 = fVar.mo10314a(false).mo36455b((Consumer<? super T>) new C5131a<Object>(eVar)).mo36501i(C5177m.f13396e);
        if (this.f13414Q == 2) {
            list = C3227n.m10229a((T[]) new C12279e[]{i5, i6, i2, i4, i, i7});
        } else {
            list = C3227n.m10229a((T[]) new C12279e[]{i, i6, i3, b, b2});
        }
        return C12279e.m32624c((Iterable<? extends ObservableSource<? extends T>>) list).mo36501i(new C5167h(eVar)).mo36492f(100, TimeUnit.MILLISECONDS).mo36485d(eVar.mo12495a()).mo36501i(C5184p0.f13403e);
    }

    /* renamed from: B */
    public /* synthetic */ Boolean mo7192B() throws Exception {
        C2594d dVar = new C2594d(C5407g.m15386a((Context) mo9304A()).mo12986h());
        C1322a a = C3444a.m10686a(mo9304A());
        return Boolean.valueOf(C2593c.m8906a(a, dVar) || a.mo6511a("feature:SocialNetworkInOnboarding"));
    }

    /* renamed from: C */
    public /* synthetic */ List mo12535C() throws Exception {
        return C2545e0.m8883a(mo9304A(), Locale.getDefault(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            this.f13423Z = (NavigationContract) mo23947l();
        }
        this.f13413P.add(m14728D().mo36501i(new C5171j(this)).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5181o<Object>(this), (Consumer<? super Throwable>) C5206x.f13445e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f13427d0.setAdapter(null);
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f13413P.mo36401a();
        this.f13423Z = null;
        super.mo7053d(view);
    }

    public void onAddBumpClick() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        C5343a.m15160U().mo12880f();
        C1743e B = C1743e.m7135B();
        B.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) B);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    public void onAddContactsClick() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        C5194u0 u0Var = new C5194u0(2);
        u0Var.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) u0Var);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    public void onAddPhoneClick() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        C5343a.m15160U().mo12884g();
        C5198v0 C = C5198v0.m14764C();
        C.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) C);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    public void onAddUsernameClick() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        C5343a.m15160U().mo12888h();
        C5213z0 E = C5213z0.m14818E();
        E.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) E);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    public void onItemAddClick(C5139b bVar) {
    }

    public void onItemClick(C5139b bVar) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        if (this.f13423Z != null) {
            if (bVar.mo12482e() == C5142c.SUGGESTED) {
                C5343a.m15160U().mo12792G();
            }
            if (bVar.mo12484g() != null) {
                this.f13423Z.onContactPickerUserSelected(bVar.mo12484g());
            } else {
                this.f13423Z.onContactPickerContactSelected(bVar.mo12471a());
            }
        }
    }

    public void onItemDismissed(C5139b bVar) {
        if (bVar.mo12484g() != null) {
            SuggestedStore.m9428a(C3052n.m9579a(bVar.mo12484g()));
            C5343a.m15160U().mo12883f(true);
            return;
        }
        SuggestedStore.m9428a(C3052n.m9580a(bVar.mo12471a()));
        C5343a.m15160U().mo12883f(false);
    }

    public void onItemsSelected(int i) {
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        View view2 = this.f13424a0;
        view2.setPadding(rect.left, rect.top, rect.right, view2.getPaddingBottom());
        RecyclerView recyclerView = this.f13427d0;
        recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        this.f13419V = a.provideFriendStore();
        this.f13420W = a.provideFriendRequestStore();
        this.f13421X = a.provideAlreadyOnZenlyStore();
        this.f13422Y = a.provideSoonOnZenlyStore();
    }

    public C5194u0(Bundle bundle) {
        super(bundle);
        this.f13413P = new C12275b();
        this.f13414Q = bundle.getInt("contact_picker_type");
        int i = this.f13414Q;
        if (i == 2) {
            this.f13417T = new int[]{20, 30};
        } else if (i == 1) {
            this.f13417T = new int[]{50, 40};
            this.f13418U = true;
        } else {
            throw new IllegalArgumentException("Unknown contact picker state");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_contact_picker, viewGroup, false);
        this.f13415R = C5139b.m14652a(C7713f.m18776a(inflate.getContext()));
        this.f13424a0 = inflate.findViewById(R.id.contact_picker_header);
        this.f13427d0 = (RecyclerView) inflate.findViewById(R.id.contact_picker_recycler);
        this.f13425b0 = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f13426c0 = (SearchBar) inflate.findViewById(R.id.search_bar);
        int i = mo23933c().getInt("contact_picker_type");
        if (i == 2) {
            this.f13425b0.setTitle((int) R.string.inbox_contactpicker_button_addcontacts);
            this.f13426c0.setVisibility(0);
        } else if (i == 1) {
            this.f13425b0.setTitle((int) R.string.add_friends_title);
        }
        this.f13426c0.mo6898a((TextWatcher) new C5195a());
        ContactAdapter contactAdapter = new ContactAdapter(new C2477e(mo23920b()), mo23920b(), this.f13413P, C2538c0.m8837a(mo23920b()), false, true, false, this.f13414Q != 2, true);
        this.f13416S = contactAdapter;
        this.f13416S.mo8327a((Listener) this);
        this.f13427d0.setAdapter(this.f13416S);
        this.f13427d0.mo5045a((C1074l) new C2420b(this.f13416S));
        return inflate;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m14740a(C7339i iVar) throws Exception {
        return iVar.getPhoneNumbersCount() > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5143d m14730a(C5145f fVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C2935a aVar : fVar.mo12510b()) {
            C5139b bVar = new C5139b(C5142c.ALREADY_ON_ZENLY);
            bVar.mo12474a(aVar.mo9069a());
            bVar.mo12473a(aVar.mo9070b());
            if (!fVar.mo12511b(bVar)) {
                arrayList.add(bVar);
            }
        }
        for (C7339i iVar : fVar.mo12508a()) {
            C5139b bVar2 = new C5139b(C5142c.CONTACTS);
            bVar2.mo12474a(iVar);
            UserProto$User a = fVar.mo12506a(bVar2);
            if (a != null) {
                bVar2.mo12473a(a);
                bVar2.mo12476a(true);
            } else {
                UserProto$User a2 = fVar.mo12507a(iVar);
                if (a2 != null) {
                    bVar2.mo12473a(a2);
                } else {
                    bVar2.mo12472a(fVar.mo12509b(iVar));
                }
                bVar2.mo12478b(fVar.mo12511b(bVar2));
            }
            arrayList2.add(bVar2);
        }
        UserProto$User e = fVar.mo12514e();
        for (C7434p pVar : fVar.mo12516g()) {
            int i = C5196b.f13429a[pVar.getType().ordinal()];
            if (i == 1) {
                C5139b bVar3 = new C5139b(C5142c.SUGGESTED);
                bVar3.mo12473a(pVar.getUser());
                if (!fVar.mo12511b(bVar3) && (e == null || !e.getUuid().equals(pVar.getUser().getUuid()))) {
                    arrayList3.add(bVar3);
                }
            } else if (i == 2) {
                C5139b bVar4 = new C5139b(C5142c.SUGGESTED);
                bVar4.mo12474a(pVar.getContact());
                if (!fVar.mo12511b(bVar4) && (e == null || !e.getUuid().equals(pVar.getUser().getUuid()))) {
                    bVar4.mo12472a(fVar.mo12509b(pVar.getContact()));
                    arrayList3.add(bVar4);
                }
            }
        }
        Collections.sort(arrayList2, this.f13415R);
        Collections.sort(arrayList, this.f13415R);
        C5143d dVar = new C5143d(e, arrayList, arrayList3, arrayList2, (fVar.mo12512c() || C3444a.m10686a(mo9304A()).mo6511a("feature:SocialNetworkInOnboarding")) ? fVar.mo12515f() : Collections.emptyList());
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14736a(C5143d dVar) {
        int[] iArr;
        this.f13416S.mo8324a();
        if (this.f13418U) {
            this.f13416S.mo8332a(new C5139b(C5142c.ADD_CONTACTS));
            this.f13416S.mo8332a(new C5139b(C5142c.ADD_BY_USERNAME));
            this.f13416S.mo8332a(new C5139b(C5142c.ADD_BY_PHONE_NUMBER));
            this.f13416S.mo8332a(new C5139b(C5142c.ADD_BY_BUMP));
        }
        UserProto$User c = dVar.mo12492c();
        if (c != null) {
            C5139b bVar = new C5139b(C5142c.REFERRER);
            bVar.mo12473a(c);
            bVar.mo12479c(true);
            this.f13416S.mo8332a(bVar);
        }
        for (int i : this.f13417T) {
            if (i == 50 && !dVar.mo12493d().isEmpty()) {
                C5139b bVar2 = new C5139b(C5142c.BROADCAST_INVITE);
                bVar2.mo12475a(dVar.mo12493d());
                this.f13416S.mo8332a(bVar2);
            } else if (i == 20 && !dVar.mo12490a().isEmpty()) {
                this.f13416S.mo8335a(dVar.mo12490a());
            } else if (i == 30 && !dVar.mo12491b().isEmpty()) {
                this.f13416S.mo8335a(dVar.mo12491b());
            } else if (i == 40 && !dVar.mo12494e().isEmpty()) {
                this.f13416S.mo8335a(dVar.mo12494e());
            }
        }
        this.f13416S.notifyDataSetChanged();
    }
}
