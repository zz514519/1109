/**
 * Author : Zhang Zhe
 */
public class Link {
    public static void main(String[] args) {
        MyLink myLink = new MyLink();
        myLink.add(0,34);
        myLink.add(1,55);
        myLink.display();
        myLink.remove(34);
        myLink.display();
    }
}
