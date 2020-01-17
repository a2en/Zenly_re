package app.zenly.locator.meet;

public interface MeetContract {

    public interface Presenter {
        void callFriend();

        void getNavigation(C4479a aVar);

        void resolveAddress();

        void subscribe();

        void switchNavigation(int i);

        void unsubscribe();
    }

    public interface View {
        void hideFogViewMode();

        void selectTransport(boolean z);

        void setupMeetViewForFogview(String str);

        void showAddress(String str);

        void showAddressNotFound();

        void showBlurredMode(String str);

        void showCall(String str);

        void showDistance(int i);

        void showETAs(long j, long j2);

        void showIsNearby();

        void showLongDistance(float f);

        void showNavigationChooser(double d, double d2, C4479a aVar);

        void showShareLocationChooser(double d, double d2, String str, String str2);
    }

    /* renamed from: app.zenly.locator.meet.MeetContract$a */
    public enum C4479a {
        DRIVING,
        WALKING
    }
}
