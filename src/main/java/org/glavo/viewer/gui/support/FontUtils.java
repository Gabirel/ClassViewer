package org.glavo.viewer.gui.support;

import javafx.scene.text.Font;
import org.glavo.viewer.util.Log;

public class FontUtils {
    private FontUtils() {
    }

    static {
        Log.log("loading fonts...");
    }


    public static Font uiFont = Font.loadFont(FontUtils.class.getResourceAsStream("/fonts/UI.ttf"), 15);

    public static Font textFont = Font.loadFont(FontUtils.class.getResourceAsStream("/fonts/Text.ttf"), 15);
}
