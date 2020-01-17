package p213co.znly.models.tileserver;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.tileserver.VectorTileProto$Tile.C8421d;

/* renamed from: co.znly.models.tileserver.VectorTileProto$TileOrBuilder */
public interface VectorTileProto$TileOrBuilder extends MessageLiteOrBuilder {
    C8421d getLayers(int i);

    int getLayersCount();

    List<C8421d> getLayersList();
}
