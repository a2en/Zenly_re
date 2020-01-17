package app.zenly.locator.media;

import android.text.TextUtils;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7354j0;

/* renamed from: app.zenly.locator.media.u0 */
public final class C4471u0 {
    /* renamed from: a */
    public static String m13251a(C7354j0 j0Var) {
        if (!TextUtils.isEmpty(j0Var.getUrlPrefix())) {
            StringBuilder sb = new StringBuilder();
            sb.append(j0Var.getUrlPrefix());
            sb.append(".orig.jpg");
            return sb.toString();
        } else if (!TextUtils.isEmpty(j0Var.getUploadFilepath())) {
            return j0Var.getUploadFilepath();
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static String m13252b(C7354j0 j0Var) {
        if (TextUtils.isEmpty(j0Var.getUrlPrefix())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j0Var.getUrlPrefix());
        sb.append(".mini.jpg");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m13253c(C7354j0 j0Var) {
        if (!TextUtils.isEmpty(j0Var.getUrlPrefix())) {
            StringBuilder sb = new StringBuilder();
            sb.append(j0Var.getUrlPrefix());
            sb.append(".thumb.jpg");
            return sb.toString();
        } else if (!TextUtils.isEmpty(j0Var.getUploadFilepath())) {
            return j0Var.getUploadFilepath();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public static float m13250a(Timestamp timestamp, Timestamp timestamp2) {
        return Math.max(3.0f, (float) ((((double) (C5448c.m15478a().timeNow().getTime() - C3245z.m10288g(timestamp))) * 100.0d) / ((double) (C3245z.m10288g(timestamp2) - C3245z.m10288g(timestamp)))));
    }
}
