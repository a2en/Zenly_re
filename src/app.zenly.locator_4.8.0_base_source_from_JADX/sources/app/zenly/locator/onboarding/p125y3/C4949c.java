package app.zenly.locator.onboarding.p125y3;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.text.Spanned;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.core.text.C0586b;
import app.zenly.locator.R;
import app.zenly.locator.onboarding.C4847l3;
import app.zenly.locator.onboarding.C4847l3.C4850c;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.onboarding.y3.c */
public final class C4949c {

    /* renamed from: app.zenly.locator.onboarding.y3.c$a */
    static final class C4950a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ OnClickListener f12941e;

        /* renamed from: f */
        final /* synthetic */ C4850c f12942f;

        C4950a(OnClickListener onClickListener, C4850c cVar) {
            this.f12941e = onClickListener;
            this.f12942f = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12941e.onClick(dialogInterface, i);
            C4847l3.f12795c.mo12083a().mo12074b(this.f12942f);
        }
    }

    static {
        new C4949c();
    }

    private C4949c() {
    }

    /* renamed from: a */
    public static final void m14281a(Context context, OnClickListener onClickListener) {
        int i;
        Spanned spanned;
        C4850c cVar;
        C12932j.m33818b(context, "context");
        C12932j.m33818b(onClickListener, "onClickListener");
        boolean z = VERSION.SDK_INT < 28;
        String str = "HtmlCompat.fromHtml(\n   …MODE_LEGACY\n            )";
        String str2 = "</b>";
        String str3 = "<b>";
        if (z) {
            i = R.string.permission_location_highAccuracyDialog_title;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(context.getString(R.string.permission_location_highAccuracyDialog_message_subtitle_option));
            sb.append(str2);
            spanned = C0586b.m2733a(C7709b.m18763a(context, R.string.permission_location_highAccuracyDialog_message_subtitle, sb.toString()), 0);
            C12932j.m33815a((Object) spanned, str);
        } else {
            i = R.string.permission_location_improveAccuracyDialog_title;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(context.getString(R.string.permission_location_improveAccuracyDialog_message_subtitle_off));
            sb2.append(str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(context.getString(R.string.permission_location_improveAccuracyDialog_message_subtitle_on));
            sb3.append(str2);
            spanned = C0586b.m2733a(C7709b.m18763a(context, R.string.permission_location_improveAccuracyDialog_message_subtitle, sb2.toString(), sb3.toString()), 0);
            C12932j.m33815a((Object) spanned, str);
        }
        String a = C7709b.m18762a(context, i);
        if (z) {
            cVar = C4850c.HIGH_ACCURACY;
        } else {
            cVar = C4850c.IMPROVE_ACCURACY;
        }
        C0123a aVar = new C0123a(context);
        aVar.mo547b((CharSequence) a);
        aVar.mo537a((CharSequence) spanned);
        aVar.mo549c(R.string.permission_location_accuracyDialog_button_ok, new C4950a(onClickListener, cVar));
        aVar.mo542a().show();
        C4847l3.f12795c.mo12083a().mo12068a(cVar);
    }
}
