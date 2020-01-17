package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.appsflyer.internal.b */
public final class C8762b {

    /* renamed from: ˊ */
    private static char[] f22671 = {'a', 38056, 10728, 48672, 21367, 59319, 31936, 4420, 42564, 14995, 53200, 25831, 63800, 36454, 8891, 47092, 19481, 57608, 30136, 2775, 40724, 13403, 51572, 23970, 62207, 34616, 7269, 45231, 17865, 55808, 28501, 925, 39077, 11764, 21048, '0', 33204, 5490, 43064, 16358, 54008, 26206, 64804, 37002, 10137, 47967, 20014, 58631, 30925, 4014, 41844, 13860, 52702, 24753, 'b', 38055, 10734, 48695, 21369, 59323, 31892, 4447, 42505, 14994, 53129, 25777, 63785, 36460, 8941, 47017, 19540, 57664, 30168, 2775, 40780, 13403, 51504, 24058, 62196, 34671, 7213, 45188, 17818, 55902, 28421, 971, 'a', 38056, 10728, 48672, 21367, 59319, 31936, 4420, 42591, 14981, 53138, 25792, 63785, 36474, 8864, 47103, 19474, 57695, 30113, 2771, 40726, 13407, 51555, 23983, 62178, 'a', 38056, 10728, 48672, 21367, 59319, 31936, 4420, 42584, 14999, 53198, 25830, 63807, 36463, 8870, 47103, 19534, 57717, 30089, 2780, 40715, 13393, 51574, 48800, 10857, 38697, 225, 60854, 22902, 49665, 44933, 6302, 33860, 29011, 55810, 18426, 12470, 40059, 2360, 62197, 24454, 52062, 46104, 'a', 38056, 10728, 48672, 21367, 59319, 31936, 4420, 42590, 14995, 53192, 25772, 63773, 36476, 8893, 57910, 8656, 46436, 'j', 38055, 10746, 48691, 21302, 59319, 31947, 4420, 42564, 15003, 53196, 25830, 63777, 36476, '/', 38053, 10733, 48689, 21360, 59323, 49648, 21810, 59517, 32720, 37557, 9770, 48466, 53402, 26564, 64257, 'C', 38062, 10729, 48689, 21363, 59309, 31953, 4359, 42613, 14990, 53215, 25831, 63800, 36474, 8893, 47093, 19470, 49655, 21782, 59476, 32655, 37580, 9739, 48437, 53423, 26606, 64359, 3690, 42326, 14477, 20383, 58118, 30282, 36274, 8447, 46136, 52003, 24249, 62958, 2241, 39955, 13057, 18064, 56772, 28967, 33905, 7167, 44768, 49715, 22802, 60498, 909, 38615, 10752, 16704, 54459, 27553, 65377, 30364, 57944, 24323, 51424, 9613, 37206, 2603, 26608, 53415, 19553, 47394, 4637, 36850, 63621, 21599, 49421, 15090, 38846, 886, 31805, 59882, 17066, 49041, 11074, 50971, 21494, 61105, 31081, 37931, 8437, 48009, 54879, 24890, 64971, 2178, 41910, 15989, 18741, 58872, 28807, 35648, 9757, 45777, 52634, 22612, 62223, 3635, 39676, 'F', 38055, 10725, 48702, 21373, 59322, 31876, 4355, 42590, 14976, 53203, 25833, 63789, 36398, 8870, 47103, 19462, 57674, 30089, 2769, 40716, 13403, 51552, 24042, 62205, 34611, 7272, 45194, 17863, 55818, 28436, 909, 39081, 11762, 49700, 22322, 60349, 32998, 5383, 43599, 16000, 54210, 26645, 64813, 37478, 9972, 48052};

    /* renamed from: ˎ */
    private static int f22672 = 1;

    /* renamed from: ˏ */
    private static long f22673 = 4593565834691056838L;

    /* renamed from: ॱ */
    private static int f22674;

    /* renamed from: com.appsflyer.internal.b$b */
    public static class C8763b extends HashMap<String, Object> {

        /* renamed from: ˊ */
        private static int f22675 = 0;

