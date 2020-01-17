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
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse.UserVisitPoint;

/* renamed from: co.znly.models.services.z5 */
public final class C8405z5 extends GeneratedMessageLite<C8405z5, C8406a> implements ZenlyProto$UserVisitPointStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8405z5 f21272f = new C8405z5();

    /* renamed from: g */
    private static volatile Parser<C8405z5> f21273g;

    /* renamed from: e */
    private ProtobufList<UserVisitPoint> f21274e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.z5$a */
    public static final class C8406a extends Builder<C8405z5, C8406a> implements ZenlyProto$UserVisitPointStreamEventOrBuilder {
        private C8406a() {
            super(C8405z5.f21272f);
        }

        /* synthetic */ C8406a(C8104i0 i0Var) {
            this();
        }

        public UserVisitPoint getUserVisitPoints(int i) {
            return ((C8405z5) this.instance).getUserVisitPoints(i);
        }

        public int getUserVisitPointsCount() {
            return ((C8405z5) this.instance).getUserVisitPointsCount();
        }

        public List<UserVisitPoint> getUserVisitPointsList() {
            return Collections.unmodifiableList(((C8405z5) this.instance).getUserVisitPointsList());
        }
    }

    static {
        f21272f.makeImmutable();
    }

    private C8405z5() {
    }

    public static C8406a newBuilder() {
        return (C8406a) f21272f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8405z5();
            case 2:
                return f21272f;
            case 3:
                this.f21274e.makeImmutable();
                return null;
            case 4:
                return new C8406a(null);
            case 5:
                this.f21274e = ((Visitor) obj).visitList(this.f21274e, ((C8405z5) obj2).f21274e);
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
                                if (!this.f21274e.isModifiable()) {
                                    this.f21274e = GeneratedMessageLite.mutableCopy(this.f21274e);
                                }
                                this.f21274e.add(codedInputStream.readMessage(UserVisitPoint.parser(), extensionRegistryLite));
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
                if (f21273g == null) {
                    synchronized (C8405z5.class) {
                        if (f21273g == null) {
                            f21273g = new DefaultInstanceBasedParser(f21272f);
                        }
                    }
                }
                return f21273g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21272f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21274e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f21274e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserVisitPoint getUserVisitPoints(int i) {
        return (UserVisitPoint) this.f21274e.get(i);
    }

    public int getUserVisitPointsCount() {
        return this.f21274e.size();
    }

    public List<UserVisitPoint> getUserVisitPointsList() {
        return this.f21274e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21274e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f21274e.get(i));
        }
    }
}
