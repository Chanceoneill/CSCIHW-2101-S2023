package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an instance of the Pyramid class and call the makePyramid method (see Pyramid.java for more info)

        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)

        Adlibs a = new Adlibs();
        System.out.println(a.generatestory("Chance", 27, "Blue"));
        

        Pyramid b = new Pyramid();
        b.Output();
        Pyramid.Output();

       Replace c = new Replace(); 
       System.out.println(c.charReplace("I MAKE BREAD", 2, 'T'));
    }
}

