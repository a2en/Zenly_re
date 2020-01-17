package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.p005q.C0668b;
import androidx.recyclerview.widget.C1101f;
import androidx.recyclerview.widget.C1131l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import com.squareup.picasso.Picasso;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.ImageStream;
import zendesk.belvedere.ImageStream.ScrollListener;
import zendesk.suas.C13605d;
import zendesk.suas.Listener;
import zendesk.suas.Store;
import zendesk.suas.Subscription;

@SuppressLint({"ViewConstructor"})
public class RequestViewConversationsEnabled extends FrameLayout implements RequestView {
    private AppCompatActivity activity;

    /* renamed from: af */
    ActionFactory f35239af;
    CellFactory cellFactory;
    private ImagePickerDragAnimation imagePickerDragAnimation;
    private ImageStream imageStream;
    private ComponentMessageComposer messageComposerComponent;
    private ViewMessageComposer messageComposerView;
    Picasso picasso;
    private RecyclerView recyclerView;
    Store store;
    private Subscription subscription;
    private View toolbar;
    private View toolbarContainer;

    static class ImagePickerDragAnimation implements ScrollListener {
        private final Interpolator cubicBezierInterpolator = C0668b.m3090a(0.19f, 0.0f, 0.2f, 1.0f);
        private final View messageComposer;
        private final View recycler;
        private final View toolbar;
        private final View toolbarContainer;

        ImagePickerDragAnimation(View view, View view2, View view3, View view4) {
            this.toolbarContainer = view;
            this.messageComposer = view2;
            this.recycler = view3;
            this.toolbar = view4;
        }

        private void animateBackground(int i, float f) {
            float interpolation = (float) ((int) (this.cubicBezierInterpolator.getInterpolation(f * 0.3f) * -1.0f * ((float) i)));
            this.messageComposer.setTranslationY(interpolation);
            this.recycler.setTranslationY(interpolation);
        }

        private void animateToolbar(int i, float f) {
            float f2 = (float) i;
            float f3 = f * f2;
            int p = ViewCompat.m2863p(this.toolbar);
            if (i > 0) {
                float f4 = f2 - f3;
                float f5 = (float) p;
                if (f4 < f5) {
                    this.toolbarContainer.setTranslationY(f4 - f5);
                    return;
                }
            }
            this.toolbarContainer.setTranslationY(0.0f);
        }

        public void onScroll(int i, int i2, float f) {
            animateToolbar(i2, f);
            animateBackground(i2, f);
        }
    }

    static class RecyclerListener implements OnHeightChangeListener, OnFocusChangeListener, OnLayoutChangeListener, ListUpdateCallback {
        private final LinearLayoutManager linearLayoutManager;
        /* access modifiers changed from: private */
        public final int recyclerDefaultBottomPadding;
        /* access modifiers changed from: private */
        public final RecyclerView recyclerView;

        RecyclerListener(RecyclerView recyclerView2, LinearLayoutManager linearLayoutManager2) {
            this.recyclerView = recyclerView2;
            this.linearLayoutManager = linearLayoutManager2;
            this.recyclerDefaultBottomPadding = recyclerView2.getResources().getDimensionPixelOffset(C12134d.zs_request_recycler_padding_bottom);
        }

        private void postScrollToBottom(final int i) {
            this.recyclerView.post(new Runnable() {
                public void run() {
                    RecyclerListener.this.scrollToBottom(i);
                }
            });
        }

        /* access modifiers changed from: private */
        public void scrollToBottom(int i) {
            int i2;
            int itemCount = this.recyclerView.getAdapter().getItemCount() - 1;
            if (itemCount < 0) {
                return;
            }
            if (i == 1) {
                C1085v b = this.recyclerView.mo5059b(itemCount);
                if (b != null) {
                    View view = b.itemView;
                    if (view != null) {
                        i2 = view.getHeight();
                        this.linearLayoutManager.mo5004f(itemCount, (this.recyclerView.getPaddingBottom() + i2) * -1);
                    }
                }
                i2 = 0;
                this.linearLayoutManager.mo5004f(itemCount, (this.recyclerView.getPaddingBottom() + i2) * -1);
            } else if (i == 3) {
                C137802 r3 = new C1131l(this, this.recyclerView.getContext()) {
                    /* access modifiers changed from: protected */
                    public int calculateTimeForScrolling(int i) {
                        return 50;
                    }
                };
                r3.setTargetPosition(itemCount);
                this.recyclerView.getLayoutManager().mo5260b((SmoothScroller) r3);
            } else if (i == 2) {
                C1131l lVar = new C1131l(this.recyclerView.getContext());
                lVar.setTargetPosition(itemCount);
                this.recyclerView.getLayoutManager().mo5260b((SmoothScroller) lVar);
            }
        }

