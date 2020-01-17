package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.TypesProto$CurrentSongInfoOrBuilder */
public interface TypesProto$CurrentSongInfoOrBuilder extends MessageLiteOrBuilder {
    String getAlbum();

    ByteString getAlbumBytes();

    String getArtist();

    ByteString getArtistBytes();

    C7070c2 getState();

    int getStateValue();

    String getTrack();

    ByteString getTrackBytes();
}
