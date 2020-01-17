package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7456r2;
import p213co.znly.models.C7456r2.C7457a;
import p213co.znly.models.C7458s;
import p213co.znly.models.C7458s.C7459a;
import p213co.znly.models.notifications.C7857w.C7858a;

/* renamed from: co.znly.models.notifications.x */
public final class C7860x extends GeneratedMessageLite<C7860x, C7861a> implements NotificationProto$NotificationWithMetadataOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7860x f19679i = new C7860x();

    /* renamed from: j */
    private static volatile Parser<C7860x> f19680j;

    /* renamed from: e */
    private C7456r2 f19681e;

    /* renamed from: f */
    private C7857w f19682f;

    /* renamed from: g */
    private C7458s f19683g;

    /* renamed from: h */
    private int f19684h;

    /* renamed from: co.znly.models.notifications.x$a */
    public static final class C7861a extends Builder<C7860x, C7861a> implements NotificationProto$NotificationWithMetadataOrBuilder {
        /* synthetic */ C7861a(C7790a aVar) {
            this();
        }

        public C7456r2 getContext() {
            return ((C7860x) this.instance).getContext();
        }

        public int getCount() {
            return ((C7860x) this.instance).getCount();
        }

        public C7458s getDevice() {
            return ((C7860x) this.instance).getDevice();
        }

        public C7857w getNotification() {
            return ((C7860x) this.instance).getNotification();
        }

        public boolean hasContext() {
            return ((C7860x) this.instance).hasContext();
        }

        public boolean hasDevice() {
            return ((C7860x) this.instance).hasDevice();
        }

        public boolean hasNotification() {
            return ((C7860x) this.instance).hasNotification();
        }

        private C7861a() {
            super(C7860x.f19679i);
        }
    }

    static {
        f19679i.makeImmutable();
    }

    private C7860x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7860x();
            case 2:
                return f19679i;
            case 3:
                return null;
            case 4:
                return new C7861a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7860x xVar = (C7860x) obj2;
                this.f19681e = (C7456r2) visitor.visitMessage(this.f19681e, xVar.f19681e);
                this.f19682f = (C7857w) visitor.visitMessage(this.f19682f, xVar.f19682f);
                this.f19683g = (C7458s) visitor.visitMessage(this.f19683g, xVar.f19683g);
                boolean z2 = this.f19684h != 0;
                int i = this.f19684h;
                if (xVar.f19684h != 0) {
                    z = true;
                }
                this.f19684h = visitor.visitInt(z2, i, z, xVar.f19684h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f19682f != null ? (C7858a) this.f19682f.toBuilder() : null;
                                this.f19682f = (C7857w) codedInputStream.readMessage(C7857w.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19682f);
                                    this.f19682f = (C7857w) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19683g != null ? (C7459a) this.f19683g.toBuilder() : null;
                                this.f19683g = (C7458s) codedInputStream.readMessage(C7458s.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19683g);
                                    this.f19683g = (C7458s) builder2.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f19684h = codedInputStream.readInt32();
                            } else if (readTag == 42) {
                                Builder builder3 = this.f19681e != null ? (C7457a) this.f19681e.toBuilder() : null;
                                this.f19681e = (C7456r2) codedInputStream.readMessage(C7456r2.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f19681e);
                                    this.f19681e = (C7456r2) builder3.buildPartial();
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
                if (f19680j == null) {
                    synchronized (C7860x.class) {
                        if (f19680j == null) {
                            f19680j = new DefaultInstanceBasedParser(f19679i);
                        }
                    }
                }
                return f19680j;
            default:
                throw new UnsupportedOperationException();
        }
        return f19679i;
    }

    public C7456r2 getContext() {
        C7456r2 r2Var = this.f19681e;
        return r2Var == null ? C7456r2.getDefaultInstance() : r2Var;
    }

    public int getCount() {
        return this.f19684h;
    }

    public C7458s getDevice() {
        C7458s sVar = this.f19683g;
        return sVar == null ? C7458s.getDefaultInstance() : sVar;
    }

    public C7857w getNotification() {
        C7857w wVar = this.f19682f;
        return wVar == null ? C7857w.getDefaultInstance() : wVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19682f != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getNotification());
        }
        if (this.f19683g != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDevice());
        }
        int i3 = this.f19684h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        if (this.f19681e != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getContext());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasContext() {
        return this.f19681e != null;
    }

    public boolean hasDevice() {
        return this.f19683g != null;
    }

    public boolean hasNotification() {
        return this.f19682f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19682f != null) {
            codedOutputStream.writeMessage(1, getNotification());
        }
        if (this.f19683g != null) {
            codedOutputStream.writeMessage(2, getDevice());
        }
        int i = this.f19684h;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        if (this.f19681e != null) {
            codedOutputStream.writeMessage(5, getContext());
        }
    }
}
