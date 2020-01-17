package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.provider.MediaStore.Images.Media;
import com.theartofdev.edmodo.cropper.CropImageView.C11923b;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CropImage {

    public static final class ActivityResult extends C11923b implements Parcelable {
        public static final Creator<ActivityResult> CREATOR = new C11920a();

        /* renamed from: com.theartofdev.edmodo.cropper.CropImage$ActivityResult$a */
        static class C11920a implements Creator<ActivityResult> {
            C11920a() {
            }

            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i, i2);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(mo35391d(), i);
            parcel.writeParcelable(mo35394g(), i);
            parcel.writeSerializable(mo35390c());
            parcel.writeFloatArray(mo35388a());
            parcel.writeParcelable(mo35389b(), i);
            parcel.writeParcelable(mo35395h(), i);
            parcel.writeInt(mo35392e());
            parcel.writeInt(mo35393f());
        }

        protected ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    /* renamed from: a */
    public static void m31286a(Activity activity) {
        activity.startActivityForResult(m31289b(activity), 200);
    }

    /* renamed from: b */
    public static Intent m31289b(Context context) {
        return m31281a(context, context.getString(C11945j.pick_image_intent_chooser_title), false, true);
    }

    /* renamed from: c */
    public static boolean m31291c(Context context) {
        if (VERSION.SDK_INT >= 23) {
            String str = "android.permission.CAMERA";
            if (m31288a(context, str) && context.checkSelfPermission(str) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Intent m31281a(Context context, CharSequence charSequence, boolean z, boolean z2) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!m31291c(context) && z2) {
            arrayList.addAll(m31284a(context, packageManager));
        }
        List a = m31285a(packageManager, "android.intent.action.GET_CONTENT", z);
        if (a.size() == 0) {
            a = m31285a(packageManager, "android.intent.action.PICK", z);
        }
        arrayList.addAll(a);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    /* renamed from: b */
    public static boolean m31290b(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static List<Intent> m31284a(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri a = m31282a(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (a != null) {
                intent2.putExtra("output", a);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Intent> m31285a(PackageManager packageManager, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m31288a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String equalsIgnoreCase : strArr) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static Uri m31282a(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    /* renamed from: a */
    public static Uri m31283a(Context context, Intent intent) {
        boolean z = true;
        if (!(intent == null || intent.getData() == null)) {
            String action = intent.getAction();
            if (action == null || !action.equals("android.media.action.IMAGE_CAPTURE")) {
                z = false;
            }
        }
        return (z || intent.getData() == null) ? m31282a(context) : intent.getData();
    }

    /* renamed from: a */
    public static boolean m31287a(Context context, Uri uri) {
        return VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && m31290b(context, uri);
    }
}
