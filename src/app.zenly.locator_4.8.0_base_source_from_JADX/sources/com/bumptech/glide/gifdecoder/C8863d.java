package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.gifdecoder.d */
public class C8863d implements GifDecoder {

    /* renamed from: v */
    private static final String f23073v = "d";

    /* renamed from: a */
    private int[] f23074a;

    /* renamed from: b */
    private final int[] f23075b;

    /* renamed from: c */
    private final BitmapProvider f23076c;

    /* renamed from: d */
    private ByteBuffer f23077d;

    /* renamed from: e */
    private byte[] f23078e;

    /* renamed from: f */
    private C8862c f23079f;

    /* renamed from: g */
    private short[] f23080g;

    /* renamed from: h */
    private byte[] f23081h;

    /* renamed from: i */
    private byte[] f23082i;

    /* renamed from: j */
    private byte[] f23083j;

    /* renamed from: k */
    private int[] f23084k;

    /* renamed from: l */
    private int f23085l;

    /* renamed from: m */
    private C8861b f23086m;

    /* renamed from: n */
    private Bitmap f23087n;

    /* renamed from: o */
    private boolean f23088o;

    /* renamed from: p */
    private int f23089p;

    /* renamed from: q */
    private int f23090q;

    /* renamed from: r */
    private int f23091r;

    /* renamed from: s */
    private int f23092s;

    /* renamed from: t */
    private Boolean f23093t;

    /* renamed from: u */
    private Config f23094u;

