package hk;

public class TestZB {


    public static class fa{
        public void a(){
            System.out.println("faa");
        }
        public void b(){
            System.out.println("fbb");
        }
        public void ab(){
            a();
            b();
        }
    }

    public static class son extends  fa{
        public void a(){
            System.out.println("saa");
        }
        public void b(){
            System.out.println("sfbb");
        }
    }

    public static void main(String[] args) {
        son son  = new son();
        son.ab();
    }
}
