package ru.itis.inf301.game;

public class Main {
    private Entity[] entities = new Entity[3];
    public static void main(String[] args) {
        Main game = new Main();
        game.start();
        game.win();
    }
    public void start(){
        entities[0] = new Ant("Муравей");
        entities[1] = new Gusen("Гусеница");
        entities[2] = new Turtle("Черепаха");
        //entities[3] = new Somewhat("Нечто");
        for (Entity entity : entities){
            entity.init();
        }
    }
    public void win(){
        while (true){
            for (Entity entity: entities){
               // Point point = ;
                if (inSquare(entity.move())){
                    System.out.print("Победил - ");
                    entity.print();
                    return;
                }
            }
        }
    }
    public static boolean inSquare(Point point){
        return ((point.getRow()>=400) && (point.getRow()<=600) && (point.getColumn()>=400) && (point.getColumn()<=600));
    }


}
