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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.services.C8359w4.C8360a;

/* renamed from: co.znly.models.services.x4 */
public final class C8375x4 extends GeneratedMessageLite<C8375x4, C8376a> implements ZenlyProto$SuggestedDismissResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8375x4 f21220h = new C8375x4();

    /* renamed from: i */
    private static volatile Parser<C8375x4> f21221i;

    /* renamed from: e */
    private int f21222e;

    /* renamed from: f */
    private ProtobufList<String> f21223f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C8359w4 f21224g;

    /* renamed from: co.znly.models.services.x4$a */
    public static final class C8376a extends Builder<C8375x4, C8376a> implements ZenlyProto$SuggestedDismissResponseOrBuilder {
        private C8376a() {
            super(C8375x4.f21220h);
        }

        /* synthetic */ C8376a(C8104i0 i0Var) {
            this();
        }

        public C8359w4 getError() {
            return ((C8375x4) this.instance).getError();
        }

        public String getErrorMessages(int i) {
            return ((C8375x4) this.instance).getErrorMessages(i);
        }

        public ByteString getErrorMessagesBytes(int i) {
            return ((C8375x4) this.instance).getErrorMessagesBytes(i);
        }

        public int getErrorMessagesCount() {
            return ((C8375x4) this.instance).getErrorMessagesCount();
        }

        public List<String> getErrorMessagesList() {
            return Collections.unmodifiableList(((C8375x4) this.instance).getErrorMessagesList());
        }

        public boolean hasError() {
            return ((C8375x4) this.instance).hasError();
        }
    }

    static {
        f21220h.makeImmutable();
    }

    private C8375x4() {
    }

    public static C8376a newBuilder() {
        return (C8376a) f21220h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8375x4();
            case 2:
                return f21220h;
            case 3:
                this.f21223f.makeImmutable();
                return null;
            case 4:
                return new C8376a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8375x4 x4Var = (C8375x4) obj2;
                this.f21223f = visitor.visitList(this.f21223f, x4Var.f21223f);
                this.f21224g = (C8359w4) visitor.visitMessage(this.f21224g, x4Var.f21224g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21222e |= x4Var.f21222e;
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f21223f.isModifiable()) {
                                    this.f21223f = GeneratedMessageLite.mutableCopy(this.f21223f);
                                }
                                this.f21223f.add(readStringRequireUtf8);
                            } else if (readTag == 1010) {
                                Builder builder = this.f21224g != null ? (C8360a) this.f21224g.toBuilder() : null;
                                this.f21224g = (C8359w4) codedInputStream.readMessage(C8359w4.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21224g);
                                    this.f21224g = (C8359w4) builder.buildPartial();
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
                if (f21221i == null) {
                    synchronized (C8375x4.class) {
                        if (f21221i == null) {
                            f21221i = new DefaultInstanceBasedParser(f21220h);
                        }
                    }
                }
                return f21221i;
            default:
                throw new UnsupportedOperationException();
        }
        return f21220h;
    }

    public C8359w4 getError() {
        C8359w4 w4Var = this.f21224g;
        return w4Var == null ? C8359w4.getDefaultInstance() : w4Var;
    }

    public String getErrorMessages(int i) {
        return (String) this.f21223f.get(i);
    }

    public ByteString getErrorMessagesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f21223f.get(i));
    }

    public int getErrorMessagesCount() {
        return this.f21223f.size();
    }

    public List<String> getErrorMessagesList() {
        return this.f21223f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21223f.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f21223f.get(i3));
        }
        int size = 0 + i2 + (getErrorMessagesList().size() * 1);
        if (this.f21224g != null) {
            size += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasError() {
        return this.f21224g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21223f.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f21223f.get(i));
        }
        if (this.f21224g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
