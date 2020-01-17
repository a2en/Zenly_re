package app.zenly.locator.powermoves.p133ui.story;

import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0540a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0890v;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p162w.p165e.C5577a;
import app.zenly.locator.p143s.p162w.p165e.C5577a.C5583b;
import app.zenly.locator.p143s.p162w.p165e.C5577a.C5584c.C5586b;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p127b.C4987b;
import app.zenly.locator.powermoves.p128c.C4994b;
import app.zenly.locator.powermoves.p129d.C5004b;
import app.zenly.locator.powermoves.p129d.C5007c;
import app.zenly.locator.powermoves.p129d.p130d.C5015c;
import app.zenly.locator.powermoves.p129d.p130d.C5016d;
import app.zenly.locator.powermoves.p129d.p131e.C5017a;
import com.android.volley.toolbox.C8733j;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12779d;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.powermoves.ui.story.a */
public final class C5048a extends C1321b implements OnTouchListener {

    /* renamed from: m */
    static final /* synthetic */ KProperty[] f13112m;

    /* renamed from: n */
    public static final C5049a f13113n = new C5049a(null);

    /* renamed from: f */
    private C5007c f13114f;

    /* renamed from: g */
    private C5004b f13115g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5577a f13116h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Function0<C12956q> f13117i = new C5053d(this);

    /* renamed from: j */
    private final Lazy f13118j;

    /* renamed from: k */
    private final List<ProgressBar> f13119k;

    /* renamed from: l */
    private HashMap f13120l;

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$a */
    public static final class C5049a {
        private C5049a() {
        }

        /* renamed from: a */
        public final C5048a mo12303a(int i, String str) {
            C12932j.m33818b(str, "powerMoveId");
            C5048a aVar = new C5048a();
            Bundle bundle = new Bundle();
            bundle.putInt("fragment_index", i);
            bundle.putString("powermove_id", str);
            aVar.setArguments(bundle);
            return aVar;
        }

        public /* synthetic */ C5049a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$b */
    static final class C5050b extends C12933k implements Function0<GestureDetector> {

        /* renamed from: f */
        final /* synthetic */ C5048a f13121f;

        /* renamed from: app.zenly.locator.powermoves.ui.story.a$b$a */
        public static final class C5051a extends SimpleOnGestureListener {

            /* renamed from: e */
            final /* synthetic */ C5050b f13122e;

            C5051a(C5050b bVar) {
                this.f13122e = bVar;
            }

            public void onLongPress(MotionEvent motionEvent) {
                C5577a d = this.f13122e.f13121f.f13116h;
                if (d != null) {
                    d.mo13195d();
                }
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (motionEvent != null) {
                    C5017a e = C5048a.m14468e(this.f13122e.f13121f).mo12250e();
                    Object e2 = e.mo12263e();
                    C4984a aVar = e2 != null ? e2 instanceof C4984a : true ? (C4984a) e.mo12263e() : null;
                    if (aVar != null) {
                        double x = (double) motionEvent.getX();
                        ConstraintLayout constraintLayout = (ConstraintLayout) this.f13122e.f13121f.mo12301a(C3891l.player_layout);
                        C12932j.m33815a((Object) constraintLayout, "player_layout");
                        if (x > ((double) constraintLayout.getWidth()) * 0.33d) {
                            this.f13122e.f13121f.m14474h();
                        } else if (this.f13122e.f13121f.m14469e() || !aVar.mo12222i()) {
                            this.f13122e.f13121f.m14476i();
                        } else {
                            C5017a.m14384a(C5048a.m14465c(this.f13122e.f13121f).mo12255e(), C5016d.PREVIOUS_PM, null, 2, null);
                        }
                        return true;
                    }
                }
                return super.onSingleTapUp(motionEvent);
            }
        }

        C5050b(C5048a aVar) {
            this.f13121f = aVar;
            super(0);
        }

