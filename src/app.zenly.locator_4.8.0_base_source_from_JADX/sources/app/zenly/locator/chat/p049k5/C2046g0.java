package app.zenly.locator.chat.p049k5;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.locator.C5130q;
import app.zenly.locator.R;
import app.zenly.locator.chat.p049k5.p050k0.C2060a;
import app.zenly.locator.chat.p049k5.p051l0.C2064a;
import app.zenly.locator.chat.p059r5.C2304b;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.view.LoadingTextView;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.sharesheet.ShareSheetController;
import app.zenly.locator.sharesheet.ShareSheetController.OnTargetSelectedListener;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8819d.C8828i;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8815b;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp.Builder;
import p213co.znly.models.C7464s1.C7466b;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.services.C7993b1;
import p213co.znly.models.services.C8074g1;
import p213co.znly.models.services.C8332v0;
import p213co.znly.models.services.C8332v0.C8333a;
import p213co.znly.models.services.C8345w0;
import p213co.znly.models.services.C8347w1.C8349b;
import p213co.znly.models.services.C8381y0;
import p213co.znly.models.services.C8381y0.C8382a;
import p213co.znly.models.services.C8395z0;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p402j.C12767a;

/* renamed from: app.zenly.locator.chat.k5.g0 */
public class C2046g0 extends ZenlyController implements OnTargetSelectedListener {

    /* renamed from: i0 */
    private static final long f6471i0 = TimeUnit.MINUTES.toSeconds(15);

    /* renamed from: j0 */
    private static final long f6472j0 = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k0 */
    private static final long f6473k0 = TimeUnit.DAYS.toSeconds(7);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final ZenlyCore f6474P = C5448c.m15478a();

    /* renamed from: Q */
    private final String f6475Q;

    /* renamed from: R */
    private FriendStore f6476R;

    /* renamed from: S */
    private FriendRequestStore f6477S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public NavigationContract f6478T;

    /* renamed from: U */
    private C7117i f6479U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ScreenBarBottomSheetBehavior<View> f6480V;

    /* renamed from: W */
    private View f6481W;

    /* renamed from: X */
    private C2050d f6482X;

    /* renamed from: Y */
    private RecyclerView f6483Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f6484Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public boolean f6485a0 = false;

    /* renamed from: b0 */
    private ViewStub f6486b0;

    /* renamed from: c0 */
    private boolean f6487c0 = false;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C12275b f6488d0 = new C12275b();

    /* renamed from: e0 */
    private C2049c f6489e0;

    /* renamed from: f0 */
    private boolean f6490f0 = false;

    /* renamed from: g0 */
    private final OnClickListener f6491g0 = new C2076x(this);

    /* renamed from: h0 */
    private final OnClickListener f6492h0 = new C2071s(this);

    /* renamed from: app.zenly.locator.chat.k5.g0$a */
    class C2047a extends C10744c {

        /* renamed from: a */
        final /* synthetic */ View f6493a;

        C2047a(View view) {
            this.f6493a = view;
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            if (C2046g0.this.f6480V.mo30689c() == 5) {
                C2046g0.this.f6480V.mo14019a((C10744c) null);
                C2046g0.this.mo23946k().mo23997a((C8819d) C2046g0.this);
            }
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            float f2 = -Math.min(0.0f, Math.max(f, -1.0f));
            this.f6493a.setAlpha(1.0f - f2);
            C2046g0.this.m7774f(f2 == 0.0f);
        }
    }

