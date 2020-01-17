package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p004os.C0564b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12007d;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12013c;
import com.zendesk.util.C12017g;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.List;
import java.util.Locale;
import okhttp3.C13167a0;
import okhttp3.C13321t;
import okhttp3.C13325v;
import okhttp3.C13331y.C13332a;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import p333g.p384h.p385a.C12141k;
import zendesk.commonui.C13561l;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.AggregatedCallback;
import zendesk.support.Article;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.AttachmentType;
import zendesk.support.HelpCenterAttachment;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskDeepLinkHelper;
import zendesk.support.guide.ArticleUiConfig.Builder;
import zendesk.support.request.RequestActivity;

public class ViewArticleActivity extends AppCompatActivity implements OnItemClickListener {
    private static final Integer NETWORK_AWARE_ID = Integer.valueOf(57564);
    /* access modifiers changed from: private */
    public ArticleAttachmentAdapter adapter;
    ApplicationConfiguration applicationConfiguration;
    /* access modifiers changed from: private */
    public ArticleViewModel article;
    private WebView articleContentWebView;
    /* access modifiers changed from: private */
    public Long articleId;
    ArticleVoteStorage articleVoteStorage;
    /* access modifiers changed from: private */
    public ArticleVotingView articleVotingView;
    /* access modifiers changed from: private */
    public ListView attachmentListView;
    private C12007d<List<HelpCenterAttachment>> attachmentRequestCallback;
    /* access modifiers changed from: private */
    public ArticleUiConfig config;
    /* access modifiers changed from: private */
    public CoordinatorLayout coordinatorLayout;
    ZendeskDeepLinkHelper deepLinkHelper;
    private final Handler handler = new Handler();
    HelpCenterProvider helpCenterProvider;
    private final NetworkAware networkConnectionCallbacks = new NetworkAware() {
        boolean connected = true;

        public void onNetworkAvailable() {
            if (NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this)) {
                ViewArticleActivity.this.dimissSnackBar();
                this.connected = true;
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        public void onNetworkUnavailable() {
            if (!NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this) && this.connected) {
                this.connected = false;
                ViewArticleActivity.this.dimissSnackBar();
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.snackbar = Snackbar.m27826a((View) viewArticleActivity.coordinatorLayout, C12140j.zendesk_no_connectivity_error, -2);
                ViewArticleActivity.this.snackbar.mo31275k();
            }
        }
    };
    NetworkInfoProvider networkInfoProvider;
    C13325v okHttpClient;
    private ProgressBar progressView;
    private final AggregatedCallback<SupportSdkSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    /* access modifiers changed from: private */
    public Snackbar snackbar;
    SupportSettingsProvider supportSettingsProvider;

    /* renamed from: zendesk.support.guide.ViewArticleActivity$8 */
    static /* synthetic */ class C137318 {

        /* renamed from: $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState */
        static final /* synthetic */ int[] f35205x84719a3e = new int[LoadingState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.support.guide.ViewArticleActivity$LoadingState[] r0 = zendesk.support.guide.ViewArticleActivity.LoadingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35205x84719a3e = r0
                int[] r0 = f35205x84719a3e     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f35205x84719a3e     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.DISPLAYING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f35205x84719a3e     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.ERRORED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ViewArticleActivity.C137318.<clinit>():void");
        }
    }

    private static class ArticleAttachmentAdapter extends ArrayAdapter<HelpCenterAttachment> {
        ArticleAttachmentAdapter(Context context) {
            super(context, C12138h.zs_row_article_attachment);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ArticleAttachmentRow articleAttachmentRow;
            if (view instanceof ArticleAttachmentRow) {
                articleAttachmentRow = (ArticleAttachmentRow) view;
            } else {
                articleAttachmentRow = new ArticleAttachmentRow(getContext());
            }
            articleAttachmentRow.bind((HelpCenterAttachment) getItem(i));
            return articleAttachmentRow;
        }
    }

    private static class ArticleAttachmentRow extends RelativeLayout {
        private final TextView mFileName = ((TextView) findViewById(C12136f.article_attachment_row_filename_text));
        private final TextView mFileSize = ((TextView) findViewById(C12136f.article_attachment_row_filesize_text));

        public ArticleAttachmentRow(Context context) {
            super(context);
            RelativeLayout.inflate(context, C12138h.zs_row_article_attachment, this);
        }

