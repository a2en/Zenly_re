package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import androidx.core.content.res.C0554e;
import com.mapbox.mapboxsdk.C11462h;
import com.mapbox.mapboxsdk.C11470l;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.C11448b;
import com.mapbox.mapboxsdk.utils.C11594a;
import java.util.Arrays;

public class MapboxMapOptions implements Parcelable {
    public static final Creator<MapboxMapOptions> CREATOR = new C11506a();

    /* renamed from: A */
    private boolean f29766A;

    /* renamed from: B */
    private boolean f29767B;

    /* renamed from: C */
    private String f29768C;

    /* renamed from: D */
    private String f29769D;

    /* renamed from: E */
    private boolean f29770E;

    /* renamed from: F */
    private boolean f29771F;

    /* renamed from: G */
    private int f29772G;

    /* renamed from: H */
    private float f29773H;

    /* renamed from: I */
    private boolean f29774I;

    /* renamed from: e */
    private CameraPosition f29775e;

    /* renamed from: f */
    private boolean f29776f;

    /* renamed from: g */
    private boolean f29777g;

    /* renamed from: h */
    private boolean f29778h;

    /* renamed from: i */
    private int f29779i;

    /* renamed from: j */
    private int[] f29780j;

    /* renamed from: k */
    private Drawable f29781k;

    /* renamed from: l */
    private boolean f29782l;

    /* renamed from: m */
    private int f29783m;

    /* renamed from: n */
    private int[] f29784n;

    /* renamed from: o */
    private int f29785o;

    /* renamed from: p */
    private boolean f29786p;

    /* renamed from: q */
    private int f29787q;

    /* renamed from: r */
    private int[] f29788r;

    /* renamed from: s */
    private double f29789s;

    /* renamed from: t */
    private double f29790t;

    /* renamed from: u */
    private boolean f29791u;

    /* renamed from: v */
    private boolean f29792v;

    /* renamed from: w */
    private boolean f29793w;

    /* renamed from: x */
    private boolean f29794x;

    /* renamed from: y */
    private boolean f29795y;

    /* renamed from: z */
    private boolean f29796z;

    /* renamed from: com.mapbox.mapboxsdk.maps.MapboxMapOptions$a */
    static class C11506a implements Creator<MapboxMapOptions> {
        C11506a() {
        }

        public MapboxMapOptions createFromParcel(Parcel parcel) {
            return new MapboxMapOptions(parcel, null);
        }

        public MapboxMapOptions[] newArray(int i) {
            return new MapboxMapOptions[i];
        }
    }

