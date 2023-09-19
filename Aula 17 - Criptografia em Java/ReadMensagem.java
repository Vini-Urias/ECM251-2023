import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadMensagem {
    private Scanner input;
    private String msg;

    
    public void openFile()
    {  try
      {  input = new Scanner( new File( "C:\\Users\\vinic\\OneDrive\\Documentos\\Documentos Maua Aulas\\ECM251-2023\\Aula 17 - Criptografia em Java\\mensagem.txt" ) );
      }  // end try
      catch ( FileNotFoundException fileNotFoundException )
      {  System.err.println( "Error opening file." );
         System.exit( 1 );
      }  // end catch
    }  // end openFile

    public String lerMensagem(){
        try{
            while(input.hasNext()){
                msg = input.nextLine();
                System.out.println(msg);
            }
        }
        catch( NoSuchElementException elementException )
            {  System.err.println( "File improperly formed." );
               input.close();
               System.exit( 1 );
            }  // end catch
            catch( IllegalStateException stateException )
            {  System.err.println( "Error reading from file." );
               System.exit( 1 );
            }  // end catch
        return msg;
    }

    public void closeFile() // close file and terminate application
   {  if( input != null )
         input.close(); // close file
   }






}
