package app.zenly.locator.core.invitations;

import android.content.Context;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5365v;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.core.invitations.w */
public class C2623w implements InvitationCallback {

    /* renamed from: a */
    private final Context f7726a;

    /* renamed from: b */
    private final boolean f7727b;

    public C2623w(Context context, boolean z) {
        C12932j.m33818b(context, "context");
        this.f7727b = z;
        Context applicationContext = context.getApplicationContext();
        C12932j.m33815a((Object) applicationContext, "context.applicationContext");
        this.f7726a = applicationContext;
    }

    public void onCancel() {
    }

    public boolean onError(C2624x xVar) {
        C12932j.m33818b(xVar, "error");
        switch (C2622v.f7725a[xVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f7727b) {
                    onSuccess();
                    return false;
                }
                break;
            case 3:
                Toast.makeText(this.f7726a, R.string.settings_inputphonenumber_title_invalidphone, 0).show();
                break;
            case 4:
                Toast.makeText(this.f7726a, R.string.addfriend_error_blocked, 0).show();
                break;
            case 5:
                Toast.makeText(this.f7726a, R.string.addfriend_error_private, 0).show();
                break;
            case 6:
                C5343a.m15160U().mo12830a(C5365v.TOO_MANY_FRIEND_REQUESTS_RATE_LIMITED);
                Context context = this.f7726a;
                Toast.makeText(context, C7709b.m18762a(context, R.string.addfriend_error_rate_message), 0).show();
                break;
            default:
                Toast.makeText(this.f7726a, R.string.commons_content_oopserror, 0).show();
                break;
        }
        return true;
    }

    public void onSuccess() {
    }
}
