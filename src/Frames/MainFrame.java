package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame
{
	private JFrame mainFrame;

	public void buildFrame()
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu gameMenu = new JMenu("Game");
		JMenu optionsMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");
		JMenuItem newGameMenu = new JMenuItem("New game");
		JMenuItem loadGameMenu = new JMenuItem("Load game");
		JMenuItem saveGameMenu = new JMenuItem("Save game");
		JMenuItem quitGameMenu = new JMenuItem("Quit");
		JMenuItem settingsOptionsMenu = new JMenuItem("Settings");
		JMenuItem helpHelpMenu = new JMenuItem("Help");
		JMenuItem updateHelpMenu = new JMenuItem("Check for update");
		JMenuItem aboutHelpMenu = new JMenuItem("About");

		mainFrame = new JFrame("Matta's Best RPG Game");
		JPanel startPanel = new JPanel();
		JPanel emptyPanel = new JPanel();
		JPanel buttonsPanel = new JPanel(new GridLayout(2, 1));
		JButton newGame = new JButton("New game");
		JButton loadGame = new JButton("Load game");
		Font font = new Font("Monospaced", Font.BOLD, 20);

		menuBar.add(gameMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);

		gameMenu.add(newGameMenu);
		gameMenu.add(loadGameMenu);
		gameMenu.add(saveGameMenu);
		gameMenu.add(quitGameMenu);

		optionsMenu.add(settingsOptionsMenu);

		helpMenu.add(helpHelpMenu);
		helpMenu.add(updateHelpMenu);
		helpMenu.add(aboutHelpMenu);

		newGameMenu.addActionListener(new NewGameListener());
		loadGameMenu.addActionListener(new LoadGameListener());
		saveGameMenu.addActionListener(new SaveGameListener());
		quitGameMenu.addActionListener(new QuitGameListener());
		settingsOptionsMenu.addActionListener(new SettingsGameListener());
		helpHelpMenu.addActionListener(new HelpGameListener());
		updateHelpMenu.addActionListener(new UpdateGameListener());
		aboutHelpMenu.addActionListener(new AboutGameListener());

		mainFrame.setJMenuBar(menuBar);

		newGame.setFont(font);
		newGame.addActionListener(new NewGameListener());

		loadGame.setFont(font);
		loadGame.addActionListener(new LoadGameListener());

		emptyPanel.setBackground(Color.darkGray);

		buttonsPanel.setPreferredSize(new Dimension(200, 100));
		buttonsPanel.setBackground(Color.darkGray);
		buttonsPanel.add(newGame);
		buttonsPanel.add(loadGame);

		startPanel.add(buttonsPanel);
		startPanel.setBackground(Color.darkGray);

		mainFrame.setLayout(new GridLayout(2, 1));
		mainFrame.getContentPane().add(BorderLayout.CENTER, emptyPanel);
		mainFrame.getContentPane().add(BorderLayout.CENTER, startPanel);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setSize(1200, 800);
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setVisible(true);
	}

	private class NewGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			mainFrame.getContentPane().removeAll();
			mainFrame.setTitle("Matta's Best RPG Game - Select Race");

			JPanel raceSelectorPanelUpper = new JPanel(new GridLayout(1, 3));
			JPanel raceSelectorPanelLower = new JPanel(new GridLayout(1, 3));
			JPanel raceImagePanel1 = new JPanel();
			JPanel raceImagePanel2 = new JPanel();
			JPanel raceImagePanel3 = new JPanel();
			JPanel raceInfoPanel1 = new JPanel();
			JPanel raceInfoPanel2 = new JPanel();
			JPanel raceInfoPanel3 = new JPanel();
			JTextArea vampireInfo = new JTextArea();
			JTextArea dwarfInfo = new JTextArea();
			JTextArea elfInfo = new JTextArea();
			String elfText1 = "Elves are slender and beautiful as well as annoying. They live in forests where they ";
			String elfText2 = "molest small animals and play boring music all night long. They are the perfect choice ";
			String elfText3 = "for depressed and sociopathic players who feel undervalued and misunderstood.";
			String dwarfText1 = "Dwarves have bad tempers and worse body odour. They rarely came out of their caves, ";
			String dwarfText2 = "much to the relief of all other races. They are the race of choice for people who ";
			String dwarfText3 = "speak with fake scottish accents at renaissance faires and feel uneasy around women.";
			String vampireText1 = "Vampires are stupid. They think they rule the night while they do nothing else ";
			String vampireText2 = "just sucking. The vampires 'life' is all about sucking. They suck all night long ";
			String vampireText3 = "and sleep while the sun is shining. They are the perfect choice for 'The Nobodies' ";
			String vampireText4 = "whom think they are 'Somebodies'.";

			raceImagePanel1.setBackground(Color.darkGray);
			raceImagePanel2.setBackground(Color.darkGray);
			raceImagePanel3.setBackground(Color.darkGray);
			raceInfoPanel1.setBackground(Color.darkGray);
			raceInfoPanel2.setBackground(Color.darkGray);
			raceInfoPanel3.setBackground(Color.darkGray);

			Font raceInfoFont = new Font("monospace", Font.PLAIN, 15);

			vampireInfo.setText(vampireText1 + vampireText2 + vampireText3 + vampireText4);
			vampireInfo.setFont(raceInfoFont);
			vampireInfo.setBackground(Color.darkGray);
			vampireInfo.setForeground(Color.white);
			vampireInfo.setLineWrap(true);
			vampireInfo.setWrapStyleWord(true);
			vampireInfo.setEditable(false);
			vampireInfo.setMinimumSize(new Dimension(200, 250));
			vampireInfo.setMaximumSize(new Dimension(500, 500));
			vampireInfo.setPreferredSize(new Dimension(300, 300));

			dwarfInfo.setText(dwarfText1 + dwarfText2 + dwarfText3);
			dwarfInfo.setFont(raceInfoFont);
			dwarfInfo.setBackground(Color.darkGray);
			dwarfInfo.setForeground(Color.white);
			dwarfInfo.setLineWrap(true);
			dwarfInfo.setWrapStyleWord(true);
			dwarfInfo.setEditable(false);
			dwarfInfo.setMinimumSize(new Dimension(200, 250));
			dwarfInfo.setMaximumSize(new Dimension(500, 500));
			dwarfInfo.setPreferredSize(new Dimension(300, 300));

			elfInfo.setText(elfText1 + elfText2 + elfText3);
			elfInfo.setFont(raceInfoFont);
			elfInfo.setBackground(Color.darkGray);
			elfInfo.setForeground(Color.white);
			elfInfo.setLineWrap(true);
			elfInfo.setWrapStyleWord(true);
			elfInfo.setEditable(false);
			elfInfo.setMinimumSize(new Dimension(200, 250));
			elfInfo.setMaximumSize(new Dimension(500, 500));
			elfInfo.setPreferredSize(new Dimension(300, 300));

			raceInfoPanel1.add(vampireInfo);
			raceInfoPanel2.add(dwarfInfo);
			raceInfoPanel3.add(elfInfo);

			raceSelectorPanelUpper.add(BorderLayout.CENTER, raceImagePanel1);
			raceSelectorPanelUpper.add(BorderLayout.CENTER, raceImagePanel2);
			raceSelectorPanelUpper.add(BorderLayout.CENTER, raceImagePanel3);
			raceSelectorPanelLower.add(BorderLayout.CENTER, raceInfoPanel1);
			raceSelectorPanelLower.add(BorderLayout.CENTER, raceInfoPanel2);
			raceSelectorPanelLower.add(BorderLayout.CENTER, raceInfoPanel3);

			mainFrame.getContentPane().add(BorderLayout.CENTER, raceSelectorPanelUpper);
			mainFrame.getContentPane().add(BorderLayout.CENTER, raceSelectorPanelLower);
			mainFrame.validate();
		}
	}

	private class LoadGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Load game");
		}
	}

	private class SaveGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Save game");
		}
	}

	private class QuitGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int result = JOptionPane.showOptionDialog(
					null,
					"Are you really want to quit?",
					"Are you really want to quit?",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					new String[]{"Yes, quit", "No, cancel"},
					"No, cancel");

			if(result == 0)
			{
				mainFrame.dispose();
			}
		}
	}

	private class SettingsGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Settings");
		}
	}

	private class HelpGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Help");
		}
	}

	private class UpdateGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Check update");
		}
	}

	private class AboutGameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(
					null,
					"Matta's Best RPG Game\nVersion 0.1",
					"About",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
