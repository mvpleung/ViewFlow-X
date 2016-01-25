package org.taptwo.android;

import java.util.List;

import org.taptwo.android.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * 首页banner
 * 
 * @author LiangZiChao
 * @Data 2015�?6�?12�?
 */
public class ImageBannerAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<String> imgBannerList;
	private int[] resIds;
	private int count;

	public ImageBannerAdapter(Context context, List<String> imgBannerList) {
		init(context, imgBannerList, null);
	}

	public ImageBannerAdapter(Context context, int[] resIds) {
		init(context, null, resIds);
	}

	private void init(Context context, List<String> imgBannerList, int[] resIds) {
		this.resIds = resIds;
		this.imgBannerList = imgBannerList;
		this.mInflater = LayoutInflater.from(context);
		if (this.imgBannerList != null || resIds != null) {
			count = imgBannerList != null ? imgBannerList.size() : resIds != null ? resIds.length : 0;
		}
	}

	public void setResIds(int[] resIds) {
		this.resIds = resIds;
	}

	public void setImgList(List<String> list) {
		this.imgBannerList = list;
	}

	// 获得适配数据�? 数量
	public int getCount() {
		return count > 0 ? Integer.MAX_VALUE : 0;
	}

	@Override
	public Object getItem(int arg0) {
		return imgBannerList != null ? imgBannerList.get(arg0 % count) : resIds != null ? resIds[arg0 % count] : null;
	}

	@Override
	public long getItemId(int arg0) {
		return imgBannerList != null || resIds != null ? arg0 : 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		if (arg1 == null) {
			arg1 = mInflater.inflate(R.layout.adapter_image_item, arg2, false);
		}
		ImageView imageView = (ImageView) arg1;
		if (resIds != null && resIds.length > 0)
			imageView.setImageResource(resIds[arg0 % count]);
		return arg1;
	}

}
