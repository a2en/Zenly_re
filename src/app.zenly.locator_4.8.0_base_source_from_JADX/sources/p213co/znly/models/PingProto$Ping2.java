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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7354j0.C7357c;
import p213co.znly.models.C7384l2.C7385a;

/* renamed from: co.znly.models.PingProto$Ping2 */
public final class PingProto$Ping2 extends GeneratedMessageLite<PingProto$Ping2, C6823a> implements PingProto$Ping2OrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final PingProto$Ping2 f16617q = new PingProto$Ping2();

    /* renamed from: r */
    private static volatile Parser<PingProto$Ping2> f16618r;

    /* renamed from: e */
    private int f16619e;

    /* renamed from: f */
    private String f16620f;

    /* renamed from: g */
    private Timestamp f16621g;

    /* renamed from: h */
    private ProtobufList<C6824b> f16622h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private String f16623i;

    /* renamed from: j */
    private String f16624j;

    /* renamed from: k */
    private long f16625k;

    /* renamed from: l */
    private String f16626l;

    /* renamed from: m */
    private long f16627m;

    /* renamed from: n */
    private long f16628n;

    /* renamed from: o */
    private long f16629o;

    /* renamed from: p */
    private boolean f16630p;

    /* renamed from: co.znly.models.PingProto$Ping2$ContentOrBuilder */
    public interface ContentOrBuilder extends MessageLiteOrBuilder {
        String getEmojiUuid();

        ByteString getEmojiUuidBytes();

        C7354j0 getMedia();

        String getMessage();

        ByteString getMessageBytes();

        C7384l2 getRequestMedia();

        String getText();

        ByteString getTextBytes();

        C6826b getType();

        int getTypeValue();

        int getWeight();

        boolean hasMedia();

        boolean hasRequestMedia();
    }

    /* renamed from: co.znly.models.PingProto$Ping2$a */
    public static final class C6823a extends Builder<PingProto$Ping2, C6823a> implements PingProto$Ping2OrBuilder {
        /* synthetic */ C6823a(C7383l1 l1Var) {
            this();
        }

        /* renamed from: a */
        public C6823a mo17337a(int i, C6825a aVar) {
            copyOnWrite();
            ((PingProto$Ping2) this.instance).m17550a(i, aVar);
            return this;
        }

        public String getAuthorUuid() {
            return ((PingProto$Ping2) this.instance).getAuthorUuid();
        }

        public ByteString getAuthorUuidBytes() {
            return ((PingProto$Ping2) this.instance).getAuthorUuidBytes();
        }

        public long getClientStatus() {
            return ((PingProto$Ping2) this.instance).getClientStatus();
        }

        public String getClientUuid() {
            return ((PingProto$Ping2) this.instance).getClientUuid();
        }

        public ByteString getClientUuidBytes() {
            return ((PingProto$Ping2) this.instance).getClientUuidBytes();
        }

        public C6824b getContent(int i) {
            return ((PingProto$Ping2) this.instance).getContent(i);
        }

        public int getContentCount() {
            return ((PingProto$Ping2) this.instance).getContentCount();
        }

        public List<C6824b> getContentList() {
            return Collections.unmodifiableList(((PingProto$Ping2) this.instance).getContentList());
        }

        public Timestamp getCreatedAt() {
            return ((PingProto$Ping2) this.instance).getCreatedAt();
        }

        public boolean getOffChat() {
            return ((PingProto$Ping2) this.instance).getOffChat();
        }

        public long getSeq() {
            return ((PingProto$Ping2) this.instance).getSeq();
        }

        public long getStatus() {
            return ((PingProto$Ping2) this.instance).getStatus();
        }

        public long getSystemState() {
            return ((PingProto$Ping2) this.instance).getSystemState();
        }

        public String getTargetUuid() {
            return ((PingProto$Ping2) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((PingProto$Ping2) this.instance).getTargetUuidBytes();
        }

        public String getUuid() {
            return ((PingProto$Ping2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((PingProto$Ping2) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((PingProto$Ping2) this.instance).hasCreatedAt();
        }

        private C6823a() {
            super(PingProto$Ping2.f16617q);
        }

        /* renamed from: a */
        public C6823a mo17339a(C6825a aVar) {
            copyOnWrite();
            ((PingProto$Ping2) this.instance).m17552a(aVar);
            return this;
        }

        /* renamed from: a */
        public C6823a mo17340a(String str) {
            copyOnWrite();
            ((PingProto$Ping2) this.instance).m17557a(str);
            return this;
        }

        /* renamed from: a */
        public C6823a mo17338a(long j) {
            copyOnWrite();
            ((PingProto$Ping2) this.instance).m17551a(j);
            return this;
        }
    }

    /* renamed from: co.znly.models.PingProto$Ping2$b */
    public static final class C6824b extends GeneratedMessageLite<C6824b, C6825a> implements ContentOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final C6824b f16631l = new C6824b();

        /* renamed from: m */
        private static volatile Parser<C6824b> f16632m;

        /* renamed from: e */
        private String f16633e;

        /* renamed from: f */
        private String f16634f;

        /* renamed from: g */
        private String f16635g;

        /* renamed from: h */
        private int f16636h;

        /* renamed from: i */
        private int f16637i;

        /* renamed from: j */
        private C7354j0 f16638j;

        /* renamed from: k */
        private C7384l2 f16639k;

        /* renamed from: co.znly.models.PingProto$Ping2$b$a */
        public static final class C6825a extends Builder<C6824b, C6825a> implements ContentOrBuilder {
            /* synthetic */ C6825a(C7383l1 l1Var) {
                this();
            }

            /* renamed from: a */
            public C6825a mo17344a(String str) {
                copyOnWrite();
                ((C6824b) this.instance).m17571a(str);
                return this;
            }

            /* renamed from: b */
            public C6825a mo17345b(String str) {
                copyOnWrite();
                ((C6824b) this.instance).m17573b(str);
                return this;
            }

            /* renamed from: c */
            public C6825a mo17346c(String str) {
                copyOnWrite();
                ((C6824b) this.instance).m17575c(str);
                return this;
            }

            public String getEmojiUuid() {
                return ((C6824b) this.instance).getEmojiUuid();
            }

            public ByteString getEmojiUuidBytes() {
                return ((C6824b) this.instance).getEmojiUuidBytes();
            }

            public C7354j0 getMedia() {
                return ((C6824b) this.instance).getMedia();
            }

            public String getMessage() {
                return ((C6824b) this.instance).getMessage();
            }

            public ByteString getMessageBytes() {
                return ((C6824b) this.instance).getMessageBytes();
            }

            public C7384l2 getRequestMedia() {
                return ((C6824b) this.instance).getRequestMedia();
            }

            public String getText() {
                return ((C6824b) this.instance).getText();
            }

            public ByteString getTextBytes() {
                return ((C6824b) this.instance).getTextBytes();
            }

            public C6826b getType() {
                return ((C6824b) this.instance).getType();
            }

            public int getTypeValue() {
                return ((C6824b) this.instance).getTypeValue();
            }

            public int getWeight() {
                return ((C6824b) this.instance).getWeight();
            }

            public boolean hasMedia() {
                return ((C6824b) this.instance).hasMedia();
            }

            public boolean hasRequestMedia() {
                return ((C6824b) this.instance).hasRequestMedia();
            }

            private C6825a() {
                super(C6824b.f16631l);
            }

            /* renamed from: a */
            public C6825a mo17341a(int i) {
                copyOnWrite();
                ((C6824b) this.instance).m17564a(i);
                return this;
            }

            /* renamed from: a */
            public C6825a mo17342a(C6826b bVar) {
                copyOnWrite();
                ((C6824b) this.instance).m17565a(bVar);
                return this;
            }

            /* renamed from: a */
            public C6825a mo17343a(C7357c cVar) {
                copyOnWrite();
                ((C6824b) this.instance).m17570a(cVar);
                return this;
            }
        }

        /* renamed from: co.znly.models.PingProto$Ping2$b$b */
        public enum C6826b implements EnumLite {
            UNKNOWN(0),
            EMOJI(1),
            TEXT(2),
            MEDIA(3),
            REQUEST_MEDIA(4),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16647e;

            /* renamed from: co.znly.models.PingProto$Ping2$b$b$a */
            class C6827a implements EnumLiteMap<C6826b> {
                C6827a() {
                }

                public C6826b findValueByNumber(int i) {
                    return C6826b.m17582a(i);
                }
            }

            static {
                new C6827a();
            }

            private C6826b(int i) {
                this.f16647e = i;
            }

            /* renamed from: a */
            public static C6826b m17582a(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return EMOJI;
                }
                if (i == 2) {
                    return TEXT;
                }
                if (i == 3) {
                    return MEDIA;
                }
                if (i != 4) {
                    return null;
                }
                return REQUEST_MEDIA;
            }

            public final int getNumber() {
                return this.f16647e;
            }
        }

        static {
            f16631l.makeImmutable();
        }

        private C6824b() {
            String str = "";
            this.f16633e = str;
            this.f16634f = str;
            this.f16635g = str;
        }

        public static C6825a newBuilder() {
            return (C6825a) f16631l.toBuilder();
        }

        public static Parser<C6824b> parser() {
            return f16631l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6824b();
                case 2:
                    return f16631l;
                case 3:
                    return null;
                case 4:
                    return new C6825a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6824b bVar = (C6824b) obj2;
                    this.f16633e = visitor.visitString(!this.f16633e.isEmpty(), this.f16633e, !bVar.f16633e.isEmpty(), bVar.f16633e);
                    this.f16634f = visitor.visitString(!this.f16634f.isEmpty(), this.f16634f, !bVar.f16634f.isEmpty(), bVar.f16634f);
                    this.f16635g = visitor.visitString(!this.f16635g.isEmpty(), this.f16635g, !bVar.f16635g.isEmpty(), bVar.f16635g);
                    this.f16636h = visitor.visitInt(this.f16636h != 0, this.f16636h, bVar.f16636h != 0, bVar.f16636h);
                    boolean z2 = this.f16637i != 0;
                    int i = this.f16637i;
                    if (bVar.f16637i != 0) {
                        z = true;
                    }
                    this.f16637i = visitor.visitInt(z2, i, z, bVar.f16637i);
                    this.f16638j = (C7354j0) visitor.visitMessage(this.f16638j, bVar.f16638j);
                    this.f16639k = (C7384l2) visitor.visitMessage(this.f16639k, bVar.f16639k);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.f16637i = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.f16633e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f16634f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 32) {
                                    this.f16636h = codedInputStream.readUInt32();
                                } else if (readTag == 42) {
                                    this.f16635g = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 50) {
                                    Builder builder = this.f16638j != null ? (C7357c) this.f16638j.toBuilder() : null;
                                    this.f16638j = (C7354j0) codedInputStream.readMessage(C7354j0.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16638j);
                                        this.f16638j = (C7354j0) builder.buildPartial();
                                    }
                                } else if (readTag == 58) {
                                    Builder builder2 = this.f16639k != null ? (C7385a) this.f16639k.toBuilder() : null;
                                    this.f16639k = (C7384l2) codedInputStream.readMessage(C7384l2.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16639k);
                                        this.f16639k = (C7384l2) builder2.buildPartial();
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
                    if (f16632m == null) {
                        synchronized (C6824b.class) {
                            if (f16632m == null) {
                                f16632m = new DefaultInstanceBasedParser(f16631l);
                            }
                        }
                    }
                    return f16632m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16631l;
        }

        public String getEmojiUuid() {
            return this.f16634f;
        }

        public ByteString getEmojiUuidBytes() {
            return ByteString.copyFromUtf8(this.f16634f);
        }

        public C7354j0 getMedia() {
            C7354j0 j0Var = this.f16638j;
            return j0Var == null ? C7354j0.getDefaultInstance() : j0Var;
        }

        public String getMessage() {
            return this.f16635g;
        }

        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.f16635g);
        }

        public C7384l2 getRequestMedia() {
            C7384l2 l2Var = this.f16639k;
            return l2Var == null ? C7384l2.getDefaultInstance() : l2Var;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16637i != C6826b.UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16637i);
            }
            if (!this.f16633e.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getText());
            }
            if (!this.f16634f.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getEmojiUuid());
            }
            int i3 = this.f16636h;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(4, i3);
            }
            if (!this.f16635g.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(5, getMessage());
            }
            if (this.f16638j != null) {
                i2 += CodedOutputStream.computeMessageSize(6, getMedia());
            }
            if (this.f16639k != null) {
                i2 += CodedOutputStream.computeMessageSize(7, getRequestMedia());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getText() {
            return this.f16633e;
        }

        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.f16633e);
        }

        public C6826b getType() {
            C6826b a = C6826b.m17582a(this.f16637i);
            return a == null ? C6826b.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.f16637i;
        }

        public int getWeight() {
            return this.f16636h;
        }

        public boolean hasMedia() {
            return this.f16638j != null;
        }

        public boolean hasRequestMedia() {
            return this.f16639k != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16637i != C6826b.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16637i);
            }
            if (!this.f16633e.isEmpty()) {
                codedOutputStream.writeString(2, getText());
            }
            if (!this.f16634f.isEmpty()) {
                codedOutputStream.writeString(3, getEmojiUuid());
            }
            int i = this.f16636h;
            if (i != 0) {
                codedOutputStream.writeUInt32(4, i);
            }
            if (!this.f16635g.isEmpty()) {
                codedOutputStream.writeString(5, getMessage());
            }
            if (this.f16638j != null) {
                codedOutputStream.writeMessage(6, getMedia());
            }
            if (this.f16639k != null) {
                codedOutputStream.writeMessage(7, getRequestMedia());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17573b(String str) {
            if (str != null) {
                this.f16635g = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17575c(String str) {
            if (str != null) {
                this.f16633e = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17571a(String str) {
            if (str != null) {
                this.f16634f = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17564a(int i) {
            this.f16636h = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17565a(C6826b bVar) {
            if (bVar != null) {
                this.f16637i = bVar.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17570a(C7357c cVar) {
            this.f16638j = (C7354j0) cVar.build();
        }
    }

    static {
        f16617q.makeImmutable();
    }

    private PingProto$Ping2() {
        String str = "";
        this.f16620f = str;
        this.f16623i = str;
        this.f16624j = str;
        this.f16626l = str;
    }

    /* renamed from: b */
    private void m17558b() {
        if (!this.f16622h.isModifiable()) {
            this.f16622h = GeneratedMessageLite.mutableCopy(this.f16622h);
        }
    }

    public static PingProto$Ping2 getDefaultInstance() {
        return f16617q;
    }

    public static C6823a newBuilder() {
        return (C6823a) f16617q.toBuilder();
    }

    public static Parser<PingProto$Ping2> parser() {
        return f16617q.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new PingProto$Ping2();
            case 2:
                return f16617q;
            case 3:
                this.f16622h.makeImmutable();
                return null;
            case 4:
                return new C6823a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PingProto$Ping2 pingProto$Ping2 = (PingProto$Ping2) obj2;
                this.f16620f = visitor.visitString(!this.f16620f.isEmpty(), this.f16620f, !pingProto$Ping2.f16620f.isEmpty(), pingProto$Ping2.f16620f);
                this.f16621g = (Timestamp) visitor.visitMessage(this.f16621g, pingProto$Ping2.f16621g);
                this.f16622h = visitor.visitList(this.f16622h, pingProto$Ping2.f16622h);
                this.f16623i = visitor.visitString(!this.f16623i.isEmpty(), this.f16623i, !pingProto$Ping2.f16623i.isEmpty(), pingProto$Ping2.f16623i);
                this.f16624j = visitor.visitString(!this.f16624j.isEmpty(), this.f16624j, !pingProto$Ping2.f16624j.isEmpty(), pingProto$Ping2.f16624j);
                this.f16625k = visitor.visitLong(this.f16625k != 0, this.f16625k, pingProto$Ping2.f16625k != 0, pingProto$Ping2.f16625k);
                this.f16626l = visitor.visitString(!this.f16626l.isEmpty(), this.f16626l, !pingProto$Ping2.f16626l.isEmpty(), pingProto$Ping2.f16626l);
                this.f16627m = visitor.visitLong(this.f16627m != 0, this.f16627m, pingProto$Ping2.f16627m != 0, pingProto$Ping2.f16627m);
                this.f16628n = visitor.visitLong(this.f16628n != 0, this.f16628n, pingProto$Ping2.f16628n != 0, pingProto$Ping2.f16628n);
                this.f16629o = visitor.visitLong(this.f16629o != 0, this.f16629o, pingProto$Ping2.f16629o != 0, pingProto$Ping2.f16629o);
                boolean z2 = this.f16630p;
                boolean z3 = pingProto$Ping2.f16630p;
                this.f16630p = visitor.visitBoolean(z2, z2, z3, z3);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16619e |= pingProto$Ping2.f16619e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f16620f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f16621g != null ? (Timestamp.Builder) this.f16621g.toBuilder() : null;
                                this.f16621g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f16621g);
                                    this.f16621g = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                if (!this.f16622h.isModifiable()) {
                                    this.f16622h = GeneratedMessageLite.mutableCopy(this.f16622h);
                                }
                                this.f16622h.add(codedInputStream.readMessage(C6824b.parser(), extensionRegistryLite));
                                break;
                            case 42:
                                this.f16623i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.f16624j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 56:
                                this.f16625k = codedInputStream.readInt64();
                                break;
                            case 66:
                                this.f16626l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 72:
                                this.f16627m = codedInputStream.readUInt64();
                                break;
                            case 80:
                                this.f16628n = codedInputStream.readUInt64();
                                break;
                            case 88:
                                this.f16629o = codedInputStream.readUInt64();
                                break;
                            case 96:
                                this.f16630p = codedInputStream.readBool();
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f16618r == null) {
                    synchronized (PingProto$Ping2.class) {
                        if (f16618r == null) {
                            f16618r = new DefaultInstanceBasedParser(f16617q);
                        }
                    }
                }
                return f16618r;
            default:
                throw new UnsupportedOperationException();
        }
        return f16617q;
    }

    public String getAuthorUuid() {
        return this.f16623i;
    }

    public ByteString getAuthorUuidBytes() {
        return ByteString.copyFromUtf8(this.f16623i);
    }

    public long getClientStatus() {
        return this.f16628n;
    }

    public String getClientUuid() {
        return this.f16626l;
    }

    public ByteString getClientUuidBytes() {
        return ByteString.copyFromUtf8(this.f16626l);
    }

    public C6824b getContent(int i) {
        return (C6824b) this.f16622h.get(i);
    }

    public int getContentCount() {
        return this.f16622h.size();
    }

    public List<C6824b> getContentList() {
        return this.f16622h;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f16621g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getOffChat() {
        return this.f16630p;
    }

    public long getSeq() {
        return this.f16625k;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f16620f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f16621g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        for (int i2 = 0; i2 < this.f16622h.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f16622h.get(i2));
        }
        if (!this.f16623i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, getAuthorUuid());
        }
        if (!this.f16624j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, getTargetUuid());
        }
        long j = this.f16625k;
        if (j != 0) {
            computeStringSize += CodedOutputStream.computeInt64Size(7, j);
        }
        if (!this.f16626l.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getClientUuid());
        }
        long j2 = this.f16627m;
        if (j2 != 0) {
            computeStringSize += CodedOutputStream.computeUInt64Size(9, j2);
        }
        long j3 = this.f16628n;
        if (j3 != 0) {
            computeStringSize += CodedOutputStream.computeUInt64Size(10, j3);
        }
        long j4 = this.f16629o;
        if (j4 != 0) {
            computeStringSize += CodedOutputStream.computeUInt64Size(11, j4);
        }
        boolean z = this.f16630p;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(12, z);
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public long getStatus() {
        return this.f16627m;
    }

    public long getSystemState() {
        return this.f16629o;
    }

    public String getTargetUuid() {
        return this.f16624j;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f16624j);
    }

    public String getUuid() {
        return this.f16620f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f16620f);
    }

    public boolean hasCreatedAt() {
        return this.f16621g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16620f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f16621g != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        for (int i = 0; i < this.f16622h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f16622h.get(i));
        }
        if (!this.f16623i.isEmpty()) {
            codedOutputStream.writeString(5, getAuthorUuid());
        }
        if (!this.f16624j.isEmpty()) {
            codedOutputStream.writeString(6, getTargetUuid());
        }
        long j = this.f16625k;
        if (j != 0) {
            codedOutputStream.writeInt64(7, j);
        }
        if (!this.f16626l.isEmpty()) {
            codedOutputStream.writeString(8, getClientUuid());
        }
        long j2 = this.f16627m;
        if (j2 != 0) {
            codedOutputStream.writeUInt64(9, j2);
        }
        long j3 = this.f16628n;
        if (j3 != 0) {
            codedOutputStream.writeUInt64(10, j3);
        }
        long j4 = this.f16629o;
        if (j4 != 0) {
            codedOutputStream.writeUInt64(11, j4);
        }
        boolean z = this.f16630p;
        if (z) {
            codedOutputStream.writeBool(12, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17550a(int i, C6825a aVar) {
        m17558b();
        this.f16622h.set(i, aVar.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17552a(C6825a aVar) {
        m17558b();
        this.f16622h.add(aVar.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17557a(String str) {
        if (str != null) {
            this.f16624j = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17551a(long j) {
        this.f16627m = j;
    }
}
