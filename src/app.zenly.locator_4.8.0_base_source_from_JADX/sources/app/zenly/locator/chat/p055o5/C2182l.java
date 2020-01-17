package app.zenly.locator.chat.p055o5;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.chat.p055o5.C2122c.C2123a;
import app.zenly.locator.chat.p055o5.C2122c.C2125c;
import app.zenly.locator.chat.p055o5.C2122c.C2126d;
import app.zenly.locator.chat.p055o5.C2127d.C2128a;
import app.zenly.locator.chat.p055o5.C2127d.C2129b;
import app.zenly.locator.chat.p055o5.C2127d.C2130c;
import app.zenly.locator.chat.p055o5.C2127d.C2131d;
import app.zenly.locator.chat.p055o5.C2132e.C2133a;
import app.zenly.locator.chat.p055o5.C2132e.C2134b;
import app.zenly.locator.chat.p055o5.C2132e.C2135c;
import app.zenly.locator.chat.p055o5.C2132e.C2136d;
import app.zenly.locator.chat.p055o5.C2137f.C2138a;
import app.zenly.locator.chat.p055o5.C2137f.C2139b;
import app.zenly.locator.chat.p055o5.C2137f.C2140c;
import app.zenly.locator.chat.p055o5.C2137f.C2141d;
import app.zenly.locator.chat.p055o5.C2137f.C2142e;
import app.zenly.locator.chat.p055o5.C2137f.C2143f;
import app.zenly.locator.chat.p055o5.C2186n.C2187a;
import app.zenly.locator.chat.p055o5.C2186n.C2187a.C2188a;
import app.zenly.locator.chat.p055o5.C2186n.C2189b;
import app.zenly.locator.core.helper.C2511d;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.view.PulseView;
import app.zenly.locator.core.util.C3244y;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p149m.C5454c;
import app.zenly.locator.p143s.p151o.p152c.C5470b;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import app.zenly.locator.p143s.p160v.p161b.C5544j;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;
import p213co.znly.models.C7391m1;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.bubble.C6971b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.chat.o5.l */
public final class C2182l implements LayoutContainer {

    /* renamed from: h */
    private static final long f6704h = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: i */
    private static final long f6705i = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: j */
    private static final long f6706j = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    private final Context f6707a = getContainerView().getContext();

    /* renamed from: b */
    private final Resources f6708b = getContainerView().getResources();

    /* renamed from: c */
    private final C3244y f6709c = new C3244y();

    /* renamed from: d */
    private final C5454c f6710d;

    /* renamed from: e */
    private final View f6711e;

    /* renamed from: f */
    private final AvatarLoader f6712f;

    /* renamed from: g */
    private HashMap f6713g;

    /* renamed from: app.zenly.locator.chat.o5.l$a */
    public static final class C2183a {
        private C2183a() {
        }

        public /* synthetic */ C2183a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.l$b */
    public static final class C2184b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C2182l f6714e;

        public C2184b(C2182l lVar) {
            this.f6714e = lVar;
        }

        public final void run() {
            C7697b.m18743d((AppCompatTextView) this.f6714e.mo8004a(C3891l.interruption_status), 0, null, 3, null);
            C7697b.m18740c((LinearLayout) this.f6714e.mo8004a(C3891l.status_container), 0, null, 3, null);
            this.f6714e.m7984i();
        }
    }

    static {
        new C2183a(null);
    }

