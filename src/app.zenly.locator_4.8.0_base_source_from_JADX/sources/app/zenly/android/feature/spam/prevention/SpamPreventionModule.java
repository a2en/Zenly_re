package app.zenly.android.feature.spam.prevention;

import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.spam.prevention.repository.SpamPreventionRepository;

public interface SpamPreventionModule {
    AvatarLoader provideAvatarLoader();

    SpamPreventionRepository provideSpamPreventionRepository();
}
