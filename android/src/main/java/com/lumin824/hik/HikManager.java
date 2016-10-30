package com.lumin824.hik;

import android.graphics.Color;
import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by lumin on 16/7/1.
 */
public class HikManager extends SimpleViewManager<View> {

    @Override
    public String getName() {
        return "Hik";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        View view = new View(reactContext);
        view.setBackgroundColor(Color.RED);
        return view;
    }
}
