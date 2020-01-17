package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.i */
public final class C9924i {

    /* renamed from: com.facebook.soloader.i$a */
    private static class C9925a extends RuntimeException {
        C9925a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String[] m24816a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m24817a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: b */
    private static String m24818b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m24821e(fileChannel, byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: c */
    private static int m24819c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m24815a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private static long m24820d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m24815a(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: e */
    private static short m24821e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m24815a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: a */
    public static String[] m24817a(FileChannel fileChannel) throws IOException {
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        FileChannel fileChannel2 = fileChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m24820d(fileChannel2, allocate, 0) == 1179403647) {
            boolean z2 = true;
            if (m24821e(fileChannel2, allocate, 4) != 1) {
                z2 = false;
            }
            if (m24821e(fileChannel2, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                j = m24820d(fileChannel2, allocate, 28);
            } else {
                j = m24814a(fileChannel2, allocate, 32);
            }
            if (z2) {
                j2 = (long) m24819c(fileChannel2, allocate, 44);
            } else {
                j2 = (long) m24819c(fileChannel2, allocate, 56);
            }
            if (z2) {
                i = m24819c(fileChannel2, allocate, 42);
            } else {
                i = m24819c(fileChannel2, allocate, 54);
            }
            if (j2 == 65535) {
                if (z2) {
                    j16 = m24820d(fileChannel2, allocate, 32);
                } else {
                    j16 = m24814a(fileChannel2, allocate, 40);
                }
                if (z2) {
                    j17 = m24820d(fileChannel2, allocate, j16 + 28);
                } else {
                    j17 = m24820d(fileChannel2, allocate, j16 + 44);
                }
                j2 = j17;
            }
            long j18 = j;
            long j19 = 0;
            while (true) {
                if (j19 >= j2) {
                    j3 = 0;
                    break;
                }
                if (z2) {
                    j15 = m24820d(fileChannel2, allocate, j18 + 0);
                } else {
                    j15 = m24820d(fileChannel2, allocate, j18 + 0);
                }
                if (j15 == 2) {
                    j3 = z2 ? m24820d(fileChannel2, allocate, j18 + 4) : m24814a(fileChannel2, allocate, j18 + 8);
                } else {
                    j18 += (long) i;
                    j19++;
                }
            }
            long j20 = 0;
            if (j3 != 0) {
                long j21 = j3;
                long j22 = 0;
                int i2 = 0;
                while (true) {
                    if (z2) {
                        z = z2;
                        j4 = m24820d(fileChannel2, allocate, j21 + j20);
                    } else {
                        z = z2;
                        j4 = m24814a(fileChannel2, allocate, j21 + j20);
                    }
                    String str = "malformed DT_NEEDED section";
                    if (j4 == 1) {
                        j5 = j3;
                        if (i2 != Integer.MAX_VALUE) {
                            i2++;
                        } else {
                            throw new C9925a(str);
                        }
                    } else {
                        j5 = j3;
                        if (j4 == 5) {
                            if (z) {
                                j14 = m24820d(fileChannel2, allocate, j21 + 4);
                            } else {
                                j14 = m24814a(fileChannel2, allocate, j21 + 8);
                            }
                            j22 = j14;
                        }
                    }
                    long j23 = 16;
                    j21 += z ? 8 : 16;
                    j20 = 0;
                    if (j4 != 0) {
                        z2 = z;
                        j3 = j5;
                    } else if (j22 != 0) {
                        int i3 = 0;
                        while (true) {
                            if (((long) i3) >= j2) {
                                j6 = 0;
                                break;
                            }
                            if (z) {
                                j9 = m24820d(fileChannel2, allocate, j + j20);
                            } else {
                                j9 = m24820d(fileChannel2, allocate, j + j20);
                            }
                            if (j9 == 1) {
                                if (z) {
                                    j11 = m24820d(fileChannel2, allocate, j + 8);
                                } else {
                                    j11 = m24814a(fileChannel2, allocate, j + j23);
                                }
                                if (z) {
                                    j10 = j2;
                                    j12 = m24820d(fileChannel2, allocate, j + 20);
                                } else {
                                    j10 = j2;
                                    j12 = m24814a(fileChannel2, allocate, j + 40);
                                }
                                if (j11 <= j22 && j22 < j12 + j11) {
                                    if (z) {
                                        j13 = m24820d(fileChannel2, allocate, j + 4);
                                    } else {
                                        j13 = m24814a(fileChannel2, allocate, j + 8);
                                    }
                                    j6 = j13 + (j22 - j11);
                                }
                            } else {
                                j10 = j2;
                            }
                            j += (long) i;
                            i3++;
                            j2 = j10;
                            j23 = 16;
                            j20 = 0;
                        }
                        long j24 = 0;
                        if (j6 != 0) {
                            String[] strArr = new String[i2];
                            int i4 = 0;
                            while (true) {
                                if (z) {
                                    j7 = m24820d(fileChannel2, allocate, j5 + j24);
                                } else {
                                    j7 = m24814a(fileChannel2, allocate, j5 + j24);
                                }
                                if (j7 == 1) {
                                    if (z) {
                                        j8 = m24820d(fileChannel2, allocate, j5 + 4);
                                    } else {
                                        j8 = m24814a(fileChannel2, allocate, j5 + 8);
                                    }
                                    strArr[i4] = m24818b(fileChannel2, allocate, j8 + j6);
                                    if (i4 != Integer.MAX_VALUE) {
                                        i4++;
                                    } else {
                                        throw new C9925a(str);
                                    }
                                }
                                j5 += z ? 8 : 16;
                                if (j7 != 0) {
                                    j24 = 0;
                                } else if (i4 == strArr.length) {
                                    return strArr;
                                } else {
                                    throw new C9925a(str);
                                }
                            }
                        } else {
                            throw new C9925a("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new C9925a("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new C9925a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C9925a("file is not ELF");
        }
    }

    /* renamed from: a */
    private static void m24815a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0) {
            int read = fileChannel.read(byteBuffer, j);
            if (read == -1) {
                break;
            }
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C9925a("ELF file truncated");
    }

    /* renamed from: a */
    private static long m24814a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        m24815a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }
}
