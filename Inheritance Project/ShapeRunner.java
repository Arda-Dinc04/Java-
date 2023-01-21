public class ShapeRunner
{
    public static void main(String[] args)
    {
        RectangularPrism boxy = new RectangularPrism("yellow", 7.5, 8.1, 9.4);
        Sphere bally = new Sphere("emerald green", 4.9);
        Cube cuby = new Cube("dirt", 6.6);

        RectangularPrism greenBoxy = new RectangularPrism("green", 7.5, 8.1, 9.4);
        RectangularPrism boxy2 = new RectangularPrism("yellow", 11.9, 2.4, 10.8);
        Sphere ball1 = new Sphere("blue", 7.2);  
        Sphere ball2 = new Sphere("blue", 7.2);  
        Sphere ball3 = new Sphere("blue", 7.2);  
        Sphere ball4 = new Sphere("blue", 7.2);  
        Cube cube1 = new Cube("red", 5.5);  
        Cube cube2 = new Cube("red", 5.5);  
        Cube cube3 = new Cube("red", 5.5);  
        Cube cube4 = new Cube("red", 5.5);  
        Cube cube5 = new Cube("red", 5.5);  
        Cube cube6 = new Cube("red", 5.5);  
        Cube cube7 = new Cube("red", 5.5);  

        System.out.println("Printing out our shapes:  ");
        System.out.println(boxy + "\n" + bally + "\n" + cuby);

        System.out.println("\nChanging up the dimensions.\n");       

        boxy.setLength(11.9);  //These dimensions match boxy2, which is useful later
        boxy.setWidth(2.4);  //These dimensions match boxy2, which is useful later
        boxy.setHeight(10.8);  //These dimensions match boxy2, which is useful later       
        bally.setRadius(3.91);
        cuby.setWidth(4.24);
        cuby.setLength(6.9);
        cuby.setHeight(7.2);

        System.out.println("The new length of boxy is:  " + boxy.getLength()); 
        System.out.println("The new width of boxy is:  " + boxy.getWidth());
        System.out.println("The new height of boxy is:  " + boxy.getHeight());
        System.out.println("The new radius of bally is:  " + bally.getRadius());
        System.out.println("The new length of cuby is:  " + cuby.getLength());
        System.out.println("The new width of cuby is:  " + cuby.getWidth());
        System.out.println("The new height of cuby is:  " + cuby.getHeight());

        System.out.println("\nTesting out the volumes now:");
        System.out.println("The volume of boxy is:  " + boxy.getVolume());
        System.out.println("The volume of ballyy is:  " + bally.getVolume());
        System.out.println("The volume of cuby is:  " + cuby.getVolume());

        System.out.println("\nTesting out the equals methods now:");
        System.out.println("This should be false:  " + boxy.equals(bally));
        System.out.println("This should be false:  " + bally.equals(cuby));
        System.out.println("This should be false:  " + cuby.equals(boxy));
        System.out.println("This should be true:  " + cube1.equals(cube2));
        System.out.println("This should be true:  " + ball1.equals(ball2));
        System.out.println("This should be false:  " + boxy.equals(greenBoxy));
        System.out.println("This should be true:  " + boxy.equals(boxy2));
        System.out.println("This should be true:  " + boxy.equals(boxy));

        System.out.println("\nThere have been " + Solid.getSolidCount() + " Solids made so far.");
        System.out.print("There have been " + RectangularPrism.getRectangularPrismCount());
        System.out.println(" RectangularPrisms made so far.");
        System.out.println("There have been " + Sphere.getSphereCount() + " Spheres made so far.");
        System.out.println("There have been " + Cube.getCubeCount() + " Cubes made so far.");

    }
}
