package zendesk.belvedere;

import java.util.List;

public interface ImageStreamMvp$Model {
    List<MediaResult> addToSelectedItems(MediaResult mediaResult);

    MediaIntent getCameraIntent();

    MediaIntent getDocumentIntent();

    MediaIntent getGooglePhotosIntent();

    List<MediaResult> getLatestImages();

    long getMaxFileSize();

    List<MediaResult> getSelectedMediaResults();

    boolean hasCameraIntent();

    boolean hasDocumentIntent();

    boolean hasGooglePhotosIntent();

    List<MediaResult> removeFromSelectedItems(MediaResult mediaResult);

    boolean showFullScreenOnly();
}
