package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    /* renamed from: A */
    public static long m25531A(Parcel parcel, int i) {
        m25539a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: B */
    public static short m25532B(Parcel parcel, int i) {
        m25539a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: C */
    public static int m25533C(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: D */
    public static void m25534D(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m25533C(parcel, i));
    }

    /* renamed from: a */
    public static int m25535a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m25536a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: b */
    public static int m25542b(Parcel parcel) {
        int a = m25536a(parcel);
        int C = m25533C(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m25535a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new ParseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = C + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static BigInteger m25545c(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + C);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m25547d(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + C);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m25548e(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + C);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m25549f(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + C);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m25550g(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + C);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m25551h(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + C);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m25552i(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + C);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m25553j(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + C);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m25554k(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + C);
        return createIntArray;
    }

    /* renamed from: l */
    public static long[] m25555l(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + C);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m25556m(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, C);
        parcel.setDataPosition(dataPosition + C);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m25557n(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + C);
        return parcelArr;
    }

    /* renamed from: o */
    public static String m25558o(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + C);
        return readString;
    }

    /* renamed from: p */
    public static String[] m25559p(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + C);
        return createStringArray;
    }

    /* renamed from: q */
    public static ArrayList<String> m25560q(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + C);
        return createStringArrayList;
    }

    /* renamed from: r */
    public static void m25561r(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: s */
    public static boolean m25562s(Parcel parcel, int i) {
        m25539a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: t */
    public static byte m25563t(Parcel parcel, int i) {
        m25539a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: u */
    public static double m25564u(Parcel parcel, int i) {
        m25539a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: v */
    public static float m25565v(Parcel parcel, int i) {
        m25539a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: w */
    public static Float m25566w(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        if (C == 0) {
            return null;
        }
        m25540a(parcel, i, C, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: x */
    public static IBinder m25567x(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + C);
        return readStrongBinder;
    }

    /* renamed from: y */
    public static int m25568y(Parcel parcel, int i) {
        m25539a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: z */
    public static Integer m25569z(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        if (C == 0) {
            return null;
        }
        m25540a(parcel, i, C, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: a */
    private static void m25539a(Parcel parcel, int i, int i2) {
        int C = m25533C(parcel, i);
        if (C != i2) {
            String hexString = Integer.toHexString(C);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(C);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m25540a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m25546c(Parcel parcel, int i, Creator<T> creator) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + C);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static BigDecimal m25538a(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + C);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m25544b(Parcel parcel, int i) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + C);
        return bigDecimalArr;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m25537a(Parcel parcel, int i, Creator<T> creator) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + C);
        return t;
    }

    /* renamed from: b */
    public static <T> T[] m25543b(Parcel parcel, int i, Creator<T> creator) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + C);
        return createTypedArray;
    }

    /* renamed from: a */
    public static void m25541a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int C = m25533C(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (C != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + C);
        }
    }
}
