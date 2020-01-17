package app.zenly.locator.chat.panel.emojis;

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.chat.C2316s4;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.panel.C2216b;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnActionListener;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnActionListener.C2209a;
import app.zenly.locator.chat.panel.ChatPanelHelper.OnPanelDragListener;
import app.zenly.locator.chat.panel.emojis.EmojiPackController.Callback;
import app.zenly.locator.chat.panel.emojis.p057f0.C2241c;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.widget.PageIndicator;
import app.zenly.locator.core.widget.PageIndicator.Adapter;
import app.zenly.locator.core.widget.ViewPager;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.p291j.C8851a;
import java.util.Collections;
import java.util.List;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.chat.panel.emojis.x */
public class C2266x extends ZenlyController implements Callback, OnActionListener {
    /* access modifiers changed from: private */

    /* renamed from: P */
    public String f6905P;

    /* renamed from: Q */
    private boolean f6906Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ViewPager f6907R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public PageIndicator f6908S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C2269c f6909T;

    /* renamed from: U */
    private DataSetObserver f6910U;

    /* renamed from: V */
    private OnPageChangeListener f6911V;

    /* renamed from: W */
    private Callback f6912W;

    /* renamed from: X */
    private final C12275b f6913X;

    /* renamed from: Y */
    private final ZenlySchedulers f6914Y;

    /* renamed from: app.zenly.locator.chat.panel.emojis.x$a */
    class C2267a implements OnPageChangeListener {

        /* renamed from: a */
        private int f6915a;

        /* renamed from: b */
        private int f6916b;

        /* renamed from: c */
        final /* synthetic */ View f6917c;

        C2267a(View view) {
            this.f6917c = view;
        }

        /* renamed from: a */
        private void m8152a(int i, float f) {
            if (f != 0.0f && i >= this.f6915a) {
                i++;
            }
            if (i != this.f6916b) {
                this.f6916b = i;
                C2266x xVar = C2266x.this;
                xVar.m8144c(xVar.f6909T.mo24081c(this.f6916b));
            }
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
            C2266x.this.f6908S.setSelection(Math.round(((float) i) + f));
            m8152a(i, f);
        }

