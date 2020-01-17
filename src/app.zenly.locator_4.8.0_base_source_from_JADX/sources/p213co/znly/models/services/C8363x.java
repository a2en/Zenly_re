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

/* renamed from: co.znly.models.services.x */
public final class C8363x extends GeneratedMessageLite<C8363x, C8364a> implements ZendeskProto$ZendeskCategoryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C8363x f21183l = new C8363x();

    /* renamed from: m */
    private static volatile Parser<C8363x> f21184m;

    /* renamed from: e */
    private int f21185e;

    /* renamed from: f */
    private String f21186f;

    /* renamed from: g */
    private String f21187g;

    /* renamed from: h */
    private String f21188h;

    /* renamed from: i */
    private String f21189i;

    /* renamed from: j */
    private String f21190j;

    /* renamed from: k */
    private ProtobufList<C8363x> f21191k = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.x$a */
    public static final class C8364a extends Builder<C8363x, C8364a> implements ZendeskProto$ZendeskCategoryOrBuilder {
        /* synthetic */ C8364a(C8344w wVar) {
            this();
        }

        public String getComposerPlaceholder() {
            return ((C8363x) this.instance).getComposerPlaceholder();
        }

        public ByteString getComposerPlaceholderBytes() {
            return ((C8363x) this.instance).getComposerPlaceholderBytes();
        }

        public String getComposerSubtitle() {
            return ((C8363x) this.instance).getComposerSubtitle();
        }

        public ByteString getComposerSubtitleBytes() {
            return ((C8363x) this.instance).getComposerSubtitleBytes();
        }

        public String getId() {
            return ((C8363x) this.instance).getId();
        }

        public ByteString getIdBytes() {
            return ((C8363x) this.instance).getIdBytes();
        }

        public C8363x getSubcategories(int i) {
            return ((C8363x) this.instance).getSubcategories(i);
        }

        public int getSubcategoriesCount() {
            return ((C8363x) this.instance).getSubcategoriesCount();
        }

        public List<C8363x> getSubcategoriesList() {
            return Collections.unmodifiableList(((C8363x) this.instance).getSubcategoriesList());
        }

        public String getSubtitle() {
            return ((C8363x) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((C8363x) this.instance).getSubtitleBytes();
        }

        public String getTitle() {
            return ((C8363x) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((C8363x) this.instance).getTitleBytes();
        }

        private C8364a() {
            super(C8363x.f21183l);
        }
    }

    static {
        f21183l.makeImmutable();
    }

    private C8363x() {
        String str = "";
        this.f21186f = str;
        this.f21187g = str;
        this.f21188h = str;
        this.f21189i = str;
        this.f21190j = str;
    }

    public static Parser<C8363x> parser() {
        return f21183l.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8363x();
            case 2:
                return f21183l;
            case 3:
                this.f21191k.makeImmutable();
                return null;
            case 4:
                return new C8364a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8363x xVar = (C8363x) obj2;
                this.f21186f = visitor.visitString(!this.f21186f.isEmpty(), this.f21186f, !xVar.f21186f.isEmpty(), xVar.f21186f);
                this.f21187g = visitor.visitString(!this.f21187g.isEmpty(), this.f21187g, !xVar.f21187g.isEmpty(), xVar.f21187g);
                this.f21188h = visitor.visitString(!this.f21188h.isEmpty(), this.f21188h, !xVar.f21188h.isEmpty(), xVar.f21188h);
                this.f21189i = visitor.visitString(!this.f21189i.isEmpty(), this.f21189i, !xVar.f21189i.isEmpty(), xVar.f21189i);
                this.f21190j = visitor.visitString(!this.f21190j.isEmpty(), this.f21190j, true ^ xVar.f21190j.isEmpty(), xVar.f21190j);
                this.f21191k = visitor.visitList(this.f21191k, xVar.f21191k);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21185e |= xVar.f21185e;
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
                                this.f21186f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f21187g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f21188h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f21189i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f21190j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                if (!this.f21191k.isModifiable()) {
                                    this.f21191k = GeneratedMessageLite.mutableCopy(this.f21191k);
                                }
                                this.f21191k.add(codedInputStream.readMessage(parser(), extensionRegistryLite));
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
                if (f21184m == null) {
                    synchronized (C8363x.class) {
                        if (f21184m == null) {
                            f21184m = new DefaultInstanceBasedParser(f21183l);
                        }
                    }
                }
                return f21184m;
            default:
                throw new UnsupportedOperationException();
        }
        return f21183l;
    }

    public String getComposerPlaceholder() {
        return this.f21188h;
    }

    public ByteString getComposerPlaceholderBytes() {
        return ByteString.copyFromUtf8(this.f21188h);
    }

    public String getComposerSubtitle() {
        return this.f21189i;
    }

    public ByteString getComposerSubtitleBytes() {
        return ByteString.copyFromUtf8(this.f21189i);
    }

    public String getId() {
        return this.f21190j;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.f21190j);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f21186f.isEmpty() ? CodedOutputStream.computeStringSize(1, getTitle()) + 0 : 0;
        if (!this.f21187g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getSubtitle());
        }
        if (!this.f21188h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getComposerPlaceholder());
        }
        if (!this.f21189i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getComposerSubtitle());
        }
        if (!this.f21190j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, getId());
        }
        for (int i2 = 0; i2 < this.f21191k.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f21191k.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public C8363x getSubcategories(int i) {
        return (C8363x) this.f21191k.get(i);
    }

    public int getSubcategoriesCount() {
        return this.f21191k.size();
    }

    public List<C8363x> getSubcategoriesList() {
        return this.f21191k;
    }

    public String getSubtitle() {
        return this.f21187g;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.f21187g);
    }

    public String getTitle() {
        return this.f21186f;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.f21186f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21186f.isEmpty()) {
            codedOutputStream.writeString(1, getTitle());
        }
        if (!this.f21187g.isEmpty()) {
            codedOutputStream.writeString(2, getSubtitle());
        }
        if (!this.f21188h.isEmpty()) {
            codedOutputStream.writeString(3, getComposerPlaceholder());
        }
        if (!this.f21189i.isEmpty()) {
            codedOutputStream.writeString(4, getComposerSubtitle());
        }
        if (!this.f21190j.isEmpty()) {
            codedOutputStream.writeString(5, getId());
        }
        for (int i = 0; i < this.f21191k.size(); i++) {
            codedOutputStream.writeMessage(6, (MessageLite) this.f21191k.get(i));
        }
    }
}
