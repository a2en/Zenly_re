package app.zenly.locator.discover;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.models.C2916z;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.core.util.C3238u;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p207x.C6272z1;
import com.android.volley.toolbox.C8733j;
import com.bluelinelabs.conductor.C8829e;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bumptech.glide.load.engine.C8978i;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.bubble.C6971b;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.discover.n */
public class C3565n extends ZenlyController {

    /* renamed from: P */
    private final ZenlySchedulers f9586P;

    /* renamed from: Q */
    private final Handler f9587Q;

    /* renamed from: R */
    private final C12275b f9588R;

    /* renamed from: S */
    private C2718k5 f9589S;

    /* renamed from: T */
    private MeUserManager f9590T;

    /* renamed from: U */
    private C2896p f9591U;

    /* renamed from: V */
    private final String f9592V;

    /* renamed from: W */
    private final int f9593W;

    /* renamed from: X */
    private final ArrayList<C2896p> f9594X;

    /* renamed from: Y */
    private final boolean f9595Y;

    /* renamed from: Z */
    private int f9596Z;

    /* renamed from: a0 */
    private C2900b f9597a0;

    /* renamed from: b0 */
    private int f9598b0;

    /* renamed from: c0 */
    private Date f9599c0;

    /* renamed from: d0 */
    private C6272z1 f9600d0;

    /* renamed from: e0 */
    private AnimatorSet f9601e0;

    /* renamed from: f0 */
    private TextView f9602f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public ImageView f9603g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public ImageView f9604h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public ImageView f9605i0;

    /* renamed from: j0 */
    private int f9606j0;

    /* renamed from: k0 */
    private int f9607k0;

    /* renamed from: app.zenly.locator.discover.n$a */
    class C3566a extends C5432b {
        C3566a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C3565n.this.f9603g0.setVisibility(0);
            C3565n.this.f9604h0.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.discover.n$b */
    class C3567b extends C5432b {
        C3567b() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C3565n.this.f9603g0.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.discover.n$c */
    class C3568c extends C5432b {
        C3568c() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C3565n.this.m10791K();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C3565n.this.f9605i0.setVisibility(0);
            C3565n.this.m10791K();
        }
    }

    /* renamed from: app.zenly.locator.discover.n$d */
    class C3569d extends C5432b {
        C3569d() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C3565n.this.f9605i0.setVisibility(0);
            C3565n.this.m10791K();
        }
    }