        public final GestureDetector invoke() {
            return new GestureDetector(this.f13121f.requireContext(), new C5051a(this));
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$c */
    static final class C5052c extends C12933k implements Function0<Integer> {

        /* renamed from: f */
        final /* synthetic */ C5048a f13123f;

        C5052c(C5048a aVar) {
            this.f13123f = aVar;
            super(0);
        }

        public final int invoke() {
            return this.f13123f.requireArguments().getInt("fragment_index", -1);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$d */
    static final class C5053d extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5048a f13124f;

        C5053d(C5048a aVar) {
            this.f13124f = aVar;
            super(0);
        }

        public final void invoke() {
            TextureView textureView = (TextureView) this.f13124f.mo12301a(C3891l.story_video_view);
            if (textureView != null) {
                textureView.setAlpha(1.0f);
            }
            ImageView imageView = (ImageView) this.f13124f.mo12301a(C3891l.story_thumbnail);
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$e */
    static final class C5054e<T> implements Observer<C5015c> {

        /* renamed from: a */
        final /* synthetic */ C5048a f13125a;

        C5054e(C5048a aVar) {
            this.f13125a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(C5015c cVar) {
            if (cVar == null) {
                C12932j.m33814a();
                throw null;
            } else if (C5060b.f13133a[cVar.ordinal()] == 1) {
                this.f13125a.m14472g();
            }
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$f */
    static final class C5055f<T> implements Predicate<Long> {

        /* renamed from: e */
        final /* synthetic */ C5048a f13126e;

        /* renamed from: f */
        final /* synthetic */ MediaPlayer f13127f;

        C5055f(C5048a aVar, MediaPlayer mediaPlayer) {
            this.f13126e = aVar;
            this.f13127f = mediaPlayer;
        }

        /* renamed from: a */
        public final boolean test(Long l) {
            C12932j.m33818b(l, "it");
            return this.f13127f.isPlaying() && this.f13126e.isMenuVisible();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$g */
    static final class C5056g extends C12933k implements Function1<Long, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5048a f13128f;

        /* renamed from: g */
        final /* synthetic */ MediaPlayer f13129g;

        C5056g(C5048a aVar, MediaPlayer mediaPlayer) {
            this.f13128f = aVar;
            this.f13129g = mediaPlayer;
            super(1);
        }

        /* renamed from: a */
        public final void mo12308a(Long l) {
            ProgressBar a = this.f13128f.m14461b();
            if (a != null) {
                a.setProgress((this.f13129g.getCurrentPosition() * C8733j.DEFAULT_IMAGE_TIMEOUT_MS) / this.f13129g.getDuration());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12308a((Long) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$h */
    static final class C5057h extends C12933k implements Function1<Throwable, C12956q> {

        /* renamed from: f */
        public static final C5057h f13130f = new C5057h();

        C5057h() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12309a(Throwable th) {
            C12932j.m33818b(th, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12309a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$i */
    static final class C5058i implements OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ C5048a f13131a;

        C5058i(C5048a aVar) {
            this.f13131a = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: type inference failed for: r1v2, types: [app.zenly.locator.powermoves.ui.story.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPrepared(android.media.MediaPlayer r4) {
            /*
                r3 = this;
                app.zenly.locator.powermoves.ui.story.a r0 = r3.f13131a
                java.lang.String r1 = "it"
                kotlin.jvm.internal.C12932j.m33815a(r4, r1)
                r0.m14458a(r4)
                r0 = 1
                r4.seekTo(r0)
                app.zenly.locator.powermoves.ui.story.a r4 = r3.f13131a
                boolean r4 = r4.isMenuVisible()
                if (r4 != 0) goto L_0x0021
                app.zenly.locator.powermoves.ui.story.a r4 = r3.f13131a
                app.zenly.locator.s.w.e.a r4 = r4.f13116h
                if (r4 == 0) goto L_0x0021
                r4.mo13195d()
            L_0x0021:
                app.zenly.locator.powermoves.ui.story.a r4 = r3.f13131a
                int r0 = app.zenly.locator.C3891l.story_video_view
                android.view.View r4 = r4.mo12301a(r0)
                android.view.TextureView r4 = (android.view.TextureView) r4
                app.zenly.locator.powermoves.ui.story.a r0 = r3.f13131a
                kotlin.jvm.functions.Function0 r0 = r0.f13117i
                if (r0 == 0) goto L_0x0039
                app.zenly.locator.powermoves.ui.story.c r1 = new app.zenly.locator.powermoves.ui.story.c
                r1.<init>(r0)
                r0 = r1
            L_0x0039:
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                r1 = 500(0x1f4, double:2.47E-321)
                r4.postDelayed(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p133ui.story.C5048a.C5058i.onPrepared(android.media.MediaPlayer):void");
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.a$j */
    static final class C5059j implements OnCompletionListener {

        /* renamed from: a */
        final /* synthetic */ C5048a f13132a;

        C5059j(C5048a aVar) {
            this.f13132a = aVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f13132a.m14474h();
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5048a.class), "index", "getIndex()I");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a(C5048a.class), "gestureDetector", "getGestureDetector()Landroid/view/GestureDetector;");
        C12946x.m33839a((C12940r) sVar2);
        f13112m = new KProperty[]{sVar, sVar2};
    }

    public C5048a() {
        C12896f.m33751a(new C5052c(this));
        this.f13118j = C12896f.m33751a(new C5050b(this));
        this.f13119k = new ArrayList();
    }

    /* renamed from: c */
    private final GestureDetector m14464c() {
        Lazy lazy = this.f13118j;
        KProperty kProperty = f13112m[1];
        return (GestureDetector) lazy.getValue();
    }

    /* renamed from: c */
    public static final /* synthetic */ C5007c m14465c(C5048a aVar) {
        C5007c cVar = aVar.f13114f;
        if (cVar != null) {
            return cVar;
        }
        C12932j.m33820c("parentVm");
        throw null;
    }

    /* renamed from: e */
    public static final /* synthetic */ C5004b m14468e(C5048a aVar) {
        C5004b bVar = aVar.f13115g;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("vm");
        throw null;
    }

    /* renamed from: a */
    public View mo12301a(int i) {
        if (this.f13120l == null) {
            this.f13120l = new HashMap();
        }
        View view = (View) this.f13120l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13120l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f13120l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0889u a = C0890v.m4098a(requireActivity()).mo4415a(C5007c.class);
        C12932j.m33815a((Object) a, "ViewModelProviders.of(re…oryViewModel::class.java)");
        this.f13114f = (C5007c) a;
        C0889u a2 = C0890v.m4097a((Fragment) this).mo4415a(C5004b.class);
        C12932j.m33815a((Object) a2, "ViewModelProviders.of(th…yerViewModel::class.java)");
        this.f13115g = (C5004b) a2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_power_move_player, viewGroup, false);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0<kotlin.q>, kotlin.jvm.functions.Function0] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [app.zenly.locator.powermoves.ui.story.d] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroyView() {
        /*
            r3 = this;
            app.zenly.locator.s.w.e.a r0 = r3.f13116h
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r0.mo13192a(r1)
        L_0x0008:
            app.zenly.locator.s.w.e.a r0 = r3.f13116h
            if (r0 == 0) goto L_0x000f
            r0.mo13191a(r1)
        L_0x000f:
            r3.f13116h = r1
            int r0 = app.zenly.locator.C3891l.story_video_view
            android.view.View r0 = r3.mo12301a(r0)
            android.view.TextureView r0 = (android.view.TextureView) r0
            kotlin.jvm.functions.Function0<kotlin.q> r1 = r3.f13117i
            if (r1 == 0) goto L_0x0023
            app.zenly.locator.powermoves.ui.story.d r2 = new app.zenly.locator.powermoves.ui.story.d
            r2.<init>(r1)
            r1 = r2
        L_0x0023:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            super.onDestroyView()
            r3.mo6508a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p133ui.story.C5048a.onDestroyView():void");
    }

    public void onPause() {
        C5577a aVar = this.f13116h;
        if (aVar != null) {
            aVar.mo13195d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (isMenuVisible()) {
            C5577a aVar = this.f13116h;
            if (aVar != null) {
                aVar.mo13197f();
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!m14464c().onTouchEvent(motionEvent)) {
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 1 && isMenuVisible()) {
                C5577a aVar = this.f13116h;
                if (aVar != null) {
                    aVar.mo13197f();
                }
            }
        } else if (view != null) {
            view.performClick();
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        C5004b bVar = this.f13115g;
        String str = "vm";
        if (bVar != null) {
            bVar.mo12250e().mo12261b((LifecycleOwner) this, (Observer<? super A>) new C5054e<Object>(this));
            String string = requireArguments().getString("powermove_id");
            if (string != null) {
                C5004b bVar2 = this.f13115g;
                if (bVar2 != null) {
                    C12932j.m33815a((Object) string, "powerMoveId");
                    bVar2.mo12249b(string);
                    return;
                }
                C12932j.m33820c(str);
                throw null;
            }
            return;
        }
        C12932j.m33820c(str);
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        if (!z) {
            C5577a aVar = this.f13116h;
            if (aVar != null) {
                aVar.mo13196e();
            }
            C5577a aVar2 = this.f13116h;
            if (aVar2 != null) {
                aVar2.mo13195d();
            }
        }
        if (!isResumed() || !z) {
            C5577a aVar3 = this.f13116h;
            if (aVar3 != null) {
                aVar3.mo13195d();
                return;
            }
            return;
        }
        C5577a aVar4 = this.f13116h;
        if (aVar4 != null) {
            aVar4.mo13197f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ProgressBar m14461b() {
        C5004b bVar = this.f13115g;
        if (bVar != null) {
            C5017a e = bVar.mo12250e();
            Object e2 = e.mo12263e();
            C4984a aVar = e2 != null ? e2 instanceof C4984a : true ? (C4984a) e.mo12263e() : null;
            if (aVar == null) {
                return null;
            }
            int c = aVar.mo12213c();
            if (c != -1) {
                return (ProgressBar) this.f13119k.get(c);
            }
            return null;
        }
        C12932j.m33820c("vm");
        throw null;
    }

    /* renamed from: d */
    private final Drawable m14466d() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(4.0f);
        gradientDrawable.setColor(C0540a.m2536a(requireContext(), (int) R.color.white_o50));
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m14469e() {
        return requireArguments().getInt("fragment_index", -1) == 0;
    }

    /* renamed from: f */
    private final void m14470f() {
        for (ProgressBar progress : this.f13119k) {
            progress.setProgress(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m14472g() {
        C5004b bVar = this.f13115g;
        C4984a aVar = null;
        if (bVar != null) {
            C5017a e = bVar.mo12250e();
            Object e2 = e.mo12263e();
            if (e2 != null ? e2 instanceof C4984a : true) {
                aVar = (C4984a) e.mo12263e();
            }
            if (aVar != null) {
                ((TextView) mo12301a(C3891l.story_title)).setText(aVar.mo12219g());
                m14463b(aVar.mo12220h().size());
                m14459a(aVar.mo12210a());
                ((ConstraintLayout) mo12301a(C3891l.player_layout)).setOnTouchListener(this);
                return;
            }
            return;
        }
        C12932j.m33820c("vm");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14474h() {
        C5004b bVar = this.f13115g;
        if (bVar != null) {
            C5017a e = bVar.mo12250e();
            Object e2 = e.mo12263e();
            C4984a aVar = e2 != null ? e2 instanceof C4984a : true ? (C4984a) e.mo12263e() : null;
            if (aVar == null) {
                return;
            }
            if (aVar.mo12223j()) {
                C5007c cVar = this.f13114f;
                if (cVar != null) {
                    C5017a.m14384a(cVar.mo12255e(), C5016d.NEXT_PM, null, 2, null);
                } else {
                    C12932j.m33820c("parentVm");
                    throw null;
                }
            } else {
                ProgressBar b = m14461b();
                if (b != null) {
                    b.setProgress(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
                }
                m14459a(aVar.mo12224k());
                if (aVar.mo12222i()) {
                    m14470f();
                }
            }
        } else {
            C12932j.m33820c("vm");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m14476i() {
        C5004b bVar = this.f13115g;
        C4984a aVar = null;
        if (bVar != null) {
            C5017a e = bVar.mo12250e();
            Object e2 = e.mo12263e();
            if (e2 != null ? e2 instanceof C4984a : true) {
                aVar = (C4984a) e.mo12263e();
            }
            if (aVar != null) {
                ProgressBar b = m14461b();
                if (b != null) {
                    b.setProgress(0);
                }
                m14459a(aVar.mo12225l());
                ProgressBar b2 = m14461b();
                if (b2 != null) {
                    b2.setProgress(0);
                    return;
                }
                return;
            }
            return;
        }
        C12932j.m33820c("vm");
        throw null;
    }

    /* renamed from: a */
    private final void m14459a(C4987b bVar) {
        ImageView imageView = (ImageView) mo12301a(C3891l.story_thumbnail);
        String str = "story_thumbnail";
        C12932j.m33815a((Object) imageView, str);
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo12301a(C3891l.story_thumbnail);
        C12932j.m33815a((Object) imageView2, str);
        ((C8865i) Glide.m21139d(imageView2.getContext()).mo8545a(bVar.mo12230c()).mo8537b()).mo24173a((ImageView) mo12301a(C3891l.story_thumbnail));
        TextureView textureView = (TextureView) mo12301a(C3891l.story_video_view);
        String str2 = "story_video_view";
        C12932j.m33815a((Object) textureView, str2);
        textureView.setAlpha(0.0f);
        C5577a aVar = this.f13116h;
        if (aVar != null) {
            aVar.mo13190a();
        }
        TextureView textureView2 = (TextureView) mo12301a(C3891l.story_video_view);
        C12932j.m33815a((Object) textureView2, str2);
        Uri a = bVar.mo12228a();
        C12932j.m33815a((Object) a, "video.full");
        C5577a aVar2 = new C5577a(textureView2, new C5586b(a), false, C5583b.CROP);
        aVar2.mo13192a((OnPreparedListener) new C5058i(this));
        aVar2.mo13191a((OnCompletionListener) new C5059j(this));
        this.f13116h = aVar2;
    }

    /* renamed from: b */
    private final void m14463b(int i) {
        int a = C0540a.m2536a(requireContext(), (int) R.color.pink);
        int a2 = C0540a.m2536a(requireContext(), (int) R.color.blue_light);
        if (1 <= i) {
            int i2 = a;
            int i3 = 1;
            while (true) {
                int a3 = C4994b.f13023a.mo12237a(a, a2, ((float) i3) / ((float) i));
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{m14466d(), m14456a(i2, a3)});
                layerDrawable.setId(0, 16908288);
                layerDrawable.setId(1, 16908301);
                ProgressBar progressBar = new ProgressBar(requireContext(), null, 16842872);
                progressBar.setProgressDrawable(layerDrawable);
                progressBar.setMax(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
                LayoutParams layoutParams = new LayoutParams(0, -2, 1.0f);
                layoutParams.setMarginStart(4);
                layoutParams.setMarginEnd(4);
                progressBar.setLayoutParams(layoutParams);
                ((LinearLayout) mo12301a(C3891l.story_progress_containers)).addView(progressBar);
                this.f13119k.add(progressBar);
                if (i3 != i) {
                    i3++;
                    i2 = a3;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final Drawable m14456a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.LEFT_RIGHT, new int[]{i, i2});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(4.0f);
        return new ClipDrawable(gradientDrawable, 8388611, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14458a(MediaPlayer mediaPlayer) {
        C12279e a = C12279e.m32628g(42, TimeUnit.MILLISECONDS).mo36459b((Predicate<? super T>) new C5055f<Object>(this, mediaPlayer)).mo36452b(C12802a.m33491b()).mo36428a(C12295a.m32802a());
        C12932j.m33815a((Object) a, "Observable.interval(42L,…dSchedulers.mainThread())");
        Disposable a2 = C12779d.m33439a(a, C5057h.f13130f, null, new C5056g(this, mediaPlayer), 2, null);
        C5004b bVar = this.f13115g;
        if (bVar != null) {
            C12773a.m33432a(a2, bVar.mo12266c());
        } else {
            C12932j.m33820c("vm");
            throw null;
        }
    }
}
