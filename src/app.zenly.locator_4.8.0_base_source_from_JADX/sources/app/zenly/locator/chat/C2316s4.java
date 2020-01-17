package app.zenly.locator.chat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.C0514a;
import androidx.core.content.C0540a;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.chat.capsules.C1914o;
import app.zenly.locator.chat.capsules.C1941t;
import app.zenly.locator.chat.capsules.CapsulesViewController;
import app.zenly.locator.chat.capsules.CapsulesViewController.OnEmojiAnimationsOverCallback;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.chat.content.MediaHandler;
import app.zenly.locator.chat.content.MemberHandler;
import app.zenly.locator.chat.content.MessageHandler;
import app.zenly.locator.chat.content.MessageWindowHandler;
import app.zenly.locator.chat.contract.ChatContract;
import app.zenly.locator.chat.emojis.C1967a;
import app.zenly.locator.chat.emojis.C1978b;
import app.zenly.locator.chat.p047i5.C2009a;
import app.zenly.locator.chat.p048j5.C2017b;
import app.zenly.locator.chat.p052l5.C2085a;
import app.zenly.locator.chat.p052l5.C2087b;
import app.zenly.locator.chat.p053m5.C2097a;
import app.zenly.locator.chat.p054n5.C2105a;
import app.zenly.locator.chat.p054n5.C2112c;
import app.zenly.locator.chat.p055o5.C2166k;
import app.zenly.locator.chat.p055o5.C2182l;
import app.zenly.locator.chat.p056p5.C2197a;
import app.zenly.locator.chat.p056p5.C2205b;
import app.zenly.locator.chat.p058q5.C2286a;
import app.zenly.locator.chat.p058q5.C2294c;
import app.zenly.locator.chat.p059r5.C2310f;
import app.zenly.locator.chat.p060s5.C2321a;
import app.zenly.locator.chat.panel.C2216b;
import app.zenly.locator.chat.panel.ChatPanelHelper;
import app.zenly.locator.chat.panel.ChatPanelHelper.C2214e;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnActionListener;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnActionListener.C2209a;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnPanelDragListener;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnStateChangeListener;
import app.zenly.locator.chat.panel.emojis.EmojiPackController;
import app.zenly.locator.chat.panel.emojis.EmojiPackController.Callback;
import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import app.zenly.locator.chat.view.ComposeView;
import app.zenly.locator.chat.view.ComposeView.C2353g;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.contracts.NavigationContract.C2467a;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.helper.C2515f;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.C2931a;
import app.zenly.locator.core.store.C3034i;
import app.zenly.locator.core.store.C3045k;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3199e;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.core.widget.C3273h;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.map.C4290s0;
import app.zenly.locator.media.C4473v0;
import app.zenly.locator.media.MediaViewerActivity;
import app.zenly.locator.media.TakePictureActivity;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5351h;
import app.zenly.locator.p143s.C5343a.C5353j;
import app.zenly.locator.p143s.C5343a.C5354k;
import app.zenly.locator.p143s.C5343a.C5356m;
import app.zenly.locator.p143s.C5343a.C5358o;
import app.zenly.locator.p143s.C5343a.C5365v;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import app.zenly.locator.p210z.C6309a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8815b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7354j0;
import p213co.znly.models.core.C7117i;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p333g.p369e.p372c.p374c.p375a.p376a.C12110b;
import p333g.p369e.p372c.p374c.p375a.p376a.C12114d;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.chat.s4 */
public final class C2316s4 extends ZenlyController implements ChatContract, Callback, OnActionListener {

    /* renamed from: A0 */
    private boolean f6981A0;

    /* renamed from: B0 */
    private final MessageHandler f6982B0 = new C1996h(this);

    /* renamed from: C0 */
    private final MessageHandler f6983C0 = new C1951d0(this);

    /* renamed from: D0 */
    private final MessageWindowHandler f6984D0 = new C2079l(this);

    /* renamed from: E0 */
    private final MessageHandler f6985E0 = new C2003i(this);

    /* renamed from: F0 */
    private final MediaHandler f6986F0 = new C2311s(this);

    /* renamed from: G0 */
    private final MemberHandler f6987G0 = new C1950d(this);

    /* renamed from: H0 */
    private final MemberHandler f6988H0 = new C1888c0(this);

    /* renamed from: I0 */
    private final OnEmojiAnimationsOverCallback f6989I0 = new C2091m(this);

    /* renamed from: J0 */
    private View f6990J0;

    /* renamed from: K0 */
    private OnLayoutChangeListener f6991K0;