    public C3565n(String str, int i, ArrayList<String> arrayList, int i2) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("Discover.UserUuid", str);
        dVar.mo9607a("Discover.GatheringId", i);
        dVar.mo9611a("Discover.GatheringMembers", arrayList);
        dVar.mo9607a("Discover.HotCount", i2);
        this(dVar.mo9605a());
    }

    /* renamed from: D */
    private void m10784D() {
        AnimatorSet animatorSet = this.f9601e0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f9601e0 = null;
        }
        this.f9587Q.removeCallbacksAndMessages(null);
        this.f9605i0.setVisibility(8);
        this.f9603g0.setVisibility(8);
        this.f9603g0.setVisibility(8);
        this.f9602f0.setVisibility(8);
    }

    /* renamed from: E */
    private int m10785E() {
        C5459d dVar = this.f9590T.mo8756b().f8252c;
        if (dVar == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.max(0.0d, ((double) C3225m.m10225a(dVar.mo13060b(), dVar.mo13062c(), this.f9591U.f8199c.mo13060b(), this.f9591U.f8199c.mo13062c())) - this.f9591U.f8202f);
    }

    /* renamed from: F */
    private int m10786F() {
        List<C2916z> list = this.f9590T.mo8756b().f8256g;
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        double d = Double.MAX_VALUE;
        for (C2916z zVar : list) {
            if (zVar.mo9015b() != null) {
                double a = (double) C3225m.m10225a(this.f9591U.f8199c.mo13060b(), this.f9591U.f8199c.mo13062c(), zVar.mo9015b().mo13060b(), zVar.mo9015b().mo13062c());
                if (a < d) {
                    d = a;
                }
            }
        }
        return (int) Math.round(d);
    }

    /* renamed from: G */
    private int m10787G() {
        return Math.min(Math.max(1200, Math.min(m10785E(), m10786F()) / 4), 500000);
    }

    /* renamed from: H */
    private long m10788H() {
        int i = this.f9596Z;
        if (i > 400000) {
            return 3000;
        }
        if (i > 80000) {
            return 2250;
        }
        return (i > 15000 || this.f9595Y) ? 1500 : 750;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m10789I() {
        this.f9602f0.animate().alpha(0.0f).start();
        this.f9603g0.animate().alpha(0.0f).start();
        this.f9604h0.animate().alpha(0.0f).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m10790J() {
        if (this.f9597a0 != null) {
            m10802b(2000);
        } else if (this.f9593W != -1) {
            m10792L();
        }
        C3896a1.m11470r().mo10514d(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m10791K() {
        this.f9605i0.setRotation((float) C3238u.m10270a(0, 360));
        this.f9605i0.setImageResource(C3238u.m10270a(0, 2) == 0 ? 2131231248 : 2131231249);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m10792L() {
        if (this.f9594X.size() > 1) {
            this.f9598b0++;
            if (this.f9598b0 >= this.f9594X.size()) {
                if (this.f9597a0 != null) {
                    this.f9598b0 = -1;
                    m10805c(this.f9596Z);
                    m10789I();
                    this.f9587Q.postDelayed(new C3555d(this), 1500);
                    return;
                }
                this.f9598b0 = 0;
            }
            C2896p pVar = (C2896p) this.f9594X.get(this.f9598b0);
            View m = mo23948m();
            if (m != null) {
                m10794N();
                this.f9602f0.setText(pVar.f8198b.mo8942e());
                this.f9602f0.setTranslationX((float) (-m.getWidth()));
                this.f9602f0.animate().translationX(0.0f);
            }
            C3896a1.m11470r().mo10498a(C2458b.GATHERING);
            C3896a1.m11470r().mo10507a(pVar.f8197a, true, -2);
            this.f9587Q.postDelayed(new C3557f(this), 2000);
        }
    }

    /* renamed from: M */
    private void m10793M() {
        this.f9602f0.setText(this.f9591U.f8198b.mo8942e());
        this.f9587Q.postDelayed(new C3556e(this), 3000);
    }

    /* renamed from: N */
    private void m10794N() {
        this.f9602f0.animate().alpha(1.0f).start();
        this.f9603g0.animate().alpha(1.0f).start();
        this.f9604h0.animate().alpha(1.0f).start();
    }

    /* renamed from: O */
    private void m10795O() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9605i0, View.ALPHA, new float[]{0.0f, 1.0f, 1.0f, 0.0f});
        ofFloat.addListener(new C3569d());
        this.f9601e0 = new AnimatorSet();
        this.f9601e0.playTogether(new Animator[]{ofFloat, ObjectAnimator.ofFloat(this.f9605i0, View.SCALE_X, new float[]{1.0f, 4.0f}), ObjectAnimator.ofFloat(this.f9605i0, View.SCALE_Y, new float[]{1.0f, 4.0f})});
        this.f9601e0.setDuration(1200);
        this.f9601e0.setStartDelay((m10788H() / 4) + 1400);
        this.f9601e0.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m10796P() {
        long H = m10788H();
        m10798a((int) C8733j.DEFAULT_IMAGE_TIMEOUT_MS, H);
        this.f9587Q.postDelayed(new C3554c(this), H);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10808e(boolean z) {
        this.f9602f0.setTextColor(z ? this.f9607k0 : this.f9606j0);
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        m10802b(4000);
    }

    /* renamed from: C */
    public void mo10035C() {
        m10784D();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* renamed from: c */
    private void m10805c(int i) {
        if (this.f9600d0 != null) {
            C5460e eVar = new C5460e(this.f9597a0.f8225b.mo13060b(), this.f9597a0.f8225b.mo13062c(), this.f9597a0.f8225b.mo13060b(), this.f9597a0.f8225b.mo13062c());
            eVar.mo13068a((double) ((this.f9597a0.f8228e + ((float) i)) / 2.0f));
            C3896a1.m11470r().mo10504a(false);
            C3896a1.m11470r().mo10502a(eVar, 150);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f9590T = C2666b.m9049a(context).mo8764b();
        this.f9589S = C2666b.m9049a(context).mo8763a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof C6272z1) {
            this.f9600d0 = (C6272z1) mo23947l();
        }
        if (this.f9599c0 == null || C5448c.m15478a().timeSince(this.f9599c0) <= TimeUnit.MINUTES.toMillis(5)) {
            this.f9591U = this.f9589S.mo8779a(this.f9592V);
            ArrayList stringArrayList = mo23933c().getStringArrayList("Discover.GatheringMembers");
            if (stringArrayList != null) {
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    C2896p a = this.f9589S.mo8779a((String) it.next());
                    if (a != null) {
                        this.f9594X.add(a);
                    }
                }
            }
            this.f9596Z = m10787G();
            C2900b a2 = this.f9589S.mo8780a(this.f9593W);
            if (a2 != null && a2.f8240l.size() > 1) {
                this.f9597a0 = a2;
                m10805c(this.f9596Z);
                m10803b(view.getContext());
            } else if (this.f9594X.size() > 1) {
                m10798a(this.f9596Z, 150);
            } else {
                C3896a1.m11470r().mo10507a(this.f9592V, true, this.f9596Z);
                m10793M();
                if (this.f9595Y) {
                    C2890k kVar = this.f9591U.f8210n;
                    if (!(kVar == null || kVar.mo8962b() == null)) {
                        C2896p pVar = this.f9591U;
                        if (pVar.f8214r && pVar.f8219w == C2918b.NONE) {
                            m10800a(pVar.f8210n.mo8962b());
                        }
                    }
                    m10795O();
                }
            }
            this.f9588R.add(C3896a1.m11470r().mo10496a().mo36428a((C12286f) this.f9586P.getMainThread()).mo36476d((Consumer<? super T>) new C3553b<Object>(this)));
            C3896a1.m11470r().mo10514d(true);
            this.f9587Q.postDelayed(new C3552a(this), 1400);
            return;
        }
        this.f9600d0.mo14123d((String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo9310d(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        super.mo9310d(controllerChangeHandler, eVar);
        if (!eVar.f22921e) {
            m10784D();
            C3896a1.m11470r().mo10498a(C2458b.NORMAL);
            C3896a1.m11470r().mo10514d(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_discover, viewGroup, false);
        this.f9606j0 = C7678c.m18702a(inflate.getContext(), (int) R.attr.zenlyLightMapTextColor);
        this.f9607k0 = C7678c.m18702a(inflate.getContext(), (int) R.attr.zenlyDarkMapTextColor);
        this.f9602f0 = (TextView) inflate.findViewById(R.id.discover_name);
        this.f9603g0 = (ImageView) inflate.findViewById(R.id.discover_bubble_1);
        this.f9604h0 = (ImageView) inflate.findViewById(R.id.discover_bubble_2);
        this.f9605i0 = (ImageView) inflate.findViewById(R.id.discover_clouds);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f9600d0 = null;
        this.f9588R.mo36401a();
        this.f9599c0 = C5448c.m15478a().timeNow();
        super.mo7053d(view);
    }

    public C3565n(String str, int i, ArrayList<String> arrayList) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("Discover.UserUuid", str);
        dVar.mo9607a("Discover.GatheringId", i);
        dVar.mo9611a("Discover.GatheringMembers", arrayList);
        this(dVar.mo9605a());
    }

    /* renamed from: a */
    private void m10800a(C6971b bVar) {
        boolean z;
        Activity b = mo23920b();
        if (b != null) {
            this.f9602f0.setText(this.f9591U.f8198b.mo8942e());
            this.f9602f0.setScaleX(0.0f);
            this.f9602f0.setScaleY(0.0f);
            this.f9587Q.postDelayed(new C3556e(this), 3000);
            if (!TextUtils.isEmpty(bVar.getBadgeUrl())) {
                C2476d.m8581a(b).mo8550a(bVar.getBadgeUrl()).m8691a(C8978i.f23423a).mo24173a(this.f9603g0);
            }
            if (bVar.getIconsCount() > 1) {
                C2476d.m8581a(b).mo8550a(bVar.getIcons(1).getImage().getUrl()).m8691a(C8978i.f23423a).mo24173a(this.f9604h0);
                z = true;
            } else {
                z = false;
            }
            Display defaultDisplay = b.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int a = (point.x / 2) - C3200e0.m10183a((Context) mo23920b(), 112);
            int a2 = C3200e0.m10183a((Context) mo23920b(), 30);
            int a3 = C3200e0.m10183a((Context) mo23920b(), 160);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9603g0, View.TRANSLATION_X, new float[]{(float) (-a), (float) (-a2)});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9604h0, View.TRANSLATION_X, new float[]{(float) a, (float) a2});
                float f = (float) a3;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9603g0, View.TRANSLATION_Y, new float[]{f, 0.0f});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9604h0, View.TRANSLATION_Y, new float[]{f, 0.0f});
                ofFloat.addListener(new C3566a());
                animatorSet.setStartDelay(500);
                animatorSet.setDuration(400);
                animatorSet.setInterpolator(C7657c.m18643b());
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
                animatorSet2.setStartDelay(860);
                animatorSet2.setDuration(80);
                animatorSet2.setInterpolator(C7657c.m18643b());
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9603g0, View.ROTATION, new float[]{0.0f, -7.0f}), ObjectAnimator.ofFloat(this.f9604h0, View.ROTATION, new float[]{0.0f, 7.0f})});
            } else {
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9603g0, View.SCALE_X, new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9603g0, View.SCALE_Y, new float[]{0.0f, 1.0f});
                ofFloat5.addListener(new C3567b());
                animatorSet.setStartDelay(500);
                animatorSet.setDuration(400);
                animatorSet.setInterpolator(C7657c.m18650f());
                animatorSet.playTogether(new Animator[]{ofFloat5, ofFloat6});
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(1500);
            animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9605i0, View.SCALE_X, new float[]{1.0f, 5.0f}), ObjectAnimator.ofFloat(this.f9605i0, View.SCALE_Y, new float[]{1.0f, 5.0f}), ObjectAnimator.ofFloat(this.f9605i0, View.ALPHA, new float[]{1.0f, 1.0f, 0.0f})});
            animatorSet3.addListener(new C3568c());
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setStartDelay(1100);
            animatorSet4.setDuration(400);
            animatorSet4.setInterpolator(C7657c.m18641a());
            animatorSet4.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9603g0, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f9604h0, View.ALPHA, new float[]{1.0f, 0.0f})});
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.setStartDelay(1400);
            animatorSet5.setDuration(200);
            animatorSet5.setInterpolator(C7657c.m18650f());
            animatorSet5.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9602f0, View.SCALE_X, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f9602f0, View.SCALE_Y, new float[]{0.0f, 1.0f})});
            this.f9601e0 = new AnimatorSet();
            this.f9601e0.playTogether(new Animator[]{animatorSet, animatorSet2, animatorSet3, animatorSet4, animatorSet5});
            this.f9601e0.setStartDelay(600);
            this.f9601e0.start();
        }
    }

    public C3565n(Bundle bundle) {
        super(bundle);
        this.f9586P = C1351e.m6372a(C3571p.f9615b.mo19916a("controller"));
        this.f9587Q = new Handler();
        this.f9588R = new C12275b();
        this.f9594X = new ArrayList<>();
        this.f9598b0 = -1;
        this.f9592V = bundle.getString("Discover.UserUuid");
        this.f9593W = bundle.getInt("Discover.GatheringId");
        this.f9595Y = bundle.getInt("Discover.HotCount") > 0;
    }

    /* renamed from: b */
    private void m10803b(Context context) {
        C2896p pVar = (C2896p) this.f9594X.get(0);
        C2896p pVar2 = (C2896p) this.f9594X.get(1);
        if (this.f9594X.size() == 2) {
            this.f9602f0.setText(context.getString(R.string.discover_friendslist_pair, new Object[]{pVar.f8198b.mo8942e(), pVar2.f8198b.mo8942e()}));
        } else if (this.f9594X.size() == 3 && pVar.f8214r && pVar2.f8214r) {
            this.f9602f0.setText(context.getString(R.string.discover_friendslist_trio, new Object[]{pVar.f8198b.mo8942e(), pVar2.f8198b.mo8942e()}));
        } else if (this.f9594X.size() <= 3 || !pVar.f8214r || !pVar2.f8214r) {
            this.f9602f0.setText(context.getString(R.string.discover_friendslist_unknown));
        } else {
            this.f9602f0.setText(context.getString(R.string.discover_friendslist_quartet, new Object[]{pVar.f8198b.mo8942e(), pVar2.f8198b.mo8942e()}));
        }
    }

    /* renamed from: b */
    private void m10802b(int i) {
        if (C3896a1.m11470r().mo10505a(this.f9593W, true)) {
            this.f9587Q.postDelayed(new C3557f(this), (long) i);
        } else {
            m10792L();
        }
    }

    /* renamed from: a */
    private void m10798a(int i, long j) {
        C5460e eVar = new C5460e(this.f9591U.f8199c.mo13060b(), this.f9591U.f8199c.mo13062c(), this.f9591U.f8199c.mo13060b(), this.f9591U.f8199c.mo13062c());
        eVar.mo13068a((double) (i / 2));
        C3896a1.m11470r().mo10502a(eVar, j);
    }
}
