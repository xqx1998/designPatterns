/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/25 11:12
 * description:
 */
public abstract class Vehicle {
    private String name;
    public abstract String go(Address address);

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String going(Address address){
        return "开"+name +"去了"+address.getName();
    }
}
