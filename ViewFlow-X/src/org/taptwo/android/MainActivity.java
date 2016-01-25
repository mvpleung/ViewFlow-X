package org.taptwo.android;

import org.taptwo.android.R;
import org.taptwo.android.widget.CircleIndicator;
import org.taptwo.android.widget.ViewFlow;
import org.taptwo.android.widget.ViewFlowCircleIndicator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		int[] resIds = new int[] { R.drawable.muwu, R.drawable.shuijiao, R.drawable.cbd, R.drawable.yuantiao };
		int size = resIds != null ? resIds.length : 0;

		ViewFlow mViewFlow = (ViewFlow) findViewById(R.id.viewflow);
		CircleIndicator mViewIndic = (CircleIndicator) findViewById(R.id.viewflowindic);

		mViewFlow.setFlowIndicator(mViewIndic);
		mViewFlow.setSideBuffer(size); // 实际图片数量
		ImageBannerAdapter mBannerAdapter = new ImageBannerAdapter(this, resIds);
		mViewFlow.setAdapter(mBannerAdapter);
		mViewFlow.startAutoFlowTimer();
		// mViewFlow.setSelection(1); // 设置初始位置

		ViewFlow mViewFlow1 = (ViewFlow) findViewById(R.id.viewflow1);
		ViewFlowCircleIndicator mViewIndic1 = (ViewFlowCircleIndicator) findViewById(R.id.viewflowindic1);

		mViewFlow1.setFlowIndicator(mViewIndic1);
		mViewFlow1.setSideBuffer(size); // 实际图片数量
		mBannerAdapter = new ImageBannerAdapter(this, resIds);
		mViewFlow1.setAdapter(mBannerAdapter);
		mViewFlow1.startAutoFlowTimer();
		// mViewFlow.setSelection(1); // 设置初始位置
	}
}
