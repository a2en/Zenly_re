package app.zenly.locator.privacy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0122a.C0123a;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.privacy.model.C5081c;
import app.zenly.locator.privacy.model.C5082d;
import app.zenly.locator.privacy.model.C5083e;
import app.zenly.locator.privacy.model.C5084f;
import app.zenly.locator.privacy.model.ICallbackUpdateUser;
import app.zenly.locator.privacy.p134z.C5123a;
import app.zenly.locator.privacy.p134z.C5128b;
import app.zenly.locator.privacy.view.ContactsCategorizationView;
import app.zenly.locator.privacy.view.ContactsCategorizationView.ContactCheckedChangedListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6980c3;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.privacy.y */
public class C5120y extends ZenlyController implements ICallbackUpdateUser {

    /* renamed from: P */
    private ContactsCategorizationView f13269P;

    /* renamed from: Q */
    private Map<Pair<UserProto$User, C6981a>, C5084f> f13270Q = new HashMap();

    /* renamed from: R */
    private C5093v f13271R;

    /* renamed from: S */
    private C5083e f13272S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public List<Pair<UserProto$User, C6981a>> f13273T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C5123a f13274U;

    /* renamed from: V */
    private ProgressBar f13275V;

    /* renamed from: W */
    private ScreenBar f13276W;

    /* renamed from: X */
    private TextView f13277X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public TextView f13278Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public View f13279Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public View f13280a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public View f13281b0;

    /* renamed from: c0 */
    private View f13282c0;

    /* renamed from: d0 */
    private View f13283d0;

    /* renamed from: e0 */
    private View f13284e0;

    /* renamed from: f0 */
    private View f13285f0;

    /* renamed from: g0 */
    private EmptyView f13286g0;

    /* renamed from: h0 */
    private final C12275b f13287h0 = new C12275b();

    /* renamed from: i0 */
    private FriendStore f13288i0;

    /* renamed from: j0 */
    private FriendshipStore f13289j0;

    /* renamed from: k0 */
    private ContactCheckedChangedListener f13290k0 = new C5122b();

    /* renamed from: app.zenly.locator.privacy.y$a */
    class C5121a implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ View f13291e;

        C5121a(View view) {
            this.f13291e = view;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f13291e.removeOnLayoutChangeListener(this);
            LayoutParams layoutParams = (LayoutParams) C5120y.this.f13279Z.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) C5120y.this.f13281b0.getLayoutParams();
            layoutParams.rightMargin = (((view.getWidth() - C5120y.this.f13280a0.getWidth()) / 2) / 2) - (C5120y.this.f13279Z.getWidth() / 2);
            layoutParams2.setMarginStart((((view.getWidth() - C5120y.this.f13280a0.getWidth()) / 2) / 2) - (C5120y.this.f13281b0.getWidth() / 2));
            C5120y.this.f13279Z.setLayoutParams(layoutParams);
            C5120y.this.f13281b0.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: app.zenly.locator.privacy.y$b */
    class C5122b implements ContactCheckedChangedListener {
        C5122b() {
        }

        public void onContactCheckedStateChanged(Pair<UserProto$User, C6981a> pair, boolean z) {
            if (z) {
                C5120y.this.f13273T.add(pair);
                if (C5120y.this.f13273T.size() == 1) {
                    C5120y.this.f13274U.mo12436b();
                }
            } else {
                C5120y.this.f13273T.remove(pair);
                if (C5120y.this.f13273T.size() == 0) {
                    C5120y.this.f13274U.mo12434a();
                }
            }
            int size = C5120y.this.f13273T.size();
            C5120y.this.f13278Y.setText(C5120y.this.mo23945j().getQuantityString(R.plurals.settings_ghost_title_selectedsetsettings, size, new Object[]{Integer.valueOf(size)}));
        }
    }

    /* renamed from: B */
    private void m14579B() {
        this.f13282c0.setOnClickListener(new C5088q(this));
        this.f13283d0.setOnClickListener(new C5086o(this));
        this.f13284e0.setOnClickListener(new C5089r(this));
    }

    /* renamed from: C */
    private C12279e<Boolean> m14580C() {
        C12279e a = this.f13289j0.friendshipsMap().mo36432a((Consumer<? super Throwable>) C5087p.f13170e);
        C5083e eVar = this.f13272S;
        eVar.getClass();
        return C12279e.m32610a((ObservableSource<? extends T1>) a.mo36455b((Consumer<? super T>) new C5092u<Object>(eVar)), (ObservableSource<? extends T2>) this.f13288i0.friends().mo36432a((Consumer<? super Throwable>) C5085n.f13168e).mo36455b((Consumer<? super T>) new C5090s<Object>(this)), (BiFunction<? super T1, ? super T2, ? extends R>) C5076k.f13149a);
    }

