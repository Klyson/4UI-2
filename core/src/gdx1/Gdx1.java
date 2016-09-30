package gdx1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Gdx1 extends ApplicationAdapter {
	SpriteBatch asd;
	Texture img;
        Sprite sprite;
	
	@Override
	public void create () {
		asd = new SpriteBatch();
		img = new Texture("CoreSprite.png");
                sprite = new Sprite(img);
                sprite.setPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
               }

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		asd.begin();
		asd.draw(img, sprite.getX(), sprite.getY(), Gdx.graphics.getWidth()/5 , Gdx.graphics.getHeight()/5);
		asd.end();
	}
}