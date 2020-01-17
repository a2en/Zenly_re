package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
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

/* renamed from: co.znly.models.services.h0 */
public final class C8088h0 extends GeneratedMessageLite<C8088h0, C8089a> implements ZendeskProto$ZendeskTicketOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8088h0 f20493j = new C8088h0();

    /* renamed from: k */
    private static volatile Parser<C8088h0> f20494k;

    /* renamed from: e */
    private int f20495e;

    /* renamed from: f */
    private String f20496f;

    /* renamed from: g */
    private String f20497g;

    /* renamed from: h */
    private long f20498h;

    /* renamed from: i */
    private ProtobufList<C7991b0> f20499i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.h0$a */
    public static final class C8089a extends Builder<C8088h0, C8089a> implements ZendeskProto$ZendeskTicketOrBuilder {
        /* synthetic */ C8089a(C8344w wVar) {
            this();
        }

        /* renamed from: a */
        public C8089a mo22139a(String str) {
            copyOnWrite();
            ((C8088h0) this.instance).m19148a(str);
            return this;
        }

        /* renamed from: b */
        public C8089a mo22140b(String str) {
            copyOnWrite();
            ((C8088h0) this.instance).m19151b(str);
            return this;
        }

        public C7991b0 getFields(int i) {
            return ((C8088h0) this.instance).getFields(i);
        }

        public int getFieldsCount() {
            return ((C8088h0) this.instance).getFieldsCount();
        }

        public List<C7991b0> getFieldsList() {
            return Collections.unmodifiableList(((C8088h0) this.instance).getFieldsList());
        }

        public long getFormID() {
            return ((C8088h0) this.instance).getFormID();
        }

        public String getMessage() {
            return ((C8088h0) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8088h0) this.instance).getMessageBytes();
        }

        public String getSubject() {
            return ((C8088h0) this.instance).getSubject();
        }

        public ByteString getSubjectBytes() {
            return ((C8088h0) this.instance).getSubjectBytes();
        }

        private C8089a() {
            super(C8088h0.f20493j);
        }

        /* renamed from: a */
        public C8089a mo22137a(long j) {
            copyOnWrite();
            ((C8088h0) this.instance).m19143a(j);
            return this;
        }

        /* renamed from: a */
        public C8089a mo22138a(Iterable<? extends C7991b0> iterable) {
            copyOnWrite();
            ((C8088h0) this.instance).m19147a(iterable);
            return this;
        }
    }

    static {
        f20493j.makeImmutable();
    }

    private C8088h0() {
        String str = "";
        this.f20496f = str;
        this.f20497g = str;
    }

    public static C8088h0 getDefaultInstance() {
        return f20493j;
    }

    public static C8089a newBuilder() {
        return (C8089a) f20493j.toBuilder();
    }

    public static Parser<C8088h0> parser() {
        return f20493j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8088h0();
            case 2:
                return f20493j;
            case 3:
                this.f20499i.makeImmutable();
                return null;
            case 4:
                return new C8089a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8088h0 h0Var = (C8088h0) obj2;
                this.f20496f = visitor.visitString(!this.f20496f.isEmpty(), this.f20496f, !h0Var.f20496f.isEmpty(), h0Var.f20496f);
                this.f20497g = visitor.visitString(!this.f20497g.isEmpty(), this.f20497g, !h0Var.f20497g.isEmpty(), h0Var.f20497g);
                this.f20498h = visitor.visitLong(this.f20498h != 0, this.f20498h, h0Var.f20498h != 0, h0Var.f20498h);
                this.f20499i = visitor.visitList(this.f20499i, h0Var.f20499i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20495e |= h0Var.f20495e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20496f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20497g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f20498h = codedInputStream.readInt64();
                            } else if (readTag == 34) {
                                if (!this.f20499i.isModifiable()) {
                                    this.f20499i = GeneratedMessageLite.mutableCopy(this.f20499i);
                                }
                                this.f20499i.add(codedInputStream.readMessage(C7991b0.parser(), extensionRegistryLite));
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
                if (f20494k == null) {
                    synchronized (C8088h0.class) {
                        if (f20494k == null) {
                            f20494k = new DefaultInstanceBasedParser(f20493j);
                        }
                    }
                }
                return f20494k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20493j;
    }

    public C7991b0 getFields(int i) {
        return (C7991b0) this.f20499i.get(i);
    }

    public int getFieldsCount() {
        return this.f20499i.size();
    }

    public List<C7991b0> getFieldsList() {
        return this.f20499i;
    }

    public long getFormID() {
        return this.f20498h;
    }

    public String getMessage() {
        return this.f20497g;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f20497g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20496f.isEmpty() ? CodedOutputStream.computeStringSize(1, getSubject()) + 0 : 0;
        if (!this.f20497g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getMessage());
        }
        long j = this.f20498h;
        if (j != 0) {
            computeStringSize += CodedOutputStream.computeInt64Size(3, j);
        }
        for (int i2 = 0; i2 < this.f20499i.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f20499i.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getSubject() {
        return this.f20496f;
    }

    public ByteString getSubjectBytes() {
        return ByteString.copyFromUtf8(this.f20496f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20496f.isEmpty()) {
            codedOutputStream.writeString(1, getSubject());
        }
        if (!this.f20497g.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
        long j = this.f20498h;
        if (j != 0) {
            codedOutputStream.writeInt64(3, j);
        }
        for (int i = 0; i < this.f20499i.size(); i++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f20499i.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19151b(String str) {
        if (str != null) {
            this.f20496f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    private void m19149b() {
        if (!this.f20499i.isModifiable()) {
            this.f20499i = GeneratedMessageLite.mutableCopy(this.f20499i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19148a(String str) {
        if (str != null) {
            this.f20497g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19143a(long j) {
        this.f20498h = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19147a(Iterable<? extends C7991b0> iterable) {
        m19149b();
        AbstractMessageLite.addAll(iterable, this.f20499i);
    }
}
