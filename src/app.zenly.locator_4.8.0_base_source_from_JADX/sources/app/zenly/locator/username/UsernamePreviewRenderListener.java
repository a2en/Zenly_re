package app.zenly.locator.username;

import java.io.File;

public interface UsernamePreviewRenderListener {
    void onCancel();

    void onError();

    void onProgress(float f);

    void onSuccess(File file);
}
