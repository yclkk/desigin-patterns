package com.zyc.ChapterTwo.ten;


/**
 * 鸵鸟，不会飞、会叫、会下蛋
 */
public class Ostrich implements Tweetable, Egglayable{

    private TweetAblility tweetAblility = new TweetAblility(); // 组合
    private EggLayAbility eggLayAbility = new EggLayAbility(); // 组合
    @Override
    public void layEgg() {
        // 委托
        eggLayAbility.layEgg();
    }

    @Override
    public void tweet() {
        // 委托
        tweetAblility.tweet();
    }
}
