package zendesk.support.request;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import p333g.p384h.p385a.C12134d;

class CellMarginDecorator extends C1074l {
    private final ComponentRequestAdapter dataSource;
    private final int groupVerticalMargin;
    private final int verticalMargin;

    CellMarginDecorator(ComponentRequestAdapter componentRequestAdapter, Context context) {
        this.dataSource = componentRequestAdapter;
        this.verticalMargin = context.getResources().getDimensionPixelOffset(C12134d.zs_request_message_margin_vertical);
        this.groupVerticalMargin = context.getResources().getDimensionPixelOffset(C12134d.zs_request_message_group_margin_vertical);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getItemOffsets(android.graphics.Rect r10, android.view.View r11, androidx.recyclerview.widget.RecyclerView r12, androidx.recyclerview.widget.RecyclerView.C1082s r13) {
        /*
            r9 = this;
            int r11 = r12.mo5085e(r11)
            r12 = -1
            if (r11 != r12) goto L_0x0008
            return
        L_0x0008:
            zendesk.support.request.ComponentRequestAdapter r12 = r9.dataSource
            zendesk.support.request.CellType$Base r11 = r12.getMessageForPos(r11)
            int r12 = r11.getPositionType()
            android.graphics.Rect r11 = r11.getInsets()
            r13 = r12 & 2
            r0 = 2
            r1 = 0
            r2 = 1
            if (r13 != r0) goto L_0x001f
            r13 = 1
            goto L_0x0020
        L_0x001f:
            r13 = 0
        L_0x0020:
            r0 = r12 & 8
            r3 = 8
            if (r0 != r3) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3 = r12 & 16
            r4 = 16
            if (r3 != r4) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r4 = r12 & 1
            if (r4 != r2) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            int r5 = r11.left
            int r5 = -r5
            int r6 = r11.top
            int r6 = -r6
            int r7 = r11.right
            int r7 = -r7
            int r8 = r11.bottom
            int r8 = -r8
            if (r13 == 0) goto L_0x004d
            if (r0 == 0) goto L_0x004d
            int r12 = r9.groupVerticalMargin
        L_0x004b:
            int r6 = r6 + r12
            goto L_0x0054
        L_0x004d:
            if (r13 == 0) goto L_0x0056
            int r12 = r9.groupVerticalMargin
            int r6 = r6 + r12
            int r12 = r9.verticalMargin
        L_0x0054:
            int r8 = r8 + r12
            goto L_0x0072
        L_0x0056:
            if (r0 == 0) goto L_0x005e
            int r12 = r9.verticalMargin
            int r6 = r6 + r12
            int r12 = r9.groupVerticalMargin
            goto L_0x0054
        L_0x005e:
            if (r4 == 0) goto L_0x0063
            int r12 = r9.verticalMargin
            goto L_0x004b
        L_0x0063:
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13[r1] = r12
            java.lang.String r12 = "RequestActivity"
            java.lang.String r0 = "Unknown position type: %s"
            com.zendesk.logger.Logger.m31608a(r12, r0, r13)
        L_0x0072:
            if (r3 == 0) goto L_0x0077
            int r11 = r11.bottom
            int r8 = -r11
        L_0x0077:
            r10.set(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.CellMarginDecorator.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$s):void");
    }
}
