import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party, int startRow){
    for (int i = 0; i < party.size(); i++) {
      int col = ((WIDTH / 3) * i) + 2;
      Text.go(startRow, col);
      System.out.println(party.get(i));
      Text.go(startRow + 1, col);
      System.out.println(party.get(i).getSpecialName() + ": " + party.get(i).getSpecial() + "/" + party.get(i).getSpecialMax());
      Text.go(startRow + 2, col);
      System.out.println(colorHP(party.get(i)));
    }
  }

  public static String colorHP(Adventurer p) {
    String res = "" + p.getHP();
    double percent = (p.getHP() * 1.0) / (p.getmaxHP() * 1.0);
    if (percent < 0.25) {
      return("HP: " + Text.colorize(res, Text.RED, Text.BOLD) + "/" + p.getmaxHP());
    }
    if (percent > 0.75) {
      return ("HP: " + Text.colorize(res, Text.GREEN, Text.BOLD) + "/" + p.getmaxHP());
    }
    if (percent <= 0.75 && percent >= 0.25){
      return ("HP: " + Text.colorize(res, Text.YELLOW, Text.BOLD) + "/" + p.getmaxHP());
    }
    else {
      return ("HP: " + Text.colorize(res, Text.YELLOW, Text.BOLD) + "/" + p.getmaxHP());
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s, int startRow){
    Text.go(startRow, 2);
    System.out.println(s);
  }

  public static void drawScreen(){
    Text.clear();
    for (int i = 0; i < HEIGHT; i++) {
      Text.go(i, 0);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
      Text.go(i + 1, WIDTH );
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
    }

    for (int j = 0; j < WIDTH; j++) {
      Text.go(0, j);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
      Text.go(HEIGHT, j + 1);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
    }
    Text.go(HEIGHT + 1, 0);
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    enemies.add(new EnemyStand("DIO", 54, 150, "ZA WARUDO"));

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    party.add(new Warrior("Geralt"));
    party.add(new EnemyStand("JOTARO", 45, 102, "STAR PLATINUM"));
    party.add(new Wizard("Edward"));

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;
    int ranEnemies = (int)(Math.random() * enemies.size());
    //int ranPlayers = (int)(Math.random() * party.size());

    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack") || input.equals("")){
          drawText(party.get(whichPlayer).attack(enemies.get(ranEnemies)), 12);
        }
        else if(input.equals("special")){
          drawText(party.get(whichPlayer).specialAttack(enemies.get(ranEnemies)), 12);
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else {
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if (turn > 0){
          int ranAttack = (int)(Math.random()*10);
          if (ranAttack == 9) {
            drawText(enemies.get(0).specialAttack(party.get((int)(Math.random() * party.size()))), 12);
          } else {
            drawText(enemies.get(0).attack(party.get((int)(Math.random() * party.size()))), 12);
          }
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for " + party.get(whichPlayer )+ ": attack/special/quit", HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
