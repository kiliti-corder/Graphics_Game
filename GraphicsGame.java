import java.util.Scanner;

public class GraphicsGame {




    //menu
    public void menu(){
        while(true){
            System.out.println("1.Start game!");
            System.out.println("2.Close game!");
            Scanner scan = new Scanner(System.in);
            int select = scan.nextInt();
            if (select == 1){
                playGame();
            } else {
                break;
            }
        }
    }

    //map
    public void map(int playerCoordinate){
         {
             for (int i = 0; i < 8; i++) {
                 System.out.print("*");
             }
             System.out.println();
             for (int i = 0; i < 8; i++) {
                 if (i == 0 || i == 7){
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
             for (int i = 0; i < 8; i++) {
                 if (i == 0 || i == 7){
                     System.out.print("*");
                 } else if(i == 1){
                     System.out.print("^");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
             for (int i = 0; i < 8; i++) {
                 System.out.print("*");
             }
             System.out.println();
        }


    }

    //play
    public void playGame() {

        System.out.println("Please input 'w','s','d','a' to control direction");
        System.out.println("You can input map to check map");
        Scanner scan = new Scanner(System.in);
        String map = scan.next();

        while (true){

            if (map.equals("map")){
                map(0);
                System.out.println("continue input direct");
            }
            String Direct = scan.next();
            if (Direct.equals("w")){

                System.out.println("You control your character up one step,check the map");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                map(0);
                break;
            }
        }

    }

    public static void main(String[] args) {
        GraphicsGame gg = new GraphicsGame();
        gg.menu();
    }

}
