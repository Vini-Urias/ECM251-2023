package Exercicios;

public class ConstrutorUsuarioSenha
{  // A class that represents one record of information.
    private String username;
    private int senha;
   
   // no-argument constructor calls other constructor with default values
   public ConstrutorUsuarioSenha() 
   {  this( "", 0); 
   }  

   
   public ConstrutorUsuarioSenha( String user, int password )
   {    setUser(user);
        setSenha(password);
   }

   public void setUser(String user){
        username = user;
   }

   public String getUser(){
        return username;
   }

   public void setSenha(int password){
    senha = password;
   }

   public int getSenha(){
    return senha;
   }

}  

