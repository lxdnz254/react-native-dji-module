// DJIModuleViewManager.java

package com.lxdnz.DjiMobile;

import android.view.View;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import com.lxdnz.DjiMobile.Views.DroneVideo;

public class DJIModuleViewManager extends SimpleViewManager<DroneVideo> {

    public static final String REACT_CLASS = "DJIModuleView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext c) {
        return new DroneVideo(c);
    }
}
