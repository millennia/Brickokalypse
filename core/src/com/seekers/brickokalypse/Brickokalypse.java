package com.seekers.brickokalypse;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.seekers.brickokalypse.sprites.bar;


public class Brickokalypse extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	bar play;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		play = new bar(4,3);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(play.show(),0,0);
		batch.end();
	}

	/*following is a temporary playsate for implementing purpose*/


	public void update(){
		if(Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)){
			play.move(3);
		}
		else if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT)){
			play.move(-3);
		}

	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
