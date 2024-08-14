class PoorDog {
    private int size;
    private String name;
    public int getSize() {
    return size;
    }
    public String getName() {
    return name;
    }
   }
   public class DogTestDrive{
    public static void main(String[] args) {
    PoorDog one = new PoorDog();
    System.out.println("Dog size is " + one.getSize());
    System.out.println("Dog name is " + one.getName());
    }
}
/*  Output
Dog size is 0
Dog name is null
*/