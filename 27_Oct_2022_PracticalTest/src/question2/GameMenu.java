package question2;

public class GameMenu {
	void startGame() {
		System.out.println("Start the Game");
	}
	void displayGameInstruction()
	{
		System.out.println("display game instruction");
	}
	void Exit()
	{
		System.out.println("Exit the game");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMenu obj=new GameMenu();
		int menuChoice=1;
		switch (menuChoice) {
	      case 1:
	    	  obj.startGame();
	        
	        break;
	      case 2:
	    	  obj.displayGameInstruction();
	       
	        break;
	      case 3:
	        obj.Exit();
	        break;

	}

}
}
