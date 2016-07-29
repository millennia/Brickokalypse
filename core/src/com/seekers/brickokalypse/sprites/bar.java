package com.seekers.brickokalypse.sprites;

/**
 * Created by Tempest on 2016-07-26.
 */
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

public class bar {
    private Vector3 position;
    private Texture plat;
    public bar (int x, int y){
        position = new Vector3(x,y,0);
        plat = new Texture("barofgame.png");

    }
    public Texture show(){
        return plat;
    }

    public Vector3 move (int i){
        if (i ==-1)
            position.add(+3,0,0);
        else if (i ==1)
            position.add(-3,0,0);
        return position;

    }

    /*could add unncecessary motion*/
}
