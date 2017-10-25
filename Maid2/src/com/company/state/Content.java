package com.company.state;

//import com.sun.glass.ui.EventLoop;

/**
 * Created by mycena100 on 2017/5/2.
 */
public class Content {

    State state;

    public Content(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        state.stateName();
        return state;
    }
}
