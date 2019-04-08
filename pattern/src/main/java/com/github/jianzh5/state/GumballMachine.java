package com.github.jianzh5.state;

/**
 * <p>
 * <code>GumballMachine</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/7下午9:19
 */
public class GumballMachine {
    //定义状态码
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numbserGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numbserGumballs;
        if(numbserGumballs > 0){
            state = noQuarterState;
        }
    }


    public void insertQuarter(){
        state.insertQuarter();
    }



    public void ejectQuarter(){
        state.ejectQuarter();
    }


    public void turnQuarter(){
        state.turnCrank();
        state.dispense();
    }


    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count - 1;
        }
    }



    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }
}
