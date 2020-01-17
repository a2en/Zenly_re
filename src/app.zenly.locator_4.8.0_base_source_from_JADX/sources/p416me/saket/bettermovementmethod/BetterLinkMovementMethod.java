package p416me.saket.bettermovementmethod;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod */
public class BetterLinkMovementMethod extends LinkMovementMethod {

    /* renamed from: i */
    private static BetterLinkMovementMethod f33771i;

    /* renamed from: a */
    private OnLinkClickListener f33772a;

    /* renamed from: b */
    private OnLinkLongClickListener f33773b;

    /* renamed from: c */
    private final RectF f33774c = new RectF();

    /* renamed from: d */
    private boolean f33775d;

    /* renamed from: e */
    private ClickableSpan f33776e;

    /* renamed from: f */
    private int f33777f;

    /* renamed from: g */
    private LongPressTimer f33778g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f33779h;

    /* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod$LongPressTimer */
    protected static final class LongPressTimer implements Runnable {

        /* renamed from: e */
        private OnTimerReachedListener f33780e;

        /* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod$LongPressTimer$OnTimerReachedListener */
        protected interface OnTimerReachedListener {
            void onTimerReached();
        }

        protected LongPressTimer() {
        }

        /* renamed from: a */
        public void mo37725a(OnTimerReachedListener onTimerReachedListener) {
            this.f33780e = onTimerReachedListener;
        }

        public void run() {
            this.f33780e.onTimerReached();
        }
    }

    /* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod$OnLinkClickListener */
    public interface OnLinkClickListener {
        boolean onClick(TextView textView, String str);
    }

    /* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod$OnLinkLongClickListener */
    public interface OnLinkLongClickListener {
        boolean onLongClick(TextView textView, String str);
    }

    /* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod$a */
    class C13161a implements OnTimerReachedListener {

        /* renamed from: a */
        final /* synthetic */ TextView f33781a;

        /* renamed from: b */
        final /* synthetic */ ClickableSpan f33782b;

        C13161a(TextView textView, ClickableSpan clickableSpan) {
            this.f33781a = textView;
            this.f33782b = clickableSpan;
        }

        public void onTimerReached() {
            BetterLinkMovementMethod.this.f33779h = true;
            this.f33781a.performHapticFeedback(0);
            BetterLinkMovementMethod.this.mo37722b(this.f33781a);
            BetterLinkMovementMethod.this.mo37723b(this.f33781a, this.f33782b);
        }
    }

    /* renamed from: me.saket.bettermovementmethod.BetterLinkMovementMethod$b */
    protected static class C13162b {

        /* renamed from: a */
        private ClickableSpan f33784a;

        /* renamed from: b */
        private String f33785b;

        protected C13162b(ClickableSpan clickableSpan, String str) {
            this.f33784a = clickableSpan;
            this.f33785b = str;
        }

