package dk.spirit55555.slashvote;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SlashVoteCommandExecutor implements CommandExecutor {
	private SlashVote plugin;

	public SlashVoteCommandExecutor(SlashVote instance) {
		this.plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		String message = plugin.getConfig().getString("message");
		this.showMessage(sender, message);
		
		return true;
	}
	
	private void showMessage(CommandSender sender, String message) {
		//Get the prefix
		String prefix = plugin.getConfig().getString("prefix");
		
		//Translate the colors
		prefix = ChatColor.translateAlternateColorCodes('&', prefix);
		message = ChatColor.translateAlternateColorCodes('&', message);
		
		//Send the message
		sender.sendMessage(prefix + message);
	}
}
