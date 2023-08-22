package Exercicios;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArquivoAluno {
    private Formatter output; //Formatador de como o texto vai ser colocado dentro do arquivo .txt

    public void openFile()  
   {  try
      {  output = new Formatter( "C:\\Users\\20.00601-2\\Downloads\\Aula 16 - Acesso a Arquivos de Texto em Java\\Exercicios\\aluno.txt");
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

   public void addRecords(String ra, String nome ,String sobrenome, Double p1, Double p2, Double p3, Double p4) 
   {  
            ConstrutorUsuarioSenha record = new ConstrutorUsuarioSenha();
           
      }  
      
   }  



