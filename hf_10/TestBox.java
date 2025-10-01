package hf_10;

public class TestBox {
    private Integer i = 2;
    private int j = 3;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}