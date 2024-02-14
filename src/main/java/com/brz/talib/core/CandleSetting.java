package com.brz.talib.core;

public class CandleSetting {

    CandleSettingType settingType;
    RangeType rangeType;
    int avgPeriod;
    double factor;

    /**
     * Creates a new instance of TA_CandleSetting
     **/
    public CandleSetting(CandleSettingType settingType, RangeType rangeType, int avgPeriod, double factor) {
        this.settingType = settingType;
        this.rangeType = rangeType;
        this.avgPeriod = avgPeriod;
        this.factor = factor;
    }

    public CandleSetting(CandleSetting that) {
        this.settingType = that.settingType;
        this.rangeType = that.rangeType;
        this.avgPeriod = that.avgPeriod;
        this.factor = that.factor;
    }

    public void copyFrom(CandleSetting src) {
        this.settingType = src.settingType;
        this.rangeType = src.rangeType;
        this.avgPeriod = src.avgPeriod;
        this.factor = src.factor;
    }
}
