package p213co.znly.models.bubble;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7318g0;
import p213co.znly.models.C7318g0.C7319a;

/* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon */
public final class BubbleProto$BubbleIcon extends GeneratedMessageLite<BubbleProto$BubbleIcon, C6962a> implements BubbleProto$BubbleIconOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final BubbleProto$BubbleIcon f17159j = new BubbleProto$BubbleIcon();

    /* renamed from: k */
    private static volatile Parser<BubbleProto$BubbleIcon> f17160k;

    /* renamed from: e */
    private int f17161e = 0;

    /* renamed from: f */
    private Object f17162f;

    /* renamed from: g */
    private String f17163g;

    /* renamed from: h */
    private String f17164h;

    /* renamed from: i */
    private Timestamp f17165i;

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$EmojiOrBuilder */
    public interface EmojiOrBuilder extends MessageLiteOrBuilder {
        String getEmojiUuid();

        ByteString getEmojiUuidBytes();

        int getWeight();
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$ImageOrBuilder */
    public interface ImageOrBuilder extends MessageLiteOrBuilder {
        String getChecksum();

        ByteString getChecksumBytes();

        C7318g0 getSize();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasSize();
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$TextOrBuilder */
    public interface TextOrBuilder extends MessageLiteOrBuilder {
        String getText();

        ByteString getTextBytes();
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$a */
    public static final class C6962a extends Builder<BubbleProto$BubbleIcon, C6962a> implements BubbleProto$BubbleIconOrBuilder {
        /* synthetic */ C6962a(C6970a aVar) {
            this();
        }

        public C6963b getContentCase() {
            return ((BubbleProto$BubbleIcon) this.instance).getContentCase();
        }

        public Timestamp getCreatedAt() {
            return ((BubbleProto$BubbleIcon) this.instance).getCreatedAt();
        }

        public C6964c getEmoji() {
            return ((BubbleProto$BubbleIcon) this.instance).getEmoji();
        }

        public C6966d getImage() {
            return ((BubbleProto$BubbleIcon) this.instance).getImage();
        }

        public C6968e getText() {
            return ((BubbleProto$BubbleIcon) this.instance).getText();
        }

        public String getUserUuid() {
            return ((BubbleProto$BubbleIcon) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((BubbleProto$BubbleIcon) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((BubbleProto$BubbleIcon) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((BubbleProto$BubbleIcon) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((BubbleProto$BubbleIcon) this.instance).hasCreatedAt();
        }

        private C6962a() {
            super(BubbleProto$BubbleIcon.f17159j);
        }
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$b */
    public enum C6963b implements EnumLite {
        EMOJI(3),
        TEXT(4),
        IMAGE(5),
        CONTENT_NOT_SET(0);
        

        /* renamed from: e */
        private final int f17171e;

        private C6963b(int i) {
            this.f17171e = i;
        }

        /* renamed from: a */
        public static C6963b m17703a(int i) {
            if (i == 0) {
                return CONTENT_NOT_SET;
            }
            if (i == 3) {
                return EMOJI;
            }
            if (i == 4) {
                return TEXT;
            }
            if (i != 5) {
                return null;
            }
            return IMAGE;
        }

        public int getNumber() {
            return this.f17171e;
        }
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$c */
    public static final class C6964c extends GeneratedMessageLite<C6964c, C6965a> implements EmojiOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6964c f17172g = new C6964c();

        /* renamed from: h */
        private static volatile Parser<C6964c> f17173h;

        /* renamed from: e */
        private String f17174e = "";

        /* renamed from: f */
        private int f17175f;

        /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$c$a */
        public static final class C6965a extends Builder<C6964c, C6965a> implements EmojiOrBuilder {
            /* synthetic */ C6965a(C6970a aVar) {
                this();
            }

            public String getEmojiUuid() {
                return ((C6964c) this.instance).getEmojiUuid();
            }

            public ByteString getEmojiUuidBytes() {
                return ((C6964c) this.instance).getEmojiUuidBytes();
            }

            public int getWeight() {
                return ((C6964c) this.instance).getWeight();
            }

            private C6965a() {
                super(C6964c.f17172g);
            }
        }

        static {
            f17172g.makeImmutable();
        }

        private C6964c() {
        }

        public static C6964c getDefaultInstance() {
            return f17172g;
        }

        public static Parser<C6964c> parser() {
            return f17172g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C6970a.f17184a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6964c();
                case 2:
                    return f17172g;
                case 3:
                    return null;
                case 4:
                    return new C6965a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6964c cVar = (C6964c) obj2;
                    this.f17174e = visitor.visitString(!this.f17174e.isEmpty(), this.f17174e, !cVar.f17174e.isEmpty(), cVar.f17174e);
                    boolean z2 = this.f17175f != 0;
                    int i = this.f17175f;
                    if (cVar.f17175f != 0) {
                        z = true;
                    }
                    this.f17175f = visitor.visitInt(z2, i, z, cVar.f17175f);
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
                                    this.f17174e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f17175f = codedInputStream.readInt32();
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
                    if (f17173h == null) {
                        synchronized (C6964c.class) {
                            if (f17173h == null) {
                                f17173h = new DefaultInstanceBasedParser(f17172g);
                            }
                        }
                    }
                    return f17173h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17172g;
        }

        public String getEmojiUuid() {
            return this.f17174e;
        }

        public ByteString getEmojiUuidBytes() {
            return ByteString.copyFromUtf8(this.f17174e);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17174e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getEmojiUuid());
            }
            int i3 = this.f17175f;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public int getWeight() {
            return this.f17175f;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17174e.isEmpty()) {
                codedOutputStream.writeString(1, getEmojiUuid());
            }
            int i = this.f17175f;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
        }
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$d */
    public static final class C6966d extends GeneratedMessageLite<C6966d, C6967a> implements ImageOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6966d f17176h = new C6966d();

        /* renamed from: i */
        private static volatile Parser<C6966d> f17177i;

        /* renamed from: e */
        private String f17178e;

        /* renamed from: f */
        private C7318g0 f17179f;

        /* renamed from: g */
        private String f17180g;

        /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$d$a */
        public static final class C6967a extends Builder<C6966d, C6967a> implements ImageOrBuilder {
            /* synthetic */ C6967a(C6970a aVar) {
                this();
            }

            public String getChecksum() {
                return ((C6966d) this.instance).getChecksum();
            }

            public ByteString getChecksumBytes() {
                return ((C6966d) this.instance).getChecksumBytes();
            }

            public C7318g0 getSize() {
                return ((C6966d) this.instance).getSize();
            }

            public String getUrl() {
                return ((C6966d) this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((C6966d) this.instance).getUrlBytes();
            }

            public boolean hasSize() {
                return ((C6966d) this.instance).hasSize();
            }

            private C6967a() {
                super(C6966d.f17176h);
            }
        }

        static {
            f17176h.makeImmutable();
        }

        private C6966d() {
            String str = "";
            this.f17178e = str;
            this.f17180g = str;
        }

        public static C6966d getDefaultInstance() {
            return f17176h;
        }

        public static Parser<C6966d> parser() {
            return f17176h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6970a.f17184a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6966d();
                case 2:
                    return f17176h;
                case 3:
                    return null;
                case 4:
                    return new C6967a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6966d dVar = (C6966d) obj2;
                    this.f17178e = visitor.visitString(!this.f17178e.isEmpty(), this.f17178e, !dVar.f17178e.isEmpty(), dVar.f17178e);
                    this.f17179f = (C7318g0) visitor.visitMessage(this.f17179f, dVar.f17179f);
                    this.f17180g = visitor.visitString(!this.f17180g.isEmpty(), this.f17180g, true ^ dVar.f17180g.isEmpty(), dVar.f17180g);
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
                                    this.f17178e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17179f != null ? (C7319a) this.f17179f.toBuilder() : null;
                                    this.f17179f = (C7318g0) codedInputStream.readMessage(C7318g0.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17179f);
                                        this.f17179f = (C7318g0) builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    this.f17180g = codedInputStream.readStringRequireUtf8();
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
                    if (f17177i == null) {
                        synchronized (C6966d.class) {
                            if (f17177i == null) {
                                f17177i = new DefaultInstanceBasedParser(f17176h);
                            }
                        }
                    }
                    return f17177i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17176h;
        }

        public String getChecksum() {
            return this.f17180g;
        }

        public ByteString getChecksumBytes() {
            return ByteString.copyFromUtf8(this.f17180g);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17178e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUrl());
            }
            if (this.f17179f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getSize());
            }
            if (!this.f17180g.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getChecksum());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7318g0 getSize() {
            C7318g0 g0Var = this.f17179f;
            return g0Var == null ? C7318g0.getDefaultInstance() : g0Var;
        }

        public String getUrl() {
            return this.f17178e;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.f17178e);
        }

        public boolean hasSize() {
            return this.f17179f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17178e.isEmpty()) {
                codedOutputStream.writeString(1, getUrl());
            }
            if (this.f17179f != null) {
                codedOutputStream.writeMessage(2, getSize());
            }
            if (!this.f17180g.isEmpty()) {
                codedOutputStream.writeString(3, getChecksum());
            }
        }
    }

    /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$e */
    public static final class C6968e extends GeneratedMessageLite<C6968e, C6969a> implements TextOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6968e f17181f = new C6968e();

        /* renamed from: g */
        private static volatile Parser<C6968e> f17182g;

        /* renamed from: e */
        private String f17183e = "";

        /* renamed from: co.znly.models.bubble.BubbleProto$BubbleIcon$e$a */
        public static final class C6969a extends Builder<C6968e, C6969a> implements TextOrBuilder {
            /* synthetic */ C6969a(C6970a aVar) {
                this();
            }

            public String getText() {
                return ((C6968e) this.instance).getText();
            }

            public ByteString getTextBytes() {
                return ((C6968e) this.instance).getTextBytes();
            }

            private C6969a() {
                super(C6968e.f17181f);
            }
        }

        static {
            f17181f.makeImmutable();
        }

        private C6968e() {
        }

        public static C6968e getDefaultInstance() {
            return f17181f;
        }

        public static Parser<C6968e> parser() {
            return f17181f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6970a.f17184a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6968e();
                case 2:
                    return f17181f;
                case 3:
                    return null;
                case 4:
                    return new C6969a(null);
                case 5:
                    C6968e eVar = (C6968e) obj2;
                    this.f17183e = ((Visitor) obj).visitString(!this.f17183e.isEmpty(), this.f17183e, true ^ eVar.f17183e.isEmpty(), eVar.f17183e);
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
                                    this.f17183e = codedInputStream.readStringRequireUtf8();
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
                    if (f17182g == null) {
                        synchronized (C6968e.class) {
                            if (f17182g == null) {
                                f17182g = new DefaultInstanceBasedParser(f17181f);
                            }
                        }
                    }
                    return f17182g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17181f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17183e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getText());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getText() {
            return this.f17183e;
        }

        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.f17183e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17183e.isEmpty()) {
                codedOutputStream.writeString(1, getText());
            }
        }
    }

    static {
        f17159j.makeImmutable();
    }

    private BubbleProto$BubbleIcon() {
        String str = "";
        this.f17163g = str;
        this.f17164h = str;
    }

    public static Parser<BubbleProto$BubbleIcon> parser() {
        return f17159j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6970a.f17184a[methodToInvoke.ordinal()]) {
            case 1:
                return new BubbleProto$BubbleIcon();
            case 2:
                return f17159j;
            case 3:
                return null;
            case 4:
                return new C6962a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                BubbleProto$BubbleIcon bubbleProto$BubbleIcon = (BubbleProto$BubbleIcon) obj2;
                this.f17163g = visitor.visitString(!this.f17163g.isEmpty(), this.f17163g, !bubbleProto$BubbleIcon.f17163g.isEmpty(), bubbleProto$BubbleIcon.f17163g);
                this.f17164h = visitor.visitString(!this.f17164h.isEmpty(), this.f17164h, !bubbleProto$BubbleIcon.f17164h.isEmpty(), bubbleProto$BubbleIcon.f17164h);
                this.f17165i = (Timestamp) visitor.visitMessage(this.f17165i, bubbleProto$BubbleIcon.f17165i);
                int i = C6970a.f17185b[bubbleProto$BubbleIcon.getContentCase().ordinal()];
                if (i == 1) {
                    if (this.f17161e == 3) {
                        z = true;
                    }
                    this.f17162f = visitor.visitOneofMessage(z, this.f17162f, bubbleProto$BubbleIcon.f17162f);
                } else if (i == 2) {
                    if (this.f17161e == 4) {
                        z = true;
                    }
                    this.f17162f = visitor.visitOneofMessage(z, this.f17162f, bubbleProto$BubbleIcon.f17162f);
                } else if (i == 3) {
                    if (this.f17161e == 5) {
                        z = true;
                    }
                    this.f17162f = visitor.visitOneofMessage(z, this.f17162f, bubbleProto$BubbleIcon.f17162f);
                } else if (i == 4) {
                    if (this.f17161e != 0) {
                        z = true;
                    }
                    visitor.visitOneofNotSet(z);
                }
                if (visitor == MergeFromVisitor.INSTANCE) {
                    int i2 = bubbleProto$BubbleIcon.f17161e;
                    if (i2 != 0) {
                        this.f17161e = i2;
                    }
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
                                this.f17163g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f17165i != null ? (Timestamp.Builder) this.f17165i.toBuilder() : null;
                                this.f17165i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17165i);
                                    this.f17165i = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f17161e == 3 ? (C6965a) ((C6964c) this.f17162f).toBuilder() : null;
                                this.f17162f = codedInputStream.readMessage(C6964c.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom((C6964c) this.f17162f);
                                    this.f17162f = builder2.buildPartial();
                                }
                                this.f17161e = 3;
                            } else if (readTag == 34) {
                                Builder builder3 = this.f17161e == 4 ? (C6969a) ((C6968e) this.f17162f).toBuilder() : null;
                                this.f17162f = codedInputStream.readMessage(C6968e.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom((C6968e) this.f17162f);
                                    this.f17162f = builder3.buildPartial();
                                }
                                this.f17161e = 4;
                            } else if (readTag == 42) {
                                Builder builder4 = this.f17161e == 5 ? (C6967a) ((C6966d) this.f17162f).toBuilder() : null;
                                this.f17162f = codedInputStream.readMessage(C6966d.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom((C6966d) this.f17162f);
                                    this.f17162f = builder4.buildPartial();
                                }
                                this.f17161e = 5;
                            } else if (readTag == 50) {
                                this.f17164h = codedInputStream.readStringRequireUtf8();
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
                if (f17160k == null) {
                    synchronized (BubbleProto$BubbleIcon.class) {
                        if (f17160k == null) {
                            f17160k = new DefaultInstanceBasedParser(f17159j);
                        }
                    }
                }
                return f17160k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17159j;
    }

    public C6963b getContentCase() {
        return C6963b.m17703a(this.f17161e);
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17165i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6964c getEmoji() {
        if (this.f17161e == 3) {
            return (C6964c) this.f17162f;
        }
        return C6964c.getDefaultInstance();
    }

    public C6966d getImage() {
        if (this.f17161e == 5) {
            return (C6966d) this.f17162f;
        }
        return C6966d.getDefaultInstance();
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17163g.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (this.f17165i != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (this.f17161e == 3) {
            i2 += CodedOutputStream.computeMessageSize(3, (C6964c) this.f17162f);
        }
        if (this.f17161e == 4) {
            i2 += CodedOutputStream.computeMessageSize(4, (C6968e) this.f17162f);
        }
        if (this.f17161e == 5) {
            i2 += CodedOutputStream.computeMessageSize(5, (C6966d) this.f17162f);
        }
        if (!this.f17164h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getUserUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6968e getText() {
        if (this.f17161e == 4) {
            return (C6968e) this.f17162f;
        }
        return C6968e.getDefaultInstance();
    }

    public String getUserUuid() {
        return this.f17164h;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17164h);
    }

    public String getUuid() {
        return this.f17163g;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17163g);
    }

    public boolean hasCreatedAt() {
        return this.f17165i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17163g.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f17165i != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (this.f17161e == 3) {
            codedOutputStream.writeMessage(3, (C6964c) this.f17162f);
        }
        if (this.f17161e == 4) {
            codedOutputStream.writeMessage(4, (C6968e) this.f17162f);
        }
        if (this.f17161e == 5) {
            codedOutputStream.writeMessage(5, (C6966d) this.f17162f);
        }
        if (!this.f17164h.isEmpty()) {
            codedOutputStream.writeString(6, getUserUuid());
        }
    }
}
