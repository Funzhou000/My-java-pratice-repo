package D9;

import java.util.Random;

public class GameTest {
    private String name;
    private int boold;
    private char gender;
    private String face;
    String[] boyfaces = { "风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞" };
    String[] girlfaces = { "美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹" };
    // attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    // injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public GameTest() {
    }

    public GameTest(String name, int boold, char gender) {
        this.name = name;
        this.boold = boold;
        this.gender = gender;
        // setface
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        int index;
        if (gender == '男') {
            // 随机样貌
            Random r = new Random();
            index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            Random r = new Random();
            index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }

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
        Random ra = new Random();
        String kunfu = attacks_desc[ra.nextInt(attacks_desc.length)];
        System.out.printf(kunfu, this.name, role.getName());
        System.out.println(" ");
        // 随机扣血
        Random r = new Random();
        int hurt = r.nextInt(19) + 1;
        // 修改挨揍的人的血
        role.setBoold(getBoold() - hurt);
        if (role.getBoold() < 0)
            role.setBoold(0);
        // 先获取一次血量值
        int blood = role.getBoold();

        if (blood >= 90) {
            // 假设 [0] 是 90% 及以上的状态 (例如：状态良好)
            // 注意这里用了 System.err.println
            // 在格式字符串末尾添加 \n 来实现换行
            System.err.printf(injureds_desc[0] + "\n", role.getName());
        } else if (blood >= 80) { // 能到这里，说明
            // 自动隐含了 blood < 90 (例如：80-89)
            System.out.printf(injureds_desc[1] + "\n", role.getName());
        } else if (blood >= 70) { // 自动隐含了 blood < 80 (例如：70-79)
            System.out.printf(injureds_desc[2] + "\n", role.getName());
        } else if (blood >= 60) { // (例如：60-69)
            System.out.printf(injureds_desc[3] + "\n", role.getName());
        } else if (blood >= 50) { // (例如：50-59)
            System.out.printf(injureds_desc[4] + "\n", role.getName());
        } else if (blood >= 40) { // (例如：40-49)
            System.out.printf(injureds_desc[5] + "\n", role.getName());
        } else if (blood >= 30) { // (例如：30-39)
            System.out.printf(injureds_desc[6] + "\n", role.getName());
        } else {
            // 所有 < 30 的情况
            // 注意这里用的是 role，不是 role.getName()，保持原样
            System.out.printf(injureds_desc[7] + "\n", role);
        }
        // System.out
        // .println(this.getName() + " attack" + role.getName() + " lose" + hurt + "点血，
        // " + role.getName() + "还剩"
        // + role.getBoold() + "滴血");
    }

    public void showRoleInfo() {
        System.out.println("姓名；" + getName());
        System.out.println("血量" + getBoold());
        System.out.println("gender:" + getGender());
        System.out.println("face:" + getFace());
    }

}
