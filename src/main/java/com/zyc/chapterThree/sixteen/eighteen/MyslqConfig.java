package com.zyc.chapterThree.sixteen.eighteen;

public class MyslqConfig {
    private ConfigSource configSource;

    private String address;

    private int timeout;

    private int maxTotal;

    public MyslqConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public void update() {
        this.address = this.configSource.getAddress();
        this.timeout = this.configSource.getTimeout();
        this.maxTotal = this.configSource.getTotal();
    }
}
