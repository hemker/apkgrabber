package com.apkgetter.event;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import com.apkgetter.model.Update;

import java.util.List;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class UpdateFinalProgressEvent
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private List<Update> mUpdate;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public UpdateFinalProgressEvent(
		List<Update> u
	) {
		mUpdate = u;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public List<Update> getUpdates(
	) {
		return mUpdate;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
