package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.CRUDProto$CRUDOperationMessageOrBuilder */
public interface CRUDProto$CRUDOperationMessageOrBuilder extends MessageLiteOrBuilder {
    ByteString getData();

    FieldMask getMask();

    C7280e getOp();

    int getOpValue();

    boolean hasMask();
}
