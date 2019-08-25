/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/25 11:05
 * description: 老阳开车去东北  用面向对象剖析
 * 老阳开车去云南
 * 老阳开飞机去黄冈
 * 老阳开火车去了上海
 * 老阳开火炮去了东北
 */
public class Test {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setName("老阳");
        driver.drive(new Car());    //默认去的地方

        driver.drive(new Plane(),new Address("黄冈"));

        driver.drive(new Vehicle("火车") {
            @Override
            public String go(Address address) {
                return "开" + getName() + "去了" + address.getName();
            }
        }.go(new Address("上海")));



        driver.drive(new Vehicle("火炮") {
            @Override
            public String go(Address address) {
                return null;
            }
        }.going(new Address("东北")));
    }
}
