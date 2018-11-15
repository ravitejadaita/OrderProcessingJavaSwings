/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author HP
 */
import java.util.HashMap;

public class CheckPass {
    static final HashMap<String, String> logins =new HashMap<>();//user , pass
    static final HashMap<String, String> loginsp =new HashMap<>();//phone , pass
    static final HashMap<String, String> genders =new HashMap<>();//user , gender
    static final HashMap<String, String> saves =new HashMap<>();
    static final HashMap<String, Integer> account =new HashMap<>();
    static String wishlist=new String();
    static int vcount=1;
    private boolean Check(String user,String pass){
        
        if(logins.containsKey(user)){
            if(logins.get(user).equals(pass)){
                return true;
            }
        }
        return false;     
    }
    private boolean CheckP(String p){
        if(loginsp.containsKey(p)){
                return true;
        }
        else if(logins.containsKey(p)){
        return true;
        }
        return false;     
    }
    private void Saved(String user,String pass){
        saves.put(user,pass);   
    }
    public void adddata(String user,String pass,String phone){
        /*if(logins.containsKey(user) || loginsp.containsKey(phone)){
            logins.replace(user, pass);
            loginsp.replace(phone, pass);
        }
        else{*/
            logins.put(user,pass);
            loginsp.put(phone,pass);
        //}
    }
    public void adddatagender(String user,String gender){
            genders.put(user,gender);
    }
    public String getdatagender(String user){
        
            String g = genders.get(user);
            return g;
    }
    public String getdata(String user){
        /*if(logins.containsKey(user) || loginsp.containsKey(phone)){
            logins.replace(user, pass);
            loginsp.replace(phone, pass);
        }
        else{*/
            String pass = logins.get(user);
            return pass;
            
        //}
    }
    public String getdataS(String user){
        /*if(logins.containsKey(user) || loginsp.containsKey(phone)){
            logins.replace(user, pass);
            loginsp.replace(phone, pass);
        }
        else{*/
            String pass = saves.get(user);
            return pass;
            
        //}
    }
    public boolean Checkn(String user,String pass){
        boolean val = Check(user,pass);
        return val;
    }
    public boolean Checkv(String user,String phone){
        boolean val = CheckP(phone);
        boolean val1 = CheckP(user);
        if (val==true || val1 ==true){
        return true;
        }
        return false;
    }
    public boolean Checkusername(String user){
        boolean val1 = CheckP(user);
        if (val1 ==true){
        return true;
        }
        return false;
    }
    public boolean Checkuserphone(String phone){
        boolean val = CheckP(phone);
        if (val==true){
        return true;
        }
        return false;
    }
    public void See(){
        System.out.println(logins);
        System.out.println(logins.values());
    }
    public void addS(String user,String pass){
        Saved(user,pass);
    }
    
    public void wish(String w){
            wishlist=wishlist+w+"\n";
    }
    public String wishback(){
            return wishlist;
    }
    public void changewish(String w){
            wishlist=w;
    }
    public void addacc(String user,int acc){
            account.put(user,acc);
    }
    
    public int getacc(String user){
            int acc = account.get(user);
            return acc;
    }    
}
