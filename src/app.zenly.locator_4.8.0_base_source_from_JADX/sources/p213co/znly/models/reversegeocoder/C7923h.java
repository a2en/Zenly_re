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
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;

/* renamed from: co.znly.models.reversegeocoder.h */
public final class C7923h extends GeneratedMessageLite<C7923h, C7924a> implements ReverseGeoCoderProto$ViewportOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7923h f20092k = new C7923h();

    /* renamed from: l */
    private static volatile Parser<C7923h> f20093l;

    /* renamed from: e */
    private C7272d0 f20094e;

    /* renamed from: f */
    private int f20095f;

    /* renamed from: g */
    private int f20096g;

    /* renamed from: h */
    private C6950b0 f20097h;

    /* renamed from: i */
    private double f20098i;

    /* renamed from: j */
    private double f20099j;

    /* renamed from: co.znly.models.reversegeocoder.h$a */
    public static final class C7924a extends Builder<C7923h, C7924a> implements ReverseGeoCoderProto$ViewportOrBuilder {
        /* synthetic */ C7924a(C7910a aVar) {
            this();
        }

        /* renamed from: a */
        public C7924a mo20389a(int i) {
            copyOnWrite();
            ((C7923h) this.instance).m18965a(i);
            return this;
        }

        /* renamed from: b */
        public C7924a mo20392b(int i) {
            copyOnWrite();
            ((C7923h) this.instance).m18971b(i);
            return this;
        }

        public C6950b0 getCenter() {
            return ((C7923h) this.instance).getCenter();
        }

        public double getHeading() {
            return ((C7923h) this.instance).getHeading();
        }

        public int getHeight() {
            return ((C7923h) this.instance).getHeight();
        }

        public double getTilt() {
            return ((C7923h) this.instance).getTilt();
        }

        public C7272d0 getViewport() {
            return ((C7923h) this.instance).getViewport();
        }

        public int getWidth() {
            return ((C7923h) this.instance).getWidth();
        }

        public boolean hasCenter() {
            return ((C7923h) this.instance).hasCenter();
        }

        public boolean hasViewport() {
            return ((C7923h) this.instance).hasViewport();
        }

        private C7924a() {
            super(C7923h.f20092k);
        }

        /* renamed from: a */
        public C7924a mo20390a(C6951a aVar) {
            copyOnWrite();
            ((C7923h) this.instance).m18966a(aVar);
            return this;
        }

        /* renamed from: b */
        public C7924a mo20391b(double d) {
            copyOnWrite();
            ((C7923h) this.instance).m18970b(d);
            return this;
        }

        /* renamed from: a */
        public C7924a mo20388a(double d) {
            copyOnWrite();
            ((C7923h) this.instance).m18964a(d);
            return this;
        }
    }

    static {
        f20092k.makeImmutable();
    }

    private C7923h() {
    }

    public static C7924a newBuilder() {
        return (C7924a) f20092k.toBuilder();
    }

    public static Parser<C7923h> parser() {
        return f20092k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7923h();
            case 2:
                return f20092k;
            case 3:
                return null;
            case 4:
                return new C7924a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7923h hVar = (C7923h) obj2;
                this.f20094e = (C7272d0) visitor.visitMessage(this.f20094e, hVar.f20094e);
                this.f20095f = visitor.visitInt(this.f20095f != 0, this.f20095f, hVar.f20095f != 0, hVar.f20095f);
                this.f20096g = visitor.visitInt(this.f20096g != 0, this.f20096g, hVar.f20096g != 0, hVar.f20096g);
                this.f20097h = (C6950b0) visitor.visitMessage(this.f20097h, hVar.f20097h);
                this.f20098i = visitor.visitDouble(this.f20098i != 0.0d, this.f20098i, hVar.f20098i != 0.0d, hVar.f20098i);
                this.f20099j = visitor.visitDouble(this.f20099j != 0.0d, this.f20099j, hVar.f20099j != 0.0d, hVar.f20099j);
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
                                Builder builder = this.f20094e != null ? (C7273a) this.f20094e.toBuilder() : null;
                                this.f20094e = (C7272d0) codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20094e);
                                    this.f20094e = (C7272d0) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f20095f = codedInputStream.readInt32();
                            } else if (readTag == 32) {
                                this.f20096g = codedInputStream.readInt32();
                            } else if (readTag == 42) {
                                Builder builder2 = this.f20097h != null ? (C6951a) this.f20097h.toBuilder() : null;
                                this.f20097h = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20097h);
                                    this.f20097h = (C6950b0) builder2.buildPartial();
                                }
                            } else if (readTag == 49) {
                                this.f20098i = codedInputStream.readDouble();
                            } else if (readTag == 57) {
                                this.f20099j = codedInputStream.readDouble();
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
                if (f20093l == null) {
                    synchronized (C7923h.class) {
                        if (f20093l == null) {
                            f20093l = new DefaultInstanceBasedParser(f20092k);
                        }
                    }
                }
                return f20093l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20092k;
    }

    public C6950b0 getCenter() {
        C6950b0 b0Var = this.f20097h;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public double getHeading() {
        return this.f20098i;
    }

    public int getHeight() {
        return this.f20095f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20094e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getViewport());
        }
        int i3 = this.f20095f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        int i4 = this.f20096g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i4);
        }
        if (this.f20097h != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getCenter());
        }
        double d = this.f20098i;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(6, d);
        }
        double d2 = this.f20099j;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(7, d2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getTilt() {
        return this.f20099j;
    }

    public C7272d0 getViewport() {
        C7272d0 d0Var = this.f20094e;
        return d0Var == null ? C7272d0.getDefaultInstance() : d0Var;
    }

    public int getWidth() {
        return this.f20096g;
    }

    public boolean hasCenter() {
        return this.f20097h != null;
    }

    public boolean hasViewport() {
        return this.f20094e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20094e != null) {
            codedOutputStream.writeMessage(1, getViewport());
        }
        int i = this.f20095f;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        int i2 = this.f20096g;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        if (this.f20097h != null) {
            codedOutputStream.writeMessage(5, getCenter());
        }
        double d = this.f20098i;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(6, d);
        }
        double d2 = this.f20099j;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(7, d2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m18971b(int i) {
        this.f20096g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m18970b(double d) {
        this.f20099j = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18965a(int i) {
        this.f20095f = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18966a(C6951a aVar) {
        this.f20097h = (C6950b0) aVar.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18964a(double d) {
        this.f20098i = d;
    }
}
