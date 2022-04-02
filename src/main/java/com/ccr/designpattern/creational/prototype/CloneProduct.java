package com.ccr.designpattern.creational.prototype;

/**
 * JDK 自带克隆方法
 */
public class CloneProduct implements Cloneable {

    private String name;

    private String type;

    private Detail detail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneProduct cloneProduct = (CloneProduct) super.clone();
        // 深拷贝
        // cloneProduct.detail = (Detail) cloneProduct.detail.clone();
        return cloneProduct;
    }

    @Override
    public String toString() {
        return "CloneProduct{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", detail=" + detail +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneProduct cloneProduct = new CloneProduct();
        cloneProduct.setName("name");
        cloneProduct.setType("type");
        Detail detail = new Detail();
        detail.setDesc("desc");
        cloneProduct.setDetail(detail);

        CloneProduct cloneProduct2 = (CloneProduct) cloneProduct.clone();

        System.out.println("=========CloneProduct=========");
        System.out.println(cloneProduct.equals(cloneProduct2));
        System.out.println(cloneProduct == cloneProduct2);
        System.out.println(cloneProduct);
        System.out.println(cloneProduct2);
        System.out.println("---------hashCode---------");
        System.out.println(cloneProduct.hashCode());
        System.out.println(cloneProduct2.hashCode());
        System.out.println("---------内存地址---------");
        System.out.println(System.identityHashCode(cloneProduct));
        System.out.println(System.identityHashCode(cloneProduct2));
        System.out.println();
        System.out.println("=========CloneProduct.Detail=========");
        System.out.println(cloneProduct.getDetail().equals(cloneProduct2.getDetail()));
        System.out.println(cloneProduct.getDetail() == cloneProduct2.getDetail());
        System.out.println("---------hashCode---------");
        System.out.println(cloneProduct.hashCode());
        System.out.println(cloneProduct2.hashCode());
        System.out.println("---------内存地址---------");
        System.out.println(System.identityHashCode(cloneProduct.getDetail()));
        System.out.println(System.identityHashCode(cloneProduct2.getDetail()));

    }
}