    /* renamed from: app.zenly.locator.chat.k5.g0$b */
    static /* synthetic */ class C2048b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6495a = new int[C7466b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                co.znly.models.s1$b[] r0 = p213co.znly.models.C7464s1.C7466b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6495a = r0
                int[] r0 = f6495a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.s1$b r1 = p213co.znly.models.C7464s1.C7466b.RENAME     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6495a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.s1$b r1 = p213co.znly.models.C7464s1.C7466b.MUTE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6495a     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.models.s1$b r1 = p213co.znly.models.C7464s1.C7466b.UNMUTE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.p049k5.C2046g0.C2048b.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.chat.k5.g0$c */
    public class C2049c extends C1085v {

        /* renamed from: a */
        final ScreenBar f6496a;

        /* renamed from: b */
        final View f6497b;

        /* renamed from: c */
        final ImageView f6498c;

        /* renamed from: d */
        final TextView f6499d;

        /* renamed from: e */
        final View f6500e;

        public C2049c(View view) {
            super(view);
            this.f6496a = (ScreenBar) view.findViewById(R.id.screen_bar);
            this.f6497b = view.findViewById(R.id.add_to_group_image);
            this.f6498c = (ImageView) view.findViewById(R.id.mute_group_image);
            this.f6499d = (TextView) view.findViewById(R.id.mute_group_text);
            this.f6500e = view.findViewById(R.id.leave_group_image);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m7801a(String str) {
            C2046g0.this.f6484Z = str;
            this.f6496a.setTitle((CharSequence) C2046g0.this.f6484Z);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m7802a(boolean z) {
            int i;
            int i2;
            C2046g0.this.f6485a0 = z;
            if (!C2046g0.this.f6485a0) {
                i = 2131231523;
                i2 = R.string.gchat_info_button_mute;
            } else {
                i = 2131231520;
                i2 = R.string.gchat_info_button_muted;
            }
            this.f6498c.setImageResource(i);
            this.f6499d.setText(i2);
        }
    }

    /* renamed from: app.zenly.locator.chat.k5.g0$d */
    private class C2050d extends C1069g<C1085v> {

        /* renamed from: a */
        private final C2477e f6502a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<C2064a> f6503b = new ArrayList();

        /* renamed from: app.zenly.locator.chat.k5.g0$d$a */
        class C2051a extends C1085v {

            /* renamed from: a */
            final TextView f6505a;

            C2051a(C2050d dVar, View view) {
                super(view);
                this.f6505a = (TextView) view.findViewById(R.id.title);
            }
        }

        /* renamed from: app.zenly.locator.chat.k5.g0$d$b */
        class C2052b extends C1085v {

            /* renamed from: a */
            final ImageView f6506a;

            /* renamed from: b */
            final TextView f6507b;

            /* renamed from: c */
            final TextView f6508c;

            /* renamed from: d */
            final TextView f6509d;

            /* renamed from: e */
            final LoadingTextView f6510e;

            /* renamed from: f */
            final ImageButton f6511f;

            C2052b(C2050d dVar, View view) {
                super(view);
                this.f6506a = (ImageView) view.findViewById(R.id.avatar);
                this.f6507b = (TextView) view.findViewById(R.id.title);
                this.f6508c = (TextView) view.findViewById(R.id.subtitle);
                this.f6509d = (TextView) view.findViewById(R.id.status);
                this.f6510e = (LoadingTextView) view.findViewById(R.id.action_button);
                this.f6511f = (ImageButton) view.findViewById(R.id.action_mini_1);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo7864a() {
                this.f6509d.setVisibility(8);
                this.f6510e.mo9418b();
                this.f6510e.setVisibility(8);
                this.f6511f.setVisibility(8);
            }
        }

        public C2050d(C2477e eVar) {
            this.f6502a = eVar;
        }

        /* renamed from: b */
        private C1085v m7811b(ViewGroup viewGroup) {
            return new C2052b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_group_chat_info, viewGroup, false));
        }

        public int getItemCount() {
            return this.f6503b.size() + 1;
        }

        public int getItemViewType(int i) {
            return i == 0 ? 3 : 2;
        }

        public void onBindViewHolder(C1085v vVar, int i, List<Object> list) {
            if (list.isEmpty()) {
                onBindViewHolder(vVar, i);
            } else if (getItemViewType(i) == 2) {
                m7808a((C2064a) this.f6503b.get(i - 1), (C2052b) vVar, list);
            }
        }

        public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 2) {
                return m7811b(viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return m7803a(viewGroup);
        }

        /* renamed from: a */
        private C1085v m7803a(ViewGroup viewGroup) {
            return new C2051a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_section, viewGroup, false));
        }

        /* renamed from: b */
        private void m7812b(C2064a aVar, C2052b bVar) {
            bVar.mo7864a();
            bVar.f6507b.setText(aVar.mo7874a());
            if (TextUtils.equals(aVar.mo7875b(), C5447b.m15477d(C2046g0.this.f6474P))) {
                bVar.f6509d.setVisibility(0);
                bVar.f6509d.setText(R.string.commons_button_you);
            } else if (aVar.mo7877d()) {
                m7807a(aVar, bVar);
            } else if (!aVar.mo7876c()) {
                bVar.f6510e.setVisibility(0);
                bVar.f6510e.setOnClickListener(new C2045g(this, bVar, aVar));
            }
            C2046g0.this.f6488d0.add(C5448c.m15478a().userPublicStream(aVar.mo7875b()).mo36487e(1).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2043f<Object>(this, bVar), (Consumer<? super Throwable>) C2053h.f6512e));
            bVar.itemView.setOnClickListener(new C2041e(this, aVar));
        }

