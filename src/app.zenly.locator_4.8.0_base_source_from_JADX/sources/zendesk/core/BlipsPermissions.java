package zendesk.core;

class BlipsPermissions {
    private boolean behavioural;
    private boolean pathfinder;
    private boolean required;

    /* renamed from: zendesk.core.BlipsPermissions$1 */
    static /* synthetic */ class C135691 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$BlipsGroup = new int[BlipsGroup.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.core.BlipsGroup[] r0 = zendesk.core.BlipsGroup.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$core$BlipsGroup = r0
                int[] r0 = $SwitchMap$zendesk$core$BlipsGroup     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.core.BlipsGroup r1 = zendesk.core.BlipsGroup.REQUIRED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$core$BlipsGroup     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.core.BlipsGroup r1 = zendesk.core.BlipsGroup.BEHAVIOURAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$core$BlipsGroup     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.core.BlipsGroup r1 = zendesk.core.BlipsGroup.PATHFINDER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.BlipsPermissions.C135691.<clinit>():void");
        }
    }

    BlipsPermissions(boolean z, boolean z2, boolean z3) {
        this.required = z;
        this.behavioural = z2;
        this.pathfinder = z3;
    }

    /* access modifiers changed from: 0000 */
    public boolean isEnabled(BlipsGroup blipsGroup) {
        int i = C135691.$SwitchMap$zendesk$core$BlipsGroup[blipsGroup.ordinal()];
        if (i == 1) {
            return this.required;
        }
        if (i == 2) {
            return this.behavioural;
        }
        if (i != 3) {
            return false;
        }
        return this.pathfinder;
    }

    BlipsPermissions() {
        this(false, false, false);
    }
}
