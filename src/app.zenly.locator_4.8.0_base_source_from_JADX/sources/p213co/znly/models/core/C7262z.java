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

/* renamed from: co.znly.models.core.z */
public final class C7262z extends GeneratedMessageLite<C7262z, C7263a> implements ChatProto$UserUnreadCounterOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7262z f18009h = new C7262z();

    /* renamed from: i */
    private static volatile Parser<C7262z> f18010i;

    /* renamed from: e */
    private String f18011e = "";

    /* renamed from: f */
    private long f18012f;

    /* renamed from: g */
    private long f18013g;

    /* renamed from: co.znly.models.core.z$a */
    public static final class C7263a extends Builder<C7262z, C7263a> implements ChatProto$UserUnreadCounterOrBuilder {
        /* synthetic */ C7263a(C7066c cVar) {
            this();
        }

        public long getRequestUnread() {
            return ((C7262z) this.instance).getRequestUnread();
        }

        public long getUnread() {
            return ((C7262z) this.instance).getUnread();
        }

        public String getUserUuid() {
            return ((C7262z) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7262z) this.instance).getUserUuidBytes();
        }

        private C7263a() {
            super(C7262z.f18009h);
        }
    }

    static {
        f18009h.makeImmutable();
    }

    private C7262z() {
    }

    public static C7263a newBuilder() {
        return (C7263a) f18009h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7262z();
            case 2:
                return f18009h;
            case 3:
                return null;
            case 4:
                return new C7263a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7262z zVar = (C7262z) obj2;
                this.f18011e = visitor.visitString(!this.f18011e.isEmpty(), this.f18011e, !zVar.f18011e.isEmpty(), zVar.f18011e);
                this.f18012f = visitor.visitLong(this.f18012f != 0, this.f18012f, zVar.f18012f != 0, zVar.f18012f);
                this.f18013g = visitor.visitLong(this.f18013g != 0, this.f18013g, zVar.f18013g != 0, zVar.f18013g);
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
                                this.f18011e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f18012f = codedInputStream.readInt64();
                            } else if (readTag == 24) {
                                this.f18013g = codedInputStream.readInt64();
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
                if (f18010i == null) {
                    synchronized (C7262z.class) {
                        if (f18010i == null) {
                            f18010i = new DefaultInstanceBasedParser(f18009h);
                        }
                    }
                }
                return f18010i;
            default:
                throw new UnsupportedOperationException();
        }
        return f18009h;
    }

    public long getRequestUnread() {
        return this.f18013g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18011e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        long j = this.f18012f;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j);
        }
        long j2 = this.f18013g;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(3, j2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getUnread() {
        return this.f18012f;
    }

    public String getUserUuid() {
        return this.f18011e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18011e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18011e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        long j = this.f18012f;
        if (j != 0) {
            codedOutputStream.writeInt64(2, j);
        }
        long j2 = this.f18013g;
        if (j2 != 0) {
            codedOutputStream.writeInt64(3, j2);
        }
    }
}
