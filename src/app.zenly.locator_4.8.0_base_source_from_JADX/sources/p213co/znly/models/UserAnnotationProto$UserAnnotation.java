package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.UserAnnotationProto$UserAnnotation */
public final class UserAnnotationProto$UserAnnotation extends GeneratedMessageLite<UserAnnotationProto$UserAnnotation, C6913b> implements UserAnnotationProto$UserAnnotationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final UserAnnotationProto$UserAnnotation f16958h = new UserAnnotationProto$UserAnnotation();

    /* renamed from: i */
    private static volatile Parser<UserAnnotationProto$UserAnnotation> f16959i;

    /* renamed from: e */
    private String f16960e = "";

    /* renamed from: f */
    private C6911a f16961f;

    /* renamed from: g */
    private Timestamp f16962g;

    /* renamed from: co.znly.models.UserAnnotationProto$UserAnnotation$BrumpAnnotationOrBuilder */
    public interface BrumpAnnotationOrBuilder extends MessageLiteOrBuilder {
        Timestamp getBrumpedAt();

        float getPower();

        Timestamp getValidUntil();

        boolean hasBrumpedAt();

        boolean hasValidUntil();
    }

    /* renamed from: co.znly.models.UserAnnotationProto$UserAnnotation$a */
    public static final class C6911a extends GeneratedMessageLite<C6911a, C6912a> implements BrumpAnnotationOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6911a f16963h = new C6911a();

        /* renamed from: i */
        private static volatile Parser<C6911a> f16964i;

        /* renamed from: e */
        private Timestamp f16965e;

        /* renamed from: f */
        private Timestamp f16966f;

        /* renamed from: g */
        private float f16967g;

        /* renamed from: co.znly.models.UserAnnotationProto$UserAnnotation$a$a */
        public static final class C6912a extends Builder<C6911a, C6912a> implements BrumpAnnotationOrBuilder {
            /* synthetic */ C6912a(C7508x2 x2Var) {
                this();
            }

            public Timestamp getBrumpedAt() {
                return ((C6911a) this.instance).getBrumpedAt();
            }

            public float getPower() {
                return ((C6911a) this.instance).getPower();
            }

            public Timestamp getValidUntil() {
                return ((C6911a) this.instance).getValidUntil();
            }

            public boolean hasBrumpedAt() {
                return ((C6911a) this.instance).hasBrumpedAt();
            }

            public boolean hasValidUntil() {
                return ((C6911a) this.instance).hasValidUntil();
            }

            private C6912a() {
                super(C6911a.f16963h);
            }
        }

        static {
            f16963h.makeImmutable();
        }

        private C6911a() {
        }

        public static C6911a getDefaultInstance() {
            return f16963h;
        }

        public static Parser<C6911a> parser() {
            return f16963h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7508x2.f18867a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6911a();
                case 2:
                    return f16963h;
                case 3:
                    return null;
                case 4:
                    return new C6912a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6911a aVar = (C6911a) obj2;
                    this.f16965e = (Timestamp) visitor.visitMessage(this.f16965e, aVar.f16965e);
                    this.f16966f = (Timestamp) visitor.visitMessage(this.f16966f, aVar.f16966f);
                    boolean z2 = this.f16967g != 0.0f;
                    float f = this.f16967g;
                    if (aVar.f16967g != 0.0f) {
                        z = true;
                    }
                    this.f16967g = visitor.visitFloat(z2, f, z, aVar.f16967g);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Builder builder = this.f16965e != null ? (Timestamp.Builder) this.f16965e.toBuilder() : null;
                                    this.f16965e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16965e);
                                        this.f16965e = (Timestamp) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f16966f != null ? (Timestamp.Builder) this.f16966f.toBuilder() : null;
                                    this.f16966f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16966f);
                                        this.f16966f = (Timestamp) builder2.buildPartial();
                                    }
                                } else if (readTag == 29) {
                                    this.f16967g = codedInputStream.readFloat();
                                } else if (!codedInputStream.skipField(readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e.setUnfinishedMessage(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f16964i == null) {
                        synchronized (C6911a.class) {
                            if (f16964i == null) {
                                f16964i = new DefaultInstanceBasedParser(f16963h);
                            }
                        }
                    }
                    return f16964i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16963h;
        }

        public Timestamp getBrumpedAt() {
            Timestamp timestamp = this.f16965e;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public float getPower() {
            return this.f16967g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16965e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getBrumpedAt());
            }
            if (this.f16966f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getValidUntil());
            }
            float f = this.f16967g;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getValidUntil() {
            Timestamp timestamp = this.f16966f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasBrumpedAt() {
            return this.f16965e != null;
        }

        public boolean hasValidUntil() {
            return this.f16966f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16965e != null) {
                codedOutputStream.writeMessage(1, getBrumpedAt());
            }
            if (this.f16966f != null) {
                codedOutputStream.writeMessage(2, getValidUntil());
            }
            float f = this.f16967g;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(3, f);
            }
        }
    }

    /* renamed from: co.znly.models.UserAnnotationProto$UserAnnotation$b */
    public static final class C6913b extends Builder<UserAnnotationProto$UserAnnotation, C6913b> implements UserAnnotationProto$UserAnnotationOrBuilder {
        /* synthetic */ C6913b(C7508x2 x2Var) {
            this();
        }

        public C6911a getBrumpAnnotation() {
            return ((UserAnnotationProto$UserAnnotation) this.instance).getBrumpAnnotation();
        }

        public Timestamp getBrumpAnnotationExpiration() {
            return ((UserAnnotationProto$UserAnnotation) this.instance).getBrumpAnnotationExpiration();
        }

        public String getUserUuid() {
            return ((UserAnnotationProto$UserAnnotation) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((UserAnnotationProto$UserAnnotation) this.instance).getUserUuidBytes();
        }

        public boolean hasBrumpAnnotation() {
            return ((UserAnnotationProto$UserAnnotation) this.instance).hasBrumpAnnotation();
        }

        public boolean hasBrumpAnnotationExpiration() {
            return ((UserAnnotationProto$UserAnnotation) this.instance).hasBrumpAnnotationExpiration();
        }

        private C6913b() {
            super(UserAnnotationProto$UserAnnotation.f16958h);
        }
    }

    static {
        f16958h.makeImmutable();
    }

    private UserAnnotationProto$UserAnnotation() {
    }

    public static UserAnnotationProto$UserAnnotation getDefaultInstance() {
        return f16958h;
    }

    public static Parser<UserAnnotationProto$UserAnnotation> parser() {
        return f16958h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7508x2.f18867a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserAnnotationProto$UserAnnotation();
            case 2:
                return f16958h;
            case 3:
                return null;
            case 4:
                return new C6913b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation = (UserAnnotationProto$UserAnnotation) obj2;
                this.f16960e = visitor.visitString(!this.f16960e.isEmpty(), this.f16960e, true ^ userAnnotationProto$UserAnnotation.f16960e.isEmpty(), userAnnotationProto$UserAnnotation.f16960e);
                this.f16961f = (C6911a) visitor.visitMessage(this.f16961f, userAnnotationProto$UserAnnotation.f16961f);
                this.f16962g = (Timestamp) visitor.visitMessage(this.f16962g, userAnnotationProto$UserAnnotation.f16962g);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f16960e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f16961f != null ? (C6912a) this.f16961f.toBuilder() : null;
                                this.f16961f = (C6911a) codedInputStream.readMessage(C6911a.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16961f);
                                    this.f16961f = (C6911a) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f16962g != null ? (Timestamp.Builder) this.f16962g.toBuilder() : null;
                                this.f16962g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f16962g);
                                    this.f16962g = (Timestamp) builder2.buildPartial();
                                }
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e.setUnfinishedMessage(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f16959i == null) {
                    synchronized (UserAnnotationProto$UserAnnotation.class) {
                        if (f16959i == null) {
                            f16959i = new DefaultInstanceBasedParser(f16958h);
                        }
                    }
                }
                return f16959i;
            default:
                throw new UnsupportedOperationException();
        }
        return f16958h;
    }

    public C6911a getBrumpAnnotation() {
        C6911a aVar = this.f16961f;
        return aVar == null ? C6911a.getDefaultInstance() : aVar;
    }

    public Timestamp getBrumpAnnotationExpiration() {
        Timestamp timestamp = this.f16962g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f16960e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (this.f16961f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getBrumpAnnotation());
        }
        if (this.f16962g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getBrumpAnnotationExpiration());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f16960e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f16960e);
    }

    public boolean hasBrumpAnnotation() {
        return this.f16961f != null;
    }

    public boolean hasBrumpAnnotationExpiration() {
        return this.f16962g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16960e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (this.f16961f != null) {
            codedOutputStream.writeMessage(2, getBrumpAnnotation());
        }
        if (this.f16962g != null) {
            codedOutputStream.writeMessage(3, getBrumpAnnotationExpiration());
        }
    }
}
