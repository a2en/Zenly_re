package app.zenly.locator.chat.panel;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.PageTransformer;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.chat.contract.ChatContract;
import app.zenly.locator.chat.panel.emojis.C2266x;
import app.zenly.locator.chat.view.ComposeView;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.widget.ViewPager;
import app.zenly.locator.core.widget.ViewPager.C3262b;
import app.zenly.locator.map.C3896a1;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

public final class ChatPanelHelper {

    /* renamed from: a */
    private final View f6767a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ViewPager f6768b;

    /* renamed from: c */
    private final ViewGroup f6769c;

    /* renamed from: d */
    private final View f6770d;

    /* renamed from: e */
    private View f6771e;

    /* renamed from: f */
    private int f6772f;

    /* renamed from: g */
    private final ComposeView f6773g;

    /* renamed from: h */
    private final EditText f6774h;

    /* renamed from: i */
    private final BottomSheetBehavior f6775i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ChatContract f6776j;

    /* renamed from: k */
    private final boolean f6777k;

    /* renamed from: l */
    private OnStateChangeListener f6778l;

    /* renamed from: m */
    private OnPanelDragListener f6779m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f6780n;

    /* renamed from: o */
    private Runnable f6781o = new C2215a(this);

    /* renamed from: p */
    private final C12785a<C2214e> f6782p = C12785a.m33446h(C2214e.USER_FOCUS);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f6783q = true;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f6784r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f6785s = true;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public OnActionListener f6786t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public OnActionListener f6787u;

    public interface OnActionListener {

        /* renamed from: app.zenly.locator.chat.panel.ChatPanelHelper$OnActionListener$a */
        public enum C2209a {
            BACK,
            BUTTON_TAP,
            STATUS,
            TOSS
        }

        void onEmojiPanelClosed();

        void onEmojiPanelOpened(boolean z);

        void onFullChatClosed(C2209a aVar);

        void onFullChatOpen();
    }

    public interface OnPanelDragListener {
        void onPanelDrag(float f);
    }

    public interface OnStateChangeListener {
        void onStateChange(C2214e eVar);
    }

    /* renamed from: app.zenly.locator.chat.panel.ChatPanelHelper$a */
    class C2210a extends C10744c {

        /* renamed from: a */
        private boolean f6793a;

        C2210a() {
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            if (i == 3 || i == 4) {
                ChatPanelHelper.this.f6784r = false;
            }
            if (i == 5 && !ChatPanelHelper.this.f6784r && ChatPanelHelper.this.f6783q) {
                ChatPanelHelper.this.f6776j.dismiss(ChatPanelHelper.this.f6785s);
            }
            if (i == 3) {
                if (ChatPanelHelper.this.f6786t != null) {
                    ChatPanelHelper.this.f6786t.onEmojiPanelOpened(this.f6793a);
                }
                if (ChatPanelHelper.this.f6787u != null) {
                    ChatPanelHelper.this.f6787u.onEmojiPanelOpened(this.f6793a);
                }
            }
            if (i == 4 && ChatPanelHelper.this.f6787u != null) {
                ChatPanelHelper.this.f6787u.onEmojiPanelClosed();
            }
            m8055a(i);
        }

