package app.zenly.locator.friendshipfacts;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.c */
public final class C3772c {
    static {
        new C3772c();
    }

    private C3772c() {
    }

    /* renamed from: a */
    public static final FriendshipFactsModule m11231a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((FriendshipFactsModuleProvider) applicationContext).provideFriendshipFactsModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.friendshipfacts.FriendshipFactsModuleProvider");
    }
}
