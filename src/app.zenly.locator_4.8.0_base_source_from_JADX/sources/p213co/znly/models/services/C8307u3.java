package p213co.znly.models.services;

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

/* renamed from: co.znly.models.services.u3 */
public final class C8307u3 extends GeneratedMessageLite<C8307u3, C8308a> implements ZenlyProto$PingEmojiOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8307u3 f21003g = new C8307u3();

    /* renamed from: h */
    private static volatile Parser<C8307u3> f21004h;

    /* renamed from: e */
    private String f21005e;

    /* renamed from: f */
    private String f21006f;

    /* renamed from: co.znly.models.services.u3$a */
    public static final class C8308a extends Builder<C8307u3, C8308a> implements ZenlyProto$PingEmojiOrBuilder {
        private C8308a() {
            super(C8307u3.f21003g);
        }

        /* synthetic */ C8308a(C8104i0 i0Var) {
            this();
        }

        public String getUtf8() {
            return ((C8307u3) this.instance).getUtf8();
        }

        public ByteString getUtf8Bytes() {
            return ((C8307u3) this.instance).getUtf8Bytes();
        }

        public String getUuid() {
            return ((C8307u3) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C8307u3) this.instance).getUuidBytes();
        }
    }

    static {
        f21003g.makeImmutable();
    }

    private C8307u3() {
        String str = "";
        this.f21005e = str;
        this.f21006f = str;
    }

    public static Parser<C8307u3> parser() {
        return f21003g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8307u3();
            case 2:
                return f21003g;
            case 3:
                return null;
            case 4:
                return new C8308a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8307u3 u3Var = (C8307u3) obj2;
                this.f21005e = visitor.visitString(!this.f21005e.isEmpty(), this.f21005e, !u3Var.f21005e.isEmpty(), u3Var.f21005e);
                this.f21006f = visitor.visitString(!this.f21006f.isEmpty(), this.f21006f, true ^ u3Var.f21006f.isEmpty(), u3Var.f21006f);
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
                                this.f21005e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f21006f = codedInputStream.readStringRequireUtf8();
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
                if (f21004h == null) {
                    synchronized (C8307u3.class) {
                        if (f21004h == null) {
                            f21004h = new DefaultInstanceBasedParser(f21003g);
                        }
                    }
                }
                return f21004h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21003g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21005e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUtf8());
        }
        if (!this.f21006f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUtf8() {
        return this.f21005e;
    }

    public ByteString getUtf8Bytes() {
        return ByteString.copyFromUtf8(this.f21005e);
    }

    public String getUuid() {
        return this.f21006f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f21006f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21005e.isEmpty()) {
            codedOutputStream.writeString(1, getUtf8());
        }
        if (!this.f21006f.isEmpty()) {
            codedOutputStream.writeString(2, getUuid());
        }
    }
}
