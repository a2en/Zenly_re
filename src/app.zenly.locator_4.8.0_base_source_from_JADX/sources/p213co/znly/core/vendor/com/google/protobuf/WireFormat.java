package p213co.znly.core.vendor.com.google.protobuf;

import java.io.IOException;

/* renamed from: co.znly.core.vendor.com.google.protobuf.WireFormat */
public final class WireFormat {
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* renamed from: co.znly.core.vendor.com.google.protobuf.WireFormat$1 */
    static /* synthetic */ class C67001 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = new int[FieldType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType[] r0 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x006e }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x007a }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0086 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0092 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x009e }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00aa }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00b6 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00c2 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00ce }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00da }
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00da }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.vendor.com.google.protobuf.WireFormat.C67001.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType */
    public enum FieldType {
        DOUBLE(JavaType.DOUBLE, 1),
        FLOAT(JavaType.FLOAT, 5),
        INT64(JavaType.LONG, 0),
        UINT64(JavaType.LONG, 0),
        INT32(JavaType.INT, 0),
        FIXED64(JavaType.LONG, 1),
        FIXED32(JavaType.INT, 5),
        BOOL(JavaType.BOOLEAN, 0),
        STRING(JavaType.STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        GROUP(JavaType.MESSAGE, 3) {
            public boolean isPackable() {
                return false;
            }
        },
        MESSAGE(JavaType.MESSAGE, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        BYTES(JavaType.BYTE_STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        UINT32(JavaType.INT, 0),
        ENUM(JavaType.ENUM, 0),
        SFIXED32(JavaType.INT, 5),
        SFIXED64(JavaType.LONG, 1),
        SINT32(JavaType.INT, 0),
        SINT64(JavaType.LONG, 0);
        
        private final JavaType javaType;
        private final int wireType;

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private FieldType(JavaType javaType2, int i) {
            this.javaType = javaType2;
            this.wireType = i;
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.WireFormat$JavaType */
    public enum JavaType {
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN,
        STRING,
        BYTE_STRING,
        ENUM,
        MESSAGE
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.WireFormat$Utf8Validation */
    enum Utf8Validation {
        LOOSE {
            /* access modifiers changed from: 0000 */
            public Object readString(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readString();
            }
        },
        STRICT {
            /* access modifiers changed from: 0000 */
            public Object readString(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readStringRequireUtf8();
            }
        },
        LAZY {
            /* access modifiers changed from: 0000 */
            public Object readString(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readBytes();
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract Object readString(CodedInputStream codedInputStream) throws IOException;
    }

    private WireFormat() {
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public static int getTagWireType(int i) {
        return i & 7;
    }

    static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }

    static Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, Utf8Validation utf8Validation) throws IOException {
        switch (C67001.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.readDouble());
            case 2:
                return Float.valueOf(codedInputStream.readFloat());
            case 3:
                return Long.valueOf(codedInputStream.readInt64());
            case 4:
                return Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readBytes();
            case 10:
                return Integer.valueOf(codedInputStream.readUInt32());
            case 11:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                return utf8Validation.readString(codedInputStream);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
