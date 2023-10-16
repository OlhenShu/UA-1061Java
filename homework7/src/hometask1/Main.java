// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package hometask1;
public class Main {

    private static Bird[] birds = {
            new Eagle("Eagle", "white and dark brown", 2),
            new Kiwi("Kiwi", "Dark brown", 2),
            new Swallow("Swallow", "dark,blue,red,pale", 4),
            new Penguin("Penguin", "Dark and white", 2)
    };
    public static void main(String[] args) {
        for (Bird bird : birds) {
            System.out.println(
                    bird.getName()+" Feather: "+bird.getFeathers()+" Layed eggs: "+bird.getEggs()+"  "+bird.fly()
            );
        }
    }
}