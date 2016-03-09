package dk.spirit55555.slashvote;

import org.bukkit.plugin.java.JavaPlugin;

public class SlashVote extends JavaPlugin {
	public final SlashVoteCommandExecutor commandExecutor = new SlashVoteCommandExecutor(this);
	
	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		this.getCommand("vote").setExecutor(this.commandExecutor);
	}
}