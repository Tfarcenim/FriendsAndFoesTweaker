package tfar.friendsandfoestweaker;

import net.minecraftforge.fml.common.Mod;

@Mod(FriendsAndFoesTweaker.MOD_ID)
public class FriendsAndFoesTweakerForge {
    
    public FriendsAndFoesTweakerForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        FriendsAndFoesTweaker.init();
        
    }
}