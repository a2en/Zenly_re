package p213co.znly.models.services.places;

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

/* renamed from: co.znly.models.services.places.b */
public final class C8233b extends GeneratedMessageLite<C8233b, C8234a> implements PlaceProto$PlaceUserIsProbablyInRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8233b f20831h = new C8233b();

    /* renamed from: i */
    private static volatile Parser<C8233b> f20832i;

    /* renamed from: e */
    private int f20833e;

    /* renamed from: f */
    private ProtobufList<String> f20834f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private String f20835g = "";

    /* renamed from: co.znly.models.services.places.b$a */
    public static final class C8234a extends Builder<C8233b, C8234a> implements PlaceProto$PlaceUserIsProbablyInRequestOrBuilder {
        /* synthetic */ C8234a(C8232a aVar) {
            this();
        }

        public String getLocale() {
            return ((C8233b) this.instance).getLocale();
        }

        public ByteString getLocaleBytes() {
            return ((C8233b) this.instance).getLocaleBytes();
        }

        public String getUserId(int i) {
            return ((C8233b) this.instance).getUserId(i);
        }

        public ByteString getUserIdBytes(int i) {
            return ((C8233b) this.instance).getUserIdBytes(i);
        }

        public int getUserIdCount() {
            return ((C8233b) this.instance).getUserIdCount();
        }

        public List<String> getUserIdList() {
            return Collections.unmodifiableList(((C8233b) this.instance).getUserIdList());
        }

        private C8234a() {
            super(C8233b.f20831h);
        }
    }

    static {
        f20831h.makeImmutable();
    }

    private C8233b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8232a.f20830a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8233b();
            case 2:
                return f20831h;
            case 3:
                this.f20834f.makeImmutable();
                return null;
            case 4:
                return new C8234a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8233b bVar = (C8233b) obj2;
                this.f20834f = visitor.visitList(this.f20834f, bVar.f20834f);
                this.f20835g = visitor.visitString(!this.f20835g.isEmpty(), this.f20835g, true ^ bVar.f20835g.isEmpty(), bVar.f20835g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20833e |= bVar.f20833e;
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
                                if (!this.f20834f.isModifiable()) {
                                    this.f20834f = GeneratedMessageLite.mutableCopy(this.f20834f);
                                }
                                this.f20834f.add(readStringRequireUtf8);
                            } else if (readTag == 18) {
                                this.f20835g = codedInputStream.readStringRequireUtf8();
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
                if (f20832i == null) {
                    synchronized (C8233b.class) {
                        if (f20832i == null) {
                            f20832i = new DefaultInstanceBasedParser(f20831h);
                        }
                    }
                }
                return f20832i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20831h;
    }

    public String getLocale() {
        return this.f20835g;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.f20835g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20834f.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20834f.get(i3));
        }
        int size = 0 + i2 + (getUserIdList().size() * 1);
        if (!this.f20835g.isEmpty()) {
            size += CodedOutputStream.computeStringSize(2, getLocale());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUserId(int i) {
        return (String) this.f20834f.get(i);
    }

    public ByteString getUserIdBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20834f.get(i));
    }

    public int getUserIdCount() {
        return this.f20834f.size();
    }

    public List<String> getUserIdList() {
        return this.f20834f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20834f.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f20834f.get(i));
        }
        if (!this.f20835g.isEmpty()) {
            codedOutputStream.writeString(2, getLocale());
        }
    }
}