    /* renamed from: L0 */
    private boolean f6992L0 = false;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final int f6993P;

    /* renamed from: Q */
    private C7117i f6994Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f6995R;

    /* renamed from: S */
    private C7339i f6996S;

    /* renamed from: T */
    private C2097a f6997T;

    /* renamed from: U */
    private MeUserManager f6998U;

    /* renamed from: V */
    private C2718k5 f6999V;

    /* renamed from: W */
    private ChatPresenter f7000W;

    /* renamed from: X */
    private C1967a f7001X;

    /* renamed from: Y */
    private C2197a f7002Y;

    /* renamed from: Z */
    private C2087b f7003Z;

    /* renamed from: a0 */
    private C2105a f7004a0;

    /* renamed from: b0 */
    private C2286a f7005b0;

    /* renamed from: c0 */
    private C1914o f7006c0;

    /* renamed from: d0 */
    private CapsulesViewController f7007d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public ChatPanelHelper f7008e0;

    /* renamed from: f0 */
    private final boolean f7009f0;

    /* renamed from: g0 */
    private NavigationContract f7010g0;

    /* renamed from: h0 */
    private C5569a f7011h0;

    /* renamed from: i0 */
    private C2335u4 f7012i0;

    /* renamed from: j0 */
    private RecyclerView f7013j0;

    /* renamed from: k0 */
    private C2166k f7014k0;

    /* renamed from: l0 */
    private ImageView f7015l0;

    /* renamed from: m0 */
    private View f7016m0;

    /* renamed from: n0 */
    private ComposeView f7017n0;

    /* renamed from: o0 */
    private C1978b f7018o0;

    /* renamed from: p0 */
    private ViewGroup f7019p0;

    /* renamed from: q0 */
    private C2205b f7020q0;

    /* renamed from: r0 */
    private LinearLayoutManager f7021r0;

    /* renamed from: s0 */
    private C1956d5 f7022s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public final C12789c<C2097a> f7023t0 = C12789c.m33462s();
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public final C12789c<Boolean> f7024u0 = C12789c.m33462s();

    /* renamed from: v0 */
    private final C12789c<C1949d> f7025v0 = C12789c.m33462s();

    /* renamed from: w0 */
    private final C12789c<C1949d> f7026w0 = C12789c.m33462s();

    /* renamed from: x0 */
    private final C12785a<Boolean> f7027x0 = C12785a.m33446h(Boolean.valueOf(false));

    /* renamed from: y0 */
    private final C12275b f7028y0 = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public boolean f7029z0;

    /* renamed from: app.zenly.locator.chat.s4$a */
    class C2317a extends C1076n {

        /* renamed from: a */
        final /* synthetic */ C1995g5 f7030a;

        C2317a(C2316s4 s4Var, C1995g5 g5Var) {
            this.f7030a = g5Var;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.f7030a.mo7812a();
        }
    }

    /* renamed from: app.zenly.locator.chat.s4$b */
    class C2318b implements ComposeView.OnActionListener {
        C2318b() {
        }

