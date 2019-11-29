package com.bawei.gitdemos;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        inniView();

    }

    private void inniView() {

        pager = findViewById( R.id.view_pager );
        radioGroup = findViewById( R.id.radio_group );

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

    }
}
