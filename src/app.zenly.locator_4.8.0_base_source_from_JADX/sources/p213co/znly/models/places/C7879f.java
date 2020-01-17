package p213co.znly.models.places;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
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

/* renamed from: co.znly.models.places.f */
public final class C7879f extends GeneratedMessageLite<C7879f, C7880a> implements PlaceProto$PlacesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7879f f19932f = new C7879f();

    /* renamed from: g */
    private static volatile Parser<C7879f> f19933g;

    /* renamed from: e */
    private ProtobufList<C7881g> f19934e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.places.f$a */
    public static final class C7880a extends Builder<C7879f, C7880a> implements PlaceProto$PlacesOrBuilder {
        /* synthetic */ C7880a(C7870a aVar) {
            this();
        }

        public C7881g getPlacesBySource(int i) {
            return ((C7879f) this.instance).getPlacesBySource(i);
        }

        public int getPlacesBySourceCount() {
            return ((C7879f) this.instance).getPlacesBySourceCount();
        }

        public List<C7881g> getPlacesBySourceList() {
            return Collections.unmodifiableList(((C7879f) this.instance).getPlacesBySourceList());
        }

        private C7880a() {
            super(C7879f.f19932f);
        }
    }

    static {
        f19932f.makeImmutable();
    }

    private C7879f() {
    }

    public static Parser<C7879f> parser() {
        return f19932f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7879f();
            case 2:
                return f19932f;
            case 3:
                this.f19934e.makeImmutable();
                return null;
            case 4:
                return new C7880a(null);
            case 5:
                this.f19934e = ((Visitor) obj).visitList(this.f19934e, ((C7879f) obj2).f19934e);
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
                                if (!this.f19934e.isModifiable()) {
                                    this.f19934e = GeneratedMessageLite.mutableCopy(this.f19934e);
                                }
                                this.f19934e.add(codedInputStream.readMessage(C7881g.parser(), extensionRegistryLite));
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
                if (f19933g == null) {
                    synchronized (C7879f.class) {
                        if (f19933g == null) {
                            f19933g = new DefaultInstanceBasedParser(f19932f);
                        }
                    }
                }
                return f19933g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19932f;
    }

    public C7881g getPlacesBySource(int i) {
        return (C7881g) this.f19934e.get(i);
    }

    public int getPlacesBySourceCount() {
        return this.f19934e.size();
    }

    public List<C7881g> getPlacesBySourceList() {
        return this.f19934e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f19934e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19934e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f19934e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f19934e.get(i));
        }
    }
}
