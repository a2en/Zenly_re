package p250f.p251a.p252a.p263b.p264a.p272j;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.a.j.d */
public final class C7711d {

    /* renamed from: a */
    public static final C7711d f19339a = new C7711d();

    private C7711d() {
    }

    /* renamed from: a */
    public static final Uri m18771a(Context context, int i) {
        C12932j.m33818b(context, "context");
        Uri build = f19339a.m18770a(context).appendPath(String.valueOf(i)).build();
        C12932j.m33815a((Object) build, "createResourceUriBuilder…g())\n            .build()");
        return build;
    }

    /* renamed from: b */
    public static final Uri m18772b(Context context, int i) {
        C12932j.m33818b(context, "context");
        Uri build = f19339a.m18770a(context).appendPath(context.getResources().getResourceTypeName(i)).appendPath(context.getResources().getResourceEntryName(i)).build();
        C12932j.m33815a((Object) build, "createResourceUriBuilder…Id))\n            .build()");
        return build;
    }

    /* renamed from: a */
    private final Builder m18770a(Context context) {
        Builder authority = new Builder().scheme("android.resource").authority(context.getPackageName());
        C12932j.m33815a((Object) authority, "Uri.Builder()\n          …rity(context.packageName)");
        return authority;
    }
}
