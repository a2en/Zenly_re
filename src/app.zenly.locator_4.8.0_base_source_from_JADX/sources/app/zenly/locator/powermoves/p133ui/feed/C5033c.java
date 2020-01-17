package app.zenly.locator.powermoves.p133ui.feed;

import android.os.Bundle;
import androidx.navigation.C0946a;
import androidx.navigation.NavDirections;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.powermoves.ui.feed.c */
public final class C5033c {

    /* renamed from: a */
    public static final C5035b f13087a = new C5035b(null);

    /* renamed from: app.zenly.locator.powermoves.ui.feed.c$a */
    private static final class C5034a implements NavDirections {

        /* renamed from: a */
        private final String f13088a;

        public C5034a(String str) {
            C12932j.m33818b(str, "powerMoveId");
            this.f13088a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f13088a, (java.lang.Object) ((app.zenly.locator.powermoves.p133ui.feed.C5033c.C5034a) r2).f13088a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.powermoves.p133ui.feed.C5033c.C5034a
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.powermoves.ui.feed.c$a r2 = (app.zenly.locator.powermoves.p133ui.feed.C5033c.C5034a) r2
                java.lang.String r0 = r1.f13088a
                java.lang.String r2 = r2.f13088a
                boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p133ui.feed.C5033c.C5034a.equals(java.lang.Object):boolean");
        }

        public int getActionId() {
            return R.id.action_powerMoveFeedFragment_to_powerMoveStoryDialogFragment;
        }

        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("powerMoveId", this.f13088a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f13088a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ActionPowerMoveFeedFragmentToPowerMoveStoryDialogFragment(powerMoveId=");
            sb.append(this.f13088a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.feed.c$b */
    public static final class C5035b {
        private C5035b() {
        }

        /* renamed from: a */
        public final NavDirections mo12288a(String str) {
            C12932j.m33818b(str, "powerMoveId");
            return new C5034a(str);
        }

        /* renamed from: b */
        public final NavDirections mo12289b() {
            return new C0946a(R.id.action_powerMoveFeedFragment_to_giftWallpaperDialogFragment);
        }

        public /* synthetic */ C5035b(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final NavDirections mo12287a() {
            return new C0946a(R.id.action_powerMoveFeedFragment_to_giftCongratsDialogFragment);
        }
    }
}