        /* renamed from: a */
        private void m8055a(int i) {
            if (i == 1) {
                this.f6793a = true;
            } else if (i != 2) {
                this.f6793a = false;
            }
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            if (f >= -1.0f && f <= 1.0f) {
                ChatPanelHelper.this.f6780n = f;
                ChatPanelHelper.this.m8034p();
            } else if (ChatPanelHelper.this.mo8048b() == C2214e.USER_FOCUS) {
                ChatPanelHelper.this.mo8058k();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.ChatPanelHelper$b */
    class C2211b extends C3262b {

        /* renamed from: a */
        private boolean f6795a;

        C2211b() {
        }

        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 1) {
                this.f6795a = true;
                ChatPanelHelper.this.f6776j.onFullscreenChanged(false);
            } else if (i == 0 && ChatPanelHelper.this.f6768b.getCurrentItem() == 1) {
                ChatPanelHelper.this.f6776j.onFullscreenChanged(true);
            }
        }

        public void onPageSelected(int i) {
            if (i != 1) {
                if (ChatPanelHelper.this.f6786t != null && this.f6795a) {
                    this.f6795a = false;
                    ChatPanelHelper.this.f6786t.onFullChatClosed(C2209a.TOSS);
                }
                ChatPanelHelper.this.mo8058k();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.ChatPanelHelper$c */
    static /* synthetic */ class C2212c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6797a = new int[C2214e.values().length];

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
                f6797a = r0
                int[] r0 = f6797a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.chat.panel.ChatPanelHelper$e r1 = app.zenly.locator.chat.panel.ChatPanelHelper.C2214e.USER_FOCUS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6797a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.chat.panel.ChatPanelHelper$e r1 = app.zenly.locator.chat.panel.ChatPanelHelper.C2214e.CHAT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.panel.ChatPanelHelper.C2212c.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.ChatPanelHelper$d */
    private static class C2213d implements PageTransformer {
        private C2213d() {
        }

        public void transformPage(View view, float f) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (f >= -1.0f && f <= 1.0f) {
                view.setPivotX(((float) width) * 0.5f);
                view.setPivotY(Math.abs(((float) height) * f));
                view.setRotation(f * 40.0f);
            }
        }

        /* synthetic */ C2213d(C2210a aVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.ChatPanelHelper$e */
    public enum C2214e {
        USER_FOCUS,
        CHAT
    }

    public ChatPanelHelper(View view, ChatContract chatContract, OnActionListener onActionListener, boolean z) {
        this.f6767a = view;
        this.f6768b = (ViewPager) view.findViewById(R.id.chat_panel);
        this.f6769c = (ViewGroup) view.findViewById(R.id.emoji_panel);
        this.f6773g = (ComposeView) view.findViewById(R.id.compose_view);
        this.f6774h = (EditText) view.findViewById(R.id.compose_input);
        this.f6770d = view.findViewById(R.id.group_emojis_target);
        this.f6775i = BottomSheetBehavior.m27416b(this.f6769c);
        this.f6776j = chatContract;
        this.f6786t = onActionListener;
        this.f6777k = z;
        this.f6775i.mo14019a((C10744c) new C2210a());
        this.f6768b.setOffscreenPageLimit(3);
        this.f6768b.mo6332a(true, new C2213d(null));
        this.f6768b.mo6331a((OnPageChangeListener) new C2211b());
    }

    /* renamed from: m */
    private void m8031m() {
        this.f6775i.mo30690c(4);
    }

    /* renamed from: n */
    private void m8032n() {
        this.f6775i.mo30690c(3);
    }

    /* renamed from: o */
    private void m8033o() {
        OnPanelDragListener onPanelDragListener = this.f6779m;
        if (onPanelDragListener != null) {
            onPanelDragListener.onPanelDrag(1.0f - Math.max(0.0f, this.f6780n));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m8034p() {
        this.f6767a.setAlpha(this.f6783q && (this.f6780n > 0.0f ? 1 : (this.f6780n == 0.0f ? 0 : -1)) < 0 ? (this.f6780n * 2.2f) + 1.0f : 1.0f);
        float max = Math.max(0.0f, this.f6780n);
        int measuredHeight = (int) (((float) this.f6769c.getMeasuredHeight()) * max);
        this.f6772f = (int) (((float) measuredHeight) - (((float) this.f6775i.mo30680a()) * max));
        m8033o();
        this.f6776j.updateMapPadding(this.f6772f);
        int i = measuredHeight / 2;
        if (i == 0) {
            this.f6770d.setTranslationY((float) C3200e0.m10183a(this.f6767a.getContext(), 70));
        } else {
            this.f6770d.setTranslationY((float) i);
        }
        if (mo8048b() == C2214e.CHAT) {
            max = 1.0f;
        }
        Boolean bool = (Boolean) C3896a1.m11470r().mo10496a().mo36963s();
        float f = bool.booleanValue() ? 0.9f : 0.7f;
        this.f6769c.getBackground().setAlpha((int) ((f + ((1.0f - f) * max)) * 255.0f));
        ComposeView composeView = this.f6773g;
        if (!bool.booleanValue()) {
            max = 1.0f;
        }
        composeView.mo8261b((int) ((0.7f - (max * 0.1f)) * 255.0f));
    }

    /* renamed from: q */
    private void m8035q() {
        m8020a(C2214e.USER_FOCUS, true);
    }

    /* renamed from: i */
    public void mo8056i() {
        if (this.f6774h.hasFocus()) {
            m8023b(false);
        }
    }

    /* renamed from: j */
    public void mo8057j() {
        mo8049b(C2214e.CHAT);
    }

    /* renamed from: k */
    public void mo8058k() {
        C1297b.m6237a((View) this.f6774h);
        m8035q();
    }

    /* renamed from: l */
    public void mo8059l() {
        int c = this.f6775i.mo30689c();
        if (c == 3) {
            mo8051d();
        } else if (c == 4 || c == 5) {
            C1297b.m6237a((View) this.f6774h);
            m8032n();
        }
    }

    /* renamed from: b */
    public C2214e mo8048b() {
        return (C2214e) this.f6782p.mo36963s();
    }

    /* renamed from: c */
    public C12279e<C2214e> mo8050c() {
        return this.f6782p;
    }

    /* renamed from: d */
    public boolean mo8051d() {
        if (mo8048b() == C2214e.CHAT) {
            int c = this.f6775i.mo30689c();
            if (c == 3) {
                m8023b(false);
            } else if (c == 5) {
                OnActionListener onActionListener = this.f6786t;
                if (onActionListener != null) {
                    onActionListener.onFullChatClosed(C2209a.BACK);
                }
                if (this.f6777k) {
                    this.f6776j.dismiss(false);
                } else {
                    mo8049b(C2214e.USER_FOCUS);
                }
            }
        } else if (this.f6775i.mo30689c() == 3) {
            m8031m();
        } else if (this.f6775i.mo30689c() == 5) {
            return false;
        } else {
            this.f6785s = false;
            m8023b(true);
        }
        return true;
    }

    /* renamed from: e */
    public void mo8052e() {
        if (this.f6771e != null) {
            this.f6775i.mo30690c(5);
        }
    }

    /* renamed from: f */
    public boolean mo8053f() {
        return this.f6775i.mo30689c() == 4;
    }

    /* renamed from: g */
    public /* synthetic */ void mo8054g() {
        m8020a(C2214e.USER_FOCUS, true);
    }

    /* renamed from: h */
    public void mo8055h() {
        this.f6769c.removeCallbacks(this.f6781o);
    }

    /* renamed from: b */
    public void mo8049b(C2214e eVar) {
        m8020a(eVar, false);
    }

    /* renamed from: a */
    private void m8020a(C2214e eVar, boolean z) {
        if (mo8048b() == eVar) {
            if (!z) {
                return;
            }
        } else if (eVar == C2214e.USER_FOCUS) {
            this.f6784r = true;
        }
        this.f6782p.onNext(eVar);
        int i = C2212c.f6797a[eVar.ordinal()];
        if (i == 1) {
            this.f6776j.onFullscreenChanged(false);
            this.f6775i.mo30691c(false);
            this.f6768b.setVisibility(8);
            this.f6768b.mo6328a(0, false);
            this.f6773g.setEditable(false);
            this.f6783q = true;
            m8031m();
        } else if (i == 2) {
            OnActionListener onActionListener = this.f6786t;
            if (onActionListener != null) {
                onActionListener.onFullChatOpen();
            }
            this.f6776j.onFullscreenChanged(true);
            this.f6775i.mo30691c(true);
            this.f6773g.setEditable(true);
            if (!this.f6773g.mo8260a()) {
                m8023b(false);
            }
            this.f6768b.mo6328a(1, false);
            this.f6768b.setVisibility(0);
            m8034p();
        }
        OnStateChangeListener onStateChangeListener = this.f6778l;
        if (onStateChangeListener != null) {
            onStateChangeListener.onStateChange(eVar);
        }
    }

    /* renamed from: b */
    private void m8023b(boolean z) {
        this.f6783q = z;
        this.f6775i.mo30690c(5);
    }

    /* renamed from: a */
    public void mo8044a(OnStateChangeListener onStateChangeListener) {
        this.f6778l = onStateChangeListener;
    }

    /* renamed from: a */
    public void mo8043a(OnPanelDragListener onPanelDragListener) {
        this.f6779m = onPanelDragListener;
        m8033o();
    }

    /* renamed from: a */
    public void mo8042a(OnActionListener onActionListener) {
        this.f6787u = onActionListener;
    }

    /* renamed from: a */
    public void mo8045a(C2214e eVar) {
        this.f6775i.mo30690c(5);
        if (eVar == C2214e.USER_FOCUS) {
            this.f6767a.setAlpha(0.0f);
            this.f6769c.post(this.f6781o);
            return;
        }
        m8020a(C2214e.CHAT, true);
    }

    /* renamed from: a */
    public void mo8046a(C8819d dVar, String str) {
        C8831g a = dVar.mo23896a(this.f6769c);
        if (!a.mo24012j()) {
            C2266x xVar = new C2266x(str);
            xVar.mo23929b(dVar);
            a.mo24008d(C8836h.m21058a((C8819d) xVar));
        }
        this.f6771e = this.f6769c.findViewById(R.id.controller_emoji_packs_pager);
    }

    /* renamed from: a */
    public void mo8047a(boolean z) {
        View view = this.f6771e;
        if (view != null) {
            int i = 0;
            if ((view.getVisibility() == 0) != z) {
                View view2 = this.f6771e;
                if (!z) {
                    i = 8;
                }
                view2.setVisibility(i);
                if (mo8048b() == C2214e.USER_FOCUS) {
                    mo8058k();
                }
            }
        }
    }

    /* renamed from: a */
    public int mo8041a() {
        return this.f6772f;
    }
}
