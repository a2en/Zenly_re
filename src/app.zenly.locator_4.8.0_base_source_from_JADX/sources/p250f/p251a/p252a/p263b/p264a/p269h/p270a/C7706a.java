package p250f.p251a.p252a.p263b.p264a.p269h.p270a;

import android.content.Context;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.C7694b;

/* renamed from: f.a.a.b.a.h.a.a */
public final class C7706a {

    /* renamed from: a */
    public static final C7706a f19335a = new C7706a();

    private C7706a() {
    }

    /* renamed from: a */
    public static final String m18751a(Context context, int i) {
        return m18754a(context, i, 0, 4, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m18754a(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m18752a(context, i, i2);
    }

    /* renamed from: b */
    public static final String m18755b(Context context, int i) {
        C12932j.m33818b(context, "context");
        return f19335a.m18753a(context, i, 50, C7694b.count_formatter_contactsOnZenly_normal, C7694b.count_formatter_contactsOnZenly_plus);
    }

    /* renamed from: c */
    public static final String m18756c(Context context, int i) {
        C12932j.m33818b(context, "context");
        return f19335a.m18753a(context, i, 50, C7694b.count_formatter_friends_normal, C7694b.count_formatter_friends_plus);
    }

    /* renamed from: d */
    public static final String m18757d(Context context, int i) {
        C12932j.m33818b(context, "context");
        return f19335a.m18753a(context, i, 50, C7694b.count_formatter_friendsOnZenly_normal, C7694b.count_formatter_friendsOnZenly_plus);
    }

    /* renamed from: e */
    public static final String m18758e(Context context, int i) {
        C12932j.m33818b(context, "context");
        return m18752a(context, i, 50);
    }

    /* renamed from: a */
    public static final String m18752a(Context context, int i, int i2) {
        C12932j.m33818b(context, "context");
        return f19335a.m18753a(context, i, i2, C7694b.count_formatter_normal, C7694b.count_formatter_plus);
    }

    /* renamed from: a */
    private final String m18753a(Context context, int i, int i2, int i3, int i4) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal count: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i > i2) {
            String quantityString = context.getResources().getQuantityString(i4, i2, new Object[]{Integer.valueOf(i2)});
            C12932j.m33815a((Object) quantityString, "context.resources.getQua…tring(plus, limit, limit)");
            return quantityString;
        } else {
            String quantityString2 = context.getResources().getQuantityString(i3, i, new Object[]{Integer.valueOf(i)});
            C12932j.m33815a((Object) quantityString2, "context.resources.getQua…ing(normal, count, count)");
            return quantityString2;
        }
    }
}
