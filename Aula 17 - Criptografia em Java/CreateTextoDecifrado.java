import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextoDecifrado {
    private Formatter output;

    public void openFile()  // enable user to open file
   {  try
      {  output = new Formatter( "C:\\Users\\vinic\\OneDrive\\Documentos\\Documentos Maua Aulas\\ECM251-2023\\Aula 17 - Criptografia em Java\\texto_decifrado.txt" );
      }  // end try
      catch( SecurityException securityException )
      {  System.err.println( "You do not have write access to this file." );
         System.exit( 1 );
      }  // end catch
      catch( FileNotFoundException filesNotFoundException )
      {  System.err.println( "Error creating file." );
         System.exit( 1 );
      } // end catch
   } // end method openFile

   public void addTexto(String s){
        try{
            output.format("%s",s);
        }
        catch ( FormatterClosedException formatterClosedException )
         {  System.err.println( "Error writing to file." );
            return;
         } // end catch
        
   }

   public void closeFile() // close file
   {  if ( output != null )
         output.close();
   }  // end method closeFile
}

    

