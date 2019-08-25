/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/25 11:29
 * description:
 */
public class Plane extends Vehicle {
    @Override
    public String go(Address address) {
        return "开飞机去"+address.getName();
    }
}
