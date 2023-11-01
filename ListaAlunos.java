package poo.br.edu.uft;

import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {

	public static void main(String[]args) {
		Set<String> aluno = new TreeSet<String>();
		
		String a = new String("Jotta");
		String b = new String("Abraao");
		String c = new String("Marcos");
		
		aluno.add(a);
		aluno.add(b);
		aluno.add(c);
		
		System.out.println(aluno);
		
	}
	
}
