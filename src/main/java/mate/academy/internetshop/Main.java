package mate.academy.internetshop;

public class Main {

    /*
    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Inject
    private static UserService userService;
    @Inject
    private static OrderService orderService;
    @Inject
    private static ItemService itemService;
    @Inject
    private static BucketService bucketService;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            itemService.create(new Item());
        }
        System.out.println(itemService.getAllItems());
        User user = userService.create(new User());
        user.setName("Some user");
        Bucket bucket = bucketService.create(new Bucket());
        bucket.setUser(user.getId());
        bucket.setItems(new ArrayList<>(itemService.getAllItems()));
        Item item = itemService.create(new Item());
        item.setName("some item");
        System.out.println(item.getName() + " " + item.getId());
        bucketService.addItem(bucket, item);
        Order order  = orderService.completeOrder(bucket.getItems(), user);
        System.out.println(userService.get(order.getUser())
                + " " + order.getId()
                + " " + order.getItems());
    }*/
}
