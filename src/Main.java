public class Main {
    public static void main(String[] args) {
     Student stusent = new Student(19,"Sergey","Mirononv");
     Student prorotype= (Student) stusent.createPrototype();
        System.out.println(stusent);
        System.out.println("**************************************");
        System.out.println(prorotype);
        System.out.println(stusent.equals(prorotype));
    }
}