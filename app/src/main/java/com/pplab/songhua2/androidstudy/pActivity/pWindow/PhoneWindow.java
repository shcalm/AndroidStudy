package com.pplab.songhua2.androidstudy.pActivity.pWindow;

import com.pplab.songhua2.androidstudy.pActivity.pView.View;
import com.pplab.songhua2.androidstudy.pActivity.pView.ViewGroup;

/**
 * Created by songhua2 on 2016/2/16.
 */
public class PhoneWindow extends  Window {

    private ViewGroup mContentParent;

    private ViewGroup mContentRoot;

    @Override
    public void setContentView(View view) {
        installDecor();
    }

    private void installDecor() {
    }

    private final class DecorView {

    }
}
