package p213co.znly.models.timetogether;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.timetogether.C8435c.C8436a;

/* renamed from: co.znly.models.timetogether.d */
public final class C8437d extends GeneratedMessageLite<C8437d, C8438a> implements TimeTogetherProto$MyTstOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8437d f21404f = new C8437d();

    /* renamed from: g */
    private static volatile Parser<C8437d> f21405g;

    /* renamed from: e */
    private C8435c f21406e;

    /* renamed from: co.znly.models.timetogether.d$a */
    public static final class C8438a extends Builder<C8437d, C8438a> implements TimeTogetherProto$MyTstOrBuilder {
        /* synthetic */ C8438a(C8432a aVar) {
            this();
        }

        public C8435c getFriendsMet() {
            return ((C8437d) this.instance).getFriendsMet();
        }

        public boolean hasFriendsMet() {
            return ((C8437d) this.instance).hasFriendsMet();
        }

        private C8438a() {
            super(C8437d.f21404f);
        }
    }

    static {
        f21404f.makeImmutable();
    }

    private C8437d() {
    }

    public static C8437d getDefaultInstance() {
        return f21404f;
    }

    public static Parser<C8437d> parser() {
        return f21404f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8432a.f21379a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8437d();
            case 2:
                return f21404f;
            case 3:
                return null;
            case 4:
                return new C8438a(null);
            case 5:
                this.f21406e = (C8435c) ((Visitor) obj).visitMessage(this.f21406e, ((C8437d) obj2).f21406e);
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
                                Builder builder = this.f21406e != null ? (C8436a) this.f21406e.toBuilder() : null;
                                this.f21406e = (C8435c) codedInputStream.readMessage(C8435c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21406e);
                                    this.f21406e = (C8435c) builder.buildPartial();
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
                if (f21405g == null) {
                    synchronized (C8437d.class) {
                        if (f21405g == null) {
                            f21405g = new DefaultInstanceBasedParser(f21404f);
                        }
                    }
                }
                return f21405g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21404f;
    }

    public C8435c getFriendsMet() {
        C8435c cVar = this.f21406e;
        return cVar == null ? C8435c.getDefaultInstance() : cVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21406e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriendsMet());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasFriendsMet() {
        return this.f21406e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21406e != null) {
            codedOutputStream.writeMessage(1, getFriendsMet());
        }
    }
}
