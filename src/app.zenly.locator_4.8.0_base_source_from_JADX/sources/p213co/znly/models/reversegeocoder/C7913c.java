package p213co.znly.models.reversegeocoder;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.reversegeocoder.c */
public final class C7913c extends GeneratedMessageLite<C7913c, C7914a> implements ReverseGeoCoderProto$Checkin$VenueCheckinOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7913c f20045g = new C7913c();

    /* renamed from: h */
    private static volatile Parser<C7913c> f20046h;

    /* renamed from: e */
    private long f20047e;

    /* renamed from: f */
    private C6950b0 f20048f;

    /* renamed from: co.znly.models.reversegeocoder.c$a */
    public static final class C7914a extends Builder<C7913c, C7914a> implements ReverseGeoCoderProto$Checkin$VenueCheckinOrBuilder {
        /* synthetic */ C7914a(C7910a aVar) {
            this();
        }

        public C6950b0 getCenter() {
            return ((C7913c) this.instance).getCenter();
        }

        public long getVenueId() {
            return ((C7913c) this.instance).getVenueId();
        }

        public boolean hasCenter() {
            return ((C7913c) this.instance).hasCenter();
        }

        private C7914a() {
            super(C7913c.f20045g);
        }
    }

    static {
        f20045g.makeImmutable();
    }

    private C7913c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7913c();
            case 2:
                return f20045g;
            case 3:
                return null;
            case 4:
                return new C7914a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7913c cVar = (C7913c) obj2;
                this.f20047e = visitor.visitLong(this.f20047e != 0, this.f20047e, cVar.f20047e != 0, cVar.f20047e);
                this.f20048f = (C6950b0) visitor.visitMessage(this.f20048f, cVar.f20048f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20047e = codedInputStream.readUInt64();
                            } else if (readTag == 18) {
                                Builder builder = this.f20048f != null ? (C6951a) this.f20048f.toBuilder() : null;
                                this.f20048f = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20048f);
                                    this.f20048f = (C6950b0) builder.buildPartial();
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
                if (f20046h == null) {
                    synchronized (C7913c.class) {
                        if (f20046h == null) {
                            f20046h = new DefaultInstanceBasedParser(f20045g);
                        }
                    }
                }
                return f20046h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20045g;
    }

    public C6950b0 getCenter() {
        C6950b0 b0Var = this.f20048f;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f20047e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        if (this.f20048f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCenter());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getVenueId() {
        return this.f20047e;
    }

    public boolean hasCenter() {
        return this.f20048f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f20047e;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (this.f20048f != null) {
            codedOutputStream.writeMessage(2, getCenter());
        }
    }
}
