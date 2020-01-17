package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.content.C0540a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.appsflyer.share.Constants;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    static final Mode f2604j = Mode.SRC_IN;

    /* renamed from: a */
    public int f2605a = -1;

    /* renamed from: b */
    Object f2606b;

    /* renamed from: c */
    public byte[] f2607c = null;

    /* renamed from: d */
    public Parcelable f2608d = null;

    /* renamed from: e */
    public int f2609e = 0;

    /* renamed from: f */
    public int f2610f = 0;

    /* renamed from: g */
    public ColorStateList f2611g = null;

    /* renamed from: h */
    Mode f2612h = f2604j;

    /* renamed from: i */
    public String f2613i = null;

    public IconCompat() {
    }

    /* renamed from: a */
    public static IconCompat m2629a(Context context, int i) {
        if (context != null) {
            return m2630a(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: a */
    private static String m2631a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: b */
    public String mo3107b() {
        if (this.f2605a == -1 && VERSION.SDK_INT >= 23) {
            return m2632b((Icon) this.f2606b);
        }
        if (this.f2605a == 2) {
            return ((String) this.f2606b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo3108c() {
        this.f2612h = Mode.valueOf(this.f2613i);
        int i = this.f2605a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f2606b = this.f2607c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f2606b = new String(this.f2607c, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f2608d;
            if (parcelable != null) {
                this.f2606b = parcelable;
                return;
            }
            byte[] bArr = this.f2607c;
            this.f2606b = bArr;
            this.f2605a = 3;
            this.f2609e = 0;
            this.f2610f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f2608d;
        if (parcelable2 != null) {
            this.f2606b = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* renamed from: d */
    public Icon mo3109d() {
        Icon icon;
        int i = this.f2605a;
        if (i == -1) {
            return (Icon) this.f2606b;
        }
        if (i == 1) {
            icon = Icon.createWithBitmap((Bitmap) this.f2606b);
        } else if (i == 2) {
            icon = Icon.createWithResource(mo3107b(), this.f2609e);
        } else if (i == 3) {
            icon = Icon.createWithData((byte[]) this.f2606b, this.f2609e, this.f2610f);
        } else if (i == 4) {
            icon = Icon.createWithContentUri((String) this.f2606b);
        } else if (i != 5) {
            throw new IllegalArgumentException("Unknown type");
        } else if (VERSION.SDK_INT >= 26) {
            icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f2606b);
        } else {
            icon = Icon.createWithBitmap(m2628a((Bitmap) this.f2606b, false));
        }
        ColorStateList colorStateList = this.f2611g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        Mode mode = this.f2612h;
        if (mode != f2604j) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f2605a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f2606b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f2605a
            java.lang.String r1 = m2631a(r1)
            r0.append(r1)
            int r1 = r4.f2605a
            r2 = 1
            if (r1 == r2) goto L_0x007a
            r3 = 2
            if (r1 == r3) goto L_0x0052
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x007a
            goto L_0x009a
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f2606b
            r0.append(r1)
            goto L_0x009a
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f2609e
            r0.append(r1)
            int r1 = r4.f2610f
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f2610f
            r0.append(r1)
            goto L_0x009a
        L_0x0052:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo3107b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.mo3103a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009a
        L_0x007a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f2606b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f2606b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x009a:
            android.content.res.ColorStateList r1 = r4.f2611g
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f2611g
            r0.append(r1)
        L_0x00a8:
            android.graphics.PorterDuff$Mode r1 = r4.f2612h
            android.graphics.PorterDuff$Mode r2 = f2604j
            if (r1 == r2) goto L_0x00b8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f2612h
            r0.append(r1)
        L_0x00b8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: a */
    public static IconCompat m2630a(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2609e = i;
            if (resources != null) {
                try {
                    iconCompat.f2606b = resources.getResourceName(i);
                } catch (NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2606b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: b */
    private static String m2632b(Icon icon) {
        String str = "Unable to get icon package";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    private IconCompat(int i) {
        this.f2605a = i;
    }

    /* renamed from: a */
    public int mo3103a() {
        if (this.f2605a == -1 && VERSION.SDK_INT >= 23) {
            return m2626a((Icon) this.f2606b);
        }
        if (this.f2605a == 2) {
            return this.f2609e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo3104a(Context context) {
        if (this.f2605a == 2) {
            String str = (String) this.f2606b;
            String str2 = ":";
            if (str.contains(str2)) {
                String str3 = str.split(str2, -1)[1];
                String str4 = Constants.URL_PATH_DELIMITER;
                String str5 = str3.split(str4, -1)[0];
                String str6 = str3.split(str4, -1)[1];
                String str7 = str.split(str2, -1)[0];
                int identifier = m2627a(context, str7).getIdentifier(str6, str5, str7);
                if (this.f2609e != identifier) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Id has changed for ");
                    sb.append(str7);
                    sb.append(str4);
                    sb.append(str6);
                    Log.i("IconCompat", sb.toString());
                    this.f2609e = identifier;
                }
            }
        }
    }

    /* renamed from: a */
    private static Resources m2627a(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo3105a(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmap;
        mo3104a(context);
        int i = this.f2605a;
        if (i == 1) {
            bitmap = (Bitmap) this.f2606b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(mo3107b(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(createPackageContext, this.f2609e));
                    return;
                }
                Drawable c = C0540a.m2546c(createPackageContext, this.f2609e);
                if (c.getIntrinsicWidth() > 0) {
                    if (c.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(c.getIntrinsicWidth(), c.getIntrinsicHeight(), Config.ARGB_8888);
                        c.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        c.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Config.ARGB_8888);
                c.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                c.draw(new Canvas(bitmap));
            } catch (NameNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't find package ");
                sb.append(this.f2606b);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else if (i == 5) {
            bitmap = m2628a((Bitmap) this.f2606b, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    /* renamed from: a */
    public void mo3106a(boolean z) {
        this.f2613i = this.f2612h.name();
        int i = this.f2605a;
        if (i != -1) {
            if (i != 1) {
                String str = "UTF-16";
                if (i == 2) {
                    this.f2607c = ((String) this.f2606b).getBytes(Charset.forName(str));
                    return;
                } else if (i == 3) {
                    this.f2607c = (byte[]) this.f2606b;
                    return;
                } else if (i == 4) {
                    this.f2607c = this.f2606b.toString().getBytes(Charset.forName(str));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f2606b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2607c = byteArrayOutputStream.toByteArray();
                return;
            }
            this.f2608d = (Parcelable) this.f2606b;
        } else if (!z) {
            this.f2608d = (Parcelable) this.f2606b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: a */
    private static int m2626a(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return 0;
        }
    }

    /* renamed from: a */
    static Bitmap m2628a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
