package zendesk.support.requestlist;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

class RequestListAdapter extends C1069g<RequestListViewHolder> {
    private final OnItemClick itemClickListener;
    private final Picasso picasso;
    private final List<RequestListItem> requestListItems = new ArrayList(0);

    RequestListAdapter(OnItemClick onItemClick, Picasso picasso2) {
        this.itemClickListener = onItemClick;
        this.picasso = picasso2;
        setHasStableIds(true);
    }

    public int getItemCount() {
        return this.requestListItems.size();
    }

    public long getItemId(int i) {
        return ((RequestListItem) this.requestListItems.get(i)).getItemId();
    }

    /* access modifiers changed from: 0000 */
    public void swapRequests(List<RequestListItem> list) {
        this.requestListItems.clear();
        this.requestListItems.addAll(list);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RequestListViewHolder requestListViewHolder, int i) {
        requestListViewHolder.bind((RequestListItem) this.requestListItems.get(i));
    }

    public RequestListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RequestListViewHolder.create(viewGroup.getContext(), viewGroup, this.itemClickListener, this.picasso);
    }
}
