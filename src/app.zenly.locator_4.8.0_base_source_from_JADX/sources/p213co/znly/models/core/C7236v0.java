package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.v0 */
public final class C7236v0 extends GeneratedMessageLite<C7236v0, C7237a> implements CoreUserProto$DescendantListOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7236v0 f17956f = new C7236v0();

    /* renamed from: g */
    private static volatile Parser<C7236v0> f17957g;

    /* renamed from: e */
    private ProtobufList<C7226u0> f17958e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.v0$a */
    public static final class C7237a extends Builder<C7236v0, C7237a> implements CoreUserProto$DescendantListOrBuilder {
        /* synthetic */ C7237a(C7203r0 r0Var) {
            this();
        }

        public C7226u0 getDescendants(int i) {
            return ((C7236v0) this.instance).getDescendants(i);
        }

        public int getDescendantsCount() {
            return ((C7236v0) this.instance).getDescendantsCount();
        }

        public List<C7226u0> getDescendantsList() {
            return Collections.unmodifiableList(((C7236v0) this.instance).getDescendantsList());
        }

        private C7237a() {
            super(C7236v0.f17956f);
        }
    }

    static {
        f17956f.makeImmutable();
    }

    private C7236v0() {
    }

    public static C7237a newBuilder() {
        return (C7237a) f17956f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7203r0.f17852a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7236v0();
            case 2:
                return f17956f;
            case 3:
                this.f17958e.makeImmutable();
                return null;
            case 4:
                return new C7237a(null);
            case 5:
                this.f17958e = ((Visitor) obj).visitList(this.f17958e, ((C7236v0) obj2).f17958e);
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
                                if (!this.f17958e.isModifiable()) {
                                    this.f17958e = GeneratedMessageLite.mutableCopy(this.f17958e);
                                }
                                this.f17958e.add(codedInputStream.readMessage(C7226u0.parser(), extensionRegistryLite));
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
                if (f17957g == null) {
                    synchronized (C7236v0.class) {
                        if (f17957g == null) {
                            f17957g = new DefaultInstanceBasedParser(f17956f);
                        }
                    }
                }
                return f17957g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17956f;
    }

    public C7226u0 getDescendants(int i) {
        return (C7226u0) this.f17958e.get(i);
    }

    public int getDescendantsCount() {
        return this.f17958e.size();
    }

    public List<C7226u0> getDescendantsList() {
        return this.f17958e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17958e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17958e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17958e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17958e.get(i));
        }
    }
}
