package com.jcs_java_sdk.compute_api.model;

public class CreateSnapshotRequest
{
	private String volumeId;
	
	public CreateSnapshotRequest(){}

	public String getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
	
}