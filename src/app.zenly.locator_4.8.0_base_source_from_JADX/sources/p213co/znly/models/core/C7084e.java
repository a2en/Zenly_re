package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.e */
public final class C7084e extends GeneratedMessageLite<C7084e, C7085a> implements ChatProto$ChatStoreConversation$CursorsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7084e f17523i = new C7084e();

    /* renamed from: j */
    private static volatile Parser<C7084e> f17524j;

    /* renamed from: e */
    private int f17525e;

    /* renamed from: f */
    private String f17526f;

    /* renamed from: g */
    private String f17527g;

    /* renamed from: h */
    private ProtobufList<String> f17528h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.e$a */
    public static final class C7085a extends Builder<C7084e, C7085a> implements ChatProto$ChatStoreConversation$CursorsOrBuilder {
        /* synthetic */ C7085a(C7066c cVar) {
            this();
        }

        public String getOffChat(int i) {
            return ((C7084e) this.instance).getOffChat(i);
        }

        public ByteString getOffChatBytes(int i) {
            return ((C7084e) this.instance).getOffChatBytes(i);
        }

        public int getOffChatCount() {
            return ((C7084e) this.instance).getOffChatCount();
        }

        public List<String> getOffChatList() {
            return Collections.unmodifiableList(((C7084e) this.instance).getOffChatList());
        }

        public String getRead() {
            return ((C7084e) this.instance).getRead();
        }

        public ByteString getReadBytes() {
            return ((C7084e) this.instance).getReadBytes();
        }

        public String getTip() {
            return ((C7084e) this.instance).getTip();
        }

        public ByteString getTipBytes() {
            return ((C7084e) this.instance).getTipBytes();
        }

        private C7085a() {
            super(C7084e.f17523i);
        }
    }

    static {
        f17523i.makeImmutable();
    }

    private C7084e() {
        String str = "";
        this.f17526f = str;
        this.f17527g = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7084e();
            case 2:
                return f17523i;
            case 3:
                this.f17528h.makeImmutable();
                return null;
            case 4:
                return new C7085a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7084e eVar = (C7084e) obj2;
                this.f17526f = visitor.visitString(!this.f17526f.isEmpty(), this.f17526f, !eVar.f17526f.isEmpty(), eVar.f17526f);
                this.f17527g = visitor.visitString(!this.f17527g.isEmpty(), this.f17527g, true ^ eVar.f17527g.isEmpty(), eVar.f17527g);
                this.f17528h = visitor.visitList(this.f17528h, eVar.f17528h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17525e |= eVar.f17525e;
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
                                this.f17526f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17527g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f17528h.isModifiable()) {
                                    this.f17528h = GeneratedMessageLite.mutableCopy(this.f17528h);
                                }
                                this.f17528h.add(readStringRequireUtf8);
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
                if (f17524j == null) {
                    synchronized (C7084e.class) {
                        if (f17524j == null) {
                            f17524j = new DefaultInstanceBasedParser(f17523i);
                        }
                    }
                }
                return f17524j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17523i;
    }

    public String getOffChat(int i) {
        return (String) this.f17528h.get(i);
    }

    public ByteString getOffChatBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f17528h.get(i));
    }

    public int getOffChatCount() {
        return this.f17528h.size();
    }

    public List<String> getOffChatList() {
        return this.f17528h;
    }

    public String getRead() {
        return this.f17527g;
    }

    public ByteString getReadBytes() {
        return ByteString.copyFromUtf8(this.f17527g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17526f.isEmpty() ? CodedOutputStream.computeStringSize(1, getTip()) + 0 : 0;
        if (!this.f17527g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getRead());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17528h.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f17528h.get(i3));
        }
        int size = computeStringSize + i2 + (getOffChatList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getTip() {
        return this.f17526f;
    }

    public ByteString getTipBytes() {
        return ByteString.copyFromUtf8(this.f17526f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17526f.isEmpty()) {
            codedOutputStream.writeString(1, getTip());
        }
        if (!this.f17527g.isEmpty()) {
            codedOutputStream.writeString(2, getRead());
        }
        for (int i = 0; i < this.f17528h.size(); i++) {
            codedOutputStream.writeString(3, (String) this.f17528h.get(i));
        }
    }
}
