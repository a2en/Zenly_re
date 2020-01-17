package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p213co.znly.models.services.C8131j5.C8132a;

/* renamed from: co.znly.models.services.l5 */
public final class C8159l5 extends GeneratedMessageLite<C8159l5, C8160a> implements ZenlyProto$UserAnnotationResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8159l5 f20661h = new C8159l5();

    /* renamed from: i */
    private static volatile Parser<C8159l5> f20662i;

    /* renamed from: e */
    private int f20663e;

    /* renamed from: f */
    private ProtobufList<UserAnnotationProto$UserAnnotation> f20664f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C8131j5 f20665g;

    /* renamed from: co.znly.models.services.l5$a */
    public static final class C8160a extends Builder<C8159l5, C8160a> implements ZenlyProto$UserAnnotationResponseOrBuilder {
        private C8160a() {
            super(C8159l5.f20661h);
        }

        /* synthetic */ C8160a(C8104i0 i0Var) {
            this();
        }

        public UserAnnotationProto$UserAnnotation getAnnotations(int i) {
            return ((C8159l5) this.instance).getAnnotations(i);
        }

        public int getAnnotationsCount() {
            return ((C8159l5) this.instance).getAnnotationsCount();
        }

        public List<UserAnnotationProto$UserAnnotation> getAnnotationsList() {
            return Collections.unmodifiableList(((C8159l5) this.instance).getAnnotationsList());
        }

        public C8131j5 getError() {
            return ((C8159l5) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8159l5) this.instance).hasError();
        }
    }

    static {
        f20661h.makeImmutable();
    }

    private C8159l5() {
    }

    public static C8160a newBuilder() {
        return (C8160a) f20661h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8159l5();
            case 2:
                return f20661h;
            case 3:
                this.f20664f.makeImmutable();
                return null;
            case 4:
                return new C8160a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8159l5 l5Var = (C8159l5) obj2;
                this.f20664f = visitor.visitList(this.f20664f, l5Var.f20664f);
                this.f20665g = (C8131j5) visitor.visitMessage(this.f20665g, l5Var.f20665g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20663e |= l5Var.f20663e;
                }
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
                                if (!this.f20664f.isModifiable()) {
                                    this.f20664f = GeneratedMessageLite.mutableCopy(this.f20664f);
                                }
                                this.f20664f.add(codedInputStream.readMessage(UserAnnotationProto$UserAnnotation.parser(), extensionRegistryLite));
                            } else if (readTag == 1010) {
                                Builder builder = this.f20665g != null ? (C8132a) this.f20665g.toBuilder() : null;
                                this.f20665g = (C8131j5) codedInputStream.readMessage(C8131j5.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20665g);
                                    this.f20665g = (C8131j5) builder.buildPartial();
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
                if (f20662i == null) {
                    synchronized (C8159l5.class) {
                        if (f20662i == null) {
                            f20662i = new DefaultInstanceBasedParser(f20661h);
                        }
                    }
                }
                return f20662i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20661h;
    }

    public UserAnnotationProto$UserAnnotation getAnnotations(int i) {
        return (UserAnnotationProto$UserAnnotation) this.f20664f.get(i);
    }

    public int getAnnotationsCount() {
        return this.f20664f.size();
    }

    public List<UserAnnotationProto$UserAnnotation> getAnnotationsList() {
        return this.f20664f;
    }

    public C8131j5 getError() {
        C8131j5 j5Var = this.f20665g;
        return j5Var == null ? C8131j5.getDefaultInstance() : j5Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20664f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20664f.get(i3));
        }
        if (this.f20665g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20665g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20664f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20664f.get(i));
        }
        if (this.f20665g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
