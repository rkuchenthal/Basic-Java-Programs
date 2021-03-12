//kuchenthal ryan
//determine what type of of sentence that the user inputs by using
//if else statements to sift throught the diff punctuations

import javax.swing.JOptionPane;


public class IfElseDeclaringSentences
{
   public static void main(String [] args)
   {
  
   
  String input = JOptionPane.showInputDialog(null, "Type sentence including punctuation here >");
 
  char end = input.charAt(input.length()-1);
  
   
  if (end=='?')
  {
  JOptionPane.showMessageDialog(null, "The sentence is interrogative.");
  }
  else if (end=='.')
  {
  JOptionPane.showMessageDialog(null, "The sentence is declaritive.");
  }
  else if (end=='.')
  {
  JOptionPane.showMessageDialog(null, "The sentence is exclamatory.");
  }
  
  
  
   
  }
}