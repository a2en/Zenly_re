package app.zenly.locator.chat.capsules;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.C1094b;
import androidx.recyclerview.widget.C1112g;
import androidx.recyclerview.widget.C1112g.C1114b;
import androidx.recyclerview.widget.C1112g.C1115c;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.chat.C2285q4;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.capsules.CapsulesViewController.OnEmojiAnimationsOverCallback;
import app.zenly.locator.chat.content.MemberHandler;
import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import app.zenly.locator.chat.view.EmojisCounterView;
import app.zenly.locator.chat.view.EmojisCounterView.C2355a;
import app.zenly.locator.core.p072ui.view.CapsuleTextView;
import app.zenly.locator.core.p072ui.view.PingParticleView;
import app.zenly.locator.core.p072ui.view.particles.ParticlePathAnimation.OnAnimationListener;
import app.zenly.locator.core.p072ui.view.particles.ParticlesGroupEmojisAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticlesGroupEmojisAnimation.OnNewParticleStartedCallback;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.p143s.p149m.C5454c;
import app.zenly.locator.p143s.p156s.C5509a;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C12899i;
import p214e.p228e.C7571a;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.chat.capsules.l */
public class C1909l extends C1069g<C1911b> {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final int f6227l = C3200e0.m10182a(26);

    /* renamed from: a */
    private final ZenlySchedulers f6228a = C1351e.m6372a(C2382x4.f7181b.mo19916a("capsulesAdapter"));

    /* renamed from: b */
    private final MemberHandler f6229b;

    /* renamed from: c */
    private final PingParticleView f6230c;

    /* renamed from: d */
    private final C5569a f6231d;

    /* renamed from: e */
    private final ScrollToPositionCallback f6232e;

    /* renamed from: f */
    private List<C1908k> f6233f = new ArrayList();

    /* renamed from: g */
    private Map<String, Long> f6234g = new C7571a();

    /* renamed from: h */
    private long f6235h = 0;

    /* renamed from: i */
    private final OnEmojiAnimationsOverCallback f6236i;

    /* renamed from: j */
    private final HashMap<C2242d, C12899i<ParticlesGroupEmojisAnimation, Animator>> f6237j = new LinkedHashMap();

    /* renamed from: k */
    private final int f6238k;

    /* renamed from: app.zenly.locator.chat.capsules.l$a */
    private static class C1910a extends C1114b {

        /* renamed from: a */
        private List<C1908k> f6239a;

        /* renamed from: b */
        private List<C1908k> f6240b;

        C1910a(List<C1908k> list, List<C1908k> list2) {
            this.f6240b = list;
            this.f6239a = list2;
        }

        public boolean areContentsTheSame(int i, int i2) {
            C1908k kVar = (C1908k) this.f6240b.get(i);
            C1908k kVar2 = (C1908k) this.f6239a.get(i2);
            return kVar.mo7639a() == kVar2.mo7639a() && kVar.mo7640b().equals(kVar2.mo7640b()) && kVar.mo7641c().equals(kVar2.mo7641c());
        }

        public boolean areItemsTheSame(int i, int i2) {
            return ((C1908k) this.f6240b.get(i)).mo7642d().equals(((C1908k) this.f6239a.get(i2)).mo7642d());
        }

        public Object getChangePayload(int i, int i2) {
            return Long.valueOf(((C1908k) this.f6239a.get(i2)).mo7639a());
        }

        public int getNewListSize() {
            return this.f6239a.size();
        }

