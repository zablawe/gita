package com.bawei.gitdemos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bawei.gitdemos.frag.MyFragment;
import com.bawei.gitdemos.frag.OtherFragment;
import com.bawei.gitdemos.frag.ShowFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        inniView();
        final ArrayList <Fragment> fragmentArrayList = new ArrayList <>();
        OtherFragment otherFragment = new OtherFragment();
        ShowFragment showFragment = new ShowFragment();
        MyFragment myFragment = new MyFragment();

        fragmentArrayList.add( otherFragment );
        fragmentArrayList.add( showFragment );
        fragmentArrayList.add( myFragment );

        pager.addOnPageChangeListener( new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                radioGroup.check( radioGroup.getChildAt( i ).getId() );
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        } );
        radioGroup.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.btn1:
                        pager.setCurrentItem( 0 );
                        break;
                    case R.id.btn2:
                        pager.setCurrentItem( 1 );
                        break;
                    case R.id.btn3:
                        pager.setCurrentItem( 2 );
                        break;
                }
            }
        } );
          pager.setAdapter( new FragmentPagerAdapter(getSupportFragmentManager()) {
              @Override
              public Fragment getItem(int i) {
                  return fragmentArrayList.get( i );
              }

              @Override
              public int getCount() {
                  return fragmentArrayList.size();
              }
          } );
    }

    private void inniView() {
        pager = findViewById( R.id.view_pager );
        radioGroup = findViewById( R.id.radio_group );
    }

    
}
