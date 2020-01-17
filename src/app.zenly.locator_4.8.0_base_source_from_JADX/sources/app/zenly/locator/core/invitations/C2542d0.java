package app.zenly.locator.core.invitations;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import app.zenly.locator.R;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.d0 */
public final class C2542d0 {

    /* renamed from: c */
    public static final C2543a f7602c = new C2543a(null);

    /* renamed from: a */
    private final C2620u f7603a;

    /* renamed from: b */
    private final Activity f7604b;

    /* renamed from: app.zenly.locator.core.invitations.d0$a */
    public static final class C2543a {
        private C2543a() {
        }

        /* renamed from: a */
        public final C2542d0 mo8682a(Activity activity) {
            C12932j.m33818b(activity, "activity");
            return new C2542d0(activity);
        }

        public /* synthetic */ C2543a(C12928f fVar) {
            this();
        }
    }

    public C2542d0(Activity activity) {
        C12932j.m33818b(activity, "activity");
        this.f7604b = activity;
        Activity activity2 = this.f7604b;
        if (activity2 != null) {
            this.f7603a = new C2620u((FragmentActivity) activity2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final C2542d0 m8880a(Activity activity) {
        return f7602c.mo8682a(activity);
    }

    /* renamed from: a */
    public final void mo8681a(C3744d dVar) {
        C12932j.m33818b(dVar, "referrerOrigin");
        String string = this.f7604b.getString(R.string.sharesheet_invite_title);
        C12932j.m33815a((Object) string, "activity.getString(R.str….sharesheet_invite_title)");
        C2620u.m8944a(this.f7603a, null, string, new MessageShareContent(null, dVar.mo10293b()), null, null, null, 57, null);
    }
}
