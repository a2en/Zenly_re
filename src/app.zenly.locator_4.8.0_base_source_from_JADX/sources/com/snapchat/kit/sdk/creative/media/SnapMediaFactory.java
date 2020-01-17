package com.snapchat.kit.sdk.creative.media;

import android.media.MediaMetadataRetriever;
import com.snapchat.kit.sdk.creative.exceptions.SnapMediaSizeException;
import com.snapchat.kit.sdk.creative.exceptions.SnapStickerSizeException;
import com.snapchat.kit.sdk.creative.exceptions.SnapVideoLengthException;
import com.snapchat.kit.sdk.creative.p331c.C11827c;
import java.io.File;

public class SnapMediaFactory {

    /* renamed from: a */
    private final C11827c f30612a;

    SnapMediaFactory(C11827c cVar) {
        this.f30612a = cVar;
    }

    public SnapPhotoFile getSnapPhotoFromFile(File file) throws SnapMediaSizeException {
        if (file.length() <= 15728640) {
            return new SnapPhotoFile(file);
        }
        this.f30612a.mo34967a("exceptionMediaSize", 1);
        throw new SnapMediaSizeException("Media file size should be <15MB");
    }

    public SnapSticker getSnapStickerFromFile(File file) throws SnapStickerSizeException {
        if (file.length() <= 1048576) {
            return new SnapSticker(file);
        }
        this.f30612a.mo34967a("exceptionStickerSize", 1);
        throw new SnapStickerSizeException("Sticker file size should be under 1MB");
    }

    public SnapVideoFile getSnapVideoFromFile(File file) throws SnapMediaSizeException, SnapVideoLengthException {
        long length = file.length();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.getPath());
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        if (Integer.valueOf(extractMetadata).intValue() > 15000) {
            this.f30612a.mo34967a("exceptionVideoLength", 1);
            throw new SnapVideoLengthException("Video must be <15s long");
        } else if (length <= 15728640) {
            this.f30612a.mo34968b("videoLength", Long.valueOf(extractMetadata).longValue());
            return new SnapVideoFile(file);
        } else {
            this.f30612a.mo34967a("exceptionMediaSize", 1);
            throw new SnapMediaSizeException("Media file size should be <15MB");
        }
    }
}
