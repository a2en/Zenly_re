package p213co.znly.wakeup;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.wakeup.WakeupProto$WatchAndWakeupUserOrBuilder */
public interface WakeupProto$WatchAndWakeupUserOrBuilder extends MessageLiteOrBuilder {
    String getUserUuid();

    ByteString getUserUuidBytes();

    String getWatcher();

    ByteString getWatcherBytes();

    Duration getWatcherTimeout();

    boolean hasWatcherTimeout();
}
