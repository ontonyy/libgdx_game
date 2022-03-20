package Packets;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;
import com.bigeggs.client.models.Player;

public class PacketCreator {

    public static PacketAddPlayer createPacketAddPlayer(String name) {
        PacketAddPlayer packetConnect = new PacketAddPlayer();
        packetConnect.setPlayerName(name);
        return packetConnect;
    }

    public static PacketUpdatePlayerInfo createPacketUpdatePlayer(float x, float y, float angle, String direction, int health, int id) {
        PacketUpdatePlayerInfo packetPlayerInfo = new PacketUpdatePlayerInfo();
        packetPlayerInfo.setX(x);
        packetPlayerInfo.setY(y);
        packetPlayerInfo.setAngle(angle);
        packetPlayerInfo.setDirection(direction);
        packetPlayerInfo.setHealth(health);
        packetPlayerInfo.setId(id);
        return packetPlayerInfo;
    }

    public static PacketBullet createPacketBullet(float posX, float posY, float dirX, float dirY) {
        PacketBullet packetBullet = new PacketBullet();
        packetBullet.setDirectionX(dirX);
        packetBullet.setDirectionY(dirY);
        packetBullet.setPositionX(posX);
        packetBullet.setPositionY(posY);
        return packetBullet;
    }

    public static PacketRemovePlayer createPacketRemovePlayer(int id) {
        PacketRemovePlayer removePlayer = new PacketRemovePlayer();
        removePlayer.setId(id);
        return removePlayer;
    }

    public static PacketAddEnemyAI createPacketEnemyAI(float x, float y, float angle, int health, int id, String follow) {
        PacketAddEnemyAI packetAddEnemyAI = new PacketAddEnemyAI();
        packetAddEnemyAI.setX(x);
        packetAddEnemyAI.setY(y);
        packetAddEnemyAI.setAngle(angle);
        packetAddEnemyAI.setHealth(health);
        packetAddEnemyAI.setId(id);
        packetAddEnemyAI.setFollowPlayer(follow);
        return packetAddEnemyAI;
    }

    public static PacketUpdateEnemyAI createPacketUpdateEnemyAI(float x, float y, float angle, int health, int id, String follow) {
        PacketUpdateEnemyAI packetAddEnemyAI = new PacketUpdateEnemyAI();
        packetAddEnemyAI.setX(x);
        packetAddEnemyAI.setY(y);
        packetAddEnemyAI.setAngle(angle);
        packetAddEnemyAI.setHealth(health);
        packetAddEnemyAI.setId(id);
        packetAddEnemyAI.setFollowPlayer(follow);
        return packetAddEnemyAI;
    }

    public static PacketBoost createPacketBoost(float x, float y, String type) {
        PacketBoost boost = new PacketBoost();
        boost.setX(x);
        boost.setY(y);
        boost.setType(type);
        return boost;
    }
    public static PacketRemoveBoost createPacketRemoveBoost(float x, float y) {
        PacketRemoveBoost removeBoost = new PacketRemoveBoost();
        removeBoost.setX(x);
        removeBoost.setY(y);
        return removeBoost;
    }
}