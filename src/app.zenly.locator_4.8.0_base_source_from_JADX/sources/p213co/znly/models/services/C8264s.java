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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.services.s */
public final class C8264s extends GeneratedMessageLite<C8264s, C8265a> implements TimeTogetherProto$GatheringRequest$TimerangeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8264s f20894g = new C8264s();

    /* renamed from: h */
    private static volatile Parser<C8264s> f20895h;

    /* renamed from: e */
    private Timestamp f20896e;

    /* renamed from: f */
    private Timestamp f20897f;

    /* renamed from: co.znly.models.services.s$a */
    public static final class C8265a extends Builder<C8264s, C8265a> implements TimeTogetherProto$GatheringRequest$TimerangeOrBuilder {
        /* synthetic */ C8265a(C8251r rVar) {
            this();
        }

        public Timestamp getFromDate() {
            return ((C8264s) this.instance).getFromDate();
        }

        public Timestamp getToDate() {
            return ((C8264s) this.instance).getToDate();
        }

        public boolean hasFromDate() {
            return ((C8264s) this.instance).hasFromDate();
        }

        public boolean hasToDate() {
            return ((C8264s) this.instance).hasToDate();
        }

        private C8265a() {
            super(C8264s.f20894g);
        }
    }

    static {
        f20894g.makeImmutable();
    }

    private C8264s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8251r.f20865a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8264s();
            case 2:
                return f20894g;
            case 3:
                return null;
            case 4:
                return new C8265a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8264s sVar = (C8264s) obj2;
                this.f20896e = (Timestamp) visitor.visitMessage(this.f20896e, sVar.f20896e);
                this.f20897f = (Timestamp) visitor.visitMessage(this.f20897f, sVar.f20897f);
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
                                Builder builder = this.f20896e != null ? (Timestamp.Builder) this.f20896e.toBuilder() : null;
                                this.f20896e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20896e);
                                    this.f20896e = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20897f != null ? (Timestamp.Builder) this.f20897f.toBuilder() : null;
                                this.f20897f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20897f);
                                    this.f20897f = (Timestamp) builder2.buildPartial();
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
                if (f20895h == null) {
                    synchronized (C8264s.class) {
                        if (f20895h == null) {
                            f20895h = new DefaultInstanceBasedParser(f20894g);
                        }
                    }
                }
                return f20895h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20894g;
    }

    public Timestamp getFromDate() {
        Timestamp timestamp = this.f20896e;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20896e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFromDate());
        }
        if (this.f20897f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getToDate());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getToDate() {
        Timestamp timestamp = this.f20897f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasFromDate() {
        return this.f20896e != null;
    }

    public boolean hasToDate() {
        return this.f20897f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20896e != null) {
            codedOutputStream.writeMessage(1, getFromDate());
        }
        if (this.f20897f != null) {
            codedOutputStream.writeMessage(2, getToDate());
        }
    }
}
