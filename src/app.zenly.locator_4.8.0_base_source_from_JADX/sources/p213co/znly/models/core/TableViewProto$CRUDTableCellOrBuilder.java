package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;

/* renamed from: co.znly.models.core.TableViewProto$CRUDTableCellOrBuilder */
public interface TableViewProto$CRUDTableCellOrBuilder extends MessageLiteOrBuilder {
    int getAlreadyCompleted();

    TableViewProto$TableCell getCell();

    C7280e getOp();

    int getOpValue();

    int getSuggestedCompleted();

    boolean hasCell();
}
