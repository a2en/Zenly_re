package app.zenly.locator.p017a0.p024p.p027f;

import android.content.Context;
import android.view.View;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p017a0.p024p.p026e.C1566a;
import app.zenly.locator.p017a0.p024p.p026e.C1567b;
import app.zenly.locator.p017a0.p024p.p026e.C1568c;
import app.zenly.locator.p017a0.p024p.p026e.C1571f;
import app.zenly.locator.p017a0.p024p.p026e.C1574h;
import app.zenly.locator.p017a0.p024p.p026e.C1575i;
import app.zenly.locator.p017a0.p024p.p029h.C1605a;
import app.zenly.locator.p017a0.p024p.p029h.C1607c;
import app.zenly.locator.p017a0.p024p.p029h.C1613h;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.a0.p.f.c */
public final class C1593c extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f5552f;

    /* renamed from: g */
    private final C12279e<UserProto$User> f5553g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AvatarLoader f5554h;

    /* renamed from: i */
    private final C12279e<Boolean> f5555i;

    /* renamed from: app.zenly.locator.a0.p.f.c$a */
    private enum C1594a {
        AVATAR,
        DISPLAY_NAME,
        USERNAME,
        BIRTHDAY,
        MANAGE_FRIENDS,
        BLOCKED_USERS;
        

        /* renamed from: e */
        private final long f5563e;

        /* renamed from: a */
        public final long mo7153a() {
            return this.f5563e;
        }
    }

    /* renamed from: app.zenly.locator.a0.p.f.c$b */
    public static final class C1595b<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C1593c f5564a;

        public C1595b(C1593c cVar) {
            this.f5564a = cVar;
        }

        public final R apply(T1 t1, T2 t2) {
            boolean booleanValue = ((Boolean) t2).booleanValue();
            UserProto$User userProto$User = (UserProto$User) t1;
            ArrayList arrayList = new ArrayList();
            C1605a aVar = new C1605a(C1594a.AVATAR.mo7153a(), C2884f.m9355a(userProto$User), this.f5564a.f5554h, booleanValue, C1566a.f5502a);
            long a = C1594a.DISPLAY_NAME.mo7153a();
            String name = userProto$User.getName();
            String name2 = userProto$User.getName();
            C12932j.m33815a((Object) name2, "user.name");
            C1613h hVar = new C1613h(a, R.string.settings_profile_name, null, name, 0, new C1568c(name2), 20, null);
            C12854t.m33651a((Collection) arrayList, (Iterable) C12848o.m33643b((Object[]) new C11722a[]{new C1607c(1, R.string.settings_manage_section_manage), aVar, hVar}));
            String username = userProto$User.getUsername();
            if (!(username == null || username.length() == 0)) {
                C1613h hVar2 = new C1613h(C1594a.USERNAME.mo7153a(), R.string.settings_profile_username, null, userProto$User.getUsername(), 2131231577, new C1571f(userProto$User), 4, null);
                arrayList.add(hVar2);
            }
            long a2 = C1594a.BIRTHDAY.mo7153a();
            Context b = this.f5564a.f5552f;
            Timestamp birthdate = userProto$User.getBirthdate();
            C12932j.m33815a((Object) birthdate, "user.birthdate");
            C1613h hVar3 = new C1613h(a2, R.string.settings_profile_birthday, null, C5518b.m15653b(b, C3245z.m10288g(birthdate), null, 4, null), 0, C1567b.f5503a, 20, null);
            C1613h hVar4 = new C1613h(C1594a.MANAGE_FRIENDS.mo7153a(), R.string.settings_managefriends_title_friends, null, C7706a.m18758e(this.f5564a.f5552f, userProto$User.getFriendsCount()), 0, C1574h.f5516a, 20, null);
            C1613h hVar5 = new C1613h(C1594a.BLOCKED_USERS.mo7153a(), R.string.settings_profile_blocked, null, null, 0, C1575i.f5517a, 28, null);
            C12854t.m33651a((Collection) arrayList, (Iterable) C12848o.m33643b((Object[]) new C1613h[]{hVar3, hVar4, hVar5}));
            return C11751f.m30863b(arrayList);
        }
    }

    public C1593c(Context context, C12279e<UserProto$User> eVar, AvatarLoader avatarLoader, C12279e<Boolean> eVar2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(eVar, "userObservable");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(eVar2, "avatarUpdateObservable");
        this.f5552f = context;
        this.f5553g = eVar;
        this.f5554h = avatarLoader;
        this.f5555i = eVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) this.f5553g, (ObservableSource<? extends T2>) this.f5555i, (BiFunction<? super T1, ? super T2, ? extends R>) new C1595b<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…es.copyOf(list)\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
