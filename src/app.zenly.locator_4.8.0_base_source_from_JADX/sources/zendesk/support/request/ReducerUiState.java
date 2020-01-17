package zendesk.support.request;

import zendesk.suas.C13621h;

class ReducerUiState extends C13621h<StateUi> {
    ReducerUiState() {
    }

    public StateUi getInitialState() {
        return new StateUi();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateUi reduce(zendesk.support.request.StateUi r5, zendesk.suas.C13600a<?> r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getActionType()
            int r1 = r0.hashCode()
            r2 = -1264564654(0xffffffffb4a04652, float:-2.9853487E-7)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            r2 = 222524641(0xd4374e1, float:6.02297E-31)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "SHOW_RETRY_DIALOG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "DIALOG_DISMISSED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x0034
            r6 = 0
            if (r0 == r3) goto L_0x002f
            return r6
        L_0x002f:
            zendesk.support.request.StateUi r5 = r5.setDialogState(r6)
            return r5
        L_0x0034:
            java.lang.Object r6 = r6.getData()
            java.util.List r6 = (java.util.List) r6
            zendesk.support.request.StateRetryDialog r0 = new zendesk.support.request.StateRetryDialog
            r0.<init>(r6)
            zendesk.support.request.StateUi r5 = r5.setDialogState(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerUiState.reduce(zendesk.support.request.StateUi, zendesk.suas.a):zendesk.support.request.StateUi");
    }
}
