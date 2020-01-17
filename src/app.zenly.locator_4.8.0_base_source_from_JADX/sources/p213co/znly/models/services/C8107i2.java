package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
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
import p213co.znly.models.C6950b0;

/* renamed from: co.znly.models.services.i2 */
public final class C8107i2 extends GeneratedMessageLite<C8107i2, C8108a> implements ZenlyProto$FootstepsLocalityAtRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8107i2 f20550i = new C8107i2();

    /* renamed from: j */
    private static volatile Parser<C8107i2> f20551j;

    /* renamed from: e */
    private int f20552e;

    /* renamed from: f */
    private ProtobufList<C6950b0> f20553f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private String f20554g = "";

    /* renamed from: h */
    private boolean f20555h;

    /* renamed from: co.znly.models.services.i2$a */
    public static final class C8108a extends Builder<C8107i2, C8108a> implements ZenlyProto$FootstepsLocalityAtRequestOrBuilder {
        private C8108a() {
            super(C8107i2.f20550i);
        }

        /* synthetic */ C8108a(C8104i0 i0Var) {
            this();
        }

        public boolean getIncludeShapes() {
            return ((C8107i2) this.instance).getIncludeShapes();
        }

        public String getLocale() {
            return ((C8107i2) this.instance).getLocale();
        }

        public ByteString getLocaleBytes() {
            return ((C8107i2) this.instance).getLocaleBytes();
        }

        public C6950b0 getPoint(int i) {
            return ((C8107i2) this.instance).getPoint(i);
        }

        public int getPointCount() {
            return ((C8107i2) this.instance).getPointCount();
        }

        public List<C6950b0> getPointList() {
            return Collections.unmodifiableList(((C8107i2) this.instance).getPointList());
        }
    }

    static {
        f20550i.makeImmutable();
    }

    private C8107i2() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8107i2();
            case 2:
                return f20550i;
            case 3:
                this.f20553f.makeImmutable();
                return null;
            case 4:
                return new C8108a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8107i2 i2Var = (C8107i2) obj2;
                this.f20553f = visitor.visitList(this.f20553f, i2Var.f20553f);
                this.f20554g = visitor.visitString(!this.f20554g.isEmpty(), this.f20554g, true ^ i2Var.f20554g.isEmpty(), i2Var.f20554g);
                boolean z = this.f20555h;
                boolean z2 = i2Var.f20555h;
                this.f20555h = visitor.visitBoolean(z, z, z2, z2);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20552e |= i2Var.f20552e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!this.f20553f.isModifiable()) {
                                    this.f20553f = GeneratedMessageLite.mutableCopy(this.f20553f);
                                }
                                this.f20553f.add(codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite));
                            } else if (readTag == 18) {
                                this.f20554g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f20555h = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f20551j == null) {
                    synchronized (C8107i2.class) {
                        if (f20551j == null) {
                            f20551j = new DefaultInstanceBasedParser(f20550i);
                        }
                    }
                }
                return f20551j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20550i;
    }

    public boolean getIncludeShapes() {
        return this.f20555h;
    }

    public String getLocale() {
        return this.f20554g;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.f20554g);
    }

    public C6950b0 getPoint(int i) {
        return (C6950b0) this.f20553f.get(i);
    }

    public int getPointCount() {
        return this.f20553f.size();
    }

    public List<C6950b0> getPointList() {
        return this.f20553f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20553f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20553f.get(i3));
        }
        if (!this.f20554g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getLocale());
        }
        boolean z = this.f20555h;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20553f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20553f.get(i));
        }
        if (!this.f20554g.isEmpty()) {
            codedOutputStream.writeString(2, getLocale());
        }
        boolean z = this.f20555h;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
    }
}
