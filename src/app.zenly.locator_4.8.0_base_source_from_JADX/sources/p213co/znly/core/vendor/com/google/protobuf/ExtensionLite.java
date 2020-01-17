package p213co.znly.core.vendor.com.google.protobuf;

import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;

/* renamed from: co.znly.core.vendor.com.google.protobuf.ExtensionLite */
public abstract class ExtensionLite<ContainingType extends MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract FieldType getLiteType();

    public abstract MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    /* access modifiers changed from: 0000 */
    public boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