        public void onBindViewHolder(C1085v vVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 2) {
                m7812b((C2064a) this.f6503b.get(i - 1), (C2052b) vVar);
            } else if (itemViewType == 3) {
                m7805a((C2051a) vVar);
            }
        }

        /* renamed from: a */
        private void m7808a(C2064a aVar, C2052b bVar, List<Object> list) {
            if (list.contains(Integer.valueOf(1))) {
                bVar.f6510e.mo9418b();
            } else if (list.contains(Integer.valueOf(2))) {
                bVar.f6510e.mo9418b();
                bVar.f6510e.setVisibility(8);
                m7807a(aVar, bVar);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo7860a(C2052b bVar, C2064a aVar, View view) {
            bVar.f6510e.mo9417a();
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C2538c0.m8837a(C2046g0.this.mo23920b()).mo8670a(C2625y.m8948a(C2587f0.GROUP_INFO_USER_LIST, aVar.mo7875b(), aVar.mo7874a(), false), (InvitationCallback) new C2054h0(this, view.getContext(), true, bVar));
        }

        /* renamed from: a */
        public /* synthetic */ void mo7861a(C2052b bVar, UserProto$User userProto$User) throws Exception {
            this.f6502a.load(C2884f.m9355a(userProto$User)).into(bVar.f6506a);
            bVar.f6508c.setText(C7706a.m18756c(C2046g0.this.mo23920b(), userProto$User.getFriendsCount()));
        }

        /* renamed from: b */
        public /* synthetic */ void mo7863b(C2064a aVar, View view) {
            if (C2046g0.this.f6478T != null) {
                C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                C2046g0.this.f6478T.onGroupChatMemberClick(aVar.mo7875b());
            }
        }

        /* renamed from: a */
        private void m7805a(C2051a aVar) {
            aVar.f6505a.setText(aVar.itemView.getContext().getResources().getQuantityString(R.plurals.gchat_members_count, this.f6503b.size(), new Object[]{Integer.valueOf(this.f6503b.size())}));
        }

        /* renamed from: a */
        private void m7807a(C2064a aVar, C2052b bVar) {
            bVar.f6511f.setVisibility(0);
            bVar.f6511f.setOnClickListener(new C2055i(this, aVar));
        }

        /* renamed from: a */
        public /* synthetic */ void mo7862a(C2064a aVar, View view) {
            C2538c0.m8837a(C2046g0.this.mo23920b()).mo8670a(C2625y.m8948a(C2587f0.GROUP_INFO_USER_LIST, aVar.mo7875b(), aVar.mo7874a(), true), (InvitationCallback) new C2056i0(this, view.getContext(), false, view));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m7810a(List<C2064a> list) {
            this.f6503b = list;
            notifyDataSetChanged();
        }
    }

    public C2046g0(Bundle bundle) {
        this.f6475Q = bundle.getString("KEY_CONVERSATION");
    }

    /* renamed from: C */
    private void m7750C() {
        C5130q qVar = new C5130q();
        ArrayList arrayList = new ArrayList();
        for (C6818b userUuid : this.f6479U.getOthersList()) {
            arrayList.add(userUuid.getUserUuid());
        }
        ShareSheetController a = qVar.mo12445a((Context) mo23920b(), this.f6479U.getName(), arrayList);
        a.mo23929b((C8819d) this);
        C8831g k = mo23946k();
        C8836h a2 = C8836h.m21058a((C8819d) a);
        a2.mo24026b(new C8815b(true));
        a2.mo24023a((ControllerChangeHandler) new C8815b(true));
        k.mo23991a(a2);
    }

    /* renamed from: D */
    private void m7751D() {
        mo23946k().mo23991a(C8836h.m21058a((C8819d) C2058j0.m7818a(this.f6479U)));
    }

    /* renamed from: a */
    static /* synthetic */ void m7755a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        this.f6480V.mo30690c(4);
    }

    public void onTargetSelected(String[] strArr) {
        Activity b = mo23920b();
        C12143a.m32033c("Adding %s to conversation %s", Arrays.toString(strArr), this.f6479U.getInboxUuid());
        this.f6488d0.add(this.f6474P.chatGroupConversationAdd(this.f6479U.getInboxUuid(), strArr).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2066n<Object>(this, b, C2304b.m8212a(this.f6479U).size(), strArr), (Consumer<? super Throwable>) new C2068p<Object>(b)));
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        this.f6480V.mo14018a(rect);
        this.f6486b0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return this.f6490f0;
    }

    /* renamed from: d */
    public static C2046g0 m7766d(String str) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("KEY_CONVERSATION", str);
        return new C2046g0(dVar.mo9605a());
    }

    /* renamed from: c */
    public /* synthetic */ void mo7856c(Context context, Throwable th) throws Exception {
        Toast.makeText(context, R.string.commons_title_oopserror, 0).show();
        this.f6489e0.m7802a(true);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m7751D();
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        int id = view.getId();
        if (id == R.id.add_to_group_image) {
            m7750C();
        } else if (id == R.id.mute_group_image) {
            m7771e(view.getContext());
        } else if (id == R.id.leave_group_image) {
            m7764c(view.getContext());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7853b(Context context, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m7754a(context, f6471i0);
        } else if (i == 1) {
            m7754a(context, f6472j0);
        } else if (i == 2) {
            m7754a(context, f6473k0);
        } else if (i == 3) {
            m7754a(context, 0);
        }
        dialogInterface.dismiss();
    }

    /* renamed from: c */
    private void m7764c(Context context) {
        C0123a aVar = new C0123a(context);
        aVar.mo548c(R.string.gchat_leave_title);
        aVar.mo544b((int) R.string.gchat_leave_message);
        aVar.mo545b(R.string.commons_button_cancel, C2070r.f6544e);
        aVar.mo549c(R.string.gchat_leave_button, new C2067o(this, context));
        aVar.mo550c();
    }

    /* renamed from: e */
    private void m7771e(Context context) {
        if (this.f6485a0) {
            m7773f(context);
        } else {
            m7768d(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        this.f6476R = a.provideFriendStore();
        this.f6477S = a.provideFriendRequestStore();
    }

    /* renamed from: d */
    private void m7768d(Context context) {
        C0123a aVar = new C0123a(context);
        aVar.mo548c(R.string.gchat_mute_title);
        aVar.mo528a((int) R.array.gchat_mute_options_array, -1, (DialogInterface.OnClickListener) new C2035b(this, context));
        aVar.mo550c();
    }

    /* renamed from: e */
    private void m7772e(boolean z) {
        int i = 8;
        this.f6483Y.setVisibility(z ? 8 : 0);
        this.f6481W.setVisibility(z ? 8 : 0);
        ViewStub viewStub = this.f6486b0;
        if (z) {
            i = 0;
        }
        viewStub.setVisibility(i);
    }

    /* renamed from: f */
    private void m7773f(Context context) {
        this.f6489e0.m7802a(false);
        C8382a newBuilder = C8381y0.newBuilder();
        newBuilder.mo22339a(this.f6479U.getInboxUuid());
        this.f6488d0.add(this.f6474P.chatConversationUnMute((C8381y0) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2069q<Object>(this), (Consumer<? super Throwable>) new C2075w<Object>(this, context)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7845a(Context context, int i, String[] strArr, C8074g1 g1Var) throws Exception {
        String str;
        if (g1Var.hasError()) {
            C8349b code = g1Var.getError().getConversationError().getCode();
            if (code == C8349b.USERS_HAS_INCOMPATIBLE_VERSION) {
                str = context.getString(R.string.gchat_error_version);
            } else if (code == C8349b.QUOTA_EXCEEDED) {
                str = C7709b.m18762a(context, R.string.gchat_error_ratelimit);
            } else {
                str = C7709b.m18762a(context, R.string.gchat_error_generic);
            }
            Toast.makeText(context, str, 0).show();
            return;
        }
        C5343a.m15160U().mo12808a(i, strArr.length);
        C12143a.m32033c("Done adding", new Object[0]);
        mo23946k().mo24014n();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7854b(Context context, Throwable th) throws Exception {
        Toast.makeText(context, R.string.commons_title_oopserror, 0).show();
        this.f6489e0.m7802a(false);
    }

    /* renamed from: b */
    private void m7760b(Context context) {
        m7772e(true);
        C12275b bVar = this.f6488d0;
        ZenlyCore zenlyCore = this.f6474P;
        bVar.add(zenlyCore.chatGroupConversationKick(this.f6475Q, new String[]{C5447b.m15477d(zenlyCore)}).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2059k<Object>(this), (Consumer<? super Throwable>) new C2037c<Object>(this, context)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f6480V.mo14020e();
        m7774f(false);
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f6488d0.mo36401a();
        super.mo7053d(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m7774f(boolean z) {
        if (this.f6490f0 != z) {
            this.f6490f0 = z;
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (C2064a b : this.f6482X.f6503b) {
                    arrayList.add(b.mo7875b());
                }
                C3896a1.m11470r().mo10503a((List<String>) arrayList, false);
            }
            NavigationContract navigationContract = this.f6478T;
            if (navigationContract != null) {
                navigationContract.onControllerOpacityChange(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            this.f6478T = (NavigationContract) mo23947l();
        }
        C12767a j = this.f6474P.chatConversationSync(this.f6475Q).mo36503j();
        C2060a aVar = new C2060a(j, this.f6476R, this.f6477S, C3205g.m10195d(C7713f.m18776a(view.getContext())));
        this.f6488d0.mo36403a(aVar.mo7871a().mo36477d().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2063l<Object>(this), (Consumer<? super Throwable>) C2074v.f6548e), j.mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2039d<Object>(this), (Consumer<? super Throwable>) C2072t.f6546e), this.f6474P.chatConversationUpdatesStream(this.f6475Q).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2033a<Object>(this), (Consumer<? super Throwable>) C2078z.f6554e), j.mo36946r());
    }

    /* renamed from: a */
    private void m7754a(Context context, long j) {
        this.f6489e0.m7802a(true);
        Builder newBuilder = Timestamp.newBuilder();
        newBuilder.setSeconds(j);
        C8333a newBuilder2 = C8332v0.newBuilder();
        newBuilder2.mo22330a(this.f6479U.getInboxUuid());
        newBuilder2.mo22329a(newBuilder);
        this.f6488d0.add(this.f6474P.chatConversationMute((C8332v0) newBuilder2.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C2073u<Object>(this), (Consumer<? super Throwable>) new C2077y<Object>(this, context)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7850a(C8345w0 w0Var) throws Exception {
        C5343a.m15160U().mo12885g(C2304b.m8212a(this.f6479U).size());
        this.f6489e0.m7802a(true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7851a(C8395z0 z0Var) throws Exception {
        this.f6489e0.m7802a(false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7846a(Context context, DialogInterface dialogInterface, int i) {
        m7760b(context);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7848a(C7117i iVar) throws Exception {
        C5343a.m15160U().mo12877e(C2304b.m8212a(this.f6479U).size());
        m7772e(true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7847a(Context context, Throwable th) throws Exception {
        m7772e(false);
        Toast.makeText(context, R.string.commons_title_oopserror, 0).show();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7855b(C7117i iVar) throws Exception {
        this.f6479U = iVar;
        this.f6489e0.m7801a(iVar.getName());
        this.f6489e0.m7802a(iVar.getMuted());
        if (iVar.getHasLeft()) {
            m7772e(true);
        }
        if (!this.f6487c0) {
            this.f6487c0 = true;
            C5343a.m15160U().mo12873d(C2304b.m8212a(iVar).size());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_group_chat_info, viewGroup, false);
        this.f6483Y = (RecyclerView) inflate.findViewById(R.id.members);
        this.f6486b0 = (ViewStub) inflate.findViewById(R.id.group_chat_left_stub);
        this.f6482X = new C2050d(new C2477e(inflate.getContext()));
        this.f6483Y.setAdapter(this.f6482X);
        this.f6483Y.setLayoutManager(new LinearLayoutManager(mo23920b(), 1, false));
        this.f6483Y.setHasFixedSize(true);
        this.f6481W = inflate.findViewById(R.id.group_chat_info_action);
        this.f6489e0 = new C2049c(this.f6481W);
        View findViewById = inflate.findViewById(R.id.group_chat_info_background);
        ScreenBarLayout screenBarLayout = (ScreenBarLayout) inflate.findViewById(R.id.group_info_screen_bar_layout);
        this.f6480V = ScreenBarBottomSheetBehavior.m17044a(screenBarLayout, null, null, inflate.findViewById(R.id.group_info_bottom_sheet), false);
        this.f6480V.mo30687b(true);
        this.f6480V.mo30690c(5);
        this.f6480V.mo14019a((C10744c) new C2047a(findViewById));
        inflate.postDelayed(new C2065m(this), 150);
        View findViewById2 = inflate.findViewById(R.id.actions_layout);
        screenBarLayout.setOnCollapseListener(new C2057j(findViewById2, findViewById2.getPaddingTop() + findViewById2.getPaddingBottom()));
        this.f6489e0.f6496a.setActionClickListener(this.f6491g0);
        this.f6489e0.f6497b.setOnClickListener(this.f6492h0);
        this.f6489e0.f6498c.setOnClickListener(this.f6492h0);
        this.f6489e0.f6500e.setOnClickListener(this.f6492h0);
        mo23912a(C8828i.RETAIN_DETACH);
        return inflate;
    }

    /* renamed from: a */
    static /* synthetic */ void m7756a(View view, int i, float f, int i2) {
        view.setAlpha(1.0f - (((float) i2) / (((float) view.getHeight()) - ((float) i))));
        view.setTranslationY((float) (-i2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7852a(List list) throws Exception {
        this.f6482X.m7810a(list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7849a(C7993b1 b1Var) throws Exception {
        int i = C2048b.f6495a[b1Var.getConversationUpdate().getWhat().ordinal()];
        if (i == 1) {
            this.f6489e0.m7801a(b1Var.getConversationUpdate().getGroupName());
        } else if (i == 2) {
            this.f6489e0.m7802a(true);
        } else if (i == 3) {
            this.f6489e0.m7802a(false);
        }
    }
}
