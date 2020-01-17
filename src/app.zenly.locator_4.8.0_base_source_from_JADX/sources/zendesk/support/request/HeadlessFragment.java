package zendesk.support.request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class HeadlessFragment<E> extends Fragment {
    private E data;

    static <E> E getData(FragmentManager fragmentManager) {
        Fragment b = fragmentManager.mo4083b("ZendeskHeadlessFragment");
        if (b instanceof HeadlessFragment) {
            return ((HeadlessFragment) b).getData();
        }
        return null;
    }

    static <E> void install(FragmentManager fragmentManager, E e) {
        HeadlessFragment headlessFragment = new HeadlessFragment();
        headlessFragment.setData(e);
        C0819o b = fragmentManager.mo4084b();
        b.mo4316a((Fragment) headlessFragment, "ZendeskHeadlessFragment");
        b.mo4176a();
    }

    private void setData(E e) {
        this.data = e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        return null;
    }

    private E getData() {
        return this.data;
    }
}
