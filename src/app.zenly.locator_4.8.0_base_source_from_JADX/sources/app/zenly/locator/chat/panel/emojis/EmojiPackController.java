package app.zenly.locator.chat.panel.emojis;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.base.view.C1311b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.p059r5.C2303a;
import app.zenly.locator.chat.p059r5.C2306d;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnPanelDragListener;
import app.zenly.locator.chat.panel.emojis.gesture.C2247a;
import app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper;
import app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper.OnItemGestureListener;
import app.zenly.locator.chat.panel.emojis.p057f0.C2240b;
import app.zenly.locator.chat.panel.emojis.p057f0.C2241c;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.helper.C2510c;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.view.SpanningGridLayoutManager;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p156s.C5509a;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.services.C8143k4;
import p213co.znly.models.services.C8355w3.C8357b;
import p213co.znly.models.services.C8371x3.C8373b;
import p213co.znly.models.services.C8401z3;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12789c;

public class EmojiPackController extends ZenlyController implements OnPanelDragListener {

    /* renamed from: b0 */
    public static final C12789c<Boolean> f6802b0 = C12789c.m33462s();

    /* renamed from: c0 */
    public static final C12789c<Integer> f6803c0 = C12789c.m33462s();

    /* renamed from: d0 */
    private static final C12789c<Boolean> f6804d0 = C12789c.m33462s();

    /* renamed from: e0 */
    private static final C12789c<Integer> f6805e0 = C12789c.m33462s();

    /* renamed from: P */
    private final C12789c<Boolean> f6806P = C12789c.m33462s();

    /* renamed from: Q */
    private final ZenlySchedulers f6807Q = C1351e.m6372a(C2382x4.f7181b.mo19916a("emojiPackController"));

    /* renamed from: R */
    private final ZenlyCore f6808R = C5448c.m15478a();

    /* renamed from: S */
    private final C12275b f6809S = new C12275b();

    /* renamed from: T */
    private final String f6810T;

    /* renamed from: U */
    private final String f6811U;

    /* renamed from: V */
    private float f6812V;

    /* renamed from: W */
    private RecyclerView f6813W;

    /* renamed from: X */
    private C2263w f6814X;

    /* renamed from: Y */
    private C2241c f6815Y;

    /* renamed from: Z */
    private C2270y f6816Z;

    /* renamed from: a0 */
    private Callback f6817a0;

    public interface Callback {
        void onEmojiSent(Point point, Bitmap bitmap, float f);

        void onEmojiSentQuarantineError();

        void onEmojisBulkSent(int i);
    }

    public EmojiPackController(Bundle bundle) {
        super(bundle);
        this.f6810T = bundle.getString("KEY_CONVERSATION_UUID");
        this.f6811U = bundle.getString("KEY_PACK_UUID");
    }

    /* renamed from: C */
    public static C12789c<Boolean> m8058C() {
        return f6804d0;
    }

    /* renamed from: D */
    public static C12789c<Integer> m8059D() {
        return f6805e0;
    }

