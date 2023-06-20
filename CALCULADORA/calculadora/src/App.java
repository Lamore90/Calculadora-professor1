import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        class professor{
            //atributos

            String nome;
            String regime;

            public void nomeprofessor (nome);{
                System.out.print("qual é o seu nome? ");
                Scanner scan = new Scanner(System.in);

            public void regimes (regime);{
                System.out.print("qual o seu regime de trabalho? ");
                Scanner scan = new Scanner(System.in);
            }    
            }

        }

        
          class Calculadora{
          
            String clt;
            String horista;
            String pj;

            

            public void regime1 (clt);{
             System.out.print("Qual o valor do salario mensal?");
             Scanner scan = new Scanner(System.in);
             double salariomensal;

            }

            public void regime2 (horista);{
                double horastrabalhadas;
                System.out.print("Qual o numero de horas trablalhadas? ");
                Scanner scan = new Scanner(System.in);
            
                double valorhoratrabalho;
                System.out.print("Qual o valor da hora de trabalho? ");
                Scanner scan = new Scanner(System.in);
                
            }

            public void regime3(pj);{
                double valorcontrato;
                System.out.print("Qual o valor do contrato? ");
                Scanner scan = new Scanner(System.in);
                
            }
        
          }
        
       System.out.print("Qual o seu nome?");
        
    }
}
