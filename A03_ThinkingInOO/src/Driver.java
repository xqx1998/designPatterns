/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/25 11:05
 * description:
 */
public class Driver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void drive(Vehicle vehicle) {
        System.out.println(name+vehicle.go(new Address("云南")));
    }

    public void drive(Vehicle vehicle, Address address) {
        System.out.println(name+vehicle.go(address));
    }

    public void drive(String go) {
        System.out.println(name+go);
    }
}
