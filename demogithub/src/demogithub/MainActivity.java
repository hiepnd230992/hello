package demogithub;

import java.text.DecimalFormat;
import java.util.Vector;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.example.demogithub.R;

public class MainActivity extends Activity implements OnTouchListener{
	private XYPlot mySimpleXYPlot;
    private SimpleXYSeries mySeries;
    private PointF minXY;
    private PointF maxXY;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
}
