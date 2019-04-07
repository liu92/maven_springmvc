package com.springmvc.headfrist.strategy.bookpritice;
/**
 * 功能描述: <br>
 * 〈〉
 *
 * @return:
 * @since: 1.0.0
 * @Author:lin
 * @Date: 2019/3/6 14:40
 */

public abstract class Duck {
    /**
     *
      为行为接口类型声明两个引用变量
     */

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}


  public  abstract  void display();

  public void performFly(){
        flyBehavior.fly();
  }

  public void performQuack(){
          quackBehavior.quack();
  }

  public void swim(){
      System.out.print("All ducks floa ,even decoys!");
  }

  /**
   * 功能描述: <br>
   * 〈〉
   *
   在Duck中新加入两个新的方法
   */

    public void setFlyBehavior(FlyBehavior fb){
      flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