        public void onChanged(int i, int i2, Object obj) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2, obj);
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                postScrollToBottom(2);
            }
        }

        public void onHeightChange(final int i) {
            this.recyclerView.post(new Runnable() {
                public void run() {
                    int paddingLeft = RecyclerListener.this.recyclerView.getPaddingLeft();
                    int paddingRight = RecyclerListener.this.recyclerView.getPaddingRight();
                    int paddingTop = RecyclerListener.this.recyclerView.getPaddingTop();
                    int access$100 = RecyclerListener.this.recyclerDefaultBottomPadding;
                    int i = i;
                    if (i > 0) {
                        access$100 += i;
                    }
                    if (access$100 != RecyclerListener.this.recyclerView.getPaddingBottom()) {
                        RecyclerListener.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, access$100);
                        RecyclerListener.this.scrollToBottom(1);
                    }
                }
            });
        }

        public void onInserted(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2);
            postScrollToBottom(3);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 < i8) {
                postScrollToBottom(1);
            }
        }

        public void onMoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemMoved(i, i2);
        }

        public void onRemoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeRemoved(i, i2);
        }
    }

    static class RequestItemAnimator extends C1101f {
        private final ComponentRequestAdapter component;

        RequestItemAnimator(ComponentRequestAdapter componentRequestAdapter) {
            this.component = componentRequestAdapter;
            setSupportsChangeAnimations(false);
        }

        public boolean canReuseUpdatedViewHolder(C1085v vVar) {
            if (this.component.getMessageForPos(vVar.getAdapterPosition()) instanceof CellType$Attachment) {
                return true;
            }
            return super.canReuseUpdatedViewHolder(vVar);
        }
    }

    public RequestViewConversationsEnabled(Context context) {
        super(context);
        viewInit(context);
    }

    private Subscription bindComponents(Store store2) {
        return C13605d.m35914a(bindMessageComposer(store2), bindRecycler(store2), bindDialogComponent(store2));
    }

    private Subscription bindDialogComponent(Store store2) {
        return store2.addListener(StateUi.class, (Listener<E>) new ComponentDialog<E>(this.activity, this.f35239af, store2));
    }

    private Subscription bindMessageComposer(Store store2) {
        ComponentMessageComposer componentMessageComposer = new ComponentMessageComposer(this.activity, this.imageStream, this.messageComposerView, store2, this.f35239af);
        this.messageComposerComponent = componentMessageComposer;
        return store2.addListener(this.messageComposerComponent.getSelector(), (Listener<E>) this.messageComposerComponent);
    }

    private Subscription bindRecycler(Store store2) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.activity);
        RecyclerListener recyclerListener = new RecyclerListener(this.recyclerView, linearLayoutManager);
        ComponentRequestAdapter componentRequestAdapter = new ComponentRequestAdapter(recyclerListener, this.cellFactory, this.recyclerView);
        CellMarginDecorator cellMarginDecorator = new CellMarginDecorator(componentRequestAdapter, this.activity);
        RequestItemAnimator requestItemAnimator = new RequestItemAnimator(componentRequestAdapter);
        RequestAdapter requestAdapter = new RequestAdapter(componentRequestAdapter);
        this.recyclerView.setItemAnimator(requestItemAnimator);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.mo5045a((C1074l) cellMarginDecorator);
        this.recyclerView.setAdapter(requestAdapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.messageComposerView.setOnHeightChangeListener(recyclerListener);
        this.messageComposerView.addOnFocusChangeListener(recyclerListener);
        this.recyclerView.addOnLayoutChangeListener(recyclerListener);
        return store2.addListener(componentRequestAdapter.getSelector(), (Listener<E>) componentRequestAdapter);
    }

    private void bindViews() {
        this.imageStream = BelvedereUi.m35621a(this.activity);
        this.recyclerView = (RecyclerView) findViewById(C12136f.activity_request_recycler_view);
        this.messageComposerView = (ViewMessageComposer) findViewById(C12136f.activity_request_message_composer);
        this.toolbarContainer = this.activity.findViewById(C12136f.activity_request_appbar);
        this.toolbar = this.activity.findViewById(C12136f.activity_request_toolbar);
        this.messageComposerView.init(this.imageStream);
        installDragAnimation();
    }

    private void installDragAnimation() {
        this.imagePickerDragAnimation = new ImagePickerDragAnimation(this.toolbarContainer, this.messageComposerView, this.recyclerView, this.toolbar);
        this.imageStream.mo38773a((ScrollListener) this.imagePickerDragAnimation);
    }

    private void viewInit(Context context) {
        FrameLayout.inflate(context, C12138h.zs_view_request_conversations_enabled, this);
        this.activity = (AppCompatActivity) context;
    }

    public boolean hasUnsavedInput() {
        ComponentMessageComposer componentMessageComposer = this.messageComposerComponent;
        return componentMessageComposer != null && componentMessageComposer.hasUnsavedInput();
    }

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void init(RequestComponent requestComponent, boolean z) {
        requestComponent.inject(this);
        bindViews();
        this.subscription = bindComponents(this.store);
        this.subscription.informWithCurrentState();
        if (z) {
            this.store.dispatch(this.f35239af.loadCommentsFromCacheAsync());
            this.store.dispatch(this.f35239af.loadRequestAsync());
            this.store.dispatch(this.f35239af.initialLoadCommentsAsync());
            this.messageComposerView.requestFocusForInput();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription2 = this.subscription;
        if (subscription2 != null) {
            subscription2.removeListener();
        }
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }
}