        /* renamed from: ˏ */
        private static char[] f22676 = {23999, 50173, 24843, 34661, 9379, 19178, 59429, 3662, 44930, 52690, 29441, 37209, 'b', 40503, 15595, 55969, 31088, 'N', 40458, 15573, 55949, 31046, 5912, 46544, 21415, 'k', 40480, 15596, 24653, 65039, 23752, 47752, 6490, 30486, 54677, 13231, 37478, 61480, 20220, 44206, 2934, 27102, 51076, 9806, 33820, 58014, 16538, 57169, 15657, 39842, 63918, 22653, 46634, 5302, 29534, 53509, 12243, 36242, 60445, 18965, 43251, 1709, 25956, 49972, 8683, 49083, 7802, 31942, 56025, 14598, 33463, 7420, 48688, 22570, 64497, 38332, 14203, 58457, 31251, 55495, 16003, 40287, 62250, 20928, 47017, 5753, 29745, 51941, 10380, 36706, 60874, 17308, 5656, 34887, 10903, 52435, 28438, 326, 6774, 33900, 9906, 49338, 25445, 260, 40774, 15745, 56257, 30739, 5727, 46300, 21222, 62255, 37217, 12213, 52711, 27199, 2199, 42701, 18183, 58709, 33751, 8659, 48664, 23648, 64235, 39162, 14640, 55158, 30122, 4613, 45061, 20121, 60634, 36096, 11089, 51682, 26594, 1072, 41582, 16563, 57067, 32552, 7560, 48069, 22529, 62986, 38101, 'b', 40484, 15592, 55978, 31093, 5948, 46510, 21462, 61980, 36957, 11990, 52430, 27405, 2535, 42996, 17979, 58465, 33453, 15419, 41585, 180, 59111, 17697, 11114, 35232, 28567, 52763, 44121, 4764, 61640, 22280, 13743, 39858, 31280, 55401, 48827, 7401, 33578, 24912, 51165, 42486, 1064, 60022, 18611, 12061, 36175, 29583, 53716, 45071, 5705, 62651, 23281, 14647, 40816, 32170, 8698, 49070, 7529, 64305, 22783, 13989, 38001, 29209, 54227, 45457, 3929, 'x', 40573, 15548, 's', 40480, 15588, 55996, 31099, 5931, 'b', '&', 40509, 19706, 53994, 18368, 55763, 'f', 40565, 15611, 56063, 31077, 5992, 46574, 21458, 62040, 36959, 11904, 52372, 27476, 2549, 42919, 18022};

        /* renamed from: ॱ */
        private static long f22677 = 4506141479738187333L;

        /* renamed from: ᐝ */
        private static int f22678 = 1;

        /* renamed from: ˋ */
        private final Map<String, Object> f22679;

        /* renamed from: ˎ */
        private final Context f22680;

        /* renamed from: com.appsflyer.internal.b$b$a */
        public static class C8764a {

            /* renamed from: ˋ */
            public String f22681;

            /* renamed from: ˎ */
            public long f22682;

            /* renamed from: ˏ */
            private final Object f22683;

            C8764a() {
            }

            /* renamed from: ˊ */
            public static C8764a m20718(String str) {
                String str2 = "";
                if (str == null) {
                    return new C8764a(0, str2);
                }
                String[] split = str.split(",");
                if (split.length < 2) {
                    return new C8764a(0, str2);
                }
                return new C8764a(Long.parseLong(split[0]), split[1]);
            }

            /* renamed from: ˋ */
            static byte[] m20719(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            /* renamed from: ˎ */
            static String m20720(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bArr) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = "0".concat(String.valueOf(hexString2));
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22682);
                sb.append(",");
                sb.append(this.f22681);
                return sb.toString();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
                return false;
             */
            /* renamed from: ॱ */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean mo23787(long r9, java.lang.String r11) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f22683
                    monitor-enter(r0)
                    r1 = 0
                    if (r11 == 0) goto L_0x0027
                    java.lang.String r2 = r8.f22681     // Catch:{ all -> 0x0024 }
                    boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0024 }
                    if (r2 != 0) goto L_0x0027
                    long r2 = r8.f22682     // Catch:{ all -> 0x0024 }
                    long r2 = r9 - r2
                    r4 = 2000(0x7d0, double:9.88E-321)
                    r6 = 1
                    int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x001b
                    r2 = 1
                    goto L_0x001c
                L_0x001b:
                    r2 = 0
                L_0x001c:
                    if (r2 == 0) goto L_0x0027
                    r8.f22682 = r9     // Catch:{ all -> 0x0024 }
                    r8.f22681 = r11     // Catch:{ all -> 0x0024 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                    return r6
                L_0x0024:
                    r9 = move-exception
                    monitor-exit(r0)
                    throw r9
                L_0x0027:
                    monitor-exit(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8762b.C8763b.C8764a.mo23787(long, java.lang.String):boolean");
            }

            public C8764a(long j, String str) {
                this.f22683 = new Object();
                this.f22682 = 0;
                this.f22681 = "";
                this.f22682 = j;
                this.f22681 = str;
            }

            public C8764a(String str) {
                this(System.currentTimeMillis(), str);
            }
        }

        public C8763b(Map<String, Object> map, Context context) {
            this.f22679 = map;
            this.f22680 = context;
            put(m20714(), m20715());
        }

