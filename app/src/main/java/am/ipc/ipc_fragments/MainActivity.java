package am.ipc.ipc_fragments;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends FragmentActivity {


    ViewPager vp;
    int page_index = 0;
    MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.vp);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.addFragmentToPager(new FirstFragment());
        myPagerAdapter.addFragmentToPager(new SecondFragment());
        myPagerAdapter.addFragmentToPager(new ThirdFragment());

        vp.setAdapter(myPagerAdapter);
        vp.addOnPageChangeListener (new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                page_index = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void next(View view) {
        page_index++;
        if (page_index == myPagerAdapter.getCount()) {
            page_index = 0;
        }
        vp.setCurrentItem(page_index);
    }

    public void prev(View view) {
        page_index--;
        if (page_index == -1) {
            page_index = myPagerAdapter.getCount()-1;
        }
        vp.setCurrentItem(page_index);
    }
}
