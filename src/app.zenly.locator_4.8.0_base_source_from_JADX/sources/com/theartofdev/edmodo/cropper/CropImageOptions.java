package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theartofdev.edmodo.cropper.CropImageView.C11924c;
import com.theartofdev.edmodo.cropper.CropImageView.C11925d;
import com.theartofdev.edmodo.cropper.CropImageView.C11926e;
import com.theartofdev.edmodo.cropper.CropImageView.C11927f;

public class CropImageOptions implements Parcelable {
    public static final Creator<CropImageOptions> CREATOR = new C11921a();

    /* renamed from: A */
    public int f30896A;

    /* renamed from: B */
    public int f30897B;

    /* renamed from: C */
    public int f30898C;

    /* renamed from: D */
    public int f30899D;

    /* renamed from: E */
    public int f30900E;

    /* renamed from: F */
    public int f30901F;

    /* renamed from: G */
    public int f30902G;

    /* renamed from: H */
    public CharSequence f30903H;

    /* renamed from: I */
    public int f30904I;

    /* renamed from: J */
    public Uri f30905J;

    /* renamed from: K */
    public CompressFormat f30906K;

    /* renamed from: L */
    public int f30907L;

    /* renamed from: M */
    public int f30908M;

    /* renamed from: N */
    public int f30909N;

    /* renamed from: O */
    public C11926e f30910O;

    /* renamed from: P */
    public boolean f30911P;

    /* renamed from: Q */
    public Rect f30912Q;

    /* renamed from: R */
    public int f30913R;

    /* renamed from: S */
    public boolean f30914S;

    /* renamed from: T */
    public boolean f30915T;

    /* renamed from: U */
    public boolean f30916U;

    /* renamed from: V */
    public int f30917V;

    /* renamed from: W */
    public boolean f30918W;

    /* renamed from: X */
    public boolean f30919X;

    /* renamed from: Y */
    public CharSequence f30920Y;

    /* renamed from: Z */
    public int f30921Z;

    /* renamed from: e */
    public C11924c f30922e;

    /* renamed from: f */
    public float f30923f;

    /* renamed from: g */
    public float f30924g;

    /* renamed from: h */
    public C11925d f30925h;

    /* renamed from: i */
    public C11927f f30926i;

    /* renamed from: j */
    public boolean f30927j;

    /* renamed from: k */
    public boolean f30928k;

    /* renamed from: l */
    public boolean f30929l;

    /* renamed from: m */
    public boolean f30930m;

    /* renamed from: n */
    public int f30931n;

    /* renamed from: o */
    public float f30932o;

    /* renamed from: p */
    public boolean f30933p;

    /* renamed from: q */
    public int f30934q;

    /* renamed from: r */
    public int f30935r;

    /* renamed from: s */
    public float f30936s;

    /* renamed from: t */
    public int f30937t;

    /* renamed from: u */
    public float f30938u;

    /* renamed from: v */
    public float f30939v;

    /* renamed from: w */
    public float f30940w;

    /* renamed from: x */
    public int f30941x;

    /* renamed from: y */
    public float f30942y;

    /* renamed from: z */
    public int f30943z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageOptions$a */
    static class C11921a implements Creator<CropImageOptions> {
        C11921a() {
        }

        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f30922e = C11924c.RECTANGLE;
        this.f30923f = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f30924g = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f30925h = C11925d.ON_TOUCH;
        this.f30926i = C11927f.FIT_CENTER;
        this.f30927j = true;
        this.f30928k = true;
        this.f30929l = true;
        this.f30930m = false;
        this.f30931n = 4;
        this.f30932o = 0.1f;
        this.f30933p = false;
        this.f30934q = 1;
        this.f30935r = 1;
        this.f30936s = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f30937t = Color.argb(170, 255, 255, 255);
        this.f30938u = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f30939v = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f30940w = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f30941x = -1;
        this.f30942y = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f30943z = Color.argb(170, 255, 255, 255);
        this.f30896A = Color.argb(119, 0, 0, 0);
        this.f30897B = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f30898C = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f30899D = 40;
        this.f30900E = 40;
        this.f30901F = 99999;
        this.f30902G = 99999;
        this.f30903H = "";
        this.f30904I = 0;
        this.f30905J = Uri.EMPTY;
        this.f30906K = CompressFormat.JPEG;
        this.f30907L = 90;
        this.f30908M = 0;
        this.f30909N = 0;
        this.f30910O = C11926e.NONE;
        this.f30911P = false;
        this.f30912Q = null;
        this.f30913R = -1;
        this.f30914S = true;
        this.f30915T = true;
        this.f30916U = false;
        this.f30917V = 90;
        this.f30918W = false;
        this.f30919X = false;
        this.f30920Y = null;
        this.f30921Z = 0;
    }

