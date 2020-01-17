package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat.Action;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.core.app.g */
class C0526g {

    /* renamed from: a */
    private static final Object f2525a = new Object();

    /* renamed from: b */
    private static Field f2526b;

    /* renamed from: c */
    private static boolean f2527c;

    /* renamed from: a */
    public static SparseArray<Bundle> m2483a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m2480a(Notification notification) {
        synchronized (f2525a) {
            if (f2527c) {
                return null;
            }
            try {
                if (f2526b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2527c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2526b = declaredField;
                }
                Bundle bundle = (Bundle) f2526b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2526b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f2527c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f2527c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2479a(Builder builder, Action action) {
        builder.addAction(action.mo2971e(), action.mo2975i(), action.mo2967a());
        Bundle bundle = new Bundle(action.mo2970d());
        if (action.mo2972f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m2484a(action.mo2972f()));
        }
        if (action.mo2969c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m2484a(action.mo2969c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.mo2968b());
        return bundle;
    }

    /* renamed from: a */
    static Bundle m2481a(Action action) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", action.mo2971e());
        bundle2.putCharSequence("title", action.mo2975i());
        bundle2.putParcelable("actionIntent", action.mo2967a());
        if (action.mo2970d() != null) {
            bundle = new Bundle(action.mo2970d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.mo2968b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m2484a(action.mo2972f()));
        bundle2.putBoolean("showsUserInterface", action.mo2974h());
        bundle2.putInt("semanticAction", action.mo2973g());
        return bundle2;
    }

    /* renamed from: a */
    private static Bundle m2482a(C0534i iVar) {
        new Bundle();
        iVar.mo3051a();
        throw null;
    }

    /* renamed from: a */
    private static Bundle[] m2484a(C0534i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[iVarArr.length];
        if (iVarArr.length <= 0) {
            return bundleArr;
        }
        m2482a(iVarArr[0]);
        throw null;
    }
}
