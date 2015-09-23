package com.sheldonstyle.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.sheldonstyle.myapplication.Adapter.GuideAdapter;

import java.util.ArrayList;

/**
 * Created by Tesla on 2015/9/23.
 */
public class GuideActivity extends Activity {
    private ViewPager vpGuide;
    private Button btnBeginExperience;
    public ArrayList<ImageView> mImageViewsList;
    private int[] mImageItem = new int[]{R.mipmap.guide_1, R.mipmap.guide_2, R.mipmap.guide_3};//储存引导页的图片数组

    private void assignViews() {
        vpGuide = (ViewPager) findViewById(R.id.vp_guide);
        btnBeginExperience = (Button) findViewById(R.id.btn_begin_experience);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//设置窗体没有标题栏，注意要在setContentView之前
        setContentView(R.layout.activity_guide);
        assignViews();
        initView();//初始化图片数据
        GuideAdapter guideAdapter = new GuideAdapter(mImageViewsList);
        vpGuide.setAdapter(guideAdapter);
    }

    private void initView() {
        mImageViewsList = new ArrayList<ImageView>();
        for (int i = 0; i < mImageItem.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setBackgroundResource(mImageItem[i]);
            mImageViewsList.add(iv);
        }
    }



}
