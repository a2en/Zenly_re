package app.zenly.locator.chat.capsules;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.C1101f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import app.zenly.locator.C3891l;
import app.zenly.locator.chat.content.MemberHandler;
import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import app.zenly.locator.core.p072ui.view.PingParticleView;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;

public final class CapsulesViewController implements LayoutContainer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f6192a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f6193b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f6194c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f6195d = new C1897c(this);

    /* renamed from: e */
    private final C1909l f6196e;

    /* renamed from: f */
    private final C1896b f6197f;

    /* renamed from: g */
    private final View f6198g;

    /* renamed from: h */
    private HashMap f6199h;

    public interface OnEmojiAnimationsOverCallback {
        void onEmojiAnimationsOver(C2242d dVar);
    }

    /* renamed from: app.zenly.locator.chat.capsules.CapsulesViewController$a */
    public static final class C1895a implements ScrollToPositionCallback {

        /* renamed from: a */
        final /* synthetic */ CapsulesViewController f6200a;

        C1895a(CapsulesViewController capsulesViewController) {
            this.f6200a = capsulesViewController;
        }

        public void onScrollToPosition(int i) {
            this.f6200a.f6192a.removeCallbacks(this.f6200a.f6195d);
            this.f6200a.f6194c = i;
            if (this.f6200a.f6193b) {
                this.f6200a.f6192a.postDelayed(this.f6200a.f6195d, 3000);
            } else {
                this.f6200a.f6192a.post(this.f6200a.f6195d);
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.CapsulesViewController$b */
    public static final class C1896b extends C1076n {

        /* renamed from: a */
        final /* synthetic */ CapsulesViewController f6201a;

        C1896b(CapsulesViewController capsulesViewController) {
            this.f6201a = capsulesViewController;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C12932j.m33818b(recyclerView, "recyclerView");
            if (i == 0) {
                this.f6201a.f6193b = false;
                if (this.f6201a.f6194c > -1) {
                    this.f6201a.f6192a.postDelayed(this.f6201a.f6195d, 3000);
                    return;
                }
                return;
            }
            this.f6201a.f6193b = true;
            this.f6201a.f6192a.removeCallbacksAndMessages(this.f6201a.f6195d);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.CapsulesViewController$c */
    static final class C1897c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CapsulesViewController f6202e;

        C1897c(CapsulesViewController capsulesViewController) {
            this.f6202e = capsulesViewController;
        }

        public final void run() {
            if (this.f6202e.f6194c != -1) {
                ((RecyclerView) this.f6202e.mo7628a(C3891l.chat_capsules)).mo5096g(this.f6202e.f6194c);
                this.f6202e.f6194c = -1;
            }
        }
    }

    public CapsulesViewController(View view, MemberHandler memberHandler, OnEmojiAnimationsOverCallback onEmojiAnimationsOverCallback, C5569a aVar) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(memberHandler, "capsuleClickHandler");
        C12932j.m33818b(onEmojiAnimationsOverCallback, "onEmojiAnimationsOverCallback");
        C12932j.m33818b(aVar, "emojisLoader");
        this.f6198g = view;
        C1909l lVar = new C1909l(new C1895a(this), memberHandler, onEmojiAnimationsOverCallback, (PingParticleView) mo7628a(C3891l.group_chat_ping_particle_view), aVar);
        this.f6196e = lVar;
        this.f6197f = new C1896b(this);
        ((RecyclerView) mo7628a(C3891l.chat_capsules)).mo5047a((C1076n) this.f6197f);
        RecyclerView recyclerView = (RecyclerView) mo7628a(C3891l.chat_capsules);
        String str = "chat_capsules";
        C12932j.m33815a((Object) recyclerView, str);
        recyclerView.setAdapter(this.f6196e);
        RecyclerView recyclerView2 = (RecyclerView) mo7628a(C3891l.chat_capsules);
        C12932j.m33815a((Object) recyclerView2, str);
        C1101f fVar = new C1101f();
        fVar.setSupportsChangeAnimations(false);
        recyclerView2.setItemAnimator(fVar);
    }

    /* renamed from: a */
    public View mo7628a(int i) {
        if (this.f6199h == null) {
            this.f6199h = new HashMap();
        }
        View view = (View) this.f6199h.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f6199h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public View getContainerView() {
        return this.f6198g;
    }

    /* renamed from: a */
    public final void mo7629a() {
        ((RecyclerView) mo7628a(C3891l.chat_capsules)).mo5066b((C1076n) this.f6197f);
        RecyclerView recyclerView = (RecyclerView) mo7628a(C3891l.chat_capsules);
        C12932j.m33815a((Object) recyclerView, "chat_capsules");
        recyclerView.setAdapter(null);
    }

    /* renamed from: a */
    public final void mo7630a(List<C1908k> list) {
        C12932j.m33818b(list, "items");
        this.f6196e.mo7654a(list);
    }
}
