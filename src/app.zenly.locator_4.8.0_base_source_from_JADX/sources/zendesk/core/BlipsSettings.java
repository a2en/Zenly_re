package zendesk.core;

class BlipsSettings {
    private BlipsPermissions permissions;

    BlipsSettings(BlipsPermissions blipsPermissions) {
        this.permissions = blipsPermissions;
    }

    /* access modifiers changed from: 0000 */
    public BlipsPermissions getBlipsPermissions() {
        return this.permissions;
    }
}
