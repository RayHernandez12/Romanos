import javax.swing.*;

public class Romanos {

public static void main(String[] args) {

   String valor;
      valor = JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 1000");
   String unidades, decenas, centenas, millares;
   int numero;
      numero = Integer.parseInt(valor);

   //unidades
   int resto = numero % 10;
   
   //decenas
   int numerodecena = numero / 10;
   int resto1 = numerodecena % 10;
   
   //centenas
   int numerocentena = numero / 100;
   int resto2 = numerocentena % 10;
   
   //millares
   int numeromillar = numero / 1000;
   int resto3 = numeromillar % 10;

   switch(resto) //unidades
   {
   case 1: unidades = "I";
   break;
   case 2: unidades = "II";
   break;
   case 3: unidades = "III";
   break;
   case 4: unidades = "IV";
   break;
   case 5: unidades = "V";
   break;
   case 6: unidades = "VI";
   break;
   case 7: unidades = "VII";
   break;
   case 8: unidades = "VIII";
   break;
   case 9: unidades = "IX";
   break;
   default: unidades = "";
   break;
   }
   
   
   switch(resto1) //decenas
   {
   case 1: decenas = "X";
   break;
   case 2: decenas = "XX";
   break;
   case 3: decenas = "XXX";
   break;
   case 4: decenas = "XL";
   break;
   case 5: decenas = "L";
   break;
   case 6: decenas = "LX";
   break;
   case 7: decenas = "LXX";
   break;
   case 8: decenas = "LXXX";
   break;
   case 9: decenas = "XC";
   break;
   default: decenas = "";
   break;
   }
   
   
   switch(resto2) //centenas
   {
   case 1: centenas = "C";
   break;
   case 2: centenas = "CC";
   break;
   case 3: centenas = "CCC";
   break;
   case 4: centenas = "CD";
   break;
   case 5: centenas = "D";
   break;
   case 6: centenas = "DC";
   break;
   case 7: centenas = "DCC";
   break;
   case 8: centenas = "DCCC";
   break;
   case 9: centenas = "CM";
   break;
   default: centenas = "";
   break;
   }
   
   switch(resto3) //millares
   {
   case 1: millares = "M";
   break;
   default: millares = "";
   break;
   }
   
   JOptionPane.showMessageDialog(null, "El equivalente en numero romano es:" + millares + centenas + decenas + unidades);
   }  
}