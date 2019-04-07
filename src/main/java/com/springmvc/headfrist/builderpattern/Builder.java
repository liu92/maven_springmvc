package com.springmvc.headfrist.builderpattern;

/**
 * ClassName: Builder
 * Description: 声明了具体建造者的公共接口(产品的创建过程，产品返回过程)， 组装电脑的过程
 * Author:   lin
 * Date:     2019/3/10 12:04
 * History:
 * <version> 1.0
 */
public abstract class Builder {
  /**
   * 1，装cpu,声明为抽象方法，具体由子类实现
   * @return void
   * @author lin
   * @Date 12:07 2019/3/10
   **/
  public abstract void  buliderCup();
    /**
     * 2，装主板,声明为抽象方法，具体由子类实现
     * @return void
     * @author lin
     * @Date 12:07 2019/3/10
     **/
  public abstract  void  buliderMainboard();
    /**
     * 3，装主板,声明为抽象方法，具体由子类实现
     * @return void
     * @author lin
     * @Date 12:07 2019/3/10
     **/
  public abstract void buliedrSsd();
  /**
   * 4、返回产品的方法：获得组装好的电脑
   * @return:
   * @since: 1.0.0
   * @Author:lin
   * @Date: 2019/3/10 12:16
   */
  public  abstract  Computer getComputer();
}
