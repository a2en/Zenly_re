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
import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p213co.znly.models.UserAnnotationProto$UserAnnotation.C6913b;

/* renamed from: co.znly.models.services.m5 */
public final class C8175m5 extends GeneratedMessageLite<C8175m5, C8176a> implements ZenlyProto$UserAnnotationStreamDownEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8175m5 f20694f = new C8175m5();

    /* renamed from: g */
    private static volatile Parser<C8175m5> f20695g;

    /* renamed from: e */
    private UserAnnotationProto$UserAnnotation f20696e;

    /* renamed from: co.znly.models.services.m5$a */
    public static final class C8176a extends Builder<C8175m5, C8176a> implements ZenlyProto$UserAnnotationStreamDownEventOrBuilder {
        private C8176a() {
            super(C8175m5.f20694f);
        }

        /* synthetic */ C8176a(C8104i0 i0Var) {
            this();
        }

        public UserAnnotationProto$UserAnnotation getAnnotation() {
            return ((C8175m5) this.instance).getAnnotation();
        }

        public boolean hasAnnotation() {
            return ((C8175m5) this.instance).hasAnnotation();
        }
    }

    static {
        f20694f.makeImmutable();
    }

    private C8175m5() {
    }

    public static C8176a newBuilder() {
        return (C8176a) f20694f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8175m5();
            case 2:
                return f20694f;
            case 3:
                return null;
            case 4:
                return new C8176a(null);
            case 5:
                this.f20696e = (UserAnnotationProto$UserAnnotation) ((Visitor) obj).visitMessage(this.f20696e, ((C8175m5) obj2).f20696e);
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
                                Builder builder = this.f20696e != null ? (C6913b) this.f20696e.toBuilder() : null;
                                this.f20696e = (UserAnnotationProto$UserAnnotation) codedInputStream.readMessage(UserAnnotationProto$UserAnnotation.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20696e);
                                    this.f20696e = (UserAnnotationProto$UserAnnotation) builder.buildPartial();
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
                if (f20695g == null) {
                    synchronized (C8175m5.class) {
                        if (f20695g == null) {
                            f20695g = new DefaultInstanceBasedParser(f20694f);
                        }
                    }
                }
                return f20695g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20694f;
    }

    public UserAnnotationProto$UserAnnotation getAnnotation() {
        UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation = this.f20696e;
        return userAnnotationProto$UserAnnotation == null ? UserAnnotationProto$UserAnnotation.getDefaultInstance() : userAnnotationProto$UserAnnotation;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20696e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAnnotation());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAnnotation() {
        return this.f20696e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20696e != null) {
            codedOutputStream.writeMessage(1, getAnnotation());
        }
    }
}
