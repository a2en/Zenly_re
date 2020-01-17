package app.zenly.locator.recommendation.p141o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.p143s.p151o.C5465a;
import app.zenly.locator.p143s.p160v.p161b.C5540g;
import app.zenly.locator.recommendation.C5263h;
import app.zenly.locator.recommendation.C5264i;
import app.zenly.locator.recommendation.C5266k;
import app.zenly.locator.recommendation.p142p.C5301b;
import app.zenly.locator.recommendation.util.PercentageAwareConstraintLayout;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.recommendation.o.b */
public final class C5295b extends C7717d<C5301b> {

    /* renamed from: e */
    private final C12275b f13614e = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f13615f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f13616g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f13617h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f13618i;

    /* renamed from: j */
    private AvatarLoader f13619j;

    /* renamed from: k */
    private C5266k f13620k;

    /* renamed from: l */
    private HashMap f13621l;

    /* renamed from: app.zenly.locator.recommendation.o.b$a */
    public static final class C5296a {
        private C5296a() {
        }

        public /* synthetic */ C5296a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.o.b$b */
    static final /* synthetic */ class C5297b extends C12931i implements Function1<List<? extends UserProto$User>, C12956q> {
        C5297b(C5295b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo12668a(List<UserProto$User> list) {
            C12932j.m33818b(list, "p1");
            ((C5295b) this.f33505f).m14972a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C5295b.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "displayMutualFriends(Ljava/util/List;)V";
        }

        public final String getName() {
            return "displayMutualFriends";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12668a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.o.b$c */
    static final class C5298c extends C12933k implements Function2<C1085v, Double, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5295b f13622f;

        C5298c(C5295b bVar) {
            this.f13622f = bVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo12669a(C1085v vVar, double d) {
            C12932j.m33818b(vVar, "<anonymous parameter 0>");
            float min = Math.min(1.0f, Math.abs(((float) d) * 2.0f));
            String str = "overlay";
            if (d >= ((double) 0)) {
                int a = C5465a.m15551a(this.f13622f.f13615f, min);
                View a2 = this.f13622f.mo12666a(C3891l.overlay);
                C12932j.m33815a((Object) a2, str);
                a2.setBackgroundTintList(ColorStateList.valueOf(a));
                ImageView imageView = (ImageView) this.f13622f.mo12666a(C3891l.avatar_overlay_action);
                imageView.setImageResource(2131231400);
                imageView.setImageTintList(ColorStateList.valueOf(C5465a.m15551a(this.f13622f.f13616g, min)));
                return;
            }
            int a3 = C5465a.m15551a(this.f13622f.f13617h, min);
            View a4 = this.f13622f.mo12666a(C3891l.overlay);
            C12932j.m33815a((Object) a4, str);
            a4.setBackgroundTintList(ColorStateList.valueOf(a3));
            ImageView imageView2 = (ImageView) this.f13622f.mo12666a(C3891l.avatar_overlay_action);
            imageView2.setImageResource(2131231414);
            imageView2.setImageTintList(ColorStateList.valueOf(C5465a.m15551a(this.f13622f.f13618i, min)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12669a((C1085v) obj, ((Number) obj2).doubleValue());
            return C12956q.f33541a;
        }
    }

    static {
        new C5296a(null);
    }

    /* renamed from: g */
    private final void m14976g() {
        C5266k kVar = this.f13620k;
        if (kVar != null) {
            Disposable d = kVar.mo12627b(((C5301b) mo34494c()).mo12674f().getId()).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5299c<Object>(new C5297b(this)));
            C12932j.m33815a((Object) d, "recommendationRepository…e(::displayMutualFriends)");
            C12773a.m33432a(d, this.f13614e);
            return;
        }
        C12932j.m33820c("recommendationRepository");
        throw null;
    }

    /* renamed from: a */
    public View mo12666a(int i) {
        if (this.f13621l == null) {
            this.f13621l = new HashMap();
        }
        View view = (View) this.f13621l.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f13621l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public void mo6954f() {
        this.f13614e.mo36401a();
        AvatarLoader avatarLoader = this.f13619j;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo12666a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            avatarLoader.clear(imageView);
            super.mo6954f();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "context");
        C5263h a = C5264i.m14923a(context);
        this.f13619j = a.mo12618a();
        this.f13620k = a.mo12619b();
        this.f13615f = C0540a.m2536a(context, (int) R.color.white);
        this.f13616g = C0540a.m2536a(context, (int) R.color.green);
        this.f13617h = C0540a.m2536a(context, (int) R.color.gray_heavy);
        this.f13618i = C0540a.m2536a(context, (int) R.color.gray_dark);
        ((PercentageAwareConstraintLayout) view).setOnItemSwipePercentageListener(new C5298c(this));
        View a2 = mo12666a(C3891l.overlay);
        C12932j.m33815a((Object) a2, "overlay");
        a2.setBackgroundTintList(ColorStateList.valueOf(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C5301b bVar, C5301b bVar2) {
        C12932j.m33818b(bVar, "model");
        TextView textView = (TextView) mo12666a(C3891l.name);
        C12932j.m33815a((Object) textView, "name");
        textView.setText(bVar.mo12674f().getName());
        AvatarLoader avatarLoader = this.f13619j;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(bVar.mo12674f().getAvatar());
            ImageView imageView = (ImageView) mo12666a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
            m14976g();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14972a(List<UserProto$User> list) {
        LinearLayout linearLayout = (LinearLayout) mo12666a(C3891l.mutual_friends_avatars);
        String str = "mutual_friends_avatars";
        C12932j.m33815a((Object) linearLayout, str);
        String a = C5540g.m15722a(linearLayout.getContext(), list);
        TextView textView = (TextView) mo12666a(C3891l.mutual_friends);
        String str2 = "mutual_friends";
        C12932j.m33815a((Object) textView, str2);
        textView.setText(a);
        TextView textView2 = (TextView) mo12666a(C3891l.mutual_friends);
        C12932j.m33815a((Object) textView2, str2);
        textView2.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo12666a(C3891l.mutual_friends_avatars);
        C12932j.m33815a((Object) linearLayout2, str);
        linearLayout2.setVisibility(0);
        LinearLayout linearLayout3 = (LinearLayout) mo12666a(C3891l.mutual_friends_avatars);
        C12932j.m33815a((Object) linearLayout3, str);
        C3137b.m9865a(linearLayout3, list);
    }
}
