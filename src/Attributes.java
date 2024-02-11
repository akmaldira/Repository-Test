public class Attributes {

    int x = 5;
    final int y = 5;

    public static void main(String[] args) {
        Attributes myObjX = new Attributes();
        myObjX.x = 40;
        System.out.println(myObjX.x);

        Attributes myObjY = new Attributes();
        // myObjY.y = 40; || will generate an error: cannot assign a value to a final variable
        System.out.println(myObjY.y);

        Attributes myObj1 = new Attributes();  // Object 1
        Attributes myObj2 = new Attributes();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }
}
