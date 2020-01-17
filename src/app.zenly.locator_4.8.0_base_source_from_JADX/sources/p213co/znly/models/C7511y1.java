package p213co.znly.models;

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

/* renamed from: co.znly.models.y1 */
public final class C7511y1 extends GeneratedMessageLite<C7511y1, C7512a> implements PingProto$SystemMsgMetadataOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7511y1 f18870i = new C7511y1();

    /* renamed from: j */
    private static volatile Parser<C7511y1> f18871j;

    /* renamed from: e */
    private int f18872e;

    /* renamed from: f */
    private String f18873f;

    /* renamed from: g */
    private ProtobufList<String> f18874g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private String f18875h;

    /* renamed from: co.znly.models.y1$a */
    public static final class C7512a extends Builder<C7511y1, C7512a> implements PingProto$SystemMsgMetadataOrBuilder {
        /* synthetic */ C7512a(C7383l1 l1Var) {
            this();
        }

        public String getAuthorUuid() {
            return ((C7511y1) this.instance).getAuthorUuid();
        }

        public ByteString getAuthorUuidBytes() {
            return ((C7511y1) this.instance).getAuthorUuidBytes();
        }

        public String getRename() {
            return ((C7511y1) this.instance).getRename();
        }

        public ByteString getRenameBytes() {
            return ((C7511y1) this.instance).getRenameBytes();
        }

        public String getTargetUuids(int i) {
            return ((C7511y1) this.instance).getTargetUuids(i);
        }

        public ByteString getTargetUuidsBytes(int i) {
            return ((C7511y1) this.instance).getTargetUuidsBytes(i);
        }

        public int getTargetUuidsCount() {
            return ((C7511y1) this.instance).getTargetUuidsCount();
        }

        public List<String> getTargetUuidsList() {
            return Collections.unmodifiableList(((C7511y1) this.instance).getTargetUuidsList());
        }

        private C7512a() {
            super(C7511y1.f18870i);
        }
    }

    static {
        f18870i.makeImmutable();
    }

    private C7511y1() {
        String str = "";
        this.f18873f = str;
        this.f18875h = str;
    }

    public static C7511y1 getDefaultInstance() {
        return f18870i;
    }

    public static Parser<C7511y1> parser() {
        return f18870i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7511y1();
            case 2:
                return f18870i;
            case 3:
                this.f18874g.makeImmutable();
                return null;
            case 4:
                return new C7512a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7511y1 y1Var = (C7511y1) obj2;
                this.f18873f = visitor.visitString(!this.f18873f.isEmpty(), this.f18873f, !y1Var.f18873f.isEmpty(), y1Var.f18873f);
                this.f18874g = visitor.visitList(this.f18874g, y1Var.f18874g);
                this.f18875h = visitor.visitString(!this.f18875h.isEmpty(), this.f18875h, true ^ y1Var.f18875h.isEmpty(), y1Var.f18875h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18872e |= y1Var.f18872e;
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
                                this.f18873f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f18874g.isModifiable()) {
                                    this.f18874g = GeneratedMessageLite.mutableCopy(this.f18874g);
                                }
                                this.f18874g.add(readStringRequireUtf8);
                            } else if (readTag == 26) {
                                this.f18875h = codedInputStream.readStringRequireUtf8();
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
                if (f18871j == null) {
                    synchronized (C7511y1.class) {
                        if (f18871j == null) {
                            f18871j = new DefaultInstanceBasedParser(f18870i);
                        }
                    }
                }
                return f18871j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18870i;
    }

    public String getAuthorUuid() {
        return this.f18873f;
    }

    public ByteString getAuthorUuidBytes() {
        return ByteString.copyFromUtf8(this.f18873f);
    }

    public String getRename() {
        return this.f18875h;
    }

    public ByteString getRenameBytes() {
        return ByteString.copyFromUtf8(this.f18875h);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18873f.isEmpty() ? CodedOutputStream.computeStringSize(1, getAuthorUuid()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18874g.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f18874g.get(i3));
        }
        int size = computeStringSize + i2 + (getTargetUuidsList().size() * 1);
        if (!this.f18875h.isEmpty()) {
            size += CodedOutputStream.computeStringSize(3, getRename());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getTargetUuids(int i) {
        return (String) this.f18874g.get(i);
    }

    public ByteString getTargetUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f18874g.get(i));
    }

    public int getTargetUuidsCount() {
        return this.f18874g.size();
    }

    public List<String> getTargetUuidsList() {
        return this.f18874g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18873f.isEmpty()) {
            codedOutputStream.writeString(1, getAuthorUuid());
        }
        for (int i = 0; i < this.f18874g.size(); i++) {
            codedOutputStream.writeString(2, (String) this.f18874g.get(i));
        }
        if (!this.f18875h.isEmpty()) {
            codedOutputStream.writeString(3, getRename());
        }
    }
}
