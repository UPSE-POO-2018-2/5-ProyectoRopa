
public enum Genero {
	MASCULINO("MASC"), FEMENINO("FEM"), LGBTI("LGBTI"), UNISEX("UNI"), NINGUNO("NING"), OTRO("O");
	
	String abreviatura;
	
	Genero(String abreviatura)
	{
		this.abreviatura = abreviatura;
	}
}
