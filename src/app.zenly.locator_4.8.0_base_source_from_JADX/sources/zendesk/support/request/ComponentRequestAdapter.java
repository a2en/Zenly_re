package zendesk.support.request;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p005q.C0668b;
import androidx.recyclerview.widget.C1112g;
import androidx.recyclerview.widget.C1112g.C1114b;
import androidx.recyclerview.widget.C1112g.C1115c;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.suas.C13622i;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;

class ComponentRequestAdapter implements Listener<List<CellType$Base>> {
    private final ListUpdateCallback listUpdateCallback;
    private final RecyclerView recyclerView;
    private final RequestAdapterSelector requestAdapterSelector;
    /* access modifiers changed from: private */
    public final List<CellType$Base> requestMessageList;
    private Runnable updateRunnable = null;

    private static class DiffCalculator extends C1114b {
        private final List<CellType$Base> newList;
        private final List<CellType$Base> oldList;

        public boolean areContentsTheSame(int i, int i2) {
            return ((CellType$Base) this.oldList.get(i)).areContentsTheSame((CellType$Base) this.newList.get(i2));
        }

        public boolean areItemsTheSame(int i, int i2) {
            return ((CellType$Base) this.oldList.get(i)).getUniqueId() == ((CellType$Base) this.newList.get(i2)).getUniqueId();
        }

        public int getNewListSize() {
            return this.newList.size();
        }

        public int getOldListSize() {
            return this.oldList.size();
        }

        private DiffCalculator(List<CellType$Base> list, List<CellType$Base> list2) {
            this.oldList = list;
            this.newList = list2;
        }
    }

    static class RequestAdapter extends C1069g<RequestViewHolder> {
        private final ComponentRequestAdapter dataSource;
        private int lastPosition = -1;

        RequestAdapter(ComponentRequestAdapter componentRequestAdapter) {
            setHasStableIds(true);
            this.dataSource = componentRequestAdapter;
        }

        public int getItemCount() {
            return this.dataSource.getMessageCount();
        }

        public long getItemId(int i) {
            return this.dataSource.getMessageForPos(i).getUniqueId();
        }

        public int getItemViewType(int i) {
            return this.dataSource.getMessageForPos(i).getLayoutId();
        }

        @SuppressLint({"RecyclerView"})
        public void onBindViewHolder(RequestViewHolder requestViewHolder, int i) {
            this.dataSource.getMessageForPos(i).bind(requestViewHolder);
            int i2 = this.lastPosition;
            if (i > i2 && i2 != -1) {
                this.lastPosition = i;
                requestViewHolder.startAnimation();
            }
            if (this.lastPosition == -1) {
                this.lastPosition = i;
            }
        }

        public RequestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RequestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }

        public void onViewDetachedFromWindow(RequestViewHolder requestViewHolder) {
            super.onViewDetachedFromWindow(requestViewHolder);
            requestViewHolder.clearAnimation();
        }
    }

    static class RequestAdapterSelector implements StateSelector<List<CellType$Base>> {
        private final CellFactory messageFactory;

        RequestAdapterSelector(CellFactory cellFactory) {
            this.messageFactory = cellFactory;
        }

        public List<CellType$Base> selectData(C13622i iVar) {
            StateConversation fromState = StateConversation.fromState(iVar);
            StateSettings settings = StateConfig.fromState(iVar).getSettings();
            return this.messageFactory.generateCells(fromState.getMessages(), fromState.getUsers(), fromState.getStatus(), settings.getSystemMessage());
        }
    }

    static class RequestViewHolder extends C1085v {
        private static final TimeInterpolator TIME_INTERPOLATOR = C0668b.m3090a(0.2f, 0.0f, 0.4f, 1.0f);
        private ValueAnimator animation;
        @SuppressLint({"UseSparseArrays"})
        private final Map<Integer, View> viewCache = new HashMap();

        RequestViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: 0000 */
        public void clearAnimation() {
            ValueAnimator valueAnimator = this.animation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.itemView.setTranslationY(0.0f);
            }
        }

        /* access modifiers changed from: 0000 */
        public <E extends View> E findCachedView(int i) {
            E e;
            synchronized (this.viewCache) {
                if (this.viewCache.containsKey(Integer.valueOf(i))) {
                    e = (View) this.viewCache.get(Integer.valueOf(i));
                } else {
                    E findViewById = this.itemView.findViewById(i);
                    this.viewCache.put(Integer.valueOf(i), findViewById);
                    e = findViewById;
                }
            }
            return e;
        }

        /* access modifiers changed from: 0000 */
        public void startAnimation() {
            int measuredHeight = this.itemView.getMeasuredHeight();
            if (measuredHeight == 0) {
                this.itemView.measure(0, 0);
                measuredHeight = this.itemView.getMeasuredHeight();
            }
            this.animation = ValueAnimator.ofFloat(new float[]{((float) measuredHeight) * 0.6666667f, 0.0f});
            this.animation.setInterpolator(TIME_INTERPOLATOR);
            this.animation.setDuration(250);
            this.animation.addUpdateListener(new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RequestViewHolder.this.itemView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            this.animation.start();
        }
    }

    ComponentRequestAdapter(ListUpdateCallback listUpdateCallback2, CellFactory cellFactory, RecyclerView recyclerView2) {
        this.listUpdateCallback = listUpdateCallback2;
        this.recyclerView = recyclerView2;
        this.requestMessageList = new ArrayList();
        this.requestAdapterSelector = new RequestAdapterSelector(cellFactory);
    }

    /* access modifiers changed from: private */
    public void updateDataSet(List<CellType$Base> list, List<CellType$Base> list2) {
        C1115c a = C1112g.m5468a(new DiffCalculator(list, list2), true);
        this.requestMessageList.clear();
        this.requestMessageList.addAll(list2);
        a.mo5696a(this.listUpdateCallback);
    }

    /* access modifiers changed from: 0000 */
    public int getMessageCount() {
        return this.requestMessageList.size();
    }

    /* access modifiers changed from: 0000 */
    public CellType$Base getMessageForPos(int i) {
        return (CellType$Base) this.requestMessageList.get(i);
    }

    /* access modifiers changed from: 0000 */
    public StateSelector<List<CellType$Base>> getSelector() {
        return this.requestAdapterSelector;
    }

    public void update(final List<CellType$Base> list) {
        this.recyclerView.removeCallbacks(this.updateRunnable);
        this.updateRunnable = new Runnable() {
            public void run() {
                ComponentRequestAdapter.this.updateDataSet(C12010a.m31632a(ComponentRequestAdapter.this.requestMessageList), C12010a.m31632a(list));
            }
        };
        this.recyclerView.postDelayed(this.updateRunnable, 200);
    }
}
