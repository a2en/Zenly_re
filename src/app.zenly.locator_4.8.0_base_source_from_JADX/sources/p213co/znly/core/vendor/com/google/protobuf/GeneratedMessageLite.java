package p213co.znly.core.vendor.com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p213co.znly.core.vendor.com.google.protobuf.FieldSet.FieldDescriptorLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.Internal.BooleanList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.DoubleList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.FloatList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.LongList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.JavaType;

/* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    protected int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$1 */
    static /* synthetic */ class C66841 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = new int[JavaType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                co.znly.core.vendor.com.google.protobuf.WireFormat$JavaType[] r0 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$WireFormat$JavaType = r0
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.WireFormat$JavaType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.WireFormat$JavaType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.C66841.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$Builder */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        protected Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (GeneratedMessageLite) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* access modifiers changed from: protected */
        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                messagetype.visit(MergeFromVisitor.INSTANCE, this.instance);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
        }

        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final BuilderType clear() {
            this.instance = (GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        /* access modifiers changed from: protected */
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom(messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            this.instance.visit(MergeFromVisitor.INSTANCE, messagetype);
            return this;
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                this.instance.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, codedInputStream, extensionRegistryLite);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser */
    protected static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        private T defaultInstance;

        public DefaultInstanceBasedParser(T t) {
            this.defaultInstance = t;
        }

        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$EqualsVisitor */
    static class EqualsVisitor implements Visitor {
        static final EqualsVisitor INSTANCE = new EqualsVisitor();
        static final NotEqualsException NOT_EQUALS = new NotEqualsException();

        /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$EqualsVisitor$NotEqualsException */
        static final class NotEqualsException extends RuntimeException {
            NotEqualsException() {
            }
        }

        private EqualsVisitor() {
        }

        public boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw NOT_EQUALS;
        }

        public BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2) {
            if (booleanList.equals(booleanList2)) {
                return booleanList;
            }
            throw NOT_EQUALS;
        }

        public ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2 && byteString.equals(byteString2)) {
                return byteString;
            }
            throw NOT_EQUALS;
        }

        public double visitDouble(boolean z, double d, boolean z2, double d2) {
            if (z == z2 && d == d2) {
                return d;
            }
            throw NOT_EQUALS;
        }

        public DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2) {
            if (doubleList.equals(doubleList2)) {
                return doubleList;
            }
            throw NOT_EQUALS;
        }

        public FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2) {
            if (fieldSet.equals(fieldSet2)) {
                return fieldSet;
            }
            throw NOT_EQUALS;
        }

        public float visitFloat(boolean z, float f, boolean z2, float f2) {
            if (z == z2 && f == f2) {
                return f;
            }
            throw NOT_EQUALS;
        }

        public FloatList visitFloatList(FloatList floatList, FloatList floatList2) {
            if (floatList.equals(floatList2)) {
                return floatList;
            }
            throw NOT_EQUALS;
        }

        public int visitInt(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw NOT_EQUALS;
        }

        public IntList visitIntList(IntList intList, IntList intList2) {
            if (intList.equals(intList2)) {
                return intList;
            }
            throw NOT_EQUALS;
        }

        public LazyFieldLite visitLazyMessage(LazyFieldLite lazyFieldLite, LazyFieldLite lazyFieldLite2) {
            if (lazyFieldLite == null && lazyFieldLite2 == null) {
                return null;
            }
            if (lazyFieldLite == null || lazyFieldLite2 == null) {
                throw NOT_EQUALS;
            } else if (lazyFieldLite.equals(lazyFieldLite2)) {
                return lazyFieldLite;
            } else {
                throw NOT_EQUALS;
            }
        }

        public <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2) {
            if (protobufList.equals(protobufList2)) {
                return protobufList;
            }
            throw NOT_EQUALS;
        }

        public long visitLong(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw NOT_EQUALS;
        }

        public LongList visitLongList(LongList longList, LongList longList2) {
            if (longList.equals(longList2)) {
                return longList;
            }
            throw NOT_EQUALS;
        }

        public <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (mapFieldLite.equals(mapFieldLite2)) {
                return mapFieldLite;
            }
            throw NOT_EQUALS;
        }

        public <T extends MessageLite> T visitMessage(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw NOT_EQUALS;
            }
            ((GeneratedMessageLite) t).equals(this, t2);
            return t;
        }

        public Object visitOneofBoolean(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofByteString(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofDouble(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofFloat(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofInt(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofLazyMessage(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofLong(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public Object visitOneofMessage(boolean z, Object obj, Object obj2) {
            if (z && ((GeneratedMessageLite) obj).equals(this, (MessageLite) obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public void visitOneofNotSet(boolean z) {
            if (z) {
                throw NOT_EQUALS;
            }
        }

        public Object visitOneofString(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw NOT_EQUALS;
        }

        public String visitString(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw NOT_EQUALS;
        }

        public UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
            if (unknownFieldSetLite.equals(unknownFieldSetLite2)) {
                return unknownFieldSetLite;
            }
            throw NOT_EQUALS;
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtendableBuilder */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
            MessageType messagetype2 = this.instance;
            ((ExtendableMessage) messagetype2).extensions = ((ExtendableMessage) messagetype2).extensions.clone();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.addRepeatedField(access$200.descriptor, access$200.singularToFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.clearField(access$200.descriptor);
            return this;
        }

        /* access modifiers changed from: protected */
        public void copyOnWrite() {
            if (this.isBuilt) {
                super.copyOnWrite();
                MessageType messagetype = this.instance;
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        /* access modifiers changed from: 0000 */
        public void internalSetExtensionSet(FieldSet<ExtensionDescriptor> fieldSet) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = fieldSet;
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.setField(access$200.descriptor, access$200.toFieldSetType(type));
            return this;
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            return ((ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final MessageType buildPartial() {
            if (this.isBuilt) {
                return (ExtendableMessage) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.makeImmutable();
            return (ExtendableMessage) super.buildPartial();
        }

        public BuilderType clone() {
            return (ExtendableBuilder) super.clone();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i, Type type) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions.setRepeatedField(access$200.descriptor, i, access$200.singularToFieldSetType(type));
            return this;
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtendableMessage */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.newFieldSet();

        /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter */
        protected class ExtensionWriter {
            private final Iterator<Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Entry<ExtensionDescriptor, Object> next;

            /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C66841 r3) {
                this(z);
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Entry<ExtensionDescriptor, Object> entry = this.next;
                    if (entry != null && ((ExtensionDescriptor) entry.getKey()).getNumber() < i) {
                        ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.next.getKey();
                        if (!this.messageSetWireFormat || extensionDescriptor.getLiteJavaType() != JavaType.MESSAGE || extensionDescriptor.isRepeated()) {
                            FieldSet.writeField(extensionDescriptor, this.next.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.writeMessageSetExtension(extensionDescriptor.getNumber(), (MessageLite) this.next.getValue());
                        }
                        if (this.iter.hasNext()) {
                            this.next = (Entry) this.iter.next();
                        } else {
                            this.next = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private ExtensionWriter(boolean z) {
                this.iter = ExtendableMessage.this.extensions.iterator();
                if (this.iter.hasNext()) {
                    this.next = (Entry) this.iter.next();
                }
                this.messageSetWireFormat = z;
            }
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            Object field = this.extensions.getField(access$200.descriptor);
            if (field == null) {
                return access$200.defaultValue;
            }
            return access$200.fromFieldSetType(field);
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            return this.extensions.getRepeatedFieldCount(access$200.descriptor);
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            return this.extensions.hasField(access$200.descriptor);
        }

        /* access modifiers changed from: protected */
        public final void makeImmutable() {
            GeneratedMessageLite.super.makeImmutable();
            this.extensions.makeImmutable();
        }

        /* access modifiers changed from: protected */
        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mergeFrom(messagetype.extensions);
        }

        /* access modifiers changed from: protected */
        public ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter<>(this, false, null);
        }

        /* access modifiers changed from: protected */
        public ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter<>(this, true, null);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <MessageType extends p213co.znly.core.vendor.com.google.protobuf.MessageLite> boolean parseUnknownField(MessageType r7, p213co.znly.core.vendor.com.google.protobuf.CodedInputStream r8, p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.getTagWireType(r10)
                int r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.getTagFieldNumber(r10)
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$GeneratedExtension r7 = r9.findLiteExtensionByNumber(r7, r1)
                r2 = 0
                r3 = 1
                if (r7 != 0) goto L_0x0013
            L_0x0010:
                r0 = 1
            L_0x0011:
                r4 = 0
                goto L_0x003d
            L_0x0013:
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r4 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r4 = r4.getLiteType()
                int r4 = p213co.znly.core.vendor.com.google.protobuf.FieldSet.getWireFormatForFieldType(r4, r2)
                if (r0 != r4) goto L_0x0021
                r0 = 0
                goto L_0x0011
            L_0x0021:
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r4 = r7.descriptor
                boolean r5 = r4.isRepeated
                if (r5 == 0) goto L_0x0010
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r4 = r4.type
                boolean r4 = r4.isPackable()
                if (r4 == 0) goto L_0x0010
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r4 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r4 = r4.getLiteType()
                int r4 = p213co.znly.core.vendor.com.google.protobuf.FieldSet.getWireFormatForFieldType(r4, r3)
                if (r0 != r4) goto L_0x0010
                r0 = 0
                r4 = 1
            L_0x003d:
                if (r0 == 0) goto L_0x0044
                boolean r7 = r6.parseUnknownField(r10, r8)
                return r7
            L_0x0044:
                if (r4 == 0) goto L_0x0098
                int r9 = r8.readRawVarint32()
                int r9 = r8.pushLimit(r9)
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r10 = r10.getLiteType()
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r0 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.ENUM
                if (r10 != r0) goto L_0x007b
            L_0x0058:
                int r10 = r8.getBytesUntilLimit()
                if (r10 <= 0) goto L_0x0093
                int r10 = r8.readEnum()
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.Internal$EnumLiteMap r0 = r0.getEnumType()
                co.znly.core.vendor.com.google.protobuf.Internal$EnumLite r10 = r0.findValueByNumber(r10)
                if (r10 != 0) goto L_0x006f
                return r3
            L_0x006f:
                co.znly.core.vendor.com.google.protobuf.FieldSet<co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r6.extensions
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r7.descriptor
                java.lang.Object r10 = r7.singularToFieldSetType(r10)
                r0.addRepeatedField(r1, r10)
                goto L_0x0058
            L_0x007b:
                int r10 = r8.getBytesUntilLimit()
                if (r10 <= 0) goto L_0x0093
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r10 = r10.getLiteType()
                java.lang.Object r10 = p213co.znly.core.vendor.com.google.protobuf.FieldSet.readPrimitiveField(r8, r10, r2)
                co.znly.core.vendor.com.google.protobuf.FieldSet<co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r6.extensions
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r7.descriptor
                r0.addRepeatedField(r1, r10)
                goto L_0x007b
            L_0x0093:
                r8.popLimit(r9)
                goto L_0x0127
            L_0x0098:
                int[] r10 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.C66841.$SwitchMap$com$google$protobuf$WireFormat$JavaType
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                int r0 = r0.ordinal()
                r10 = r10[r0]
                if (r10 == r3) goto L_0x00cc
                r9 = 2
                if (r10 == r9) goto L_0x00b6
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r9 = r9.getLiteType()
                java.lang.Object r8 = p213co.znly.core.vendor.com.google.protobuf.FieldSet.readPrimitiveField(r8, r9, r2)
                goto L_0x0108
            L_0x00b6:
                int r8 = r8.readEnum()
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.Internal$EnumLiteMap r9 = r9.getEnumType()
                co.znly.core.vendor.com.google.protobuf.Internal$EnumLite r9 = r9.findValueByNumber(r8)
                if (r9 != 0) goto L_0x00ca
                r6.mergeVarintField(r1, r8)
                return r3
            L_0x00ca:
                r8 = r9
                goto L_0x0108
            L_0x00cc:
                r10 = 0
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                boolean r0 = r0.isRepeated()
                if (r0 != 0) goto L_0x00e5
                co.znly.core.vendor.com.google.protobuf.FieldSet<co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r6.extensions
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r7.descriptor
                java.lang.Object r0 = r0.getField(r1)
                co.znly.core.vendor.com.google.protobuf.MessageLite r0 = (p213co.znly.core.vendor.com.google.protobuf.MessageLite) r0
                if (r0 == 0) goto L_0x00e5
                co.znly.core.vendor.com.google.protobuf.MessageLite$Builder r10 = r0.toBuilder()
            L_0x00e5:
                if (r10 != 0) goto L_0x00ef
                co.znly.core.vendor.com.google.protobuf.MessageLite r10 = r7.getMessageDefaultInstance()
                co.znly.core.vendor.com.google.protobuf.MessageLite$Builder r10 = r10.newBuilderForType()
            L_0x00ef:
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r0 = r0.getLiteType()
                co.znly.core.vendor.com.google.protobuf.WireFormat$FieldType r1 = p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType.GROUP
                if (r0 != r1) goto L_0x0101
                int r0 = r7.getNumber()
                r8.readGroup(r0, r10, r9)
                goto L_0x0104
            L_0x0101:
                r8.readMessage(r10, r9)
            L_0x0104:
                co.znly.core.vendor.com.google.protobuf.MessageLite r8 = r10.build()
            L_0x0108:
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r7.descriptor
                boolean r9 = r9.isRepeated()
                if (r9 == 0) goto L_0x011c
                co.znly.core.vendor.com.google.protobuf.FieldSet<co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor> r9 = r6.extensions
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r7.descriptor
                java.lang.Object r7 = r7.singularToFieldSetType(r8)
                r9.addRepeatedField(r10, r7)
                goto L_0x0127
            L_0x011c:
                co.znly.core.vendor.com.google.protobuf.FieldSet<co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor> r9 = r6.extensions
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r7.descriptor
                java.lang.Object r7 = r7.singularToFieldSetType(r8)
                r9.setField(r10, r7)
            L_0x0127:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.ExtendableMessage.parseUnknownField(co.znly.core.vendor.com.google.protobuf.MessageLite, co.znly.core.vendor.com.google.protobuf.CodedInputStream, co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite, int):boolean");
        }

        /* access modifiers changed from: 0000 */
        public final void visit(Visitor visitor, MessageType messagetype) {
            GeneratedMessageLite.super.visit(visitor, messagetype);
            this.extensions = visitor.visitExtensions(this.extensions, messagetype.extensions);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            GeneratedExtension access$200 = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(access$200);
            return access$200.singularFromFieldSetType(this.extensions.getRepeatedField(access$200.descriptor, i));
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor */
    static final class ExtensionDescriptor implements FieldDescriptorLite<ExtensionDescriptor> {
        final EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final FieldType type;

        ExtensionDescriptor(EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        public EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        public JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        public FieldType getLiteType() {
            return this.type;
        }

        public int getNumber() {
            return this.number;
        }

        public p213co.znly.core.vendor.com.google.protobuf.MessageLite.Builder internalMergeFrom(p213co.znly.core.vendor.com.google.protobuf.MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        public boolean isPacked() {
            return this.isPacked;
        }

        public boolean isRepeated() {
            return this.isRepeated;
        }

        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$GeneratedExtension */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.getLiteType() == FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.containingTypeDefaultInstance = containingtype;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object singularFromFieldSetType : (List) obj) {
                arrayList.add(singularFromFieldSetType(singularFromFieldSetType));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public Type getDefaultValue() {
            return this.defaultValue;
        }

        public FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        /* access modifiers changed from: 0000 */
        public Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        /* access modifiers changed from: 0000 */
        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? Integer.valueOf(((EnumLite) obj).getNumber()) : obj;
        }

        /* access modifiers changed from: 0000 */
        public Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object singularToFieldSetType : (List) obj) {
                arrayList.add(singularToFieldSetType(singularToFieldSetType));
            }
            return arrayList;
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$HashCodeVisitor */
    private static class HashCodeVisitor implements Visitor {
        /* access modifiers changed from: private */
        public int hashCode;

        private HashCodeVisitor() {
            this.hashCode = 0;
        }

        public boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4) {
            this.hashCode = (this.hashCode * 53) + Internal.hashBoolean(z2);
            return z2;
        }

        public BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2) {
            this.hashCode = (this.hashCode * 53) + booleanList.hashCode();
            return booleanList;
        }

        public ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.hashCode = (this.hashCode * 53) + byteString.hashCode();
            return byteString;
        }

        public double visitDouble(boolean z, double d, boolean z2, double d2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(Double.doubleToLongBits(d));
            return d;
        }

        public DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2) {
            this.hashCode = (this.hashCode * 53) + doubleList.hashCode();
            return doubleList;
        }

        public FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2) {
            this.hashCode = (this.hashCode * 53) + fieldSet.hashCode();
            return fieldSet;
        }

        public float visitFloat(boolean z, float f, boolean z2, float f2) {
            this.hashCode = (this.hashCode * 53) + Float.floatToIntBits(f);
            return f;
        }

        public FloatList visitFloatList(FloatList floatList, FloatList floatList2) {
            this.hashCode = (this.hashCode * 53) + floatList.hashCode();
            return floatList;
        }

        public int visitInt(boolean z, int i, boolean z2, int i2) {
            this.hashCode = (this.hashCode * 53) + i;
            return i;
        }

        public IntList visitIntList(IntList intList, IntList intList2) {
            this.hashCode = (this.hashCode * 53) + intList.hashCode();
            return intList;
        }

        public LazyFieldLite visitLazyMessage(LazyFieldLite lazyFieldLite, LazyFieldLite lazyFieldLite2) {
            this.hashCode = (this.hashCode * 53) + (lazyFieldLite != null ? lazyFieldLite.hashCode() : 37);
            return lazyFieldLite;
        }

        public <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2) {
            this.hashCode = (this.hashCode * 53) + protobufList.hashCode();
            return protobufList;
        }

        public long visitLong(boolean z, long j, boolean z2, long j2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(j);
            return j;
        }

        public LongList visitLongList(LongList longList, LongList longList2) {
            this.hashCode = (this.hashCode * 53) + longList.hashCode();
            return longList;
        }

        public <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            this.hashCode = (this.hashCode * 53) + mapFieldLite.hashCode();
            return mapFieldLite;
        }

        public <T extends MessageLite> T visitMessage(T t, T t2) {
            int i = t != null ? t instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t).hashCode(this) : t.hashCode() : 37;
            this.hashCode = (this.hashCode * 53) + i;
            return t;
        }

        public Object visitOneofBoolean(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashBoolean(((Boolean) obj).booleanValue());
            return obj;
        }

        public Object visitOneofByteString(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + obj.hashCode();
            return obj;
        }

        public Object visitOneofDouble(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(Double.doubleToLongBits(((Double) obj).doubleValue()));
            return obj;
        }

        public Object visitOneofFloat(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Float.floatToIntBits(((Float) obj).floatValue());
            return obj;
        }

        public Object visitOneofInt(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + ((Integer) obj).intValue();
            return obj;
        }

        public Object visitOneofLazyMessage(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + obj.hashCode();
            return obj;
        }

        public Object visitOneofLong(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + Internal.hashLong(((Long) obj).longValue());
            return obj;
        }

        public Object visitOneofMessage(boolean z, Object obj, Object obj2) {
            return visitMessage((MessageLite) obj, (MessageLite) obj2);
        }

        public void visitOneofNotSet(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        public Object visitOneofString(boolean z, Object obj, Object obj2) {
            this.hashCode = (this.hashCode * 53) + obj.hashCode();
            return obj;
        }

        public String visitString(boolean z, String str, boolean z2, String str2) {
            this.hashCode = (this.hashCode * 53) + str.hashCode();
            return str;
        }

        public UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
            this.hashCode = (this.hashCode * 53) + unknownFieldSetLite.hashCode();
            return unknownFieldSetLite;
        }

        /* synthetic */ HashCodeVisitor(C66841 r1) {
            this();
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MergeFromVisitor */
    protected static class MergeFromVisitor implements Visitor {
        public static final MergeFromVisitor INSTANCE = new MergeFromVisitor();

        private MergeFromVisitor() {
        }

        public boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        public BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2) {
            int size = booleanList.size();
            int size2 = booleanList2.size();
            if (size > 0 && size2 > 0) {
                if (!booleanList.isModifiable()) {
                    booleanList = booleanList.mutableCopyWithCapacity(size2 + size);
                }
                booleanList.addAll(booleanList2);
            }
            return size > 0 ? booleanList : booleanList2;
        }

        public ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        public double visitDouble(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        public DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2) {
            int size = doubleList.size();
            int size2 = doubleList2.size();
            if (size > 0 && size2 > 0) {
                if (!doubleList.isModifiable()) {
                    doubleList = doubleList.mutableCopyWithCapacity(size2 + size);
                }
                doubleList.addAll(doubleList2);
            }
            return size > 0 ? doubleList : doubleList2;
        }

        public FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2) {
            if (fieldSet.isImmutable()) {
                fieldSet = fieldSet.clone();
            }
            fieldSet.mergeFrom(fieldSet2);
            return fieldSet;
        }

        public float visitFloat(boolean z, float f, boolean z2, float f2) {
            return z2 ? f2 : f;
        }

        public FloatList visitFloatList(FloatList floatList, FloatList floatList2) {
            int size = floatList.size();
            int size2 = floatList2.size();
            if (size > 0 && size2 > 0) {
                if (!floatList.isModifiable()) {
                    floatList = floatList.mutableCopyWithCapacity(size2 + size);
                }
                floatList.addAll(floatList2);
            }
            return size > 0 ? floatList : floatList2;
        }

        public int visitInt(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public IntList visitIntList(IntList intList, IntList intList2) {
            int size = intList.size();
            int size2 = intList2.size();
            if (size > 0 && size2 > 0) {
                if (!intList.isModifiable()) {
                    intList = intList.mutableCopyWithCapacity(size2 + size);
                }
                intList.addAll(intList2);
            }
            return size > 0 ? intList : intList2;
        }

        public LazyFieldLite visitLazyMessage(LazyFieldLite lazyFieldLite, LazyFieldLite lazyFieldLite2) {
            if (lazyFieldLite2 != null) {
                if (lazyFieldLite == null) {
                    lazyFieldLite = new LazyFieldLite();
                }
                lazyFieldLite.merge(lazyFieldLite2);
            }
            return lazyFieldLite;
        }

        public <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2) {
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            return size > 0 ? protobufList : protobufList2;
        }

        public long visitLong(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        public LongList visitLongList(LongList longList, LongList longList2) {
            int size = longList.size();
            int size2 = longList2.size();
            if (size > 0 && size2 > 0) {
                if (!longList.isModifiable()) {
                    longList = longList.mutableCopyWithCapacity(size2 + size);
                }
                longList.addAll(longList2);
            }
            return size > 0 ? longList : longList2;
        }

        public <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (!mapFieldLite2.isEmpty()) {
                if (!mapFieldLite.isMutable()) {
                    mapFieldLite = mapFieldLite.mutableCopy();
                }
                mapFieldLite.mergeFrom(mapFieldLite2);
            }
            return mapFieldLite;
        }

        public <T extends MessageLite> T visitMessage(T t, T t2) {
            if (t != null && t2 != null) {
                return t.toBuilder().mergeFrom((MessageLite) t2).build();
            }
            if (t == null) {
                t = t2;
            }
            return t;
        }

        public Object visitOneofBoolean(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofByteString(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofDouble(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofFloat(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofInt(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofLazyMessage(boolean z, Object obj, Object obj2) {
            LazyFieldLite lazyFieldLite = z ? (LazyFieldLite) obj : new LazyFieldLite();
            lazyFieldLite.merge((LazyFieldLite) obj2);
            return lazyFieldLite;
        }

        public Object visitOneofLong(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public Object visitOneofMessage(boolean z, Object obj, Object obj2) {
            return z ? visitMessage((MessageLite) obj, (MessageLite) obj2) : obj2;
        }

        public void visitOneofNotSet(boolean z) {
        }

        public Object visitOneofString(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public String visitString(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
            return unknownFieldSetLite2 == UnknownFieldSetLite.getDefaultInstance() ? unknownFieldSetLite : UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke */
    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$SerializedForm */
    protected static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final String messageClassName;

        SerializedForm(MessageLite messageLite) {
            this.messageClassName = messageLite.getClass().getName();
            this.asBytes = messageLite.toByteArray();
        }

        /* renamed from: of */
        public static SerializedForm m17511of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (ClassNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find proto buffer class: ");
                sb.append(this.messageClassName);
                throw new RuntimeException(sb.toString(), e);
            } catch (NoSuchFieldException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to find defaultInstance in ");
                sb2.append(this.messageClassName);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (SecurityException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to call defaultInstance in ");
                sb3.append(this.messageClassName);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        /* access modifiers changed from: protected */
        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (ClassNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find proto buffer class: ");
                sb.append(this.messageClassName);
                throw new RuntimeException(sb.toString(), e);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to call DEFAULT_INSTANCE in ");
                sb2.append(this.messageClassName);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$Visitor */
    protected interface Visitor {
        boolean visitBoolean(boolean z, boolean z2, boolean z3, boolean z4);

        BooleanList visitBooleanList(BooleanList booleanList, BooleanList booleanList2);

        ByteString visitByteString(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        double visitDouble(boolean z, double d, boolean z2, double d2);

        DoubleList visitDoubleList(DoubleList doubleList, DoubleList doubleList2);

        FieldSet<ExtensionDescriptor> visitExtensions(FieldSet<ExtensionDescriptor> fieldSet, FieldSet<ExtensionDescriptor> fieldSet2);

        float visitFloat(boolean z, float f, boolean z2, float f2);

        FloatList visitFloatList(FloatList floatList, FloatList floatList2);

        int visitInt(boolean z, int i, boolean z2, int i2);

        IntList visitIntList(IntList intList, IntList intList2);

        LazyFieldLite visitLazyMessage(LazyFieldLite lazyFieldLite, LazyFieldLite lazyFieldLite2);

        <T> ProtobufList<T> visitList(ProtobufList<T> protobufList, ProtobufList<T> protobufList2);

        long visitLong(boolean z, long j, boolean z2, long j2);

        LongList visitLongList(LongList longList, LongList longList2);

        <K, V> MapFieldLite<K, V> visitMap(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2);

        <T extends MessageLite> T visitMessage(T t, T t2);

        Object visitOneofBoolean(boolean z, Object obj, Object obj2);

        Object visitOneofByteString(boolean z, Object obj, Object obj2);

        Object visitOneofDouble(boolean z, Object obj, Object obj2);

        Object visitOneofFloat(boolean z, Object obj, Object obj2);

        Object visitOneofInt(boolean z, Object obj, Object obj2);

        Object visitOneofLazyMessage(boolean z, Object obj, Object obj2);

        Object visitOneofLong(boolean z, Object obj, Object obj2);

        Object visitOneofMessage(boolean z, Object obj, Object obj2);

        void visitOneofNotSet(boolean z);

        Object visitOneofString(boolean z, Object obj, Object obj2);

        String visitString(boolean z, String str, boolean z2, String str2);

        UnknownFieldSetLite visitUnknownFields(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2);
    }

    /* access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>, T> GeneratedExtension<MessageType, T> checkIsLite(ExtensionLite<MessageType, T> extensionLite) {
        if (extensionLite.isLite()) {
            return (GeneratedExtension) extensionLite;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    protected static BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    protected static DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    protected static FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    protected static IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    protected static LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    protected static <E> ProtobufList<E> emptyProtobufList() {
        return ProtobufArrayList.emptyList();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.newInstance();
        }
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Generated message class \"");
            sb.append(cls.getName());
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static IntList mutableCopy(IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, Class cls) {
        List emptyList = Collections.emptyList();
        ExtensionDescriptor extensionDescriptor = new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z);
        GeneratedExtension generatedExtension = new GeneratedExtension(containingtype, emptyList, messageLite, extensionDescriptor, cls);
        return generatedExtension;
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, Class cls) {
        ExtensionDescriptor extensionDescriptor = new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false);
        GeneratedExtension generatedExtension = new GeneratedExtension(containingtype, type, messageLite, extensionDescriptor, cls);
        return generatedExtension;
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(t, byteString, ExtensionRegistryLite.getEmptyRegistry()));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            CodedInputStream newInstance = CodedInputStream.newInstance((InputStream) new LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            T parsePartialFrom = parsePartialFrom(t, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return parsePartialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(parsePartialFrom);
            }
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            t2.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, codedInputStream, extensionRegistryLite);
            t2.makeImmutable();
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        try {
            visit(EqualsVisitor.INSTANCE, (GeneratedMessageLite) obj);
            return true;
        } catch (NotEqualsException unused) {
            return false;
        }
    }

    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int hashCode() {
        if (this.memoizedHashCode == 0) {
            HashCodeVisitor hashCodeVisitor = new HashCodeVisitor(null);
            visit(hashCodeVisitor, this);
            this.memoizedHashCode = hashCodeVisitor.hashCode;
        }
        return this.memoizedHashCode;
    }

    public final boolean isInitialized() {
        return dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    /* access modifiers changed from: protected */
    public void makeImmutable() {
        dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
        this.unknownFields.makeImmutable();
    }

    /* access modifiers changed from: protected */
    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, byteString);
    }

    /* access modifiers changed from: protected */
    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    /* access modifiers changed from: protected */
    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(int i, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, codedInputStream);
    }

    public String toString() {
        return MessageLiteToString.toString(this, super.toString());
    }

    /* access modifiers changed from: 0000 */
    public void visit(Visitor visitor, MessageType messagetype) {
        dynamicMethod(MethodToInvoke.VISIT, visitor, messagetype);
        this.unknownFields = visitor.visitUnknownFields(this.unknownFields, messagetype.unknownFields);
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        return t.dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null;
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> void makeImmutable(T t) {
        t.dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
    }

    protected static LongList mutableCopy(LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, byteString, extensionRegistryLite));
    }

    /* access modifiers changed from: 0000 */
    public boolean equals(EqualsVisitor equalsVisitor, MessageLite messageLite) {
        if (this == messageLite) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
            return false;
        }
        visit(equalsVisitor, (GeneratedMessageLite) messageLite);
        return true;
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, bArr, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static FloatList mutableCopy(FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, bArr, extensionRegistryLite));
    }

    /* access modifiers changed from: 0000 */
    public int hashCode(HashCodeVisitor hashCodeVisitor) {
        if (this.memoizedHashCode == 0) {
            int access$100 = hashCodeVisitor.hashCode;
            hashCodeVisitor.hashCode = 0;
            visit(hashCodeVisitor, this);
            this.memoizedHashCode = hashCodeVisitor.hashCode;
            hashCodeVisitor.hashCode = access$100;
        }
        return this.memoizedHashCode;
    }

    protected static DoubleList mutableCopy(DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parsePartialFrom(t, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T parsePartialFrom;
        try {
            CodedInputStream newCodedInput = byteString.newCodedInput();
            parsePartialFrom = parsePartialFrom(t, newCodedInput, extensionRegistryLite);
            newCodedInput.checkLastTagWas(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(parsePartialFrom);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    protected static BooleanList mutableCopy(BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <E> ProtobufList<E> mutableCopy(ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parseFrom(t, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T parsePartialFrom;
        try {
            CodedInputStream newInstance = CodedInputStream.newInstance(bArr);
            parsePartialFrom = parsePartialFrom(t, newInstance, extensionRegistryLite);
            newInstance.checkLastTagWas(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(parsePartialFrom);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, codedInputStream, extensionRegistryLite));
    }
}
