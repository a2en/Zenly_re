package p213co.znly.models.services;

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
import p213co.znly.models.services.C8056f0.C8057a;

/* renamed from: co.znly.models.services.g0 */
public final class C8072g0 extends GeneratedMessageLite<C8072g0, C8073a> implements ZendeskProto$ZendeskGetProblemCategoriesResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8072g0 f20466h = new C8072g0();

    /* renamed from: i */
    private static volatile Parser<C8072g0> f20467i;

    /* renamed from: e */
    private int f20468e;

    /* renamed from: f */
    private ProtobufList<C8363x> f20469f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C8056f0 f20470g;

    /* renamed from: co.znly.models.services.g0$a */
    public static final class C8073a extends Builder<C8072g0, C8073a> implements ZendeskProto$ZendeskGetProblemCategoriesResponseOrBuilder {
        /* synthetic */ C8073a(C8344w wVar) {
            this();
        }

        public C8363x getCategories(int i) {
            return ((C8072g0) this.instance).getCategories(i);
        }

        public int getCategoriesCount() {
            return ((C8072g0) this.instance).getCategoriesCount();
        }

        public List<C8363x> getCategoriesList() {
            return Collections.unmodifiableList(((C8072g0) this.instance).getCategoriesList());
        }

        public C8056f0 getError() {
            return ((C8072g0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8072g0) this.instance).hasError();
        }

        private C8073a() {
            super(C8072g0.f20466h);
        }
    }

    static {
        f20466h.makeImmutable();
    }

    private C8072g0() {
    }

    public static C8073a newBuilder() {
        return (C8073a) f20466h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8072g0();
            case 2:
                return f20466h;
            case 3:
                this.f20469f.makeImmutable();
                return null;
            case 4:
                return new C8073a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8072g0 g0Var = (C8072g0) obj2;
                this.f20469f = visitor.visitList(this.f20469f, g0Var.f20469f);
                this.f20470g = (C8056f0) visitor.visitMessage(this.f20470g, g0Var.f20470g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20468e |= g0Var.f20468e;
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
                                if (!this.f20469f.isModifiable()) {
                                    this.f20469f = GeneratedMessageLite.mutableCopy(this.f20469f);
                                }
                                this.f20469f.add(codedInputStream.readMessage(C8363x.parser(), extensionRegistryLite));
                            } else if (readTag == 1010) {
                                Builder builder = this.f20470g != null ? (C8057a) this.f20470g.toBuilder() : null;
                                this.f20470g = (C8056f0) codedInputStream.readMessage(C8056f0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20470g);
                                    this.f20470g = (C8056f0) builder.buildPartial();
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
                if (f20467i == null) {
                    synchronized (C8072g0.class) {
                        if (f20467i == null) {
                            f20467i = new DefaultInstanceBasedParser(f20466h);
                        }
                    }
                }
                return f20467i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20466h;
    }

    public C8363x getCategories(int i) {
        return (C8363x) this.f20469f.get(i);
    }

    public int getCategoriesCount() {
        return this.f20469f.size();
    }

    public List<C8363x> getCategoriesList() {
        return this.f20469f;
    }

    public C8056f0 getError() {
        C8056f0 f0Var = this.f20470g;
        return f0Var == null ? C8056f0.getDefaultInstance() : f0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20469f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20469f.get(i3));
        }
        if (this.f20470g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20470g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20469f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20469f.get(i));
        }
        if (this.f20470g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
