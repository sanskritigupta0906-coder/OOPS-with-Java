class circle{
    double r;
    double pi=3.14;

    circle(double r){
        this.r=r;
    }

    void area(double r){
        System.out.println(pi*r*r);
    }

    public static void main(String[] args) {
        double r=7.0;


        circle c=new circle(r);
        c.area(r);

    }


}