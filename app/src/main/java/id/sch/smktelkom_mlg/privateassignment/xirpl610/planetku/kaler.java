package id.sch.smktelkom_mlg.privateassignment.xirpl610.planetku;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by diniristanti on 14/05/2017.
 */

public class kaler {
    public static int getRandomColor() {
        Random rnd = new Random();
        //return Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return Color.rgb(rnd.nextInt(192), rnd.nextInt(192), rnd.nextInt(192));
    }
}
