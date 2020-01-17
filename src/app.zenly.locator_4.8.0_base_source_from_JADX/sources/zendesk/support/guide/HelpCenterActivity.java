package zendesk.support.guide;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.OnQueryTextListener;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.zendesk.logger.Logger;
import java.util.List;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12139i;
import p333g.p384h.p385a.C12140j;
import p333g.p384h.p385a.C12141k;
import zendesk.commonui.C13561l;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListActivity;

public class HelpCenterActivity extends AppCompatActivity implements HelpCenterMvp$View {
    private FloatingActionButton contactUsButton;
    private MenuItem conversationsMenuItem;
    /* access modifiers changed from: private */
    public Snackbar errorSnackbar;
    HelpCenterProvider helpCenterProvider;
    private HelpCenterUiConfig helpCenterUiConfig;
    private View loadingView;
    NetworkInfoProvider networkInfoProvider;
    /* access modifiers changed from: private */
    public HelpCenterMvp$Presenter presenter;
    private MenuItem searchViewMenuItem;
    SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public SnackbarStatus snackbarStatus = SnackbarStatus.NONE;

    /* renamed from: zendesk.support.guide.HelpCenterActivity$5 */
    static /* synthetic */ class C137035 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = new int[HelpCenterMvp$ErrorType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.support.guide.HelpCenterMvp$ErrorType[] r0 = zendesk.support.guide.HelpCenterMvp$ErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = r0
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp$ErrorType.CATEGORY_LOAD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp$ErrorType.SECTION_LOAD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp$ErrorType.ARTICLES_LOAD     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.HelpCenterActivity.C137035.<clinit>():void");
        }
    }

    private enum SnackbarStatus {
        NO_CONNECTION,
        NONE,
        CONTENT_ERROR
    }

    private void addFragment(Fragment fragment) {
        C0819o b = getSupportFragmentManager().mo4084b();
        b.mo4312a(C12136f.fragment_container, fragment, fragment.getClass().getSimpleName());
        b.mo4176a();
    }

    private void addOnBackStackChangedListener() {
        getSupportFragmentManager().mo4072a((OnBackStackChangedListener) new OnBackStackChangedListener() {
            public void onBackStackChanged() {
                if (HelpCenterActivity.this.getCurrentFragment().isHidden()) {
                    C0819o b = HelpCenterActivity.this.getSupportFragmentManager().mo4084b();
                    b.mo4196f(HelpCenterActivity.this.getCurrentFragment());
                    b.mo4176a();
                    if (HelpCenterActivity.this.getCurrentFragment() instanceof HelpCenterFragment) {
                        ((HelpCenterFragment) HelpCenterActivity.this.getCurrentFragment()).setPresenter(HelpCenterActivity.this.presenter);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public Fragment getCurrentFragment() {
        return getSupportFragmentManager().mo4058a(C12136f.fragment_container);
    }

    private HelpSearchFragment getSearchFragment() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            Logger.m31608a("HelpCenterActivity", "showSearchResults: current fragment is a HelpSearchFragment", new Object[0]);
            return (HelpSearchFragment) getCurrentFragment();
        }
        HelpSearchFragment newInstance = HelpSearchFragment.newInstance(this.helpCenterUiConfig, this.helpCenterProvider);
        C0819o b = getSupportFragmentManager().mo4084b();
        b.mo4320b(C12136f.fragment_container, newInstance);
        b.mo4317a((String) null);
        b.mo4176a();
        return newInstance;
    }

    private ActionBar initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(C12136f.support_toolbar);
        if (VERSION.SDK_INT >= 21) {
            findViewById(C12136f.support_compat_shadow).setVisibility(8);
        }
        setSupportActionBar(toolbar);
        return getSupportActionBar();
    }

    private boolean noFragmentAdded() {
        return getCurrentFragment() == null;
    }

    public void announceContentLoaded() {
        this.contactUsButton.announceForAccessibility(getString(C12140j.zs_help_center_content_loaded_accessibility));
    }

    public void clearSearchResults() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            ((HelpSearchFragment) getCurrentFragment()).clearResults();
        }
    }

    public void dismissError() {
        Snackbar snackbar = this.errorSnackbar;
        if (snackbar != null) {
            snackbar.mo31263b();
        }
        this.snackbarStatus = SnackbarStatus.NONE;
    }

    public void exitActivity() {
        finish();
    }

    public Context getContext() {
        return getApplicationContext();
    }

    public void hideLoadingState() {
        this.loadingView.setVisibility(8);
    }

    public boolean isShowingHelp() {
        return getCurrentFragment() instanceof HelpCenterFragment;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Theme theme = getTheme();
        theme.applyStyle(C12141k.ZendeskActivityDefaultTheme, true);
        theme.applyStyle(C12141k.ZendeskSupportActivityThemeDefaultIcon, false);
        setContentView(C12138h.zs_activity_help_center);
        String str = "HelpCenterActivity";
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.m31610b(str, "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Support.INSTANCE.init(...) was called ", new Object[0]);
            finish();
            return;
        }
        this.helpCenterUiConfig = (HelpCenterUiConfig) C13561l.m35892a(getIntent().getExtras(), HelpCenterUiConfig.class);
        if (this.helpCenterUiConfig == null) {
            Logger.m31610b(str, "No configuration found. Please use HelpCenterActivity.builder()", new Object[0]);
            finish();
            return;
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
        initToolbar().mo304c(true);
        this.loadingView = findViewById(C12136f.loading_view);
        this.contactUsButton = (FloatingActionButton) findViewById(C12136f.contact_us_button);
        this.contactUsButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                HelpCenterActivity.this.showContactZendesk();
            }
        });
        this.presenter = new HelpCenterPresenter(this, new HelpCenterModel(this.helpCenterProvider, this.settingsProvider), this.networkInfoProvider);
        this.presenter.init(this.helpCenterUiConfig);
        addOnBackStackChangedListener();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C12139i.zs_fragment_help_menu_conversations, menu);
        this.conversationsMenuItem = menu.findItem(C12136f.fragment_help_menu_contact);
        this.searchViewMenuItem = menu.findItem(C12136f.fragment_help_menu_search);
        if (this.searchViewMenuItem != null) {
            if (!this.networkInfoProvider.isNetworkAvailable()) {
                this.searchViewMenuItem.setEnabled(false);
            }
            SearchView searchView = (SearchView) this.searchViewMenuItem.getActionView();
            searchView.setImeOptions(searchView.getImeOptions() | 268435456);
            searchView.setOnQueryTextListener(new OnQueryTextListener() {
                public boolean onQueryTextChange(String str) {
                    return false;
                }

                public boolean onQueryTextSubmit(String str) {
                    if (HelpCenterActivity.this.presenter == null) {
                        return false;
                    }
                    HelpCenterActivity.this.presenter.onSearchSubmit(str);
                    return true;
                }
            });
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != C12136f.fragment_help_menu_contact) {
            return false;
        } else {
            showRequestList();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            helpCenterMvp$Presenter.onPause();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            MenuItem menuItem = this.searchViewMenuItem;
            if (menuItem != null) {
                menuItem.setVisible(helpCenterMvp$Presenter.shouldShowSearchMenuItem());
            }
        }
        HelpCenterMvp$Presenter helpCenterMvp$Presenter2 = this.presenter;
        if (helpCenterMvp$Presenter2 != null) {
            MenuItem menuItem2 = this.conversationsMenuItem;
            if (menuItem2 != null) {
                menuItem2.setVisible(helpCenterMvp$Presenter2.shouldShowConversationsMenuItem());
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            helpCenterMvp$Presenter.onResume(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.snackbarStatus != SnackbarStatus.NONE) {
            Snackbar snackbar = this.errorSnackbar;
            if (snackbar != null) {
                snackbar.mo31275k();
            }
        }
    }

    public void setSearchEnabled(boolean z) {
        this.searchViewMenuItem.setEnabled(z);
    }

    public void showContactUsButton() {
        this.contactUsButton.setVisibility(0);
    }

    public void showContactZendesk() {
        RequestActivity.builder().show((Context) this, this.helpCenterUiConfig.getUiConfigs());
    }

    public void showHelp(HelpCenterUiConfig helpCenterUiConfig2) {
        if (noFragmentAdded()) {
            HelpCenterFragment newInstance = HelpCenterFragment.newInstance(helpCenterUiConfig2);
            newInstance.setPresenter(this.presenter);
            addFragment(newInstance);
        } else if (getCurrentFragment() instanceof HelpCenterFragment) {
            ((HelpCenterFragment) getCurrentFragment()).setPresenter(this.presenter);
        }
        invalidateOptionsMenu();
    }

    public void showLoadArticleErrorWithRetry(HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, final RetryAction retryAction) {
        String str;
        String str2 = "HelpCenterActivity";
        if (helpCenterMvp$ErrorType == null) {
            Logger.m31614d(str2, "ErrorType was null, falling back to 'retry' as label", new Object[0]);
            str = getString(C12140j.zendesk_retry_button_label);
        } else {
            int i = C137035.$SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[helpCenterMvp$ErrorType.ordinal()];
            if (i == 1) {
                str = getString(C12140j.support_categories_list_fragment_error_message);
            } else if (i == 2) {
                str = getString(C12140j.support_sections_list_fragment_error_message);
            } else if (i != 3) {
                Logger.m31614d(str2, "Unknown or unhandled error type, falling back to error type name as label", new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append(getString(C12140j.support_help_search_no_results_label));
                sb.append(" ");
                sb.append(helpCenterMvp$ErrorType.name());
                str = sb.toString();
            } else {
                str = getString(C12140j.support_articles_list_fragment_error_message);
            }
        }
        if (this.snackbarStatus == SnackbarStatus.NONE) {
            this.errorSnackbar = Snackbar.m27827a((View) this.contactUsButton, (CharSequence) str, -2);
            this.errorSnackbar.mo31302a(C12140j.zendesk_retry_button_label, (OnClickListener) new OnClickListener() {
                public void onClick(View view) {
                    HelpCenterActivity.this.errorSnackbar.mo31263b();
                    HelpCenterActivity.this.snackbarStatus = SnackbarStatus.NONE;
                    retryAction.onRetry();
                }
            });
            this.errorSnackbar.mo31275k();
            this.snackbarStatus = SnackbarStatus.CONTENT_ERROR;
        }
    }

    public void showLoadingState() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.isVisible()) {
            C0819o b = getSupportFragmentManager().mo4084b();
            b.mo4190c(getCurrentFragment());
            b.mo4176a();
        }
        this.loadingView.setVisibility(0);
    }

    public void showNoConnectionError() {
        if (this.snackbarStatus != SnackbarStatus.NO_CONNECTION) {
            this.errorSnackbar = Snackbar.m27826a((View) this.contactUsButton, C12140j.zendesk_no_connectivity_error, -2);
            this.errorSnackbar.mo31275k();
            this.snackbarStatus = SnackbarStatus.NO_CONNECTION;
        }
    }

    public void showRequestList() {
        RequestListActivity.builder().show(this, this.helpCenterUiConfig.getUiConfigs());
    }

    public void showSearchResults(List<SearchArticle> list, String str) {
        getSearchFragment().updateResults(list, str);
    }
}
