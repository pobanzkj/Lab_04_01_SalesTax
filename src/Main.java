public class Main {
    public static void main(String[] args) {
        double itemprice = 10;
        double salestax = itemprice * .05;
        double totalprice = itemprice + salestax;
        System.out.println("Your item is $" + itemprice);
        System.out.println("The amount of tax is $" + salestax);
        System.out.println("Your total price is $" + totalprice);
    }
}