        public int getOldListSize() {
            return this.f6240b.size();
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.l$b */
    static class C1911b extends C1085v {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ObjectAnimator f6241a;

        /* renamed from: b */
        public final C12275b f6242b = new C12275b();

        /* renamed from: c */
        Long f6243c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f6244d = false;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f6245e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final CapsuleTextView f6246f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final SimpleDraweeView f6247g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final EmojisCounterView f6248h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final C5454c f6249i;

        C1911b(View view) {
            super(view);
            this.f6246f = (CapsuleTextView) view.findViewById(R.id.capsule_name);
            this.f6247g = (SimpleDraweeView) view.findViewById(R.id.capsule_icon);
            this.f6248h = (EmojisCounterView) view.findViewById(R.id.counter_view);
            this.f6248h.setEndVisibility(4);
            this.f6248h.setVisibility(4);
            this.f6245e = this.f6246f.getPaddingEnd();
            this.f6241a = ObjectAnimator.ofInt(this.f6246f, CapsuleTextView.f8610h, new int[]{this.f6245e, C1909l.f6227l});
            this.f6249i = new C5454c(this.f6247g, 2131951616);
            this.f6241a.setInterpolator(C7657c.m18650f());
            this.f6241a.setDuration(300);
        }
    }

    public C1909l(ScrollToPositionCallback scrollToPositionCallback, MemberHandler memberHandler, OnEmojiAnimationsOverCallback onEmojiAnimationsOverCallback, PingParticleView pingParticleView, C5569a aVar) {
        this.f6232e = scrollToPositionCallback;
        this.f6236i = onEmojiAnimationsOverCallback;
        this.f6229b = memberHandler;
        this.f6230c = pingParticleView;
        this.f6231d = aVar;
        this.f6238k = C3200e0.m10183a(pingParticleView.getContext(), 3);
        setHasStableIds(true);
    }

    /* renamed from: b */
    private long m7506b() {
        long j = this.f6235h;
        this.f6235h = 1 + j;
        return j;
    }

    /* renamed from: c */
    private void m7510c(C1911b bVar) {
        bVar.f6242b.mo36401a();
        mo7651a(bVar, (List<C2242d>) new ArrayList<C2242d>(this.f6237j.keySet()));
    }

    public int getItemCount() {
        return this.f6233f.size();
    }

    public long getItemId(int i) {
        return ((Long) this.f6234g.get(((C1908k) this.f6233f.get(i)).mo7642d())).longValue();
    }

    /* renamed from: a */
    public boolean onFailedToRecycleView(C1911b bVar) {
        m7510c(bVar);
        return true;
    }

    /* renamed from: b */
    public void onViewRecycled(C1911b bVar) {
        super.onViewRecycled(bVar);
        m7510c(bVar);
    }

    public C1911b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1911b bVar = new C1911b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_capsule, viewGroup, false));
        bVar.itemView.setOnClickListener(new C1905h(this, bVar));
        return bVar;
    }

    /* renamed from: c */
    private void m7511c(C1911b bVar, List<C2242d> list) {
        bVar.f6242b.add(C12279e.m32626e(list).mo36428a(C12802a.m33491b()).mo36494f(C12301a.m32819b()).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1898a<Object,Object>(this)).mo36428a((C12286f) this.f6228a.getMainThread()).mo36459b((Predicate<? super T>) new C1903f<Object>(bVar)).mo36455b((Consumer<? super T>) new C1902e<Object>(this, bVar)).mo36467c((Action) new C1906i(this, bVar, list)).mo36432a((Consumer<? super Throwable>) new C1899b<Object>(this, bVar, list)).mo36508m());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7650a(C1911b bVar, View view) {
        this.f6229b.invoke(((C1908k) this.f6233f.get(bVar.getAdapterPosition())).mo7642d());
    }

    /* renamed from: b */
    private void m7507b(C1911b bVar, int i, List<Object> list) {
        if (!list.isEmpty()) {
            long longValue = ((Long) list.get(0)).longValue();
            Long l = bVar.f6243c;
            if (l == null || l.longValue() != longValue) {
                C7697b.m18727a(bVar.f6247g);
                boolean z = true;
                if ((8 & longValue) != 0) {
                    bVar.f6249i.mo13042c();
                } else {
                    if ((longValue & 1) == 0) {
                        z = false;
                    }
                    if (z) {
                        bVar.f6249i.mo13041b();
                    }
                    bVar.f6249i.mo13043d();
                }
            }
        } else {
            bVar.f6242b.mo36401a();
        }
        onBindViewHolder(bVar, i);
    }

    /* renamed from: a */
    public void onBindViewHolder(C1911b bVar, int i, List<Object> list) {
        m7507b(bVar, i, list);
    }

    /* renamed from: a */
    public void onBindViewHolder(C1911b bVar, int i) {
        int i2;
        int i3;
        C1908k kVar = (C1908k) this.f6233f.get(i);
        if ((kVar.mo7639a() & 32) != 0) {
            i3 = C2285q4.m8183a(kVar.mo7642d(), true);
            i2 = R.color.white;
        } else {
            i3 = R.color.gray_light;
            i2 = R.color.gray_heavy;
        }
        Long l = bVar.f6243c;
        if (l == null || l.longValue() != kVar.mo7639a()) {
            if ((kVar.mo7639a() & 1) != 0) {
                if (bVar.f6246f.getPaddingEnd() != f6227l) {
                    bVar.f6244d = false;
                    bVar.f6241a.start();
                }
                C7697b.m18727a(bVar.f6247g);
            } else {
                if (bVar.f6246f.getPaddingEnd() != bVar.f6245e && !bVar.f6244d) {
                    bVar.f6244d = true;
                    bVar.f6241a.reverse();
                }
                C7697b.m18733b(bVar.f6247g);
            }
        }
        Context context = bVar.f6246f.getContext();
        bVar.f6246f.setColorResource(i3);
        bVar.f6246f.setText(kVar.mo7640b());
        bVar.f6246f.setTextColor(C0540a.m2536a(context, i2));
        ArrayList<C2242d> arrayList = new ArrayList<>(kVar.mo7641c());
        arrayList.removeAll(this.f6237j.keySet());
        for (C2242d put : arrayList) {
            this.f6237j.put(put, null);
        }
        if (arrayList.size() > 0) {
            m7511c(bVar, (List<C2242d>) arrayList);
        }
        bVar.f6248h.setColor(i3);
        bVar.f6243c = Long.valueOf(kVar.mo7639a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo7651a(C1911b bVar, List<C2242d> list) {
        bVar.f6248h.setVisibility(4);
        for (C2242d dVar : list) {
            C12899i iVar = (C12899i) this.f6237j.remove(dVar);
            if (iVar != null) {
                ((ParticlesGroupEmojisAnimation) iVar.mo37204c()).mo9493a(true);
                ((Animator) iVar.mo37205d()).end();
                this.f6236i.onEmojiAnimationsOver(dVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo7653a(C1911b bVar, C12899i<Bitmap, C2242d> iVar) {
        ParticlesGroupEmojisAnimation a = this.f6230c.mo9419a((Bitmap) iVar.mo37204c(), (View) bVar.f6246f, Math.min(5, ((C2242d) iVar.mo37205d()).f6867c), (OnAnimationListener) new C1904g(this, iVar), (OnNewParticleStartedCallback) new C1901d(bVar, ((C2242d) iVar.mo37205d()).f6867c));
        C5509a.m15626a(bVar.itemView.getContext(), ((C2242d) iVar.mo37205d()).f6865a);
        AnimatorSet animatorSet = new AnimatorSet();
        bVar.f6246f.setTranslationY((float) this.f6238k);
        bVar.f6247g.setTranslationY((float) this.f6238k);
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(bVar.f6246f, View.TRANSLATION_Y, new float[]{(float) this.f6238k, 0.0f}), ObjectAnimator.ofFloat(bVar.f6247g, View.TRANSLATION_Y, new float[]{(float) this.f6238k, 0.0f})});
        animatorSet.setDuration(150);
        animatorSet.start();
        this.f6237j.put(iVar.mo37205d(), new C12899i(a, animatorSet));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo7647a(C2242d dVar) throws Exception {
        return this.f6231d.mo13180b(dVar.f6866b).mo36440a((Iterable<U>) Collections.singletonList(dVar), (BiFunction<? super T, ? super U, ? extends R>) C1907j.f6222a);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7652a(C1911b bVar, List list, Throwable th) throws Exception {
        mo7651a(bVar, list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7655a(C12899i iVar) {
        this.f6237j.remove(iVar.mo37205d());
        this.f6236i.onEmojiAnimationsOver((C2242d) iVar.mo37205d());
    }

    /* renamed from: a */
    static /* synthetic */ void m7504a(int i, int i2, C1911b bVar) {
        if (i == 0 && i2 > 1) {
            bVar.f6248h.setVisibility(0);
            bVar.f6248h.mo8279a(C2355a.INBOUND, i2);
        }
    }

    /* renamed from: a */
    public void mo7654a(List<C1908k> list) {
        C1115c a = C1112g.m5467a(new C1910a(this.f6233f, list));
        this.f6233f = list;
        for (C1908k kVar : list) {
            if (!this.f6234g.containsKey(kVar.mo7642d())) {
                this.f6234g.put(kVar.mo7642d(), Long.valueOf(m7506b()));
            }
        }
        a.mo5696a((ListUpdateCallback) new C1940s(new C1094b(this), this.f6232e));
    }
}
