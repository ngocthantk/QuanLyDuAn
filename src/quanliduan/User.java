/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliduan;

/**
 *
 * @author Admin
 */
public class User {
    private String id;
    private String pass;
    private String name;
    
    public String getId(){
        return id;
    }
    
    public void setId(String username){
        this.id = username;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

}