    /* synthetic */ MapboxMapOptions(Parcel parcel, C11506a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static MapboxMapOptions m29802a(Context context, AttributeSet attributeSet) {
        MapboxMapOptions mapboxMapOptions = new MapboxMapOptions();
        float f = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11470l.mapbox_MapView, 0, 0);
        try {
            mapboxMapOptions.mo33617a(new C11448b(obtainStyledAttributes).mo33323a());
            mapboxMapOptions.mo33618a(obtainStyledAttributes.getString(C11470l.mapbox_MapView_mapbox_apiBaseUrl));
            mapboxMapOptions.mo33661o(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiZoomGestures, true));
            mapboxMapOptions.mo33651j(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiScrollGestures, true));
            mapboxMapOptions.mo33649i(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiRotateGestures, true));
            mapboxMapOptions.mo33656m(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiTiltGestures, true));
            mapboxMapOptions.mo33638e(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiDoubleTapGestures, true));
            mapboxMapOptions.mo33642g(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiQuickZoomGestures, true));
            mapboxMapOptions.mo33613a((double) obtainStyledAttributes.getFloat(C11470l.mapbox_MapView_mapbox_cameraZoomMax, 25.5f));
            mapboxMapOptions.mo33622b((double) obtainStyledAttributes.getFloat(C11470l.mapbox_MapView_mapbox_cameraZoomMin, 0.0f));
            mapboxMapOptions.mo33625b(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiCompass, true));
            mapboxMapOptions.mo33629c(obtainStyledAttributes.getInt(C11470l.mapbox_MapView_mapbox_uiCompassGravity, 8388661));
            float f2 = 4.0f * f;
            mapboxMapOptions.mo33626b(new int[]{(int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiCompassMarginLeft, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiCompassMarginTop, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiCompassMarginRight, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiCompassMarginBottom, f2)});
            mapboxMapOptions.mo33630c(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiCompassFadeFacingNorth, true));
            Drawable drawable = obtainStyledAttributes.getDrawable(C11470l.mapbox_MapView_mapbox_uiCompassDrawable);
            if (drawable == null) {
                drawable = C0554e.m2609b(context.getResources(), C11462h.mapbox_compass_icon, null);
            }
            mapboxMapOptions.mo33616a(drawable);
            mapboxMapOptions.mo33641f(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiLogo, true));
            mapboxMapOptions.mo33637e(obtainStyledAttributes.getInt(C11470l.mapbox_MapView_mapbox_uiLogoGravity, 8388691));
            mapboxMapOptions.mo33631c(new int[]{(int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiLogoMarginLeft, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiLogoMarginTop, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiLogoMarginRight, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiLogoMarginBottom, f2)});
            mapboxMapOptions.mo33623b(obtainStyledAttributes.getColor(C11470l.mapbox_MapView_mapbox_uiAttributionTintColor, -1));
            mapboxMapOptions.mo33619a(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_uiAttribution, true));
            mapboxMapOptions.mo33615a(obtainStyledAttributes.getInt(C11470l.mapbox_MapView_mapbox_uiAttributionGravity, 8388691));
            mapboxMapOptions.mo33620a(new int[]{(int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiAttributionMarginLeft, f * 92.0f), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiAttributionMarginTop, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiAttributionMarginRight, f2), (int) obtainStyledAttributes.getDimension(C11470l.mapbox_MapView_mapbox_uiAttributionMarginBottom, f2)});
            mapboxMapOptions.mo33654l(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_renderTextureMode, false));
            mapboxMapOptions.mo33658n(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_renderTextureTranslucentSurface, false));
            mapboxMapOptions.mo33652k(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_enableTilePrefetch, true));
            mapboxMapOptions.mo33645h(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_enableZMediaOverlay, false));
            mapboxMapOptions.mo33624b(obtainStyledAttributes.getString(C11470l.mapbox_MapView_mapbox_localIdeographFontFamily));
            mapboxMapOptions.mo33614a(obtainStyledAttributes.getFloat(C11470l.mapbox_MapView_mapbox_pixelRatio, 0.0f));
            mapboxMapOptions.mo33632d(obtainStyledAttributes.getInt(C11470l.mapbox_MapView_mapbox_foregroundLoadColor, -988703));
            mapboxMapOptions.mo33633d(obtainStyledAttributes.getBoolean(C11470l.mapbox_MapView_mapbox_cross_source_collisions, true));
            return mapboxMapOptions;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public boolean mo33609A() {
        return this.f29770E;
    }

    /* renamed from: B */
    public boolean mo33610B() {
        return this.f29793w;
    }

    /* renamed from: C */
    public boolean mo33611C() {
        return this.f29771F;
    }

    /* renamed from: D */
    public boolean mo33612D() {
        return this.f29794x;
    }

    /* renamed from: b */
    public MapboxMapOptions mo33622b(double d) {
        this.f29789s = d;
        return this;
    }

    /* renamed from: c */
    public MapboxMapOptions mo33629c(int i) {
        this.f29779i = i;
        return this;
    }

    /* renamed from: d */
    public MapboxMapOptions mo33632d(int i) {
        this.f29772G = i;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public MapboxMapOptions mo33637e(int i) {
        this.f29783m = i;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MapboxMapOptions.class == obj.getClass()) {
            MapboxMapOptions mapboxMapOptions = (MapboxMapOptions) obj;
            if (this.f29776f != mapboxMapOptions.f29776f || this.f29777g != mapboxMapOptions.f29777g || this.f29778h != mapboxMapOptions.f29778h) {
                return false;
            }
            Drawable drawable = this.f29781k;
            if (drawable == null ? mapboxMapOptions.f29781k != null : !drawable.equals(mapboxMapOptions.f29781k)) {
                return false;
            }
            if (this.f29779i != mapboxMapOptions.f29779i || this.f29782l != mapboxMapOptions.f29782l || this.f29783m != mapboxMapOptions.f29783m || this.f29785o != mapboxMapOptions.f29785o || this.f29786p != mapboxMapOptions.f29786p || this.f29787q != mapboxMapOptions.f29787q || Double.compare(mapboxMapOptions.f29789s, this.f29789s) != 0 || Double.compare(mapboxMapOptions.f29790t, this.f29790t) != 0 || this.f29791u != mapboxMapOptions.f29791u || this.f29792v != mapboxMapOptions.f29792v || this.f29793w != mapboxMapOptions.f29793w || this.f29794x != mapboxMapOptions.f29794x || this.f29795y != mapboxMapOptions.f29795y || this.f29796z != mapboxMapOptions.f29796z) {
                return false;
            }
            CameraPosition cameraPosition = this.f29775e;
            if (cameraPosition == null ? mapboxMapOptions.f29775e != null : !cameraPosition.equals(mapboxMapOptions.f29775e)) {
                return false;
            }
            if (!Arrays.equals(this.f29780j, mapboxMapOptions.f29780j) || !Arrays.equals(this.f29784n, mapboxMapOptions.f29784n) || !Arrays.equals(this.f29788r, mapboxMapOptions.f29788r)) {
                return false;
            }
            String str = this.f29769D;
            if (str == null ? mapboxMapOptions.f29769D != null : !str.equals(mapboxMapOptions.f29769D)) {
                return false;
            }
            if (this.f29766A == mapboxMapOptions.f29766A && this.f29767B == mapboxMapOptions.f29767B && this.f29768C.equals(mapboxMapOptions.f29768C) && this.f29773H == mapboxMapOptions.f29773H && this.f29774I != mapboxMapOptions.f29774I) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public MapboxMapOptions mo33641f(boolean z) {
        this.f29782l = z;
        return this;
    }

    /* renamed from: g */
    public MapboxMapOptions mo33642g(boolean z) {
        this.f29796z = z;
        return this;
    }

    public float getPixelRatio() {
        return this.f29773H;
    }

    /* renamed from: h */
    public void mo33645h(boolean z) {
        this.f29767B = z;
    }

    public int hashCode() {
        CameraPosition cameraPosition = this.f29775e;
        int i = 0;
        int hashCode = (((((((((cameraPosition != null ? cameraPosition.hashCode() : 0) * 31) + (this.f29776f ? 1 : 0)) * 31) + (this.f29777g ? 1 : 0)) * 31) + (this.f29778h ? 1 : 0)) * 31) + this.f29779i) * 31;
        Drawable drawable = this.f29781k;
        int hashCode2 = ((((((((((((((((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31) + Arrays.hashCode(this.f29780j)) * 31) + (this.f29782l ? 1 : 0)) * 31) + this.f29783m) * 31) + Arrays.hashCode(this.f29784n)) * 31) + this.f29785o) * 31) + (this.f29786p ? 1 : 0)) * 31) + this.f29787q) * 31) + Arrays.hashCode(this.f29788r);
        long doubleToLongBits = Double.doubleToLongBits(this.f29789s);
        int i2 = (hashCode2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f29790t);
        int i3 = ((((((((((((((i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + (this.f29791u ? 1 : 0)) * 31) + (this.f29792v ? 1 : 0)) * 31) + (this.f29793w ? 1 : 0)) * 31) + (this.f29794x ? 1 : 0)) * 31) + (this.f29795y ? 1 : 0)) * 31) + (this.f29796z ? 1 : 0)) * 31;
        String str = this.f29769D;
        int hashCode3 = (((((((((i3 + (str != null ? str.hashCode() : 0)) * 31) + (this.f29770E ? 1 : 0)) * 31) + (this.f29771F ? 1 : 0)) * 31) + (this.f29766A ? 1 : 0)) * 31) + (this.f29767B ? 1 : 0)) * 31;
        String str2 = this.f29768C;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode3 + i) * 31) + ((int) this.f29773H)) * 31) + (this.f29774I ? 1 : 0);
    }

    /* renamed from: i */
    public MapboxMapOptions mo33649i(boolean z) {
        this.f29791u = z;
        return this;
    }

    /* renamed from: j */
    public MapboxMapOptions mo33651j(boolean z) {
        this.f29792v = z;
        return this;
    }

    /* renamed from: k */
    public MapboxMapOptions mo33652k(boolean z) {
        this.f29766A = z;
        return this;
    }

    /* renamed from: l */
    public MapboxMapOptions mo33654l(boolean z) {
        this.f29770E = z;
        return this;
    }

    /* renamed from: m */
    public MapboxMapOptions mo33656m(boolean z) {
        this.f29793w = z;
        return this;
    }

    /* renamed from: n */
    public MapboxMapOptions mo33658n(boolean z) {
        this.f29771F = z;
        return this;
    }

    /* renamed from: o */
    public MapboxMapOptions mo33661o(boolean z) {
        this.f29794x = z;
        return this;
    }

    /* renamed from: p */
    public String mo33662p() {
        return this.f29768C;
    }

    /* renamed from: q */
    public boolean mo33663q() {
        return this.f29782l;
    }

    /* renamed from: r */
    public int mo33664r() {
        return this.f29783m;
    }

    /* renamed from: s */
    public int[] mo33665s() {
        return this.f29784n;
    }

    /* renamed from: t */
    public double mo33666t() {
        return this.f29790t;
    }

    /* renamed from: u */
    public double mo33667u() {
        return this.f29789s;
    }

    /* renamed from: v */
    public boolean mo33668v() {
        return this.f29766A;
    }

    /* renamed from: w */
    public boolean mo33669w() {
        return this.f29796z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f29775e, i);
        parcel.writeByte(this.f29776f ? (byte) 1 : 0);
        parcel.writeByte(this.f29777g ? (byte) 1 : 0);
        parcel.writeInt(this.f29779i);
        parcel.writeIntArray(this.f29780j);
        parcel.writeByte(this.f29778h ? (byte) 1 : 0);
        Drawable drawable = this.f29781k;
        parcel.writeParcelable(drawable != null ? C11594a.m30367a(drawable) : null, i);
        parcel.writeByte(this.f29782l ? (byte) 1 : 0);
        parcel.writeInt(this.f29783m);
        parcel.writeIntArray(this.f29784n);
        parcel.writeByte(this.f29786p ? (byte) 1 : 0);
        parcel.writeInt(this.f29787q);
        parcel.writeIntArray(this.f29788r);
        parcel.writeInt(this.f29785o);
        parcel.writeDouble(this.f29789s);
        parcel.writeDouble(this.f29790t);
        parcel.writeByte(this.f29791u ? (byte) 1 : 0);
        parcel.writeByte(this.f29792v ? (byte) 1 : 0);
        parcel.writeByte(this.f29793w ? (byte) 1 : 0);
        parcel.writeByte(this.f29794x ? (byte) 1 : 0);
        parcel.writeByte(this.f29795y ? (byte) 1 : 0);
        parcel.writeByte(this.f29796z ? (byte) 1 : 0);
        parcel.writeString(this.f29769D);
        parcel.writeByte(this.f29770E ? (byte) 1 : 0);
        parcel.writeByte(this.f29771F ? (byte) 1 : 0);
        parcel.writeByte(this.f29766A ? (byte) 1 : 0);
        parcel.writeByte(this.f29767B ? (byte) 1 : 0);
        parcel.writeString(this.f29768C);
        parcel.writeFloat(this.f29773H);
        parcel.writeInt(this.f29772G);
        parcel.writeByte(this.f29774I ? (byte) 1 : 0);
    }

    /* renamed from: x */
    public boolean mo33671x() {
        return this.f29767B;
    }

    /* renamed from: y */
    public boolean mo33672y() {
        return this.f29791u;
    }

    /* renamed from: z */
    public boolean mo33673z() {
        return this.f29792v;
    }

    public MapboxMapOptions() {
        this.f29777g = true;
        this.f29778h = true;
        this.f29779i = 8388661;
        this.f29782l = true;
        this.f29783m = 8388691;
        this.f29785o = -1;
        this.f29786p = true;
        this.f29787q = 8388691;
        this.f29789s = 0.0d;
        this.f29790t = 25.5d;
        this.f29791u = true;
        this.f29792v = true;
        this.f29793w = true;
        this.f29794x = true;
        this.f29795y = true;
        this.f29796z = true;
        this.f29766A = true;
        this.f29767B = false;
        this.f29768C = "sans-serif";
        this.f29774I = true;
    }

    /* renamed from: b */
    public MapboxMapOptions mo33625b(boolean z) {
        this.f29777g = z;
        return this;
    }

    /* renamed from: c */
    public MapboxMapOptions mo33630c(boolean z) {
        this.f29778h = z;
        return this;
    }

    /* renamed from: d */
    public MapboxMapOptions mo33633d(boolean z) {
        this.f29774I = z;
        return this;
    }

    /* renamed from: e */
    public MapboxMapOptions mo33638e(boolean z) {
        this.f29795y = z;
        return this;
    }

    /* renamed from: f */
    public CameraPosition mo33640f() {
        return this.f29775e;
    }

    /* renamed from: g */
    public boolean mo33643g() {
        return this.f29777g;
    }

    /* renamed from: h */
    public boolean mo33646h() {
        return this.f29778h;
    }

    /* renamed from: i */
    public int mo33648i() {
        return this.f29779i;
    }

    /* renamed from: j */
    public Drawable mo33650j() {
        return this.f29781k;
    }

    /* renamed from: k */
    public int[] mo33653k() {
        return this.f29780j;
    }

    /* renamed from: l */
    public boolean mo33655l() {
        return this.f29774I;
    }

    /* renamed from: m */
    public boolean mo33657m() {
        return this.f29776f;
    }

    /* renamed from: n */
    public boolean mo33659n() {
        return this.f29795y;
    }

    /* renamed from: o */
    public int mo33660o() {
        return this.f29772G;
    }

    /* renamed from: b */
    public MapboxMapOptions mo33626b(int[] iArr) {
        this.f29780j = iArr;
        return this;
    }

    /* renamed from: c */
    public MapboxMapOptions mo33631c(int[] iArr) {
        this.f29784n = iArr;
        return this;
    }

    /* renamed from: d */
    public int[] mo33634d() {
        return this.f29788r;
    }

    /* renamed from: e */
    public int mo33636e() {
        return this.f29785o;
    }

    /* renamed from: b */
    public MapboxMapOptions mo33623b(int i) {
        this.f29785o = i;
        return this;
    }

    /* renamed from: c */
    public int mo33628c() {
        return this.f29787q;
    }

    /* renamed from: b */
    public MapboxMapOptions mo33624b(String str) {
        this.f29768C = str;
        return this;
    }

    /* renamed from: b */
    public boolean mo33627b() {
        return this.f29786p;
    }

    private MapboxMapOptions(Parcel parcel) {
        boolean z = true;
        this.f29777g = true;
        this.f29778h = true;
        this.f29779i = 8388661;
        this.f29782l = true;
        this.f29783m = 8388691;
        this.f29785o = -1;
        this.f29786p = true;
        this.f29787q = 8388691;
        this.f29789s = 0.0d;
        this.f29790t = 25.5d;
        this.f29791u = true;
        this.f29792v = true;
        this.f29793w = true;
        this.f29794x = true;
        this.f29795y = true;
        this.f29796z = true;
        this.f29766A = true;
        this.f29767B = false;
        this.f29768C = "sans-serif";
        this.f29774I = true;
        this.f29775e = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        this.f29776f = parcel.readByte() != 0;
        this.f29777g = parcel.readByte() != 0;
        this.f29779i = parcel.readInt();
        this.f29780j = parcel.createIntArray();
        this.f29778h = parcel.readByte() != 0;
        Bitmap bitmap = (Bitmap) parcel.readParcelable(MapboxMapOptions.class.getClassLoader());
        if (bitmap != null) {
            this.f29781k = new BitmapDrawable(bitmap);
        }
        this.f29782l = parcel.readByte() != 0;
        this.f29783m = parcel.readInt();
        this.f29784n = parcel.createIntArray();
        this.f29786p = parcel.readByte() != 0;
        this.f29787q = parcel.readInt();
        this.f29788r = parcel.createIntArray();
        this.f29785o = parcel.readInt();
        this.f29789s = parcel.readDouble();
        this.f29790t = parcel.readDouble();
        this.f29791u = parcel.readByte() != 0;
        this.f29792v = parcel.readByte() != 0;
        this.f29793w = parcel.readByte() != 0;
        this.f29794x = parcel.readByte() != 0;
        this.f29795y = parcel.readByte() != 0;
        this.f29796z = parcel.readByte() != 0;
        this.f29769D = parcel.readString();
        this.f29770E = parcel.readByte() != 0;
        this.f29771F = parcel.readByte() != 0;
        this.f29766A = parcel.readByte() != 0;
        this.f29767B = parcel.readByte() != 0;
        this.f29768C = parcel.readString();
        this.f29773H = parcel.readFloat();
        this.f29772G = parcel.readInt();
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f29774I = z;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33618a(String str) {
        this.f29769D = str;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33617a(CameraPosition cameraPosition) {
        this.f29775e = cameraPosition;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33613a(double d) {
        this.f29790t = d;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33616a(Drawable drawable) {
        this.f29781k = drawable;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33619a(boolean z) {
        this.f29786p = z;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33615a(int i) {
        this.f29787q = i;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33620a(int[] iArr) {
        this.f29788r = iArr;
        return this;
    }

    /* renamed from: a */
    public MapboxMapOptions mo33614a(float f) {
        this.f29773H = f;
        return this;
    }

    /* renamed from: a */
    public String mo33621a() {
        return this.f29769D;
    }
}
