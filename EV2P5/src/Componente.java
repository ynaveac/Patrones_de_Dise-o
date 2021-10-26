public abstract class Componente
{
	protected String nombreProducto;
	public Componente (String nombreproducto)
	{
		this.nombreProducto = nombreproducto;
	}
	abstract public void agregar(Componente c);
	abstract public void eliminar(Componente c);
	abstract public void mostrar(int profundidad);
}