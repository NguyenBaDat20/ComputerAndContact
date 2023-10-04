/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class Menu {
    protected String title;
    protected String [] options;
    protected boolean check=true;

    public Menu(String title, String[] options) {
        this.title = title;
        this.options = options;
    }
    public void display(){
        System.out.println("======== "+title+" ========");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1)+". "+options[i]);
        }
    }
    public int getSalected(){
        display();
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public abstract void excuted(int n);
    public void run1(){
        while(check){
            int n = getSalected();
            excuted(n);
        }
    }
}