    /* renamed from: a */
    public static EmojiPackController m8060a(String str, String str2) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("KEY_CONVERSATION_UUID", str);
        dVar.mo9610a("KEY_PACK_UUID", str2);
        return new EmojiPackController(dVar.mo9605a());
    }

    /* renamed from: c */
    private Disposable m8064c(Context context) {
        return new C12275b(this.f6816Z.mo8137b().mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C2249i<Object,Object>(this)).mo36428a((C12286f) this.f6807Q.getMainThread()).mo36476d((Consumer<? super T>) new C2231c<Object>(this)), this.f6816Z.mo8137b().mo36428a((C12286f) this.f6807Q.getMainThread()).mo36476d((Consumer<? super T>) new C2219b<Object>(this, context)));
    }

    /* renamed from: f */
    private void m8066f(View view) {
        View view2;
        String str;
        String str2;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.emoji_lock_panel_stub);
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = view.findViewById(R.id.emoji_lock_panel);
        }
        Context context = view.getContext();
        Resources resources = context.getResources();
        this.f6813W.setAlpha(0.3f);
        TextView textView = (TextView) view2.findViewById(R.id.emoji_grid_lock_layer_friend_invite_text);
        TextView textView2 = (TextView) view2.findViewById(R.id.emoji_grid_lock_layer_friend_invite_button);
        TextView textView3 = (TextView) view2.findViewById(R.id.emoji_grid_lock_layer_pack_invite_info);
        C2241c cVar = this.f6815Y;
        if (cVar.f6857b == C8357b.UNLOCK_EVENT_INVITER) {
            int i = cVar.f6860e;
            textView.setText(resources.getQuantityString(R.plurals.chat_emojiUnlock_label_descendant, i, new Object[]{Integer.valueOf(i)}));
            if (this.f6815Y.f6860e == 1) {
                textView2.setText(R.string.chat_emojiUnlock_button_descendant);
            } else {
                textView2.setText(R.string.chat_emojiUnlock_button_descendants);
            }
            C2241c cVar2 = this.f6815Y;
            if (cVar2.f6860e <= 1) {
                str2 = null;
            } else {
                int i2 = cVar2.f6859d;
                if (i2 == 1) {
                    str2 = resources.getString(R.string.chat_emojiUnlock_subtitle_descendant_one);
                } else {
                    str2 = resources.getQuantityString(R.plurals.chat_emojiUnlock_subtitle_descendant, i2, new Object[]{Integer.valueOf(i2)});
                }
            }
            textView3.setText(str2);
            textView2.setOnClickListener(new C2237f(this));
        } else {
            int i3 = cVar.f6860e;
            textView.setText(resources.getQuantityString(R.plurals.chat_emojiUnlock_label_friends, i3, new Object[]{Integer.valueOf(i3)}));
            textView2.setText(R.string.chat_emojiUnlock_button_friends);
            int i4 = this.f6815Y.f6859d;
            if (i4 == 1) {
                str = resources.getString(R.string.chat_emojiUnlock_subtitle_friend_one);
            } else {
                str = resources.getQuantityString(R.plurals.chat_emojiUnlock_subtitle_friend, i4, new Object[]{Integer.valueOf(i4)});
            }
            textView3.setText(str);
            textView2.setOnClickListener(C2243g.f6869e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6815Y.f6862g);
        sb.append(this.f6815Y.f6861f);
        sb.append(".v2");
        sb.append(C2510c.m8763a(view.getContext()));
        sb.append(".png");
        C2306d.m8214a(C2476d.m8582a(context), sb.toString(), (ImageView) view2.findViewById(R.id.emoji_grid_lock_layer_image), this.f6807Q.getMainThread());
    }

    /* renamed from: g */
    private void m8067g(View view) {
        View findViewById = view.findViewById(R.id.emoji_lock_panel);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            this.f6813W.setAlpha(1.0f);
        }
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        this.f6806P.onNext(Boolean.valueOf(true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof Callback) {
            this.f6817a0 = (Callback) mo23947l();
        }
        C12143a.m32027a("Pack %s is about to load", this.f6811U);
        this.f6809S.mo36403a(C2220b0.m8086a(this.f6811U).mo36428a((C12286f) this.f6807Q.getMainThread()).mo36412a((Consumer<? super T>) new C2253m<Object>(this, view), (Consumer<? super Throwable>) new C2250j<Object>(this)), C2220b0.m8092b(this.f6811U).mo36428a((C12286f) this.f6807Q.getMainThread()).mo36476d((Consumer<? super T>) new C2251k<Object>(this, view)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f6809S.mo36401a();
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        f6803c0.onNext(Integer.valueOf(this.f6815Y.f6860e));
    }

    public void onPanelDrag(float f) {
        if (this.f6812V != f) {
            this.f6812V = f;
            C2263w wVar = this.f6814X;
            if (wVar != null) {
                wVar.mo8122a(this.f6812V);
            }
        }
    }

    /* renamed from: d */
    private Disposable m8065d(Context context) {
        return this.f6806P.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C2254n<Object,Object>(this)).mo36428a((C12286f) this.f6807Q.getMainThread()).mo36412a((Consumer<? super T>) new C2252l<Object>(context), (Consumer<? super Throwable>) new C2248h<Object>(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_chat_emoji_pack_grid, viewGroup, false);
        this.f6813W = (RecyclerView) inflate.findViewById(R.id.emoji_grid_recycler);
        this.f6813W.setHasFixedSize(true);
        this.f6813W.setNestedScrollingEnabled(false);
        this.f6813W.setLayoutManager(new SpanningGridLayoutManager(inflate.getContext(), 4));
        C2233d dVar = new C2233d(this);
        C2247a aVar = new C2247a();
        RecyclerViewItemGestureHelper recyclerViewItemGestureHelper = new RecyclerViewItemGestureHelper(this.f6813W);
        recyclerViewItemGestureHelper.mo8111a((OnItemGestureListener) aVar);
        this.f6814X = new C2263w(dVar, recyclerViewItemGestureHelper, this.f6812V);
        this.f6816Z = new C2270y(aVar, this.f6814X, f6805e0);
        this.f6813W.setAdapter(this.f6814X);
        return inflate;
    }

    /* renamed from: b */
    public /* synthetic */ void mo8073b(Context context, C2240b bVar) throws Exception {
        C5509a.m15629b(context, bVar.mo8104b().mo8098c());
        Callback callback = this.f6817a0;
        if (callback != null) {
            callback.onEmojisBulkSent(bVar.mo8103a());
        }
    }

    /* renamed from: b */
    private Disposable m8063b(Context context) {
        return this.f6816Z.mo8136a().mo36428a((C12286f) this.f6807Q.getMainThread()).mo36476d((Consumer<? super T>) new C2235e<Object>(this, context));
    }

    /* renamed from: a */
    public /* synthetic */ void mo8069a(View view, C2241c cVar) throws Exception {
        this.f6815Y = cVar;
        C12143a.m32027a("Pack %s is loaded with %d missing", cVar.f6861f, Integer.valueOf(cVar.f6859d));
        if (cVar.f6858c) {
            m8066f(view);
        } else {
            m8067g(view);
        }
        this.f6814X.mo8123a(cVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8072a(Throwable th) throws Exception {
        C12143a.m32032b(th, "Problem loading the %s pack", this.f6811U);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8070a(View view, Boolean bool) throws Exception {
        this.f6809S.mo36403a(m8064c(view.getContext()), m8063b(view.getContext()), m8065d(view.getContext()));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo8066a(C2240b bVar) throws Exception {
        return this.f6808R.pingSend(C2303a.m8209a(bVar.mo8103a(), bVar.mo8104b().mo8098c(), bVar.mo8104b().mo8097b(), this.f6810T)).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8071a(C8401z3 z3Var) throws Exception {
        if (this.f6817a0 != null && z3Var.hasError() && z3Var.getError().getCode() == C8373b.CODE_TALK_TO_STRANGER_QUARANTINE) {
            this.f6817a0.onEmojiSentQuarantineError();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8068a(Context context, C2240b bVar) throws Exception {
        C5498a.m15600a(context).mo13124a(C5501c.MEDIUM, C5500b.POSITIVE, 1);
        C1085v b = this.f6813W.mo5059b(bVar.mo8105c());
        if (b != null) {
            ImageView imageView = ((C2265b) b).f6903a;
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable.getCurrent()).getBitmap();
                int measuredWidth = imageView.getMeasuredWidth();
                int measuredHeight = imageView.getMeasuredHeight();
                Point point = new Point(measuredWidth / 2, measuredHeight / 2);
                C1311b.m6280a((View) imageView, point);
                this.f6817a0.onEmojiSent(point, bitmap, (float) measuredHeight);
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo8067a(Boolean bool) throws Exception {
        return this.f6808R.requestMedia((C8143k4) C2303a.m8206a(this.f6810T).build()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
    }

    /* renamed from: a */
    static /* synthetic */ void m8062a(Context context, Throwable th) throws Exception {
        String str = "Request error";
        C12143a.m32032b(th, str, new Object[0]);
        Toast.makeText(context, str, 0).show();
    }
}
