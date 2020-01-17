package p213co.znly.models.places;

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

/* renamed from: co.znly.models.places.g */
public final class C7881g extends GeneratedMessageLite<C7881g, C7882a> implements PlaceProto$PlacesWithSourceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7881g f19935h = new C7881g();

    /* renamed from: i */
    private static volatile Parser<C7881g> f19936i;

    /* renamed from: e */
    private int f19937e;

    /* renamed from: f */
    private String f19938f = "";

    /* renamed from: g */
    private ProtobufList<C7873c> f19939g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.places.g$a */
    public static final class C7882a extends Builder<C7881g, C7882a> implements PlaceProto$PlacesWithSourceOrBuilder {
        /* synthetic */ C7882a(C7870a aVar) {
            this();
        }

        public C7873c getPlaces(int i) {
            return ((C7881g) this.instance).getPlaces(i);
        }

        public int getPlacesCount() {
            return ((C7881g) this.instance).getPlacesCount();
        }

        public List<C7873c> getPlacesList() {
            return Collections.unmodifiableList(((C7881g) this.instance).getPlacesList());
        }

        public String getSource() {
            return ((C7881g) this.instance).getSource();
        }

        public ByteString getSourceBytes() {
            return ((C7881g) this.instance).getSourceBytes();
        }

        private C7882a() {
            super(C7881g.f19935h);
        }
    }

    static {
        f19935h.makeImmutable();
    }

    private C7881g() {
    }

    public static Parser<C7881g> parser() {
        return f19935h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7881g();
            case 2:
                return f19935h;
            case 3:
                this.f19939g.makeImmutable();
                return null;
            case 4:
                return new C7882a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7881g gVar = (C7881g) obj2;
                this.f19938f = visitor.visitString(!this.f19938f.isEmpty(), this.f19938f, true ^ gVar.f19938f.isEmpty(), gVar.f19938f);
                this.f19939g = visitor.visitList(this.f19939g, gVar.f19939g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f19937e |= gVar.f19937e;
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
                                this.f19938f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!this.f19939g.isModifiable()) {
                                    this.f19939g = GeneratedMessageLite.mutableCopy(this.f19939g);
                                }
                                this.f19939g.add(codedInputStream.readMessage(C7873c.parser(), extensionRegistryLite));
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
                if (f19936i == null) {
                    synchronized (C7881g.class) {
                        if (f19936i == null) {
                            f19936i = new DefaultInstanceBasedParser(f19935h);
                        }
                    }
                }
                return f19936i;
            default:
                throw new UnsupportedOperationException();
        }
        return f19935h;
    }

    public C7873c getPlaces(int i) {
        return (C7873c) this.f19939g.get(i);
    }

    public int getPlacesCount() {
        return this.f19939g.size();
    }

    public List<C7873c> getPlacesList() {
        return this.f19939g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f19938f.isEmpty() ? CodedOutputStream.computeStringSize(1, getSource()) + 0 : 0;
        for (int i2 = 0; i2 < this.f19939g.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f19939g.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getSource() {
        return this.f19938f;
    }

    public ByteString getSourceBytes() {
        return ByteString.copyFromUtf8(this.f19938f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19938f.isEmpty()) {
            codedOutputStream.writeString(1, getSource());
        }
        for (int i = 0; i < this.f19939g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f19939g.get(i));
        }
    }
}
