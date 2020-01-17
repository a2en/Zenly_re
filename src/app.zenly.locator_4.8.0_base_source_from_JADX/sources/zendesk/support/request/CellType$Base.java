package zendesk.support.request;

import android.graphics.Rect;
import java.util.Date;

public interface CellType$Base {
    boolean areContentsTheSame(CellType$Base cellType$Base);

    void bind(RequestViewHolder requestViewHolder);

    long getGroupId();

    Rect getInsets();

    int getLayoutId();

    int getPositionType();

    Date getTimeStamp();

    long getUniqueId();

    void setPositionType(int i);
}
