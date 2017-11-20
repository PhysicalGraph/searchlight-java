package com.smartthings.searchlight.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Device {
    private @Id @GeneratedValue long id;
    private String[] mCapabilities;
    private String mDeviceType;
    private String mDeviceUuid;
    private String mDisplayName;
    private String mLabel;
    private String mAccountId;

    // Private Default Constructor
    private Device() {}

    public Device (String[] capabilities, String deviceType, String deviceUuid, String label, String accountId) {
        mCapabilities = capabilities;
        mDeviceType = deviceType;
        mDeviceUuid = deviceUuid;
        mLabel = label;
        mAccountId = accountId;
    }

}