        public void bind(HelpCenterAttachment helpCenterAttachment) {
            this.mFileName.setText(helpCenterAttachment.getFileName());
            this.mFileSize.setText(C12013c.m31645a(helpCenterAttachment.getSize()));
        }
    }

    class AttachmentRequestCallback extends C12008e<List<HelpCenterAttachment>> {
        AttachmentRequestCallback() {
        }

        public void onError(ErrorResponse errorResponse) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            Logger.m31606a("ViewArticleActivity", errorResponse);
        }

        public void onSuccess(List<HelpCenterAttachment> list) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.adapter.addAll(list);
            ViewArticleActivity.setListViewHeightBasedOnChildren(ViewArticleActivity.this.attachmentListView);
            ViewArticleActivity.this.setLoadingState(LoadingState.DISPLAYING);
        }
    }

    private enum LoadingState {
        LOADING,
        DISPLAYING,
        ERRORED
    }

    /* access modifiers changed from: private */
    public void applyVoteButtonSettings() {
        loadSettings(new C12008e<SupportSdkSettings>() {
            public void onError(ErrorResponse errorResponse) {
                ViewArticleActivity.this.articleVotingView.setVisibility(8);
            }

            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings.isHelpCenterArticleVotingEnabled()) {
                    ViewArticleActivity.this.articleVotingView.setVisibility(0);
                } else {
                    ViewArticleActivity.this.articleVotingView.setVisibility(8);
                }
            }
        });
    }

    public static Builder builder(Article article2) {
        return new Builder(article2);
    }

    /* access modifiers changed from: private */
    public void dimissSnackBar() {
        Snackbar snackbar2 = this.snackbar;
        if (snackbar2 != null) {
            snackbar2.mo31263b();
            this.snackbar = null;
        }
    }

    /* access modifiers changed from: private */
    public void fetchArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getArticle(Long.valueOf(j), new C12008e<Article>() {
            public void onError(ErrorResponse errorResponse) {
                ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            }

            public void onSuccess(Article article) {
                ViewArticleActivity.this.article = new ArticleViewModel(article);
                ViewArticleActivity.this.loadArticleBody();
            }
        });
    }

    /* access modifiers changed from: private */
    public void fetchAttachmentsForArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getAttachments(Long.valueOf(j), AttachmentType.BLOCK, this.attachmentRequestCallback);
    }

    private ActionBar initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(C12136f.view_article_toolbar);
        if (VERSION.SDK_INT >= 21) {
            findViewById(C12136f.view_article_compat_shadow).setVisibility(8);
        }
        setSupportActionBar(toolbar);
        return getSupportActionBar();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public void loadArticleBody() {
        String str;
        setTitle(getString(C12140j.zs_view_article_loaded_accessibility, new Object[]{this.article.getTitle()}));
        setLoadingState(LoadingState.DISPLAYING);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo295a(UiUtils.decodeHtmlEntities(this.article.getTitle()));
        }
        String str2 = null;
        String authorName = this.article.getAuthorName();
        if (this.article.getCreatedAt() != null) {
            str2 = DateFormat.getDateInstance(1, C0564b.m2670a(getResources().getConfiguration()).mo3161a(0)).format(this.article.getCreatedAt());
        }
        if (str2 == null || authorName == null) {
            str = "";
        } else {
            str = String.format(Locale.US, "%s %s %s", new Object[]{authorName, getString(C12140j.view_article_seperator), str2});
        }
        this.articleContentWebView.loadDataWithBaseURL(this.applicationConfiguration.getZendeskUrl(), getString(C12140j.view_article_html_body, new Object[]{"file:///android_asset/help_center_article_style.css", this.article.getTitle(), this.article.getBody(), str}), "text/html", "UTF-8", null);
        this.handler.postDelayed(new Runnable() {
            public void run() {
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.fetchAttachmentsForArticle(viewArticleActivity.article.getId());
                ViewArticleActivity.this.applyVoteButtonSettings();
            }
        }, 250);
    }

    private void loadSettings(C12008e<SupportSdkSettings> eVar) {
        if (this.settingsAggregatedCallback.add(eVar)) {
            this.supportSettingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* access modifiers changed from: private */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter2 = listView.getAdapter();
        if (adapter2 != null) {
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
            View view = null;
            int i = 0;
            for (int i2 = 0; i2 < adapter2.getCount(); i2++) {
                view = adapter2.getView(i2, view, listView);
                if (i2 == 0) {
                    view.setLayoutParams(new LayoutParams(makeMeasureSpec, -2));
                }
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * (adapter2.getCount() - 1));
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }

    private void setupRequestInterceptor() {
        WebView webView = this.articleContentWebView;
        if (webView == null) {
            Logger.m31614d("ViewArticleActivity", "The webview is null. Make sure you initialise it before trying to add the interceptor", new Object[0]);
            return;
        }
        webView.setWebViewClient(new WebViewClient() {
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                String str2;
                InputStream inputStream;
                String str3;
                String zendeskUrl = ViewArticleActivity.this.applicationConfiguration.getZendeskUrl();
                String str4 = "ViewArticleActivity";
                if (C12017g.m31659c(zendeskUrl) || !str.startsWith(zendeskUrl)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Will not intercept request because the url is not hosted by Zendesk");
                    sb.append(str);
                    Logger.m31614d(str4, sb.toString(), new Object[0]);
                    return super.shouldInterceptRequest(webView, str);
                }
                String str5 = null;
                try {
                    C13332a aVar = new C13332a();
                    aVar.mo38402b(str);
                    C13167a0 execute = ViewArticleActivity.this.okHttpClient.newCall(aVar.mo38400a()).execute();
                    if (execute == null || !execute.mo37796g() || execute.mo37789a() == null) {
                        str2 = null;
                        inputStream = null;
                        return new WebResourceResponse(str5, str2, inputStream);
                    }
                    inputStream = execute.mo37789a().mo37823a();
                    try {
                        C13321t e = execute.mo37789a().mo37828e();
                        if (e != null) {
                            if (!C12017g.m31658b(e.mo38317c()) || !C12017g.m31658b(e.mo38316b())) {
                                str3 = null;
                            } else {
                                str3 = String.format(Locale.US, "%s/%s", new Object[]{e.mo38317c(), e.mo38316b()});
                            }
                            try {
                                Charset a = e.mo38314a();
                                if (a != null) {
                                    str5 = a.name();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                Logger.m31607a(str4, "Exception encountered when trying to intercept request", e, new Object[0]);
                                str2 = str5;
                                str5 = str3;
                                return new WebResourceResponse(str5, str2, inputStream);
                            }
                            str2 = str5;
                            str5 = str3;
                            return new WebResourceResponse(str5, str2, inputStream);
                        }
                        str2 = null;
                        return new WebResourceResponse(str5, str2, inputStream);
                    } catch (Exception e3) {
                        e = e3;
                        str3 = null;
                        Logger.m31607a(str4, "Exception encountered when trying to intercept request", e, new Object[0]);
                        str2 = str5;
                        str5 = str3;
                        return new WebResourceResponse(str5, str2, inputStream);
                    }
                } catch (Exception e4) {
                    e = e4;
                    inputStream = null;
                    str3 = null;
                    Logger.m31607a(str4, "Exception encountered when trying to intercept request", e, new Object[0]);
                    str2 = str5;
                    str5 = str3;
                    return new WebResourceResponse(str5, str2, inputStream);
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                return viewArticleActivity.deepLinkHelper.launch(str, viewArticleActivity.config, webView.getContext());
            }
        });
    }

    /* access modifiers changed from: private */
    public void startRequestActivity() {
        RequestActivity.builder().show((Context) this, this.config.getUiConfigs());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled", "RestrictedApi"})
    @TargetApi(21)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(C12141k.ZendeskActivityDefaultTheme, true);
        setContentView(C12138h.zs_activity_view_article);
        String str = "ViewArticleActivity";
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.m31610b(str, "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Support.INSTANCE.init(...) was called ", new Object[0]);
            finish();
            return;
        }
        ActionBar initToolbar = initToolbar();
        this.config = (ArticleUiConfig) C13561l.m35892a(getIntent().getExtras(), ArticleUiConfig.class);
        ArticleUiConfig articleUiConfig = this.config;
        if (articleUiConfig == null || articleUiConfig.getConfigurationState() == -1) {
            Logger.m31610b(str, "No configuration found. Please use ViewArticleActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.attachmentListView = (ListView) findViewById(C12136f.view_article_attachment_list);
        this.adapter = new ArticleAttachmentAdapter(this);
        this.attachmentListView.setAdapter(this.adapter);
        this.attachmentListView.setOnItemClickListener(this);
        if (initToolbar != null) {
            initToolbar.mo304c(true);
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
        this.articleContentWebView = (WebView) findViewById(C12136f.view_article_content_webview);
        this.articleContentWebView.setWebChromeClient(new WebChromeClient());
        this.articleContentWebView.getSettings().setJavaScriptEnabled(true);
        setupRequestInterceptor();
        if (VERSION.SDK_INT >= 21) {
            this.articleContentWebView.getSettings().setMixedContentMode(0);
        }
        if (VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        this.progressView = (ProgressBar) findViewById(C12136f.view_article_progress);
        this.coordinatorLayout = (CoordinatorLayout) findViewById(C12136f.view_article_attachment_coordinator);
        if (this.config.getConfigurationState() == 2) {
            this.article = this.config.getArticle();
            ArticleViewModel articleViewModel = this.article;
            if (articleViewModel != null) {
                this.articleId = Long.valueOf(articleViewModel.getId());
            }
            loadArticleBody();
        } else {
            fetchArticle(this.config.getArticleId());
            this.articleId = Long.valueOf(this.config.getArticleId());
        }
        if (this.config.isContactUsButtonVisible()) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C12136f.contact_us_button);
            floatingActionButton.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ViewArticleActivity.this.startRequestActivity();
                }
            });
            floatingActionButton.setVisibility(0);
        }
        this.articleVotingView = (ArticleVotingView) findViewById(C12136f.article_voting_container);
        this.articleVotingView.bindTo(this.articleId, this.articleVoteStorage, this.helpCenterProvider);
        this.articleVotingView.setVisibility(8);
        applyVoteButtonSettings();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.settingsAggregatedCallback.cancel();
        WebView webView = this.articleContentWebView;
        if (webView != null) {
            webView.destroy();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (itemAtPosition instanceof HelpCenterAttachment) {
            HelpCenterAttachment helpCenterAttachment = (HelpCenterAttachment) itemAtPosition;
            if (helpCenterAttachment.getContentUrl() != null) {
                Uri parse = Uri.parse(helpCenterAttachment.getContentUrl());
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                startActivity(intent);
                return;
            }
            Logger.m31614d("ViewArticleActivity", "Unable to launch viewer, unable to parse URI for attachment", new Object[0]);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.attachmentRequestCallback = C12007d.m31622a(new AttachmentRequestCallback());
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this.networkConnectionCallbacks);
        this.networkInfoProvider.register();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C12007d<List<HelpCenterAttachment>> dVar = this.attachmentRequestCallback;
        if (dVar != null) {
            dVar.cancel();
            this.attachmentRequestCallback = null;
        }
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.unregister();
    }

    /* access modifiers changed from: protected */
    public void setLoadingState(LoadingState loadingState) {
        if (loadingState == null) {
            Logger.m31614d("ViewArticleActivity", "LoadingState was null, nothing to do", new Object[0]);
            return;
        }
        int i = C137318.f35205x84719a3e[loadingState.ordinal()];
        if (i == 1) {
            UiUtils.setVisibility(this.progressView, 0);
            UiUtils.setVisibility(this.attachmentListView, 8);
        } else if (i == 2) {
            UiUtils.setVisibility(this.progressView, 8);
            UiUtils.setVisibility(this.attachmentListView, 0);
        } else if (i == 3) {
            UiUtils.setVisibility(this.progressView, 8);
            UiUtils.setVisibility(this.attachmentListView, 8);
            dimissSnackBar();
            Snackbar a = Snackbar.m27826a((View) this.coordinatorLayout, C12140j.view_article_attachments_error, -2);
            a.mo31302a(C12140j.zendesk_retry_button_label, (OnClickListener) new OnClickListener() {
                public void onClick(View view) {
                    if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                        ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                        viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                    } else if (ViewArticleActivity.this.article != null) {
                        ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                        viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                    }
                    ViewArticleActivity.this.dimissSnackBar();
                }
            });
            this.snackbar = a;
            this.snackbar.mo31275k();
        }
    }

    public static Builder builder(long j) {
        return new Builder(j);
    }
}