        public void onPageSelected(int i) {
            C5498a.m15600a(this.f6917c.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            this.f6915a = i;
            C2266x.this.m8140b(i);
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.x$b */
    class C2268b extends DataSetObserver {
        C2268b() {
        }

        public void onChanged() {
            C2266x.this.f6908S.mo6846a();
            C2266x.this.f6908S.setSelection(C2266x.this.f6907R.getCurrentItem());
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.x$c */
    private class C2269c extends C8851a implements Adapter {

        /* renamed from: i */
        private List<C2241c> f6920i = Collections.emptyList();

        C2269c(C8819d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public int m8155d(int i) {
            while (i >= 0) {
                if (!m8156e(i)) {
                    return i;
                }
                i--;
            }
            return -1;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public boolean m8156e(int i) {
            return ((C2241c) this.f6920i.get(i)).f6858c;
        }

        public int getCount() {
            return this.f6920i.size();
        }

        public int getIcon(int i) {
            C2241c cVar = (C2241c) this.f6920i.get(i);
            if (cVar.f6858c) {
                return 2131231501;
            }
            if (TextUtils.equals(cVar.f6861f, "top")) {
                return 2131231408;
            }
            return R.drawable.icon_dot_size_24;
        }

        /* renamed from: a */
        public void mo8132a(C8831g gVar, int i) {
            if (!gVar.mo24012j()) {
                EmojiPackController a = EmojiPackController.m8060a(C2266x.this.f6905P, ((C2241c) this.f6920i.get(i)).f6861f);
                a.mo23929b((C8819d) C2266x.this);
                gVar.mo24008d(C8836h.m21058a((C8819d) a));
            }
        }

        /* renamed from: b */
        public void mo4289b(ViewGroup viewGroup, int i, Object obj) {
            super.mo4289b(viewGroup, i, obj);
            C2266x.this.m8144c((C8831g) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8133a(List<C2241c> list) {
            this.f6920i = list;
            mo6403a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo8134a(String str, boolean z) {
            for (C2241c cVar : this.f6920i) {
                if (TextUtils.equals(cVar.f6861f, str)) {
                    if (cVar.f6858c == z) {
                        return false;
                    }
                    cVar.f6858c = z;
                    return true;
                }
            }
            return false;
        }
    }

    public C2266x(String str) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("conversation_uuid", str);
        this(dVar.mo9605a());
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m8139b(List list) throws Exception {
        return list;
    }

    public void onEmojiPanelClosed() {
        this.f6906Q = true;
        ViewPager viewPager = this.f6907R;
        if (viewPager != null && this.f6909T != null) {
            m8140b(viewPager.getCurrentItem());
        }
    }

    public void onEmojiPanelOpened(boolean z) {
        this.f6906Q = false;
    }

    public void onEmojiSent(Point point, Bitmap bitmap, float f) {
        Callback callback = this.f6912W;
        if (callback != null) {
            callback.onEmojiSent(point, bitmap, f);
        }
    }

    public void onEmojiSentQuarantineError() {
        Callback callback = this.f6912W;
        if (callback != null) {
            callback.onEmojiSentQuarantineError();
        }
    }

    public void onEmojisBulkSent(int i) {
        Callback callback = this.f6912W;
        if (callback != null) {
            callback.onEmojisBulkSent(i);
        }
    }

    public /* synthetic */ void onFullChatClosed(C2209a aVar) {
        C2216b.$default$onFullChatClosed(this, aVar);
    }

    public /* synthetic */ void onFullChatOpen() {
        C2216b.$default$onFullChatOpen(this);
    }

    /* renamed from: b */
    static /* synthetic */ boolean m8142b(C2241c cVar) throws Exception {
        return !cVar.f6858c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f6913X.mo36401a();
        this.f6907R.mo6343b(this.f6911V);
        this.f6909T.mo6410c(this.f6910U);
        super.mo7066c(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8140b(int i) {
        if (this.f6906Q && i < this.f6909T.getCount() && this.f6909T.m8156e(i)) {
            this.f6907R.mo6328a(this.f6909T.m8155d(i), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_chat_emoji_packs_pager, viewGroup, false);
        this.f6909T = new C2269c(this);
        this.f6907R = (ViewPager) inflate.findViewById(R.id.emoji_panel_pager);
        this.f6907R.setAdapter(this.f6909T);
        this.f6908S = (PageIndicator) inflate.findViewById(R.id.emoji_panel_pager_indicator);
        this.f6908S.setAdapter(this.f6909T);
        this.f6908S.setOnItemClickListener(new C2260t(this));
        this.f6911V = new C2267a(inflate);
        this.f6907R.mo6331a(this.f6911V);
        this.f6910U = new C2268b();
        this.f6909T.mo6404a(this.f6910U);
        C12279e f = C2220b0.m8087a(this.f6905P, inflate.getContext()).mo36475c(1).mo36945f(2);
        this.f6913X.mo36403a(f.mo36484d((Function<? super T, K>) C2262v.f6897e).mo36428a((C12286f) this.f6914Y.getMainThread()).mo36412a((Consumer<? super T>) new C2261u<Object>(this), (Consumer<? super Throwable>) C2258r.f6893e), f.mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C2259s.f6894e).mo36459b((Predicate<? super T>) C2256p.f6891e).mo36428a((C12286f) this.f6914Y.getMainThread()).mo36412a((Consumer<? super T>) new C2255o<Object>(this), (Consumer<? super Throwable>) C2257q.f6892e));
        return inflate;
    }

    public C2266x(Bundle bundle) {
        super(bundle);
        this.f6913X = new C12275b();
        this.f6914Y = C1351e.m6372a(C2382x4.f7181b.mo19916a("emojiPanelController"));
        this.f6905P = bundle.getString("conversation_uuid");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8144c(C8831g gVar) {
        if (gVar != null && !gVar.mo24000b().isEmpty() && (mo23947l() instanceof C2316s4)) {
            ((C2316s4) mo23947l()).mo8190a((OnPanelDragListener) ((C8836h) gVar.mo24000b().get(0)).mo24022a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof Callback) {
            this.f6912W = (Callback) mo23947l();
        }
        if (mo23947l() instanceof C2316s4) {
            ((C2316s4) mo23947l()).mo8189a((OnActionListener) this);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8129a(PageIndicator pageIndicator, int i) {
        this.f6907R.mo6328a(i, true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8130a(List list) throws Exception {
        this.f6909T.mo8133a(list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8128a(C2241c cVar) throws Exception {
        if (this.f6909T.mo8134a(cVar.f6861f, false)) {
            this.f6908S.mo6846a();
            this.f6908S.setSelection(this.f6907R.getCurrentItem());
        }
    }
}
