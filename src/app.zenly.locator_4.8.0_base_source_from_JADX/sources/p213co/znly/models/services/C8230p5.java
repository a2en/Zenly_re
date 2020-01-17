package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.UserProto$UserEngagementStats;
import p213co.znly.models.UserProto$UserEngagementStats.C6928a;

/* renamed from: co.znly.models.services.p5 */
public final class C8230p5 extends GeneratedMessageLite<C8230p5, C8231a> implements ZenlyProto$UserEngagementResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8230p5 f20827f = new C8230p5();

    /* renamed from: g */
    private static volatile Parser<C8230p5> f20828g;

    /* renamed from: e */
    private UserProto$UserEngagementStats f20829e;

    /* renamed from: co.znly.models.services.p5$a */
    public static final class C8231a extends Builder<C8230p5, C8231a> implements ZenlyProto$UserEngagementResponseOrBuilder {
        private C8231a() {
            super(C8230p5.f20827f);
        }

        /* synthetic */ C8231a(C8104i0 i0Var) {
            this();
        }

        public UserProto$UserEngagementStats getUserEngagement() {
            return ((C8230p5) this.instance).getUserEngagement();
        }

        public boolean hasUserEngagement() {
            return ((C8230p5) this.instance).hasUserEngagement();
        }
    }

    static {
        f20827f.makeImmutable();
    }

    private C8230p5() {
    }

    public static C8231a newBuilder() {
        return (C8231a) f20827f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8230p5();
            case 2:
                return f20827f;
            case 3:
                return null;
            case 4:
                return new C8231a(null);
            case 5:
                this.f20829e = (UserProto$UserEngagementStats) ((Visitor) obj).visitMessage(this.f20829e, ((C8230p5) obj2).f20829e);
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
                                Builder builder = this.f20829e != null ? (C6928a) this.f20829e.toBuilder() : null;
                                this.f20829e = (UserProto$UserEngagementStats) codedInputStream.readMessage(UserProto$UserEngagementStats.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20829e);
                                    this.f20829e = (UserProto$UserEngagementStats) builder.buildPartial();
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
                if (f20828g == null) {
                    synchronized (C8230p5.class) {
                        if (f20828g == null) {
                            f20828g = new DefaultInstanceBasedParser(f20827f);
                        }
                    }
                }
                return f20828g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20827f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20829e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUserEngagement());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$UserEngagementStats getUserEngagement() {
        UserProto$UserEngagementStats userProto$UserEngagementStats = this.f20829e;
        return userProto$UserEngagementStats == null ? UserProto$UserEngagementStats.getDefaultInstance() : userProto$UserEngagementStats;
    }

    public boolean hasUserEngagement() {
        return this.f20829e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20829e != null) {
            codedOutputStream.writeMessage(1, getUserEngagement());
        }
    }
}
