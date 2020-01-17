package p213co.znly.models.notifications;

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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.notifications.f0 */
public final class C7811f0 extends GeneratedMessageLite<C7811f0, C7812a> implements NotificationProto$SYNNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7811f0 f19515g = new C7811f0();

    /* renamed from: h */
    private static volatile Parser<C7811f0> f19516h;

    /* renamed from: e */
    private String f19517e = "";

    /* renamed from: f */
    private Timestamp f19518f;

    /* renamed from: co.znly.models.notifications.f0$a */
    public static final class C7812a extends Builder<C7811f0, C7812a> implements NotificationProto$SYNNotificationOrBuilder {
        /* synthetic */ C7812a(C7790a aVar) {
            this();
        }

        public String getId() {
            return ((C7811f0) this.instance).getId();
        }

        public ByteString getIdBytes() {
            return ((C7811f0) this.instance).getIdBytes();
        }

        public Timestamp getTimestamp() {
            return ((C7811f0) this.instance).getTimestamp();
        }

        public boolean hasTimestamp() {
            return ((C7811f0) this.instance).hasTimestamp();
        }

        private C7812a() {
            super(C7811f0.f19515g);
        }
    }

    static {
        f19515g.makeImmutable();
    }

    private C7811f0() {
    }

    public static C7811f0 getDefaultInstance() {
        return f19515g;
    }

    public static Parser<C7811f0> parser() {
        return f19515g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7811f0();
            case 2:
                return f19515g;
            case 3:
                return null;
            case 4:
                return new C7812a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7811f0 f0Var = (C7811f0) obj2;
                this.f19517e = visitor.visitString(!this.f19517e.isEmpty(), this.f19517e, true ^ f0Var.f19517e.isEmpty(), f0Var.f19517e);
                this.f19518f = (Timestamp) visitor.visitMessage(this.f19518f, f0Var.f19518f);
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
                                this.f19517e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f19518f != null ? (Timestamp.Builder) this.f19518f.toBuilder() : null;
                                this.f19518f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19518f);
                                    this.f19518f = (Timestamp) builder.buildPartial();
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
                if (f19516h == null) {
                    synchronized (C7811f0.class) {
                        if (f19516h == null) {
                            f19516h = new DefaultInstanceBasedParser(f19515g);
                        }
                    }
                }
                return f19516h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19515g;
    }

    public String getId() {
        return this.f19517e;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.f19517e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19517e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getId());
        }
        if (this.f19518f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getTimestamp());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.f19518f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasTimestamp() {
        return this.f19518f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19517e.isEmpty()) {
            codedOutputStream.writeString(1, getId());
        }
        if (this.f19518f != null) {
            codedOutputStream.writeMessage(2, getTimestamp());
        }
    }
}
