package app.zenly.android.feature.descendants;

import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.descendants.feedback.C1380a;
import app.zenly.android.feature.descendants.feedback.C1381b;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs;
import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import com.bumptech.glide.C8867j;

public interface DescendantsModule {
    AvatarLoader provideAvatarLoader();

    C1380a provideDescendantsActionInterceptor();

    C1381b provideDescendantsNewCountInterceptor();

    DescendantsPrefs provideDescendantsPrefs();

    DescendantsRepository provideDescendantsRepository();

    C8867j provideGlide();

    Navigation provideNavigation();

    Time provideTime();
}
