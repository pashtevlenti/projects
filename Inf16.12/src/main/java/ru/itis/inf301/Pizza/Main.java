package ru.itis.inf301.Pizza;


public class Main{
    public static void main(String[] args) {
        Client client1 = new Client("Костя",Gender.male,Discounts.students);
        Client client2 = new Client("Валя",Gender.female,Discounts.pensioners);
        Client client3 = new Client("Ишхан",Gender.male);

        Cook cook1 = new Cook("Паша",Gender.male);
        Cook cook2 = new Cook("Роберт",Gender.male);


        NextNumbers queue = new NextNumbers();
        Order order1 = new Order(client1,cook1,Pizza.macaralla,"12:10",StatusOrder.processing,1);
        System.out.println("Заказ номер 1 готовится, номер в очереди: "+queue.next());
        order1.setStatus(StatusOrder.complete);
        Order order2 = new Order(client2,cook2,Pizza.cezar,"12:20",StatusOrder.processing,2);
        order2.setStatus(StatusOrder.complete);
        System.out.println("Заказ номер 2 готовится, номер в очереди: "+queue.next());
        System.out.println("Заказы номер 1 и 2 готовы");
        Order orderI;
        int k = 3;
        for (int i = 3; i < 16; ++i){
            orderI = new Order(client3,cook2,Pizza.corbanara,StatusOrder.processing,i);
            orderI.setStatus(StatusOrder.complete);
            System.out.println("Заказ номер "+i+" готовится, номер в очереди: "+queue.next());
            if (i % 5 == 0){
                System.out.println("Заказы номер "+k+"-"+i+" готовы");
                k = i + 1;
            }
        }
    }
}