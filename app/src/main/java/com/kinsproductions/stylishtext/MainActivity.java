package com.kinsproductions.stylishtext;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.kinsproductions.stylishtext.fragments.DecorationFragment;
import com.kinsproductions.stylishtext.fragments.FontFragment;
import com.kinsproductions.stylishtext.fragments.EmoticonFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private int[] tabIcons = {
                R.drawable.font_icon,
                R.drawable.icon_decor,
            //TODO: Change icon
                R.drawable.icon_decor
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab();

    }

    public void tab(){
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        tabLayout.addOnTabSelectedListener(
                new TabLayout.ViewPagerOnTabSelectedListener(viewPager) {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                super.onTabSelected(tab);
//                        int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.tabSelectedIconColor);
//                        assert tab.getIcon() != null;
//                        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                super.onTabUnselected(tab);
//                        int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.tabUnselectedIconColor);
//                        assert tab.getIcon() != null;
//                        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }


        }
        );

    }
    private void setupTabIcons() {
        for (int i = 0; i < tabIcons.length;i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
    }

    public void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FontFragment(), "Fonts");
        adapter.addFrag(new DecorationFragment(), "Decoration");
        adapter.addFrag(new EmoticonFragment(), "Emoticons");
        viewPager.setAdapter(adapter);
    }

    //adapter for view pager
    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList =new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }


        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFrag(Fragment fragment,String title){
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
