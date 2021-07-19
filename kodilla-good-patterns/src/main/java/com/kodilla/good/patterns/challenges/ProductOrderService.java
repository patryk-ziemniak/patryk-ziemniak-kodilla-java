package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final OrderService orderService, final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public void process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.add(orderRequest);
        } else {
            System.out.println("Order couldn't be completed");
        }
    }

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new GameOrderService(),
                new EmailInformationService(), new TextOrderRepository());

        productOrderService.process(orderRequest);
    }
}
