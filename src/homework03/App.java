package homework03;



public class App {
    public static void main(String [] args){
        Televisor samsung = new Televisor("Samsung",20000);



        Televisor  haier = new Televisor("Haier",50000);



        Televisor sony = new Televisor("Sony", 30000);
        System.out.println(sony);
        System.out.println();
        System.out.println(haier);
        System.out.println();
        System.out.println(samsung);
        haier.setName("LG");
        System.out.println(haier.getName());



}
}