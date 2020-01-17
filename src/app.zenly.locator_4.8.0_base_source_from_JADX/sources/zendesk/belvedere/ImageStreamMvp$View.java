package zendesk.belvedere;

import android.view.View.OnClickListener;
import java.util.List;

public interface ImageStreamMvp$View {
    void initViews(boolean z);

    void openMediaIntent(MediaIntent mediaIntent, ImageStream imageStream);

    boolean shouldShowFullScreen();

    void showDocumentMenuItem(OnClickListener onClickListener);

    void showGooglePhotosMenuItem(OnClickListener onClickListener);

    void showImageStream(List<MediaResult> list, List<MediaResult> list2, boolean z, boolean z2, C13496b bVar);

    void showToast(int i);

    void updateToolbarTitle(int i);
}
