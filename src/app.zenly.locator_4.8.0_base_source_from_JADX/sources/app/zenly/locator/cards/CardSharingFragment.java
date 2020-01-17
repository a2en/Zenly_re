package app.zenly.locator.cards;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.base.widget.ListeningHorizontalScrollView;
import app.zenly.android.base.widget.ListeningHorizontalScrollView.OnScrollChangeListener;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h.C1810a;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bumptech.glide.load.Transformation;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p387h.p388a.C12143a;
import p389io.reactivex.C12273d;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.schedulers.C12802a;

public final class CardSharingFragment extends C1321b {

    /* renamed from: f */
    private Function1<? super C1809h, ? extends C12273d<C1808g>> f5859f;

    /* renamed from: g */
    private Callback f5860g;

    /* renamed from: h */
    private final C12275b f5861h = new C12275b();

    /* renamed from: i */
    private HashMap f5862i;

    public interface Callback {
        void onShare(C1809h hVar);
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$a */
    public static final class C1759a {
        private C1759a() {
        }

        public /* synthetic */ C1759a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$b */
    static final class C1760b implements Action {

        /* renamed from: a */
        final /* synthetic */ CardSharingFragment f5863a;

        C1760b(CardSharingFragment cardSharingFragment) {
            this.f5863a = cardSharingFragment;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f5863a.mo7345a(C3891l.scroll_view_container);
            C12932j.m33815a((Object) linearLayout, "scroll_view_container");
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                C12932j.m33815a((Object) childAt, "getChildAt(index)");
                childAt.setEnabled(true);
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$c */
    static final class C1761c<T> implements Consumer<C1808g> {

        /* renamed from: e */
        final /* synthetic */ CardSharingFragment f5864e;

        /* renamed from: f */
        final /* synthetic */ C1809h f5865f;

        C1761c(CardSharingFragment cardSharingFragment, C1809h hVar) {
            this.f5864e = cardSharingFragment;
            this.f5865f = hVar;
        }

        /* renamed from: a */
        public final void accept(C1808g gVar) {
            FragmentActivity activity = this.f5864e.getActivity();
            if (activity != null) {
                C1809h hVar = this.f5865f;
                C12932j.m33815a((Object) activity, "it");
                C12932j.m33815a((Object) gVar, "sharingInfo");
                hVar.mo7469a(activity, gVar);
                Callback b = this.f5864e.mo6614b();
                if (b != null) {
                    b.onShare(this.f5865f);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$d */
    static final class C1762d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ CardSharingFragment f5866e;

        C1762d(CardSharingFragment cardSharingFragment) {
            this.f5866e = cardSharingFragment;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "doShare exception", new Object[0]);
            FragmentActivity activity = this.f5866e.getActivity();
            if (activity != null) {
                Toast.makeText(activity, R.string.commons_content_oopserror, 0).show();
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$e */
    static final class C1763e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1809h f5867e;

        /* renamed from: f */
        final /* synthetic */ CardSharingFragment f5868f;

        C1763e(C1809h hVar, CardSharingFragment cardSharingFragment, Context context, C2485i iVar) {
            this.f5867e = hVar;
            this.f5868f = cardSharingFragment;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context requireContext = this.f5868f.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            C5498a.m15602a(aVar.mo13125a(requireContext), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5868f.m7152a(this.f5867e);
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$f */
    static final class C1764f implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ CardSharingFragment f5869e;

        /* renamed from: app.zenly.locator.cards.CardSharingFragment$f$a */
        public static final class C1765a implements OnScrollChangeListener {

            /* renamed from: a */
            final /* synthetic */ C1764f f5870a;

            /* renamed from: b */
            final /* synthetic */ int f5871b;

            /* renamed from: c */
            final /* synthetic */ int f5872c;

            C1765a(C1764f fVar, int i, int i2) {
                this.f5870a = fVar;
                this.f5871b = i;
                this.f5872c = i2;
            }

            public void onScrollChange(ListeningHorizontalScrollView listeningHorizontalScrollView, int i, int i2, int i3, int i4) {
                C12932j.m33818b(listeningHorizontalScrollView, "v");
                this.f5870a.f5869e.m7148a(this.f5871b, this.f5872c);
            }
        }

        C1764f(CardSharingFragment cardSharingFragment) {
            this.f5869e = cardSharingFragment;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            View childAt = ((LinearLayout) this.f5869e.mo7345a(C3891l.scroll_view_container)).getChildAt(0);
            C12932j.m33815a((Object) childAt, "scroll_view_container.getChildAt(0)");
            int width = childAt.getWidth();
            C12932j.m33815a((Object) view, "v");
            int width2 = (view.getWidth() / 4) - width;
            LinearLayout linearLayout = (LinearLayout) this.f5869e.mo7345a(C3891l.scroll_view_container);
            String str = "scroll_view_container";
            C12932j.m33815a((Object) linearLayout, str);
            if (linearLayout.getChildCount() > 1) {
                i9 = (width / 2) + width2;
            } else {
                i9 = (width2 * 2) + ((width / 2) * 3);
            }
            LinearLayout linearLayout2 = (LinearLayout) this.f5869e.mo7345a(C3891l.scroll_view_container);
            C12932j.m33815a((Object) linearLayout2, str);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            gradientDrawable.setSize(width2, 0);
            linearLayout2.setDividerDrawable(gradientDrawable);
            LinearLayout linearLayout3 = (LinearLayout) this.f5869e.mo7345a(C3891l.scroll_view_container);
            C12932j.m33815a((Object) linearLayout3, str);
            linearLayout3.setPaddingRelative(i9, linearLayout3.getPaddingTop(), i9, linearLayout3.getPaddingBottom());
            this.f5869e.m7148a(width, width2);
            ((ListeningHorizontalScrollView) this.f5869e.mo7345a(C3891l.scroll_view)).setOnScrollChangeListener(new C1765a(this, width, width2));
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSharingFragment$g */
    public static final class C1766g implements OnLayoutChangeListener {
        C1766g() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C12932j.m33818b(view, "v");
            view.removeOnLayoutChangeListener(this);
            view.setTranslationX((float) view.getWidth());
            ViewPropertyAnimator animate = view.animate();
            animate.translationX(0.0f);
            animate.setStartDelay(600);
            animate.setDuration(1000);
            animate.setInterpolator(C7657c.m18646c(0.5f));
        }
    }

    static {
        new C1759a(null);
    }

    /* renamed from: a */
    public View mo7345a(int i) {
        if (this.f5862i == null) {
            this.f5862i = new HashMap();
        }
        View view = (View) this.f5862i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f5862i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f5862i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final Callback mo6614b() {
        return this.f5860g;
    }

    /* renamed from: c */
    public final void mo7348c() {
        m7152a(C1809h.ANDROID_DEFAULT);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_card_sharing, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onStop() {
        this.f5861h.mo36401a();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        m7149a(view);
    }

    /* renamed from: a */
    public final void mo7347a(Function1<? super C1809h, ? extends C12273d<C1808g>> function1) {
        this.f5859f = function1;
    }

    /* renamed from: a */
    public final void mo7346a(Callback callback) {
        this.f5860g = callback;
    }

    /* renamed from: a */
    private final void m7149a(View view) {
        View view2;
        Context context = view.getContext();
        C1810a aVar = C1809h.f6008t;
        FragmentActivity requireActivity = requireActivity();
        C12932j.m33815a((Object) requireActivity, "requireActivity()");
        Locale locale = Locale.getDefault();
        C12932j.m33815a((Object) locale, "Locale.getDefault()");
        List<C1809h> a = aVar.mo7473a(requireActivity, locale);
        C2485i a2 = C2476d.m8582a(context);
        C12932j.m33815a((Object) a2, "GlideApp.with(context)");
        for (C1809h hVar : a) {
            if (hVar == C1809h.ANDROID_DEFAULT) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.list_item_username_sharing_option_default, (ListeningHorizontalScrollView) mo7345a(C3891l.scroll_view), false);
                if (inflate != 0) {
                    view2 = inflate;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                }
            } else {
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.list_item_username_sharing_option, (ListeningHorizontalScrollView) mo7345a(C3891l.scroll_view), false);
                if (inflate2 != null) {
                    ImageView imageView = (ImageView) inflate2;
                    C12932j.m33815a((Object) a2.m8714a().m8682a(Integer.valueOf(hVar.mo7471b())).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(null, 1, null)).mo24173a(imageView), "glide\n                  …              .into(item)");
                    view2 = imageView;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                }
            }
            view2.setOnClickListener(new C1763e(hVar, this, context, a2));
            ((LinearLayout) mo7345a(C3891l.scroll_view_container)).addView(view2);
        }
        ((ListeningHorizontalScrollView) mo7345a(C3891l.scroll_view)).addOnLayoutChangeListener(new C1764f(this));
        ((ListeningHorizontalScrollView) mo7345a(C3891l.scroll_view)).addOnLayoutChangeListener(new C1766g());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7148a(int i, int i2) {
        ListeningHorizontalScrollView listeningHorizontalScrollView = (ListeningHorizontalScrollView) mo7345a(C3891l.scroll_view);
        String str = "scroll_view";
        C12932j.m33815a((Object) listeningHorizontalScrollView, str);
        int width = (listeningHorizontalScrollView.getWidth() / 2) - (i / 2);
        int i3 = i + i2;
        LinearLayout linearLayout = (LinearLayout) mo7345a(C3891l.scroll_view_container);
        C12932j.m33815a((Object) linearLayout, "scroll_view_container");
        int childCount = linearLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = linearLayout.getChildAt(i4);
            C12932j.m33815a((Object) childAt, "getChildAt(index)");
            int left = childAt.getLeft();
            ListeningHorizontalScrollView listeningHorizontalScrollView2 = (ListeningHorizontalScrollView) mo7345a(C3891l.scroll_view);
            C12932j.m33815a((Object) listeningHorizontalScrollView2, str);
            float b = ((float) 1) - ((((float) C12973l.m33890b(Math.abs(width - (left - listeningHorizontalScrollView2.getScrollX())), i3)) / ((float) i3)) * 0.25f);
            childAt.setScaleX(b);
            childAt.setScaleY(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7152a(C1809h hVar) {
        Function1<? super C1809h, ? extends C12273d<C1808g>> function1 = this.f5859f;
        if (function1 != null) {
            LinearLayout linearLayout = (LinearLayout) mo7345a(C3891l.scroll_view_container);
            C12932j.m33815a((Object) linearLayout, "scroll_view_container");
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                C12932j.m33815a((Object) childAt, "getChildAt(index)");
                childAt.setEnabled(false);
            }
            Disposable a = ((C12273d) function1.invoke(hVar)).mo36392b(C12802a.m33491b()).mo36378a(C12295a.m32802a()).mo36379a((Action) new C1760b(this)).mo36385a((Consumer<? super T>) new C1761c<Object>(this, hVar), (Consumer<? super Throwable>) new C1762d<Object>(this));
            C12932j.m33815a((Object) a, "sharingInfoProvider(shar…          }\n            )");
            C12773a.m33432a(a, this.f5861h);
        }
    }
}
