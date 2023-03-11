package com.zyc.chapterThree.sixteen.eighteen;

public class KafkaConfig implements Updater{
    private ConfigSource configSource;

    private String address;

    private int timeoiut;

    private int maxTotal;

    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
    public void update() {
        this.address = this.configSource.getAddress();
        this.timeoiut = this.configSource.getTimeout();
        this.maxTotal = this.configSource.getTotal();
    }
}
