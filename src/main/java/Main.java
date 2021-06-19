public class Main {
    public static void main(String[] args) {

//        int x = 3;
//        int y;
//        System.out.println(x++);
//        System.out.println(++x);
//        System.out.println(x);
//
//        y=x++;
//        System.out.println(y);
//        y=++x;
//        System.out.println(y);
//        System.out.println(++y);

        int x;
        int dzienTygodnia = 1;
        switch(dzienTygodnia){
            case 1 :
                System.out.println("pierwszy jest poniedziałek");
                break;
            case 2 :
                System.out.println("drugi jest wtorek");
                break;
            case 3 :
                System.out.println("trzecia jest środa");
                break;
            default:
                System.out.println("a to się zawsze uruchomi -default");
        }

    }
}
