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

/* renamed from: co.znly.models.notifications.p */
public final class C7841p extends GeneratedMessageLite<C7841p, C7842a> implements NotificationProto$FailedMessageNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7841p f19598g = new C7841p();

    /* renamed from: h */
    private static volatile Parser<C7841p> f19599h;

    /* renamed from: e */
    private String f19600e = "";

    /* renamed from: f */
    private boolean f19601f;

    /* renamed from: co.znly.models.notifications.p$a */
    public static final class C7842a extends Builder<C7841p, C7842a> implements NotificationProto$FailedMessageNotificationOrBuilder {
        /* synthetic */ C7842a(C7790a aVar) {
            this();
        }

        public boolean getIsGroup() {
            return ((C7841p) this.instance).getIsGroup();
        }

        public String getTargetUuid() {
            return ((C7841p) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C7841p) this.instance).getTargetUuidBytes();
        }

        private C7842a() {
            super(C7841p.f19598g);
        }
    }

    static {
        f19598g.makeImmutable();
    }

    private C7841p() {
    }

    public static C7841p getDefaultInstance() {
        return f19598g;
    }

    public static Parser<C7841p> parser() {
        return f19598g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7841p();
            case 2:
                return f19598g;
            case 3:
                return null;
            case 4:
                return new C7842a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7841p pVar = (C7841p) obj2;
                this.f19600e = visitor.visitString(!this.f19600e.isEmpty(), this.f19600e, true ^ pVar.f19600e.isEmpty(), pVar.f19600e);
                boolean z = this.f19601f;
                boolean z2 = pVar.f19601f;
                this.f19601f = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f19600e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f19601f = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f19599h == null) {
                    synchronized (C7841p.class) {
                        if (f19599h == null) {
                            f19599h = new DefaultInstanceBasedParser(f19598g);
                        }
                    }
                }
                return f19599h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19598g;
    }

    public boolean getIsGroup() {
        return this.f19601f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19600e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
        }
        boolean z = this.f19601f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f19600e;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f19600e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19600e.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        boolean z = this.f19601f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
