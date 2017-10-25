package com.company.Strategy;

import com.company.state.Content;

/**
 * Created by mycena100 on 2017/5/2.
 */
public class StrategyContent {
    Role role;
    public StrategyContent(Role role){
        this.role = role;
    }

    public void carriedOut(){
        role.roleName();
        role.function();
    }
}