    public C8863d(BitmapProvider bitmapProvider, C8861b bVar, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider);
        setData(bVar, byteBuffer, i);
    }

    /* renamed from: a */
    private C8862c m21207a() {
        if (this.f23079f == null) {
            this.f23079f = new C8862c();
        }
        return this.f23079f;
    }

    /* renamed from: b */
    private void m21210b(C8860a aVar) {
        C8860a aVar2 = aVar;
        int[] iArr = this.f23084k;
        int i = aVar2.f23048d;
        int i2 = aVar2.f23046b;
        int i3 = aVar2.f23047c;
        int i4 = aVar2.f23045a;
        boolean z = this.f23085l == 0;
        int i5 = this.f23092s;
        byte[] bArr = this.f23083j;
        int[] iArr2 = this.f23074a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = aVar2.f23047c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i13 = iArr2[b3];
                    if (i13 != 0) {
                        iArr[i12] = i13;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C8860a aVar3 = aVar;
            }
            i6++;
            aVar2 = aVar;
        }
        Boolean bool = this.f23093t;
        this.f23093t = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f23093t == null && z && b != -1));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [short[]] */
    /* JADX WARNING: type inference failed for: r22v0 */
    /* JADX WARNING: type inference failed for: r22v1 */
    /* JADX WARNING: type inference failed for: r28v0 */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r28v2 */
    /* JADX WARNING: type inference failed for: r22v4 */
    /* JADX WARNING: type inference failed for: r4v16, types: [short] */
    /* JADX WARNING: type inference failed for: r4v18, types: [int] */
    /* JADX WARNING: type inference failed for: r28v5 */
    /* JADX WARNING: type inference failed for: r22v5 */
    /* JADX WARNING: type inference failed for: r28v6 */
    /* JADX WARNING: type inference failed for: r22v6 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r28v7 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r28v8 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r4v16, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r3v1, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r22v3
      assigns: []
      uses: []
      mth insns count: 170
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21212c(com.bumptech.glide.gifdecoder.C8860a r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f23077d
            int r3 = r1.f23054j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.gifdecoder.b r1 = r0.f23086m
            int r2 = r1.f23061f
            int r1 = r1.f23062g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f23047c
            int r1 = r1.f23048d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f23083j
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r1 = r0.f23076c
            byte[] r1 = r1.obtainByteArray(r2)
            r0.f23083j = r1
        L_0x002b:
            byte[] r1 = r0.f23083j
            short[] r3 = r0.f23080g
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f23080g = r3
        L_0x0037:
            short[] r3 = r0.f23080g
            byte[] r5 = r0.f23081h
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f23081h = r5
        L_0x0041:
            byte[] r5 = r0.f23081h
            byte[] r6 = r0.f23082i
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f23082i = r6
        L_0x004d:
            byte[] r6 = r0.f23082i
            int r7 = r29.m21213d()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f23078e
            r15 = -1
            r26 = r7
            r24 = r11
            r25 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = -1
            r22 = 0
            r23 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x0159
            if (r16 != 0) goto L_0x0094
            int r16 = r29.m21211c()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f23089p = r3
            goto L_0x0159
        L_0x0092:
            r19 = 0
        L_0x0094:
            byte r4 = r14[r19]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r17
            int r18 = r18 + r4
            int r17 = r17 + 8
            int r19 = r19 + 1
            int r16 = r16 + -1
            r4 = r17
            r8 = r21
            r28 = r22
            r27 = r24
            r21 = r20
            r20 = r13
            r13 = r26
        L_0x00b0:
            if (r4 < r13) goto L_0x013d
            r15 = r18 & r25
            int r18 = r18 >> r13
            int r4 = r4 - r13
            if (r15 != r9) goto L_0x00c1
            r13 = r7
            r27 = r11
            r25 = r12
            r8 = -1
        L_0x00bf:
            r15 = -1
            goto L_0x00b0
        L_0x00c1:
            if (r15 != r10) goto L_0x00d6
            r17 = r4
            r26 = r13
            r13 = r20
            r20 = r21
            r24 = r27
            r22 = r28
            r4 = 4096(0x1000, float:5.74E-42)
            r15 = -1
            r21 = r8
            r8 = 1
            goto L_0x0083
        L_0x00d6:
            r0 = -1
            if (r8 != r0) goto L_0x00e7
            byte r8 = r5[r15]
            r1[r21] = r8
            int r21 = r21 + 1
            int r20 = r20 + 1
            r0 = r29
            r8 = r15
            r28 = r8
            goto L_0x00bf
        L_0x00e7:
            r0 = r27
            r24 = r4
            if (r15 < r0) goto L_0x00f6
            r4 = r28
            byte r4 = (byte) r4
            r6[r23] = r4
            int r23 = r23 + 1
            r4 = r8
            goto L_0x00f7
        L_0x00f6:
            r4 = r15
        L_0x00f7:
            if (r4 < r9) goto L_0x0102
            byte r26 = r5[r4]
            r6[r23] = r26
            int r23 = r23 + 1
            short r4 = r3[r4]
            goto L_0x00f7
        L_0x0102:
            byte r4 = r5[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r26 = r7
            byte r7 = (byte) r4
            r1[r21] = r7
        L_0x010b:
            int r21 = r21 + 1
            int r20 = r20 + 1
            if (r23 <= 0) goto L_0x0118
            int r23 = r23 + -1
            byte r27 = r6[r23]
            r1[r21] = r27
            goto L_0x010b
        L_0x0118:
            r27 = r4
            r4 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r4) goto L_0x012f
            short r8 = (short) r8
            r3[r0] = r8
            r5[r0] = r7
            int r0 = r0 + 1
            r7 = r0 & r25
            if (r7 != 0) goto L_0x012f
            if (r0 >= r4) goto L_0x012f
            int r13 = r13 + 1
            int r25 = r25 + r0
        L_0x012f:
            r8 = r15
            r4 = r24
            r7 = r26
            r28 = r27
            r15 = -1
            r27 = r0
            r0 = r29
            goto L_0x00b0
        L_0x013d:
            r24 = r4
            r0 = r27
            r15 = r28
            r26 = r13
            r22 = r15
            r13 = r20
            r20 = r21
            r17 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r15 = -1
            r24 = r0
            r21 = r8
            r8 = 1
            r0 = r29
            goto L_0x0083
        L_0x0159:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.C8863d.m21212c(com.bumptech.glide.gifdecoder.a):void");
    }

    /* renamed from: d */
    private int m21213d() {
        return this.f23077d.get() & 255;
    }

    public void advance() {
        this.f23085l = (this.f23085l + 1) % this.f23086m.f23058c;
    }

    public void clear() {
        this.f23086m = null;
        byte[] bArr = this.f23083j;
        if (bArr != null) {
            this.f23076c.release(bArr);
        }
        int[] iArr = this.f23084k;
        if (iArr != null) {
            this.f23076c.release(iArr);
        }
        Bitmap bitmap = this.f23087n;
        if (bitmap != null) {
            this.f23076c.release(bitmap);
        }
        this.f23087n = null;
        this.f23077d = null;
        this.f23093t = null;
        byte[] bArr2 = this.f23078e;
        if (bArr2 != null) {
            this.f23076c.release(bArr2);
        }
    }

    public int getByteSize() {
        return this.f23077d.limit() + this.f23083j.length + (this.f23084k.length * 4);
    }

    public int getCurrentFrameIndex() {
        return this.f23085l;
    }

    public ByteBuffer getData() {
        return this.f23077d;
    }

    public int getDelay(int i) {
        if (i >= 0) {
            C8861b bVar = this.f23086m;
            if (i < bVar.f23058c) {
                return ((C8860a) bVar.f23060e.get(i)).f23053i;
            }
        }
        return -1;
    }

    public int getFrameCount() {
        return this.f23086m.f23058c;
    }

    public int getHeight() {
        return this.f23086m.f23062g;
    }

    @Deprecated
    public int getLoopCount() {
        int i = this.f23086m.f23068m;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    public int getNetscapeLoopCount() {
        return this.f23086m.f23068m;
    }

    public int getNextDelay() {
        if (this.f23086m.f23058c > 0) {
            int i = this.f23085l;
            if (i >= 0) {
                return getDelay(i);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap getNextFrame() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.gifdecoder.b r0 = r8.f23086m     // Catch:{ all -> 0x00f8 }
            int r0 = r0.f23058c     // Catch:{ all -> 0x00f8 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f23085l     // Catch:{ all -> 0x00f8 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = f23073v     // Catch:{ all -> 0x00f8 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = f23073v     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r3.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00f8 }
            com.bumptech.glide.gifdecoder.b r4 = r8.f23086m     // Catch:{ all -> 0x00f8 }
            int r4 = r4.f23058c     // Catch:{ all -> 0x00f8 }
            r3.append(r4)     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00f8 }
            int r4 = r8.f23085l     // Catch:{ all -> 0x00f8 }
            r3.append(r4)     // Catch:{ all -> 0x00f8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f8 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00f8 }
        L_0x0039:
            r8.f23089p = r2     // Catch:{ all -> 0x00f8 }
        L_0x003b:
            int r0 = r8.f23089p     // Catch:{ all -> 0x00f8 }
            r3 = 0
            if (r0 == r2) goto L_0x00d6
            int r0 = r8.f23089p     // Catch:{ all -> 0x00f8 }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00d6
        L_0x0047:
            r0 = 0
            r8.f23089p = r0     // Catch:{ all -> 0x00f8 }
            byte[] r5 = r8.f23078e     // Catch:{ all -> 0x00f8 }
            if (r5 != 0) goto L_0x0058
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r5 = r8.f23076c     // Catch:{ all -> 0x00f8 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.obtainByteArray(r6)     // Catch:{ all -> 0x00f8 }
            r8.f23078e = r5     // Catch:{ all -> 0x00f8 }
        L_0x0058:
            com.bumptech.glide.gifdecoder.b r5 = r8.f23086m     // Catch:{ all -> 0x00f8 }
            java.util.List<com.bumptech.glide.gifdecoder.a> r5 = r5.f23060e     // Catch:{ all -> 0x00f8 }
            int r6 = r8.f23085l     // Catch:{ all -> 0x00f8 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00f8 }
            com.bumptech.glide.gifdecoder.a r5 = (com.bumptech.glide.gifdecoder.C8860a) r5     // Catch:{ all -> 0x00f8 }
            int r6 = r8.f23085l     // Catch:{ all -> 0x00f8 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            com.bumptech.glide.gifdecoder.b r7 = r8.f23086m     // Catch:{ all -> 0x00f8 }
            java.util.List<com.bumptech.glide.gifdecoder.a> r7 = r7.f23060e     // Catch:{ all -> 0x00f8 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00f8 }
            com.bumptech.glide.gifdecoder.a r6 = (com.bumptech.glide.gifdecoder.C8860a) r6     // Catch:{ all -> 0x00f8 }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.f23055k     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x007c
            int[] r7 = r5.f23055k     // Catch:{ all -> 0x00f8 }
            goto L_0x0080
        L_0x007c:
            com.bumptech.glide.gifdecoder.b r7 = r8.f23086m     // Catch:{ all -> 0x00f8 }
            int[] r7 = r7.f23056a     // Catch:{ all -> 0x00f8 }
        L_0x0080:
            r8.f23074a = r7     // Catch:{ all -> 0x00f8 }
            int[] r7 = r8.f23074a     // Catch:{ all -> 0x00f8 }
            if (r7 != 0) goto L_0x00aa
            java.lang.String r0 = f23073v     // Catch:{ all -> 0x00f8 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = f23073v     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r1.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00f8 }
            int r4 = r8.f23085l     // Catch:{ all -> 0x00f8 }
            r1.append(r4)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f8 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f8 }
        L_0x00a6:
            r8.f23089p = r2     // Catch:{ all -> 0x00f8 }
            monitor-exit(r8)
            return r3
        L_0x00aa:
            boolean r1 = r5.f23050f     // Catch:{ all -> 0x00f8 }
            if (r1 == 0) goto L_0x00d0
            int[] r1 = r8.f23074a     // Catch:{ all -> 0x00f8 }
            int[] r3 = r8.f23075b     // Catch:{ all -> 0x00f8 }
            int[] r7 = r8.f23074a     // Catch:{ all -> 0x00f8 }
            int r7 = r7.length     // Catch:{ all -> 0x00f8 }
            java.lang.System.arraycopy(r1, r0, r3, r0, r7)     // Catch:{ all -> 0x00f8 }
            int[] r1 = r8.f23075b     // Catch:{ all -> 0x00f8 }
            r8.f23074a = r1     // Catch:{ all -> 0x00f8 }
            int[] r1 = r8.f23074a     // Catch:{ all -> 0x00f8 }
            int r3 = r5.f23052h     // Catch:{ all -> 0x00f8 }
            r1[r3] = r0     // Catch:{ all -> 0x00f8 }
            int r0 = r5.f23051g     // Catch:{ all -> 0x00f8 }
            if (r0 != r4) goto L_0x00d0
            int r0 = r8.f23085l     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x00d0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00f8 }
            r8.f23093t = r0     // Catch:{ all -> 0x00f8 }
        L_0x00d0:
            android.graphics.Bitmap r0 = r8.m21206a(r5, r6)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r8)
            return r0
        L_0x00d6:
            java.lang.String r0 = f23073v     // Catch:{ all -> 0x00f8 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = f23073v     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r1.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00f8 }
            int r2 = r8.f23089p     // Catch:{ all -> 0x00f8 }
            r1.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f8 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f8 }
        L_0x00f6:
            monitor-exit(r8)
            return r3
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.C8863d.getNextFrame():android.graphics.Bitmap");
    }

    public int getStatus() {
        return this.f23089p;
    }

    public int getTotalIterationCount() {
        int i = this.f23086m.f23068m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    public int getWidth() {
        return this.f23086m.f23061f;
    }

    public int read(InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(f23073v, "Error reading data from stream", e);
            }
        } else {
            this.f23089p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(f23073v, "Error closing stream", e2);
            }
        }
        return this.f23089p;
    }

    public void resetFrameIndex() {
        this.f23085l = -1;
    }

    public synchronized void setData(C8861b bVar, byte[] bArr) {
        setData(bVar, ByteBuffer.wrap(bArr));
    }

    public void setDefaultBitmapConfig(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f23094u = config;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    public C8863d(BitmapProvider bitmapProvider) {
        this.f23075b = new int[256];
        this.f23094u = Config.ARGB_8888;
        this.f23076c = bitmapProvider;
        this.f23086m = new C8861b();
    }

    public synchronized void setData(C8861b bVar, ByteBuffer byteBuffer) {
        setData(bVar, byteBuffer, 1);
    }

    /* renamed from: a */
    private Bitmap m21206a(C8860a aVar, C8860a aVar2) {
        int[] iArr = this.f23084k;
        int i = 0;
        if (aVar2 == null) {
            Bitmap bitmap = this.f23087n;
            if (bitmap != null) {
                this.f23076c.release(bitmap);
            }
            this.f23087n = null;
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && aVar2.f23051g == 3 && this.f23087n == null) {
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null) {
            int i2 = aVar2.f23051g;
            if (i2 > 0) {
                if (i2 == 2) {
                    if (!aVar.f23050f) {
                        C8861b bVar = this.f23086m;
                        int i3 = bVar.f23067l;
                        if (aVar.f23055k == null || bVar.f23065j != aVar.f23052h) {
                            i = i3;
                        }
                    }
                    int i4 = aVar2.f23048d;
                    int i5 = this.f23090q;
                    int i6 = i4 / i5;
                    int i7 = aVar2.f23046b / i5;
                    int i8 = aVar2.f23047c / i5;
                    int i9 = aVar2.f23045a / i5;
                    int i10 = this.f23092s;
                    int i11 = (i7 * i10) + i9;
                    int i12 = (i6 * i10) + i11;
                    while (i11 < i12) {
                        int i13 = i11 + i8;
                        for (int i14 = i11; i14 < i13; i14++) {
                            iArr[i14] = i;
                        }
                        i11 += this.f23092s;
                    }
                } else if (i2 == 3) {
                    Bitmap bitmap2 = this.f23087n;
                    if (bitmap2 != null) {
                        int i15 = this.f23092s;
                        bitmap2.getPixels(iArr, 0, i15, 0, 0, i15, this.f23091r);
                    }
                }
            }
        }
        m21212c(aVar);
        if (aVar.f23049e || this.f23090q != 1) {
            m21208a(aVar);
        } else {
            m21210b(aVar);
        }
        if (this.f23088o) {
            int i16 = aVar.f23051g;
            if (i16 == 0 || i16 == 1) {
                if (this.f23087n == null) {
                    this.f23087n = m21209b();
                }
                Bitmap bitmap3 = this.f23087n;
                int i17 = this.f23092s;
                bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f23091r);
            }
        }
        Bitmap b = m21209b();
        int i18 = this.f23092s;
        b.setPixels(iArr, 0, i18, 0, 0, i18, this.f23091r);
        return b;
    }

    public synchronized void setData(C8861b bVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f23089p = 0;
            this.f23086m = bVar;
            this.f23085l = -1;
            this.f23077d = byteBuffer.asReadOnlyBuffer();
            this.f23077d.position(0);
            this.f23077d.order(ByteOrder.LITTLE_ENDIAN);
            this.f23088o = false;
            Iterator it = bVar.f23060e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C8860a) it.next()).f23051g == 3) {
                        this.f23088o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f23090q = highestOneBit;
            this.f23092s = bVar.f23061f / highestOneBit;
            this.f23091r = bVar.f23062g / highestOneBit;
            this.f23083j = this.f23076c.obtainByteArray(bVar.f23061f * bVar.f23062g);
            this.f23084k = this.f23076c.obtainIntArray(this.f23092s * this.f23091r);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public synchronized int read(byte[] bArr) {
        C8862c a = m21207a();
        a.mo24167a(bArr);
        this.f23086m = a.mo24169b();
        if (bArr != null) {
            setData(this.f23086m, bArr);
        }
        return this.f23089p;
    }

    /* renamed from: b */
    private Bitmap m21209b() {
        Boolean bool = this.f23093t;
        Bitmap obtain = this.f23076c.obtain(this.f23092s, this.f23091r, (bool == null || bool.booleanValue()) ? Config.ARGB_8888 : this.f23094u);
        obtain.setHasAlpha(true);
        return obtain;
    }

    /* renamed from: c */
    private int m21211c() {
        int d = m21213d();
        if (d <= 0) {
            return d;
        }
        ByteBuffer byteBuffer = this.f23077d;
        byteBuffer.get(this.f23078e, 0, Math.min(d, byteBuffer.remaining()));
        return d;
    }

    /* renamed from: a */
    private void m21208a(C8860a aVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C8860a aVar2 = aVar;
        int[] iArr = this.f23084k;
        int i6 = aVar2.f23048d;
        int i7 = this.f23090q;
        int i8 = i6 / i7;
        int i9 = aVar2.f23046b / i7;
        int i10 = aVar2.f23047c / i7;
        int i11 = aVar2.f23045a / i7;
        int i12 = this.f23085l;
        Boolean valueOf = Boolean.valueOf(true);
        boolean z2 = i12 == 0;
        int i13 = this.f23090q;
        int i14 = this.f23092s;
        int i15 = this.f23091r;
        byte[] bArr = this.f23083j;
        int[] iArr2 = this.f23074a;
        Boolean bool = this.f23093t;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        int i19 = 8;
        while (i16 < i8) {
            Boolean bool2 = valueOf;
            if (aVar2.f23049e) {
                if (i17 >= i8) {
                    i = i8;
                    i5 = i18 + 1;
                    if (i5 == 2) {
                        i17 = 4;
                    } else if (i5 == 3) {
                        i17 = 2;
                        i19 = 4;
                    } else if (i5 == 4) {
                        i17 = 1;
                        i19 = 2;
                    }
                } else {
                    i = i8;
                    i5 = i18;
                }
                i2 = i17 + i19;
                i18 = i5;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z3 = i13 == 1;
            if (i20 < i15) {
                int i21 = i20 * i14;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i14;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i9;
                int i25 = i16 * i13 * aVar2.f23047c;
                if (z3) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z2 && bool == null) {
                            bool = bool2;
                        }
                        i25 += i13;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i4 = i10;
                    int i29 = ((i23 - i22) * i13) + i25;
                    int i30 = i22;
                    while (i30 < i23) {
                        int i31 = i23;
                        int a = m21205a(i25, i29, aVar2.f23047c);
                        if (a != 0) {
                            iArr[i30] = a;
                        } else if (z2 && bool == null) {
                            bool = bool2;
                        }
                        i25 += i13;
                        i30++;
                        i23 = i31;
                    }
                    i16++;
                    i17 = i2;
                    i10 = i4;
                    valueOf = bool2;
                    i8 = i;
                    i9 = i3;
                }
            } else {
                i3 = i9;
            }
            i4 = i10;
            i16++;
            i17 = i2;
            i10 = i4;
            valueOf = bool2;
            i8 = i;
            i9 = i3;
        }
        if (this.f23093t == null) {
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            this.f23093t = Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private int m21205a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f23090q + i; i9++) {
            byte[] bArr = this.f23083j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f23074a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f23090q + i11; i12++) {
            byte[] bArr2 = this.f23083j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f23074a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }
}
