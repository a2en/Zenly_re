package app.zenly.locator.p086e0.p087a;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.AvatarDialogController.AvatarDialogListener;
import app.zenly.locator.core.p072ui.controller.AvatarDialogController.C3090b;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.core.util.C3236s;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8271s2;
import p213co.znly.models.services.C8271s2.C8272a;
import p213co.znly.models.services.C8292t2;
import p213co.znly.models.services.C8377x5;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.e0.a.c */
public final class C3592c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlySchedulers f9668a = C1351e.m6372a(C3602d.f9686b.mo19916a("dialogs"));

    /* renamed from: b */
    private final Activity f9669b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3615f f9670c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ZenlyCore f9671d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3617g f9672e;

    /* renamed from: app.zenly.locator.e0.a.c$a */
    static final class C3593a implements OnClickListener {

        /* renamed from: e */
        public static final C3593a f9673e = new C3593a();

        C3593a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: app.zenly.locator.e0.a.c$b */
    static final class C3594b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3592c f9674e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f9675f;

        /* renamed from: app.zenly.locator.e0.a.c$b$a */
        static final class C3595a<T> implements Consumer<C8292t2> {

            /* renamed from: e */
            public static final C3595a f9676e = new C3595a();

            C3595a() {
            }

            /* renamed from: a */
            public final void accept(C8292t2 t2Var) {
                C5343a.m15160U().mo12907s();
            }
        }

        /* renamed from: app.zenly.locator.e0.a.c$b$b */
        static final class C3596b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C3596b f9677e = new C3596b();

            C3596b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C12143a.m32032b(th, "friendDelete onError", new Object[0]);
            }
        }

        C3594b(C3592c cVar, UserProto$User userProto$User) {
            this.f9674e = cVar;
            this.f9675f = userProto$User;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C8272a newBuilder = C8271s2.newBuilder();
            newBuilder.setUuid(this.f9675f.getUuid());
            this.f9674e.f9671d.friendDelete((C8271s2) newBuilder.build()).mo36428a((C12286f) this.f9674e.f9668a.getMainThread()).mo36412a((Consumer<? super T>) C3595a.f9676e, (Consumer<? super Throwable>) C3596b.f9677e);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.c$c */
    static final class C3597c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3592c f9678e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f9679f;

        C3597c(C3592c cVar, UserProto$User userProto$User) {
            this.f9678e = cVar;
            this.f9679f = userProto$User;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f9678e.m10885d(this.f9679f);
            }
        }
    }

    /* renamed from: app.zenly.locator.e0.a.c$d */
    public static final class C3598d implements AvatarDialogListener {

        /* renamed from: a */
        final /* synthetic */ C3592c f9680a;

        C3598d(C3592c cVar) {
            this.f9680a = cVar;
        }

        public void onProfilePhotoChatWith(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "user");
            this.f9680a.f9670c.mo10097a(userProto$User);
        }

        public void showChangeMyAvatar() {
            this.f9680a.f9670c.mo10091a();
        }
    }

    /* renamed from: app.zenly.locator.e0.a.c$e */
    static final class C3599e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3592c f9681e;

        /* renamed from: f */
        final /* synthetic */ boolean f9682f;

        /* renamed from: g */
        final /* synthetic */ UserProto$User f9683g;

        C3599e(C3592c cVar, boolean z, UserProto$User userProto$User) {
            this.f9681e = cVar;
            this.f9682f = z;
            this.f9683g = userProto$User;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i != 0) {
                if (i == 1) {
                    this.f9681e.m10886e(this.f9683g);
                }
            } else if (this.f9682f) {
                this.f9681e.m10887f(this.f9683g);
            } else {
                this.f9681e.m10881c(this.f9683g);
            }
        }
    }

    /* renamed from: app.zenly.locator.e0.a.c$f */
    static final class C3600f<T> implements Consumer<C8377x5> {

        /* renamed from: e */
        final /* synthetic */ C3592c f9684e;

        C3600f(C3592c cVar) {
            this.f9684e = cVar;
        }

        /* renamed from: a */
        public final void accept(C8377x5 x5Var) {
            this.f9684e.f9672e.mo10106a(false);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.c$g */
    static final class C3601g<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C3592c f9685e;

        C3601g(C3592c cVar) {
            this.f9685e = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f9685e.f9672e.mo10106a(true);
        }
    }

    public C3592c(Activity activity, C3615f fVar, ZenlyCore zenlyCore, C3617g gVar) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(fVar, "navigation");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(gVar, "statusManager");
        this.f9669b = activity;
        this.f9670c = fVar;
        this.f9671d = zenlyCore;
        this.f9672e = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m10886e(UserProto$User userProto$User) {
        this.f9670c.mo10103d(userProto$User);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Disposable m10887f(UserProto$User userProto$User) {
        this.f9672e.mo10106a(false);
        Disposable a = C5448c.m15478a().userUnblock(userProto$User.getUuid()).mo36428a((C12286f) this.f9668a.getMainThread()).mo36412a((Consumer<? super T>) new C3600f<Object>(this), (Consumer<? super Throwable>) new C3601g<Object>(this));
        C12932j.m33815a((Object) a, "ZenlyCoreProvider.get().…ked(true) }\n            )");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Disposable m10881c(UserProto$User userProto$User) {
        this.f9670c.mo10101b(userProto$User);
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m10885d(UserProto$User userProto$User) {
        new Builder(this.f9669b).setMessage(this.f9669b.getString(R.string.friend_delete_modal, new Object[]{userProto$User.getName()})).setNegativeButton(R.string.commons_button_no, C3593a.f9673e).setPositiveButton(R.string.commons_button_yes, new C3594b(this, userProto$User)).show();
    }

    /* renamed from: a */
    public final void mo10068a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "friend");
        String string = this.f9669b.getResources().getString(R.string.commons_button_cancelcap);
        C12932j.m33815a((Object) string, "activity.resources.getSt…commons_button_cancelcap)");
        new Builder(this.f9669b).setTitle(userProto$User.getName()).setItems(new String[]{C7709b.m18762a(this.f9669b, R.string.settings_manage_alert_button_deletefriend), string}, new C3597c(this, userProto$User)).show();
    }

    /* renamed from: b */
    public final void mo10071b(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        if (C3194b0.m10163a(userProto$User)) {
            C3090b bVar = new C3090b(userProto$User);
            bVar.mo9292a((AvatarDialogListener) new C3598d(this));
            bVar.mo9293a().mo9296j(this.f9669b);
        }
    }

    /* renamed from: a */
    public final void mo10069a(UserProto$User userProto$User, boolean z) {
        C12932j.m33818b(userProto$User, "user");
        String[] strArr = new String[2];
        strArr[0] = C7709b.m18762a(this.f9669b, z ? R.string.profile_button_unblock : R.string.profile_button_blockuser);
        strArr[1] = C7709b.m18762a(this.f9669b, R.string.profile_button_reportuser);
        new Builder(this.f9669b).setTitle(userProto$User.getName()).setItems(strArr, new C3599e(this, z, userProto$User)).show();
    }

    /* renamed from: a */
    public final void mo10070a(String str) {
        C12932j.m33818b(str, "phoneNumber");
        C3236s.m10265c(this.f9669b, str);
    }
}
