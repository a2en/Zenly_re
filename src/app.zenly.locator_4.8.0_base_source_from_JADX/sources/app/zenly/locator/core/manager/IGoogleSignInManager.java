package app.zenly.locator.core.manager;

import android.app.Activity;
import android.content.Intent;
import app.zenly.locator.core.manager.IGoogleSignInManager.Session;
import p389io.reactivex.C12279e;

public interface IGoogleSignInManager<T extends Session> {

    public interface Session {
    }

    C12279e<T> getGoogleSignInStateObservable();

    Intent getSignInIntent();

    boolean isSignIn();

    void parseSignInResult(Intent intent);

    void signOut(Activity activity);
}
