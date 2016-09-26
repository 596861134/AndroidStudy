import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public class ConvertImageColor {
    Activity activity;

    public ConvertImageColor(Activity activity) {
        this.activity = activity;
    }

    // �ı�ͼ�����ɫ
    public  Drawable changeImageColor(int drawable,int color){
        Drawable myIcon = activity.getResources().getDrawable(drawable);
        myIcon.setColorFilter(activity.getResources().getColor(color), PorterDuff.Mode.SRC_ATOP);
        return  myIcon;
    }
}