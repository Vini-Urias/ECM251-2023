package Exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ValidacaoUsuarioSenha {
    private Scanner input;
    private String username;
    private int senha;
    
    public void lerUsuario(){
        Scanner input = new Scanner( System.in );
        System.out.printf( "%s\n%s", 
            "Enter username <SPACE> Password <ENTER>",
            "? " );
        this.username = input.next();
        this.senha = input.nextInt();
    }

    public void openFile()
    {  try
       {  input = new Scanner( new File( "C:\\Users\\20.00601-2\\Downloads\\Aula 16 - Acesso a Arquivos de Texto em Java\\Exercicios\\usuarios.txt" ) );
       }  // end try
       catch ( FileNotFoundException fileNotFoundException )
       {  System.err.println( "Error opening file." );
          System.exit( 1 );
       }  // end catch
    }  // end method openFile

    public void readRecords()  // read record from file
   {  // object to be written to screen
        ConstrutorUsuarioSenha record = new ConstrutorUsuarioSenha();
        try   // read records from file using Scanner object
      {     while( input.hasNext() )
         {  record.setUser( input.next() );
            record.setSenha(input.nextInt());
            this.lerUsuario();
            if(record.getUser().equals(this.username)){
                if(record.getSenha()==senha){
                    System.out.println("LOGIN REALIZADO COM SUCESSO");
                }
            }
            else{
                System.out.println("LOGIN E/OU SENHA ERRADO(S)");
            }


         }  // end while
      }  // end try
        catch( NoSuchElementException elementException )
      {     System.err.println( "File improperly formed." );
            input.close();
            System.exit( 1 );
      }  // end catch
        catch( IllegalStateException stateException )
      {     System.err.println( "Error reading from file." );
            System.exit( 1 );
      }  // end catch
   }  // end method readRecords

    
   




   public void closeFile() // close file and terminate application
   {  if( input != null )
         input.close(); // close file
   }  // end method closeFile


    
}
