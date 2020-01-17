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
import p213co.znly.models.services.C8022d0.C8023a;

/* renamed from: co.znly.models.services.e0 */
public final class C8040e0 extends GeneratedMessageLite<C8040e0, C8041a> implements ZendeskProto$ZendeskGetFeedbackCategoriesResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8040e0 f20399h = new C8040e0();

    /* renamed from: i */
    private static volatile Parser<C8040e0> f20400i;

    /* renamed from: e */
    private int f20401e;

    /* renamed from: f */
    private ProtobufList<C8363x> f20402f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C8022d0 f20403g;

    /* renamed from: co.znly.models.services.e0$a */
    public static final class C8041a extends Builder<C8040e0, C8041a> implements ZendeskProto$ZendeskGetFeedbackCategoriesResponseOrBuilder {
        /* synthetic */ C8041a(C8344w wVar) {
            this();
        }

        public C8363x getCategories(int i) {
            return ((C8040e0) this.instance).getCategories(i);
        }

        public int getCategoriesCount() {
            return ((C8040e0) this.instance).getCategoriesCount();
        }

        public List<C8363x> getCategoriesList() {
            return Collections.unmodifiableList(((C8040e0) this.instance).getCategoriesList());
        }

        public C8022d0 getError() {
            return ((C8040e0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8040e0) this.instance).hasError();
        }

        private C8041a() {
            super(C8040e0.f20399h);
        }
    }

    static {
        f20399h.makeImmutable();
    }

    private C8040e0() {
    }

    public static C8041a newBuilder() {
        return (C8041a) f20399h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8040e0();
            case 2:
                return f20399h;
            case 3:
                this.f20402f.makeImmutable();
                return null;
            case 4:
                return new C8041a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8040e0 e0Var = (C8040e0) obj2;
                this.f20402f = visitor.visitList(this.f20402f, e0Var.f20402f);
                this.f20403g = (C8022d0) visitor.visitMessage(this.f20403g, e0Var.f20403g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20401e |= e0Var.f20401e;
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
                                if (!this.f20402f.isModifiable()) {
                                    this.f20402f = GeneratedMessageLite.mutableCopy(this.f20402f);
                                }
                                this.f20402f.add(codedInputStream.readMessage(C8363x.parser(), extensionRegistryLite));
                            } else if (readTag == 1010) {
                                Builder builder = this.f20403g != null ? (C8023a) this.f20403g.toBuilder() : null;
                                this.f20403g = (C8022d0) codedInputStream.readMessage(C8022d0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20403g);
                                    this.f20403g = (C8022d0) builder.buildPartial();
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
                if (f20400i == null) {
                    synchronized (C8040e0.class) {
                        if (f20400i == null) {
                            f20400i = new DefaultInstanceBasedParser(f20399h);
                        }
                    }
                }
                return f20400i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20399h;
    }

    public C8363x getCategories(int i) {
        return (C8363x) this.f20402f.get(i);
    }

    public int getCategoriesCount() {
        return this.f20402f.size();
    }

    public List<C8363x> getCategoriesList() {
        return this.f20402f;
    }

    public C8022d0 getError() {
        C8022d0 d0Var = this.f20403g;
        return d0Var == null ? C8022d0.getDefaultInstance() : d0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20402f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20402f.get(i3));
        }
        if (this.f20403g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20403g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20402f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20402f.get(i));
        }
        if (this.f20403g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
