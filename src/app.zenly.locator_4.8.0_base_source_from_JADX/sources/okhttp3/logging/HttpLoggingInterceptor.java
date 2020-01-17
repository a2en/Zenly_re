package okhttp3.logging;

import java.io.EOFException;
import java.nio.charset.Charset;
import okhttp3.C13317r;
import okhttp3.Interceptor;
import okhttp3.p418f0.p420h.C13202e;
import okio.C13342c;

public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: c */
    private static final Charset f34421c = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Logger f34422a;

    /* renamed from: b */
    private volatile C13310a f34423b;

    public interface Logger {

        /* renamed from: a */
        public static final Logger f34424a = new C13309a();

        /* renamed from: okhttp3.logging.HttpLoggingInterceptor$Logger$a */
        class C13309a implements Logger {
            C13309a() {
            }

            public void log(String str) {
                C13202e.m34581d().mo37897a(4, str, (Throwable) null);
            }
        }

        void log(String str);
    }

    /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public enum C13310a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public HttpLoggingInterceptor() {
        this(Logger.f34424a);
    }

    /* renamed from: a */
    public HttpLoggingInterceptor mo38235a(C13310a aVar) {
        if (aVar != null) {
            this.f34423b = aVar;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x0334  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.C13167a0 intercept(okhttp3.Interceptor.Chain r22) throws java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f34423b
            okhttp3.y r3 = r22.request()
            okhttp3.logging.HttpLoggingInterceptor$a r4 = okhttp3.logging.HttpLoggingInterceptor.C13310a.NONE
            if (r2 != r4) goto L_0x0013
            okhttp3.a0 r0 = r0.proceed(r3)
            return r0
        L_0x0013:
            okhttp3.logging.HttpLoggingInterceptor$a r4 = okhttp3.logging.HttpLoggingInterceptor.C13310a.BODY
            r5 = 1
            if (r2 != r4) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != 0) goto L_0x0024
            okhttp3.logging.HttpLoggingInterceptor$a r7 = okhttp3.logging.HttpLoggingInterceptor.C13310a.HEADERS
            if (r2 != r7) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            okhttp3.z r7 = r3.mo38382a()
            if (r7 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            okhttp3.Connection r8 = r22.connection()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "--> "
            r9.append(r10)
            java.lang.String r10 = r3.mo38387e()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            okhttp3.s r11 = r3.mo38389g()
            r9.append(r11)
            java.lang.String r11 = ""
            if (r8 == 0) goto L_0x0068
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " "
            r12.append(r13)
            okhttp3.w r8 = r8.protocol()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L_0x0069
        L_0x0068:
            r8 = r11
        L_0x0069:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "-byte body)"
            java.lang.String r12 = " ("
            if (r2 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            long r14 = r7.mo32976a()
            r13.append(r14)
            r13.append(r9)
            java.lang.String r8 = r13.toString()
        L_0x0091:
            okhttp3.logging.HttpLoggingInterceptor$Logger r13 = r1.f34422a
            r13.log(r8)
            java.lang.String r8 = "-byte body omitted)"
            java.lang.String r13 = ": "
            if (r2 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x00e2
            okhttp3.t r16 = r7.mo32978b()
            if (r16 == 0) goto L_0x00be
            okhttp3.logging.HttpLoggingInterceptor$Logger r6 = r1.f34422a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Type: "
            r10.append(r14)
            okhttp3.t r14 = r7.mo32978b()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.log(r10)
        L_0x00be:
            long r14 = r7.mo32976a()
            r17 = -1
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x00e2
            okhttp3.logging.HttpLoggingInterceptor$Logger r6 = r1.f34422a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Length: "
            r10.append(r14)
            long r14 = r7.mo32976a()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.log(r10)
        L_0x00e2:
            okhttp3.r r6 = r3.mo38385c()
            int r10 = r6.mo38266c()
            r14 = 0
        L_0x00eb:
            if (r14 >= r10) goto L_0x012a
            java.lang.String r15 = r6.mo38260a(r14)
            r19 = r10
            java.lang.String r10 = "Content-Type"
            boolean r10 = r10.equalsIgnoreCase(r15)
            if (r10 != 0) goto L_0x0121
            java.lang.String r10 = "Content-Length"
            boolean r10 = r10.equalsIgnoreCase(r15)
            if (r10 != 0) goto L_0x0121
            okhttp3.logging.HttpLoggingInterceptor$Logger r10 = r1.f34422a
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r13)
            java.lang.String r15 = r6.mo38263b(r14)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r10.log(r2)
            goto L_0x0123
        L_0x0121:
            r20 = r2
        L_0x0123:
            int r14 = r14 + 1
            r10 = r19
            r2 = r20
            goto L_0x00eb
        L_0x012a:
            r20 = r2
            java.lang.String r2 = "--> END "
            if (r4 == 0) goto L_0x01d5
            if (r5 != 0) goto L_0x0134
            goto L_0x01d5
        L_0x0134:
            okhttp3.r r5 = r3.mo38385c()
            boolean r5 = r1.m35056a(r5)
            if (r5 == 0) goto L_0x015d
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.mo38387e()
            r6.append(r2)
            java.lang.String r2 = " (encoded body omitted)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x015d:
            okio.c r5 = new okio.c
            r5.<init>()
            r7.mo32977a(r5)
            java.nio.charset.Charset r6 = f34421c
            okhttp3.t r10 = r7.mo32978b()
            if (r10 == 0) goto L_0x0173
            java.nio.charset.Charset r6 = f34421c
            java.nio.charset.Charset r6 = r10.mo38315a(r6)
        L_0x0173:
            okhttp3.logging.HttpLoggingInterceptor$Logger r10 = r1.f34422a
            r10.log(r11)
            boolean r10 = m35057a(r5)
            if (r10 == 0) goto L_0x01ad
            okhttp3.logging.HttpLoggingInterceptor$Logger r10 = r1.f34422a
            java.lang.String r5 = r5.readString(r6)
            r10.log(r5)
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.mo38387e()
            r6.append(r2)
            r6.append(r12)
            long r14 = r7.mo32976a()
            r6.append(r14)
            r6.append(r9)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x01ad:
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.mo38387e()
            r6.append(r2)
            java.lang.String r2 = " (binary "
            r6.append(r2)
            long r14 = r7.mo32976a()
            r6.append(r14)
            r6.append(r8)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x01d5:
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.mo38387e()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x01ee:
            r20 = r2
        L_0x01f0:
            long r5 = java.lang.System.nanoTime()
            okhttp3.a0 r0 = r0.proceed(r3)     // Catch:{ Exception -> 0x03d8 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 - r5
            long r2 = r2.toMillis(r14)
            okhttp3.b0 r5 = r0.mo37789a()
            long r6 = r5.mo37827d()
            r14 = -1
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0223
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r14 = "-byte"
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            goto L_0x0225
        L_0x0223:
            java.lang.String r10 = "unknown-length"
        L_0x0225:
            okhttp3.logging.HttpLoggingInterceptor$Logger r14 = r1.f34422a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r9
            java.lang.String r9 = "<-- "
            r15.append(r9)
            int r9 = r0.mo37793d()
            r15.append(r9)
            java.lang.String r9 = r0.mo37797h()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x024a
            r18 = r6
            r7 = r11
            r6 = 32
            goto L_0x0261
        L_0x024a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r18 = r6
            r6 = 32
            r9.append(r6)
            java.lang.String r7 = r0.mo37797h()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L_0x0261:
            r15.append(r7)
            r15.append(r6)
            okhttp3.y r6 = r0.mo37803n()
            okhttp3.s r6 = r6.mo38389g()
            r15.append(r6)
            r15.append(r12)
            r15.append(r2)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r20 != 0) goto L_0x0296
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " body"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0297
        L_0x0296:
            r2 = r11
        L_0x0297:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.log(r2)
            if (r20 == 0) goto L_0x03d7
            okhttp3.r r2 = r0.mo37795f()
            int r3 = r2.mo38266c()
            r6 = 0
        L_0x02b1:
            if (r6 >= r3) goto L_0x02d5
            okhttp3.logging.HttpLoggingInterceptor$Logger r7 = r1.f34422a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r2.mo38260a(r6)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = r2.mo38263b(r6)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r7.log(r9)
            int r6 = r6 + 1
            goto L_0x02b1
        L_0x02d5:
            if (r4 == 0) goto L_0x03d0
            boolean r3 = okhttp3.internal.http.C13248d.m34792b(r0)
            if (r3 != 0) goto L_0x02df
            goto L_0x03d0
        L_0x02df:
            okhttp3.r r3 = r0.mo37795f()
            boolean r3 = r1.m35056a(r3)
            if (r3 == 0) goto L_0x02f2
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f34422a
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.log(r3)
            goto L_0x03d7
        L_0x02f2:
            okio.BufferedSource r3 = r5.mo37829f()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r6)
            okio.c r3 = r3.buffer()
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r2 = r2.mo38261a(r4)
            java.lang.String r4 = "gzip"
            boolean r2 = r4.equalsIgnoreCase(r2)
            r4 = 0
            if (r2 == 0) goto L_0x0338
            long r6 = r3.mo38488b()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            okio.j r6 = new okio.j     // Catch:{ all -> 0x0331 }
            okio.c r3 = r3.clone()     // Catch:{ all -> 0x0331 }
            r6.<init>(r3)     // Catch:{ all -> 0x0331 }
            okio.c r3 = new okio.c     // Catch:{ all -> 0x032e }
            r3.<init>()     // Catch:{ all -> 0x032e }
            r3.writeAll(r6)     // Catch:{ all -> 0x032e }
            r6.close()
            goto L_0x0339
        L_0x032e:
            r0 = move-exception
            r4 = r6
            goto L_0x0332
        L_0x0331:
            r0 = move-exception
        L_0x0332:
            if (r4 == 0) goto L_0x0337
            r4.close()
        L_0x0337:
            throw r0
        L_0x0338:
            r2 = r4
        L_0x0339:
            java.nio.charset.Charset r4 = f34421c
            okhttp3.t r5 = r5.mo37828e()
            if (r5 == 0) goto L_0x0347
            java.nio.charset.Charset r4 = f34421c
            java.nio.charset.Charset r4 = r5.mo38315a(r4)
        L_0x0347:
            boolean r5 = m35057a(r3)
            if (r5 != 0) goto L_0x0370
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f34422a
            r2.log(r11)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f34422a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "<-- END HTTP (binary "
            r4.append(r5)
            long r5 = r3.mo38488b()
            r4.append(r5)
            r4.append(r8)
            java.lang.String r3 = r4.toString()
            r2.log(r3)
            return r0
        L_0x0370:
            r5 = 0
            int r7 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0388
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            r5.log(r11)
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            okio.c r6 = r3.clone()
            java.lang.String r4 = r6.readString(r4)
            r5.log(r4)
        L_0x0388:
            java.lang.String r4 = "<-- END HTTP ("
            if (r2 == 0) goto L_0x03b2
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f34422a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            long r3 = r3.mo38488b()
            r6.append(r3)
            java.lang.String r3 = "-byte, "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = "-gzipped-byte body)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x03d7
        L_0x03b2:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f34422a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            long r3 = r3.mo38488b()
            r5.append(r3)
            r3 = r17
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.log(r3)
            goto L_0x03d7
        L_0x03d0:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f34422a
            java.lang.String r3 = "<-- END HTTP"
            r2.log(r3)
        L_0x03d7:
            return r0
        L_0x03d8:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r1.f34422a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.log(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.a0");
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.f34423b = C13310a.NONE;
        this.f34422a = logger;
    }

    /* renamed from: a */
    static boolean m35057a(C13342c cVar) {
        try {
            C13342c cVar2 = new C13342c();
            cVar.mo38486a(cVar2, 0, cVar.mo38488b() < 64 ? cVar.mo38488b() : 64);
            int i = 0;
            while (true) {
                if (i >= 16) {
                    break;
                } else if (cVar2.exhausted()) {
                    break;
                } else {
                    int readUtf8CodePoint = cVar2.readUtf8CodePoint();
                    if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m35056a(C13317r rVar) {
        String a = rVar.mo38261a("Content-Encoding");
        return a != null && !a.equalsIgnoreCase("identity") && !a.equalsIgnoreCase("gzip");
    }
}
