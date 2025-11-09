package D9;

import java.util.Random;

public class GameTest {
    String name;
    int boold;

    public GameTest() {
    }

    public GameTest(String name, int boold) {
        this.name = name;
        this.boold = boold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoold() {
        return boold;
    }

    public void setBoold(int boold) {
        this.boold = boold;
    }

    // Gt r1 = attack(r2)
    // add function 1,资料显示2.随机的攻击描述 3，按照血量的受伤状态
    public void attack(GameTest role) {
        // 随机扣血
        Random r = new Random();
        int hurt = r.nextInt(19) + 1;
        // 修改挨揍的人的血
        role.setBoold(getBoold() - hurt);
        if (role.getBoold() < 0)
            role.setBoold(0);

        System.out
                .println(this.getName() + "  attack" + role.getName() + "  lose" + hurt + "点血， " + role.getName() + "还剩"
                        + role.getBoold() + "滴血");
    }

}
