
public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=================== Categoria o Jerarquia de Productos =================");
		
		Compuesto raiz = new Compuesto(" ****** ");
		raiz.agregar(new Hoja("<< Notebooks >>"));
		
		Compuesto comp = new Compuesto("	SubCategoria de Notebooks ");
		comp.agregar(new Hoja(" --->  All-in-One "));
		comp.agregar(new Hoja(" --->  Desktop "));	
		raiz.agregar(comp);
		raiz.mostrar(1);
		raiz.eliminar(comp);
		
		Hoja raiz2 = new Hoja("<< Tablets >>");
		Compuesto comp2 = new Compuesto("	SubCategoria de Tablets ");
		comp2.agregar(new Hoja(" --->  eReaders "));
		comp2.agregar(new Hoja(" --->  Tablets "));	
		
		
		raiz.agregar(raiz2);
		raiz.agregar(comp2);
		raiz.mostrar(2);
		
		System.out.println("=================== Fin de Categoria o Jerarquia de Productos =================");
	}

}
