package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzc;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class zzsq<T> implements zzsz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zztx.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzsm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzsr zzo;
    private final zzrv zzp;
    private final zztr<?, ?> zzq;
    private final zzqr<?> zzr;
    private final zzsf zzs;

    private zzsq(int[] iArr, Object[] objArr, int i, int i2, zzsm zzsm, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzsr zzsr, zzrv zzrv, zztr<?, ?> zztr, zzqr<?> zzqr, zzsf zzsf) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzsm instanceof zzrb;
        this.zzj = z;
        this.zzh = zzqr != null && zzqr.zza(zzsm);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzsr;
        this.zzp = zzrv;
        this.zzq = zztr;
        this.zzr = zzqr;
        this.zzg = zzsm;
        this.zzs = zzsf;
    }

    static <T> zzsq<T> zza(Class<T> cls, zzsk zzsk, zzsr zzsr, zzrv zzrv, zztr<?, ?> zztr, zzqr<?> zzqr, zzsf zzsf) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Class cls2;
        int i17;
        int i18;
        Field field;
        int i19;
        char charAt;
        int i20;
        char c2;
        Field field2;
        Field field3;
        int i21;
        char charAt2;
        int i22;
        char charAt3;
        int i23;
        char charAt4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        char charAt5;
        int i30;
        char charAt6;
        int i31;
        char charAt7;
        int i32;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        char charAt14;
        zzsk zzsk2 = zzsk;
        if (zzsk2 instanceof zzta) {
            zzta zzta = (zzta) zzsk2;
            char c3 = 0;
            boolean z = zzta.zza() == zzc.zzi;
            String zzd2 = zzta.zzd();
            int length = zzd2.length();
            char charAt15 = zzd2.charAt(0);
            if (charAt15 >= 55296) {
                char c4 = charAt15 & 8191;
                int i33 = 1;
                int i34 = 13;
                while (true) {
                    i = i33 + 1;
                    charAt14 = zzd2.charAt(i33);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c4 |= (charAt14 & 8191) << i34;
                    i34 += 13;
                    i33 = i;
                }
                charAt15 = (charAt14 << i34) | c4;
            } else {
                i = 1;
            }
            int i35 = i + 1;
            char charAt16 = zzd2.charAt(i);
            if (charAt16 >= 55296) {
                char c5 = charAt16 & 8191;
                int i36 = 13;
                while (true) {
                    i2 = i35 + 1;
                    charAt13 = zzd2.charAt(i35);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c5 |= (charAt13 & 8191) << i36;
                    i36 += 13;
                    i35 = i2;
                }
                charAt16 = c5 | (charAt13 << i36);
            } else {
                i2 = i35;
            }
            if (charAt16 == 0) {
                iArr = zza;
                c = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int i37 = i2 + 1;
                int charAt17 = zzd2.charAt(i2);
                if (charAt17 >= 55296) {
                    int i38 = charAt17 & 8191;
                    int i39 = 13;
                    while (true) {
                        i24 = i37 + 1;
                        charAt12 = zzd2.charAt(i37);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i38 |= (charAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i24;
                    }
                    charAt17 = (charAt12 << i39) | i38;
                } else {
                    i24 = i37;
                }
                int i40 = i24 + 1;
                char charAt18 = zzd2.charAt(i24);
                if (charAt18 >= 55296) {
                    char c6 = charAt18 & 8191;
                    int i41 = 13;
                    while (true) {
                        i25 = i40 + 1;
                        charAt11 = zzd2.charAt(i40);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c6 |= (charAt11 & 8191) << i41;
                        i41 += 13;
                        i40 = i25;
                    }
                    charAt18 = c6 | (charAt11 << i41);
                } else {
                    i25 = i40;
                }
                int i42 = i25 + 1;
                int charAt19 = zzd2.charAt(i25);
                if (charAt19 >= 55296) {
                    int i43 = charAt19 & 8191;
                    int i44 = 13;
                    while (true) {
                        i26 = i42 + 1;
                        charAt10 = zzd2.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i26;
                    }
                    charAt19 = (charAt10 << i44) | i43;
                } else {
                    i26 = i42;
                }
                int i45 = i26 + 1;
                i5 = zzd2.charAt(i26);
                if (i5 >= 55296) {
                    int i46 = i5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i27 = i45 + 1;
                        charAt9 = zzd2.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i27;
                    }
                    i5 = (charAt9 << i47) | i46;
                } else {
                    i27 = i45;
                }
                int i48 = i27 + 1;
                i4 = zzd2.charAt(i27);
                if (i4 >= 55296) {
                    int i49 = i4 & 8191;
                    int i50 = 13;
                    while (true) {
                        i32 = i48 + 1;
                        charAt8 = zzd2.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i32;
                    }
                    i4 = (charAt8 << i50) | i49;
                    i48 = i32;
                }
                int i51 = i48 + 1;
                c = zzd2.charAt(i48);
                if (c >= 55296) {
                    char c7 = c & 8191;
                    int i52 = 13;
                    while (true) {
                        i31 = i51 + 1;
                        charAt7 = zzd2.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c7 |= (charAt7 & 8191) << i52;
                        i52 += 13;
                        i51 = i31;
                    }
                    c = c7 | (charAt7 << i52);
                    i51 = i31;
                }
                int i53 = i51 + 1;
                char charAt20 = zzd2.charAt(i51);
                if (charAt20 >= 55296) {
                    int i54 = 13;
                    int i55 = i53;
                    int i56 = charAt20 & 8191;
                    int i57 = i55;
                    while (true) {
                        i30 = i57 + 1;
                        charAt6 = zzd2.charAt(i57);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i56 |= (charAt6 & 8191) << i54;
                        i54 += 13;
                        i57 = i30;
                    }
                    charAt20 = i56 | (charAt6 << i54);
                    i28 = i30;
                } else {
                    i28 = i53;
                }
                int i58 = i28 + 1;
                c3 = zzd2.charAt(i28);
                if (c3 >= 55296) {
                    int i59 = 13;
                    int i60 = i58;
                    int i61 = c3 & 8191;
                    int i62 = i60;
                    while (true) {
                        i29 = i62 + 1;
                        charAt5 = zzd2.charAt(i62);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i61 |= (charAt5 & 8191) << i59;
                        i59 += 13;
                        i62 = i29;
                    }
                    c3 = i61 | (charAt5 << i59);
                    i58 = i29;
                }
                iArr = new int[(c3 + c + charAt20)];
                i6 = (charAt17 << 1) + charAt18;
                int i63 = i58;
                i3 = charAt17;
                i7 = charAt19;
                i2 = i63;
            }
            Unsafe unsafe = zzb;
            Object[] zze2 = zzta.zze();
            Class cls3 = zzta.zzc().getClass();
            int i64 = i6;
            int[] iArr2 = new int[(i4 * 3)];
            Object[] objArr = new Object[(i4 << 1)];
            int i65 = c3 + c;
            int i66 = c3;
            int i67 = i65;
            int i68 = 0;
            int i69 = 0;
            while (i2 < length) {
                int i70 = i2 + 1;
                int charAt21 = zzd2.charAt(i2);
                char c8 = 55296;
                if (charAt21 >= 55296) {
                    int i71 = 13;
                    int i72 = i70;
                    int i73 = charAt21 & 8191;
                    int i74 = i72;
                    while (true) {
                        i23 = i74 + 1;
                        charAt4 = zzd2.charAt(i74);
                        if (charAt4 < c8) {
                            break;
                        }
                        i73 |= (charAt4 & 8191) << i71;
                        i71 += 13;
                        i74 = i23;
                        c8 = 55296;
                    }
                    charAt21 = i73 | (charAt4 << i71);
                    i8 = i23;
                } else {
                    i8 = i70;
                }
                int i75 = i8 + 1;
                char charAt22 = zzd2.charAt(i8);
                int i76 = length;
                char c9 = 55296;
                if (charAt22 >= 55296) {
                    int i77 = 13;
                    int i78 = i75;
                    int i79 = charAt22 & 8191;
                    int i80 = i78;
                    while (true) {
                        i22 = i80 + 1;
                        charAt3 = zzd2.charAt(i80);
                        if (charAt3 < c9) {
                            break;
                        }
                        i79 |= (charAt3 & 8191) << i77;
                        i77 += 13;
                        i80 = i22;
                        c9 = 55296;
                    }
                    charAt22 = i79 | (charAt3 << i77);
                    i9 = i22;
                } else {
                    i9 = i75;
                }
                int i81 = c3;
                char c10 = charAt22 & 255;
                boolean z2 = z;
                if ((charAt22 & 1024) != 0) {
                    int i82 = i68 + 1;
                    iArr[i68] = i69;
                    i68 = i82;
                }
                int i83 = i68;
                if (c10 >= '3') {
                    int i84 = i9 + 1;
                    char charAt23 = zzd2.charAt(i9);
                    char c11 = 55296;
                    if (charAt23 >= 55296) {
                        char c12 = charAt23 & 8191;
                        int i85 = 13;
                        while (true) {
                            i21 = i84 + 1;
                            charAt2 = zzd2.charAt(i84);
                            if (charAt2 < c11) {
                                break;
                            }
                            c12 |= (charAt2 & 8191) << i85;
                            i85 += 13;
                            i84 = i21;
                            c11 = 55296;
                        }
                        charAt23 = c12 | (charAt2 << i85);
                        i84 = i21;
                    }
                    int i86 = c10 - '3';
                    int i87 = i84;
                    if (i86 == 9 || i86 == 17) {
                        c2 = 1;
                        int i88 = i64 + 1;
                        objArr[((i69 / 3) << 1) + 1] = zze2[i64];
                        i64 = i88;
                    } else {
                        if (i86 == 12 && (charAt15 & 1) == 1) {
                            int i89 = i64 + 1;
                            objArr[((i69 / 3) << 1) + 1] = zze2[i64];
                            i64 = i89;
                        }
                        c2 = 1;
                    }
                    int i90 = charAt23 << c2;
                    Object obj = zze2[i90];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zza(cls3, (String) obj);
                        zze2[i90] = field2;
                    }
                    int i91 = i7;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    int i92 = i90 + 1;
                    Object obj2 = zze2[i92];
                    int i93 = objectFieldOffset;
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zza(cls3, (String) obj2);
                        zze2[i92] = field3;
                    }
                    str = zzd2;
                    i15 = (int) unsafe.objectFieldOffset(field3);
                    cls2 = cls3;
                    i11 = i64;
                    i14 = i93;
                    i16 = 0;
                    i10 = i91;
                    i12 = i5;
                    i13 = charAt21;
                    i18 = i87;
                } else {
                    int i94 = i7;
                    int i95 = i64 + 1;
                    Field zza2 = zza(cls3, (String) zze2[i64]);
                    i12 = i5;
                    if (c10 == 9 || c10 == 17) {
                        i10 = i94;
                        objArr[((i69 / 3) << 1) + 1] = zza2.getType();
                    } else {
                        if (c10 == 27 || c10 == '1') {
                            i10 = i94;
                            i20 = i95 + 1;
                            objArr[((i69 / 3) << 1) + 1] = zze2[i95];
                        } else if (c10 == 12 || c10 == 30 || c10 == ',') {
                            i10 = i94;
                            if ((charAt15 & 1) == 1) {
                                i20 = i95 + 1;
                                objArr[((i69 / 3) << 1) + 1] = zze2[i95];
                            }
                        } else if (c10 == '2') {
                            int i96 = i66 + 1;
                            iArr[i66] = i69;
                            int i97 = (i69 / 3) << 1;
                            int i98 = i95 + 1;
                            objArr[i97] = zze2[i95];
                            if ((charAt22 & 2048) != 0) {
                                i95 = i98 + 1;
                                objArr[i97 + 1] = zze2[i98];
                                i10 = i94;
                                i66 = i96;
                            } else {
                                i66 = i96;
                                i95 = i98;
                                i10 = i94;
                            }
                        } else {
                            i10 = i94;
                        }
                        i13 = charAt21;
                        i95 = i20;
                        i14 = (int) unsafe.objectFieldOffset(zza2);
                        if ((charAt15 & 1) == 1 || c10 > 17) {
                            str = zzd2;
                            cls2 = cls3;
                            i11 = i95;
                            i17 = i9;
                            i16 = 0;
                            i15 = 0;
                        } else {
                            i17 = i9 + 1;
                            char charAt24 = zzd2.charAt(i9);
                            if (charAt24 >= 55296) {
                                char c13 = charAt24 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i19 = i17 + 1;
                                    charAt = zzd2.charAt(i17);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    c13 |= (charAt & 8191) << i99;
                                    i99 += 13;
                                    i17 = i19;
                                }
                                charAt24 = c13 | (charAt << i99);
                                i17 = i19;
                            }
                            int i100 = (i3 << 1) + (charAt24 / ' ');
                            Object obj3 = zze2[i100];
                            str = zzd2;
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = zza(cls3, (String) obj3);
                                zze2[i100] = field;
                            }
                            cls2 = cls3;
                            i11 = i95;
                            i15 = (int) unsafe.objectFieldOffset(field);
                            i16 = charAt24 % ' ';
                        }
                        if (c10 >= 18 && c10 <= '1') {
                            int i101 = i67 + 1;
                            iArr[i67] = i14;
                            i67 = i101;
                        }
                        i18 = i17;
                    }
                    i13 = charAt21;
                    i14 = (int) unsafe.objectFieldOffset(zza2);
                    if ((charAt15 & 1) == 1) {
                    }
                    str = zzd2;
                    cls2 = cls3;
                    i11 = i95;
                    i17 = i9;
                    i16 = 0;
                    i15 = 0;
                    int i1012 = i67 + 1;
                    iArr[i67] = i14;
                    i67 = i1012;
                    i18 = i17;
                }
                int i102 = i69 + 1;
                iArr2[i69] = i13;
                int i103 = i102 + 1;
                iArr2[i102] = (c10 << 20) | ((charAt22 & 256) != 0 ? 268435456 : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | i14;
                i69 = i103 + 1;
                iArr2[i103] = (i16 << 20) | i15;
                cls3 = cls2;
                i5 = i12;
                c3 = i81;
                i64 = i11;
                length = i76;
                z = z2;
                i7 = i10;
                i68 = i83;
                zzd2 = str;
            }
            boolean z3 = z;
            zzsq zzsq = new zzsq(iArr2, objArr, i7, i5, zzta.zzc(), z, false, iArr, c3, i65, zzsr, zzrv, zztr, zzqr, zzsf);
            return zzsq;
        }
        int zza3 = ((zzto) zzsk2).zza();
        int i104 = zzc.zzi;
        throw new NoSuchMethodError();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zztx.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zztx.zzf(t, j)).booleanValue();
    }

    public final void zzb(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzc2 = zzc(i);
                long j = (long) (1048575 & zzc2);
                int i2 = this.zzc[i];
                switch ((zzc2 & 267386880) >>> 20) {
                    case 0:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zze(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 1:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzd(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 2:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 3:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 4:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 5:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 6:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 7:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzc(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 8:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzf(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 9:
                        zza(t, t2, i);
                        break;
                    case 10:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzf(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 11:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 12:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 13:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 14:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 15:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 16:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 17:
                        zza(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzp.zza(t, t2, j);
                        break;
                    case 50:
                        zztb.zza(this.zzs, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzf(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 60:
                        zzb(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zztx.zza((Object) t, j, zztx.zzf(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 68:
                        zzb(t, t2, i);
                        break;
                }
            }
            if (!this.zzj) {
                zztb.zza(this.zzq, t, t2);
                if (this.zzh) {
                    zztb.zza(this.zzr, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    public final boolean zzc(T t) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.zzm) {
                return !this.zzh || this.zzr.zza((Object) t).zzf();
            }
            int i5 = this.zzl[i2];
            int i6 = this.zzc[i5];
            int zzc2 = zzc(i5);
            if (!this.zzj) {
                int i7 = this.zzc[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = zzb.getInt(t, (long) i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & zzc2) != 0) && !zza(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzc2) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza(t, i6, i5) && !zza((Object) t, zzc2, zza(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map zza2 = this.zzs.zza(zztx.zzf(t, (long) (zzc2 & 1048575)));
                            if (!zza2.isEmpty()) {
                                if (this.zzs.zzc(zzb(i5)).zzb.zza() == zzum.MESSAGE) {
                                    zzsz zzsz = null;
                                    Iterator it = zza2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzsz == null) {
                                            zzsz = zzsy.zza().zza(next.getClass());
                                        }
                                        if (!zzsz.zzc(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zztx.zzf(t, (long) (zzc2 & 1048575));
                if (!list.isEmpty()) {
                    zzsz zza3 = zza(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zza3.zzc(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza(t, i5, i4, i) && !zza((Object) t, zzc2, zza(i5))) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0834, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0900, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0915, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x095a, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a0b, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a2e, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzd(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.zzj
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = zzb
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.zzc
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.zzc(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.zzc
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.libraries.places.internal.zzqx r14 = com.google.android.libraries.places.internal.zzqx.DOUBLE_LIST_PACKED
            int r14 = r14.zza()
            if (r15 < r14) goto L_0x0041
            com.google.android.libraries.places.internal.zzqx r14 = com.google.android.libraries.places.internal.zzqx.SINT64_LIST_PACKED
            int r14 = r14.zza()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.zzc
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            com.google.android.libraries.places.internal.zzsm r5 = (com.google.android.libraries.places.internal.zzsm) r5
            com.google.android.libraries.places.internal.zzsz r6 = r0.zza(r12)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzc(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = zze(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzf(r3, r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzh(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzh(r3, r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzj(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzk(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzg(r3, r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            com.google.android.libraries.places.internal.zzqa r5 = (com.google.android.libraries.places.internal.zzqa) r5
            int r3 = com.google.android.libraries.places.internal.zzqn.zzc(r3, r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            com.google.android.libraries.places.internal.zzsz r6 = r0.zza(r12)
            int r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r5, r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            boolean r6 = r5 instanceof com.google.android.libraries.places.internal.zzqa
            if (r6 == 0) goto L_0x00f1
            com.google.android.libraries.places.internal.zzqa r5 = (com.google.android.libraries.places.internal.zzqa) r5
            int r3 = com.google.android.libraries.places.internal.zzqn.zzc(r3, r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r8)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzi(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzg(r3, r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzf(r3, r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = zze(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3, r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.zza((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = zze(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzd(r3, r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.zza((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.libraries.places.internal.zzsf r14 = r0.zzs
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            java.lang.Object r6 = r0.zzb(r12)
            int r3 = r14.zza(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = zza(r1, r5)
            com.google.android.libraries.places.internal.zzsz r6 = r0.zza(r12)
            int r3 = com.google.android.libraries.places.internal.zztb.zzb(r3, r5, r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzc(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzg(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzi(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzh(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzd(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzf(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzj(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzh(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzi(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zze(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzb(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zza(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzh(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.libraries.places.internal.zztb.zzi(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3)
            int r6 = com.google.android.libraries.places.internal.zzqn.zzg(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzc(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzg(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzi(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzh(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzd(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzf(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzb(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = zza(r1, r5)
            com.google.android.libraries.places.internal.zzsz r6 = r0.zza(r12)
            int r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r5, r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzj(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzh(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzi(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zze(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzb(r3, r5, r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzh(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zztb.zzi(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            com.google.android.libraries.places.internal.zzsm r5 = (com.google.android.libraries.places.internal.zzsm) r5
            com.google.android.libraries.places.internal.zzsz r6 = r0.zza(r12)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzc(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.libraries.places.internal.zztx.zzb(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzf(r3, r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzh(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzh(r3, r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzj(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzk(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzg(r3, r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            com.google.android.libraries.places.internal.zzqa r5 = (com.google.android.libraries.places.internal.zzqa) r5
            int r3 = com.google.android.libraries.places.internal.zzqn.zzc(r3, r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            com.google.android.libraries.places.internal.zzsz r6 = r0.zza(r12)
            int r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r5, r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r1, r5)
            boolean r6 = r5 instanceof com.google.android.libraries.places.internal.zzqa
            if (r6 == 0) goto L_0x046e
            com.google.android.libraries.places.internal.zzqa r5 = (com.google.android.libraries.places.internal.zzqa) r5
            int r3 = com.google.android.libraries.places.internal.zzqn.zzc(r3, r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r8)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzi(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzg(r3, r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzf(r3, r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.libraries.places.internal.zztx.zzb(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zze(r3, r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.zza((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.libraries.places.internal.zztx.zzb(r1, r5)
            int r3 = com.google.android.libraries.places.internal.zzqn.zzd(r3, r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.zza((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.libraries.places.internal.zzqn.zzb(r3, r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.libraries.places.internal.zztr<?, ?> r2 = r0.zzq
            int r1 = zza(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = zzb
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x04f9:
            int[] r13 = r0.zzc
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0a39
            int r13 = r0.zzc(r3)
            int[] r14 = r0.zzc
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0525
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r18 = r11 >>> 20
            int r18 = r8 << r18
            if (r14 == r6) goto L_0x0522
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            goto L_0x0523
        L_0x0522:
            r14 = r6
        L_0x0523:
            r6 = r14
            goto L_0x0545
        L_0x0525:
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x0542
            com.google.android.libraries.places.internal.zzqx r8 = com.google.android.libraries.places.internal.zzqx.DOUBLE_LIST_PACKED
            int r8 = r8.zza()
            if (r4 < r8) goto L_0x0542
            com.google.android.libraries.places.internal.zzqx r8 = com.google.android.libraries.places.internal.zzqx.SINT64_LIST_PACKED
            int r8 = r8.zza()
            if (r4 > r8) goto L_0x0542
            int[] r8 = r0.zzc
            int r9 = r3 + 2
            r8 = r8[r9]
            r11 = r8 & r7
            goto L_0x0543
        L_0x0542:
            r11 = 0
        L_0x0543:
            r18 = 0
        L_0x0545:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0a1e;
                case 1: goto L_0x0a0d;
                case 2: goto L_0x09fb;
                case 3: goto L_0x09ea;
                case 4: goto L_0x09d9;
                case 5: goto L_0x09cc;
                case 6: goto L_0x09bf;
                case 7: goto L_0x09b3;
                case 8: goto L_0x0997;
                case 9: goto L_0x0985;
                case 10: goto L_0x0976;
                case 11: goto L_0x0969;
                case 12: goto L_0x095c;
                case 13: goto L_0x0951;
                case 14: goto L_0x0946;
                case 15: goto L_0x0939;
                case 16: goto L_0x092c;
                case 17: goto L_0x0919;
                case 18: goto L_0x0905;
                case 19: goto L_0x08f5;
                case 20: goto L_0x08e9;
                case 21: goto L_0x08dd;
                case 22: goto L_0x08d1;
                case 23: goto L_0x08c5;
                case 24: goto L_0x08b9;
                case 25: goto L_0x08ad;
                case 26: goto L_0x08a2;
                case 27: goto L_0x0892;
                case 28: goto L_0x0886;
                case 29: goto L_0x0879;
                case 30: goto L_0x086c;
                case 31: goto L_0x085f;
                case 32: goto L_0x0852;
                case 33: goto L_0x0845;
                case 34: goto L_0x0838;
                case 35: goto L_0x0818;
                case 36: goto L_0x07fb;
                case 37: goto L_0x07de;
                case 38: goto L_0x07c1;
                case 39: goto L_0x07a3;
                case 40: goto L_0x0785;
                case 41: goto L_0x0767;
                case 42: goto L_0x0749;
                case 43: goto L_0x072b;
                case 44: goto L_0x070d;
                case 45: goto L_0x06ef;
                case 46: goto L_0x06d1;
                case 47: goto L_0x06b3;
                case 48: goto L_0x0695;
                case 49: goto L_0x0685;
                case 50: goto L_0x0675;
                case 51: goto L_0x0667;
                case 52: goto L_0x065a;
                case 53: goto L_0x064a;
                case 54: goto L_0x063a;
                case 55: goto L_0x062a;
                case 56: goto L_0x061c;
                case 57: goto L_0x060f;
                case 58: goto L_0x0602;
                case 59: goto L_0x05e4;
                case 60: goto L_0x05d0;
                case 61: goto L_0x05be;
                case 62: goto L_0x05ae;
                case 63: goto L_0x059e;
                case 64: goto L_0x0591;
                case 65: goto L_0x0583;
                case 66: goto L_0x0573;
                case 67: goto L_0x0563;
                case 68: goto L_0x054d;
                default: goto L_0x054b;
            }
        L_0x054b:
            goto L_0x0911
        L_0x054d:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.libraries.places.internal.zzsm r4 = (com.google.android.libraries.places.internal.zzsm) r4
            com.google.android.libraries.places.internal.zzsz r8 = r0.zza(r3)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzc(r15, r4, r8)
            goto L_0x0910
        L_0x0563:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = zze(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzf(r15, r8)
            goto L_0x0910
        L_0x0573:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = zzd(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzh(r15, r4)
            goto L_0x0910
        L_0x0583:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.libraries.places.internal.zzqn.zzh(r15, r8)
            goto L_0x0910
        L_0x0591:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.libraries.places.internal.zzqn.zzj(r15, r4)
            goto L_0x095a
        L_0x059e:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = zzd(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzk(r15, r4)
            goto L_0x0910
        L_0x05ae:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = zzd(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzg(r15, r4)
            goto L_0x0910
        L_0x05be:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.libraries.places.internal.zzqa r4 = (com.google.android.libraries.places.internal.zzqa) r4
            int r4 = com.google.android.libraries.places.internal.zzqn.zzc(r15, r4)
            goto L_0x0910
        L_0x05d0:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.libraries.places.internal.zzsz r8 = r0.zza(r3)
            int r4 = com.google.android.libraries.places.internal.zztb.zza(r15, r4, r8)
            goto L_0x0910
        L_0x05e4:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.libraries.places.internal.zzqa
            if (r8 == 0) goto L_0x05fa
            com.google.android.libraries.places.internal.zzqa r4 = (com.google.android.libraries.places.internal.zzqa) r4
            int r4 = com.google.android.libraries.places.internal.zzqn.zzc(r15, r4)
            goto L_0x0910
        L_0x05fa:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r4)
            goto L_0x0910
        L_0x0602:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r4)
            goto L_0x095a
        L_0x060f:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.libraries.places.internal.zzqn.zzi(r15, r4)
            goto L_0x095a
        L_0x061c:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.libraries.places.internal.zzqn.zzg(r15, r8)
            goto L_0x0910
        L_0x062a:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = zzd(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzf(r15, r4)
            goto L_0x0910
        L_0x063a:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = zze(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zze(r15, r8)
            goto L_0x0910
        L_0x064a:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = zze(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzd(r15, r8)
            goto L_0x0910
        L_0x065a:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r4)
            goto L_0x095a
        L_0x0667:
            boolean r4 = r0.zza((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r8)
            goto L_0x0910
        L_0x0675:
            com.google.android.libraries.places.internal.zzsf r4 = r0.zzs
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.zzb(r3)
            int r4 = r4.zza(r15, r8, r9)
            goto L_0x0910
        L_0x0685:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.libraries.places.internal.zzsz r8 = r0.zza(r3)
            int r4 = com.google.android.libraries.places.internal.zztb.zzb(r15, r4, r8)
            goto L_0x0910
        L_0x0695:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzc(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x06a9
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06a9:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x06b3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzg(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x06c7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06c7:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x06d1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzi(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x06e5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06e5:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x06ef:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzh(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x0703
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0703:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x070d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzd(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x0721
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0721:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x072b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzf(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x073f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x073f:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x0749:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzj(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x075d
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x075d:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x0767:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzh(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x077b
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x077b:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x0785:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzi(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x0799
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0799:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x07a3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zze(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x07b7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07b7:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x07c1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzb(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x07d5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07d5:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x07de:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zza(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x07f2
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07f2:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x07fb:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzh(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x080f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x080f:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
            goto L_0x0834
        L_0x0818:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzi(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.zzk
            if (r8 == 0) goto L_0x082c
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x082c:
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15)
            int r9 = com.google.android.libraries.places.internal.zzqn.zzg(r4)
        L_0x0834:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x095a
        L_0x0838:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.libraries.places.internal.zztb.zzc(r15, r4, r10)
            goto L_0x0900
        L_0x0845:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzg(r15, r4, r10)
            goto L_0x0900
        L_0x0852:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzi(r15, r4, r10)
            goto L_0x0900
        L_0x085f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzh(r15, r4, r10)
            goto L_0x0900
        L_0x086c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzd(r15, r4, r10)
            goto L_0x0900
        L_0x0879:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzf(r15, r4, r10)
            goto L_0x0910
        L_0x0886:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzb(r15, r4)
            goto L_0x0910
        L_0x0892:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.libraries.places.internal.zzsz r8 = r0.zza(r3)
            int r4 = com.google.android.libraries.places.internal.zztb.zza(r15, r4, r8)
            goto L_0x0910
        L_0x08a2:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zza(r15, r4)
            goto L_0x0910
        L_0x08ad:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.libraries.places.internal.zztb.zzj(r15, r4, r10)
            goto L_0x0900
        L_0x08b9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzh(r15, r4, r10)
            goto L_0x0900
        L_0x08c5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzi(r15, r4, r10)
            goto L_0x0900
        L_0x08d1:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zze(r15, r4, r10)
            goto L_0x0900
        L_0x08dd:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzb(r15, r4, r10)
            goto L_0x0900
        L_0x08e9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zza(r15, r4, r10)
            goto L_0x0900
        L_0x08f5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzh(r15, r4, r10)
        L_0x0900:
            int r5 = r5 + r4
            r4 = 1
        L_0x0902:
            r7 = 0
            goto L_0x0915
        L_0x0905:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zztb.zzi(r15, r4, r10)
        L_0x0910:
            int r5 = r5 + r4
        L_0x0911:
            r4 = 1
        L_0x0912:
            r7 = 0
            r10 = 0
        L_0x0915:
            r13 = 0
            goto L_0x0a2e
        L_0x0919:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.libraries.places.internal.zzsm r4 = (com.google.android.libraries.places.internal.zzsm) r4
            com.google.android.libraries.places.internal.zzsz r8 = r0.zza(r3)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzc(r15, r4, r8)
            goto L_0x0910
        L_0x092c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzf(r15, r8)
            goto L_0x0910
        L_0x0939:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzh(r15, r4)
            goto L_0x0910
        L_0x0946:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.libraries.places.internal.zzqn.zzh(r15, r8)
            goto L_0x0910
        L_0x0951:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.libraries.places.internal.zzqn.zzj(r15, r4)
        L_0x095a:
            int r5 = r5 + r8
            goto L_0x0911
        L_0x095c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzk(r15, r4)
            goto L_0x0910
        L_0x0969:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.libraries.places.internal.zzqn.zzg(r15, r4)
            goto L_0x0910
        L_0x0976:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.libraries.places.internal.zzqa r4 = (com.google.android.libraries.places.internal.zzqa) r4
            int r4 = com.google.android.libraries.places.internal.zzqn.zzc(r15, r4)
            goto L_0x0910
        L_0x0985:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.libraries.places.internal.zzsz r8 = r0.zza(r3)
            int r4 = com.google.android.libraries.places.internal.zztb.zza(r15, r4, r8)
            goto L_0x0910
        L_0x0997:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.libraries.places.internal.zzqa
            if (r8 == 0) goto L_0x09ab
            com.google.android.libraries.places.internal.zzqa r4 = (com.google.android.libraries.places.internal.zzqa) r4
            int r4 = com.google.android.libraries.places.internal.zzqn.zzc(r15, r4)
            goto L_0x0910
        L_0x09ab:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r4)
            goto L_0x0910
        L_0x09b3:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r4)
            int r5 = r5 + r8
            goto L_0x0912
        L_0x09bf:
            r4 = 1
            r8 = r12 & r18
            r10 = 0
            if (r8 == 0) goto L_0x0902
            int r8 = com.google.android.libraries.places.internal.zzqn.zzi(r15, r10)
            int r5 = r5 + r8
            goto L_0x0902
        L_0x09cc:
            r4 = 1
            r10 = 0
            r8 = r12 & r18
            r13 = 0
            if (r8 == 0) goto L_0x0a1b
            int r8 = com.google.android.libraries.places.internal.zzqn.zzg(r15, r13)
            goto L_0x0a0b
        L_0x09d9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.libraries.places.internal.zzqn.zzf(r15, r8)
            goto L_0x0a0b
        L_0x09ea:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.libraries.places.internal.zzqn.zze(r15, r8)
            goto L_0x0a0b
        L_0x09fb:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.libraries.places.internal.zzqn.zzd(r15, r8)
        L_0x0a0b:
            int r5 = r5 + r8
            goto L_0x0a1b
        L_0x0a0d:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r18
            if (r8 == 0) goto L_0x0a1b
            r8 = 0
            int r9 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r8)
            int r5 = r5 + r9
        L_0x0a1b:
            r7 = 0
            goto L_0x0a2e
        L_0x0a1e:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a1b
            r7 = 0
            int r11 = com.google.android.libraries.places.internal.zzqn.zzb(r15, r7)
            int r5 = r5 + r11
        L_0x0a2e:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x04f9
        L_0x0a39:
            r10 = 0
            com.google.android.libraries.places.internal.zztr<?, ?> r2 = r0.zzq
            int r2 = zza(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.zzh
            if (r2 == 0) goto L_0x0a93
            com.google.android.libraries.places.internal.zzqr<?> r2 = r0.zzr
            com.google.android.libraries.places.internal.zzqw r1 = r2.zza(r1)
            r2 = 0
        L_0x0a4c:
            com.google.android.libraries.places.internal.zzte<T, java.lang.Object> r3 = r1.zza
            int r3 = r3.zzc()
            if (r10 >= r3) goto L_0x0a6c
            com.google.android.libraries.places.internal.zzte<T, java.lang.Object> r3 = r1.zza
            java.util.Map$Entry r3 = r3.zzb(r10)
            java.lang.Object r4 = r3.getKey()
            com.google.android.libraries.places.internal.zzqy r4 = (com.google.android.libraries.places.internal.zzqy) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.libraries.places.internal.zzqw.zza(r4, r3)
            int r2 = r2 + r3
            int r10 = r10 + 1
            goto L_0x0a4c
        L_0x0a6c:
            com.google.android.libraries.places.internal.zzte<T, java.lang.Object> r1 = r1.zza
            java.lang.Iterable r1 = r1.zzd()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a76:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a92
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.libraries.places.internal.zzqy r4 = (com.google.android.libraries.places.internal.zzqy) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.libraries.places.internal.zzqw.zza(r4, r3)
            int r2 = r2 + r3
            goto L_0x0a76
        L_0x0a92:
            int r5 = r5 + r2
        L_0x0a93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzsq.zzd(java.lang.Object):int");
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zztx.zzf(t, j)).floatValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final void zzb(T t, T t2, int i) {
        int zzc2 = zzc(i);
        int i2 = this.zzc[i];
        long j = (long) (zzc2 & 1048575);
        if (zza(t2, i2, i)) {
            Object zzf2 = zztx.zzf(t, j);
            Object zzf3 = zztx.zzf(t2, j);
            if (zzf2 == null || zzf3 == null) {
                if (zzf3 != null) {
                    zztx.zza((Object) t, j, zzf3);
                    zzb(t, i2, i);
                }
                return;
            }
            zztx.zza((Object) t, j, zzrd.zza(zzf2, zzf3));
            zzb(t, i2, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r19, com.google.android.libraries.places.internal.zzul r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x0023
            com.google.android.libraries.places.internal.zzqr<?> r3 = r0.zzr
            com.google.android.libraries.places.internal.zzqw r3 = r3.zza(r1)
            com.google.android.libraries.places.internal.zzte<T, java.lang.Object> r5 = r3.zza
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.zzd()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.zzc
            int r7 = r7.length
            sun.misc.Unsafe r8 = zzb
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002e:
            if (r5 >= r7) goto L_0x04ad
            int r12 = r0.zzc(r5)
            int[] r13 = r0.zzc
            r14 = r13[r5]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.zzj
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0062
            r4 = 17
            if (r15 > r4) goto L_0x0062
            int r4 = r5 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0058
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            goto L_0x0059
        L_0x0058:
            r13 = r6
        L_0x0059:
            int r4 = r4 >>> 20
            r6 = 1
            int r9 = r6 << r4
            r6 = r13
            r10 = r17
            goto L_0x0067
        L_0x0062:
            r17 = r10
            r10 = r17
            r9 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0086
            com.google.android.libraries.places.internal.zzqr<?> r4 = r0.zzr
            int r4 = r4.zza(r10)
            if (r4 > r14) goto L_0x0086
            com.google.android.libraries.places.internal.zzqr<?> r4 = r0.zzr
            r4.zza(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0067
        L_0x0084:
            r10 = 0
            goto L_0x0067
        L_0x0086:
            r4 = r12 & r16
            long r12 = (long) r4
            switch(r15) {
                case 0: goto L_0x049d;
                case 1: goto L_0x0490;
                case 2: goto L_0x0483;
                case 3: goto L_0x0476;
                case 4: goto L_0x0469;
                case 5: goto L_0x045c;
                case 6: goto L_0x044f;
                case 7: goto L_0x0442;
                case 8: goto L_0x0434;
                case 9: goto L_0x0422;
                case 10: goto L_0x0412;
                case 11: goto L_0x0404;
                case 12: goto L_0x03f6;
                case 13: goto L_0x03e8;
                case 14: goto L_0x03da;
                case 15: goto L_0x03cc;
                case 16: goto L_0x03be;
                case 17: goto L_0x03ac;
                case 18: goto L_0x039c;
                case 19: goto L_0x038c;
                case 20: goto L_0x037c;
                case 21: goto L_0x036c;
                case 22: goto L_0x035c;
                case 23: goto L_0x034c;
                case 24: goto L_0x033c;
                case 25: goto L_0x032c;
                case 26: goto L_0x031d;
                case 27: goto L_0x030a;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02eb;
                case 30: goto L_0x02db;
                case 31: goto L_0x02cb;
                case 32: goto L_0x02bb;
                case 33: goto L_0x02ab;
                case 34: goto L_0x029b;
                case 35: goto L_0x028b;
                case 36: goto L_0x027b;
                case 37: goto L_0x026b;
                case 38: goto L_0x025b;
                case 39: goto L_0x024b;
                case 40: goto L_0x023b;
                case 41: goto L_0x022b;
                case 42: goto L_0x021b;
                case 43: goto L_0x020b;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01eb;
                case 46: goto L_0x01db;
                case 47: goto L_0x01cb;
                case 48: goto L_0x01bb;
                case 49: goto L_0x01a8;
                case 50: goto L_0x019f;
                case 51: goto L_0x0190;
                case 52: goto L_0x0181;
                case 53: goto L_0x0172;
                case 54: goto L_0x0163;
                case 55: goto L_0x0154;
                case 56: goto L_0x0145;
                case 57: goto L_0x0136;
                case 58: goto L_0x0127;
                case 59: goto L_0x0118;
                case 60: goto L_0x0105;
                case 61: goto L_0x00f5;
                case 62: goto L_0x00e7;
                case 63: goto L_0x00d9;
                case 64: goto L_0x00cb;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00af;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r15 = 0
            goto L_0x04a9
        L_0x008f:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.libraries.places.internal.zzsz r9 = r0.zza(r5)
            r2.zzb(r14, r4, r9)
            goto L_0x008c
        L_0x00a1:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = zze(r1, r12)
            r2.zze(r14, r12)
            goto L_0x008c
        L_0x00af:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = zzd(r1, r12)
            r2.zzf(r14, r4)
            goto L_0x008c
        L_0x00bd:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = zze(r1, r12)
            r2.zzb(r14, r12)
            goto L_0x008c
        L_0x00cb:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = zzd(r1, r12)
            r2.zza(r14, r4)
            goto L_0x008c
        L_0x00d9:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = zzd(r1, r12)
            r2.zzb(r14, r4)
            goto L_0x008c
        L_0x00e7:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = zzd(r1, r12)
            r2.zze(r14, r4)
            goto L_0x008c
        L_0x00f5:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.libraries.places.internal.zzqa r4 = (com.google.android.libraries.places.internal.zzqa) r4
            r2.zza(r14, r4)
            goto L_0x008c
        L_0x0105:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.libraries.places.internal.zzsz r9 = r0.zza(r5)
            r2.zza(r14, r4, r9)
            goto L_0x008c
        L_0x0118:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            zza(r14, r4, r2)
            goto L_0x008c
        L_0x0127:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            boolean r4 = zzf(r1, r12)
            r2.zza(r14, r4)
            goto L_0x008c
        L_0x0136:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = zzd(r1, r12)
            r2.zzd(r14, r4)
            goto L_0x008c
        L_0x0145:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = zze(r1, r12)
            r2.zzd(r14, r12)
            goto L_0x008c
        L_0x0154:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = zzd(r1, r12)
            r2.zzc(r14, r4)
            goto L_0x008c
        L_0x0163:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = zze(r1, r12)
            r2.zzc(r14, r12)
            goto L_0x008c
        L_0x0172:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = zze(r1, r12)
            r2.zza(r14, r12)
            goto L_0x008c
        L_0x0181:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            float r4 = zzc(r1, r12)
            r2.zza(r14, r4)
            goto L_0x008c
        L_0x0190:
            boolean r4 = r0.zza((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            double r12 = zzb((T) r1, r12)
            r2.zza(r14, r12)
            goto L_0x008c
        L_0x019f:
            java.lang.Object r4 = r8.getObject(r1, r12)
            r0.zza(r2, r14, r4, r5)
            goto L_0x008c
        L_0x01a8:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zzsz r12 = r0.zza(r5)
            com.google.android.libraries.places.internal.zztb.zzb(r4, r9, r2, r12)
            goto L_0x008c
        L_0x01bb:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 1
            com.google.android.libraries.places.internal.zztb.zze(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01cb:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzj(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01db:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzg(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01eb:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzl(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01fb:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzm(r4, r9, r2, r14)
            goto L_0x008c
        L_0x020b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzi(r4, r9, r2, r14)
            goto L_0x008c
        L_0x021b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzn(r4, r9, r2, r14)
            goto L_0x008c
        L_0x022b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzk(r4, r9, r2, r14)
            goto L_0x008c
        L_0x023b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzf(r4, r9, r2, r14)
            goto L_0x008c
        L_0x024b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzh(r4, r9, r2, r14)
            goto L_0x008c
        L_0x025b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzd(r4, r9, r2, r14)
            goto L_0x008c
        L_0x026b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzc(r4, r9, r2, r14)
            goto L_0x008c
        L_0x027b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzb(r4, r9, r2, r14)
            goto L_0x008c
        L_0x028b:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zza(r4, r9, r2, r14)
            goto L_0x008c
        L_0x029b:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 0
            com.google.android.libraries.places.internal.zztb.zze(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02ab:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzj(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02bb:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzg(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02cb:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzl(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02db:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzm(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02eb:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzi(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02fb:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzb(r4, r9, r2)
            goto L_0x008c
        L_0x030a:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zzsz r12 = r0.zza(r5)
            com.google.android.libraries.places.internal.zztb.zza(r4, r9, r2, r12)
            goto L_0x008c
        L_0x031d:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zza(r4, r9, r2)
            goto L_0x008c
        L_0x032c:
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r15 = 0
            com.google.android.libraries.places.internal.zztb.zzn(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x033c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzk(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x034c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzf(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x035c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzh(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x036c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzd(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x037c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzc(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x038c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzb(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x039c:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zza(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x03ac:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.libraries.places.internal.zzsz r9 = r0.zza(r5)
            r2.zzb(r14, r4, r9)
            goto L_0x04a9
        L_0x03be:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.zze(r14, r12)
            goto L_0x04a9
        L_0x03cc:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.zzf(r14, r4)
            goto L_0x04a9
        L_0x03da:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.zzb(r14, r12)
            goto L_0x04a9
        L_0x03e8:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.zza(r14, r4)
            goto L_0x04a9
        L_0x03f6:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.zzb(r14, r4)
            goto L_0x04a9
        L_0x0404:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.zze(r14, r4)
            goto L_0x04a9
        L_0x0412:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.libraries.places.internal.zzqa r4 = (com.google.android.libraries.places.internal.zzqa) r4
            r2.zza(r14, r4)
            goto L_0x04a9
        L_0x0422:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.libraries.places.internal.zzsz r9 = r0.zza(r5)
            r2.zza(r14, r4, r9)
            goto L_0x04a9
        L_0x0434:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            zza(r14, r4, r2)
            goto L_0x04a9
        L_0x0442:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            boolean r4 = com.google.android.libraries.places.internal.zztx.zzc(r1, r12)
            r2.zza(r14, r4)
            goto L_0x04a9
        L_0x044f:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.zzd(r14, r4)
            goto L_0x04a9
        L_0x045c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.zzd(r14, r12)
            goto L_0x04a9
        L_0x0469:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.zzc(r14, r4)
            goto L_0x04a9
        L_0x0476:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.zzc(r14, r12)
            goto L_0x04a9
        L_0x0483:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.zza(r14, r12)
            goto L_0x04a9
        L_0x0490:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            float r4 = com.google.android.libraries.places.internal.zztx.zzd(r1, r12)
            r2.zza(r14, r4)
            goto L_0x04a9
        L_0x049d:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            double r12 = com.google.android.libraries.places.internal.zztx.zze(r1, r12)
            r2.zza(r14, r12)
        L_0x04a9:
            int r5 = r5 + 3
            goto L_0x002e
        L_0x04ad:
            r17 = r10
            r4 = r17
        L_0x04b1:
            if (r4 == 0) goto L_0x04c7
            com.google.android.libraries.places.internal.zzqr<?> r5 = r0.zzr
            r5.zza(r2, r4)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c5
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x04b1
        L_0x04c5:
            r4 = 0
            goto L_0x04b1
        L_0x04c7:
            com.google.android.libraries.places.internal.zztr<?, ?> r3 = r0.zzq
            zza(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzsq.zzb(java.lang.Object, com.google.android.libraries.places.internal.zzul):void");
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.libraries.places.internal.zztb.zza(com.google.android.libraries.places.internal.zztx.zzf(r10, r6), com.google.android.libraries.places.internal.zztx.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.libraries.places.internal.zztx.zzb(r10, r6) == com.google.android.libraries.places.internal.zztx.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r10, r6) == com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.libraries.places.internal.zztx.zzb(r10, r6) == com.google.android.libraries.places.internal.zztx.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r10, r6) == com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r10, r6) == com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r10, r6) == com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.libraries.places.internal.zztb.zza(com.google.android.libraries.places.internal.zztx.zzf(r10, r6), com.google.android.libraries.places.internal.zztx.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.libraries.places.internal.zztb.zza(com.google.android.libraries.places.internal.zztx.zzf(r10, r6), com.google.android.libraries.places.internal.zztx.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.libraries.places.internal.zztb.zza(com.google.android.libraries.places.internal.zztx.zzf(r10, r6), com.google.android.libraries.places.internal.zztx.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.libraries.places.internal.zztx.zzc(r10, r6) == com.google.android.libraries.places.internal.zztx.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r10, r6) == com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.libraries.places.internal.zztx.zzb(r10, r6) == com.google.android.libraries.places.internal.zztx.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r10, r6) == com.google.android.libraries.places.internal.zztx.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.libraries.places.internal.zztx.zzb(r10, r6) == com.google.android.libraries.places.internal.zztx.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.libraries.places.internal.zztx.zzb(r10, r6) == com.google.android.libraries.places.internal.zztx.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zztx.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zztx.zzd(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zztx.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zztx.zze(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.libraries.places.internal.zztb.zza(com.google.android.libraries.places.internal.zztx.zzf(r10, r6), com.google.android.libraries.places.internal.zztx.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.zzc(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.zzd(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r10, r4)
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r4 = com.google.android.libraries.places.internal.zztb.zza(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r3 = com.google.android.libraries.places.internal.zztb.zza(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r4 = com.google.android.libraries.places.internal.zztb.zza(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.libraries.places.internal.zztx.zzb(r10, r6)
            long r6 = com.google.android.libraries.places.internal.zztx.zzb(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r10, r6)
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.libraries.places.internal.zztx.zzb(r10, r6)
            long r6 = com.google.android.libraries.places.internal.zztx.zzb(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r10, r6)
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r10, r6)
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r10, r6)
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r4 = com.google.android.libraries.places.internal.zztb.zza(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r4 = com.google.android.libraries.places.internal.zztb.zza(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.libraries.places.internal.zztx.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.libraries.places.internal.zztx.zzf(r11, r6)
            boolean r4 = com.google.android.libraries.places.internal.zztb.zza(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.libraries.places.internal.zztx.zzc(r10, r6)
            boolean r5 = com.google.android.libraries.places.internal.zztx.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r10, r6)
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.libraries.places.internal.zztx.zzb(r10, r6)
            long r6 = com.google.android.libraries.places.internal.zztx.zzb(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.libraries.places.internal.zztx.zza(r10, r6)
            int r5 = com.google.android.libraries.places.internal.zztx.zza(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.libraries.places.internal.zztx.zzb(r10, r6)
            long r6 = com.google.android.libraries.places.internal.zztx.zzb(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.libraries.places.internal.zztx.zzb(r10, r6)
            long r6 = com.google.android.libraries.places.internal.zztx.zzb(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.libraries.places.internal.zztx.zzd(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.libraries.places.internal.zztx.zzd(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.libraries.places.internal.zztx.zze(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.libraries.places.internal.zztx.zze(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.libraries.places.internal.zztr<?, ?> r0 = r9.zzq
            java.lang.Object r0 = r0.zza(r10)
            com.google.android.libraries.places.internal.zztr<?, ?> r2 = r9.zzq
            java.lang.Object r2 = r2.zza(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x01f1
            com.google.android.libraries.places.internal.zzqr<?> r0 = r9.zzr
            com.google.android.libraries.places.internal.zzqw r10 = r0.zza(r10)
            com.google.android.libraries.places.internal.zzqr<?> r0 = r9.zzr
            com.google.android.libraries.places.internal.zzqw r11 = r0.zza(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzsq.zza(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.zzc(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = zzf(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = zzc(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.zza((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = zzb((T) r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zztx.zzb(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zztx.zza(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zztx.zzb(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zztx.zza(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zztx.zza(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zztx.zza(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zztx.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.libraries.places.internal.zztx.zzc(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zztx.zza(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zztx.zzb(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zztx.zza(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zztx.zzb(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zztx.zzb(r9, r5)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.libraries.places.internal.zztx.zzd(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.libraries.places.internal.zztx.zze(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.libraries.places.internal.zzrd.zza(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.libraries.places.internal.zztr<?, ?> r0 = r8.zzq
            java.lang.Object r0 = r0.zza(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.libraries.places.internal.zzqr<?> r0 = r8.zzr
            com.google.android.libraries.places.internal.zzqw r9 = r0.zza(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzsq.zza(java.lang.Object):int");
    }

    private final void zza(T t, T t2, int i) {
        long zzc2 = (long) (zzc(i) & 1048575);
        if (zza(t2, i)) {
            Object zzf2 = zztx.zzf(t, zzc2);
            Object zzf3 = zztx.zzf(t2, zzc2);
            if (zzf2 == null || zzf3 == null) {
                if (zzf3 != null) {
                    zztx.zza((Object) t, zzc2, zzf3);
                    zzb(t, i);
                }
                return;
            }
            zztx.zza((Object) t, zzc2, zzrd.zza(zzf2, zzf3));
            zzb(t, i);
        }
    }

    private static <UT, UB> int zza(zztr<UT, UB> zztr, T t) {
        return zztr.zzd(zztr.zza(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zztx.zzf(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.libraries.places.internal.zzul r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zza()
            int r1 = com.google.android.libraries.places.internal.zzrb.zzc.zzk
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.libraries.places.internal.zztr<?, ?> r0 = r13.zzq
            zza(r0, (T) r14, r15)
            boolean r0 = r13.zzh
            if (r0 == 0) goto L_0x0032
            com.google.android.libraries.places.internal.zzqr<?> r0 = r13.zzr
            com.google.android.libraries.places.internal.zzqw r0 = r0.zza(r14)
            com.google.android.libraries.places.internal.zzte<T, java.lang.Object> r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.zze()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.zzc
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.zzc(r7)
            int[] r9 = r13.zzc
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.libraries.places.internal.zzqr<?> r10 = r13.zzr
            int r10 = r10.zza(r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.libraries.places.internal.zzqr<?> r10 = r13.zzr
            r10.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            com.google.android.libraries.places.internal.zzsz r10 = r13.zza(r7)
            r15.zzb(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zze(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zzb(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzb(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            com.google.android.libraries.places.internal.zzqa r8 = (com.google.android.libraries.places.internal.zzqa) r8
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            com.google.android.libraries.places.internal.zzsz r10 = r13.zza(r7)
            r15.zza(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            zza(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzf(r14, r10)
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzd(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zzd(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzc(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zzc(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zza(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzc(r14, r10)
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.zza((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzb((T) r14, r10)
            r15.zza(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            r13.zza(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzsz r10 = r13.zza(r7)
            com.google.android.libraries.places.internal.zztb.zzb(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zze(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzj(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzg(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzl(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzm(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzi(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzn(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzk(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzf(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzh(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzd(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzc(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzb(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zza(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zze(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzj(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzg(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzl(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzm(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzi(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzb(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzsz r10 = r13.zza(r7)
            com.google.android.libraries.places.internal.zztb.zza(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zza(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzn(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzk(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzf(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzh(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzd(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzc(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zzb(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zztb.zza(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            com.google.android.libraries.places.internal.zzsz r10 = r13.zza(r7)
            r15.zzb(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zztx.zzb(r14, r10)
            r15.zze(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zztx.zzb(r14, r10)
            r15.zzb(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r14, r10)
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r14, r10)
            r15.zzb(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            com.google.android.libraries.places.internal.zzqa r8 = (com.google.android.libraries.places.internal.zzqa) r8
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            com.google.android.libraries.places.internal.zzsz r10 = r13.zza(r7)
            r15.zza(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zztx.zzf(r14, r10)
            zza(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.libraries.places.internal.zztx.zzc(r14, r10)
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r14, r10)
            r15.zzd(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zztx.zzb(r14, r10)
            r15.zzd(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zztx.zza(r14, r10)
            r15.zzc(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zztx.zzb(r14, r10)
            r15.zzc(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zztx.zzb(r14, r10)
            r15.zza(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.libraries.places.internal.zztx.zzd(r14, r10)
            r15.zza(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.zza((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.libraries.places.internal.zztx.zze(r14, r10)
            r15.zza(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.libraries.places.internal.zzqr<?> r14 = r13.zzr
            r14.zza(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.zzj
            if (r0 == 0) goto L_0x0a46
            boolean r0 = r13.zzh
            if (r0 == 0) goto L_0x054a
            com.google.android.libraries.places.internal.zzqr<?> r0 = r13.zzr
            com.google.android.libraries.places.internal.zzqw r0 = r0.zza(r14)
            com.google.android.libraries.places.internal.zzte<T, java.lang.Object> r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.zzd()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.zzc
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x0551:
            if (r1 >= r7) goto L_0x0a29
            int r9 = r13.zzc(r1)
            int[] r10 = r13.zzc
            r10 = r10[r1]
        L_0x055b:
            if (r8 == 0) goto L_0x0579
            com.google.android.libraries.places.internal.zzqr<?> r11 = r13.zzr
            int r11 = r11.zza(r8)
            if (r11 > r10) goto L_0x0579
            com.google.android.libraries.places.internal.zzqr<?> r11 = r13.zzr
            r11.zza(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0577
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x055b
        L_0x0577:
            r8 = r3
            goto L_0x055b
        L_0x0579:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a16;
                case 1: goto L_0x0a06;
                case 2: goto L_0x09f6;
                case 3: goto L_0x09e6;
                case 4: goto L_0x09d6;
                case 5: goto L_0x09c6;
                case 6: goto L_0x09b6;
                case 7: goto L_0x09a5;
                case 8: goto L_0x0994;
                case 9: goto L_0x097f;
                case 10: goto L_0x096c;
                case 11: goto L_0x095b;
                case 12: goto L_0x094a;
                case 13: goto L_0x0939;
                case 14: goto L_0x0928;
                case 15: goto L_0x0917;
                case 16: goto L_0x0906;
                case 17: goto L_0x08f1;
                case 18: goto L_0x08e0;
                case 19: goto L_0x08cf;
                case 20: goto L_0x08be;
                case 21: goto L_0x08ad;
                case 22: goto L_0x089c;
                case 23: goto L_0x088b;
                case 24: goto L_0x087a;
                case 25: goto L_0x0869;
                case 26: goto L_0x0858;
                case 27: goto L_0x0843;
                case 28: goto L_0x0832;
                case 29: goto L_0x0821;
                case 30: goto L_0x0810;
                case 31: goto L_0x07ff;
                case 32: goto L_0x07ee;
                case 33: goto L_0x07dd;
                case 34: goto L_0x07cc;
                case 35: goto L_0x07bb;
                case 36: goto L_0x07aa;
                case 37: goto L_0x0799;
                case 38: goto L_0x0788;
                case 39: goto L_0x0777;
                case 40: goto L_0x0766;
                case 41: goto L_0x0755;
                case 42: goto L_0x0744;
                case 43: goto L_0x0733;
                case 44: goto L_0x0722;
                case 45: goto L_0x0711;
                case 46: goto L_0x0700;
                case 47: goto L_0x06ef;
                case 48: goto L_0x06de;
                case 49: goto L_0x06c9;
                case 50: goto L_0x06be;
                case 51: goto L_0x06ad;
                case 52: goto L_0x069c;
                case 53: goto L_0x068b;
                case 54: goto L_0x067a;
                case 55: goto L_0x0669;
                case 56: goto L_0x0658;
                case 57: goto L_0x0647;
                case 58: goto L_0x0636;
                case 59: goto L_0x0625;
                case 60: goto L_0x0610;
                case 61: goto L_0x05fd;
                case 62: goto L_0x05ec;
                case 63: goto L_0x05db;
                case 64: goto L_0x05ca;
                case 65: goto L_0x05b9;
                case 66: goto L_0x05a8;
                case 67: goto L_0x0597;
                case 68: goto L_0x0582;
                default: goto L_0x0580;
            }
        L_0x0580:
            goto L_0x0a25
        L_0x0582:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            com.google.android.libraries.places.internal.zzsz r11 = r13.zza(r1)
            r15.zzb(r10, r9, r11)
            goto L_0x0a25
        L_0x0597:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zze(r10, r11)
            goto L_0x0a25
        L_0x05a8:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a25
        L_0x05b9:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zzb(r10, r11)
            goto L_0x0a25
        L_0x05ca:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x05db:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzb(r10, r9)
            goto L_0x0a25
        L_0x05ec:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a25
        L_0x05fd:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            com.google.android.libraries.places.internal.zzqa r9 = (com.google.android.libraries.places.internal.zzqa) r9
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x0610:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            com.google.android.libraries.places.internal.zzsz r11 = r13.zza(r1)
            r15.zza(r10, r9, r11)
            goto L_0x0a25
        L_0x0625:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            zza(r10, r9, r15)
            goto L_0x0a25
        L_0x0636:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzf(r14, r11)
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x0647:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzd(r10, r9)
            goto L_0x0a25
        L_0x0658:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zzd(r10, r11)
            goto L_0x0a25
        L_0x0669:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzc(r10, r9)
            goto L_0x0a25
        L_0x067a:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zzc(r10, r11)
            goto L_0x0a25
        L_0x068b:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zza(r10, r11)
            goto L_0x0a25
        L_0x069c:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzc(r14, r11)
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x06ad:
            boolean r11 = r13.zza((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzb((T) r14, r11)
            r15.zza(r10, r11)
            goto L_0x0a25
        L_0x06be:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            r13.zza(r15, r10, r9, r1)
            goto L_0x0a25
        L_0x06c9:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zzsz r11 = r13.zza(r1)
            com.google.android.libraries.places.internal.zztb.zzb(r10, r9, r15, r11)
            goto L_0x0a25
        L_0x06de:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zze(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x06ef:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzj(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0700:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzg(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0711:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzl(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0722:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzm(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0733:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzi(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0744:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzn(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0755:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzk(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0766:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzf(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0777:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzh(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0788:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzd(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0799:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzc(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07aa:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzb(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07bb:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zza(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07cc:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zze(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07dd:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzj(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07ee:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzg(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07ff:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzl(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0810:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzm(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0821:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzi(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0832:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzb(r10, r9, r15)
            goto L_0x0a25
        L_0x0843:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zzsz r11 = r13.zza(r1)
            com.google.android.libraries.places.internal.zztb.zza(r10, r9, r15, r11)
            goto L_0x0a25
        L_0x0858:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zza(r10, r9, r15)
            goto L_0x0a25
        L_0x0869:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzn(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x087a:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzk(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x088b:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzf(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x089c:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzh(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08ad:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzd(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08be:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzc(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08cf:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zzb(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08e0:
            int[] r10 = r13.zzc
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.libraries.places.internal.zztb.zza(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08f1:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            com.google.android.libraries.places.internal.zzsz r11 = r13.zza(r1)
            r15.zzb(r10, r9, r11)
            goto L_0x0a25
        L_0x0906:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.libraries.places.internal.zztx.zzb(r14, r11)
            r15.zze(r10, r11)
            goto L_0x0a25
        L_0x0917:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.libraries.places.internal.zztx.zza(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a25
        L_0x0928:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.libraries.places.internal.zztx.zzb(r14, r11)
            r15.zzb(r10, r11)
            goto L_0x0a25
        L_0x0939:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.libraries.places.internal.zztx.zza(r14, r11)
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x094a:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.libraries.places.internal.zztx.zza(r14, r11)
            r15.zzb(r10, r9)
            goto L_0x0a25
        L_0x095b:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.libraries.places.internal.zztx.zza(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a25
        L_0x096c:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            com.google.android.libraries.places.internal.zzqa r9 = (com.google.android.libraries.places.internal.zzqa) r9
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x097f:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            com.google.android.libraries.places.internal.zzsz r11 = r13.zza(r1)
            r15.zza(r10, r9, r11)
            goto L_0x0a25
        L_0x0994:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.libraries.places.internal.zztx.zzf(r14, r11)
            zza(r10, r9, r15)
            goto L_0x0a25
        L_0x09a5:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.libraries.places.internal.zztx.zzc(r14, r11)
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x09b6:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.libraries.places.internal.zztx.zza(r14, r11)
            r15.zzd(r10, r9)
            goto L_0x0a25
        L_0x09c6:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.libraries.places.internal.zztx.zzb(r14, r11)
            r15.zzd(r10, r11)
            goto L_0x0a25
        L_0x09d6:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.libraries.places.internal.zztx.zza(r14, r11)
            r15.zzc(r10, r9)
            goto L_0x0a25
        L_0x09e6:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.libraries.places.internal.zztx.zzb(r14, r11)
            r15.zzc(r10, r11)
            goto L_0x0a25
        L_0x09f6:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.libraries.places.internal.zztx.zzb(r14, r11)
            r15.zza(r10, r11)
            goto L_0x0a25
        L_0x0a06:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.libraries.places.internal.zztx.zzd(r14, r11)
            r15.zza(r10, r9)
            goto L_0x0a25
        L_0x0a16:
            boolean r11 = r13.zza((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.libraries.places.internal.zztx.zze(r14, r11)
            r15.zza(r10, r11)
        L_0x0a25:
            int r1 = r1 + 3
            goto L_0x0551
        L_0x0a29:
            if (r8 == 0) goto L_0x0a40
            com.google.android.libraries.places.internal.zzqr<?> r1 = r13.zzr
            r1.zza(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a29
        L_0x0a3e:
            r8 = r3
            goto L_0x0a29
        L_0x0a40:
            com.google.android.libraries.places.internal.zztr<?, ?> r0 = r13.zzq
            zza(r0, (T) r14, r15)
            return
        L_0x0a46:
            r13.zzb((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzsq.zza(java.lang.Object, com.google.android.libraries.places.internal.zzul):void");
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    public final void zzb(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzc2 = (long) (zzc(this.zzl[i2]) & 1048575);
            Object zzf2 = zztx.zzf(t, zzc2);
            if (zzf2 != null) {
                zztx.zza((Object) t, zzc2, this.zzs.zzb(zzf2));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zza(t, (long) this.zzl[i]);
            i++;
        }
        this.zzq.zzb(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zztx.zzf(t, j)).doubleValue();
    }

    private final void zzb(T t, int i) {
        if (!this.zzj) {
            int zzd2 = zzd(i);
            long j = (long) (zzd2 & 1048575);
            zztx.zza((Object) t, j, zztx.zza((Object) t, j) | (1 << (zzd2 >>> 20)));
        }
    }

    private final void zzb(T t, int i, int i2) {
        zztx.zza((Object) t, (long) (zzd(i2) & 1048575), i);
    }

    private final int zzd(int i) {
        return this.zzc[i + 2];
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zztx.zzf(t, j)).intValue();
    }

    private final <K, V> void zza(zzul zzul, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzul.zza(i, this.zzs.zzc(zzb(i2)), this.zzs.zza(obj));
        }
    }

    private static <UT, UB> void zza(zztr<UT, UB> zztr, T t, zzul zzul) throws IOException {
        zztr.zza(zztr.zza(t), zzul);
    }

    private final zzsz zza(int i) {
        int i2 = (i / 3) << 1;
        zzsz zzsz = (zzsz) this.zzd[i2];
        if (zzsz != null) {
            return zzsz;
        }
        zzsz zza2 = zzsy.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private static boolean zza(Object obj, int i, zzsz zzsz) {
        return zzsz.zzc(zztx.zzf(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzul zzul) throws IOException {
        if (obj instanceof String) {
            zzul.zza(i, (String) obj);
        } else {
            zzul.zza(i, (zzqa) obj);
        }
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzj) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzj) {
            int zzc2 = zzc(i);
            long j = (long) (zzc2 & 1048575);
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    return zztx.zze(t, j) != 0.0d;
                case 1:
                    return zztx.zzd(t, j) != 0.0f;
                case 2:
                    return zztx.zzb(t, j) != 0;
                case 3:
                    return zztx.zzb(t, j) != 0;
                case 4:
                    return zztx.zza((Object) t, j) != 0;
                case 5:
                    return zztx.zzb(t, j) != 0;
                case 6:
                    return zztx.zza((Object) t, j) != 0;
                case 7:
                    return zztx.zzc(t, j);
                case 8:
                    Object zzf2 = zztx.zzf(t, j);
                    if (zzf2 instanceof String) {
                        return !((String) zzf2).isEmpty();
                    }
                    if (zzf2 instanceof zzqa) {
                        return !zzqa.zza.equals(zzf2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zztx.zzf(t, j) != null;
                case 10:
                    return !zzqa.zza.equals(zztx.zzf(t, j));
                case 11:
                    return zztx.zza((Object) t, j) != 0;
                case 12:
                    return zztx.zza((Object) t, j) != 0;
                case 13:
                    return zztx.zza((Object) t, j) != 0;
                case 14:
                    return zztx.zzb(t, j) != 0;
                case 15:
                    return zztx.zza((Object) t, j) != 0;
                case 16:
                    return zztx.zzb(t, j) != 0;
                case 17:
                    return zztx.zzf(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzd2 = zzd(i);
            return (zztx.zza((Object) t, (long) (zzd2 & 1048575)) & (1 << (zzd2 >>> 20))) != 0;
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zztx.zza((Object) t, (long) (zzd(i2) & 1048575)) == i;
    }
}
