/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliduan;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CommandlineLogin {
    public static ArrayList<User> userList = new ArrayList<User>();
    
    public static void insertFromFileCeo() {
        File file = new File("CEO.txt");
        User user = new User();
        try(Scanner inFile = new Scanner(file)){
            while(inFile.hasNext()){
                String ceo = inFile.nextLine();
                String[] f = ceo.split("\t");
                user.setName(f[0]);
                user.setId(f[1]);
                user.setPass(f[2]);
                userList.add(user);
            }
        } catch (Exception e){
        }
    }
    
    public static void insertFromFileManager() {
        File file = new File("Manager.txt");
        User user = new User();
        try(Scanner inFile = new Scanner(file)){
            while(inFile.hasNext()){
                String ceo = inFile.nextLine();
                String[] f = ceo.split("\t");
                user.setName(f[0]);
                user.setId(f[1]);
                user.setPass(f[2]);
                userList.add(user);
            }
        } catch (Exception e){
        }
    }
    
    public static void insertFromFileDeveloper() {
        File file = new File("Developer.txt");
        User user = new User();
        try(Scanner inFile = new Scanner(file)){
            while(inFile.hasNext()){
                String ceo = inFile.nextLine();
                String[] f = ceo.split("\t");
                user.setName(f[0]);
                user.setId(f[1]);
                user.setPass(f[2]);
                userList.add(user);
            }
        } catch (Exception e){
        }
    }
    
    public static void insertFromFileTester() {
        File file = new File("Tester.txt");
        User user = new User();
        try(Scanner inFile = new Scanner(file)){
            while(inFile.hasNext()){
                String ceo = inFile.nextLine();
                String[] f = ceo.split("\t");
                user.setName(f[0]);
                user.setId(f[1]);
                user.setPass(f[2]);
                userList.add(user);
            }
        } catch (Exception e){
        }
    }
    
    public static boolean login(String id, String pass){
        insertFromFileCeo();
        insertFromFileManager();
        insertFromFileDeveloper();
        insertFromFileTester();
        
        for (int i = 0 ; i < userList.size() ; i++){
            if (userList.get(i).getId().equals(id) && userList.get(i).getPass().equals(pass))
                return true;
            else{
                return false;
                }
            }
        return false;
        }
        
    
    public static void main(String[] args){
        insertFromFileCeo();
        insertFromFileManager();
        insertFromFileDeveloper();
        insertFromFileTester();
        for (int i = 0 ; i < userList.size() ; i++){
            System.out.println(userList.get(i).getId());
            System.out.println(userList.get(i).getPass());
        }
    }
}
