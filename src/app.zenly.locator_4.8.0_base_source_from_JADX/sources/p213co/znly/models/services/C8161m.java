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
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape.C7892a;

/* renamed from: co.znly.models.services.m */
public final class C8161m extends GeneratedMessageLite<C8161m, C8162a> implements C7934xe58bf501 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8161m f20666g = new C8161m();

    /* renamed from: h */
    private static volatile Parser<C8161m> f20667h;

    /* renamed from: e */
    private long f20668e;

    /* renamed from: f */
    private ReverseGeoCoderProto$Shape f20669f;

    /* renamed from: co.znly.models.services.m$a */
    public static final class C8162a extends Builder<C8161m, C8162a> implements C7934xe58bf501 {
        /* synthetic */ C8162a(C8005c cVar) {
            this();
        }

        public long getId() {
            return ((C8161m) this.instance).getId();
        }

        public ReverseGeoCoderProto$Shape getShapes() {
            return ((C8161m) this.instance).getShapes();
        }

        public boolean hasShapes() {
            return ((C8161m) this.instance).hasShapes();
        }

        private C8162a() {
            super(C8161m.f20666g);
        }
    }

    static {
        f20666g.makeImmutable();
    }

    private C8161m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8161m();
            case 2:
                return f20666g;
            case 3:
                return null;
            case 4:
                return new C8162a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8161m mVar = (C8161m) obj2;
                this.f20668e = visitor.visitLong(this.f20668e != 0, this.f20668e, mVar.f20668e != 0, mVar.f20668e);
                this.f20669f = (ReverseGeoCoderProto$Shape) visitor.visitMessage(this.f20669f, mVar.f20669f);
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
                                this.f20668e = codedInputStream.readUInt64();
                            } else if (readTag == 18) {
                                Builder builder = this.f20669f != null ? (C7892a) this.f20669f.toBuilder() : null;
                                this.f20669f = (ReverseGeoCoderProto$Shape) codedInputStream.readMessage(ReverseGeoCoderProto$Shape.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20669f);
                                    this.f20669f = (ReverseGeoCoderProto$Shape) builder.buildPartial();
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
                if (f20667h == null) {
                    synchronized (C8161m.class) {
                        if (f20667h == null) {
                            f20667h = new DefaultInstanceBasedParser(f20666g);
                        }
                    }
                }
                return f20667h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20666g;
    }

    public long getId() {
        return this.f20668e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f20668e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        if (this.f20669f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getShapes());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ReverseGeoCoderProto$Shape getShapes() {
        ReverseGeoCoderProto$Shape reverseGeoCoderProto$Shape = this.f20669f;
        return reverseGeoCoderProto$Shape == null ? ReverseGeoCoderProto$Shape.getDefaultInstance() : reverseGeoCoderProto$Shape;
    }

    public boolean hasShapes() {
        return this.f20669f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f20668e;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (this.f20669f != null) {
            codedOutputStream.writeMessage(2, getShapes());
        }
    }
}
