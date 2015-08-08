package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame
{
	private JFrame mainFrame;
	private JPanel startPanel;
	private JPanel emptyPanel;

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
		startPanel = new JPanel();
		emptyPanel = new JPanel();
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
			System.out.println("New game");
			mainFrame.remove(emptyPanel);
			mainFrame.remove(startPanel);
			mainFrame.repaint();
			System.out.println("panels are not visible anymore");

			JPanel characterCreatorPanelUpper = new JPanel();
			JPanel characterCreatorPanelLower = new JPanel();
			characterCreatorPanelUpper.setBackground(Color.yellow);
			characterCreatorPanelLower.setBackground(Color.green);
			mainFrame.getContentPane().add(BorderLayout.CENTER, characterCreatorPanelUpper);
			mainFrame.getContentPane().add(BorderLayout.CENTER, characterCreatorPanelLower);
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
			System.out.println("Quit game");

			int result = JOptionPane.showOptionDialog(null,
					"Are you really want to quit?",
					"Are you really want to quit?",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					new String[]{"Yes, quit", "No, cancel"},
					"No, cancel");

			if(result == 0)
			{
				System.out.println("Yes, quit");
				mainFrame.dispose();
			}//the else is removable
			else
			{
				System.out.println("No, cancel");
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
			System.out.println("About");

			JOptionPane.showMessageDialog(null, "Matta's Best RPG Game\nVersion 0.1", "About", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
