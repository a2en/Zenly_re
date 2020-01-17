package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.f */
public class C9904f {
    /* renamed from: a */
    private static boolean m24751a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static byte m24752b(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: c */
    private static int m24753c(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: d */
    private static short m24754d(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: e */
    public static Pair<Integer, Integer> m24755e(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            inputStream.read(bArr);
            if (!m24751a(bArr, "RIFF")) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
            m24753c(inputStream);
            inputStream.read(bArr);
            if (!m24751a(bArr, "WEBP")) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            }
            inputStream.read(bArr);
            String a = m24750a(bArr);
            if ("VP8 ".equals(a)) {
                Pair<Integer, Integer> f = m24756f(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return f;
            } else if ("VP8L".equals(a)) {
                Pair<Integer, Integer> g = m24757g(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return g;
            } else if ("VP8X".equals(a)) {
                Pair<Integer, Integer> h = m24758h(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return h;
            } else {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* renamed from: f */
    private static Pair<Integer, Integer> m24756f(InputStream inputStream) throws IOException {
        inputStream.skip(7);
        short d = m24754d(inputStream);
        short d2 = m24754d(inputStream);
        short d3 = m24754d(inputStream);
        if (d == 157 && d2 == 1 && d3 == 42) {
            return new Pair<>(Integer.valueOf(m24749a(inputStream)), Integer.valueOf(m24749a(inputStream)));
        }
        return null;
    }

    /* renamed from: g */
    private static Pair<Integer, Integer> m24757g(InputStream inputStream) throws IOException {
        m24753c(inputStream);
        if (m24752b(inputStream) != 47) {
            return null;
        }
        byte read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m24758h(InputStream inputStream) throws IOException {
        inputStream.skip(8);
        return new Pair<>(Integer.valueOf(m24759i(inputStream) + 1), Integer.valueOf(m24759i(inputStream) + 1));
    }

    /* renamed from: i */
    private static int m24759i(InputStream inputStream) throws IOException {
        byte b = m24752b(inputStream);
        return ((m24752b(inputStream) << 16) & 16711680) | ((m24752b(inputStream) << 8) & 65280) | (b & 255);
    }

    /* renamed from: a */
    private static String m24750a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m24749a(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }
}
