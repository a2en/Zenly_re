package p213co.znly.models.verify;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8442b;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8445d;

/* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfoOrBuilder */
public interface VerifyInfoProto$VerifyInfoOrBuilder extends MessageLiteOrBuilder {
    Duration getActionInnervation();

    C8442b getAutomaticEvents(int i);

    int getAutomaticEventsCount();

    List<C8442b> getAutomaticEventsList();

    int getChallengeSize();

    C8454e getChallengeType();

    int getChallengeTypeValue();

    Timestamp getCreatedAt();

    Timestamp getExpireAt();

    boolean getHasExpired();

    Duration getNextEventTimer();

    int getNumberOfActionAvailable();

    C8449b getPossibleEventTypes(int i);

    int getPossibleEventTypesCount();

    List<C8449b> getPossibleEventTypesList();

    int getPossibleEventTypesValue(int i);

    List<Integer> getPossibleEventTypesValueList();

    int getTriesLeft();

    C8445d getVerificationMode();

    int getVerificationModeValue();

    boolean hasActionInnervation();

    boolean hasCreatedAt();

    boolean hasExpireAt();

    boolean hasNextEventTimer();
}
