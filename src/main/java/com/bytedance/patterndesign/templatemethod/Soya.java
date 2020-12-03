package com.bytedance.patterndesign.templatemethod;

/**
 * @author yaojun
 * @create 2020-12-03 16:12
 */
public abstract class Soya {
    public void template(){
        selectMaterial();
        addCondiment();
        soakMaterial();
    }

    public void selectMaterial(){
        System.out.println("第一步：选择原材料");
    }
    public abstract void addCondiment();
    public void soakMaterial(){
        System.out.println("第三步：浸泡原材料");
    }
}
