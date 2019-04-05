package com.github.jianzh5.templete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * <code>Coffee</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/5上午11:32
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput() {
        String answer = "";
        System.out.println("would you like milk and sugar with your coffee(y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        }catch (IOException e){
            System.err.println("IO error trying to read your answer");
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