        public void onEmojiButtonClicked() {
            C5498a.m15600a((Context) C2316s4.this.mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C2316s4.this.f7008e0.mo8059l();
        }

        public void onFocusChanged(boolean z) {
            if (z) {
                C2316s4.this.f7008e0.mo8052e();
            }
        }

        public void onInputClicked() {
            C5343a.m15160U().mo12899l();
            C5498a.m15600a((Context) C2316s4.this.mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C2316s4.this.f7008e0.mo8057j();
        }

        public void onMediaButtonClicked() {
            C5498a.m15600a((Context) C2316s4.this.mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C2316s4.this.mo23903a(TakePictureActivity.m13165a((Context) C2316s4.this.mo23920b()), 1);
            C5343a.m15160U().mo12869c("chat");
        }

        public void onMeetButtonClicked() {
            C2316s4.this.m8221W();
        }

        public void onMessageSend(C2097a aVar, C2353g gVar) {
            C2316s4.this.f7023t0.onNext(aVar);
            String str = aVar.f6584b;
            C5343a.m15160U().mo12809a(str != null ? str.length() : 0, gVar == C2353g.BUTTON ? C5356m.BUTTON : C5356m.KEYBOARD, C2316s4.this.f6993P == 1 ? C5358o.GROUP : C5358o.INDIV, C2316s4.this.f7029z0, C2316s4.this.f6995R != null);
        }

        public void onMessageTyped(CharSequence charSequence) {
            if (!TextUtils.isEmpty(charSequence)) {
                C2316s4.this.f7024u0.onNext(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.s4$c */
    class C2319c extends C1076n {

        /* renamed from: a */
        private boolean f7032a = false;

        /* renamed from: b */
        final /* synthetic */ C2182l f7033b;

        C2319c(C2316s4 s4Var, C2182l lVar) {
            this.f7033b = lVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            boolean z = !recyclerView.canScrollVertically(1);
            boolean z2 = i2 < 0;
            if (z) {
                if (!this.f7032a) {
                    this.f7032a = true;
                    this.f7033b.mo8005a();
                }
            } else if (z2 && this.f7032a) {
                this.f7032a = false;
                this.f7033b.mo8010b();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.s4$d */
    static /* synthetic */ class C2320d {

        /* renamed from: a */
        static final /* synthetic */ int[] f7034a = new int[C2214e.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                app.zenly.locator.chat.panel.ChatPanelHelper$e[] r0 = app.zenly.locator.chat.panel.ChatPanelHelper.C2214e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7034a = r0
                int[] r0 = f7034a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.chat.panel.ChatPanelHelper$e r1 = app.zenly.locator.chat.panel.ChatPanelHelper.C2214e.USER_FOCUS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7034a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.chat.panel.ChatPanelHelper$e r1 = app.zenly.locator.chat.panel.ChatPanelHelper.C2214e.CHAT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.C2316s4.C2320d.<clinit>():void");
        }
    }

    public C2316s4(Bundle bundle) {
        String str = "KEY_CONTACT";
        String str2 = "KEY_CONVERSATION";
        super(bundle);
        try {
            if (bundle.containsKey(str2)) {
                byte[] byteArray = bundle.getByteArray(str2);
                if (byteArray != null) {
                    this.f6994Q = C7117i.parseFrom(byteArray);
                    if (!this.f6994Q.getIsGroup() && this.f6994Q.getOthersCount() > 0) {
                        this.f6995R = this.f6994Q.getOthers(0).getUserUuid();
                    }
                }
            } else if (bundle.containsKey(str)) {
                byte[] byteArray2 = bundle.getByteArray(str);
                if (byteArray2 != null) {
                    this.f6996S = C7339i.parseFrom(byteArray2);
                }
            } else {
                throw new IllegalArgumentException("Chat created without conversation or contact");
            }
        } catch (Exception e) {
            C12143a.m32028a((Throwable) e);
        }
        C7117i iVar = this.f6994Q;
        if (iVar != null) {
            this.f6993P = iVar.getIsGroup() ? 1 : 0;
        } else {
            this.f6993P = 2;
        }
        this.f7009f0 = bundle.getBoolean("KEY_START_IN_FULL_SCREEN", false);
        this.f7027x0.onNext(Boolean.valueOf(bundle.getBoolean("KEY_DELAY_EMOJIS_RECEPTION", false)));
    }

    /* renamed from: U */
    private C5354k m8219U() {
        int i = this.f6993P;
        if (i == 1) {
            return C5354k.GROUP;
        }
        if (i != 0 || !this.f7029z0) {
            return C5354k.FOG;
        }
        return C5354k.INDIV;
    }

    /* renamed from: V */
    private boolean m8220V() {
        return mo23896a(this.f7019p0).mo24003c() > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m8221W() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f7008e0.mo8058k();
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onChatMeetClick(this.f6995R);
        }
    }

    /* renamed from: X */
    private void m8222X() {
        m8233c(0);
    }

    /* renamed from: Y */
    private void m8223Y() {
        this.f6992L0 = true;
        this.f6998U.mo8758b(true);
        this.f7000W.subscribe();
        C1914o oVar = this.f7006c0;
        if (oVar != null) {
            oVar.mo7658a();
        }
        C2166k kVar = this.f7014k0;
        if (kVar != null) {
            kVar.mo7993a();
        }
        C1967a aVar = this.f7001X;
        if (aVar != null) {
            aVar.mo7789a();
        }
        C2197a aVar2 = this.f7002Y;
        if (aVar2 != null) {
            aVar2.mo8022a();
        }
        C2286a aVar3 = this.f7005b0;
        if (aVar3 != null) {
            aVar3.mo8146a();
        }
        C1956d5 d5Var = this.f7022s0;
        if (d5Var != null) {
            d5Var.mo7782v();
        }
        C2097a aVar4 = this.f6997T;
        if (aVar4 != null) {
            this.f7023t0.onNext(aVar4);
            this.f6997T = null;
        }
    }

    /* renamed from: Z */
    private void m8224Z() {
        this.f6992L0 = false;
        this.f6998U.mo8758b(false);
        this.f7028y0.mo36401a();
        C1967a aVar = this.f7001X;
        if (aVar != null) {
            aVar.mo7790b();
        }
        C2197a aVar2 = this.f7002Y;
        if (aVar2 != null) {
            aVar2.mo8023b();
        }
        C2166k kVar = this.f7014k0;
        if (kVar != null) {
            kVar.mo7994b();
        }
        C1914o oVar = this.f7006c0;
        if (oVar != null) {
            oVar.mo7660b();
        }
        C2286a aVar3 = this.f7005b0;
        if (aVar3 != null) {
            aVar3.mo8147b();
        }
        this.f7000W.unsubscribe();
        C1956d5 d5Var = this.f7022s0;
        if (d5Var != null) {
            d5Var.mo7783w();
            if (this.f7017n0 != null) {
                C7117i iVar = this.f6994Q;
                if (iVar != null) {
                    this.f7022s0.mo7737a(iVar.getInboxUuid(), this.f7017n0.getText());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo7192B() {
        mo8166F().mo8238a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public C12279e<C1949d> mo8163C() {
        return this.f7025v0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo8164D() {
        this.f7015l0.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public int mo8165E() {
        return this.f7021r0.mo4976J();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public C2345v4 mo8166F() {
        return this.f7012i0.mo8227a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo8167G() {
        if (this.f7012i0.getItemCount() > 0) {
            mo8169I();
        } else {
            mo8164D();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public boolean mo8168H() {
        return mo8166F().mo8245c() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo8169I() {
        this.f7015l0.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public boolean mo8170J() {
        return mo8165E() == 0;
    }

    /* renamed from: K */
    public C12279e<String> mo8171K() {
        return C12114d.m31980a(this.f7013j0).mo36459b((Predicate<? super T>) new C2280q<Object>(this)).mo36492f(100, TimeUnit.MILLISECONDS).mo36501i(new C2027k(this)).mo36455b((Consumer<? super T>) C2340v.f7098e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public void mo8172L() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.MEDIUM, C5500b.CHAT);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public C12279e<C1949d> mo8173M() {
        return C12114d.m31980a(this.f7013j0).mo36501i(new C1881b0(this)).mo36492f(100, TimeUnit.MILLISECONDS).mo36459b((Predicate<? super T>) new C1874a0<Object>(this)).mo36501i(new C1982f(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo8174N() {
        C5343a.m15160U().mo12868c(this.f6994Q.getOthersCount());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public C12279e<C1949d> mo8175O() {
        return this.f7026w0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public C12279e<C2097a> mo8176P() {
        return this.f7023t0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public void mo8177Q() {
        Toast.makeText(mo23920b(), R.string.chat_deletedialog_title_messagedeleted, 0).show();
    }

    /* renamed from: R */
    public void mo8178R() {
        C5343a.m15160U().mo12830a(C5365v.TALKED_TO_NON_FRIENDS_RATE_LIMITED);
        C1297b.m6236a(mo23920b());
        C3106c cVar = new C3106c(mo23920b());
        cVar.mo9331a(2131231602);
        cVar.mo9349f((int) R.string.chat_modal_abuse_title);
        cVar.mo9348e((int) R.string.chat_modal_abuse_message);
        cVar.mo9345c((int) R.string.chat_modal_abuse_button);
        cVar.mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public C12279e<Boolean> mo8179S() {
        return this.f7024u0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public void mo8180T() {
        int J = this.f7021r0.mo4976J();
        int K = this.f7021r0.mo4977K();
        for (int max = Math.max(0, J); max <= K; max++) {
            this.f7012i0.notifyItemChanged(max, C2338c.CURSORS);
        }
    }

    public void dismiss(boolean z) {
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onChatDismissed(z);
        }
    }

    public void enableEmojisReception() {
        this.f7027x0.onNext(Boolean.valueOf(false));
    }

    public C7339i getContact() {
        return this.f6996S;
    }

    public C7117i getConversation() {
        return this.f6994Q;
    }

    public String getUserUuid() {
        return this.f6995R;
    }

    /* renamed from: h */
    public /* synthetic */ void mo8212h(View view) {
        C5343a.m15160U().mo12901m();
        this.f7008e0.mo8049b(C2214e.CHAT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0.mo8051d() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleBack() {
        /*
            r1 = this;
            boolean r0 = r1.m8220V()
            if (r0 != 0) goto L_0x0010
            app.zenly.locator.chat.panel.ChatPanelHelper r0 = r1.f7008e0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo8051d()
            if (r0 != 0) goto L_0x0016
        L_0x0010:
            boolean r0 = super.handleBack()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.C2316s4.handleBack():boolean");
    }

    /* renamed from: i */
    public /* synthetic */ void mo8213i(View view) {
        this.f6988H0.invoke(this.f6995R);
    }

    /* renamed from: j */
    public /* synthetic */ void mo8214j(View view) {
        m8221W();
    }

    /* renamed from: k */
    public /* synthetic */ void mo8215k(View view) {
        this.f7008e0.mo8058k();
        onFullChatClosed(C2209a.STATUS);
    }

    public /* synthetic */ void onEmojiPanelClosed() {
        C2216b.$default$onEmojiPanelClosed(this);
    }

    public void onEmojiPanelOpened(boolean z) {
        C5343a.m15160U().mo12822a(z ? C5351h.SWIPE : C5351h.BUTTON_TAP, this.f7008e0.mo8048b() == C2214e.CHAT);
    }

    public void onEmojiSent(Point point, Bitmap bitmap, float f) {
        this.f7018o0.mo7803a(point, bitmap, f);
    }

    public void onEmojiSentQuarantineError() {
        mo8178R();
    }

    public void onEmojisBulkSent(int i) {
        C5343a.m15160U().mo12854a(this.f7008e0.mo8053f(), this.f7008e0.mo8048b() == C2214e.CHAT, this.f7029z0, i, this.f6993P == 1);
    }

    public void onFullChatClosed(C2209a aVar) {
        C5343a.m15160U().mo12824a(m8225a(aVar));
    }

    public void onFullChatOpen() {
        C5343a.m15160U().mo12825a(m8219U());
    }

    public void onFullscreenChanged(boolean z) {
        this.f6981A0 = z;
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onControllerOpacityChange(this);
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.grid_size_900);
        RecyclerView recyclerView = this.f7013j0;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), rect.top + dimensionPixelOffset, this.f7013j0.getPaddingRight(), this.f7013j0.getPaddingBottom());
        ComposeView composeView = this.f7017n0;
        composeView.setPadding(composeView.getPaddingLeft(), this.f7017n0.getPaddingTop(), this.f7017n0.getPaddingRight(), rect.bottom);
        View view2 = this.f7016m0;
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), rect.top, this.f7016m0.getPaddingRight(), this.f7016m0.getPaddingBottom());
        }
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, view.getPaddingBottom());
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f7013j0.getLayoutParams();
        marginLayoutParams.topMargin = rect.bottom;
        this.f7013j0.setLayoutParams(marginLayoutParams);
        this.f7008e0.mo8056i();
    }

    public void popLocationDisabledDialog() {
        C2205b bVar = this.f7020q0;
        if (bVar != null) {
            bVar.mo8034c();
        }
    }

    public void updateMapPadding(int i) {
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onChatHeightChanged(i);
        }
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return this.f6981A0;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8185a(C1949d dVar) {
        C3199e.m10178a(mo23920b(), dVar.f6310c.getContent(0).getText());
    }

    /* renamed from: b */
    public /* synthetic */ void mo8202b(C1949d dVar) {
        mo8166F().mo8251e(dVar);
        this.f7025v0.onNext(dVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo8204c(C1949d dVar) {
        this.f7026w0.onNext(dVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo8205d(C1949d dVar) {
        dVar.mo7718i();
        mo8166F().mo8249d(dVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo8208e(String str) {
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onChatClick(C2467a.MINI_AVATAR, str);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onChatClick(C2467a.PROFILE, this.f6995R);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void mo8211g(View view) {
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onGroupChatInfoClick(this.f6994Q);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8186a(C1949d dVar, List list) {
        C1297b.m6236a(mo23920b());
        C6309a.m17377a(this.f7010g0, this.f6994Q.getInboxUuid(), dVar, list, new C2113o(this, dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        view.removeOnLayoutChangeListener(this.f6991K0);
        C2087b bVar = this.f7003Z;
        if (bVar != null) {
            bVar.mo7894b();
        }
        C2105a aVar = this.f7004a0;
        if (aVar != null) {
            aVar.mo7905b();
        }
        this.f7013j0.setAdapter(null);
        CapsulesViewController capsulesViewController = this.f7007d0;
        if (capsulesViewController != null) {
            capsulesViewController.mo7629a();
        }
        this.f7008e0.mo8055h();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            this.f7010g0 = (NavigationContract) mo23947l();
        }
        if (!this.f6992L0) {
            m8223Y();
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo8206d(String str) {
        NavigationContract navigationContract = this.f7010g0;
        if (navigationContract != null) {
            navigationContract.onGroupChatMemberClick(str);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        if (this.f6981A0) {
            C5343a.m15160U().mo12824a(m8225a(C2209a.BUTTON_TAP));
        }
        dismiss(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8210f(String str) {
        this.f7008e0.mo8046a((C8819d) this, str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8193a(C7354j0 j0Var, ImageView imageView) {
        Intent intent;
        if (!C3245z.m10286e(j0Var.getValidUntil())) {
            intent = C4473v0.m13255a((Context) mo23920b(), this.f6994Q.getInboxUuid(), j0Var);
            if (intent == null) {
                return;
            }
        } else {
            intent = MediaViewerActivity.m13119a(mo23920b(), j0Var);
        }
        C0514a a = C2515f.m8772a(mo23920b(), imageView, ViewCompat.m2867t(imageView));
        C2515f.m8774a(mo23920b(), intent);
        try {
            C0540a.m2540a((Context) mo23920b(), intent, a.mo3028a());
        } catch (Throwable unused) {
            mo23902a(intent);
        }
        C5343a.m15160U().mo12861b(j0Var.getType());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f7010g0 = null;
        if (this.f6992L0) {
            m8224Z();
        }
        super.mo7053d(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8207e(C1949d dVar) {
        mo8166F().mo8252f(dVar);
        m8233c(mo8166F().mo8242b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8201b(int i) {
        this.f7015l0.setImageResource(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8209e(boolean z) {
        this.f7008e0.mo8047a(z);
    }

    /* renamed from: b */
    public /* synthetic */ String mo8200b(C12110b bVar) throws Exception {
        return mo8166F().mo8250e().f6310c.getUuid();
    }

    /* renamed from: b */
    public /* synthetic */ C1949d mo8199b(Integer num) throws Exception {
        return mo8166F().mo8235a(num.intValue());
    }

    /* renamed from: c */
    private void m8233c(int i) {
        if (i != -1) {
            this.f7013j0.mo5120h(i);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8192a(C2242d dVar) {
        C1914o oVar = this.f7006c0;
        if (oVar != null) {
            oVar.mo7659a(dVar);
        }
    }

    /* renamed from: c */
    public /* synthetic */ Integer mo8203c(C12110b bVar) throws Exception {
        return Integer.valueOf(mo8165E());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        super.mo7065a(context);
        this.f6999V = C2666b.m9049a(context).mo8763a();
        this.f6998U = C2666b.m9049a(context).mo8764b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C2214e eVar;
        Context context;
        View inflate = layoutInflater.inflate(R.layout.controller_chat, viewGroup, false);
        Context context2 = inflate.getContext();
        this.f6991K0 = new C2330u(this, inflate);
        inflate.addOnLayoutChangeListener(this.f6991K0);
        this.f7013j0 = (RecyclerView) inflate.findViewById(R.id.chat_messages);
        this.f7015l0 = (ImageView) inflate.findViewById(R.id.chat_empty_view);
        this.f6990J0 = inflate.findViewById(R.id.group_emojis_target);
        this.f7017n0 = (ComposeView) inflate.findViewById(R.id.compose_view);
        View findViewById = this.f7017n0.findViewById(R.id.compose_input);
        this.f7019p0 = (ViewGroup) inflate.findViewById(R.id.easter_egg_container);
        this.f7021r0 = new LinearLayoutManager(context2);
        this.f7021r0.mo4998b(true);
        this.f7013j0.setHasFixedSize(true);
        this.f7013j0.setLayoutManager(this.f7021r0);
        this.f7013j0.getItemAnimator().setAddDuration(70);
        this.f7013j0.getItemAnimator().setMoveDuration(70);
        ChatPanelHelper chatPanelHelper = this.f7008e0;
        C2214e eVar2 = chatPanelHelper != null ? chatPanelHelper.mo8048b() : this.f7009f0 ? C2214e.CHAT : C2214e.USER_FOCUS;
        C2214e eVar3 = eVar2;
        this.f7008e0 = new ChatPanelHelper(inflate, this, this, this.f7009f0);
        C2009a aVar = new C2009a(this.f7017n0);
        StoreModule a = C3015a.m9526a(context2);
        C2931a provideAlreadyOnZenlyStore = a.provideAlreadyOnZenlyStore();
        C3034i provideFriendStore = a.provideFriendStore();
        C3045k provideFriendshipStore = a.provideFriendshipStore();
        this.f7029z0 = this.f6993P == 0 && provideFriendshipStore.friendshipCache(this.f6995R) != null;
        this.f7016m0 = inflate.findViewById(R.id.chat_header);
        if (this.f6993P == 2) {
            this.f7016m0.setVisibility(8);
            this.f7000W = new C2302r4(this, aVar, this.f6996S);
            eVar = eVar3;
        } else {
            this.f7016m0.setVisibility(0);
            C2085a aVar2 = new C2085a(this.f7016m0, this.f6994Q.getIsGroup(), new C2324t(this), new C1959e0(this), new C2297r(this), new C2191p(this, context2));
            this.f7003Z = new C2087b(C3896a1.m11470r().mo10508b(), this.f7008e0.mo8050c(), aVar2);
            this.f7003Z.mo7893a();
            this.f7004a0 = new C2105a(new C2112c(inflate.findViewById(R.id.btn_recenter)));
            this.f7004a0.mo7904a();
            this.f7011h0 = new C5569a(context2);
            String inboxUuid = this.f6994Q.getInboxUuid();
            C12785a<Boolean> aVar3 = this.f7027x0;
            C12789c D = EmojiPackController.m8059D();
            C12789c C = EmojiPackController.m8058C();
            C5569a aVar4 = this.f7011h0;
            aVar4.getClass();
            C2375w4 w4Var = new C2375w4(inboxUuid, aVar3, D, C, new C1880b(aVar4));
            this.f7022s0 = new C1956d5(this.f6994Q, C3205g.m10195d(C7713f.m18776a(context2)));
            C2002h5 h5Var = new C2002h5();
            C1893c5 c5Var = new C1893c5(this.f6995R, provideAlreadyOnZenlyStore, provideFriendStore, provideFriendshipStore, h5Var);
            C1978b bVar = new C1978b(inflate, new C2477e(context2), this.f7008e0, context2.getResources().getDimensionPixelSize(R.dimen.grid_size_400), context2.getResources().getDimensionPixelSize(R.dimen.spacing_100));
            this.f7018o0 = bVar;
            if (this.f6993P == 0) {
                C1967a aVar5 = new C1967a(w4Var, c5Var, this.f7018o0, this.f7011h0, C5498a.m15600a(context2), new C2377x(context2));
                this.f7001X = aVar5;
                this.f7020q0 = new C2205b(inflate);
                this.f7002Y = new C2197a(this.f7020q0, this.f6999V.mo8789b(this.f6995R), C5448c.m15478a());
            }
            C1879a5 a5Var = new C1879a5(this, new C2321a((TextView) inflate.findViewById(R.id.precision_mode_text)), aVar, this.f6994Q, this.f7022s0, c5Var, this.f6993P == 1);
            this.f7000W = a5Var;
            RecyclerView recyclerView = this.f7013j0;
            recyclerView.mo5043a((OnItemTouchListener) new C3273h(recyclerView, new C2099n(findViewById)));
            eVar = eVar3;
            Context context3 = context2;
            C2335u4 u4Var = new C2335u4(context2, this.f7022s0, c5Var, this.f6982B0, this.f6983C0, this.f6984D0, this.f6985E0, this.f6988H0, this.f6986F0, this.f6993P == 1);
            this.f7012i0 = u4Var;
            this.f7005b0 = new C2286a(this.f7022s0.mo7771k(), this.f7008e0.mo8050c(), mo8166F(), new C2294c(this.f7017n0, new C2383y(this)));
            this.f7008e0.mo8044a((OnStateChangeListener) new C1989g(this));
            if (this.f6993P == 1) {
                this.f7007d0 = new CapsulesViewController(inflate, this.f6987G0, this.f6989I0, this.f7011h0);
                C1914o oVar = new C1914o(this.f6994Q.getInboxUuid(), C5448c.m15478a(), this.f7022s0, w4Var, this.f7007d0, h5Var, new C1941t(this.f6990J0));
                this.f7006c0 = oVar;
                context = context3;
            } else {
                context = context3;
                C2182l lVar = new C2182l(inflate.findViewById(R.id.chat_indicator), new C2477e(context), new C1958e(this), new C2010j(this), new C2391z(this));
                C2166k kVar = new C2166k(this.f6999V, provideFriendStore.friendsMap().mo36501i(new C2370w(this)), this.f6999V.mo8789b(this.f6995R), this.f7022s0, c5Var, lVar);
                this.f7014k0 = kVar;
                m8228a(lVar);
            }
            this.f7013j0.mo5047a((C1076n) new C2317a(this, new C1995g5(context, this.f7013j0, this.f7012i0)));
        }
        if (eVar != C2214e.CHAT) {
            C1297b.m6236a(mo23920b());
        }
        this.f7008e0.mo8045a(eVar);
        this.f7017n0.mo8259a(this.f6993P, this.f7029z0);
        C7117i iVar = this.f6994Q;
        if (iVar != null) {
            this.f7017n0.setText(this.f7022s0.mo7733a(iVar.getInboxUuid()));
        }
        this.f7017n0.setOnActionListener(new C2318b());
        this.f7000W.init();
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8184a(View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (mo23949n() && !this.f6992L0 && view.getVisibility() == 0) {
            m8223Y();
        } else if (this.f6992L0 && view.getVisibility() == 8) {
            m8224Z();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8183a(Context context, View view) {
        C4290s0.m12726a(context, this.f6999V.mo8779a(this.f6995R));
    }

    /* renamed from: a */
    public /* synthetic */ void mo8191a(C2214e eVar) {
        int i = C2320d.f7034a[eVar.ordinal()];
        if (i == 1) {
            this.f7000W.setChatState(false);
        } else if (i == 2) {
            if (this.f7013j0.getAdapter() == null) {
                this.f7013j0.setAdapter(this.f7012i0);
            }
            this.f7000W.setChatState(true);
        }
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo8181a(Map map) throws Exception {
        return Boolean.valueOf(map.containsKey(this.f6995R));
    }

    /* renamed from: a */
    private C5353j m8225a(C2209a aVar) {
        if (aVar == C2209a.STATUS) {
            return C5353j.STATUS;
        }
        if (aVar == C2209a.TOSS) {
            return C5353j.TOSS;
        }
        return C5353j.BUTTON_TAP;
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        super.mo8182a(i, i2, intent);
        if (i == 1 && i2 == -1 && intent != null) {
            String a = TakePictureActivity.m13170a(intent);
            String c = TakePictureActivity.m13181c(intent);
            int d = TakePictureActivity.m13184d(intent);
            int b = TakePictureActivity.m13175b(intent);
            if (c != null) {
                m8230a(c, d, b);
                ChatPanelHelper chatPanelHelper = this.f7008e0;
                if (chatPanelHelper != null) {
                    chatPanelHelper.mo8049b(C2214e.CHAT);
                }
            }
            C5343a.m15160U().mo12846a("chat", a, "image", this.f6994Q.getIsGroup() ? "group" : "indiv");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8196a(List<C1949d> list, boolean z) {
        mo8166F().mo8241a(list);
        if (z) {
            m8222X();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8187a(C1949d dVar, boolean z) {
        mo8166F().mo8239a(dVar);
        if (z) {
            m8222X();
        }
    }

    /* renamed from: a */
    private void m8230a(String str, int i, int i2) {
        C2097a a = C2097a.m7847a(str, i, i2);
        if (mo23949n()) {
            this.f7023t0.onNext(a);
        } else {
            this.f6997T = a;
        }
    }

    /* renamed from: a */
    private void m8228a(C2182l lVar) {
        this.f7013j0.mo5047a((C1076n) new C2319c(this, lVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8195a(List<String> list) {
        C3896a1.m11470r().mo10503a(list, true);
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo8197a(C12110b bVar) throws Exception {
        boolean z = false;
        if (this.f7012i0.getItemCount() == 0 || mo8166F().mo8250e().f6310c.getSeq() == 1) {
            return false;
        }
        int K = this.f7021r0.mo4977K();
        if (K == -1) {
            return false;
        }
        if (this.f7012i0.getItemCount() - K < 20) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo8198a(Integer num) throws Exception {
        return this.f7008e0.mo8048b() == C2214e.CHAT && num.intValue() != -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8194a(String str, String str2) {
        C2310f.m8218a(mo23920b(), str, str2);
    }

    /* renamed from: a */
    public void mo8190a(OnPanelDragListener onPanelDragListener) {
        this.f7008e0.mo8043a(onPanelDragListener);
    }

    /* renamed from: a */
    public void mo8189a(OnActionListener onActionListener) {
        this.f7008e0.mo8042a(onActionListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8188a(C2017b bVar) {
        if (!m8220V()) {
            C1297b.m6236a(mo23920b());
            C8831g a = mo23896a(this.f7019p0);
            a.mo23998b(true);
            C8836h a2 = C8836h.m21058a(C2017b.m7731a(bVar));
            a2.mo24026b(null);
            a2.mo24023a((ControllerChangeHandler) new C8815b());
            a.mo23991a(a2);
        }
    }
}
