package com.mapManagement;

import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class Painter extends ItemizedOverlay {
	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	
	
	public Painter(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker));		// TODO Auto-generated constructor stub
	}
	public void addOverlay(OverlayItem overlay) {
	    mOverlays.add(overlay);
	    populate();
	}
	@Override
	protected OverlayItem createItem(int i) {
	  return mOverlays.get(i);
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return mOverlays.size();
		}


}
