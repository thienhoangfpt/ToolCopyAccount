package mmo.common;

import java.awt.Color;

public final class Common {
    
    public static final String LINK_FACEBOOK
            = "https://www.facebook.com";
    public static final String LINK_YOUTUBE
            = "https://www.youtube.com/channel/UCaVxc9OC9OvOyPlhSq-7URw?view_as=subscriber";
    
    public static final String URL_PHONE_NUMBERS_DATA
            = "https://simsodep.com/Sim-So-Dep-Mobifone.html?gclid=Cj0KCQiA4aXiBRCRARIsAMBZGz8nT9IljZ80RFTSXFfjeAnvMnGTzAc8FpIAoBYLX7qnmtSoDog45QQaAnV8EALw_wcB?page=";
    
    public static final Color COLORS[] = new Color[11];
    
    public static final String SAVE_POINT = "savepoint.dat";
    
    static {
        COLORS[0] = new Color(51, 88, 44);
        COLORS[1] = Color.BLUE;
        COLORS[2] = Color.CYAN;
        COLORS[3] = Color.DARK_GRAY;
        COLORS[4] = Color.GREEN;
        COLORS[5] = Color.MAGENTA;
        COLORS[6] = Color.ORANGE;
        COLORS[7] = Color.PINK;
        COLORS[8] = Color.RED;
        COLORS[9] = Color.YELLOW;
        COLORS[10] = Color.WHITE;
    }
    
}
