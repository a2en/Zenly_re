package p214e.p241j.p242a;

import android.content.res.AssetManager.AssetInputStream;
import android.util.Log;
import com.appsflyer.share.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: e.j.a.a */
public class C7634a {

    /* renamed from: A */
    private static final C7637c f19212A = new C7637c("StripOffsets", 273, 3);

    /* renamed from: B */
    private static final C7637c[] f19213B = {new C7637c("ThumbnailImage", 256, 7), new C7637c("CameraSettingsIFDPointer", 8224, 4), new C7637c("ImageProcessingIFDPointer", 8256, 4)};

    /* renamed from: C */
    private static final C7637c[] f19214C = {new C7637c("PreviewImageStart", 257, 4), new C7637c("PreviewImageLength", 258, 4)};

    /* renamed from: D */
    private static final C7637c[] f19215D = {new C7637c("AspectFrame", 4371, 3)};

    /* renamed from: E */
    private static final C7637c[] f19216E = {new C7637c("ColorSpace", 55, 3)};

    /* renamed from: F */
    static final C7637c[][] f19217F;

    /* renamed from: G */
    private static final C7637c[] f19218G = {new C7637c("SubIFDPointer", 330, 4), new C7637c("ExifIFDPointer", 34665, 4), new C7637c("GPSInfoIFDPointer", 34853, 4), new C7637c("InteroperabilityIFDPointer", 40965, 4), new C7637c("CameraSettingsIFDPointer", 8224, 1), new C7637c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: H */
    private static final HashMap<Integer, C7637c>[] f19219H;

    /* renamed from: I */
    private static final HashMap<String, C7637c>[] f19220I;

    /* renamed from: J */
    private static final HashSet<String> f19221J = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: K */
    private static final HashMap<Integer, Integer> f19222K = new HashMap<>();

    /* renamed from: L */
    static final Charset f19223L = Charset.forName("US-ASCII");

    /* renamed from: M */
    static final byte[] f19224M = "Exif\u0000\u0000".getBytes(f19223L);

    /* renamed from: m */
    public static final int[] f19225m = {8, 8, 8};

    /* renamed from: n */
    public static final int[] f19226n = {8};

    /* renamed from: o */
    static final byte[] f19227o = {-1, -40, -1};

    /* renamed from: p */
    private static final byte[] f19228p = {79, 76, 89, 77, 80, 0};

    /* renamed from: q */
    private static final byte[] f19229q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: r */
    private static SimpleDateFormat f19230r = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

    /* renamed from: s */
    static final String[] f19231s = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: t */
    static final int[] f19232t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: u */
    static final byte[] f19233u = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: v */
    private static final C7637c[] f19234v = {new C7637c("NewSubfileType", 254, 4), new C7637c("SubfileType", 255, 4), new C7637c("ImageWidth", 256, 3, 4), new C7637c("ImageLength", 257, 3, 4), new C7637c("BitsPerSample", 258, 3), new C7637c("Compression", 259, 3), new C7637c("PhotometricInterpretation", 262, 3), new C7637c("ImageDescription", 270, 2), new C7637c("Make", 271, 2), new C7637c("Model", 272, 2), new C7637c("StripOffsets", 273, 3, 4), new C7637c("Orientation", 274, 3), new C7637c("SamplesPerPixel", 277, 3), new C7637c("RowsPerStrip", 278, 3, 4), new C7637c("StripByteCounts", 279, 3, 4), new C7637c("XResolution", 282, 5), new C7637c("YResolution", 283, 5), new C7637c("PlanarConfiguration", 284, 3), new C7637c("ResolutionUnit", 296, 3), new C7637c("TransferFunction", 301, 3), new C7637c("Software", 305, 2), new C7637c("DateTime", 306, 2), new C7637c("Artist", 315, 2), new C7637c("WhitePoint", 318, 5), new C7637c("PrimaryChromaticities", 319, 5), new C7637c("SubIFDPointer", 330, 4), new C7637c("JPEGInterchangeFormat", 513, 4), new C7637c("JPEGInterchangeFormatLength", 514, 4), new C7637c("YCbCrCoefficients", 529, 5), new C7637c("YCbCrSubSampling", 530, 3), new C7637c("YCbCrPositioning", 531, 3), new C7637c("ReferenceBlackWhite", 532, 5), new C7637c("Copyright", 33432, 2), new C7637c("ExifIFDPointer", 34665, 4), new C7637c("GPSInfoIFDPointer", 34853, 4), new C7637c("SensorTopBorder", 4, 4), new C7637c("SensorLeftBorder", 5, 4), new C7637c("SensorBottomBorder", 6, 4), new C7637c("SensorRightBorder", 7, 4), new C7637c("ISO", 23, 3), new C7637c("JpgFromRaw", 46, 7)};

    /* renamed from: w */
    private static final C7637c[] f19235w = {new C7637c("ExposureTime", 33434, 5), new C7637c("FNumber", 33437, 5), new C7637c("ExposureProgram", 34850, 3), new C7637c("SpectralSensitivity", 34852, 2), new C7637c("PhotographicSensitivity", 34855, 3), new C7637c("OECF", 34856, 7), new C7637c("ExifVersion", 36864, 2), new C7637c("DateTimeOriginal", 36867, 2), new C7637c("DateTimeDigitized", 36868, 2), new C7637c("ComponentsConfiguration", 37121, 7), new C7637c("CompressedBitsPerPixel", 37122, 5), new C7637c("ShutterSpeedValue", 37377, 10), new C7637c("ApertureValue", 37378, 5), new C7637c("BrightnessValue", 37379, 10), new C7637c("ExposureBiasValue", 37380, 10), new C7637c("MaxApertureValue", 37381, 5), new C7637c("SubjectDistance", 37382, 5), new C7637c("MeteringMode", 37383, 3), new C7637c("LightSource", 37384, 3), new C7637c("Flash", 37385, 3), new C7637c("FocalLength", 37386, 5), new C7637c("SubjectArea", 37396, 3), new C7637c("MakerNote", 37500, 7), new C7637c("UserComment", 37510, 7), new C7637c("SubSecTime", 37520, 2), new C7637c("SubSecTimeOriginal", 37521, 2), new C7637c("SubSecTimeDigitized", 37522, 2), new C7637c("FlashpixVersion", 40960, 7), new C7637c("ColorSpace", 40961, 3), new C7637c("PixelXDimension", 40962, 3, 4), new C7637c("PixelYDimension", 40963, 3, 4), new C7637c("RelatedSoundFile", 40964, 2), new C7637c("InteroperabilityIFDPointer", 40965, 4), new C7637c("FlashEnergy", 41483, 5), new C7637c("SpatialFrequencyResponse", 41484, 7), new C7637c("FocalPlaneXResolution", 41486, 5), new C7637c("FocalPlaneYResolution", 41487, 5), new C7637c("FocalPlaneResolutionUnit", 41488, 3), new C7637c("SubjectLocation", 41492, 3), new C7637c("ExposureIndex", 41493, 5), new C7637c("SensingMethod", 41495, 3), new C7637c("FileSource", 41728, 7), new C7637c("SceneType", 41729, 7), new C7637c("CFAPattern", 41730, 7), new C7637c("CustomRendered", 41985, 3), new C7637c("ExposureMode", 41986, 3), new C7637c("WhiteBalance", 41987, 3), new C7637c("DigitalZoomRatio", 41988, 5), new C7637c("FocalLengthIn35mmFilm", 41989, 3), new C7637c("SceneCaptureType", 41990, 3), new C7637c("GainControl", 41991, 3), new C7637c("Contrast", 41992, 3), new C7637c("Saturation", 41993, 3), new C7637c("Sharpness", 41994, 3), new C7637c("DeviceSettingDescription", 41995, 7), new C7637c("SubjectDistanceRange", 41996, 3), new C7637c("ImageUniqueID", 42016, 2), new C7637c("DNGVersion", 50706, 1), new C7637c("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: x */
    private static final C7637c[] f19236x = {new C7637c("GPSVersionID", 0, 1), new C7637c("GPSLatitudeRef", 1, 2), new C7637c("GPSLatitude", 2, 5), new C7637c("GPSLongitudeRef", 3, 2), new C7637c("GPSLongitude", 4, 5), new C7637c("GPSAltitudeRef", 5, 1), new C7637c("GPSAltitude", 6, 5), new C7637c("GPSTimeStamp", 7, 5), new C7637c("GPSSatellites", 8, 2), new C7637c("GPSStatus", 9, 2), new C7637c("GPSMeasureMode", 10, 2), new C7637c("GPSDOP", 11, 5), new C7637c("GPSSpeedRef", 12, 2), new C7637c("GPSSpeed", 13, 5), new C7637c("GPSTrackRef", 14, 2), new C7637c("GPSTrack", 15, 5), new C7637c("GPSImgDirectionRef", 16, 2), new C7637c("GPSImgDirection", 17, 5), new C7637c("GPSMapDatum", 18, 2), new C7637c("GPSDestLatitudeRef", 19, 2), new C7637c("GPSDestLatitude", 20, 5), new C7637c("GPSDestLongitudeRef", 21, 2), new C7637c("GPSDestLongitude", 22, 5), new C7637c("GPSDestBearingRef", 23, 2), new C7637c("GPSDestBearing", 24, 5), new C7637c("GPSDestDistanceRef", 25, 2), new C7637c("GPSDestDistance", 26, 5), new C7637c("GPSProcessingMethod", 27, 7), new C7637c("GPSAreaInformation", 28, 7), new C7637c("GPSDateStamp", 29, 2), new C7637c("GPSDifferential", 30, 3)};

    /* renamed from: y */
    private static final C7637c[] f19237y = {new C7637c("InteroperabilityIndex", 1, 2)};

    /* renamed from: z */
    private static final C7637c[] f19238z = {new C7637c("NewSubfileType", 254, 4), new C7637c("SubfileType", 255, 4), new C7637c("ThumbnailImageWidth", 256, 3, 4), new C7637c("ThumbnailImageLength", 257, 3, 4), new C7637c("BitsPerSample", 258, 3), new C7637c("Compression", 259, 3), new C7637c("PhotometricInterpretation", 262, 3), new C7637c("ImageDescription", 270, 2), new C7637c("Make", 271, 2), new C7637c("Model", 272, 2), new C7637c("StripOffsets", 273, 3, 4), new C7637c("Orientation", 274, 3), new C7637c("SamplesPerPixel", 277, 3), new C7637c("RowsPerStrip", 278, 3, 4), new C7637c("StripByteCounts", 279, 3, 4), new C7637c("XResolution", 282, 5), new C7637c("YResolution", 283, 5), new C7637c("PlanarConfiguration", 284, 3), new C7637c("ResolutionUnit", 296, 3), new C7637c("TransferFunction", 301, 3), new C7637c("Software", 305, 2), new C7637c("DateTime", 306, 2), new C7637c("Artist", 315, 2), new C7637c("WhitePoint", 318, 5), new C7637c("PrimaryChromaticities", 319, 5), new C7637c("SubIFDPointer", 330, 4), new C7637c("JPEGInterchangeFormat", 513, 4), new C7637c("JPEGInterchangeFormatLength", 514, 4), new C7637c("YCbCrCoefficients", 529, 5), new C7637c("YCbCrSubSampling", 530, 3), new C7637c("YCbCrPositioning", 531, 3), new C7637c("ReferenceBlackWhite", 532, 5), new C7637c("Copyright", 33432, 2), new C7637c("ExifIFDPointer", 34665, 4), new C7637c("GPSInfoIFDPointer", 34853, 4), new C7637c("DNGVersion", 50706, 1), new C7637c("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: a */
    private final String f19239a;

    /* renamed from: b */
    private final AssetInputStream f19240b;

    /* renamed from: c */
    private int f19241c;

    /* renamed from: d */
    private final HashMap<String, C7636b>[] f19242d;

    /* renamed from: e */
    private Set<Integer> f19243e;

    /* renamed from: f */
    private ByteOrder f19244f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private int f19245g;

    /* renamed from: h */
    private int f19246h;

    /* renamed from: i */
    private int f19247i;

    /* renamed from: j */
    private int f19248j;

    /* renamed from: k */
    private int f19249k;

    /* renamed from: l */
    private int f19250l;

    /* renamed from: e.j.a.a$a */
    private static class C7635a extends InputStream implements DataInput {

        /* renamed from: i */
        private static final ByteOrder f19251i = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: j */
        private static final ByteOrder f19252j = ByteOrder.BIG_ENDIAN;

        /* renamed from: e */
        private DataInputStream f19253e;

        /* renamed from: f */
        private ByteOrder f19254f;

        /* renamed from: g */
        final int f19255g;

        /* renamed from: h */
        int f19256h;

        public C7635a(InputStream inputStream) throws IOException {
            this.f19254f = ByteOrder.BIG_ENDIAN;
            this.f19253e = new DataInputStream(inputStream);
            this.f19255g = this.f19253e.available();
            this.f19256h = 0;
            this.f19253e.mark(this.f19255g);
        }

        /* renamed from: a */
        public void mo19754a(ByteOrder byteOrder) {
            this.f19254f = byteOrder;
        }

        public int available() throws IOException {
            return this.f19253e.available();
        }

        public int peek() {
            return this.f19256h;
        }

        public int read() throws IOException {
            this.f19256h++;
            return this.f19253e.read();
        }

        public boolean readBoolean() throws IOException {
            this.f19256h++;
            return this.f19253e.readBoolean();
        }

        public byte readByte() throws IOException {
            this.f19256h++;
            if (this.f19256h <= this.f19255g) {
                int read = this.f19253e.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f19256h += 2;
            return this.f19253e.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f19256h += i2;
            if (this.f19256h > this.f19255g) {
                throw new EOFException();
            } else if (this.f19253e.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            this.f19256h += 4;
            if (this.f19256h <= this.f19255g) {
                int read = this.f19253e.read();
                int read2 = this.f19253e.read();
                int read3 = this.f19253e.read();
                int read4 = this.f19253e.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f19254f;
                    if (byteOrder == f19251i) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f19252j) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f19254f);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            this.f19256h += 8;
            if (this.f19256h <= this.f19255g) {
                int read = this.f19253e.read();
                int read2 = this.f19253e.read();
                int read3 = this.f19253e.read();
                int read4 = this.f19253e.read();
                int read5 = this.f19253e.read();
                int read6 = this.f19253e.read();
                int read7 = this.f19253e.read();
                int read8 = this.f19253e.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f19254f;
                    if (byteOrder == f19251i) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i = read2;
                    if (byteOrder == f19252j) {
                        return (((long) read) << 56) + (((long) i) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f19254f);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            this.f19256h += 2;
            if (this.f19256h <= this.f19255g) {
                int read = this.f19253e.read();
                int read2 = this.f19253e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f19254f;
                    if (byteOrder == f19251i) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f19252j) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f19254f);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f19256h += 2;
            return this.f19253e.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f19256h++;
            return this.f19253e.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            this.f19256h += 2;
            if (this.f19256h <= this.f19255g) {
                int read = this.f19253e.read();
                int read2 = this.f19253e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f19254f;
                    if (byteOrder == f19251i) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f19252j) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f19254f);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f19255g - this.f19256h);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f19253e.skipBytes(min - i2);
            }
            this.f19256h += i2;
            return i2;
        }

        /* renamed from: a */
        public void mo19753a(long j) throws IOException {
            int i = this.f19256h;
            if (((long) i) > j) {
                this.f19256h = 0;
                this.f19253e.reset();
                this.f19253e.mark(this.f19255g);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f19253e.read(bArr, i, i2);
            this.f19256h += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            this.f19256h += bArr.length;
            if (this.f19256h > this.f19255g) {
                throw new EOFException();
            } else if (this.f19253e.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C7635a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public long mo19752a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }
    }

    /* renamed from: e.j.a.a$b */
    private static class C7636b {

        /* renamed from: a */
        public final int f19257a;

        /* renamed from: b */
        public final int f19258b;

        /* renamed from: c */
        public final byte[] f19259c;

        C7636b(int i, int i2, byte[] bArr) {
            this.f19257a = i;
            this.f19258b = i2;
            this.f19259c = bArr;
        }

        /* renamed from: a */
        public static C7636b m18623a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C7634a.f19232t[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C7636b(3, iArr.length, wrap.array());
        }

        /* renamed from: b */
        public int mo19775b(ByteOrder byteOrder) {
            Object d = mo19777d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d instanceof String) {
                return Integer.parseInt((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: c */
        public String mo19776c(ByteOrder byteOrder) {
            Object d = mo19777d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            String str = ",";
            int i = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (!(d instanceof C7638d[])) {
                return null;
            } else {
                C7638d[] dVarArr = (C7638d[]) d;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f19264a);
                    sb.append('/');
                    sb.append(dVarArr[i].f19265b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01ab A[SYNTHETIC, Splitter:B:164:0x01ab] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo19777d(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                e.j.a.a$a r3 = new e.j.a.a$a     // Catch:{ IOException -> 0x0196, all -> 0x0193 }
                byte[] r4 = r10.f19259c     // Catch:{ IOException -> 0x0196, all -> 0x0193 }
                r3.<init>(r4)     // Catch:{ IOException -> 0x0196, all -> 0x0193 }
                r3.mo19754a(r11)     // Catch:{ IOException -> 0x0191 }
                int r11 = r10.f19257a     // Catch:{ IOException -> 0x0191 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x014c;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x014c;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0191 }
            L_0x0016:
                goto L_0x0188
            L_0x0018:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x001c:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0036:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0191 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                e.j.a.a$d[] r11 = new p214e.p241j.p242a.C7634a.C7638d[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0051:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0191 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0191 }
                e.j.a.a$d r4 = new e.j.a.a$d     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0076:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0090:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                e.j.a.a$d[] r11 = new p214e.p241j.p242a.C7634a.C7638d[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00aa:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo19752a()     // Catch:{ IOException -> 0x0191 }
                long r8 = r3.mo19752a()     // Catch:{ IOException -> 0x0191 }
                e.j.a.a$d r4 = new e.j.a.a$d     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00cd:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo19752a()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00e7:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = p214e.p241j.p242a.C7634a.f19233u     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 < r6) goto L_0x011e
                r11 = 0
            L_0x0105:
                byte[] r6 = p214e.p241j.p242a.C7634a.f19233u     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 >= r6) goto L_0x0119
                byte[] r6 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r11]     // Catch:{ IOException -> 0x0191 }
                byte[] r7 = p214e.p241j.p242a.C7634a.f19233u     // Catch:{ IOException -> 0x0191 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0191 }
                if (r6 == r7) goto L_0x0116
                r4 = 0
                goto L_0x0119
            L_0x0116:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0119:
                if (r4 == 0) goto L_0x011e
                byte[] r11 = p214e.p241j.p242a.C7634a.f19233u     // Catch:{ IOException -> 0x0191 }
                int r5 = r11.length     // Catch:{ IOException -> 0x0191 }
            L_0x011e:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
                r11.<init>()     // Catch:{ IOException -> 0x0191 }
            L_0x0123:
                int r4 = r10.f19258b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x013f
                byte[] r4 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0191 }
                if (r4 != 0) goto L_0x012e
                goto L_0x013f
            L_0x012e:
                r6 = 32
                if (r4 < r6) goto L_0x0137
                char r4 = (char) r4     // Catch:{ IOException -> 0x0191 }
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
                goto L_0x013c
            L_0x0137:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
            L_0x013c:
                int r5 = r5 + 1
                goto L_0x0123
            L_0x013f:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0147 }
                goto L_0x014b
            L_0x0147:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x014b:
                return r11
            L_0x014c:
                byte[] r11 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                int r11 = r11.length     // Catch:{ IOException -> 0x0191 }
                if (r11 != r4) goto L_0x0176
                byte[] r11 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 < 0) goto L_0x0176
                byte[] r11 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 > r4) goto L_0x0176
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0191 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0191 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0171 }
                goto L_0x0175
            L_0x0171:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0175:
                return r11
            L_0x0176:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                byte[] r4 = r10.f19259c     // Catch:{ IOException -> 0x0191 }
                java.nio.charset.Charset r5 = p214e.p241j.p242a.C7634a.f19223L     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0187:
                return r11
            L_0x0188:
                r3.close()     // Catch:{ IOException -> 0x018c }
                goto L_0x0190
            L_0x018c:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0190:
                return r2
            L_0x0191:
                r11 = move-exception
                goto L_0x0198
            L_0x0193:
                r11 = move-exception
                r3 = r2
                goto L_0x01a9
            L_0x0196:
                r11 = move-exception
                r3 = r2
            L_0x0198:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x01a8 }
                if (r3 == 0) goto L_0x01a7
                r3.close()     // Catch:{ IOException -> 0x01a3 }
                goto L_0x01a7
            L_0x01a3:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x01a7:
                return r2
            L_0x01a8:
                r11 = move-exception
            L_0x01a9:
                if (r3 == 0) goto L_0x01b3
                r3.close()     // Catch:{ IOException -> 0x01af }
                goto L_0x01b3
            L_0x01af:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01b3:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p214e.p241j.p242a.C7634a.C7636b.mo19777d(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(C7634a.f19231s[this.f19257a]);
            sb.append(", data length:");
            sb.append(this.f19259c.length);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public static C7636b m18619a(int i, ByteOrder byteOrder) {
            return m18623a(new int[]{i}, byteOrder);
        }

        /* renamed from: a */
        public static C7636b m18624a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C7634a.f19232t[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C7636b(4, jArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C7636b m18620a(long j, ByteOrder byteOrder) {
            return m18624a(new long[]{j}, byteOrder);
        }

        /* renamed from: a */
        public static C7636b m18622a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            byte[] bytes = sb.toString().getBytes(C7634a.f19223L);
            return new C7636b(2, bytes.length, bytes);
        }

        /* renamed from: a */
        public static C7636b m18625a(C7638d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C7634a.f19232t[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C7638d dVar : dVarArr) {
                wrap.putInt((int) dVar.f19264a);
                wrap.putInt((int) dVar.f19265b);
            }
            return new C7636b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C7636b m18621a(C7638d dVar, ByteOrder byteOrder) {
            return m18625a(new C7638d[]{dVar}, byteOrder);
        }

        /* renamed from: a */
        public double mo19774a(ByteOrder byteOrder) {
            Object d = mo19777d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (d instanceof String) {
                return Double.parseDouble((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof double[]) {
                    double[] dArr = (double[]) d;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof C7638d[]) {
                    C7638d[] dVarArr = (C7638d[]) d;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo19780a();
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }
    }

    /* renamed from: e.j.a.a$c */
    static class C7637c {

        /* renamed from: a */
        public final int f19260a;

        /* renamed from: b */
        public final String f19261b;

        /* renamed from: c */
        public final int f19262c;

        /* renamed from: d */
        public final int f19263d;

        C7637c(String str, int i, int i2) {
            this.f19261b = str;
            this.f19260a = i;
            this.f19262c = i2;
            this.f19263d = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo19779a(int i) {
            int i2 = this.f19262c;
            if (!(i2 == 7 || i == 7 || i2 == i)) {
                int i3 = this.f19263d;
                if (i3 != i) {
                    if ((i2 == 4 || i3 == 4) && i == 3) {
                        return true;
                    }
                    if ((this.f19262c == 9 || this.f19263d == 9) && i == 8) {
                        return true;
                    }
                    if ((this.f19262c == 12 || this.f19263d == 12) && i == 11) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        C7637c(String str, int i, int i2, int i3) {
            this.f19261b = str;
            this.f19260a = i;
            this.f19262c = i2;
            this.f19263d = i3;
        }
    }

    /* renamed from: e.j.a.a$d */
    private static class C7638d {

        /* renamed from: a */
        public final long f19264a;

        /* renamed from: b */
        public final long f19265b;

        C7638d(long j, long j2) {
            if (j2 == 0) {
                this.f19264a = 0;
                this.f19265b = 1;
                return;
            }
            this.f19264a = j;
            this.f19265b = j2;
        }

        /* renamed from: a */
        public double mo19780a() {
            return ((double) this.f19264a) / ((double) this.f19265b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19264a);
            sb.append(Constants.URL_PATH_DELIMITER);
            sb.append(this.f19265b);
            return sb.toString();
        }
    }

    static {
        C7637c[] cVarArr;
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(3);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(8);
        Arrays.asList(new Integer[]{valueOf, Integer.valueOf(6), valueOf2, valueOf4});
        Integer valueOf5 = Integer.valueOf(7);
        Integer valueOf6 = Integer.valueOf(5);
        Arrays.asList(new Integer[]{valueOf3, valueOf5, Integer.valueOf(4), valueOf6});
        new int[1][0] = 4;
        C7637c[] cVarArr2 = f19234v;
        f19217F = new C7637c[][]{cVarArr2, f19235w, f19236x, f19237y, f19238z, cVarArr2, f19213B, f19214C, f19215D, f19216E};
        new C7637c("JPEGInterchangeFormat", 513, 4);
        new C7637c("JPEGInterchangeFormatLength", 514, 4);
        C7637c[][] cVarArr3 = f19217F;
        f19219H = new HashMap[cVarArr3.length];
        f19220I = new HashMap[cVarArr3.length];
        f19230r.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < f19217F.length; i++) {
            f19219H[i] = new HashMap<>();
            f19220I[i] = new HashMap<>();
            for (C7637c cVar : f19217F[i]) {
                f19219H[i].put(Integer.valueOf(cVar.f19260a), cVar);
                f19220I[i].put(cVar.f19261b, cVar);
            }
        }
        f19222K.put(Integer.valueOf(f19218G[0].f19260a), valueOf6);
        f19222K.put(Integer.valueOf(f19218G[1].f19260a), valueOf);
        f19222K.put(Integer.valueOf(f19218G[2].f19260a), valueOf3);
        f19222K.put(Integer.valueOf(f19218G[3].f19260a), valueOf2);
        f19222K.put(Integer.valueOf(f19218G[4].f19260a), valueOf5);
        f19222K.put(Integer.valueOf(f19218G[5].f19260a), valueOf4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public C7634a(InputStream inputStream) throws IOException {
        C7637c[][] cVarArr = f19217F;
        this.f19242d = new HashMap[cVarArr.length];
        this.f19243e = new HashSet(cVarArr.length);
        if (inputStream != null) {
            this.f19239a = null;
            if (inputStream instanceof AssetInputStream) {
                this.f19240b = (AssetInputStream) inputStream;
            } else {
                this.f19240b = null;
            }
            m18594a(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    /* renamed from: b */
    private C7636b m18599b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f19217F.length; i++) {
            C7636b bVar = (C7636b) this.f19242d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private boolean m18608c(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m18611d(byte[] bArr) throws IOException {
        C7635a aVar = new C7635a(bArr);
        this.f19244f = m18612e(aVar);
        aVar.mo19754a(this.f19244f);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: e */
    private ByteOrder m18612e(C7635a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(readShort));
        throw new IOException(sb.toString());
    }

    /* renamed from: f */
    private void m18613f(C7635a aVar) throws IOException {
        HashMap<String, C7636b> hashMap = this.f19242d[4];
        C7636b bVar = (C7636b) hashMap.get("Compression");
        if (bVar != null) {
            this.f19245g = bVar.mo19775b(this.f19244f);
            int i = this.f19245g;
            if (i != 1) {
                if (i == 6) {
                    m18593a(aVar, (HashMap) hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m18596a((HashMap) hashMap)) {
                m18602b(aVar, (HashMap) hashMap);
                return;
            }
            return;
        }
        this.f19245g = 6;
        m18593a(aVar, (HashMap) hashMap);
    }

    /* renamed from: a */
    public String mo19751a(String str) {
        C7636b b = m18599b(str);
        if (b != null) {
            if (!f19221J.contains(str)) {
                return b.mo19776c(this.f19244f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = b.f19257a;
                String str2 = "ExifInterface";
                if (i == 5 || i == 10) {
                    C7638d[] dVarArr = (C7638d[]) b.mo19777d(this.f19244f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(dVarArr));
                        Log.w(str2, sb.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].f19264a) / ((float) dVarArr[0].f19265b))), Integer.valueOf((int) (((float) dVarArr[1].f19264a) / ((float) dVarArr[1].f19265b))), Integer.valueOf((int) (((float) dVarArr[2].f19264a) / ((float) dVarArr[2].f19265b)))});
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GPS Timestamp format is not rational. format=");
                sb2.append(b.f19257a);
                Log.w(str2, sb2.toString());
                return null;
            }
            try {
                return Double.toString(b.mo19774a(this.f19244f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m18605b(byte[] bArr) throws IOException {
        C7635a aVar = new C7635a(bArr);
        this.f19244f = m18612e(aVar);
        aVar.mo19754a(this.f19244f);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: c */
    private void m18606c(C7635a aVar) throws IOException {
        m18591a(aVar, aVar.available());
        m18601b(aVar, 0);
        m18610d(aVar, 0);
        m18610d(aVar, 5);
        m18610d(aVar, 4);
        m18603b((InputStream) aVar);
        if (this.f19241c == 8) {
            C7636b bVar = (C7636b) this.f19242d[1].get("MakerNote");
            if (bVar != null) {
                C7635a aVar2 = new C7635a(bVar.f19259c);
                aVar2.mo19754a(this.f19244f);
                aVar2.mo19753a(6);
                m18601b(aVar2, 9);
                String str = "ColorSpace";
                C7636b bVar2 = (C7636b) this.f19242d[9].get(str);
                if (bVar2 != null) {
                    this.f19242d[1].put(str, bVar2);
                }
            }
        }
    }

    /* renamed from: d */
    private void m18609d(C7635a aVar) throws IOException {
        m18606c(aVar);
        if (((C7636b) this.f19242d[0].get("JpgFromRaw")) != null) {
            m18592a(aVar, this.f19250l, 5);
        }
        C7636b bVar = (C7636b) this.f19242d[0].get("ISO");
        String str = "PhotographicSensitivity";
        C7636b bVar2 = (C7636b) this.f19242d[1].get(str);
        if (bVar != null && bVar2 == null) {
            this.f19242d[1].put(str, bVar);
        }
    }

    /* renamed from: b */
    private void m18600b(C7635a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m18592a(aVar, i, 5);
        aVar.mo19753a((long) i2);
        aVar.mo19754a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f19212A.f19260a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C7636b a = C7636b.m18619a((int) readShort, this.f19244f);
                C7636b a2 = C7636b.m18619a((int) readShort2, this.f19244f);
                this.f19242d[0].put("ImageLength", a);
                this.f19242d[0].put("ImageWidth", a2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: d */
    private void m18610d(C7635a aVar, int i) throws IOException {
        C7636b bVar;
        C7636b bVar2;
        C7636b bVar3 = (C7636b) this.f19242d[i].get("DefaultCropSize");
        C7636b bVar4 = (C7636b) this.f19242d[i].get("SensorTopBorder");
        C7636b bVar5 = (C7636b) this.f19242d[i].get("SensorLeftBorder");
        C7636b bVar6 = (C7636b) this.f19242d[i].get("SensorBottomBorder");
        C7636b bVar7 = (C7636b) this.f19242d[i].get("SensorRightBorder");
        String str = "ImageLength";
        String str2 = "ImageWidth";
        if (bVar3 != null) {
            String str3 = "Invalid crop size values. cropSize=";
            String str4 = "ExifInterface";
            if (bVar3.f19257a == 5) {
                C7638d[] dVarArr = (C7638d[]) bVar3.mo19777d(this.f19244f);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(Arrays.toString(dVarArr));
                    Log.w(str4, sb.toString());
                    return;
                }
                bVar2 = C7636b.m18621a(dVarArr[0], this.f19244f);
                bVar = C7636b.m18621a(dVarArr[1], this.f19244f);
            } else {
                int[] iArr = (int[]) bVar3.mo19777d(this.f19244f);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(Arrays.toString(iArr));
                    Log.w(str4, sb2.toString());
                    return;
                }
                bVar2 = C7636b.m18619a(iArr[0], this.f19244f);
                bVar = C7636b.m18619a(iArr[1], this.f19244f);
            }
            this.f19242d[i].put(str2, bVar2);
            this.f19242d[i].put(str, bVar);
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m18607c(aVar, i);
        } else {
            int b = bVar4.mo19775b(this.f19244f);
            int b2 = bVar6.mo19775b(this.f19244f);
            int b3 = bVar7.mo19775b(this.f19244f);
            int b4 = bVar5.mo19775b(this.f19244f);
            if (b2 > b && b3 > b4) {
                int i2 = b3 - b4;
                C7636b a = C7636b.m18619a(b2 - b, this.f19244f);
                C7636b a2 = C7636b.m18619a(i2, this.f19244f);
                this.f19242d[i].put(str, a);
                this.f19242d[i].put(str2, a2);
            }
        }
    }

    /* renamed from: a */
    public int mo19750a(String str, int i) {
        C7636b b = m18599b(str);
        if (b == null) {
            return i;
        }
        try {
            return b.mo19775b(this.f19244f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    private void m18594a(InputStream inputStream) throws IOException {
        int i = 0;
        while (i < f19217F.length) {
            try {
                this.f19242d[i] = new HashMap<>();
                i++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                m18588a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f19241c = m18587a(bufferedInputStream);
        C7635a aVar = new C7635a((InputStream) bufferedInputStream);
        switch (this.f19241c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m18606c(aVar);
                break;
            case 4:
                m18592a(aVar, 0, 0);
                break;
            case 7:
                m18590a(aVar);
                break;
            case 9:
                m18600b(aVar);
                break;
            case 10:
                m18609d(aVar);
                break;
        }
        m18613f(aVar);
        m18588a();
    }

    /* renamed from: c */
    private void m18607c(C7635a aVar, int i) throws IOException {
        C7636b bVar = (C7636b) this.f19242d[i].get("ImageWidth");
        if (((C7636b) this.f19242d[i].get("ImageLength")) == null || bVar == null) {
            C7636b bVar2 = (C7636b) this.f19242d[i].get("JPEGInterchangeFormat");
            if (bVar2 != null) {
                m18592a(aVar, bVar2.mo19775b(this.f19244f), i);
            }
        }
    }

    /* renamed from: a */
    private int m18587a(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m18597a(bArr)) {
            return 4;
        }
        if (m18608c(bArr)) {
            return 9;
        }
        if (m18605b(bArr)) {
            return 7;
        }
        return m18611d(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027d, code lost:
        if ("Model".equals(r6.f19261b) != false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028b, code lost:
        if (r5.mo19776c(r0.f19244f).contains("PENTAX") == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0293, code lost:
        if (r8.equals(r6.f19261b) == false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029e, code lost:
        if (r5.mo19775b(r0.f19244f) != 65535) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a0, code lost:
        r0.f19241c = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a9, code lost:
        if (((long) r24.peek()) == r13) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ab, code lost:
        r1.mo19753a(r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18601b(p214e.p241j.p242a.C7634a.C7635a r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f19243e
            int r4 = r1.f19256h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f19256h
            int r3 = r3 + 2
            int r4 = r1.f19255g
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            int r4 = r1.f19256h
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f19255g
            if (r4 > r5) goto L_0x0326
            if (r3 > 0) goto L_0x002b
            goto L_0x0326
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r9 = "ExifInterface"
            if (r5 >= r3) goto L_0x02b7
            int r10 = r24.readUnsignedShort()
            int r11 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r13 = r24.peek()
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap<java.lang.Integer, e.j.a.a$c>[] r17 = f19219H
            r4 = r17[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r8)
            e.j.a.a$c r4 = (p214e.p241j.p242a.C7634a.C7637c) r4
            r8 = 7
            if (r4 != 0) goto L_0x006b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Skip the tag entry since tag number is not defined: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
            android.util.Log.w(r9, r6)
            goto L_0x00e7
        L_0x006b:
            if (r11 <= 0) goto L_0x00d3
            int[] r6 = f19232t
            int r6 = r6.length
            if (r11 < r6) goto L_0x0073
            goto L_0x00d3
        L_0x0073:
            boolean r6 = r4.mo19779a(r11)
            if (r6 != 0) goto L_0x009c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f19231s
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f19261b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r9, r6)
            goto L_0x00e7
        L_0x009c:
            if (r11 != r8) goto L_0x00a0
            int r11 = r4.f19262c
        L_0x00a0:
            long r6 = (long) r12
            int[] r15 = f19232t
            r15 = r15[r11]
            r16 = r9
            long r8 = (long) r15
            long r6 = r6 * r8
            r8 = 0
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x00bc
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r8 = 1
            r9 = r16
            goto L_0x00ea
        L_0x00bc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            r9 = r16
            android.util.Log.w(r9, r8)
            goto L_0x00e9
        L_0x00d3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r9, r6)
        L_0x00e7:
            r6 = 0
        L_0x00e9:
            r8 = 0
        L_0x00ea:
            if (r8 != 0) goto L_0x00f5
            r1.mo19753a(r13)
            r16 = r3
            r18 = r5
            goto L_0x02ae
        L_0x00f5:
            java.lang.String r8 = "Compression"
            r15 = 4
            int r18 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x01a2
            int r15 = r24.readInt()
            r16 = r3
            int r3 = r0.f19241c
            r18 = r5
            r5 = 7
            if (r3 != r5) goto L_0x0165
            java.lang.String r3 = r4.f19261b
            java.lang.String r5 = "MakerNote"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0117
            r0.f19247i = r15
            goto L_0x0160
        L_0x0117:
            r3 = 6
            if (r2 != r3) goto L_0x0160
            java.lang.String r5 = r4.f19261b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0160
            r0.f19248j = r15
            r0.f19249k = r12
            java.nio.ByteOrder r3 = r0.f19244f
            r5 = 6
            e.j.a.a$b r3 = p214e.p241j.p242a.C7634a.C7636b.m18619a(r5, r3)
            int r5 = r0.f19248j
            r20 = r11
            r19 = r12
            long r11 = (long) r5
            java.nio.ByteOrder r5 = r0.f19244f
            e.j.a.a$b r5 = p214e.p241j.p242a.C7634a.C7636b.m18620a(r11, r5)
            int r11 = r0.f19249k
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.f19244f
            e.j.a.a$b r2 = p214e.p241j.p242a.C7634a.C7636b.m18620a(r11, r2)
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r11 = r0.f19242d
            r12 = 4
            r11 = r11[r12]
            r11.put(r8, r3)
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r3 = r0.f19242d
            r3 = r3[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r3.put(r11, r5)
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r3 = r0.f19242d
            r3 = r3[r12]
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r3.put(r5, r2)
            goto L_0x0179
        L_0x0160:
            r20 = r11
            r19 = r12
            goto L_0x0179
        L_0x0165:
            r20 = r11
            r19 = r12
            r2 = 10
            if (r3 != r2) goto L_0x0179
            java.lang.String r2 = r4.f19261b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0179
            r0.f19250l = r15
        L_0x0179:
            long r2 = (long) r15
            long r11 = r2 + r6
            int r5 = r1.f19255g
            r21 = r4
            long r4 = (long) r5
            int r22 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r22 > 0) goto L_0x0189
            r1.mo19753a(r2)
            goto L_0x01ac
        L_0x0189:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r9, r2)
            r1.mo19753a(r13)
            goto L_0x02ae
        L_0x01a2:
            r16 = r3
            r21 = r4
            r18 = r5
            r20 = r11
            r19 = r12
        L_0x01ac:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f19222K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r4 = 3
            if (r2 == 0) goto L_0x0245
            r5 = -1
            r11 = r20
            if (r11 == r4) goto L_0x01e2
            r4 = 4
            if (r11 == r4) goto L_0x01dd
            if (r11 == r3) goto L_0x01d8
            r3 = 9
            if (r11 == r3) goto L_0x01d3
            r3 = 13
            if (r11 == r3) goto L_0x01d3
        L_0x01d0:
            r3 = 0
            goto L_0x01e8
        L_0x01d3:
            int r3 = r24.readInt()
            goto L_0x01e6
        L_0x01d8:
            short r3 = r24.readShort()
            goto L_0x01e6
        L_0x01dd:
            long r5 = r24.mo19752a()
            goto L_0x01d0
        L_0x01e2:
            int r3 = r24.readUnsignedShort()
        L_0x01e6:
            long r5 = (long) r3
            goto L_0x01d0
        L_0x01e8:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x022d
            int r3 = r1.f19255g
            long r3 = (long) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x022d
            java.util.Set<java.lang.Integer> r3 = r0.f19243e
            int r4 = (int) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x020b
            r1.mo19753a(r5)
            int r2 = r2.intValue()
            r0.m18601b(r1, r2)
            goto L_0x0241
        L_0x020b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r9, r2)
            goto L_0x0241
        L_0x022d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r9, r2)
        L_0x0241:
            r1.mo19753a(r13)
            goto L_0x02ae
        L_0x0245:
            r11 = r20
            int r2 = (int) r6
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            e.j.a.a$b r5 = new e.j.a.a$b
            r6 = r19
            r5.<init>(r11, r6, r2)
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r2 = r0.f19242d
            r2 = r2[r25]
            r6 = r21
            java.lang.String r7 = r6.f19261b
            r2.put(r7, r5)
            java.lang.String r2 = r6.f19261b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x026b
            r0.f19241c = r4
        L_0x026b:
            java.lang.String r2 = r6.f19261b
            java.lang.String r4 = "Make"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x027f
            java.lang.String r2 = r6.f19261b
            java.lang.String r4 = "Model"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x028d
        L_0x027f:
            java.nio.ByteOrder r2 = r0.f19244f
            java.lang.String r2 = r5.mo19776c(r2)
            java.lang.String r4 = "PENTAX"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x02a0
        L_0x028d:
            java.lang.String r2 = r6.f19261b
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x02a2
            java.nio.ByteOrder r2 = r0.f19244f
            int r2 = r5.mo19775b(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x02a2
        L_0x02a0:
            r0.f19241c = r3
        L_0x02a2:
            int r2 = r24.peek()
            long r2 = (long) r2
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x02ae
            r1.mo19753a(r13)
        L_0x02ae:
            int r5 = r18 + 1
            short r5 = (short) r5
            r2 = r25
            r3 = r16
            goto L_0x002c
        L_0x02b7:
            int r2 = r24.peek()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f19255g
            if (r2 > r3) goto L_0x0326
            int r2 = r24.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0312
            int r5 = r1.f19255g
            if (r2 >= r5) goto L_0x0312
            java.util.Set<java.lang.Integer> r5 = r0.f19243e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02fd
            r1.mo19753a(r3)
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r2 = r0.f19242d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02ee
            r0.m18601b(r1, r3)
            goto L_0x0326
        L_0x02ee:
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r2 = r0.f19242d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0326
            r0.m18601b(r1, r3)
            goto L_0x0326
        L_0x02fd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
            goto L_0x0326
        L_0x0312:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p241j.p242a.C7634a.m18601b(e.j.a.a$a, int):void");
    }

    /* renamed from: a */
    private static boolean m18597a(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f19227o;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18592a(p214e.p241j.p242a.C7634a.C7635a r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.mo19754a(r0)
            long r0 = (long) r11
            r10.mo19753a(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r0 = r9.f19242d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f19244f
            e.j.a.a$b r5 = p214e.p241j.p242a.C7634a.C7636b.m18620a(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r0 = r9.f19242d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f19244f
            e.j.a.a$b r5 = p214e.p241j.p242a.C7634a.C7636b.m18620a(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.mo19751a(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, e.j.a.a$b>[] r5 = r9.f19242d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = f19223L
            r7.<init>(r0, r8)
            e.j.a.a$b r0 = p214e.p241j.p242a.C7634a.C7636b.m18622a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = f19224M
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f19246h = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.m18595a(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f19244f
            r10.mo19754a(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p241j.p242a.C7634a.m18592a(e.j.a.a$a, int, int):void");
    }

    /* renamed from: a */
    private void m18590a(C7635a aVar) throws IOException {
        m18606c(aVar);
        C7636b bVar = (C7636b) this.f19242d[1].get("MakerNote");
        if (bVar != null) {
            C7635a aVar2 = new C7635a(bVar.f19259c);
            aVar2.mo19754a(this.f19244f);
            byte[] bArr = new byte[f19228p.length];
            aVar2.readFully(bArr);
            aVar2.mo19753a(0);
            byte[] bArr2 = new byte[f19229q.length];
            aVar2.readFully(bArr2);
            if (Arrays.equals(bArr, f19228p)) {
                aVar2.mo19753a(8);
            } else if (Arrays.equals(bArr2, f19229q)) {
                aVar2.mo19753a(12);
            }
            m18601b(aVar2, 6);
            C7636b bVar2 = (C7636b) this.f19242d[7].get("PreviewImageStart");
            C7636b bVar3 = (C7636b) this.f19242d[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.f19242d[5].put("JPEGInterchangeFormat", bVar2);
                this.f19242d[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            C7636b bVar4 = (C7636b) this.f19242d[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.mo19777d(this.f19244f);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C7636b a = C7636b.m18619a(i, this.f19244f);
                    C7636b a2 = C7636b.m18619a(i2, this.f19244f);
                    this.f19242d[0].put("ImageWidth", a);
                    this.f19242d[0].put("ImageLength", a2);
                }
            }
        }
    }

    /* renamed from: b */
    private void m18602b(C7635a aVar, HashMap hashMap) throws IOException {
        C7636b bVar = (C7636b) hashMap.get("StripOffsets");
        C7636b bVar2 = (C7636b) hashMap.get("StripByteCounts");
        if (!(bVar == null || bVar2 == null)) {
            long[] a = m18598a(bVar.mo19777d(this.f19244f));
            long[] a2 = m18598a(bVar2.mo19777d(this.f19244f));
            String str = "ExifInterface";
            if (a == null) {
                Log.w(str, "stripOffsets should not be null.");
            } else if (a2 == null) {
                Log.w(str, "stripByteCounts should not be null.");
            } else {
                long j = 0;
                for (long j2 : a2) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a.length; i3++) {
                    int i4 = (int) a2[i3];
                    int i5 = ((int) a[i3]) - i;
                    if (i5 < 0) {
                        Log.d(str, "Invalid strip offset value");
                    }
                    aVar.mo19753a((long) i5);
                    int i6 = i + i5;
                    byte[] bArr2 = new byte[i4];
                    aVar.read(bArr2);
                    i = i6 + i4;
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
            }
        }
    }

    /* renamed from: a */
    private void m18595a(byte[] bArr, int i) throws IOException {
        C7635a aVar = new C7635a(bArr);
        m18591a(aVar, bArr.length);
        m18601b(aVar, i);
    }

    /* renamed from: a */
    private void m18588a() {
        String a = mo19751a("DateTimeOriginal");
        if (a != null) {
            String str = "DateTime";
            if (mo19751a(str) == null) {
                this.f19242d[0].put(str, C7636b.m18622a(a));
            }
        }
        String str2 = "ImageWidth";
        if (mo19751a(str2) == null) {
            this.f19242d[0].put(str2, C7636b.m18620a(0, this.f19244f));
        }
        String str3 = "ImageLength";
        if (mo19751a(str3) == null) {
            this.f19242d[0].put(str3, C7636b.m18620a(0, this.f19244f));
        }
        String str4 = "Orientation";
        if (mo19751a(str4) == null) {
            this.f19242d[0].put(str4, C7636b.m18620a(0, this.f19244f));
        }
        String str5 = "LightSource";
        if (mo19751a(str5) == null) {
            this.f19242d[1].put(str5, C7636b.m18620a(0, this.f19244f));
        }
    }

    /* renamed from: b */
    private boolean m18604b(HashMap hashMap) throws IOException {
        C7636b bVar = (C7636b) hashMap.get("ImageLength");
        C7636b bVar2 = (C7636b) hashMap.get("ImageWidth");
        if (!(bVar == null || bVar2 == null)) {
            int b = bVar.mo19775b(this.f19244f);
            int b2 = bVar2.mo19775b(this.f19244f);
            if (b <= 512 && b2 <= 512) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m18603b(InputStream inputStream) throws IOException {
        m18589a(0, 5);
        m18589a(0, 4);
        m18589a(5, 4);
        C7636b bVar = (C7636b) this.f19242d[1].get("PixelXDimension");
        C7636b bVar2 = (C7636b) this.f19242d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f19242d[0].put("ImageWidth", bVar);
            this.f19242d[0].put("ImageLength", bVar2);
        }
        if (this.f19242d[4].isEmpty() && m18604b((HashMap) this.f19242d[5])) {
            HashMap<String, C7636b>[] hashMapArr = this.f19242d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m18604b((HashMap) this.f19242d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m18591a(C7635a aVar, int i) throws IOException {
        this.f19244f = m18612e(aVar);
        aVar.mo19754a(this.f19244f);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f19241c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't jump to first Ifd: ");
                sb2.append(i3);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    /* renamed from: a */
    private void m18593a(C7635a aVar, HashMap hashMap) throws IOException {
        int i;
        C7636b bVar = (C7636b) hashMap.get("JPEGInterchangeFormat");
        C7636b bVar2 = (C7636b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int b = bVar.mo19775b(this.f19244f);
            int min = Math.min(bVar2.mo19775b(this.f19244f), aVar.available() - b);
            int i2 = this.f19241c;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.f19246h;
            } else {
                if (i2 == 7) {
                    i = this.f19247i;
                }
                if (b > 0 && min > 0 && this.f19239a == null && this.f19240b == null) {
                    byte[] bArr = new byte[min];
                    aVar.mo19753a((long) b);
                    aVar.readFully(bArr);
                    return;
                }
                return;
            }
            b += i;
            if (b > 0) {
            }
        }
    }

    /* renamed from: a */
    private boolean m18596a(HashMap hashMap) throws IOException {
        C7636b bVar = (C7636b) hashMap.get("BitsPerSample");
        if (bVar != null) {
            int[] iArr = (int[]) bVar.mo19777d(this.f19244f);
            if (Arrays.equals(f19225m, iArr)) {
                return true;
            }
            if (this.f19241c == 3) {
                C7636b bVar2 = (C7636b) hashMap.get("PhotometricInterpretation");
                if (bVar2 != null) {
                    int b = bVar2.mo19775b(this.f19244f);
                    if ((b == 1 && Arrays.equals(iArr, f19226n)) || (b == 6 && Arrays.equals(iArr, f19225m))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m18589a(int i, int i2) throws IOException {
        if (!this.f19242d[i].isEmpty() && !this.f19242d[i2].isEmpty()) {
            String str = "ImageLength";
            C7636b bVar = (C7636b) this.f19242d[i].get(str);
            String str2 = "ImageWidth";
            C7636b bVar2 = (C7636b) this.f19242d[i].get(str2);
            C7636b bVar3 = (C7636b) this.f19242d[i2].get(str);
            C7636b bVar4 = (C7636b) this.f19242d[i2].get(str2);
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int b = bVar.mo19775b(this.f19244f);
                int b2 = bVar2.mo19775b(this.f19244f);
                int b3 = bVar3.mo19775b(this.f19244f);
                int b4 = bVar4.mo19775b(this.f19244f);
                if (b < b3 && b2 < b4) {
                    HashMap<String, C7636b>[] hashMapArr = this.f19242d;
                    HashMap<String, C7636b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: a */
    private static long[] m18598a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
