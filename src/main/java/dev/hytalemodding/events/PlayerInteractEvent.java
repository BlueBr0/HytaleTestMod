package dev.hytalemodding.events;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.Entity;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.ecs.UseBlockEvent;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;

public class PlayerInteractEvent {

    public static void onPlayerUseBlock(UseBlockEvent.Post event) {
        Ref<EntityStore> e = event.getContext().getEntity();
        //Player player = event.getPlayer();
        //player.sendMessage(Message.raw("Welcome " + player.getDisplayName()));
    }
}
