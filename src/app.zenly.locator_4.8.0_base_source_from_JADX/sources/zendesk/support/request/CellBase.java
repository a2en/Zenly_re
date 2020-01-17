package zendesk.support.request;

import android.graphics.Rect;
import java.util.Date;

abstract class CellBase implements CellType$Base {
    private final long groupId;

    /* renamed from: id */
    private final long f35213id;
    private Rect insets;
    private final int layoutId;
    private int positionType = 1;
    private final Date timestamp;
    protected final CellBindHelper utils;

    CellBase(CellBindHelper cellBindHelper, int i, long j, long j2, Date date) {
        this.utils = cellBindHelper;
        this.layoutId = i;
        this.f35213id = j;
        this.groupId = j2;
        this.timestamp = date;
        this.insets = new Rect(0, 0, 0, 0);
    }

    public long getGroupId() {
        return this.groupId;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public int getLayoutId() {
        return this.layoutId;
    }

    public int getPositionType() {
        return this.positionType;
    }

    public Date getTimeStamp() {
        return this.timestamp;
    }

    public long getUniqueId() {
        return this.f35213id;
    }

    public void setPositionType(int i) {
        this.positionType = i | this.positionType;
    }
}
