package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZendeskProto$ZendeskTicketOrBuilder */
public interface ZendeskProto$ZendeskTicketOrBuilder extends MessageLiteOrBuilder {
    C7991b0 getFields(int i);

    int getFieldsCount();

    List<C7991b0> getFieldsList();

    long getFormID();

    String getMessage();

    ByteString getMessageBytes();

    String getSubject();

    ByteString getSubjectBytes();
}
