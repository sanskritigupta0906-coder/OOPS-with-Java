class staticDemo {
    static int a=10;
    int b=20;

    static class inner{
        static void display(){
            System.out.println("Inside static Inner class");
        }
    }

    void non_static_display(){
        System.out.println("Inside non static method");
    }

    public static void main(String[] args) {
        System.out.println(staticDemo.a);
        staticDemo.inner.display();
    }
}
