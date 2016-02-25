package com.pplab.songhua2.androidstudy.pActivity.pView;

/**
 * Created by songhua2 on 2016/2/16.
 */
public interface ViewManager {

    public void addView(View view,ViewGroup.LayoutParams params);

    public void updateViewLayout(View view,ViewGroup.LayoutParams params);

    public void removeView(View view);
}
