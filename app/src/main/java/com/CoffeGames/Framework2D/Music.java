package com.CoffeGames.Framework2D;

/**
 * Created by Paco on 19/04/2015.
 */
public interface Music {
    public void play();
    public void stop();
    public void pause();
    public void setLooping(boolean looping);
    public void setVolume(float volume);
    public boolean isPlaying();
    public boolean isStoped();
    public boolean isLooping();
    public void dispose();
}
