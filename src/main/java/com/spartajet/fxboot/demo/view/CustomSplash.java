package com.spartajet.fxboot.demo.view;

import de.felixroske.jfxsupport.SplashScreen;

/**
 * @description
 * @create 2017-05-20 下午2:54
 * @email spartajet.guo@gmail.com
 */
public class CustomSplash extends SplashScreen {
    /**
     * Use your own splash image instead of the default one
     *
     * @return "/splash/javafx.png"
     */
    @Override
    public String getImagePath() {
        return super.getImagePath();
    }

    /**
     * Customize if the splash screen should be visible at all
     *
     * @return true by default
     */
    @Override
    public boolean visible() {
        return super.visible();
    }
}
