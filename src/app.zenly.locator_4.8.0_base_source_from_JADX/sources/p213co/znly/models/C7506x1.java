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
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.x1 */
public final class C7506x1 extends GeneratedMessageLite<C7506x1, C7507a> implements PingProto$RtStreamConversationCursorMessage$MemberOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7506x1 f18863g = new C7506x1();

    /* renamed from: h */
    private static volatile Parser<C7506x1> f18864h;

    /* renamed from: e */
    private String f18865e;

    /* renamed from: f */
    private String f18866f;

    /* renamed from: co.znly.models.x1$a */
    public static final class C7507a extends Builder<C7506x1, C7507a> implements PingProto$RtStreamConversationCursorMessage$MemberOrBuilder {
        /* synthetic */ C7507a(C7383l1 l1Var) {
            this();
        }

        public String getChatCursor() {
            return ((C7506x1) this.instance).getChatCursor();
        }

        public ByteString getChatCursorBytes() {
            return ((C7506x1) this.instance).getChatCursorBytes();
        }

        public String getUserUuid() {
            return ((C7506x1) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7506x1) this.instance).getUserUuidBytes();
        }

        private C7507a() {
            super(C7506x1.f18863g);
        }
    }

    static {
        f18863g.makeImmutable();
    }

    private C7506x1() {
        String str = "";
        this.f18865e = str;
        this.f18866f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7506x1();
            case 2:
                return f18863g;
            case 3:
                return null;
            case 4:
                return new C7507a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7506x1 x1Var = (C7506x1) obj2;
                this.f18865e = visitor.visitString(!this.f18865e.isEmpty(), this.f18865e, !x1Var.f18865e.isEmpty(), x1Var.f18865e);
                this.f18866f = visitor.visitString(!this.f18866f.isEmpty(), this.f18866f, true ^ x1Var.f18866f.isEmpty(), x1Var.f18866f);
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
                                this.f18865e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f18866f = codedInputStream.readStringRequireUtf8();
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
                if (f18864h == null) {
                    synchronized (C7506x1.class) {
                        if (f18864h == null) {
                            f18864h = new DefaultInstanceBasedParser(f18863g);
                        }
                    }
                }
                return f18864h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18863g;
    }

    public String getChatCursor() {
        return this.f18866f;
    }

    public ByteString getChatCursorBytes() {
        return ByteString.copyFromUtf8(this.f18866f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18865e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (!this.f18866f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getChatCursor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f18865e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18865e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18865e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (!this.f18866f.isEmpty()) {
            codedOutputStream.writeString(5, getChatCursor());
        }
    }
}