        /* renamed from: ˊ */
        private String m20714() {
            int i = f22675 + 15;
            f22678 = i % 128;
            int i2 = i % 2;
            try {
                String num = Integer.toString(VERSION.SDK_INT);
                String obj = this.f22679.get(m20716(0, 24030, 12).intern()).toString();
                String obj2 = this.f22679.get(m20716(12, 0, 5).intern()).toString();
                if (obj2 == null) {
                    int i3 = f22675 + 55;
                    f22678 = i3 % 128;
                    obj2 = (i3 % 2 == 0 ? m20716(24, 0, 96) : m20716(17, 0, 8)).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder r3 = m20717(num, obj2, sb.toString());
                int length = r3.length();
                if ((length > 4 ? '?' : 'R') != '?') {
                    while (true) {
                        if (!(length < 4)) {
                            break;
                        }
                        length++;
                        r3.append('1');
                    }
                } else {
                    r3.delete(4, length);
                }
                r3.insert(0, m20716(25, 0, 3).intern());
                String obj3 = r3.toString();
                int i4 = f22678 + 89;
                f22675 = i4 % 128;
                if (i4 % 2 == 0) {
                    return obj3;
                }
                int i5 = 50 / 0;
                return obj3;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m20716(28, 24619, 42).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return m20716(70, 33500, 7).intern();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x021b A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0221 A[RETURN] */
        /* renamed from: ˋ */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m20715() {
            /*
                r15 = this;
                java.lang.String r0 = ""
                r1 = 5
                r2 = 6
                r3 = 16
                r4 = 44
                r5 = 354(0x162, float:4.96E-43)
                r6 = 103(0x67, float:1.44E-43)
                r7 = 0
                java.util.Map<java.lang.String, java.lang.Object> r8 = r15.f22679     // Catch:{ Exception -> 0x0082 }
                r9 = 24030(0x5dde, float:3.3673E-41)
                r10 = 12
                java.lang.String r9 = m20716(r7, r9, r10)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r9 = r9.intern()     // Catch:{ Exception -> 0x0082 }
                java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0082 }
                java.util.Map<java.lang.String, java.lang.Object> r9 = r15.f22679     // Catch:{ Exception -> 0x0082 }
                r10 = 77
                r11 = 58431(0xe43f, float:8.1879E-41)
                r12 = 15
                java.lang.String r10 = m20716(r10, r11, r12)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r10 = r10.intern()     // Catch:{ Exception -> 0x0082 }
                java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0082 }
                r10 = 92
                r11 = 5676(0x162c, float:7.954E-42)
                java.lang.String r10 = m20716(r10, r11, r2)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r10 = r10.intern()     // Catch:{ Exception -> 0x0082 }
                r11 = 98
                r12 = 6747(0x1a5b, float:9.455E-42)
                java.lang.String r11 = m20716(r11, r12, r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r11 = r11.intern()     // Catch:{ Exception -> 0x0082 }
                java.lang.String r10 = r10.replaceAll(r11, r0)     // Catch:{ Exception -> 0x0082 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                r11.<init>()     // Catch:{ Exception -> 0x0082 }
                r11.append(r8)     // Catch:{ Exception -> 0x0082 }
                r11.append(r9)     // Catch:{ Exception -> 0x0082 }
                r11.append(r10)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r8 = r11.toString()     // Catch:{ Exception -> 0x0082 }
                java.lang.String r8 = com.appsflyer.internal.C8757ad.m20696(r8)     // Catch:{ Exception -> 0x0082 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                r9.<init>()     // Catch:{ Exception -> 0x0082 }
                r9.append(r0)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r8 = r8.substring(r7, r3)     // Catch:{ Exception -> 0x0082 }
                r9.append(r8)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x0082 }
                goto L_0x00b8
            L_0x0082:
                r8 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = m20716(r6, r5, r4)
                java.lang.String r10 = r10.intern()
                r9.append(r10)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                com.appsflyer.AFLogger.afRDLog(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r0)
                r0 = 147(0x93, float:2.06E-43)
                r9 = 18
                java.lang.String r0 = m20716(r0, r7, r9)
                java.lang.String r0 = r0.intern()
                r8.append(r0)
                java.lang.String r0 = r8.toString()
            L_0x00b8:
                r8 = 0
                r9 = 2
                android.content.Context r10 = r15.f22680     // Catch:{ Exception -> 0x01dc }
                android.content.IntentFilter r11 = new android.content.IntentFilter     // Catch:{ Exception -> 0x01dc }
                r12 = 165(0xa5, float:2.31E-43)
                r13 = 15450(0x3c5a, float:2.165E-41)
                r14 = 37
                java.lang.String r12 = m20716(r12, r13, r14)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r12 = r12.intern()     // Catch:{ Exception -> 0x01dc }
                r11.<init>(r12)     // Catch:{ Exception -> 0x01dc }
                android.content.Intent r10 = r10.registerReceiver(r8, r11)     // Catch:{ Exception -> 0x01dc }
                r11 = 66
                if (r10 == 0) goto L_0x00d8
                goto L_0x00da
            L_0x00d8:
                r1 = 66
            L_0x00da:
                r12 = -2700(0xfffffffffffff574, float:NaN)
                if (r1 == r11) goto L_0x0117
                int r1 = f22678
                int r1 = r1 + 33
                int r11 = r1 % 128
                f22675 = r11
                int r1 = r1 % r9
                r11 = 4
                if (r1 == 0) goto L_0x00ec
                r1 = 4
                goto L_0x00ee
            L_0x00ec:
                r1 = 23
            L_0x00ee:
                r13 = 8590(0x218e, float:1.2037E-41)
                if (r1 == r11) goto L_0x0104
                r1 = 202(0xca, float:2.83E-43)
                r11 = 11
                java.lang.String r1 = m20716(r1, r13, r11)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = r1.intern()     // Catch:{ Exception -> 0x01dc }
                int r1 = r10.getIntExtra(r1, r12)     // Catch:{ Exception -> 0x01dc }
            L_0x0102:
                r12 = r1
                goto L_0x0117
            L_0x0104:
                r1 = 8387(0x20c3, float:1.1753E-41)
                r11 = 71
                java.lang.String r1 = m20716(r1, r13, r11)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = r1.intern()     // Catch:{ Exception -> 0x01dc }
                r11 = 6060(0x17ac, float:8.492E-42)
                int r1 = r10.getIntExtra(r1, r11)     // Catch:{ Exception -> 0x01dc }
                goto L_0x0102
            L_0x0117:
                android.content.Context r1 = r15.f22680     // Catch:{ Exception -> 0x01dc }
                android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = r1.nativeLibraryDir     // Catch:{ Exception -> 0x01dc }
                if (r1 == 0) goto L_0x0124
                r10 = 78
                goto L_0x0126
            L_0x0124:
                r10 = 47
            L_0x0126:
                r11 = 78
                if (r10 == r11) goto L_0x012b
                goto L_0x0147
            L_0x012b:
                r10 = 213(0xd5, float:2.98E-43)
                r11 = 3
                java.lang.String r10 = m20716(r10, r7, r11)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r10 = r10.intern()     // Catch:{ Exception -> 0x01dc }
                boolean r1 = r1.contains(r10)     // Catch:{ Exception -> 0x01dc }
                if (r1 == 0) goto L_0x0147
                int r1 = f22675
                int r1 = r1 + 101
                int r10 = r1 % 128
                f22678 = r10
                int r1 = r1 % r9
                r1 = 1
                goto L_0x0148
            L_0x0147:
                r1 = 0
            L_0x0148:
                android.content.Context r10 = r15.f22680     // Catch:{ Exception -> 0x01dc }
                r11 = 216(0xd8, float:3.03E-43)
                java.lang.String r2 = m20716(r11, r7, r2)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r2 = r2.intern()     // Catch:{ Exception -> 0x01dc }
                java.lang.Object r2 = r10.getSystemService(r2)     // Catch:{ Exception -> 0x01dc }
                android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2     // Catch:{ Exception -> 0x01dc }
                r10 = -1
                java.util.List r2 = r2.getSensorList(r10)     // Catch:{ Exception -> 0x01dc }
                int r2 = r2.size()     // Catch:{ Exception -> 0x01dc }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc }
                r10.<init>()     // Catch:{ Exception -> 0x01dc }
                r11 = 222(0xde, float:3.11E-43)
                r13 = 1
                java.lang.String r11 = m20716(r11, r7, r13)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r11 = r11.intern()     // Catch:{ Exception -> 0x01dc }
                r10.append(r11)     // Catch:{ Exception -> 0x01dc }
                r10.append(r12)     // Catch:{ Exception -> 0x01dc }
                r11 = 223(0xdf, float:3.12E-43)
                java.lang.String r11 = m20716(r11, r7, r9)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r11 = r11.intern()     // Catch:{ Exception -> 0x01dc }
                r10.append(r11)     // Catch:{ Exception -> 0x01dc }
                r10.append(r1)     // Catch:{ Exception -> 0x01dc }
                r1 = 225(0xe1, float:3.15E-43)
                r11 = 19676(0x4cdc, float:2.7572E-41)
                java.lang.String r1 = m20716(r1, r11, r9)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = r1.intern()     // Catch:{ Exception -> 0x01dc }
                r10.append(r1)     // Catch:{ Exception -> 0x01dc }
                r10.append(r2)     // Catch:{ Exception -> 0x01dc }
                r1 = 227(0xe3, float:3.18E-43)
                r2 = 18406(0x47e6, float:2.5792E-41)
                java.lang.String r1 = m20716(r1, r2, r9)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = r1.intern()     // Catch:{ Exception -> 0x01dc }
                r10.append(r1)     // Catch:{ Exception -> 0x01dc }
                java.util.Map<java.lang.String, java.lang.Object> r1 = r15.f22679     // Catch:{ Exception -> 0x01dc }
                int r1 = r1.size()     // Catch:{ Exception -> 0x01dc }
                r10.append(r1)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = r10.toString()     // Catch:{ Exception -> 0x01dc }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc }
                r2.<init>()     // Catch:{ Exception -> 0x01dc }
                r2.append(r0)     // Catch:{ Exception -> 0x01dc }
                byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x01dc }
                byte[] r1 = com.appsflyer.internal.C8762b.C8763b.C8764a.m20719(r1)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r1 = com.appsflyer.internal.C8762b.C8763b.C8764a.m20720(r1)     // Catch:{ Exception -> 0x01dc }
                r2.append(r1)     // Catch:{ Exception -> 0x01dc }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x01dc }
                int r1 = f22678
                int r1 = r1 + 53
                int r2 = r1 % 128
                f22675 = r2
                int r1 = r1 % r9
                goto L_0x0210
            L_0x01dc:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = m20716(r6, r5, r4)
                java.lang.String r4 = r4.intern()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.appsflyer.AFLogger.afRDLog(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r0 = 229(0xe5, float:3.21E-43)
                java.lang.String r0 = m20716(r0, r7, r3)
                java.lang.String r0 = r0.intern()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L_0x0210:
                int r1 = f22675
                int r1 = r1 + 109
                int r2 = r1 % 128
                f22678 = r2
                int r1 = r1 % r9
                if (r1 != 0) goto L_0x0221
                super.hashCode()     // Catch:{ all -> 0x021f }
                return r0
            L_0x021f:
                r0 = move-exception
                throw r0
            L_0x0221:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8762b.C8763b.m20715():java.lang.String");
        }

        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Number] */
        /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r8v8 */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
            r2.append(java.lang.Integer.toHexString(r8.intValue()));
            r5 = r5 + 1;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: ॱ */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.StringBuilder m20717(java.lang.String... r11) throws java.lang.Exception {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = 0
            L_0x0007:
                r3 = 3
                r4 = 1
                if (r2 >= r3) goto L_0x0045
                int r3 = f22675
                int r3 = r3 + 45
                int r5 = r3 % 128
                f22678 = r5
                int r3 = r3 % 2
                if (r3 != 0) goto L_0x0018
                goto L_0x0019
            L_0x0018:
                r4 = 0
            L_0x0019:
                if (r4 == 0) goto L_0x002b
                r3 = r11[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 105
                goto L_0x003a
            L_0x002b:
                r3 = r11[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 1
            L_0x003a:
                int r3 = f22678
                int r3 = r3 + 73
                int r4 = r3 % 128
                f22675 = r4
                int r3 = r3 % 2
                goto L_0x0007
            L_0x0045:
                java.util.Collections.sort(r0)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r5 = 0
            L_0x0058:
                if (r5 >= r0) goto L_0x0096
                r6 = 0
                r8 = r6
                r7 = 0
            L_0x005d:
                if (r7 >= r3) goto L_0x0061
                r9 = 1
                goto L_0x0062
            L_0x0061:
                r9 = 0
            L_0x0062:
                if (r9 == r4) goto L_0x0072
                int r6 = r8.intValue()
                java.lang.String r6 = java.lang.Integer.toHexString(r6)
                r2.append(r6)
                int r5 = r5 + 1
                goto L_0x0058
            L_0x0072:
                r9 = r11[r7]
                char r9 = r9.charAt(r5)
                if (r8 != 0) goto L_0x008a
                int r8 = f22675
                int r8 = r8 + 69
                int r10 = r8 % 128
                f22678 = r10
                int r8 = r8 % 2
                if (r8 != 0) goto L_0x008f
                int r8 = r6.length     // Catch:{ all -> 0x0088 }
                goto L_0x008f
            L_0x0088:
                r11 = move-exception
                throw r11
            L_0x008a:
                int r8 = r8.intValue()
                r9 = r9 ^ r8
            L_0x008f:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                int r7 = r7 + 1
                goto L_0x005d
            L_0x0096:
                int r11 = f22678
                int r11 = r11 + 93
                int r0 = r11 % 128
                f22675 = r0
                int r11 = r11 % 2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8762b.C8763b.m20717(java.lang.String[]):java.lang.StringBuilder");
        }

        /* renamed from: ˋ */
        private static String m20716(int i, char c, int i2) {
            int i3 = f22675 + 63;
            f22678 = i3 % 128;
            if (i3 % 2 == 0) {
            }
            char[] cArr = new char[i2];
            int i4 = 0;
            while (true) {
                if (!(i4 < i2)) {
                    return new String(cArr);
                }
                int i5 = f22678 + 33;
                f22675 = i5 % 128;
                int i6 = i5 % 2;
                cArr[i4] = (char) ((int) ((((long) f22676[i + i4]) ^ (((long) i4) * f22677)) ^ ((long) c)));
                i4++;
            }
        }
    }

    C8762b() {
    }

    /* renamed from: ˋ */
    private static String m20706(int i, char c, int i2) {
        int i3 = f22672 + 89;
        f22674 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                return new String(cArr);
            }
            cArr[i4] = (char) ((int) ((((long) f22671[i + i4]) ^ (((long) i4) * f22673)) ^ ((long) c)));
            i4++;
            int i5 = f22674 + 55;
            f22672 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* renamed from: ˎ */
    private static String m20708(String str) {
        int i = f22672 + 69;
        f22674 = i % 128;
        if (!(i % 2 != 0) ? !str.contains(m20706(169, 57880, 1).intern()) : !str.contains(m20706(26780, 57880, 0).intern())) {
            return str;
        }
        String[] split = str.split(m20706(170, 8588, 2).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i2 = length - 1;
        sb.append(split[i2]);
        sb.append(m20706(169, 57880, 1).intern());
        int i3 = f22672 + 15;
        f22674 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        for (int i4 = 1; i4 < i2; i4++) {
            int i5 = f22672 + 55;
            f22674 = i5 % 128;
            int i6 = i5 % 2;
            sb.append(split[i4]);
            sb.append(m20706(169, 57880, 1).intern());
        }
        sb.append(split[0]);
        return sb.toString();
    }

    /* renamed from: ˏ */
    public static String m20709(Context context, long j) {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb2.append((m20713(m20706(0, 0, 34).intern()) ? m20706(34, 21001, 1) : m20706(35, 0, 1)).intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String r10 = m20708(packageName);
        sb2.append(m20706(34, 21001, 1).intern());
        sb4.append(r10);
        if ((m20707(context) == null ? (char) 25 : 19) != 19) {
            int i = f22672 + 25;
            f22674 = i % 128;
            int i2 = i % 2;
            sb2.append(m20706(35, 0, 1).intern());
            sb4.append(packageName);
        } else {
            sb2.append(m20706(34, 21001, 1).intern());
            sb4.append(packageName);
        }
        String r102 = m20710(context);
        if (r102 == null) {
            sb2.append(m20706(35, 0, 1).intern());
            sb4.append(packageName);
        } else {
            sb2.append(m20706(34, 21001, 1).intern());
            sb4.append(r102);
        }
        Context context2 = context;
        sb4.append(m20711(context, packageName));
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(m20706(36, 33229, 18).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb.append(j);
            sb3.append((!(!m20713(m20706(86, 0, 25).intern())) ? m20706(34, 21001, 1) : m20706(35, 0, 1)).intern());
            char c = 23;
            if (m20713(m20706(111, 0, 23).intern())) {
                int i3 = f22674 + 83;
                f22672 = i3 % 128;
                int i4 = i3 % 2;
                str = m20706(34, 21001, 1);
            } else {
                str = m20706(35, 0, 1);
            }
            sb3.append(str.intern());
            if (!m20713(m20706(134, 48833, 20).intern())) {
                c = 14;
            }
            sb3.append((c != 14 ? m20706(34, 21001, 1) : m20706(35, 0, 1)).intern());
            sb3.append((m20713(m20706(154, 0, 15).intern()) ? m20706(34, 21001, 1) : m20706(35, 0, 1)).intern());
            String r0 = C8757ad.m20695(C8757ad.m20696(sb.toString()));
            String obj = sb2.toString();
            StringBuilder sb5 = new StringBuilder(r0);
            sb5.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
            String obj2 = sb5.toString();
            String obj3 = sb3.toString();
            StringBuilder sb6 = new StringBuilder(obj2);
            sb6.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
            return m20712(sb6.toString(), Long.valueOf(j));
        } catch (NameNotFoundException unused) {
            return m20706(54, 0, 32).intern();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r9 != null ? 24 : '9') != '9') goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if ((r9 != null) != true) goto L_0x00c4;
     */
    /* renamed from: ॱ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m20712(java.lang.String r8, java.lang.Long r9) {
        /*
            r0 = 32
            r1 = 0
            if (r8 == 0) goto L_0x00c4
            int r2 = f22672
            int r2 = r2 + 21
            int r3 = r2 % 128
            f22674 = r3
            int r2 = r2 % 2
            r3 = 1
            if (r2 == 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 == r3) goto L_0x0023
            r2 = 57
            if (r9 == 0) goto L_0x001e
            r4 = 24
            goto L_0x0020
        L_0x001e:
            r4 = 57
        L_0x0020:
            if (r4 == r2) goto L_0x00c4
            goto L_0x002f
        L_0x0023:
            r2 = 33
            int r2 = r2 / r1
            if (r9 == 0) goto L_0x002a
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            if (r2 == r3) goto L_0x002f
            goto L_0x00c4
        L_0x002f:
            int r2 = r8.length()
            if (r2 != r0) goto L_0x00c4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            java.lang.String r8 = r9.toString()
            r4 = 0
            int r9 = f22674
            int r9 = r9 + 29
            int r0 = r9 % 128
            f22672 = r0
            int r9 = r9 % 2
            if (r9 != 0) goto L_0x004e
            r9 = 0
            goto L_0x004f
        L_0x004e:
            r9 = 1
        L_0x004f:
            r9 = 0
            r0 = 0
        L_0x0051:
            int r6 = r8.length()
            if (r9 >= r6) goto L_0x0063
            char r6 = r8.charAt(r9)
            int r6 = java.lang.Character.getNumericValue(r6)
            int r0 = r0 + r6
            int r9 = r9 + 1
            goto L_0x0051
        L_0x0063:
            java.lang.String r8 = java.lang.Integer.toHexString(r0)
            int r9 = r8.length()
            r0 = 7
            int r9 = r9 + r0
            r2.replace(r0, r9, r8)
            int r8 = f22674
            int r8 = r8 + 73
            int r9 = r8 % 128
            f22672 = r9
            int r8 = r8 % 2
            r8 = 0
        L_0x007b:
            int r9 = r2.length()
            if (r8 >= r9) goto L_0x0083
            r9 = 1
            goto L_0x0084
        L_0x0083:
            r9 = 0
        L_0x0084:
            if (r9 == 0) goto L_0x0093
            char r9 = r2.charAt(r8)
            int r9 = java.lang.Character.getNumericValue(r9)
            long r6 = (long) r9
            long r4 = r4 + r6
            int r8 = r8 + 1
            goto L_0x007b
        L_0x0093:
            r8 = 64
            r6 = 100
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x009e
            r9 = 64
            goto L_0x00a0
        L_0x009e:
            r9 = 51
        L_0x00a0:
            if (r9 == r8) goto L_0x00c0
            int r8 = (int) r4
            r9 = 23
            r2.insert(r9, r8)
            r6 = 10
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00bb
            r8 = 35
            java.lang.String r8 = m20706(r8, r1, r3)
            java.lang.String r8 = r8.intern()
            r2.insert(r9, r8)
        L_0x00bb:
            java.lang.String r8 = r2.toString()
            return r8
        L_0x00c0:
            long r4 = r4 % r6
            goto L_0x0093
        L_0x00c2:
            r8 = move-exception
            throw r8
        L_0x00c4:
            r8 = 54
            java.lang.String r8 = m20706(r8, r1, r0)
            java.lang.String r8 = r8.intern()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8762b.m20712(java.lang.String, java.lang.Long):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if ((java.lang.System.getProperties().containsKey(m20706(172, 0, 14).intern()) ? (char) 18 : 19) != 19) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if ((!java.lang.System.getProperties().containsKey(m20706(25432, 0, 125).intern())) != false) goto L_0x00e9;
     */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m20707(android.content.Context r9) {
        /*
            int r0 = f22672
            r1 = 1
            int r0 = r0 + r1
            int r2 = r0 % 128
            f22674 = r2
            int r0 = r0 % 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x002b
            java.util.Properties r0 = java.lang.System.getProperties()
            r4 = 25432(0x6358, float:3.5638E-41)
            r5 = 125(0x7d, float:1.75E-43)
            java.lang.String r4 = m20706(r4, r3, r5)
            java.lang.String r4 = r4.intern()
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x004a
            goto L_0x00e9
        L_0x002b:
            java.util.Properties r0 = java.lang.System.getProperties()
            r4 = 172(0xac, float:2.41E-43)
            r5 = 14
            java.lang.String r4 = m20706(r4, r3, r5)
            java.lang.String r4 = r4.intern()
            boolean r0 = r0.containsKey(r4)
            r4 = 19
            if (r0 == 0) goto L_0x0046
            r0 = 18
            goto L_0x0048
        L_0x0046:
            r0 = 19
        L_0x0048:
            if (r0 == r4) goto L_0x00e9
        L_0x004a:
            int r0 = f22672
            int r0 = r0 + 113
            int r4 = r0 % 128
            f22674 = r4
            int r0 = r0 % 2
            java.io.File r9 = r9.getCacheDir()     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = r9.getPath()     // Catch:{ Exception -> 0x009a }
            r0 = 186(0xba, float:2.6E-43)
            r4 = 6
            java.lang.String r0 = m20706(r0, r3, r4)     // Catch:{ Exception -> 0x009a }
            java.lang.String r0 = r0.intern()     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = ""
            java.lang.String r9 = r9.replace(r0, r4)     // Catch:{ Exception -> 0x009a }
            r0 = 192(0xc0, float:2.69E-43)
            r4 = 49630(0xc1de, float:6.9546E-41)
            r5 = 10
            java.lang.String r0 = m20706(r0, r4, r5)     // Catch:{ Exception -> 0x009a }
            java.lang.String r0 = r0.intern()     // Catch:{ Exception -> 0x009a }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x009a }
            java.util.regex.Matcher r9 = r0.matcher(r9)     // Catch:{ Exception -> 0x009a }
            boolean r0 = r9.find()     // Catch:{ Exception -> 0x009a }
            if (r0 == 0) goto L_0x00e9
            int r0 = f22674
            int r0 = r0 + 39
            int r4 = r0 % 128
            f22672 = r4
            int r0 = r0 % 2
            java.lang.String r9 = r9.group(r1)     // Catch:{ Exception -> 0x009a }
            r2 = r9
            goto L_0x00e9
        L_0x009a:
            r9 = move-exception
            com.appsflyer.internal.aa r0 = com.appsflyer.internal.C8752aa.f22603
            if (r0 != 0) goto L_0x00a6
            com.appsflyer.internal.aa r0 = new com.appsflyer.internal.aa
            r0.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r0
        L_0x00a6:
            com.appsflyer.internal.aa r0 = com.appsflyer.internal.C8752aa.f22603
            r4 = 202(0xca, float:2.83E-43)
            r5 = 17
            java.lang.String r4 = m20706(r4, r3, r5)
            java.lang.String r4 = r4.intern()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 219(0xdb, float:3.07E-43)
            r7 = 49585(0xc1b1, float:6.9483E-41)
            r8 = 41
            java.lang.String r6 = m20706(r6, r7, r8)
            java.lang.String r6 = r6.intern()
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r3] = r9
            r0.mo23772(r2, r4, r5)
            int r9 = f22672
            int r9 = r9 + 87
            int r0 = r9 % 128
            f22674 = r0
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x00e9
            int r1 = r1 / r3
            return r2
        L_0x00e7:
            r9 = move-exception
            throw r9
        L_0x00e9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8762b.m20707(android.content.Context):java.lang.String");
    }

    /* renamed from: ॱ */
    private static boolean m20713(String str) {
        int i = f22672 + 7;
        f22674 = i % 128;
        int i2 = i % 2;
        try {
            Class.forName(str);
            int i3 = f22672 + 53;
            f22674 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ॱ */
    private static String m20710(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i = f22672 + 11;
            f22674 = i % 128;
            int i2 = i % 2;
            int i3 = f22672 + 111;
            f22674 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ॱ */
    private static String m20711(Context context, String str) {
        String str2 = null;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(m20706(260, 30459, 24).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{Integer.valueOf(0)})).iterator();
            while (it.hasNext()) {
                int i = f22674 + 39;
                f22672 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 57 / 0;
                    if (!((ApplicationInfo) it.next()).packageName.equals(str)) {
                    }
                } else if (((ApplicationInfo) it.next()).packageName.equals(str)) {
                }
                String obj = Boolean.TRUE.toString();
                int i3 = f22674 + 99;
                f22672 = i3 % 128;
                if ((i3 % 2 == 0 ? '3' : 5) != '3') {
                    return obj;
                }
                super.hashCode();
                return obj;
            }
        } catch (IllegalAccessException e) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa aaVar = C8752aa.f22603;
            String intern = m20706(284, 51032, 24).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m20706(308, 0, 47).intern());
            sb.append(e);
            aaVar.mo23772(str2, intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
                int i4 = f22672 + 111;
                f22674 = i4 % 128;
                if (i4 % 2 != 0) {
                }
            }
            C8752aa aaVar2 = C8752aa.f22603;
            String intern2 = m20706(284, 51032, 24).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m20706(308, 0, 47).intern());
            sb2.append(e2);
            aaVar2.mo23772(str2, intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa aaVar3 = C8752aa.f22603;
            String intern3 = m20706(284, 51032, 24).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m20706(308, 0, 47).intern());
            sb3.append(e3);
            aaVar3.mo23772(str2, intern3, sb3.toString());
        }
        return Boolean.FALSE.toString();
    }
}
