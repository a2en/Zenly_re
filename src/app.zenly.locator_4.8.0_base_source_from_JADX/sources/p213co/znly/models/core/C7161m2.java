package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.m2 */
public final class C7161m2 extends GeneratedMessageLite<C7161m2, C7162a> implements TypesProto$RecentItemStringOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7161m2 f17735g = new C7161m2();

    /* renamed from: h */
    private static volatile Parser<C7161m2> f17736h;

    /* renamed from: e */
    private String f17737e;

    /* renamed from: f */
    private String f17738f;

    /* renamed from: co.znly.models.core.m2$a */
    public static final class C7162a extends Builder<C7161m2, C7162a> implements TypesProto$RecentItemStringOrBuilder {
        /* synthetic */ C7162a(C7253x1 x1Var) {
            this();
        }

        /* renamed from: a */
        public C7162a mo19144a(String str) {
            copyOnWrite();
            ((C7161m2) this.instance).m17852a(str);
            return this;
        }

        /* renamed from: b */
        public C7162a mo19145b(String str) {
            copyOnWrite();
            ((C7161m2) this.instance).m17854b(str);
            return this;
        }

        public String getDeviceContactId() {
            return ((C7161m2) this.instance).getDeviceContactId();
        }

        public ByteString getDeviceContactIdBytes() {
            return ((C7161m2) this.instance).getDeviceContactIdBytes();
        }

        public String getUserUuid() {
            return ((C7161m2) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7161m2) this.instance).getUserUuidBytes();
        }

        private C7162a() {
            super(C7161m2.f17735g);
        }
    }

    static {
        f17735g.makeImmutable();
    }

    private C7161m2() {
        String str = "";
        this.f17737e = str;
        this.f17738f = str;
    }

    public static C7161m2 getDefaultInstance() {
        return f17735g;
    }

    public static C7162a newBuilder() {
        return (C7162a) f17735g.toBuilder();
    }

    public static Parser<C7161m2> parser() {
        return f17735g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7161m2();
            case 2:
                return f17735g;
            case 3:
                return null;
            case 4:
                return new C7162a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7161m2 m2Var = (C7161m2) obj2;
                this.f17737e = visitor.visitString(!this.f17737e.isEmpty(), this.f17737e, !m2Var.f17737e.isEmpty(), m2Var.f17737e);
                this.f17738f = visitor.visitString(!this.f17738f.isEmpty(), this.f17738f, true ^ m2Var.f17738f.isEmpty(), m2Var.f17738f);
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
                                this.f17737e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17738f = codedInputStream.readStringRequireUtf8();
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
                if (f17736h == null) {
                    synchronized (C7161m2.class) {
                        if (f17736h == null) {
                            f17736h = new DefaultInstanceBasedParser(f17735g);
                        }
                    }
                }
                return f17736h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17735g;
    }

    public String getDeviceContactId() {
        return this.f17738f;
    }

    public ByteString getDeviceContactIdBytes() {
        return ByteString.copyFromUtf8(this.f17738f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17737e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (!this.f17738f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getDeviceContactId());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f17737e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17737e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17737e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (!this.f17738f.isEmpty()) {
            codedOutputStream.writeString(2, getDeviceContactId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17854b(String str) {
        if (str != null) {
            this.f17737e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17852a(String str) {
        if (str != null) {
            this.f17738f = str;
            return;
        }
        throw new NullPointerException();
    }
}
