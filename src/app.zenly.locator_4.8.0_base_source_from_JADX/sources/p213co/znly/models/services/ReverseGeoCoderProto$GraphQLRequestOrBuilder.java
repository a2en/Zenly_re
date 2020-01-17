package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$GraphQLRequestOrBuilder */
public interface ReverseGeoCoderProto$GraphQLRequestOrBuilder extends MessageLiteOrBuilder {
    String getQuery();

    ByteString getQueryBytes();

    C8115j getResponseFormat();

    int getResponseFormatValue();

    String getVariables(int i);

    ByteString getVariablesBytes(int i);

    int getVariablesCount();

    List<String> getVariablesList();
}
