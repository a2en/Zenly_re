package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C10134a {
    /* renamed from: a */
    public static int m25570a(Parcel parcel) {
        return m25593b(parcel, 20293);
    }

    /* renamed from: b */
    private static void m25594b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: c */
    private static void m25596c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static void m25571a(Parcel parcel, int i) {
        m25596c(parcel, i);
    }

    /* renamed from: a */
    public static void m25586a(Parcel parcel, int i, boolean z) {
        m25594b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    private static int m25593b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: a */
    public static void m25572a(Parcel parcel, int i, byte b) {
        m25594b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m25597c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m25592a(parcel, (T) parcelable, 0);
            }
        }
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25585a(Parcel parcel, int i, short s) {
        m25594b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: b */
    public static void m25595b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeStringList(list);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25575a(Parcel parcel, int i, int i2) {
        m25594b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m25582a(Parcel parcel, int i, Integer num, boolean z) {
        if (num == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        m25594b(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    /* renamed from: a */
    public static void m25576a(Parcel parcel, int i, long j) {
        m25594b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m25574a(Parcel parcel, int i, float f) {
        m25594b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m25581a(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        m25594b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    /* renamed from: a */
    public static void m25573a(Parcel parcel, int i, double d) {
        m25594b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m25583a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeString(str);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25578a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25580a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25577a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeBundle(bundle);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25587a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeByteArray(bArr);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25591a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeInt(r5);
        for (byte[] writeByteArray : bArr) {
            parcel.writeByteArray(writeByteArray);
        }
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25588a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeIntArray(iArr);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25590a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeStringArray(strArr);
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m25589a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeInt(r7);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m25592a(parcel, t, i2);
            }
        }
        m25596c(parcel, b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m25592a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m25579a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        m25596c(parcel, b);
    }

    /* renamed from: a */
    public static void m25584a(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m25594b(parcel, i, 0);
            }
            return;
        }
        int b = m25593b(parcel, i);
        parcel.writeList(list);
        m25596c(parcel, b);
    }
}
