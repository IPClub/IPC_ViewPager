package am.ipc.ipc_fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

class MyPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
    }


    public void addFragmentToPager(Fragment fragment){
        fragments.add(fragment);
    }
    @Override
    public Fragment getItem(int position) {
       return fragments.get(position);
    }


    @Override
    public int getCount() {
        return fragments.size();
    }


}
