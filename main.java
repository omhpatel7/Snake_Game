import javax.swing.*;

public class main {
	public static void main(String[] args) throws Exception{
		// 23:57
		int boardWidth = 600;
		int boardHeight = boardWidth;
		
		JFrame frame = new JFrame("Game_Pad");
		frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Game game = new Game(boardWidth, boardHeight);
		frame.add(game);
		frame.pack();
		
		game.requestFocus();
	}
}
