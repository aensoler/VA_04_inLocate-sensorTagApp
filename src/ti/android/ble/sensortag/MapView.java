package ti.android.ble.sensortag;

import ti.android.ble.common.BleDeviceInfo;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MapView extends Fragment {
	private MainActivity mActivity = null;
	private static final String TAG = "MapView";
	private Context mContext;
	private LayoutInflater mInflater = null;
	
	public Canvas circle(){
		int x = 700;
        int y = 200;
        int radius;
        Canvas canvas = new Canvas();
        radius = 300;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("#CD5C5C"));
        canvas.drawCircle(x / 2, y / 2, radius, paint);
        
        return canvas;
    }
		
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    Log.i(TAG, "onCreateView");
	    Log.d("LOCURA", "LLEGO");
	    // The last two arguments ensure LayoutParams are inflated properly.
	    View view = inflater.inflate(R.layout.map_view, container, false);
	   
	    ((SurfaceView) view.findViewById(R.id.surface)).draw(circle()); 
	    
	    return view;
	  }
	
}