    public C2182l(View view, AvatarLoader avatarLoader, OnClickListener onClickListener, OnClickListener onClickListener2, OnClickListener onClickListener3) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(onClickListener, "avatarClickListener");
        C12932j.m33818b(onClickListener2, "meetClickListener");
        C12932j.m33818b(onClickListener3, "clickListener");
        this.f6711e = view;
        this.f6712f = avatarLoader;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) mo8004a(C3891l.emoji);
        C12932j.m33815a((Object) simpleDraweeView, "emoji");
        this.f6710d = new C5454c(simpleDraweeView, 2131951616);
        ((ImageView) mo8004a(C3891l.avatar)).setOnClickListener(onClickListener);
        ((AppCompatImageView) mo8004a(C3891l.meet_button)).setOnClickListener(onClickListener2);
        mo8004a(C3891l.chat_indicator).setOnClickListener(onClickListener3);
    }

    /* renamed from: c */
    private final void m7978c() {
        this.f6710d.mo13043d();
        C7697b.m18736b((SimpleDraweeView) mo8004a(C3891l.emoji), 0, null, 3, null);
    }

    /* renamed from: d */
    private final void m7979d() {
        C7697b.m18743d((AppCompatImageView) mo8004a(C3891l.meet_button), 0, null, 3, null);
    }

    /* renamed from: e */
    private final void m7980e() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.primary_status);
        C12932j.m33815a((Object) appCompatTextView, "primary_status");
        appCompatTextView.setVisibility(8);
    }

    /* renamed from: f */
    private final void m7981f() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.secondary_status);
        C12932j.m33815a((Object) appCompatTextView, "secondary_status");
        appCompatTextView.setVisibility(8);
    }

    /* renamed from: g */
    private final void m7982g() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.interruption_status);
        C12932j.m33815a((Object) appCompatTextView, "interruption_status");
        appCompatTextView.postDelayed(new C2184b(this), f6705i);
    }

    /* renamed from: h */
    private final void m7983h() {
        C7697b.m18730a((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
        m7978c();
        C7697b.m18736b((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
        C7697b.m18736b((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
        ImageView imageView = (ImageView) mo8004a(C3891l.avatar);
        C12932j.m33815a((Object) imageView, "avatar");
        imageView.setAlpha(0.5f);
        ((PulseView) mo8004a(C3891l.pulsator)).mo9425b();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m7984i() {
        C7697b.m18740c((AppCompatImageView) mo8004a(C3891l.meet_button), 0, null, 3, null);
    }

    /* renamed from: a */
    public View mo8004a(int i) {
        if (this.f6713g == null) {
            this.f6713g = new HashMap();
        }
        View view = (View) this.f6713g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f6713g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public final void mo8010b() {
        C7697b.m18743d(getContainerView(), 0, null, 3, null);
    }

    public View getContainerView() {
        return this.f6711e;
    }

    /* renamed from: b */
    private final void m7976b(C2186n nVar) {
        C7697b.m18736b((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
        C7697b.m18730a((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
        C7697b.m18736b((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
        m7978c();
        ((PulseView) mo8004a(C3891l.pulsator)).mo9425b();
        if (nVar instanceof C2187a) {
            ((ImageView) mo8004a(C3891l.icon)).setImageResource(m7956a((C2187a) nVar));
        }
    }

    /* renamed from: a */
    public final void mo8005a() {
        C7697b.m18740c(getContainerView(), 0, null, 3, null);
    }

    /* renamed from: a */
    public final void mo8008a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        Request load = this.f6712f.load(C2884f.m9355a(userProto$User));
        ImageView imageView = (ImageView) mo8004a(C3891l.avatar);
        C12932j.m33815a((Object) imageView, "avatar");
        load.into(imageView);
    }

    /* renamed from: a */
    public final void mo8006a(C2122c cVar, C2186n nVar) {
        C12932j.m33818b(cVar, "status");
        C12932j.m33818b(nVar, "temporaryStatus");
        boolean z = cVar instanceof C2123a;
        if (z || (nVar instanceof C2189b)) {
            String str = "avatar";
            if (z) {
                int i = C2185m.f6715a[((C2123a) cVar).mo7915a().ordinal()];
                if (i == 1) {
                    C7697b.m18736b((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
                    C7697b.m18736b((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
                    C7697b.m18736b((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
                    m7973a(true);
                    ((PulseView) mo8004a(C3891l.pulsator)).mo9425b();
                } else if (i == 2) {
                    C7697b.m18736b((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
                    C7697b.m18736b((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
                    C7697b.m18736b((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
                    m7973a(false);
                    ((PulseView) mo8004a(C3891l.pulsator)).mo9425b();
                } else if (i != 3) {
                    m7983h();
                } else {
                    C7697b.m18730a((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
                    C7697b.m18736b((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
                    C7697b.m18730a((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
                    ImageView imageView = (ImageView) mo8004a(C3891l.avatar);
                    C12932j.m33815a((Object) imageView, str);
                    imageView.setAlpha(1.0f);
                    m7978c();
                    ((PulseView) mo8004a(C3891l.pulsator)).mo9424a();
                }
            } else if (cVar instanceof C2125c) {
                C7697b.m18736b((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
                C7697b.m18730a((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
                C7697b.m18736b((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
                m7978c();
                ((PulseView) mo8004a(C3891l.pulsator)).mo9425b();
                C2125c cVar2 = (C2125c) cVar;
                if ((cVar2.mo7919a() instanceof C2142e) && (((C2142e) cVar2.mo7919a()).mo7973c() instanceof C2135c)) {
                    ImageView imageView2 = (ImageView) mo8004a(C3891l.icon);
                    ImageView imageView3 = (ImageView) mo8004a(C3891l.avatar);
                    C12932j.m33815a((Object) imageView3, str);
                    imageView2.setImageBitmap(C2511d.m8764a(imageView3.getResources(), ((C2135c) ((C2142e) cVar2.mo7919a()).mo7973c()).mo7944a()));
                } else if ((cVar2.mo7919a() instanceof C2142e) && (((C2142e) cVar2.mo7919a()).mo7973c() instanceof C2134b)) {
                    ((ImageView) mo8004a(C3891l.icon)).setImageBitmap(((C2134b) ((C2142e) cVar2.mo7919a()).mo7973c()).mo7940a().mo8961a());
                } else if ((cVar2.mo7919a() instanceof C2142e) && (((C2142e) cVar2.mo7919a()).mo7972b() instanceof C2130c)) {
                    ((ImageView) mo8004a(C3891l.icon)).setImageResource(R.drawable.ic_chat_location_disabled_24);
                } else if (cVar2.mo7919a() instanceof C2142e) {
                    ((ImageView) mo8004a(C3891l.icon)).setImageResource(2131231236);
                } else if (cVar2.mo7919a() instanceof C2138a) {
                    ImageView imageView4 = (ImageView) mo8004a(C3891l.icon);
                    String str2 = "icon";
                    C12932j.m33815a((Object) imageView4, str2);
                    int a = C0540a.m2536a(imageView4.getContext(), (int) R.color.green_dark);
                    ImageView imageView5 = (ImageView) mo8004a(C3891l.icon);
                    C12932j.m33815a((Object) imageView5, str2);
                    Context context = imageView5.getContext();
                    C12932j.m33815a((Object) context, "icon.context");
                    ((ImageView) mo8004a(C3891l.icon)).setImageDrawable(C5470b.m15559a(context, 2131231473, a));
                } else if (cVar2.mo7919a() instanceof C2141d) {
                    ((ImageView) mo8004a(C3891l.icon)).setImageResource(R.drawable.ic_chat_status_sleeping_size_32);
                } else {
                    throw new IllegalArgumentException("status is invalid ");
                }
            } else if (cVar instanceof C2126d) {
                C7697b.m18736b((ImageView) mo8004a(C3891l.avatar), 0, null, 3, null);
                C7697b.m18736b((PulseView) mo8004a(C3891l.pulsator), 0, null, 3, null);
                C7697b.m18736b((ImageView) mo8004a(C3891l.icon), 0, null, 3, null);
                m7978c();
                ((PulseView) mo8004a(C3891l.pulsator)).mo9425b();
            } else {
                m7983h();
            }
        } else {
            m7976b(nVar);
        }
    }

    /* renamed from: b */
    private final String m7974b(C2132e eVar) {
        String str;
        if (eVar instanceof C2135c) {
            int i = C2185m.f6721g[((C2135c) eVar).mo7944a().ordinal()];
            if (i == 1) {
                str = this.f6708b.getString(R.string.chat_capsule_place_home);
            } else if (i == 2) {
                str = this.f6708b.getString(R.string.chat_capsule_place_work);
            } else if (i != 3) {
                str = this.f6708b.getString(R.string.chat_capsule_status_idle);
            } else {
                str = this.f6708b.getString(R.string.chat_capsule_place_school);
            }
            C12932j.m33815a((Object) str, "when (location.type) {\n …tatus_idle)\n            }");
            return str;
        } else if (eVar instanceof C2134b) {
            C6971b b = ((C2134b) eVar).mo7940a().mo8962b();
            C12932j.m33815a((Object) b, "location.bubbleInfo.bubble");
            String bubbleName = b.getBubbleName();
            C12932j.m33815a((Object) bubbleName, "location.bubbleInfo.bubble.bubbleName");
            return bubbleName;
        } else if (eVar instanceof C2133a) {
            return ((C2133a) eVar).mo7936a();
        } else {
            if (eVar instanceof C2136d) {
                String string = this.f6708b.getString(R.string.chat_capsule_status_idle);
                C12932j.m33815a((Object) string, "resources.getString(R.st…chat_capsule_status_idle)");
                return string;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m7975b(C2182l lVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C7674a.f19294a;
        }
        lVar.m7977b(str, i);
    }

    /* renamed from: b */
    private final void m7977b(String str, int i) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.secondary_status);
        String str2 = "secondary_status";
        C12932j.m33815a((Object) appCompatTextView, str2);
        C1315a.m6316a((TextView) appCompatTextView, i, 0, 0, 0, 14, (Object) null);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo8004a(C3891l.secondary_status);
        C12932j.m33815a((Object) appCompatTextView2, str2);
        appCompatTextView2.setText(str);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo8004a(C3891l.secondary_status);
        C12932j.m33815a((Object) appCompatTextView3, str2);
        appCompatTextView3.setVisibility(0);
    }

    /* renamed from: a */
    private final void m7973a(boolean z) {
        C7697b.m18730a((SimpleDraweeView) mo8004a(C3891l.emoji), 0, null, 3, null);
        if (z) {
            this.f6710d.mo13042c();
            return;
        }
        this.f6710d.mo13041b();
        this.f6710d.mo13043d();
    }

    /* renamed from: a */
    private final int m7956a(C2187a aVar) {
        int i = C2185m.f6716b[aVar.mo8012a().ordinal()];
        if (i == 1) {
            return 2131231232;
        }
        if (i == 2) {
            return 2131231231;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final void mo8007a(C2137f fVar, C2186n nVar) {
        C12932j.m33818b(fVar, "status");
        C12932j.m33818b(nVar, "temporaryStatus");
        if (!(nVar instanceof C2189b)) {
            m7971a(nVar);
        } else if (fVar instanceof C2142e) {
            m7968a((C2142e) fVar);
        } else if (fVar instanceof C2138a) {
            m7965a((C2138a) fVar);
        } else if (fVar instanceof C2140c) {
            m7966a((C2140c) fVar);
        } else if (fVar instanceof C2141d) {
            m7967a((C2141d) fVar);
        } else if ((fVar instanceof C2139b) || C12932j.m33817a((Object) fVar, (Object) C2143f.f6649b)) {
            m7980e();
            m7981f();
            m7979d();
        }
    }

    /* renamed from: a */
    public final void mo8009a(C7391m1 m1Var) {
        String str;
        C12932j.m33818b(m1Var, "activity");
        if (C2185m.f6717c[m1Var.ordinal()] != 1) {
            str = null;
        } else {
            str = this.f6708b.getString(R.string.chat_capsule_status_justOpened);
        }
        if (str != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.interruption_status);
            C12932j.m33815a((Object) appCompatTextView, "interruption_status");
            appCompatTextView.setText(str);
            C7697b.m18743d((LinearLayout) mo8004a(C3891l.status_container), 0, null, 3, null);
            C7697b.m18740c((AppCompatTextView) mo8004a(C3891l.interruption_status), 0, null, 3, null);
            m7979d();
            m7982g();
        }
    }

    /* renamed from: a */
    private final void m7968a(C2142e eVar) {
        m7984i();
        C2127d b = eVar.mo7972b();
        String str = "icon";
        if (b instanceof C2129b) {
            long currentTimeMillis = System.currentTimeMillis() - ((C2129b) eVar.mo7972b()).mo7923a();
            if (currentTimeMillis >= f6704h) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.primary_status);
                C12932j.m33815a((Object) appCompatTextView, "primary_status");
                Context context = appCompatTextView.getContext();
                C12932j.m33815a((Object) context, "primary_status.context");
                m7970a(this, m7960a(eVar.mo7973c(), C5521c.m15673d(context, currentTimeMillis)), 0, 2, null);
            } else {
                m7970a(this, m7959a(eVar.mo7973c()), 0, 2, null);
            }
            m7981f();
            ImageView imageView = (ImageView) mo8004a(C3891l.icon);
            C12932j.m33815a((Object) imageView, str);
            imageView.setAlpha(1.0f);
        } else if (b instanceof C2128a) {
            m7970a(this, m7974b(eVar.mo7973c()), 0, 2, null);
            m7981f();
            ImageView imageView2 = (ImageView) mo8004a(C3891l.icon);
            C12932j.m33815a((Object) imageView2, str);
            imageView2.setAlpha(1.0f);
        } else if (b instanceof C2131d) {
            String obj = DateUtils.getRelativeTimeSpanString(((C2131d) eVar.mo7972b()).mo7932a()).toString();
            m7972a(m7974b(eVar.mo7973c()), (int) R.attr.zenlyTextColorSecondary);
            m7977b(obj, 2131231524);
            ImageView imageView3 = (ImageView) mo8004a(C3891l.icon);
            C12932j.m33815a((Object) imageView3, str);
            imageView3.setAlpha(0.5f);
        } else if (b instanceof C2130c) {
            String obj2 = DateUtils.getRelativeTimeSpanString(((C2130c) eVar.mo7972b()).mo7927a()).toString();
            m7972a(m7964a(((C2130c) eVar.mo7972b()).mo7928b()), (int) R.attr.zenlyTextColorSecondary);
            m7977b(obj2, 2131231524);
            ImageView imageView4 = (ImageView) mo8004a(C3891l.icon);
            C12932j.m33815a((Object) imageView4, str);
            imageView4.setAlpha(0.5f);
        }
    }

    /* renamed from: a */
    private final void m7965a(C2138a aVar) {
        m7984i();
        String str = "primary_status.context";
        String str2 = "primary_status";
        if (aVar.mo7955d()) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.primary_status);
            C12932j.m33815a((Object) appCompatTextView, str2);
            Context context = appCompatTextView.getContext();
            C12932j.m33815a((Object) context, str);
            m7970a(this, m7963a(aVar.mo7953b(), C5544j.m15729a(context, aVar.mo7956e())), 0, 2, null);
        } else {
            m7970a(this, m7962a(aVar.mo7953b()), 0, 2, null);
        }
        if (aVar.mo7954c() != 0) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo8004a(C3891l.primary_status);
            C12932j.m33815a((Object) appCompatTextView2, str2);
            Context context2 = appCompatTextView2.getContext();
            C12932j.m33815a((Object) context2, str);
            String a = C5521c.m15669a(context2, aVar.mo7954c() - C5447b.m15475b(C5448c.m15478a()));
            String string = this.f6708b.getString(R.string.chat_capsule_eta, new Object[]{a});
            C12932j.m33815a((Object) string, "resources.getString(R.st…ng.chat_capsule_eta, eta)");
            m7975b(this, string, 0, 2, null);
            return;
        }
        m7981f();
    }

    /* renamed from: a */
    private final void m7966a(C2140c cVar) {
        m7984i();
        if (cVar.mo7960b()) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.primary_status);
            C12932j.m33815a((Object) appCompatTextView, "primary_status");
            Context context = appCompatTextView.getContext();
            C12932j.m33815a((Object) context, "primary_status.context");
            String a = C5544j.m15729a(context, cVar.mo7961c());
            String string = this.f6708b.getString(R.string.chat_capsule_moving_speed, new Object[]{a});
            C12932j.m33815a((Object) string, "resources.getString(R.st…sule_moving_speed, speed)");
            m7970a(this, string, 0, 2, null);
        } else {
            String string2 = this.f6708b.getString(R.string.chat_capsule_moving);
            C12932j.m33815a((Object) string2, "resources.getString(R.string.chat_capsule_moving)");
            m7970a(this, string2, 0, 2, null);
        }
        m7981f();
    }

    /* renamed from: a */
    private final void m7967a(C2141d dVar) {
        m7984i();
        m7970a(this, m7958a(dVar.mo7965b(), dVar.mo7967d()), 0, 2, null);
        m7975b(this, m7957a(dVar.mo7966c()), 0, 2, null);
    }

    /* renamed from: a */
    private final void m7971a(C2186n nVar) {
        if (nVar instanceof C2187a) {
            m7970a(this, m7961a(((C2187a) nVar).mo8012a()), 0, 2, null);
        }
        m7981f();
    }

    /* renamed from: a */
    private final String m7961a(C2188a aVar) {
        int i = C2185m.f6718d[aVar.ordinal()];
        if (i == 1) {
            String string = this.f6708b.getString(R.string.chat_capsule_battery_low);
            C12932j.m33815a((Object) string, "resources.getString(R.st…chat_capsule_battery_low)");
            return string;
        } else if (i == 2) {
            String string2 = this.f6708b.getString(R.string.chat_capsule_battery_out);
            C12932j.m33815a((Object) string2, "resources.getString(R.st…chat_capsule_battery_out)");
            return string2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final String m7963a(C2918b bVar, String str) {
        int i = C2185m.f6719e[bVar.ordinal()];
        if (i == 1) {
            String string = this.f6708b.getString(R.string.chat_capsule_heading_home_speed, new Object[]{str});
            C12932j.m33815a((Object) string, "resources.getString(R.st…eading_home_speed, speed)");
            return string;
        } else if (i == 2) {
            String string2 = this.f6708b.getString(R.string.chat_capsule_heading_work_speed, new Object[]{str});
            C12932j.m33815a((Object) string2, "resources.getString(R.st…eading_work_speed, speed)");
            return string2;
        } else if (i != 3) {
            String string3 = this.f6708b.getString(R.string.chat_capsule_moving_speed, new Object[]{str});
            C12932j.m33815a((Object) string3, "resources.getString(R.st…sule_moving_speed, speed)");
            return string3;
        } else {
            String string4 = this.f6708b.getString(R.string.chat_capsule_heading_school_speed, new Object[]{str});
            C12932j.m33815a((Object) string4, "resources.getString(R.st…ding_school_speed, speed)");
            return string4;
        }
    }

    /* renamed from: a */
    private final String m7962a(C2918b bVar) {
        int i = C2185m.f6720f[bVar.ordinal()];
        if (i == 1) {
            String string = this.f6708b.getString(R.string.chat_capsule_heading_home);
            C12932j.m33815a((Object) string, "resources.getString(R.st…hat_capsule_heading_home)");
            return string;
        } else if (i == 2) {
            String string2 = this.f6708b.getString(R.string.chat_capsule_heading_work);
            C12932j.m33815a((Object) string2, "resources.getString(R.st…hat_capsule_heading_work)");
            return string2;
        } else if (i != 3) {
            String string3 = this.f6708b.getString(R.string.chat_capsule_moving);
            C12932j.m33815a((Object) string3, "resources.getString(R.string.chat_capsule_moving)");
            return string3;
        } else {
            String string4 = this.f6708b.getString(R.string.chat_capsule_heading_school);
            C12932j.m33815a((Object) string4, "resources.getString(R.st…t_capsule_heading_school)");
            return string4;
        }
    }

    /* renamed from: a */
    private final String m7958a(long j, String str) {
        TimeZone timeZone;
        if (str.length() == 0) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f6709c.mo9657a(str);
        }
        Context context = this.f6707a;
        C12932j.m33815a((Object) context, "context");
        C12932j.m33815a((Object) timeZone, "timeZone");
        String string = this.f6708b.getString(R.string.chat_capsule_sleeping_since, new Object[]{C5518b.m15656c(context, j, timeZone)});
        C12932j.m33815a((Object) string, "resources.getString(R.st…ing_since, timeFormatted)");
        return string;
    }

    /* renamed from: a */
    private final String m7957a(long j) {
        long currentTimeMillis = j - System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            String string = this.f6707a.getString(R.string.chat_capsule_sleeping);
            C12932j.m33815a((Object) string, "context.getString(R.string.chat_capsule_sleeping)");
            return string;
        }
        Context context = this.f6707a;
        C12932j.m33815a((Object) context, "context");
        String a = C5521c.m15669a(context, C12973l.m33887a(currentTimeMillis, f6706j));
        String string2 = this.f6708b.getString(R.string.chat_capsule_sleeping_wakeUpETA, new Object[]{a});
        C12932j.m33815a((Object) string2, "resources.getString(R.st…UpETA, durationFormatted)");
        return string2;
    }

    /* renamed from: a */
    private final String m7959a(C2132e eVar) {
        String str;
        if (eVar instanceof C2135c) {
            int i = C2185m.f6722h[((C2135c) eVar).mo7944a().ordinal()];
            if (i == 1) {
                str = this.f6708b.getString(R.string.chat_capsule_place_home_justArrived);
            } else if (i == 2) {
                str = this.f6708b.getString(R.string.chat_capsule_place_work_justArrived);
            } else if (i != 3) {
                str = this.f6708b.getString(R.string.chat_capsule_idle_justArrived);
            } else {
                str = this.f6708b.getString(R.string.chat_capsule_place_school_justArrived);
            }
            C12932j.m33815a((Object) str, "when (location.type) {\n …ustArrived)\n            }");
            return str;
        } else if (eVar instanceof C2134b) {
            Resources resources = this.f6708b;
            C6971b b = ((C2134b) eVar).mo7940a().mo8962b();
            C12932j.m33815a((Object) b, "location.bubbleInfo.bubble");
            String string = resources.getString(R.string.chat_capsule_place_poi_justArrived, new Object[]{b.getBubbleName()});
            C12932j.m33815a((Object) string, "resources.getString(R.st…leInfo.bubble.bubbleName)");
            return string;
        } else if (eVar instanceof C2133a) {
            String string2 = this.f6708b.getString(R.string.chat_capsule_place_poi_justArrived, new Object[]{((C2133a) eVar).mo7936a()});
            C12932j.m33815a((Object) string2, "resources.getString(R.st…rrived, location.address)");
            return string2;
        } else if (eVar instanceof C2136d) {
            String string3 = this.f6708b.getString(R.string.chat_capsule_idle_justArrived);
            C12932j.m33815a((Object) string3, "resources.getString(R.st…capsule_idle_justArrived)");
            return string3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final String m7960a(C2132e eVar, String str) {
        String str2;
        if (eVar instanceof C2135c) {
            int i = C2185m.f6723i[((C2135c) eVar).mo7944a().ordinal()];
            if (i == 1) {
                str2 = this.f6708b.getString(R.string.chat_capsule_place_home_duration, new Object[]{str});
            } else if (i == 2) {
                str2 = this.f6708b.getString(R.string.chat_capsule_place_work_duration, new Object[]{str});
            } else if (i != 3) {
                str2 = this.f6708b.getString(R.string.chat_capsule_status_idle_duration, new Object[]{str});
            } else {
                str2 = this.f6708b.getString(R.string.chat_capsule_place_school_duration, new Object[]{str});
            }
            C12932j.m33815a((Object) str2, "when (location.type) {\n …, duration)\n            }");
            return str2;
        } else if (eVar instanceof C2134b) {
            Resources resources = this.f6708b;
            C6971b b = ((C2134b) eVar).mo7940a().mo8962b();
            C12932j.m33815a((Object) b, "location.bubbleInfo.bubble");
            String string = resources.getString(R.string.chat_capsule_poi_duration, new Object[]{b.getBubbleName(), str});
            C12932j.m33815a((Object) string, "resources.getString(R.st…ble.bubbleName, duration)");
            return string;
        } else if (eVar instanceof C2133a) {
            String string2 = this.f6708b.getString(R.string.chat_capsule_poi_duration, new Object[]{((C2133a) eVar).mo7936a(), str});
            C12932j.m33815a((Object) string2, "resources.getString(R.st…cation.address, duration)");
            return string2;
        } else if (eVar instanceof C2136d) {
            String string3 = this.f6708b.getString(R.string.chat_capsule_status_idle_duration, new Object[]{str});
            C12932j.m33815a((Object) string3, "resources.getString(R.st…_idle_duration, duration)");
            return string3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final String m7964a(String str) {
        String string = this.f6708b.getString(R.string.chat_capsule_cantGetLocation, new Object[]{str});
        C12932j.m33815a((Object) string, "resources.getString(R.st…antGetLocation, username)");
        return string;
    }

    /* renamed from: a */
    static /* synthetic */ void m7970a(C2182l lVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.attr.zenlyTextColorSecondaryAccent;
        }
        lVar.m7972a(str, i);
    }

    /* renamed from: a */
    private final void m7972a(String str, int i) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo8004a(C3891l.primary_status);
        String str2 = "primary_status";
        C12932j.m33815a((Object) appCompatTextView, str2);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo8004a(C3891l.primary_status);
        C12932j.m33815a((Object) appCompatTextView2, str2);
        appCompatTextView.setText(appCompatTextView2.getContext().getString(R.string.chat_status_hintFormatter, new Object[]{str}));
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo8004a(C3891l.primary_status);
        C12932j.m33815a((Object) appCompatTextView3, str2);
        appCompatTextView3.setVisibility(0);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) mo8004a(C3891l.primary_status);
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) mo8004a(C3891l.primary_status);
        C12932j.m33815a((Object) appCompatTextView5, str2);
        Context context = appCompatTextView5.getContext();
        C12932j.m33815a((Object) context, "primary_status.context");
        appCompatTextView4.setTextColor(C7678c.m18702a(context, i));
    }
}
