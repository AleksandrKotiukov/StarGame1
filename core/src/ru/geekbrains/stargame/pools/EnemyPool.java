package ru.geekbrains.stargame.pools;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.geekbrains.stargame.base.Sprite;
import ru.geekbrains.stargame.base.SpritesPool;
import ru.geekbrains.stargame.math.Rect;
import ru.geekbrains.stargame.sprite.Enemy;

/**
 * Created by Alexey on 11.07.2018.
 */

public class EnemyPool extends SpritesPool<Enemy> {

    private BulletPool bulletPool;
    private Rect worldBounds;

    public EnemyPool(BulletPool bulletPool, Rect worldBounds) {
        this.bulletPool = bulletPool;
        this.worldBounds = worldBounds;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, worldBounds);
    }
}
