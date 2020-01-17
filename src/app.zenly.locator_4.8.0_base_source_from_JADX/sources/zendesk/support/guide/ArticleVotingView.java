package zendesk.support.guide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12135e;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.support.ArticleVote;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
import zendesk.support.UiUtils;

class ArticleVotingView extends RelativeLayout {
    /* access modifiers changed from: private */
    public Long articleId;
    /* access modifiers changed from: private */
    public ArticleVote articleVote;
    /* access modifiers changed from: private */
    public ArticleVoteStorage articleVoteStorage;
    private ImageButton downvoteButton;
    private ViewGroup downvoteButtonFrame;
    private HelpCenterProvider helpCenterProvider;
    private ImageButton upvoteButton;
    private ViewGroup upvoteButtonFrame;

    /* renamed from: zendesk.support.guide.ArticleVotingView$6 */
    static /* synthetic */ class C136936 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = new int[VoteState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.support.guide.ArticleVotingView$VoteState[] r0 = zendesk.support.guide.ArticleVotingView.VoteState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = r0
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.UPVOTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.DOWNVOTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ArticleVotingView.C136936.<clinit>():void");
        }
    }

    private enum VoteState {
        UPVOTED,
        DOWNVOTED,
        NONE;

        static VoteState fromArticleVote(ArticleVote articleVote) {
            if (articleVote == null || articleVote.getValue() == null) {
                return NONE;
            }
            int intValue = articleVote.getValue().intValue();
            if (intValue > 0) {
                return UPVOTED;
            }
            if (intValue < 0) {
                return DOWNVOTED;
            }
            return NONE;
        }
    }

    public ArticleVotingView(Context context) {
        super(context);
        setupViews(context);
    }

    private GradientDrawable buildButtonBackground(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C12134d.zs_help_voting_button_border_corner_radius);
        int a = C0540a.m2536a(context, C12133c.zs_help_voting_button_border);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C12134d.zs_help_voting_button_border_width);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) dimensionPixelSize);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(dimensionPixelSize2, a);
        return gradientDrawable;
    }

    private ColorStateList colorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{16843518}, new int[]{16842919}, new int[0]}, new int[]{i, i, i2});
    }

    /* access modifiers changed from: private */
    public void downvoteArticle() {
        String str = "ViewArticleActivity";
        if (this.articleId == null) {
            Logger.m31614d(str, "Cannot downvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hcp == null -> ");
        sb.append(this.helpCenterProvider == null);
        Logger.m31610b(str, sb.toString(), new Object[0]);
        this.helpCenterProvider.downvoteArticle(this.articleId, new C12008e<ArticleVote>() {
            public void onError(ErrorResponse errorResponse) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to downvote article. ");
                sb.append(errorResponse);
                Logger.m31608a("ViewArticleActivity", sb.toString(), new Object[0]);
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C12140j.zs_view_article_voted_failed_accessibility_announce));
                ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }

            public void onSuccess(ArticleVote articleVote) {
                Logger.m31608a("ViewArticleActivity", "Successfully downvoted article!", new Object[0]);
                ArticleVotingView.this.articleVote = articleVote;
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C12140j.zs_view_article_voted_no_accessibility_announce));
                ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }
        });
    }

    private StateListDrawable getVotingButtonBackground(int i) {
        GradientDrawable buildButtonBackground = buildButtonBackground(getContext(), i);
        GradientDrawable buildButtonBackground2 = buildButtonBackground(getContext(), -1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, buildButtonBackground);
        stateListDrawable.addState(new int[]{16842919}, buildButtonBackground);
        stateListDrawable.addState(new int[0], buildButtonBackground2);
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    public void removeVote() {
        if (this.articleId == null) {
            Logger.m31614d("ViewArticleActivity", "Article vote was null, could not remove vote", new Object[0]);
            return;
        }
        if (this.articleVote.getId() != null) {
            this.helpCenterProvider.deleteVote(this.articleVote.getId(), new C12008e<Void>() {
                public void onError(ErrorResponse errorResponse) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to remove vote. ");
                    sb.append(errorResponse.getResponseBody());
                    String str = "\n";
                    sb.append(str);
                    sb.append(errorResponse.getResponseBodyType());
                    sb.append(str);
                    sb.append(errorResponse.getUrl());
                    Logger.m31608a("ViewArticleActivity", sb.toString(), new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.updateButtons(VoteState.fromArticleVote(articleVotingView.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                public void onSuccess(Void voidR) {
                    Logger.m31608a("ViewArticleActivity", "Successfully removed vote!", new Object[0]);
                    ArticleVotingView.this.articleVote = null;
                    ArticleVotingView.this.articleVoteStorage.removeStoredArticleVote(ArticleVotingView.this.articleId);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void setVotingButtonsClickable(boolean z) {
        this.upvoteButton.setClickable(z);
        this.downvoteButton.setClickable(z);
    }

    private void setupViews(Context context) {
        LayoutInflater.from(context).inflate(C12138h.zs_view_article_voting, this);
        this.upvoteButtonFrame = (ViewGroup) findViewById(C12136f.upvote_button_frame);
        this.upvoteButton = (ImageButton) findViewById(C12136f.upvote_button);
        this.downvoteButtonFrame = (ViewGroup) findViewById(C12136f.downvote_button_frame);
        this.downvoteButton = (ImageButton) findViewById(C12136f.downvote_button);
        int themeAttributeToColor = UiUtils.themeAttributeToColor(C12131a.colorPrimary, getContext(), C12133c.zs_fallback_text_color);
        themeVotingButton(this.upvoteButton, C12135e.zs_ic_thumb_up, themeAttributeToColor);
        themeVotingButton(this.downvoteButton, C12135e.zs_ic_thumb_down, themeAttributeToColor);
        this.upvoteButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote == null || ArticleVotingView.this.articleVote.getValue() == null || !ArticleVotingView.this.articleVote.getValue().equals(Integer.valueOf(1))) {
                    voteState = VoteState.UPVOTED;
                    ArticleVotingView.this.upvoteArticle();
                } else {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
        this.downvoteButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote == null || ArticleVotingView.this.articleVote.getValue() == null || !ArticleVotingView.this.articleVote.getValue().equals(Integer.valueOf(-1))) {
                    voteState = VoteState.DOWNVOTED;
                    ArticleVotingView.this.downvoteArticle();
                } else {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
    }

    private void themeVotingButton(ImageButton imageButton, int i, int i2) {
        ViewCompat.m2822a((View) imageButton, (Drawable) getVotingButtonBackground(i2));
        Drawable i3 = C0559a.m2657i(C0540a.m2546c(getContext(), i));
        C0559a.m2642a(i3, colorStateList(-1, i2));
        C0559a.m2645a(i3, Mode.SRC_IN);
        imageButton.setImageDrawable(i3);
    }

    /* access modifiers changed from: private */
    public void updateButtons(VoteState voteState) {
        if (voteState == VoteState.NONE) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.UPVOTED) {
            this.upvoteButtonFrame.setActivated(true);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.DOWNVOTED) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(true);
        }
        updateContentDesc(voteState);
    }

    private void updateContentDesc(VoteState voteState) {
        int i = C136936.$SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[voteState.ordinal()];
        if (i == 1) {
            this.upvoteButton.setContentDescription(getResources().getString(C12140j.zs_view_article_vote_yes_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(C12140j.zs_view_article_vote_no_accessibility));
        } else if (i == 2) {
            this.upvoteButton.setContentDescription(getResources().getString(C12140j.zs_view_article_vote_yes_remove_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(C12140j.zs_view_article_vote_no_accessibility));
        } else if (i != 3) {
            Logger.m31608a("ViewArticleActivity", "Unhandled voteState case", new Object[0]);
        } else {
            this.upvoteButton.setContentDescription(getResources().getString(C12140j.zs_view_article_vote_yes_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(C12140j.zs_view_article_vote_no_remove_accessibility));
        }
    }

    /* access modifiers changed from: private */
    public void upvoteArticle() {
        Long l = this.articleId;
        if (l == null) {
            Logger.m31614d("ViewArticleActivity", "Cannot upvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
            return;
        }
        this.helpCenterProvider.upvoteArticle(l, new C12008e<ArticleVote>() {
            public void onError(ErrorResponse errorResponse) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to upvote article. ");
                sb.append(errorResponse);
                Logger.m31608a("ViewArticleActivity", sb.toString(), new Object[0]);
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C12140j.zs_view_article_voted_failed_accessibility_announce));
                ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }

            public void onSuccess(ArticleVote articleVote) {
                Logger.m31608a("ViewArticleActivity", "Successfully upvoted article!", new Object[0]);
                ArticleVotingView.this.articleVote = articleVote;
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C12140j.zs_view_article_voted_yes_accessibility_announce));
                ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }
        });
    }

    public void bindTo(Long l, ArticleVoteStorage articleVoteStorage2, HelpCenterProvider helpCenterProvider2) {
        this.articleVoteStorage = articleVoteStorage2;
        this.helpCenterProvider = helpCenterProvider2;
        this.articleId = l;
        if (l != null) {
            this.articleVote = articleVoteStorage2.getStoredArticleVote(l);
            updateButtons(VoteState.fromArticleVote(this.articleVote));
        }
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupViews(context);
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupViews(context);
    }
}
