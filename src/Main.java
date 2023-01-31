public class Main {
    public static void main(String[] args) {
     Stusent stusent = new Stusent(19,"Sergey","Mirononv");
     Stusent prorotype= (Stusent) stusent.createPrototype();
        System.out.println(stusent);
        System.out.println("**************************************");
        System.out.println(prorotype);
        System.out.println(stusent.equals(prorotype));
    }
}