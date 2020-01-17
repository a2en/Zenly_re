package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.widget.C0252e0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0524e;
import androidx.core.app.TaskStackBuilder;
import androidx.core.app.TaskStackBuilder.SupportParentable;
import androidx.fragment.app.FragmentActivity;

public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, SupportParentable, ActionBarDrawerToggle$DelegateProvider {
    private C0124b mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo414a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        getDelegate().mo410a(context);
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo297a()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo299a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo403a(i);
    }

    public C0124b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0124b.m364a((Activity) this, (AppCompatCallback) this);
        }
        return this.mDelegate;
    }

    public ActionBarDrawerToggle$Delegate getDrawerToggleDelegate() {
        return getDelegate().mo405a();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo428c();
    }

    public Resources getResources() {
        if (this.mResources == null && C0252e0.m988b()) {
            this.mResources = new C0252e0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo432d();
    }

    public Intent getSupportParentActivityIntent() {
        return C0524e.m2469a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo436f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo411a(configuration);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0124b delegate = getDelegate();
        delegate.mo434e();
        delegate.mo412a(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.mo3021a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo439g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo303c() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo424b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo440h();
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo430c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().mo442i();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo445j();
    }

    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            TaskStackBuilder a = TaskStackBuilder.m2443a((Context) this);
            onCreateSupportNavigateUpTaskStack(a);
            onPrepareSupportNavigateUpTaskStack(a);
            a.mo3024a();
            try {
                ActivityCompat.m2346a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo419a(charSequence);
    }

    public ActionMode onWindowStartingSupportActionMode(Callback callback) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo309g()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        getDelegate().mo429c(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo418a(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo433d(i);
    }

    public ActionMode startSupportActionMode(Callback callback) {
        return getDelegate().mo408a(callback);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo436f();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0524e.m2471a((Activity) this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo426b(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0524e.m2474b((Activity) this, intent);
    }

    public AppCompatActivity(int i) {
        super(i);
    }

    public void setContentView(View view) {
        getDelegate().mo413a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo425b(view, layoutParams);
    }
}
