package p213co.znly.models.recommendations;

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

/* renamed from: co.znly.models.recommendations.d */
public final class C7890d extends GeneratedMessageLite<C7890d, C7891a> implements RecommendationsProto$PotentialMatchOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7890d f19957g = new C7890d();

    /* renamed from: h */
    private static volatile Parser<C7890d> f19958h;

    /* renamed from: e */
    private String f19959e;

    /* renamed from: f */
    private String f19960f;

    /* renamed from: co.znly.models.recommendations.d$a */
    public static final class C7891a extends Builder<C7890d, C7891a> implements RecommendationsProto$PotentialMatchOrBuilder {
        /* synthetic */ C7891a(C7885a aVar) {
            this();
        }

        public String getPotentialMatchUuid() {
            return ((C7890d) this.instance).getPotentialMatchUuid();
        }

        public ByteString getPotentialMatchUuidBytes() {
            return ((C7890d) this.instance).getPotentialMatchUuidBytes();
        }

        public String getRecommendationUuid() {
            return ((C7890d) this.instance).getRecommendationUuid();
        }

        public ByteString getRecommendationUuidBytes() {
            return ((C7890d) this.instance).getRecommendationUuidBytes();
        }

        private C7891a() {
            super(C7890d.f19957g);
        }
    }

    static {
        f19957g.makeImmutable();
    }

    private C7890d() {
        String str = "";
        this.f19959e = str;
        this.f19960f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7885a.f19943a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7890d();
            case 2:
                return f19957g;
            case 3:
                return null;
            case 4:
                return new C7891a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7890d dVar = (C7890d) obj2;
                this.f19959e = visitor.visitString(!this.f19959e.isEmpty(), this.f19959e, !dVar.f19959e.isEmpty(), dVar.f19959e);
                this.f19960f = visitor.visitString(!this.f19960f.isEmpty(), this.f19960f, true ^ dVar.f19960f.isEmpty(), dVar.f19960f);
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
                                this.f19959e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f19960f = codedInputStream.readStringRequireUtf8();
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
                if (f19958h == null) {
                    synchronized (C7890d.class) {
                        if (f19958h == null) {
                            f19958h = new DefaultInstanceBasedParser(f19957g);
                        }
                    }
                }
                return f19958h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19957g;
    }

    public String getPotentialMatchUuid() {
        return this.f19959e;
    }

    public ByteString getPotentialMatchUuidBytes() {
        return ByteString.copyFromUtf8(this.f19959e);
    }

    public String getRecommendationUuid() {
        return this.f19960f;
    }

    public ByteString getRecommendationUuidBytes() {
        return ByteString.copyFromUtf8(this.f19960f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19959e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getPotentialMatchUuid());
        }
        if (!this.f19960f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getRecommendationUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19959e.isEmpty()) {
            codedOutputStream.writeString(1, getPotentialMatchUuid());
        }
        if (!this.f19960f.isEmpty()) {
            codedOutputStream.writeString(2, getRecommendationUuid());
        }
    }
}
