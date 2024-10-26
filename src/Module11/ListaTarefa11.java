package Module11;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa11 {


	public static void main(String[] args) {
		Aluno();
	}

	
		private static void Aluno() {
		System.out.println("**** Lista De Alunos ****");
			List<Aluno> lista = new ArrayList<Aluno>();
			
			
			Aluno a = new Aluno("Jorge Silva", 18, "Medicina", 8 );
			Aluno b = new Aluno("Poliana Duques", 22, "Odontologia", 5 );
			Aluno c = new Aluno("Joana Dark", 15, "Direito", 9 );
			Aluno d = new Aluno("Silveirinha Silva", 35, "Administracao", 7 );
			lista.add(a);
			lista.add(b);
			lista.add(c);
			lista.add(d);
			 for (Aluno aluno : lista) {
		            System.out.println(aluno);
		        }

		}
		
		
		
}