        /* renamed from: a */
        protected static C13162b m34370a(TextView textView, ClickableSpan clickableSpan) {
            String str;
            Spanned spanned = (Spanned) textView.getText();
            if (clickableSpan instanceof URLSpan) {
                str = ((URLSpan) clickableSpan).getURL();
            } else {
                str = spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString();
            }
            return new C13162b(clickableSpan, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo37729b() {
            return this.f33785b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ClickableSpan mo37728a() {
            return this.f33784a;
        }
    }

    protected BetterLinkMovementMethod() {
    }

    /* renamed from: c */
    private void m34359c(TextView textView) {
        this.f33779h = false;
        this.f33776e = null;
        mo37722b(textView);
        mo37718a(textView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37722b(TextView textView) {
        if (this.f33775d) {
            this.f33775d = false;
            Spannable spannable = (Spannable) textView.getText();
            spannable.removeSpan((BackgroundColorSpan) textView.getTag(C13163a.bettermovementmethod_highlight_background_span));
            Selection.removeSelection(spannable);
        }
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (this.f33777f != textView.hashCode()) {
            this.f33777f = textView.hashCode();
            textView.setAutoLinkMask(0);
        }
        ClickableSpan a = mo37715a(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f33776e = a;
        }
        boolean z = this.f33776e != null;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (a != null) {
                mo37720a(textView, a, spannable);
            }
            if (z && this.f33773b != null) {
                mo37721a(textView, (OnTimerReachedListener) new C13161a(textView, a));
            }
            return z;
        } else if (action == 1) {
            if (!this.f33779h && z && a == this.f33776e) {
                mo37719a(textView, a);
            }
            m34359c(textView);
            return z;
        } else if (action == 2) {
            if (a != this.f33776e) {
                mo37718a(textView);
            }
            if (!this.f33779h) {
                if (a != null) {
                    mo37720a(textView, a, spannable);
                } else {
                    mo37722b(textView);
                }
            }
            return z;
        } else if (action != 3) {
            return false;
        } else {
            m34359c(textView);
            return false;
        }
    }

    /* renamed from: a */
    public static BetterLinkMovementMethod m34357a() {
        return new BetterLinkMovementMethod();
    }

    /* renamed from: a */
    public BetterLinkMovementMethod mo37716a(OnLinkClickListener onLinkClickListener) {
        if (this != f33771i) {
            this.f33772a = onLinkClickListener;
            return this;
        }
        throw new UnsupportedOperationException("Setting a click listener on the instance returned by getInstance() is not supported to avoid memory leaks. Please use newInstance() or any of the linkify() methods instead.");
    }

    /* renamed from: a */
    public BetterLinkMovementMethod mo37717a(OnLinkLongClickListener onLinkLongClickListener) {
        if (this != f33771i) {
            this.f33773b = onLinkLongClickListener;
            return this;
        }
        throw new UnsupportedOperationException("Setting a long-click listener on the instance returned by getInstance() is not supported to avoid memory leaks. Please use newInstance() or any of the linkify() methods instead.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37723b(TextView textView, ClickableSpan clickableSpan) {
        C13162b a = C13162b.m34370a(textView, clickableSpan);
        OnLinkLongClickListener onLinkLongClickListener = this.f33773b;
        if (!(onLinkLongClickListener != null && onLinkLongClickListener.onLongClick(textView, a.mo37729b()))) {
            a.mo37728a().onClick(textView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ClickableSpan mo37715a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Object[] spans;
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(y);
        float f = (float) x;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        this.f33774c.left = layout.getLineLeft(lineForVertical);
        this.f33774c.top = (float) layout.getLineTop(lineForVertical);
        RectF rectF = this.f33774c;
        float lineWidth = layout.getLineWidth(lineForVertical);
        RectF rectF2 = this.f33774c;
        rectF.right = lineWidth + rectF2.left;
        rectF2.bottom = (float) layout.getLineBottom(lineForVertical);
        if (this.f33774c.contains(f, (float) y)) {
            for (Object obj : spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) {
                if (obj instanceof ClickableSpan) {
                    return (ClickableSpan) obj;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37720a(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (!this.f33775d) {
            this.f33775d = true;
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(textView.getHighlightColor());
            spannable.setSpan(backgroundColorSpan, spanStart, spanEnd, 18);
            textView.setTag(C13163a.bettermovementmethod_highlight_background_span, backgroundColorSpan);
            Selection.setSelection(spannable, spanStart, spanEnd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37721a(TextView textView, OnTimerReachedListener onTimerReachedListener) {
        this.f33778g = new LongPressTimer();
        this.f33778g.mo37725a(onTimerReachedListener);
        textView.postDelayed(this.f33778g, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37718a(TextView textView) {
        LongPressTimer longPressTimer = this.f33778g;
        if (longPressTimer != null) {
            textView.removeCallbacks(longPressTimer);
            this.f33778g = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37719a(TextView textView, ClickableSpan clickableSpan) {
        C13162b a = C13162b.m34370a(textView, clickableSpan);
        OnLinkClickListener onLinkClickListener = this.f33772a;
        if (!(onLinkClickListener != null && onLinkClickListener.onClick(textView, a.mo37729b()))) {
            a.mo37728a().onClick(textView);
        }
    }
}
