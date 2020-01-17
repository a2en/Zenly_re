package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.experimental.models.C7293c;
import p213co.znly.models.experimental.models.C7293c.C7294a;

/* renamed from: co.znly.models.core.e0 */
public final class C7086e0 extends GeneratedMessageLite<C7086e0, C7087a> implements CoreExperimentalProto$UserActionsFetchStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7086e0 f17529f = new C7086e0();

    /* renamed from: g */
    private static volatile Parser<C7086e0> f17530g;

    /* renamed from: e */
    private C7293c f17531e;

    /* renamed from: co.znly.models.core.e0$a */
    public static final class C7087a extends Builder<C7086e0, C7087a> implements CoreExperimentalProto$UserActionsFetchStreamEventOrBuilder {
        /* synthetic */ C7087a(C7067c0 c0Var) {
            this();
        }

        public C7293c getUserActions() {
            return ((C7086e0) this.instance).getUserActions();
        }

        public boolean hasUserActions() {
            return ((C7086e0) this.instance).hasUserActions();
        }

        private C7087a() {
            super(C7086e0.f17529f);
        }
    }

    static {
        f17529f.makeImmutable();
    }

    private C7086e0() {
    }

    public static C7087a newBuilder() {
        return (C7087a) f17529f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7067c0.f17477a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7086e0();
            case 2:
                return f17529f;
            case 3:
                return null;
            case 4:
                return new C7087a(null);
            case 5:
                this.f17531e = (C7293c) ((Visitor) obj).visitMessage(this.f17531e, ((C7086e0) obj2).f17531e);
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
                                Builder builder = this.f17531e != null ? (C7294a) this.f17531e.toBuilder() : null;
                                this.f17531e = (C7293c) codedInputStream.readMessage(C7293c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17531e);
                                    this.f17531e = (C7293c) builder.buildPartial();
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
                if (f17530g == null) {
                    synchronized (C7086e0.class) {
                        if (f17530g == null) {
                            f17530g = new DefaultInstanceBasedParser(f17529f);
                        }
                    }
                }
                return f17530g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17529f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17531e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUserActions());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7293c getUserActions() {
        C7293c cVar = this.f17531e;
        return cVar == null ? C7293c.getDefaultInstance() : cVar;
    }

    public boolean hasUserActions() {
        return this.f17531e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17531e != null) {
            codedOutputStream.writeMessage(1, getUserActions());
        }
    }
}
