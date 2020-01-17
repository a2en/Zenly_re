package app.zenly.locator.core.invitations;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

public abstract class ShareContent implements Parcelable {

    /* renamed from: app.zenly.locator.core.invitations.ShareContent$a */
    public static final class C2526a {
        private C2526a() {
        }

        public /* synthetic */ C2526a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2526a(null);
    }

    private ShareContent() {
    }

    /* renamed from: a */
    public static /* synthetic */ Intent m8815a(ShareContent shareContent, Context context, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            return shareContent.mo8619a(context, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newTextIntent");
    }

    /* renamed from: a */
    public abstract Intent mo8619a(Context context, String str);

    public /* synthetic */ ShareContent(C12928f fVar) {
        this();
    }
}
