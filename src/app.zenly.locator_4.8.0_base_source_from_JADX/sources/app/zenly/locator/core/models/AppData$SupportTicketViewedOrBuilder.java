package app.zenly.locator.core.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

public interface AppData$SupportTicketViewedOrBuilder extends MessageLiteOrBuilder {
    String getId();

    ByteString getIdBytes();

    Timestamp getViewedAt();

    boolean hasViewedAt();
}
