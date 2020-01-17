package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener;
import androidx.core.content.C0540a;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends C0540a {

    /* renamed from: c */
    private static PermissionCompatDelegate f2385c;

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);

        boolean requestPermissions(Activity activity, String[] strArr, int i);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.ActivityCompat$a */
    static class C0494a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ String[] f2386e;

        /* renamed from: f */
        final /* synthetic */ Activity f2387f;

        /* renamed from: g */
        final /* synthetic */ int f2388g;

        C0494a(String[] strArr, Activity activity, int i) {
            this.f2386e = strArr;
            this.f2387f = activity;
            this.f2388g = i;
        }

        public void run() {
            int[] iArr = new int[this.f2386e.length];
            PackageManager packageManager = this.f2387f.getPackageManager();
            String packageName = this.f2387f.getPackageName();
            int length = this.f2386e.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f2386e[i], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.f2387f).onRequestPermissionsResult(this.f2388g, this.f2386e, iArr);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$b */
    private static class C0495b extends SharedElementCallback {

        /* renamed from: a */
        private final SharedElementCallback f2389a;

        /* renamed from: androidx.core.app.ActivityCompat$b$a */
        class C0496a implements OnSharedElementsReadyListener {

            /* renamed from: a */
            final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f2390a;

            C0496a(C0495b bVar, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f2390a = onSharedElementsReadyListener;
            }

            public void onSharedElementsReady() {
                this.f2390a.onSharedElementsReady();
            }
        }

        C0495b(SharedElementCallback sharedElementCallback) {
            this.f2389a = sharedElementCallback;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f2389a.mo3014a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f2389a.mo3015a(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f2389a.mo3019a(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f2389a.mo3016a(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f2389a.mo3018a(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f2389a.mo3020b(list, list2, list3);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f2389a.mo3017a(list, list2, (OnSharedElementsReadyListener) new C0496a(this, onSharedElementsReadyListener));
        }
    }

    /* renamed from: a */
    public static PermissionCompatDelegate m2345a() {
        return f2385c;
    }

    /* renamed from: b */
    public static void m2352b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: c */
    public static Uri m2354c(Activity activity) {
        if (VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    /* renamed from: d */
    public static void m2355d(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: e */
    public static void m2356e(Activity activity) {
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C0516b.m2456a(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: f */
    public static void m2357f(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: a */
    public static void m2347a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: b */
    public static void m2353b(Activity activity, SharedElementCallback sharedElementCallback) {
        if (VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(sharedElementCallback != null ? new C0495b(sharedElementCallback) : null);
        }
    }

    /* renamed from: a */
    public static void m2348a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2346a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m2349a(Activity activity, SharedElementCallback sharedElementCallback) {
        if (VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(sharedElementCallback != null ? new C0495b(sharedElementCallback) : null);
        }
    }

    /* renamed from: a */
    public static void m2350a(Activity activity, String[] strArr, int i) {
        PermissionCompatDelegate permissionCompatDelegate = f2385c;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.requestPermissions(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof RequestPermissionsRequestCodeValidator) {
                    ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof OnRequestPermissionsResultCallback) {
                new Handler(Looper.getMainLooper()).post(new C0494a(strArr, activity, i));
            }
        }
    }

    /* renamed from: a */
    public static boolean m2351a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
