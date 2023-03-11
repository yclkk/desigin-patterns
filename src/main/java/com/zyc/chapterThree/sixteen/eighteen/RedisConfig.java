package com.zyc.chapterThree.sixteen.eighteen;

public class RedisConfig implements Updater {
    private ConfigSource configSource;

    private String address;

    private int timeout;

    private int maxTotal;

    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
    public void update() {
        this.timeout = this.configSource.getTimeout();
        this.address = this.configSource.getAddress();
        this.maxTotal = this.configSource.getTotal();
    }

    public void init() {
        // init configSource
    }



}
