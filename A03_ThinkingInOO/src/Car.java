/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/25 11:06
 * description:
 */
public class Car extends Vehicle{

    @Override
    public String go(Address address) {
        return "开车去"+address.getName();
    }
}