    /* renamed from: a */
    public void mo35326a() {
        if (this.f30931n < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.f30924g >= 0.0f) {
            float f = this.f30932o;
            if (f < 0.0f || ((double) f) >= 0.5d) {
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            }
            String str = "Cannot set aspect ratio value to a number less than or equal to 0.";
            if (this.f30934q <= 0) {
                throw new IllegalArgumentException(str);
            } else if (this.f30935r <= 0) {
                throw new IllegalArgumentException(str);
            } else if (this.f30936s < 0.0f) {
                throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            } else if (this.f30938u < 0.0f) {
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
            } else if (this.f30942y < 0.0f) {
                throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
            } else if (this.f30898C >= 0) {
                int i = this.f30899D;
                if (i >= 0) {
                    int i2 = this.f30900E;
                    if (i2 < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.f30901F < i) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.f30902G < i2) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.f30908M < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.f30909N >= 0) {
                        int i3 = this.f30917V;
                        if (i3 < 0 || i3 > 360) {
                            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                }
            } else {
                throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
            }
        } else {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30922e.ordinal());
        parcel.writeFloat(this.f30923f);
        parcel.writeFloat(this.f30924g);
        parcel.writeInt(this.f30925h.ordinal());
        parcel.writeInt(this.f30926i.ordinal());
        parcel.writeByte(this.f30927j ? (byte) 1 : 0);
        parcel.writeByte(this.f30928k ? (byte) 1 : 0);
        parcel.writeByte(this.f30929l ? (byte) 1 : 0);
        parcel.writeByte(this.f30930m ? (byte) 1 : 0);
        parcel.writeInt(this.f30931n);
        parcel.writeFloat(this.f30932o);
        parcel.writeByte(this.f30933p ? (byte) 1 : 0);
        parcel.writeInt(this.f30934q);
        parcel.writeInt(this.f30935r);
        parcel.writeFloat(this.f30936s);
        parcel.writeInt(this.f30937t);
        parcel.writeFloat(this.f30938u);
        parcel.writeFloat(this.f30939v);
        parcel.writeFloat(this.f30940w);
        parcel.writeInt(this.f30941x);
        parcel.writeFloat(this.f30942y);
        parcel.writeInt(this.f30943z);
        parcel.writeInt(this.f30896A);
        parcel.writeInt(this.f30897B);
        parcel.writeInt(this.f30898C);
        parcel.writeInt(this.f30899D);
        parcel.writeInt(this.f30900E);
        parcel.writeInt(this.f30901F);
        parcel.writeInt(this.f30902G);
        TextUtils.writeToParcel(this.f30903H, parcel, i);
        parcel.writeInt(this.f30904I);
        parcel.writeParcelable(this.f30905J, i);
        parcel.writeString(this.f30906K.name());
        parcel.writeInt(this.f30907L);
        parcel.writeInt(this.f30908M);
        parcel.writeInt(this.f30909N);
        parcel.writeInt(this.f30910O.ordinal());
        parcel.writeInt(this.f30911P ? 1 : 0);
        parcel.writeParcelable(this.f30912Q, i);
        parcel.writeInt(this.f30913R);
        parcel.writeByte(this.f30914S ? (byte) 1 : 0);
        parcel.writeByte(this.f30915T ? (byte) 1 : 0);
        parcel.writeByte(this.f30916U ? (byte) 1 : 0);
        parcel.writeInt(this.f30917V);
        parcel.writeByte(this.f30918W ? (byte) 1 : 0);
        parcel.writeByte(this.f30919X ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f30920Y, parcel, i);
        parcel.writeInt(this.f30921Z);
    }

    protected CropImageOptions(Parcel parcel) {
        this.f30922e = C11924c.values()[parcel.readInt()];
        this.f30923f = parcel.readFloat();
        this.f30924g = parcel.readFloat();
        this.f30925h = C11925d.values()[parcel.readInt()];
        this.f30926i = C11927f.values()[parcel.readInt()];
        boolean z = true;
        this.f30927j = parcel.readByte() != 0;
        this.f30928k = parcel.readByte() != 0;
        this.f30929l = parcel.readByte() != 0;
        this.f30930m = parcel.readByte() != 0;
        this.f30931n = parcel.readInt();
        this.f30932o = parcel.readFloat();
        this.f30933p = parcel.readByte() != 0;
        this.f30934q = parcel.readInt();
        this.f30935r = parcel.readInt();
        this.f30936s = parcel.readFloat();
        this.f30937t = parcel.readInt();
        this.f30938u = parcel.readFloat();
        this.f30939v = parcel.readFloat();
        this.f30940w = parcel.readFloat();
        this.f30941x = parcel.readInt();
        this.f30942y = parcel.readFloat();
        this.f30943z = parcel.readInt();
        this.f30896A = parcel.readInt();
        this.f30897B = parcel.readInt();
        this.f30898C = parcel.readInt();
        this.f30899D = parcel.readInt();
        this.f30900E = parcel.readInt();
        this.f30901F = parcel.readInt();
        this.f30902G = parcel.readInt();
        this.f30903H = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f30904I = parcel.readInt();
        this.f30905J = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f30906K = CompressFormat.valueOf(parcel.readString());
        this.f30907L = parcel.readInt();
        this.f30908M = parcel.readInt();
        this.f30909N = parcel.readInt();
        this.f30910O = C11926e.values()[parcel.readInt()];
        this.f30911P = parcel.readByte() != 0;
        this.f30912Q = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f30913R = parcel.readInt();
        this.f30914S = parcel.readByte() != 0;
        this.f30915T = parcel.readByte() != 0;
        this.f30916U = parcel.readByte() != 0;
        this.f30917V = parcel.readInt();
        this.f30918W = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f30919X = z;
        this.f30920Y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f30921Z = parcel.readInt();
    }
}
