package SelectDemo;

public class 运行时多态 {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;

        public A (int v){
          setValue(v);//下面B显示调用A构造使用的setvalue是自身的
            // setValue
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            try{
                value++;
                return value;//第一遍返回11 第二遍17
            }finally {
                this.setValue(value);//B的 2*11 2*17
                System.out.println(value);//第一遍打印22
            }
        }

    }
    static class B extends A{
        public B(){
            super(5);
            setValue(getValue()-3);
        }
        public void setValue(int value){
            super.setValue(2*value);
        }
    }
}
