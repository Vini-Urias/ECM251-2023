package Exercicios;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ArquivoTextoUsuarioSenha {
    
    private Formatter output; //Formatador de como o texto vai ser colocado dentro do arquivo .txt

    public void openFile()  
   {  try
      {  output = new Formatter( "C:\\Users\\20.00601-2\\Downloads\\Aula 16 - Acesso a Arquivos de Texto em Java\\Exercicios\\usuarios.txt");
      }  // end try
      catch( SecurityException securityException )
      {  System.err.println( "Voce nao tem acesso a esse arquivo." );
         System.exit( 1 );
      }  // end catch
      catch( FileNotFoundException filesNotFoundException )
      {  System.err.println( "Erro ao criar arquivo." );
         System.exit( 1 );
      } // end catch
   } 

   public void addRecords()   // add records to file
   {  // object to be written to file
      ConstrutorUsuarioSenha record = new ConstrutorUsuarioSenha();
      Scanner input = new Scanner( System.in );
      System.out.printf( "%s\n%s\n%s\n%s\n\n",
            "To terminate input, type the end-of-file indicator ",
            "when you are prompted to enter input.",
            "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
            "On Windows type <ctrl> z then press Enter or <ctrl> e" );
      System.out.printf( "%s\n%s", 
            "Enter username <SPACE> Password <ENTER>",
            "? " );
      while ( input.hasNext() ) // loop until end-of-file indicator
      {   
        try{
            record.setUser( input.next() ); 
            record.setSenha(input.nextInt());
            if(record.getSenha()>0){
                output.format( "%s %d \n", record.getUser(), 
                  record.getSenha() );
            }
            else{
                System.out.println(
                    "Try again" );
            }
        }
        catch ( FormatterClosedException formatterClosedException )
         {  System.err.println( "Error writing to file." );
            return;
         } 
        catch ( NoSuchElementException elementException )
        {  System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // discard input so user can try again
        }  // end catch
           
         
        
         System.out.printf( "%s\n%s", "Enter username <SPACE> Password <ENTER>", "? " );
      }  
      input.close();
   }  

   public void closeFile() // close file
   {  if ( output != null )
         output.close();
   }  // end method closeFile
   
}
