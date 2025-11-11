package D9;

public class pratice1 {
    public static void main(String[] args) {
        GameTest g = new GameTest("zhangsan", 100, '男');
        GameTest g2 = new GameTest("lisi", 100, '男');

        while (true) {
            g.attack(g2);
            if (g2.getBoold() == 0) {
                System.out.println(g2.getName() + " is loser");
                g.showRoleInfo();
                break;
            }
            g2.attack(g);
            if (g.getBoold() == 0) {
                System.out.println(g.getName() + " is loser");
                g2.showRoleInfo();
                break;
            }
        }
    }
}
