/*Escreva um programa em Java que utilize o trecho abaixo para apresentar os números
divisíveis por 3 entre 0 e 30 e mostrar quantas vezes (cont) o comando for foi executado.*/

package tabuadado3;

import javax.swing.JOptionPane;
        
public class Tabuadado3 {

    public static void main(String[] args) {
        
        int cont = 0;
        
        for(int i = 0; i <= 30; i++) {
            if ((i % 3) == 0)
               continue;
            
        JOptionPane.showMessageDialog(null,i+" é múltiplo de 3.");
        ++cont; 
       }
        
        JOptionPane.showMessageDialog(null, "O comando for foi executado "+cont+" vezes","Repetições do for",
                JOptionPane.WARNING_MESSAGE);
        
        
    }
    
}

/*
System.out.println("\n\nTabuada\n");
for (int nro=1; nro<=10; ++nro){
for (int j=1; j<=10; ++j){
System.out.print(j+"x"+ nro +"="+ j*nro+" ");
}
System.out.println("\n");
}
*/