package world.entities;

import java.awt.Color;
import java.awt.Graphics;

import world.HXWorld;

public class WorldBorder extends HXEntity {

	/**
	 * Template for creating a new entiity. Should always override drawing, to have
	 * some sort of visual appearence in the world. But should still call super.draw()
	 * Constructor should always call init() method of HXEntity
	 * @param xPos
	 * @param yPos
	 * @param xVel
	 * @param yVel
	 * @param w
	 */
	public WorldBorder(HXWorld w) {
		init(null, 0, 0, w.getWidth(), w.getHeight(), 0, 0, 1, -1, w.getScale(), false, w);
	}
	
	/**
	 * Unless it has no visuals, it should override draw() but still call super.draw()
	 */
	@Override
	public void draw(Graphics g, float interpolation) {
		super.draw(g, interpolation);
		
		g.setColor(new Color(255, 255, 255, 220));
		g.fillRect(
				0, 
				(int) -(getHeight() * getScale()), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				0, 
				(int) (getHeight() * getScale()), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				(int) (getWidth() * getScale()), 
				(int) -(getHeight() * getScale()), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				(int) -(getWidth() * getScale()), 
				(int) -(getHeight() * getScale()), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				(int) -(getWidth() * getScale()), 
				0, 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				(int) (getWidth() * getScale()), 
				0,
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		g.fillRect(
				(int) -(getWidth() * getScale()), 
				(int) (getHeight() * getScale()), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
		
		g.setColor(Color.black);
		g.drawRect(
				getDraw_xPos(), 
				getDraw_yPos(), 
				(int) (getWidth() * getScale()), 
				(int) (getHeight() * getScale()));
	}

	@Override
	public void update(double dT) {
		super.update(dT);
	}
}