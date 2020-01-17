package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.UploadProto$UploadOrBuilder */
public interface UploadProto$UploadOrBuilder extends MessageLiteOrBuilder {
    Timestamp getDeadline();

    String getFilepath();

    ByteString getFilepathBytes();

    C7260y2 getHeaders(int i);

    int getHeadersCount();

    List<C7260y2> getHeadersList();

    String getMethod();

    ByteString getMethodBytes();

    C7054a3 getStatus();

    int getStatusValue();

    long getTaskId();

    String getUrl();

    ByteString getUrlBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasDeadline();
}
