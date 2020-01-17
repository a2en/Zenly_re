package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7468s2.C7470b;

/* renamed from: co.znly.models.SystemProto$Span */
public final class SystemProto$Span extends GeneratedMessageLite<SystemProto$Span, C6859a> implements SystemProto$SpanOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final SystemProto$Span f16752l = new SystemProto$Span();

    /* renamed from: m */
    private static volatile Parser<SystemProto$Span> f16753m;

    /* renamed from: e */
    private int f16754e;

    /* renamed from: f */
    private C7468s2 f16755f;

    /* renamed from: g */
    private Timestamp f16756g;

    /* renamed from: h */
    private Duration f16757h;

    /* renamed from: i */
    private String f16758i = "";

    /* renamed from: j */
    private ProtobufList<C6862c> f16759j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: k */
    private ProtobufList<C6860b> f16760k = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.SystemProto$Span$LogDataOrBuilder */
    public interface LogDataOrBuilder extends MessageLiteOrBuilder {
        String getEvent();

        ByteString getEventBytes();

        ByteString getPayload();

        Timestamp getTimestamp();

        boolean hasTimestamp();
    }

    /* renamed from: co.znly.models.SystemProto$Span$TagOrBuilder */
    public interface TagOrBuilder extends MessageLiteOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        ByteString getValue();
    }

    /* renamed from: co.znly.models.SystemProto$Span$a */
    public static final class C6859a extends Builder<SystemProto$Span, C6859a> implements SystemProto$SpanOrBuilder {
        /* synthetic */ C6859a(C7449q2 q2Var) {
            this();
        }

        public C7468s2 getContext() {
            return ((SystemProto$Span) this.instance).getContext();
        }

        public Duration getDuration() {
            return ((SystemProto$Span) this.instance).getDuration();
        }

        public C6860b getLogs(int i) {
            return ((SystemProto$Span) this.instance).getLogs(i);
        }

        public int getLogsCount() {
            return ((SystemProto$Span) this.instance).getLogsCount();
        }

        public List<C6860b> getLogsList() {
            return Collections.unmodifiableList(((SystemProto$Span) this.instance).getLogsList());
        }

        public String getOperation() {
            return ((SystemProto$Span) this.instance).getOperation();
        }

        public ByteString getOperationBytes() {
            return ((SystemProto$Span) this.instance).getOperationBytes();
        }

        public Timestamp getStart() {
            return ((SystemProto$Span) this.instance).getStart();
        }

        public C6862c getTags(int i) {
            return ((SystemProto$Span) this.instance).getTags(i);
        }

        public int getTagsCount() {
            return ((SystemProto$Span) this.instance).getTagsCount();
        }

        public List<C6862c> getTagsList() {
            return Collections.unmodifiableList(((SystemProto$Span) this.instance).getTagsList());
        }

        public boolean hasContext() {
            return ((SystemProto$Span) this.instance).hasContext();
        }

        public boolean hasDuration() {
            return ((SystemProto$Span) this.instance).hasDuration();
        }

        public boolean hasStart() {
            return ((SystemProto$Span) this.instance).hasStart();
        }

        private C6859a() {
            super(SystemProto$Span.f16752l);
        }
    }

    /* renamed from: co.znly.models.SystemProto$Span$b */
    public static final class C6860b extends GeneratedMessageLite<C6860b, C6861a> implements LogDataOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6860b f16761h = new C6860b();

        /* renamed from: i */
        private static volatile Parser<C6860b> f16762i;

        /* renamed from: e */
        private Timestamp f16763e;

        /* renamed from: f */
        private String f16764f = "";

        /* renamed from: g */
        private ByteString f16765g = ByteString.EMPTY;

        /* renamed from: co.znly.models.SystemProto$Span$b$a */
        public static final class C6861a extends Builder<C6860b, C6861a> implements LogDataOrBuilder {
            /* synthetic */ C6861a(C7449q2 q2Var) {
                this();
            }

            public String getEvent() {
                return ((C6860b) this.instance).getEvent();
            }

            public ByteString getEventBytes() {
                return ((C6860b) this.instance).getEventBytes();
            }

            public ByteString getPayload() {
                return ((C6860b) this.instance).getPayload();
            }

            public Timestamp getTimestamp() {
                return ((C6860b) this.instance).getTimestamp();
            }

            public boolean hasTimestamp() {
                return ((C6860b) this.instance).hasTimestamp();
            }

            private C6861a() {
                super(C6860b.f16761h);
            }
        }

        static {
            f16761h.makeImmutable();
        }

        private C6860b() {
        }

        public static Parser<C6860b> parser() {
            return f16761h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7449q2.f18637a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6860b();
                case 2:
                    return f16761h;
                case 3:
                    return null;
                case 4:
                    return new C6861a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6860b bVar = (C6860b) obj2;
                    this.f16763e = (Timestamp) visitor.visitMessage(this.f16763e, bVar.f16763e);
                    this.f16764f = visitor.visitString(!this.f16764f.isEmpty(), this.f16764f, !bVar.f16764f.isEmpty(), bVar.f16764f);
                    boolean z2 = this.f16765g != ByteString.EMPTY;
                    ByteString byteString = this.f16765g;
                    if (bVar.f16765g != ByteString.EMPTY) {
                        z = true;
                    }
                    this.f16765g = visitor.visitByteString(z2, byteString, z, bVar.f16765g);
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
                                    Builder builder = this.f16763e != null ? (Timestamp.Builder) this.f16763e.toBuilder() : null;
                                    this.f16763e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16763e);
                                        this.f16763e = (Timestamp) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    this.f16764f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f16765g = codedInputStream.readBytes();
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
                    if (f16762i == null) {
                        synchronized (C6860b.class) {
                            if (f16762i == null) {
                                f16762i = new DefaultInstanceBasedParser(f16761h);
                            }
                        }
                    }
                    return f16762i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16761h;
        }

        public String getEvent() {
            return this.f16764f;
        }

        public ByteString getEventBytes() {
            return ByteString.copyFromUtf8(this.f16764f);
        }

        public ByteString getPayload() {
            return this.f16765g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16763e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getTimestamp());
            }
            if (!this.f16764f.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getEvent());
            }
            if (!this.f16765g.isEmpty()) {
                i2 += CodedOutputStream.computeBytesSize(3, this.f16765g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getTimestamp() {
            Timestamp timestamp = this.f16763e;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasTimestamp() {
            return this.f16763e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16763e != null) {
                codedOutputStream.writeMessage(1, getTimestamp());
            }
            if (!this.f16764f.isEmpty()) {
                codedOutputStream.writeString(2, getEvent());
            }
            if (!this.f16765g.isEmpty()) {
                codedOutputStream.writeBytes(3, this.f16765g);
            }
        }
    }

    /* renamed from: co.znly.models.SystemProto$Span$c */
    public static final class C6862c extends GeneratedMessageLite<C6862c, C6863a> implements TagOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6862c f16766g = new C6862c();

        /* renamed from: h */
        private static volatile Parser<C6862c> f16767h;

        /* renamed from: e */
        private String f16768e = "";

        /* renamed from: f */
        private ByteString f16769f = ByteString.EMPTY;

        /* renamed from: co.znly.models.SystemProto$Span$c$a */
        public static final class C6863a extends Builder<C6862c, C6863a> implements TagOrBuilder {
            /* synthetic */ C6863a(C7449q2 q2Var) {
                this();
            }

            public String getKey() {
                return ((C6862c) this.instance).getKey();
            }

            public ByteString getKeyBytes() {
                return ((C6862c) this.instance).getKeyBytes();
            }

            public ByteString getValue() {
                return ((C6862c) this.instance).getValue();
            }

            private C6863a() {
                super(C6862c.f16766g);
            }
        }

        static {
            f16766g.makeImmutable();
        }

        private C6862c() {
        }

        public static Parser<C6862c> parser() {
            return f16766g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7449q2.f18637a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6862c();
                case 2:
                    return f16766g;
                case 3:
                    return null;
                case 4:
                    return new C6863a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6862c cVar = (C6862c) obj2;
                    this.f16768e = visitor.visitString(!this.f16768e.isEmpty(), this.f16768e, !cVar.f16768e.isEmpty(), cVar.f16768e);
                    boolean z2 = this.f16769f != ByteString.EMPTY;
                    ByteString byteString = this.f16769f;
                    if (cVar.f16769f != ByteString.EMPTY) {
                        z = true;
                    }
                    this.f16769f = visitor.visitByteString(z2, byteString, z, cVar.f16769f);
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
                                    this.f16768e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.f16769f = codedInputStream.readBytes();
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
                    if (f16767h == null) {
                        synchronized (C6862c.class) {
                            if (f16767h == null) {
                                f16767h = new DefaultInstanceBasedParser(f16766g);
                            }
                        }
                    }
                    return f16767h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16766g;
        }

        public String getKey() {
            return this.f16768e;
        }

        public ByteString getKeyBytes() {
            return ByteString.copyFromUtf8(this.f16768e);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f16768e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getKey());
            }
            if (!this.f16769f.isEmpty()) {
                i2 += CodedOutputStream.computeBytesSize(2, this.f16769f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ByteString getValue() {
            return this.f16769f;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f16768e.isEmpty()) {
                codedOutputStream.writeString(1, getKey());
            }
            if (!this.f16769f.isEmpty()) {
                codedOutputStream.writeBytes(2, this.f16769f);
            }
        }
    }

    static {
        f16752l.makeImmutable();
    }

    private SystemProto$Span() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7449q2.f18637a[methodToInvoke.ordinal()]) {
            case 1:
                return new SystemProto$Span();
            case 2:
                return f16752l;
            case 3:
                this.f16759j.makeImmutable();
                this.f16760k.makeImmutable();
                return null;
            case 4:
                return new C6859a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                SystemProto$Span systemProto$Span = (SystemProto$Span) obj2;
                this.f16755f = (C7468s2) visitor.visitMessage(this.f16755f, systemProto$Span.f16755f);
                this.f16756g = (Timestamp) visitor.visitMessage(this.f16756g, systemProto$Span.f16756g);
                this.f16757h = (Duration) visitor.visitMessage(this.f16757h, systemProto$Span.f16757h);
                this.f16758i = visitor.visitString(!this.f16758i.isEmpty(), this.f16758i, true ^ systemProto$Span.f16758i.isEmpty(), systemProto$Span.f16758i);
                this.f16759j = visitor.visitList(this.f16759j, systemProto$Span.f16759j);
                this.f16760k = visitor.visitList(this.f16760k, systemProto$Span.f16760k);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16754e |= systemProto$Span.f16754e;
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
                                Builder builder = this.f16755f != null ? (C7470b) this.f16755f.toBuilder() : null;
                                this.f16755f = (C7468s2) codedInputStream.readMessage(C7468s2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16755f);
                                    this.f16755f = (C7468s2) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f16756g != null ? (Timestamp.Builder) this.f16756g.toBuilder() : null;
                                this.f16756g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f16756g);
                                    this.f16756g = (Timestamp) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f16757h != null ? (Duration.Builder) this.f16757h.toBuilder() : null;
                                this.f16757h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f16757h);
                                    this.f16757h = (Duration) builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                this.f16758i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                if (!this.f16759j.isModifiable()) {
                                    this.f16759j = GeneratedMessageLite.mutableCopy(this.f16759j);
                                }
                                this.f16759j.add(codedInputStream.readMessage(C6862c.parser(), extensionRegistryLite));
                            } else if (readTag == 50) {
                                if (!this.f16760k.isModifiable()) {
                                    this.f16760k = GeneratedMessageLite.mutableCopy(this.f16760k);
                                }
                                this.f16760k.add(codedInputStream.readMessage(C6860b.parser(), extensionRegistryLite));
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
                if (f16753m == null) {
                    synchronized (SystemProto$Span.class) {
                        if (f16753m == null) {
                            f16753m = new DefaultInstanceBasedParser(f16752l);
                        }
                    }
                }
                return f16753m;
            default:
                throw new UnsupportedOperationException();
        }
        return f16752l;
    }

    public C7468s2 getContext() {
        C7468s2 s2Var = this.f16755f;
        return s2Var == null ? C7468s2.getDefaultInstance() : s2Var;
    }

    public Duration getDuration() {
        Duration duration = this.f16757h;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public C6860b getLogs(int i) {
        return (C6860b) this.f16760k.get(i);
    }

    public int getLogsCount() {
        return this.f16760k.size();
    }

    public List<C6860b> getLogsList() {
        return this.f16760k;
    }

    public String getOperation() {
        return this.f16758i;
    }

    public ByteString getOperationBytes() {
        return ByteString.copyFromUtf8(this.f16758i);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.f16755f != null ? CodedOutputStream.computeMessageSize(1, getContext()) + 0 : 0;
        if (this.f16756g != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getStart());
        }
        if (this.f16757h != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getDuration());
        }
        if (!this.f16758i.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(4, getOperation());
        }
        int i2 = computeMessageSize;
        for (int i3 = 0; i3 < this.f16759j.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f16759j.get(i3));
        }
        for (int i4 = 0; i4 < this.f16760k.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f16760k.get(i4));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getStart() {
        Timestamp timestamp = this.f16756g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6862c getTags(int i) {
        return (C6862c) this.f16759j.get(i);
    }

    public int getTagsCount() {
        return this.f16759j.size();
    }

    public List<C6862c> getTagsList() {
        return this.f16759j;
    }

    public boolean hasContext() {
        return this.f16755f != null;
    }

    public boolean hasDuration() {
        return this.f16757h != null;
    }

    public boolean hasStart() {
        return this.f16756g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f16755f != null) {
            codedOutputStream.writeMessage(1, getContext());
        }
        if (this.f16756g != null) {
            codedOutputStream.writeMessage(2, getStart());
        }
        if (this.f16757h != null) {
            codedOutputStream.writeMessage(3, getDuration());
        }
        if (!this.f16758i.isEmpty()) {
            codedOutputStream.writeString(4, getOperation());
        }
        for (int i = 0; i < this.f16759j.size(); i++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f16759j.get(i));
        }
        for (int i2 = 0; i2 < this.f16760k.size(); i2++) {
            codedOutputStream.writeMessage(6, (MessageLite) this.f16760k.get(i2));
        }
    }
}
