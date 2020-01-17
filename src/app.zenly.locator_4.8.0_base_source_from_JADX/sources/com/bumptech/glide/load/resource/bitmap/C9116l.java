package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.p301o.C9216j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
public final class C9116l implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f23691a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f23692b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$a */
    private static final class C9117a implements C9119c {

        /* renamed from: a */
        private final ByteBuffer f23693a;

        C9117a(ByteBuffer byteBuffer) {
            this.f23693a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo24629a() {
            return ((mo24631b() << 8) & 65280) | (mo24631b() & 255);
        }

        /* renamed from: b */
        public int mo24631b() {
            if (this.f23693a.remaining() < 1) {
                return -1;
            }
            return this.f23693a.get();
        }

        /* renamed from: c */
        public short mo24632c() {
            return (short) (mo24631b() & 255);
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f23693a.remaining(), j);
            ByteBuffer byteBuffer = this.f23693a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        /* renamed from: a */
        public int mo24630a(byte[] bArr, int i) {
            int min = Math.min(i, this.f23693a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f23693a.get(bArr, 0, min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$b */
    private static final class C9118b {

        /* renamed from: a */
        private final ByteBuffer f23694a;

        C9118b(byte[] bArr, int i) {
            this.f23694a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24636a(ByteOrder byteOrder) {
            this.f23694a.order(byteOrder);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo24637b(int i) {
            if (m21835a(i, 4)) {
                return this.f23694a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo24634a() {
            return this.f23694a.remaining();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public short mo24635a(int i) {
            if (m21835a(i, 2)) {
                return this.f23694a.getShort(i);
            }
            return -1;
        }

        /* renamed from: a */
        private boolean m21835a(int i, int i2) {
            return this.f23694a.remaining() - i >= i2;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$c */
    private interface C9119c {
        /* renamed from: a */
        int mo24629a() throws IOException;

        /* renamed from: a */
        int mo24630a(byte[] bArr, int i) throws IOException;

        /* renamed from: b */
        int mo24631b() throws IOException;

        /* renamed from: c */
        short mo24632c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$d */
    private static final class C9120d implements C9119c {

        /* renamed from: a */
        private final InputStream f23695a;

        C9120d(InputStream inputStream) {
            this.f23695a = inputStream;
        }

        /* renamed from: a */
        public int mo24629a() throws IOException {
            return ((this.f23695a.read() << 8) & 65280) | (this.f23695a.read() & 255);
        }

        /* renamed from: b */
        public int mo24631b() throws IOException {
            return this.f23695a.read();
        }

        /* renamed from: c */
        public short mo24632c() throws IOException {
            return (short) (this.f23695a.read() & 255);
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f23695a.skip(j2);
                if (skip <= 0) {
                    if (this.f23695a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: a */
        public int mo24630a(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f23695a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    /* renamed from: a */
    private static int m21823a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private ImageType m21827a(C9119c cVar) throws IOException {
        int a = cVar.mo24629a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        int a2 = ((a << 16) & -65536) | (cVar.mo24629a() & 65535);
        if (a2 == -1991225785) {
            cVar.skip(21);
            return cVar.mo24631b() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (a2 != 1380533830) {
                return ImageType.UNKNOWN;
            }
            cVar.skip(4);
            if ((((cVar.mo24629a() << 16) & -65536) | (cVar.mo24629a() & 65535)) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            int a3 = ((cVar.mo24629a() << 16) & -65536) | (cVar.mo24629a() & 65535);
            if ((a3 & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            int i = a3 & 255;
            if (i == 88) {
                cVar.skip(4);
                return (cVar.mo24631b() & 16) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            } else if (i != 76) {
                return ImageType.WEBP;
            } else {
                cVar.skip(4);
                return (cVar.mo24631b() & 8) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            }
        }
    }

    /* renamed from: a */
    private static boolean m21828a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: b */
    private int m21830b(C9119c cVar) throws IOException {
        String str;
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = cVar.mo24632c();
            str = "DfltImageHeaderParser";
            if (c2 != 255) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                    Log.d(str, sb.toString());
                }
                return -1;
            }
            c = cVar.mo24632c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = cVar.mo24629a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(c);
            sb2.append(", wanted to skip: ");
            sb2.append(a);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
            Log.d(str, sb2.toString());
        }
        return -1;
    }

    public int getOrientation(InputStream inputStream, ArrayPool arrayPool) throws IOException {
        C9216j.m22083a(inputStream);
        C9120d dVar = new C9120d(inputStream);
        C9216j.m22083a(arrayPool);
        return m21825a((C9119c) dVar, arrayPool);
    }

    public ImageType getType(InputStream inputStream) throws IOException {
        C9216j.m22083a(inputStream);
        return m21827a((C9119c) new C9120d(inputStream));
    }

    public ImageType getType(ByteBuffer byteBuffer) throws IOException {
        C9216j.m22083a(byteBuffer);
        return m21827a((C9119c) new C9117a(byteBuffer));
    }

    public int getOrientation(ByteBuffer byteBuffer, ArrayPool arrayPool) throws IOException {
        C9216j.m22083a(byteBuffer);
        C9117a aVar = new C9117a(byteBuffer);
        C9216j.m22083a(arrayPool);
        return m21825a((C9119c) aVar, arrayPool);
    }

    /* renamed from: a */
    private int m21825a(C9119c cVar, ArrayPool arrayPool) throws IOException {
        int a = cVar.mo24629a();
        String str = "DfltImageHeaderParser";
        if (!m21828a(a)) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parser doesn't handle magic number: ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            return -1;
        }
        int b = m21830b(cVar);
        if (b == -1) {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) arrayPool.get(b, byte[].class);
        try {
            return m21826a(cVar, bArr, b);
        } finally {
            arrayPool.put(bArr);
        }
    }

    /* renamed from: a */
    private int m21826a(C9119c cVar, byte[] bArr, int i) throws IOException {
        int a = cVar.mo24630a(bArr, i);
        String str = "DfltImageHeaderParser";
        if (a != i) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            return -1;
        } else if (m21829a(bArr, i)) {
            return m21824a(new C9118b(bArr, i));
        } else {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    private boolean m21829a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f23691a.length;
        if (!z) {
            return z;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f23691a;
            if (i2 >= bArr2.length) {
                return z;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m21824a(C9118b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo24635a(6);
        String str = "DfltImageHeaderParser";
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo24636a(byteOrder);
        int b = bVar.mo24637b(10) + 6;
        short a2 = bVar.mo24635a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m21823a(b, i);
            short a4 = bVar.mo24635a(a3);
            if (a4 == 274) {
                short a5 = bVar.mo24635a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = bVar.mo24637b(a3 + 4);
                    if (b2 >= 0) {
                        String str2 = " tagType=";
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(str2);
                            sb2.append(a4);
                            sb2.append(" formatCode=");
                            sb2.append(a5);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                            Log.d(str, sb2.toString());
                        }
                        int i2 = b2 + f23692b[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > bVar.mo24634a()) {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(str2);
                                    sb3.append(a4);
                                    Log.d(str, sb3.toString());
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo24634a()) {
                                return bVar.mo24635a(i3);
                            } else {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a4);
                                    Log.d(str, sb4.toString());
                                }
                            }
                        } else if (Log.isLoggable(str, 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a5);
                            Log.d(str, sb5.toString());
                        }
                    } else if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(str, 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a5);
                    Log.d(str, sb6.toString());
                }
            }
        }
        return -1;
    }
}