    /* renamed from: D */
    private void m14581D() {
        Map<Pair<UserProto$User, C6981a>, C5084f> map = this.f13270Q;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                Pair pair = (Pair) entry.getKey();
                ((C5084f) entry.getValue()).mo12329a(pair);
                m14584a(pair);
            }
            this.f13270Q.clear();
        }
    }

    /* renamed from: h */
    private void m14596h(View view) {
        this.f13272S = new C5083e();
        this.f13273T = new ArrayList();
        this.f13269P = (ContactsCategorizationView) view.findViewById(R.id.privacy_contacts_view);
        this.f13276W = (ScreenBar) view.findViewById(R.id.screen_bar);
        this.f13277X = (TextView) view.findViewById(R.id.headerGhostView);
        this.f13278Y = (TextView) view.findViewById(R.id.headerFriendsSelectedCount);
        this.f13279Z = view.findViewById(R.id.headerPreciseContainer);
        this.f13280a0 = view.findViewById(R.id.headerBlurredContainer);
        this.f13281b0 = view.findViewById(R.id.headerFrozenContainer);
        this.f13282c0 = view.findViewById(R.id.headerPreciseBtn);
        this.f13283d0 = view.findViewById(R.id.headerBlurredBtn);
        this.f13284e0 = view.findViewById(R.id.headerFrozenBtn);
        this.f13275V = (ProgressBar) view.findViewById(R.id.progress_bar_loading);
        this.f13286g0 = (EmptyView) view.findViewById(R.id.privacy_no_friends);
        this.f13285f0 = view.findViewById(R.id.header_container);
        C5123a aVar = new C5123a(this.f13276W, this.f13277X, this.f13278Y, this.f13279Z, this.f13280a0, this.f13281b0, this.f13285f0);
        this.f13274U = aVar;
        m14594e(false);
        m14579B();
        this.f13271R = new C5093v(view.getContext(), R.layout.view_contactsprivacy_category, this.f13272S.f13162a);
        this.f13269P.setActionModeCallback(this.f13290k0);
        this.f13269P.setAdapter(this.f13271R);
        this.f13287h0.add(m14580C().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5091t<Object>(this, view), (Consumer<? super Throwable>) new C5077l<Object>(this)));
        this.f13286g0.setTitle((CharSequence) C7709b.m18762a(mo23920b(), R.string.settings_ghost_title_emptynofriends));
    }

    /* renamed from: g */
    public /* synthetic */ void mo12431g(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        Resources resources = mo23920b().getResources();
        String[] strArr = {resources.getQuantityString(R.plurals.settings_ghost_alert_label_hours_unif, 2, new Object[]{Integer.valueOf(2)}), resources.getQuantityString(R.plurals.settings_ghost_alert_label_hours_unif, 8, new Object[]{Integer.valueOf(8)}), resources.getQuantityString(R.plurals.settings_ghost_alert_label_hours_unif, 24, new Object[]{Integer.valueOf(24)}), resources.getString(R.string.settings_ghost_button_forever)};
        C0123a aVar = new C0123a(view.getContext());
        aVar.mo539a(false);
        aVar.mo548c(R.string.settings_ghost_alert_title_setduration);
        aVar.mo540a((CharSequence[]) strArr, -1, (OnClickListener) new C5078m(this));
        aVar.mo550c();
    }

    public void onUpdateUserError() {
        m14581D();
    }

    public void onUpdateUserSuccess() {
        this.f13270Q.clear();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, 0, rect.right, rect.bottom);
        this.f13285f0.setPadding(0, rect.top, 0, 0);
    }

    /* renamed from: e */
    private void m14594e(boolean z) {
        int i = 4;
        this.f13276W.setVisibility(z ? 4 : 0);
        this.f13277X.setVisibility(z ? 4 : 0);
        this.f13278Y.setVisibility(z ? 0 : 4);
        this.f13279Z.setVisibility(z ? 0 : 4);
        this.f13280a0.setVisibility(z ? 0 : 4);
        View view = this.f13281b0;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        this.f13288i0 = a.provideFriendStore();
        this.f13289j0 = a.provideFriendshipStore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f13287h0.mo36401a();
        super.mo7066c(view);
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14585a(C5082d.Blurred, 172800000000L);
    }

    /* renamed from: b */
    private void m14588b(Context context) {
        this.f13272S.f13162a.clear();
        this.f13272S.f13162a.put(C5082d.Precise, new LinkedList());
        this.f13272S.f13162a.put(C5082d.Blurred, new LinkedList());
        this.f13272S.f13162a.put(C5082d.Frozen, new LinkedList());
        ArrayList arrayList = new ArrayList(this.f13272S.f13165d);
        Collections.sort(arrayList, C3205g.m10196e(C7713f.m18776a(context)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserProto$User userProto$User = (UserProto$User) it.next();
            C2991u0 u0Var = (C2991u0) this.f13272S.f13164c.get(userProto$User.getUuid());
            if (u0Var != null) {
                Pair create = Pair.create(userProto$User, u0Var.mo9175a().toBuilder());
                C5082d a = C5128b.m14615a(userProto$User, u0Var.mo9175a());
                C5082d dVar = C5082d.Blurred;
                if (a == dVar) {
                    ((List) this.f13272S.f13162a.get(dVar)).add(create);
                    this.f13272S.f13163b.put(create, C5082d.Blurred);
                } else {
                    C5082d dVar2 = C5082d.Frozen;
                    if (a == dVar2) {
                        ((List) this.f13272S.f13162a.get(dVar2)).add(create);
                        this.f13272S.f13163b.put(create, C5082d.Frozen);
                    } else {
                        ((List) this.f13272S.f13162a.get(C5082d.Precise)).add(create);
                        this.f13272S.f13163b.put(create, C5082d.Precise);
                    }
                }
            }
        }
        this.f13286g0.setVisibility(this.f13272S.f13165d.isEmpty() ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_privacy_friends, viewGroup, false);
        inflate.addOnLayoutChangeListener(new C5121a(inflate));
        m14596h(inflate);
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12428a(View view, Boolean bool) throws Exception {
        m14588b(view.getContext());
        this.f13269P.removeAllViews();
        this.f13271R.mo12338a(this.f13272S.f13162a);
        this.f13269P.setAdapter(this.f13271R);
        this.f13269P.mo12353b();
        this.f13275V.setVisibility(8);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14585a(C5082d.Precise, 0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12429a(Throwable th) throws Exception {
        this.f13275V.setVisibility(8);
        C12143a.m32032b(th, "Erreur observableZenlyContact", new Object[0]);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12427a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i == 0) {
            m14585a(C5082d.Frozen, 7200000);
        } else if (i == 1) {
            m14585a(C5082d.Frozen, 28800000);
        } else if (i == 2) {
            m14585a(C5082d.Frozen, 86400000);
        } else {
            m14585a(C5082d.Frozen, 172800000000L);
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<app.zenly.locator.core.store.api.a0>, for r3v0, types: [java.util.List, java.util.List<app.zenly.locator.core.store.api.a0>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo12430a(java.util.List<app.zenly.locator.core.store.api.C2936a0> r3) throws java.lang.Exception {
        /*
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r3.next()
            app.zenly.locator.core.store.api.a0 r1 = (app.zenly.locator.core.store.api.C2936a0) r1
            co.znly.models.UserProto$User r1 = r1.mo9074a()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            app.zenly.locator.privacy.model.e r3 = r2.f13272S
            r3.mo12327a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.privacy.C5120y.mo12430a(java.util.List):void");
    }

    /* renamed from: a */
    private void m14586a(List<Pair<UserProto$User, C6981a>> list, C5082d dVar, long j) {
        if (list != null) {
            for (Pair pair : list) {
                this.f13270Q.put(pair, new C5084f(pair));
                C5128b.m14616a(pair, dVar, j);
                Date timeNow = C5448c.m15478a().timeNow();
                if (dVar == C5082d.Frozen || dVar == C5082d.Blurred) {
                    ((C6981a) pair.second).mo18187a(Timestamp.newBuilder().setSeconds((timeNow.getTime() + j) / 1000));
                } else {
                    ((C6981a) pair.second).mo18186a();
                }
                m14584a(pair);
            }
        }
    }

    /* renamed from: a */
    private void m14584a(Pair<UserProto$User, C6981a> pair) {
        C5082d a = C5128b.m14615a((UserProto$User) pair.first, (C6980c3) ((C6981a) pair.second).build());
        C5082d dVar = (C5082d) this.f13272S.f13163b.get(pair);
        if (dVar == null || dVar.equals(a)) {
            if (dVar != null && dVar.equals(C5082d.Frozen)) {
                ((List) this.f13272S.f13162a.get(dVar)).remove(pair);
                ((List) this.f13272S.f13162a.get(dVar)).add(pair);
                this.f13269P.getAdapter().mo12340b();
            }
            return;
        }
        ((List) this.f13272S.f13162a.get(dVar)).remove(pair);
        ((List) this.f13272S.f13162a.get(a)).add(pair);
        this.f13272S.f13163b.put(pair, a);
        this.f13269P.getAdapter().mo12340b();
    }

    /* renamed from: a */
    private void m14585a(C5082d dVar, long j) {
        ArrayList arrayList = new ArrayList();
        if (this.f13270Q.size() > 0) {
            Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
            return;
        }
        m14586a(this.f13273T, dVar, j);
        for (Pair pair : this.f13273T) {
            arrayList.add(((UserProto$User) pair.first).getUuid());
        }
        C5081c.m14490a((String[]) arrayList.toArray(new String[arrayList.size()]), dVar, j, this);
        this.f13269P.mo12354c();
        this.f13273T.clear();
        this.f13274U.mo12434a();
    }
}
